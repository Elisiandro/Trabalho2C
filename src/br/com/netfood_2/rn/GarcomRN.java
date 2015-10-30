package br.com.netfood_2.rn;

import br.com.netfood_2.dao.GarcomDao;
import br.com.netfood_2.entity.Garcom;
import br.com.netfood_2.rnval.GarcomRNVal;


public class GarcomRN {
    private final GarcomRNVal garcomRNVal;
    private final GarcomDao garcomDao;

    public GarcomRN() {
        garcomRNVal = new GarcomRNVal();
        garcomDao = new GarcomDao();
    }

    public void salvar(Garcom garcom) {
        garcomRNVal.validarSalvar(garcom);
        garcomDao.salvar(garcom);
    }
    
    public Garcom encontrar(Long id)
    {
        return garcomDao.encontrar(id);
    }
    
}
