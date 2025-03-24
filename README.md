# Exercicio-002---Sistema_Cadastro_de_Usuarios
 Exercício com o objetivo de aprimorar a criação e o uso de exceções personalizadas do tipo checked.
 
Exercício: Sistema de Cadastro de Usuários

1. Classe Usuario
<P>Crie uma classe chamada Usuario com os seguintes elementos:</P>
- Atributos:
	- nome (do tipo String)
	- idade (do tipo int)
- Construtor:
	- Deve aceitar nome e idade como parâmetros.
- Métodos:
	- getNome(): retorna o nome do usuário.
	- getIdade(): retorna a idade do usuário.


2. Classe CadastroException
<P>Crie uma classe chamada CadastroException que estenda Exception, com:</P>
- Construtor:
	- Deve aceitar uma mensagem de erro como parâmetro.


3. Classe SistemaCadastro
<P>Crie uma classe chamada SistemaCadastro com um método para cadastrar usuários:</P>
- Método cadastrarUsuario(Usuario usuario):
	- Se a idade do usuário for menor que 18 anos, deve lançar uma CadastroException.
	- Caso contrário, o usuário deve ser adicionado a uma lista de usuários.


4. Classe Main
<P> Crie uma classe chamada Main contendo o método main, que deve:</P>
	- Criar instâncias da classe Usuario.
	- Chamar o método cadastrarUsuario() dentro de um bloco try-catch.
	- Capturar a exceção CadastroException e imprimir a mensagem de erro no console.
