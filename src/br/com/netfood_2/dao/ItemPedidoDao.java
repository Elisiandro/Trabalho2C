package br.com.netfood_2.dao;

import br.com.netfood_2.entity.ItemPedido;

/**
 *
 * @author Elisiandro
 */
public class ItemPedidoDao extends GenericDao<ItemPedido, Long> {

    public ItemPedidoDao() {
        super(ItemPedido.class);
    }
}
