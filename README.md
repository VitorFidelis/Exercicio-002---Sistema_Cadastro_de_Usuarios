# Exercicio-002---Sistema_Cadastro_de_Usuarios
 Exercício com o objetivo de aprimorar a criação e o uso de exceções personalizadas do tipo checked.
 
Exercício: Sistema de Cadastro de Usuários

1. Classe Usuario
Crie uma classe chamada Usuario com os seguintes elementos:
- Atributos:
	- nome (do tipo String)
	- idade (do tipo int)
- Construtor:
	- Deve aceitar nome e idade como parâmetros.
- Métodos:
	- getNome(): retorna o nome do usuário.
	- getIdade(): retorna a idade do usuário.


2. Classe CadastroException
Crie uma classe chamada CadastroException que estenda Exception, com:
- Construtor:
	- Deve aceitar uma mensagem de erro como parâmetro.


3. Classe SistemaCadastro
Crie uma classe chamada SistemaCadastro com um método para cadastrar usuários:
- Método cadastrarUsuario(Usuario usuario):
	- Se a idade do usuário for menor que 18 anos, deve lançar uma CadastroException.
	- Caso contrário, o usuário deve ser adicionado a uma lista de usuários.


4. Classe Main
Crie uma classe chamada Main contendo o método main, que deve:
	- Criar instâncias da classe Usuario.
	- Chamar o método cadastrarUsuario() dentro de um bloco try-catch.
	- Capturar a exceção CadastroException e imprimir a mensagem de erro no console.
