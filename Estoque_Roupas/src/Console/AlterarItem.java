/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

import DAO.DAOItem;
import Model.Item;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class AlterarItem extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {

        boolean sair = false;
        DAOItem iconsulta = new DAOItem();
        Scanner scan = new Scanner(System.in);
        boolean erro = true;

        ArrayList<Item> itens = iconsulta.consultar();

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
            while (sair == false) {

                DAOItem i = new DAOItem();
                Item itemAlterar = new Item();
                String Data = "";

                System.out.println("\nDigite o ID do produto que deseja alterar");
                itemAlterar.id = scan.nextInt();               
                System.out.println("Digite o tipo do produto");
                itemAlterar.setTipo((scan.next()));
                System.out.println("Digite a marca do produto");
                itemAlterar.setMarca((scan.next()));
                System.out.println("Digite as caracteristicas do produto");
                itemAlterar.setCaracteristica((scan.next()));
                System.out.println("Digite o tamanho do produto P, M ,G, GG, EGG");
                itemAlterar.setTamanho((scan.next()));                //Alterar para Enumerador
                System.out.println("Digite a cor do produto");
                itemAlterar.setCor((scan.next()));                    //Alterar para Enumerador
                System.out.println("Digite o local da compra");
                itemAlterar.setLocalCompra((scan.next()));

                while (erro = true) {
                    try {
                        System.out.println("Digite a data de entrada do produto yyyy-mm-dd");
                        Data = scan.next();
                        Date date = Date.valueOf(Data);
                        itemAlterar.setDataDeEntrada(date);
                        System.out.println("Digite o preço sugerido");
                        itemAlterar.setValorSugerido((scan.nextDouble()));
                        System.out.println("Digite a quantidade deste produto a ser inserido");
                        itemAlterar.setQuantidade((scan.nextInt()));
                        System.out.println("Digite o valor da etiqueta na compra");
                        itemAlterar.setValorEtiqueta((scan.nextDouble()));
                        System.out.println("Digite o valor pago");
                        itemAlterar.setValorPago((scan.nextDouble()));
                        i.alterar(itemAlterar);
                        erro = false;

                        System.out.println("Produto alterado com sucesso\n");

                        System.out.println("Deseja editar outro produto?\ndigite s para sim ou qualquer tecla para sair\n");
                        if (scan.next().equals("s")) {
                            break;
                        } else {
                            sair = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Digite apenas numeros");
                    }
                }
            }

        }
        return sair;
    }
}
