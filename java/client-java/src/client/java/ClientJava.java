/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.java;

import br.net.dom.sisv5.ws.v1_0.wsdl.ArrayOfArrayOfSDDLaudoSinteseResponselaudoblococomunicacao;
import br.net.dom.sisv5.ws.v1_0.wsdl.ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocodetalhe;
import br.net.dom.sisv5.ws.v1_0.wsdl.ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocolideranca;
import br.net.dom.sisv5.ws.v1_0.wsdl.ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocovelocidade;
import br.net.dom.sisv5.ws.v1_0.wsdl.ArrayOfSDDFormResponseformularioalternativasalternativa;
import br.net.dom.sisv5.ws.v1_0.wsdl.ArrayOfSDDPerfResponsepesquisadoperfilcompetencia;
import br.net.dom.sisv5.ws.v1_0.wsdl.SDDForm;
import br.net.dom.sisv5.ws.v1_0.wsdl.SDDFormResponse;
import br.net.dom.sisv5.ws.v1_0.wsdl.SDDFormResponseformulario;
import br.net.dom.sisv5.ws.v1_0.wsdl.SDDLaudoSintese;
import br.net.dom.sisv5.ws.v1_0.wsdl.SDDLaudoSinteseResponse;
import br.net.dom.sisv5.ws.v1_0.wsdl.SDDLaudoSinteseResponselaudo;
import br.net.dom.sisv5.ws.v1_0.wsdl.SDDPerf;
import br.net.dom.sisv5.ws.v1_0.wsdl.SDDPerfResponse;
import br.net.dom.sisv5.ws.v1_0.wsdl.SDDPerfResponsepesquisado;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author leandro
 */
