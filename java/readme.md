Client Java para o webservice
===

### Teste visual no NetBeans

Crie o projeto no NetBeans apontando para a pasta `ws-v1.0-clientes/java/client-java`

Abre e execute a classe ClientJava (main) apertando F6

E Selecione uma das opções listadas abaixo:

    1. Solicitar formulário

    2. Processar

    3. Solicitar laudo síntese


### Teste visual pelo terminal pela Classe

Acesse a pasta do projeto que contém as classes geradas pelo NetBeans

    cd client-java/build/classes/

E execute o comando abaixo

    java client.java.ClientJava

E Selecione uma das opções listadas abaixo:

    1. Solicitar formulário

    2. Processar

    3. Solicitar laudo síntese


### Teste visual pelo terminal com arquivo .jar

Acesse a pasta do projeto que contém o arquivo .jar gerado pelo NetBeans

    cd client-java/dist/

E execute o comando abaixo

    java -jar client.java.jar

E Selecione uma das opções listadas abaixo:

    1. Solicitar formulário

    2. Processar

    3. Solicitar laudo síntese


### Executando os testes no NetBeans

Abre o execute a classe de teste WebserviceJUnitTest apertando Ctrl+F6

O resultado será mostrado na opção `Saída`