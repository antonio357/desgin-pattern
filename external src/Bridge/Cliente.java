package Bridge;

public class Cliente {
    public static void main(String[] args) {
        JanelaAbstrata janela = new JanelaDialogo(new JanelaLinux());

        janela.desenhar();
        janela = new JanelaAviso(new JanelaLinux());
        janela.desenhar();

        janela = new JanelaDialogo(new JanelaWindows());
        janela.desenhar();

        // testando JanelaDowcload
        janela = new JanelaDowcload(new JanelaWindows());
        janela.desenhar();

        // testando JanelaAndroid
        janela = new JanelaAviso(new JanelaAndroid());
        janela.desenhar();
        janela = new JanelaDialogo(new JanelaAndroid());
        janela.desenhar();
        janela = new JanelaDowcload(new JanelaAndroid());
        janela.desenhar();
    }
}
