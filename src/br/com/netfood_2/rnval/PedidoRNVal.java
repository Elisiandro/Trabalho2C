package br.com.netfood_2.rnval;

import br.com.netfood_2.entity.Pedido;

public class PedidoRNVal {

    public void validarSalvar(Pedido pedido) {
        if (pedido.getGarcom() == null) {
            throw new RuntimeException("Campo garcom não informado");
        }
        if (pedido.getListaItens() == null) {
            throw new RuntimeException("Campo Itens não informado");
        }
        if (pedido.getMesa() == null) {
            throw new RuntimeException("Campo Mesa não informado");
        }
        if (pedido.getValorPago()== 0) {
            throw new RuntimeException("Campo Valor Pago não informado");
        }

    }

}
