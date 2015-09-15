"""
# Client Python para o webservice

Script útil caso você precise testar o webservice visualmente ou executar um pequeno teste automático.

    $ python client.py                              # test
    $ python client.py exibir-primeira-requisicao   # getFormulario()
    $ python client.py exibir-segunda-requisicao    # processar()

"""
import sys
import unittest
from pysimplesoap.client import SoapClient

#
# Configurações
#
_wsdl         = "http://186.202.17.240/sisv5/ws/v1.0/WSDL/"
#_wsdl         = "http://127.0.0.1:8000/ws/v1.0/WSDL/"
_login        = 'devtest'
_senha        = '2387'
_nome         = 'Carlos- test webservice no terminal'
_cpf          = '111.222.333-44'
_sexo         = 'M'
_dt_nasc      = '1962-08-21'
_email        = 'carlos@mail.com'
_celular      = '95478-5584'
_alternativas = '1, 2, 3, 8, 11, 20, 33, 44, 45, 53, 80'

#
# parâmetros
#
paramsForm = {
    'login': _login,
    'senha': _senha
}
paramsProc = {
    'login':        _login,
    'senha':        _senha,
    'nome':         _nome,
    'cpf':          _cpf,
    'sexo':         _sexo,
    'dt_nasc':      _dt_nasc,
    'email':        _email,
    'celular':      _celular,
    'alternativas': _alternativas,
}


class WebServiceTest(unittest.TestCase):
    #
    # getFormulario()
    #
    def testPrimeiraRequisicao(self):
        client   = SoapClient(wsdl=_wsdl, trace=False)
        response = client.SDDForm(**paramsForm)
        self.assertEqual(response['formulario']['status'], "Sucesso!")

    #
    # processar()
    #
    def testSegundaRequisicao(self):
        client   = SoapClient(wsdl=_wsdl, trace=False)
        response = client.SDDPerf(**paramsProc)
        self.assertEqual(response['pesquisado']['status'], "Sucesso!")

    #
    # exibir getFormulario()
    #
    def exibirPrimeiraRequisicao():
        client   = SoapClient(wsdl=_wsdl, trace=False)
        response = client.SDDForm(**paramsForm)

        formulario = response['formulario']

        print(formulario['status'])

        print()
        for instrucao in formulario['instrucoes']:
            print(instrucao['frase'])

        print()
        for cada in formulario['alternativas']:
            print(cada['alternativa']['frase'])

    #
    # exibir processar()
    #
    def exibirSegundaRequisicao():
        client   = SoapClient(wsdl=_wsdl, trace=False)
        response = client.SDDPerf(**paramsProc)

        pesquisado = response['pesquisado']

        print(pesquisado['status'])
        print()

        if pesquisado['status'] == "Sucesso!":
            print("Código: " + pesquisado['codigo'])
            print()

            for perfil in pesquisado['perfil']:
                print(perfil['competencia']['label'] + ": " + str(perfil['competencia']['valor']))


if __name__ == '__main__':
    if len(sys.argv) >= 2:
        opcao = sys.argv[1]

        if opcao == "exibir-primeira-requisicao":
            WebServiceTest.exibirPrimeiraRequisicao()
        elif  opcao == "exibir-segunda-requisicao":
            WebServiceTest.exibirSegundaRequisicao()
        else:
            print('ERRO: opção desconhecida!')
    else:
        unittest.main()