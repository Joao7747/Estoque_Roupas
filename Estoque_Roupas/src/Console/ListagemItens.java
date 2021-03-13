/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

import DAO.ConexaoBanco;
import DAO.DAOItem;
import Model.Item;
import java.util.List;

/**
 *
 * @author Caio
 */
public class ListagemItens extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
        boolean sair = false;
        DAOItem i = new DAOItem();
        ConexaoBanco conex = new ConexaoBanco();
        if(conex.conectar())
        {
        
            System.out.println("conectado");
        
        }
        List<Item> itens = i.consultar();

        if (itens.isEmpty()) {
            System.out.println("Lista esta vazia.");

        } else {
            System.out.println("Uns itens ae.");
        }
        return sair;
    }
}