public class ClientJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random gerador = new Random();
        
        String _login = "seu-login";
        String _senha = "sua-senha";
        String _codigo = Integer.toString(gerador.nextInt(9999));
        String _codigo_fixo = "123";
        String _nome = "Andrade";
        String _alternativas = "1, 8, 12, 17, 22, 23, 28, 29, 30, 42, 45, 51, 62, 64, 66, 68, 70, 74, 75";
        String _cpf = "111.222.333-44";
        String _sexo = "M";
        String _dtNasc = "1980-02-20";
        String _email = "mario@email.com";
        String _celular = "11 95569-5586";
        
        System.out.println("Teste webservice...");
        System.out.println("1 - Requisitar formulário");
        System.out.println("2 - Requisitar perfil");
        System.out.println("3 - Requisitar laudo síntese");
        System.out.print("Digite a opção desejada: ");
        
        Scanner scanner = new Scanner(System.in);
        String escolha = scanner.next();
        
        switch (escolha) {
            case "1":
                /**
                 * 1 requisição
                 */
                SDDForm sdd = new SDDForm();
                sdd.setLogin(_login);
                sdd.setSenha(_senha);
                // Objeto para requisisão do formulário
                SDDFormResponse requisicaoForm = sddForm(sdd);
                // Objeto de resposta do formulário
                SDDFormResponseformulario respForm = requisicaoForm.getFormulario();
                // Verifica se o usuário foi logado com sucesso
                if (respForm.getStatus().equals("Sucesso!")) {
                    for (String frase: respForm.getInstrucoes().getFrase()){
                        System.out.println(frase);
                    }
                    
                    for(ArrayOfSDDFormResponseformularioalternativasalternativa alternativa: respForm.getAlternativas().getAlternativa()){
                        System.out.println(alternativa.getFrase());
                    }
                } else {
                    System.out.println(respForm.getStatus());
                }   break;
                
            case "2":
                /**
                 *  2 requisição
                 */
                // Define o usuário, senha e os dados do pesquisado
                SDDPerf sddPerf = new SDDPerf();
                sddPerf.setLogin(_login);
                sddPerf.setSenha(_senha);
                sddPerf.setCodigo(_codigo);
                sddPerf.setNome(_nome);
                sddPerf.setAlternativas(_alternativas);
                sddPerf.setCpf(_cpf);
                sddPerf.setSexo(_sexo);
                sddPerf.setDtNasc(_dtNasc);
                sddPerf.setEmail(_email);
                sddPerf.setCelular(_celular);
                // Objeto de requisição do pesquisado
                SDDPerfResponse requisicaoPerfil = sddPerf(sddPerf);
                // Retorna uma string com os registros do processamento do perfil e o resultado final
                SDDPerfResponsepesquisado respPerf = requisicaoPerfil.getPesquisado();
                System.out.println();
                if (respPerf.getStatus().equals("Sucesso!")){
                    System.out.println(respPerf.getCodigo());
                    for (ArrayOfSDDPerfResponsepesquisadoperfilcompetencia competencia: respPerf.getPerfil().getCompetencia()){
                        System.out.println(competencia.getLabel()+": "+competencia.getValor());
                    }
                } else {
                System.out.println("Solicitação cancelada: "+respPerf.getStatus());
                }   break;
                
            case "3":
                /**
                 *  3 Requisição
                 */
                SDDLaudoSintese sddLaudoSin = new SDDLaudoSintese();
                sddLaudoSin.setLogin(_login);
                sddLaudoSin.setSenha(_senha);
                sddLaudoSin.setCodigo(_codigo_fixo);
                
                SDDLaudoSinteseResponse requisicaoLaudoSin = sddLaudoSintese(sddLaudoSin);
                
                SDDLaudoSinteseResponselaudo respLaudoSin = requisicaoLaudoSin.getLaudo();
                
                if(respLaudoSin.getStatus().equals("Sucesso!")){
                    System.out.println(respLaudoSin.getTitulo());
                    System.out.println(respLaudoSin.getDescricao());
                    System.out.println();
                    System.out.println(respLaudoSin.getEmpresa());
                    System.out.println(respLaudoSin.getCargo());
                    System.out.println();
                                        
                    for (ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocolideranca lideranca: respLaudoSin.getBloco().getLideranca()){
                        for (String frase: lideranca.getFrase()){
                            System.out.println(frase);
                        }
                    }
                    System.out.println();
                    for (ArrayOfArrayOfSDDLaudoSinteseResponselaudoblococomunicacao comunicacao: respLaudoSin.getBloco().getComunicacao()){
                        for (String frase: comunicacao.getFrase()){
                            System.out.println(frase);
                        }
                    }
                    System.out.println();
                    for (ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocovelocidade velocidade: respLaudoSin.getBloco().getVelocidade()){
                        for (String frase: velocidade.getFrase()){
                            System.out.println(frase);
                        }
                    }
                    System.out.println();
                    for (ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocodetalhe detalhe: respLaudoSin.getBloco().getDetalhe()){
                        for (String frase: detalhe.getFrase()){
                            System.out.println(frase);
                        }
                    }
                } else {
                    System.out.println("Solicitação cancelada: "+respLaudoSin.getStatus());
                }   break;
                
            default:
                System.out.println("Opção inválida");
        }
    }

    private static SDDFormResponse sddForm(br.net.dom.sisv5.ws.v1_0.wsdl.SDDForm parameters) {
        br.net.dom.sisv5.ws.v1_0.wsdl.SddDispatcherService service = new br.net.dom.sisv5.ws.v1_0.wsdl.SddDispatcherService();
        br.net.dom.sisv5.ws.v1_0.wsdl.SddDispatcherPortType port = service.getSddDispatcher();
        return port.sddForm(parameters);
    }

    private static SDDPerfResponse sddPerf(br.net.dom.sisv5.ws.v1_0.wsdl.SDDPerf parameters) {
        br.net.dom.sisv5.ws.v1_0.wsdl.SddDispatcherService service = new br.net.dom.sisv5.ws.v1_0.wsdl.SddDispatcherService();
        br.net.dom.sisv5.ws.v1_0.wsdl.SddDispatcherPortType port = service.getSddDispatcher();
        return port.sddPerf(parameters);
    }

    private static SDDLaudoSinteseResponse sddLaudoSintese(br.net.dom.sisv5.ws.v1_0.wsdl.SDDLaudoSintese parameters) {
        br.net.dom.sisv5.ws.v1_0.wsdl.SddDispatcherService service = new br.net.dom.sisv5.ws.v1_0.wsdl.SddDispatcherService();
        br.net.dom.sisv5.ws.v1_0.wsdl.SddDispatcherPortType port = service.getSddDispatcher();
        return port.sddLaudoSintese(parameters);
    }

    
}
