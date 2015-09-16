<?php
/**
 * Client PHP para o webservice
 * 
 * Teste visual `getFormulario()` ...
 * 
 *      (abra no navegador) client.php?acao=formulario
 * 
 * Teste visual `processar()`...
 * 
 *      (abra no navegador) client.php?acao=processar
 *  
 */
header('Content-Type: text/html; charset=utf-8');

#
# Configurações
#
$_wsdl         = "http://www.dom.net.br/sisv5/ws/v1.0/WSDL/";
$_login        = 'seu-login';
$_senha        = 'sua-senha';
$_nome         = "Um nome qualquer";
$_sexo         = "F"; # F ou M
$_cpf          = "111.222.333-44";
$_dt_nasc      = "1990-01-02";
$_email        = "fulano@mail.com";
$_celular      = "98764-5432";
$_alternativas = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 41";

#
# parâmetros
#
$paramsForm = array(
    'login' => $_login,
    'senha' => $_senha,
);
$paramsProc = array(
    'login'        => $_login,
    'senha'        => $_senha,
    'nome'         => $_nome,
    'email'        => $_email,
    'sexo'         => $_sexo,
    'dt_nasc'      => $_dt_nasc,
    'cpf'          => $_cpf,
    'celular'      => $_celular,
    'alternativas' => $_alternativas
);
    
    
function exibirPrimeiraRequisicao() {
    $client   = new SoapClient($_wsdl, array('trace' => false));
    $response = $client->__soapCall("SDDForm", array($paramsForm));

    echo "<p>Status formulário: {$response->formulario->status}</p>";
    echo "<br />";
    foreach ($response->formulario->instrucoes as $instrucao) {
        echo "<p>{$instrucao->frase}</p>";
    }
    echo "<br />";
    foreach ($response->formulario->alternativas as $alternativa) {
        echo "<p>{$alternativa->id} - {$alternativa->frase}</p>";
    }
}

function exibirSegundaRequisicao() {
    $client = new SoapClient($_wsdl, array('trace' => true));
    $response   = $client->__soapCall("SDDPerf", array($paramsProc));

    echo "<p>Status pesquisado: {$response->pesquisado->status}</p>";
    echo "<p>Código: {$response->pesquisado->codigo}</p>";
    echo "<h3>Perfil</h3>";
    foreach ($response->pesquisado->perfil->competencia as $alt) {
        echo "<p>$alt->label - $alt->valor</p>";
    }
}


$acao = isset($_GET['acao']) ? $_GET['acao'] : null;

if ($acao == "formulario") {
    exibirPrimeiraRequisicao();
} elseif ($acao == "processar") {
    exibirSegundaRequisicao();
}