package br.com.netfood_2.rn;

import br.com.netfood_2.dao.PedidoDao;
import br.com.netfood_2.entity.Pedido;
import br.com.netfood_2.rnval.PedidoRNVal;


public class PedidoRN {
    private final PedidoRNVal pedidoRNVal;
    private final PedidoDao pedidoDao;

    public PedidoRN() {
        pedidoRNVal = new PedidoRNVal();
        pedidoDao = new PedidoDao();
    }

    public void salvar(Pedido pedido) {
        pedidoRNVal.validarSalvar(pedido);
        pedidoDao.salvar(pedido);
    }

    public Pedido encontrar(Long id)
    {
        return pedidoDao.encontrar(id);
    }

}
