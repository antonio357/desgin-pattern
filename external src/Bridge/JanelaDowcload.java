package Bridge;

import java.util.Scanner;

/*
* 1) Um refinamento da abstração JanelaAbstrata chamado de JanelaDowcload que deve perguntar ao usuário onde o Download
* deve ser realizado e se deseja ou não continuar o Download;
* */
public class JanelaDowcload extends JanelaAbstrata {
    private Scanner scanner;
    JanelaDowcload(JanelaImplementada j) {
        super(j);
        this.scanner = new Scanner(System.in);
    }
    @Override
    public void desenhar() {
        desenharJanela("Janela de Download");
        System.out.println("Digite o local onde deseja salvar o download");
        String path = this.scanner.nextLine();
        desenharBotao("Digite 1 - Confirmar Download");
        desenharBotao("Digite 2 - Cancelar Download");
        Integer num = this.scanner.nextInt();
        if (num == 1) System.out.println("Download sendo Salvo em " + path);
        else if (num == 2) System.out.println("Download Cancelado");
    }
}
