package Adapter;

// link: https://brizeno.wordpress.com/2011/10/03/mao-na-massa-adapter/

public class Cliente {
	public static void main(String[] args) {
		ImagemTarget imagem = new SDLImagemAdapter();
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(0, 0, 10, 10);

		imagem = new OpenGLImageAdapter();
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(0, 0, 10, 10);
	}
}
