/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

import DAO.DAOItem;
import Model.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Caio
 */
public class DeletarItem extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
        int id;
        DAOItem i = new DAOItem();
        Scanner scan = new Scanner(System.in);
        boolean sair = false;

        ArrayList<Item> itens = i.consultar();

        if (itens.isEmpty()) {
            System.out.println("Lista esta vazia.");
        } else {

            for (Item item : itens) {
                System.out.println("ID: " + item.id);
                System.out.println("Data de entrada: " + item.getDataDeEntrada());
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
        while (sair == false) {
            try {
                System.out.println("Digite o id do produto que você quer deletar:");
                id = scan.nextInt();
                System.out.println("Tem certeza que deseja excluir este produto? (S/N)");
                String resp = scan.next();
                if (resp.toUpperCase().equals("S")) {
                    i.excluir(id);
                    System.out.println("\nItem Excluido com sucesso");
                    System.out.println("\nDeseja excluir outro produto?\ndigite S para sair ou qualquer tecla para continuar excluindo\n");
                    String resp2 = scan.next();
                    if (resp2.toUpperCase().equals("S")) {
                        sair = true;
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return sair;
    }
}
