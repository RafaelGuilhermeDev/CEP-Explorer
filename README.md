📍 CEPExplorer

Este foi o meu primeiro projeto utilizando uma API em Java. O principal objetivo foi colocar em prática conceitos que venho aprendendo durante meus estudos, como requisições HTTP, manipulação de JSON, tratamento de exceções e organização do código em classes com responsabilidades específicas.

A aplicação permite que o usuário informe um CEP, consulte os dados do endereço através da API ViaCEP e salve essas informações em um arquivo JSON.

🚀 Tecnologias utilizadas
Java
HttpClient (java.net.http)
Gson
API ViaCEP
💡 Como funciona?

O funcionamento da aplicação é bem simples:

O usuário informa um CEP.
A aplicação envia uma requisição para a API ViaCEP.
A resposta é convertida para um objeto Java.
As informações do endereço são exibidas no console.
Um arquivo JSON é criado com os dados retornados pela API.

Se o CEP informado estiver em um formato inválido, uma exceção personalizada é lançada para informar o erro de forma mais clara.

📂 Estrutura do projeto
📌 Endereco.java

Utilizei um record para representar o endereço retornado pela API.

Ele armazena informações como:

CEP
Logradouro
Bairro
Cidade
Estado
🌐 ConsultaCep.java

Esta é a classe responsável pela comunicação com a API.

Nela acontece toda a lógica para:

realizar a requisição HTTP;
receber a resposta da API;
converter o JSON em um objeto Java;
devolver essas informações para a aplicação.
📄 GeradoraDeArquivos.java

Depois que o endereço é encontrado, esta classe cria um arquivo no formato JSON, permitindo salvar as informações obtidas pela consulta.

⚠️ FormatoInvalidoDoCepException.java

Criei uma exceção personalizada para tratar casos em que o CEP informado não possui um formato válido.

Assim, o usuário recebe uma mensagem mais amigável e o código fica mais organizado.

▶️ TesteAplicacao.java

É a classe principal da aplicação.

Ela é responsável por iniciar o programa, solicitar o CEP ao usuário, realizar a consulta, exibir o resultado e gerar o arquivo JSON.

🎯 O que aprendi com este projeto

Durante o desenvolvimento pude praticar diversos conceitos importantes do Java, como:

consumo de APIs REST;
utilização do HttpClient;
conversão entre JSON e objetos Java com Gson;
utilização de Records;
criação de exceções personalizadas;
leitura e escrita de arquivos;
separação de responsabilidades entre as classes.

Foi um projeto simples, mas que marcou meu primeiro contato com integração de APIs e me ajudou a entender melhor como aplicações Java se comunicam com serviços externos.

🔧 Melhorias que pretendo implementar
Interface gráfica;
Histórico das consultas realizadas;
Consulta de vários CEPs em sequência;
Validação mais completa dos dados informados;
Testes automatizados;
Melhor organização das mensagens exibidas ao usuário.
👨‍💻 Autor

Desenvolvido por Rafael Henrique como parte da minha jornada de aprendizado em Java.

Estou construindo projetos para fortalecer meus conhecimentos em desenvolvimento Back-end e evoluir cada vez mais na linguagem.
