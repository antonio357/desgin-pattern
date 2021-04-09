package Bridge;

// 2) Uma implementação para quaisquer Janelas possam ser apresentadas num sistema Android;
public class JanelaAndroid  implements JanelaImplementada {
    @Override
    public void desenharJanela(String titulo) {
        System.out.println(titulo + " - Janela Andriod");
    }
    @Override
    public void desenharBotao(String titulo) {
        System.out.println(titulo + " - Botão Android");
    }
}
