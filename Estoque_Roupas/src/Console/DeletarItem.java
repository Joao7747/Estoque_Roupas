/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

import DAO.DAOItem;
import Model.Item;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Caio
 */
public class DeletarItem extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
        boolean sair = false;
        DAOItem i = null;
        List<Item> itens = i.consultar();
        Scanner scan = new Scanner(System.in);
        int id;
        try {
            if (itens.size() == 0) {
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
            }
            System.out.println("Digite o id do produto que você quer deletar:");
            id = scan.nextInt();
            System.out.println("Tem certeza que deseja excluir este produto? (S/N)");
            if (scan.nextLine().toUpperCase() == "S") {
                i.excluir(id);
            } else {
                sair = true;
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        return sair;
    }
}
