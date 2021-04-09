package Bridge;

public class JanelaAviso extends JanelaAbstrata {
    JanelaAviso(JanelaImplementada j) {
        super(j);
    }
    @Override
    public void desenhar() {
        desenharJanela("Janela de Aviso");
        desenharBotao("Ok");
    }
}
