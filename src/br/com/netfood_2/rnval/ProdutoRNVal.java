package br.com.netfood_2.rnval;

import br.com.netfood_2.entity.Produto;

public class ProdutoRNVal {

    public void validarSalvar(Produto produto) {
        if (produto.getNome() == null) {
            throw new RuntimeException("Campo Nome não informado");
        }
        if (produto.getPreco()== 0 ) {
            throw new RuntimeException("Campo Preco não deve ser zero");
        }
        if (produto.getTipoProdutoId()== null) {
            throw new RuntimeException("Tipo de produto não informado");
        }
    }

}
