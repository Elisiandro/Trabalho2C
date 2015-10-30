package br.com.netfood_2.rn;

import br.com.netfood_2.dao.ItemPedidoDao;
import br.com.netfood_2.entity.ItemPedido;
import br.com.netfood_2.rnval.ItemPedidoRNVal;


public class ItemPedidoRN {
    private final ItemPedidoRNVal itemPedidoRNVal;
    private final ItemPedidoDao itemPedidoDao;

    public ItemPedidoRN() {
        itemPedidoRNVal = new ItemPedidoRNVal();
        itemPedidoDao = new ItemPedidoDao();
    }

    public void salvar(ItemPedido itemPedido) {
        itemPedidoRNVal.validarSalvar(itemPedido);
        itemPedidoDao.salvar(itemPedido);
    }
    
    public ItemPedido encontrar(Long id)
    {
        return itemPedidoDao.encontrar(id);
    }
}
