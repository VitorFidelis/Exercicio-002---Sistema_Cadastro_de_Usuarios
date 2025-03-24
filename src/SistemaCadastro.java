import java.util.ArrayList;
import java.util.List;

public class SistemaCadastro{
	
//	Atributo do tipo lista com modificador de visibilidade private, onde so pode ser visto dentro dessa classe
	private List<Usuario> usuarios = new ArrayList<>();
	
//	metodo de cadastro onde em sua assinatura é informa que esse metodo pode conter uma exceção, informamos isso atraves do uso do throws
//	sendo necessario informar na assinatura do metodo, pois se trata de uma exceção checked
	public void cadastrarUsuario(Usuario usuario) throws CadastroException {
//		realizado uma validação que verifica se a idade do usuario é menor que 18
		if (usuario.getIdade() < 18) {
//			se a idade do usuario for menor que 18, é lançado uma axceção atraves do uso do throw e ao mesmo tempo é instanciado
//			o objeto do tipo exception e recebendo a mensagem no contrutor.
			throw new CadastroException("Usuário deve ter pelo menos 18 anos para se cadastrar.");
		}else {
//			caso contrario adiciona o usuario na lista de usuarios
			this.usuarios.add(usuario);
		}
	}
	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}
}
