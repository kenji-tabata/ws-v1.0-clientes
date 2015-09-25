/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.net.dom.sisv5.ws.v1_0.wsdl.SDDForm;
import br.net.dom.sisv5.ws.v1_0.wsdl.SDDFormResponse;
import br.net.dom.sisv5.ws.v1_0.wsdl.SDDFormResponseformulario;
import br.net.dom.sisv5.ws.v1_0.wsdl.SDDLaudoSintese;
import br.net.dom.sisv5.ws.v1_0.wsdl.SDDLaudoSinteseResponse;
import br.net.dom.sisv5.ws.v1_0.wsdl.SDDLaudoSinteseResponselaudo;
import br.net.dom.sisv5.ws.v1_0.wsdl.SDDPerf;
import br.net.dom.sisv5.ws.v1_0.wsdl.SDDPerfResponse;
import br.net.dom.sisv5.ws.v1_0.wsdl.SDDPerfResponsepesquisado;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leandro
 */
public class WebserviceJUnitTest {
    Random gerador = new Random();
        
    String _login = "devtest";
    String _senha = "2387";
    String _codigo = Integer.toString(gerador.nextInt(9999));
    String _codigo_fixo = "123";
    String _nome = "Andrade";
    String _alternativas = "1, 8, 12, 17, 22, 23, 28, 29, 30, 42, 45, 51, 62, 64, 66, 68, 70, 74, 75";
    String _cpf = "111.222.333-44";
    String _sexo = "M";
    String _dtNasc = "1980-02-20";
    String _email = "mario@email.com";
    String _celular = "11 95569-5586";
    
    
    @Test
    public void testPrimeiraRequisicao() {
        SDDForm sdd = new SDDForm();
        sdd.setLogin(_login);
        sdd.setSenha(_senha);
        SDDFormResponse requisicaoForm = sddForm(sdd);
        SDDFormResponseformulario respForm = requisicaoForm.getFormulario();
        assertEquals("Sucesso!", respForm.getStatus());
    }
    
    @Test
    public void testSegundaRequisicao() {
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
        SDDPerfResponse requisicaoPerfil = sddPerf(sddPerf);
        SDDPerfResponsepesquisado respPerf = requisicaoPerfil.getPesquisado();
        assertEquals("Sucesso!", respPerf.getStatus());
    }
    
    @Test
    public void testTerceiraRequisicao() {
        SDDLaudoSintese sddSintese = new SDDLaudoSintese();
        sddSintese.setLogin(_login);
        sddSintese.setSenha(_senha);
        sddSintese.setCodigo(_codigo_fixo);
        SDDLaudoSinteseResponse requisicaoSintese = sddLaudoSintese(sddSintese);
        SDDLaudoSinteseResponselaudo respSintese = requisicaoSintese.getLaudo();
        assertEquals("Sucesso!", respSintese.getStatus());
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
