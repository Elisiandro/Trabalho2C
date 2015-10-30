package br.com.netfood_2.rnval;

import br.com.netfood_2.entity.TipoProduto;

public class TipoProdutoRNVal {

    public void validarSalvar(TipoProduto tipoProduto) {
        if (tipoProduto.getDescricao() == null) {
            throw new RuntimeException("Campo Descricao não informado");
        }
        
    }

}
