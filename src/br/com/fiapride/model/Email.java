package br.com.fiapride.model;

public class Email implements Notificavel {
	private String endereco;
	
	 
	 public Email(String endereco) {
	        this.endereco = endereco;
	    }

	@Override
   public void enviarNotificacao(String mensagem) {
       System.out.println("Email enviado para " + endereco + ": " + mensagem);
   }
}
