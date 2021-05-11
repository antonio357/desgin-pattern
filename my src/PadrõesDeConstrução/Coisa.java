package PadrõesDeConstrução;

public class Coisa {
    private String nome = "Ainda Sem Nome";
    public Coisa() {
        // Coisa("Coisa Sem Sentido"); == his("Coisa Sem Sentido");
        this("Coisa Sem Sentido");
    }
    public Coisa(String nome) {
        this.nome = nome;
    }
}
