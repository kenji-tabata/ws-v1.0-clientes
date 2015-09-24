<?php
require 'client.php';

class ClientTest extends PHPUnit_Framework_TestCase {

    public function testPrimeiraRequisicao() {
        $client = new SoapClient($GLOBALS['_wsdl'], array('trace' => false));
        $response = $client->__soapCall("SDDForm", array($GLOBALS['paramsForm']));

        $this->assertEquals("Sucesso!", $response->formulario->status);
    }

    public function testSegundaRequisicao() {
        $client = new SoapClient($GLOBALS['_wsdl'], array('trace' => false));
        $response = $client->__soapCall("SDDPerf", array($GLOBALS['paramsProc']));

        $this->assertEquals("Sucesso!", $response->pesquisado->status);
    }

    public function testTerceiraRequisicao() {
        $client = new SoapClient($GLOBALS['_wsdl'], array('trace' => false));
        $response = $client->__soapCall("SDDLaudoSintese", array($GLOBALS['paramsLaudo']));

        $this->assertEquals("Sucesso!", $response->laudo->status);
    }
}
