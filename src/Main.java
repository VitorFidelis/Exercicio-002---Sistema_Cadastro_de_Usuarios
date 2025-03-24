
public class Main {
	public static void main(String[] args) {

//		instanciando os objetos do tipo usuario e passando as informações no construtor
		Usuario user2 = new Usuario("Gabriel", 22);
		Usuario user3 = new Usuario("Miqueias", 30);
		Usuario user4 = new Usuario("Douglas", 12);
		Usuario user1 = new Usuario("Vitor", 16);
		
//		instanciando o objeto do tipo sistema
		SistemaCadastro sistema = new SistemaCadastro();
		
//		utilizando o metodo try para tentar cadastrar o usuario no sistema.
//		caso não consiga cadastrar o usuario informado, capturar o erro personalizado 
//		chamado CadastroException e imprimir a sua mensagem no console
		
		try {
//			no metodo cadastraUsuario tem uma validação que valida se o usuario informado
//			tem idade menor que 18, se tiver idade menor que 18 é lançado uma exceção personalizada
//			informando que o usuario deve ter idade superior a 18. caso contrario é o usuario adicionado
//			na lista de usuarios.
			sistema.cadastrarUsuario(user2);//usuario com idade maior que 18
			sistema.cadastrarUsuario(user3);//usuario com idade maior que 18
			
			sistema.cadastrarUsuario(user4);//usuario com idade menor que 18
			sistema.cadastrarUsuario(user1);//usuario com idade menor que 18
			
//			Captura a exceção personalizada chamada CadastroException e armazena na referencia chamada ex
		} catch (CadastroException ex) {
//			imprime no console a mensagem personalida da exceção capturada
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
//		imprime a quantidade de usuarios cadastrados no sistema, obtendo a informação do tamanho da lista de usuarios
		System.out.println("Quantidade de usuarios cadastrados no sistema: " + sistema.getUsuarios().size());
	}
}
