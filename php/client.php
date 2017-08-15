<?php
header('Content-Type: text/html; charset=utf-8');

#
# Configurações
#
$_wsdl         = "http://www.dom.net.br/sisv5/ws/v1.0/WSDL/";
$_login        = 'seu-login';
$_senha        = 'sua-senha';
$_codigo       = rand(1, 9999); # Código gerado randomicamente para execução dos testes
$_codigo_fixo  = '5002'; # Código utilizado para recuperar o laudo do pesquisado utilizado apenas para testes
$_nome         = "Carlos";
$_sexo         = "F"; # F ou M
$_cpf          = "111.222.333-44";
$_dt_nasc      = "1990-01-02";
$_email        = "fulano@mail.com";
$_celular      = "98764-5432";
$_alternativas = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 41";
$_id_dec       = 1;
$_eixo_y       = array(
                    array('id' => 1, 'gap' => 'sub-item-1'),
                    array('id' => 2, 'gap' => 'sub-item-3'),
                    array('id' => 3, 'gap' => 'sub-item-1'),
                    array('id' => 4, 'gap' => 'sub-item-2'),
                    array('id' => 5, 'gap' => 'sub-item-2'),
                    array('id' => 6, 'gap' => 'sub-item-2'),
                );
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
    'codigo'       => $_codigo,
    'nome'         => $_nome,
    'email'        => $_email,
    'sexo'         => $_sexo,
    'dt_nasc'      => $_dt_nasc,
    'cpf'          => $_cpf,
    'celular'      => $_celular,
    'alternativas' => $_alternativas
);

$paramsLaudo = array(
    'login'  => $_login,
    'senha'  => $_senha,
    'codigo' => $_codigo_fixo,
);

$paramsPontuarYCandidato = array(
    'login'  => $_login,
    'senha'  => $_senha,
    'codigo' => $_codigo_fixo,
    'id_dec' => $_id_dec,
    'eixo_y' => $_eixo_y
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
    $client   = new SoapClient($GLOBALS['_wsdl'], array('trace' => false));
    $response = $client->__soapCall("SDDPerf", array($GLOBALS['paramsProc']));

    echo "<p>Status pesquisado: {$response->pesquisado->status}</p>";
    echo "<p>Código: {$response->pesquisado->codigo}</p>";
    echo "<h3>Perfil</h3>";
    $competencias = $response->pesquisado->perfil->competencia;
    foreach ($competencias as $competencia) {
        echo "<p>$competencia->label - $competencia->valor</p>";
    }
}

function exibirTerceiraRequisicao() {
    $client   = new SoapClient($GLOBALS['_wsdl'], array('trace' => false));
    $response = $client->__soapCall("SDDLaudoSintese", array($GLOBALS['paramsLaudo']));

    echo "<p>Status pesquisado: {$response->laudo->status}</p>";
    echo "<p><strong>Título:</strong> {$response->laudo->titulo}</p>";
    echo "<p>{$response->laudo->descricao}</p>";
    echo "<p>{$response->laudo->empresa}</p>";
    echo "<p>{$response->laudo->cargo}</p>";
    echo "<h3>Resultado</h3>";
    
    $list = ['lideranca', 'comunicacao', 'velocidade', 'detalhe'];
    foreach ($list as $fator){
        $frases = $response->laudo->bloco->$fator->frase; 
        echo "<p>";
        if (is_array($frases)) {
            foreach ($frases as $frase) {
                echo "$frase<br/>";
            }
        } else {
            echo $frases;
        }
        echo "</p>";
    }
}

function exibirQuartaRequisicao() {
    $client   = new SoapClient($GLOBALS['_wsdl'], array('trace' => false));
    $response = $client->__soapCall("SDDPontuarYCandidato", array($GLOBALS['paramsPontuarYCandidato']));
    echo "<p>Status: {$response->pontua_y->status}</p>";

}

$acao = isset($_GET['acao']) ? $_GET['acao'] : null;

if ($acao == "formulario") {
    exibirPrimeiraRequisicao();
} elseif ($acao == "processar") {
    exibirSegundaRequisicao();
} elseif ($acao == "sintese") {
    exibirTerceiraRequisicao();
} elseif ($acao == "pontuar") {
    exibirQuartaRequisicao();
}