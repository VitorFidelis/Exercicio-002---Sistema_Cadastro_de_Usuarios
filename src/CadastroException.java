//classe que contem o nome da minha exceção personalizada, estendendo a classe Exception que é uma classe Checked, que precisa ser
//informada na assinatura do metodo ao qual sera utilizada
public class CadastroException extends Exception {
	
//	contrutor da minha classe de exceção personalizada que recebe uma String no momento da sua criação e envia para a super classe
//	exception
	public CadastroException(String mensagem){
		super(mensagem);
	}
}
