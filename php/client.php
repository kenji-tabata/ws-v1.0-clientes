<?php
header('Content-Type: text/html; charset=utf-8');

#
# Configurações
#
$_wsdl         = "http://www.dom.net.br/sisv5/ws/v1.0/WSDL/";
$_login        = 'seu-usuario';
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
    $client   = new SoapClient($GLOBALS['_wsdl'], array('trace' => false));
    $response = $client->__soapCall("SDDForm", array($GLOBALS['paramsForm']));

    echo "<p>Status formulário: {$response->formulario->status}</p>";
    echo "<br />";
    $instrucoes = $response->formulario->instrucoes->frase;
    foreach ($instrucoes as $instrucao) {
        echo "<p>" . $instrucao . "</p>";
    }
    echo "<br />";

    $alternativas = $response->formulario->alternativas->alternativa;
    foreach ($alternativas as $alternativa) {
        echo "<p>{$alternativa->id} - {$alternativa->frase}</p>";
    }
}

function exibirSegundaRequisicao() {
    $client = new SoapClient($GLOBALS['_wsdl'], array('trace' => false));
    $response   = $client->__soapCall("SDDPerf", array($GLOBALS['paramsProc']));

    echo "<p>Status pesquisado: {$response->pesquisado->status}</p>";
    echo "<p>Código: {$response->pesquisado->codigo}</p>";
    echo "<h3>Perfil</h3>";
    $competencias = $response->pesquisado->perfil->competencia;
    foreach ($competencias as $competencia) {
        echo "<p>$competencia->label - $competencia->valor</p>";
    }
}


$acao = isset($_GET['acao']) ? $_GET['acao'] : null;

if ($acao == "formulario") {
    exibirPrimeiraRequisicao();
} elseif ($acao == "processar") {
    exibirSegundaRequisicao();
}