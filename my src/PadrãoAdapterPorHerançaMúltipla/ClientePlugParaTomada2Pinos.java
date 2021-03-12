package PadrãoAdapterPorHerançaMúltipla;

import com.katyusco.padroes.adpater.servicos.Fio;

public class ClientePlugParaTomada2Pinos {
	private Fio pinoFase;
	private Fio pinoNeutro;
	
	public ClientePlugParaTomada2Pinos(Fio pinoFase, Fio pinoNeutro) {
		this.pinoFase = pinoFase;
		this.pinoNeutro = pinoNeutro;
	}
	
	private void acoplaPlug() {
		Interface2Pinos interfacePlug2Pinos = new Adapter(this.pinoFase, this.pinoNeutro);
		interfacePlug2Pinos.conectar();
	}
	
    public static void main(String[] args) {
        ClientePlugParaTomada2Pinos clientePlugParaTomada2Pinos = new ClientePlugParaTomada2Pinos(Fio.FASE, Fio.NEUTRO);
        clientePlugParaTomada2Pinos.acoplaPlug();
	}
}
