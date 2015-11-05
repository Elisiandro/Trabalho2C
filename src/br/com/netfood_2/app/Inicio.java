package br.com.netfood_2.app;

import br.com.netfood_2.dao.GarcomDao;
import br.com.netfood_2.entity.Garcom;
import br.com.netfood_2.entity.ItemPedido;
import br.com.netfood_2.entity.Mesa;
import br.com.netfood_2.entity.Pedido;
import br.com.netfood_2.entity.Produto;
import br.com.netfood_2.rn.GarcomRN;
import br.com.netfood_2.rn.MesaRN;
import br.com.netfood_2.rn.PedidoRN;
import br.com.netfood_2.rn.ProdutoRN;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.eclipse.persistence.config.ResultType;

/**
 *
 * @author Elisiandro
 */
public class Inicio {

    public static void main(String[] args) {
        inserGarcom();
        
        //teste
        //inserMesa();
        //inserir();
        //inserPedido();
        /*Pedido*/

    }

    public static void inserGarcom() {
        /*Garcom*/
        ArrayList<Garcom> listaGarcom = new ArrayList<Garcom>();
        Garcom g1 = new Garcom("Joao da Silva", 1000, "123456", "joao@publi.com.br");
        Garcom g2 = new Garcom("Pedro Dos Santos", 1000, "123456", "pedro@publi.com.br");
        Garcom g3 = new Garcom("marcia da Fonceca", 1000, "123456", "marcia@publi.com.br");
        listaGarcom.add(g1);
        listaGarcom.add(g2);
        listaGarcom.add(g3);
        GarcomRN rn = new GarcomRN();

        for (Garcom item : listaGarcom) {
            try {
                rn.salvar(item);
                JOptionPane.showMessageDialog(null, item.getNome() + " cadastrado com sucesso");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

    }

    public static void inserMesa() {
        /*Mesa*/
        ArrayList<Mesa> listaMesa = new ArrayList<Mesa>();
        Mesa m1 = new Mesa(22);
        Mesa m2 = new Mesa(33);
        Mesa m3 = new Mesa(11);
        listaMesa.add(m1);
        listaMesa.add(m2);
        listaMesa.add(m3);
        MesaRN rnMesa = new MesaRN();

        for (Mesa item : listaMesa) {
            try {
                rnMesa.salvar(item);
                JOptionPane.showMessageDialog(null, "Mesa " + item.getId() + " cadastrado com sucesso");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    public static void inserPedido() {
        /*Produto*/
        ArrayList<Pedido> listaGarcom = new ArrayList<Pedido>();
        GarcomRN garcomRn = new GarcomRN();
        MesaRN mesaRn = new MesaRN();
        ProdutoRN produtoRn = new ProdutoRN();
        Integer valor = 1;
        Garcom g = garcomRn.encontrar(valor.longValue());        
        Mesa m = mesaRn.encontrar(valor.longValue());
        //valor = 2;
        Produto pp = produtoRn.encontrar(valor.longValue());
        
        ArrayList<ItemPedido> listaItens = new ArrayList<ItemPedido>();
        listaItens.add(new ItemPedido(1, 1, 1,pp));
        listaItens.add(new ItemPedido(2, 2, 2,pp));
        
        Pedido p = new Pedido(g, m, true, 10, 1, 100, listaItens );
        
        PedidoRN pedidoRn = new PedidoRN();
        
            try {
                pedidoRn.salvar(p);
                JOptionPane.showMessageDialog(null, p.getId() + " cadastrado com sucesso");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        
    }
    
    public static void inserir() {
        String nome = JOptionPane.showInputDialog("Nome: ");
        String email = JOptionPane.showInputDialog("Email: ");
        String cpf = JOptionPane.showInputDialog("CPF: ");
        double salario = 0;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Salario: "));

        Garcom garcom = new Garcom();
        garcom.setNome(nome);
        garcom.setEmail(email);
        garcom.setCpf(cpf);
        garcom.setSalario(salario);

        GarcomRN rn = new GarcomRN();
        try {
            rn.salvar(garcom);
            JOptionPane.showMessageDialog(null, garcom.getNome() + " cadastrado com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void remover() {
        Garcom pessoa = procurar();
        if (pessoa == null) {
            JOptionPane.showMessageDialog(null, "ID nao encontrado!");
        } else {
            GarcomDao dao = new GarcomDao();
            dao.remover(pessoa.getId());
            JOptionPane.showMessageDialog(null, pessoa.getNome()
                    + " removido com sucesso!");
        }
    }

    public static void atualizar() {
        Garcom pessoa = procurar();
        if (pessoa == null) {
            JOptionPane.showMessageDialog(null, "ID nao encontrado!");
        } else {
            GarcomDao dao = new GarcomDao();
            String nome = JOptionPane.showInputDialog("Nome: ");
            String email = JOptionPane.showInputDialog("Email: ");
            pessoa.setNome(nome);
            pessoa.setEmail(email);
            dao.salvar(pessoa);
            JOptionPane.showMessageDialog(null, pessoa.getNome()
                    + " atualizado com sucesso");
        }

    }

    public static void listarTodos() {
        GarcomDao dao = new GarcomDao();

        List<Garcom> listaPessoas = dao.getList();

        String pessoas = "";
        for (Garcom p : listaPessoas) {
            pessoas += p.getNome() + " - " + p.getEmail() + "\n";
        }

        JOptionPane.showMessageDialog(null, "Lista de Pessoas: \n" + pessoas);
    }

    public static void visualizar() {
        Garcom pessoa = procurar();
        JOptionPane.showMessageDialog(null,
                pessoa.getNome() + " - " + pessoa.getEmail());
    }

    private static Garcom procurar() {
        Long id = Long.valueOf(JOptionPane.showInputDialog("Id: "));

        GarcomDao dao = new GarcomDao();
        Garcom pessoa = dao.encontrar(id);

        return (pessoa);
    }
}
