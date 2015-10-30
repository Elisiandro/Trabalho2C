package br.com.netfood_2.rnval;

import br.com.netfood_2.entity.Mesa;

public class MesaRNVal {

    public void validarSalvar(Mesa mesa) {
        if (mesa.getCapacidade() == 0) {
            throw new RuntimeException("Campo Capacidade não pode ser 0 (zero)");
        }
    }

}
