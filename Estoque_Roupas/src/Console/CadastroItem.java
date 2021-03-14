/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

import DAO.DAOItem;
import Model.Item;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Scanner;

/**
 *
 * @author Caio
 */
public class CadastroItem extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
        boolean sair = false;

        while (sair == false) {
            
            DAOItem i = new DAOItem();
            Item item = new Item();
            Scanner scan = new Scanner(System.in);
            String Data = "";
            boolean erro = true;
            
            System.out.println("Digite o tipo do produto");
            item.setTipo((scan.next()));
            System.out.println("Digite a marca do produto");
            item.setMarca((scan.next()));
            System.out.println("Digite as caracteristicas do produto P, M ,G, GG, EGG");
            item.setCaracteristica((scan.next()));
            System.out.println("Digite o tamanho do produto");
            item.setTamanho((scan.next()));                //Alterar para Enumerador
            System.out.println("Digite a cor do produto");
            item.setCor((scan.next()));                    //Alterar para Enumerador
            System.out.println("Digite o local da compra");
            item.setLocalCompra((scan.next()));
            
            while (erro = true) {
                try {
                    System.out.println("Digite a data de entrada do produto yyyy-mm-dd");
                    Data = scan.next();
                    Date date = Date.valueOf(Data);
                    item.setDataDeEntrada(date);
                    System.out.println("Digite o preço sugerido");
                    item.setValorSugerido((scan.nextDouble()));
                    System.out.println("Digite a quantidade deste produto a ser inserido");
                    item.setQuantidade((scan.nextInt()));
                    System.out.println("Digite o valor da etiqueta na compra");
                    item.setValorEtiqueta((scan.nextDouble()));
                    System.out.println("Digite o valor pago");
                    item.setValorPago((scan.nextDouble()));
                    i.inserir(item);
                    erro = false;
                    
                    System.out.println("Produto inserido com sucesso\n");

                    System.out.println("Deseja inserir outro produto?\ndigite s para sim ou qualquer tecla para sair\n");
                    if (scan.next().equals("s")) {
                        sair = true;
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Digite corretamente");
                    
                }
            }

        }

        return sair;
    }
}
