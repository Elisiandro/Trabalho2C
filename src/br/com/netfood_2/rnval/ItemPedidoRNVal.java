package br.com.netfood_2.rnval;

import br.com.netfood_2.entity.ItemPedido;

public class ItemPedidoRNVal {

    public void validarSalvar(ItemPedido itemPedido) {
        if (itemPedido.getIdPedido() == 0) {
            throw new RuntimeException("Campo Id Pedido não informado");
        }
        if (itemPedido.getProduto()== null) {
            throw new RuntimeException("Campo Produto não informado");
        }
        if (itemPedido.getQuantidade()== 0) {
            throw new RuntimeException("Campo Quantidade não informado");
        }
        if (itemPedido.getValorTotal() == 0) {
            throw new RuntimeException("Campo Valor total não informado");
        }

    }

}
