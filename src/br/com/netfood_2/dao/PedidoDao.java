package br.com.netfood_2.dao;

import br.com.netfood_2.entity.Pedido;

/**
 *
 * @author Elisiandro
 */
public class PedidoDao extends GenericDao<Pedido, Long> {

    public PedidoDao() {
        super(Pedido.class);
    }
}
