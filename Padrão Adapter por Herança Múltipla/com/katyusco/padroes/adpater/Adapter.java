package com.katyusco.padroes.adpater;

import com.katyusco.padroes.adpater.servicos.Fio;
import com.katyusco.padroes.adpater.servicos.ServicoTomada3Pinos;
import com.katyusco.padroes.adpater.Interface2Pinos;

public class Adapter extends ServicoTomada3Pinos implements Interface2Pinos {
	public Adapter(Fio pinoFase, Fio pinoNeutro) {
        super(pinoFase, pinoNeutro, null);
	}

	public void conectar() {
        this.forneceEnergia();
	}
}
