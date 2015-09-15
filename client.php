<?php
header('Content-Type: text/html; charset=utf-8');
/**
 * Para requisitar o formulário de pesquisa, coloque o parâmetro `?acao=formulario` no fim da URL.
 * Para requisitar o perfil do pesquisado, coloque o parâmetro `?acao=perfil`no fim da URL.
 * Para executar os testes de unidade, digite no terminal o comando `phpunit clientTest.php`.
 */

# Configurações
$_wsdl         = "http://www.dom.net.br/sisv5/ws/v1.0/WSDL/";
$_login        = 'seu-login';
$_senha        = 'sua-senha';
$_nome         = "Um nome qualquer";
$_sexo         = "F"; # F ou M
$_cpf          = "111.222.333-44";
$_dt_nasc      = "1990-01-02";
$_email        = "fulano@mail.com";
$_celular      = "98764-5432";
$_alternativas = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 41"; # o separador pode ser ', ' ou paenas ','

class Client{
    public $login;
    public $senha;
    public $nome;
    public $email;
    public $sexo;
    public $dt_nasc;
    public $cpf;
    public $celular;
    public $alternativas;
    public $wsdl;

    public function primeiraRequisicao() {
        $parametros = array(
            'login' => $this->login,
            'senha' => $this->senha
        );
        $conexaoSoap = new SoapClient($this->wsdl, array('trace' => true));
        $resultado = $conexaoSoap->__soapCall("SDDForm", array($parametros));

        $status = (string) $resultado->formulario->status;
        echo "<p>Status formulário: $status</p>";
        
        if ($status == 'Sucesso!') {
            foreach ($resultado->formulario->instrucoes->frase as $instrucao){
                echo "<p>$instrucao</p>";
            }

            foreach ($resultado->formulario->alternativas->alternativa as $alt){
                echo "<p>$alt->id - $alt->frase</p>";
            }
        }
        return $resultado;
    }

    public function segundaRequisicao() {
        $parametros = array(
            'login'        => $this->login,
            'senha'        => $this->senha,
            'nome'         => $this->nome,
            'email'        => $this->email,
            'sexo'         => $this->sexo,
            'dt_nasc'      => $this->dt_nasc,
            'cpf'          => $this->cpf,
            'celular'      => $this->celular,
            'alternativas' => $this->alternativas
        );
        $conexaoSoap = new SoapClient($this->wsdl, array('trace' => true));
        $resultado = $conexaoSoap->__soapCall("SDDPerf", array($parametros));
        
        $status = (string) $resultado->pesquisado->status;
        echo "<p>Status pesquisado: $status</p>";
        
        if ($status == 'Sucesso!') {
            $codigo = (string) $resultado->pesquisado->codigo;
            echo "<p>Código: $codigo</p>";

            echo "<h3>Perfil</h3>";
            foreach ($resultado->pesquisado->perfil->competencia as $alt){
                echo "<p>$alt->label - $alt->valor</p>";
            }
        }
        return $resultado;
    }
}

$acao = isset($_GET['acao'])? $_GET['acao'] : null;

if ($acao == "formulario") {
    $ws = new Client();
    $ws->login = $_login;
    $ws->senha = $_senha;
    $ws->wsdl  = $_wsdl;

    $ws->primeiraRequisicao();

} elseif ($acao == "perfil") {
    $ws = new Client();
    $ws->login        = $_login;
    $ws->senha        = $_senha;
    $ws->nome         = $_nome;
    $ws->sexo         = $_sexo;
    $ws->cpf          = $_cpf;
    $ws->dt_nasc      = $_dt_nasc;
    $ws->email        = $_email;
    $ws->celular      = $_celular;
    $ws->alternativas = $_alternativas;
    $ws->wsdl         = $_wsdl;

    $ws->segundaRequisicao();
}