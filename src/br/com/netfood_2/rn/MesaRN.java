package br.com.netfood_2.rn;

import br.com.netfood_2.dao.MesaDao;
import br.com.netfood_2.entity.Mesa;
import br.com.netfood_2.rnval.MesaRNVal;


public class MesaRN {
    private final MesaRNVal mesaRNVal;
    private final MesaDao mesaDao;

    public MesaRN() {
        mesaRNVal = new MesaRNVal();
        mesaDao = new MesaDao();
    }

    public void salvar(Mesa mesa) {
        mesaRNVal.validarSalvar(mesa);
        mesaDao.salvar(mesa);
    }
    
    public Mesa encontrar(Long id)
    {
        return mesaDao.encontrar(id);
    }
    
}
