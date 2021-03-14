/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

import DAO.ConexaoBanco;
import DAO.DAOItem;
import Model.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Caio
 */
public class ListagemItens extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
        DAOItem i = new DAOItem();
        Scanner scan = new Scanner(System.in);
        boolean sair = false;

        ArrayList<Item> itens = i.consultar();

        if (itens.isEmpty()) {
            System.out.println("Lista esta vazia.");

        } else {

            for (Item item : itens) {
                System.out.println("\nData de entrada: " + item.getDataDeEntrada());
                System.out.println("Tipo: " + item.getTipo());
                System.out.println("Marca:" + item.getMarca());
                System.out.println("Caracteristicas: " + item.getCaracteristica());
                System.out.println("Tamanho: " + item.getTamanho());
                System.out.println("Cor: " + item.getCor());
                System.out.println("Local de Compra:" + item.getLocalCompra());
                System.out.println("Preço Sugerido: " + item.getValorSugerido());
                System.out.println("Quantidade deste produto em estoque: " + item.getQuantidade());
                System.out.println("Valor da etiqueta na compra: " + item.getValorEtiqueta());
                System.out.println("Valor pago: " + item.getValorPago());
                System.out.println("Valor para Margem de 100%: " + item.getValorParaMargem() + "\n");

            }
            System.out.println("digite s para sair\n");
            if (scan.next().equals("s")) {
                sair = true;
            }

        }

        return sair;
    }
}
