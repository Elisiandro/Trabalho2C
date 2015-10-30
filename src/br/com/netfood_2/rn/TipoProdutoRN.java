package br.com.netfood_2.rn;

import br.com.netfood_2.dao.TipoProdutoDao;
import br.com.netfood_2.entity.TipoProduto;
import br.com.netfood_2.rnval.TipoProdutoRNVal;


public class TipoProdutoRN {
    private final TipoProdutoRNVal tipoProdutoRNVal;
    private final TipoProdutoDao tipoProdutoDao;

    public TipoProdutoRN() {
        tipoProdutoRNVal = new TipoProdutoRNVal();
        tipoProdutoDao = new TipoProdutoDao();
    }

    public void salvar(TipoProduto tipoProduto) {
        tipoProdutoRNVal.validarSalvar(tipoProduto);
        tipoProdutoDao.salvar(tipoProduto);
    }
 
    
    public TipoProduto encontrar(Long id)
    {
        return tipoProdutoDao.encontrar(id);
    }

    
}
