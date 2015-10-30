package br.com.netfood_2.rn;

import br.com.netfood_2.dao.ProdutoDao;
import br.com.netfood_2.entity.Produto;
import br.com.netfood_2.rnval.ProdutoRNVal;


public class ProdutoRN {
    private final ProdutoRNVal produtoRNVal;
    private final ProdutoDao produtoDao;

    public ProdutoRN() {
        produtoRNVal = new ProdutoRNVal();
        produtoDao = new ProdutoDao();
    }

    public void salvar(Produto produto) {
        produtoRNVal.validarSalvar(produto);
        produtoDao.salvar(produto);
    }
    

    public Produto encontrar(Long id)
    {
        return produtoDao.encontrar(id);
    }

    
}
