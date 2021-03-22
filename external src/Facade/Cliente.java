package Facade;

// link: https://brizeno.wordpress.com/2011/11/17/mao-na-massa-facade/

public class Cliente {
	public static void main(String[] args) {
		System.out.println("##### Configurando subsistemas #####");
		SistemasFacade fachada = new SistemasFacade();
		fachada.inicializarSubsistemas();

		System.out.println("##### Utilizando subsistemas #####");
		fachada.renderizarImagem("imagem.png");
		fachada.reproduzirAudio("teste.mp3");
		fachada.lerInput();
	}
}
