/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;
import static Console.TelaInicial.estadoConsole;
import java.util.Scanner;

/**
 *
 * @author Caio
 */
public class MenuPrincipal extends MaquinaEstadoConsole{
    @Override
    public boolean Executa() {
        boolean sair = false;
        System.out.println("*** Menu Principal");
        Scanner scan = new Scanner(System.in);
        System.out.println("0 - Sair");
        System.out.println("1 - Cadastrar Item");
        System.out.println("2 - Alterar Item");
        System.out.println("3 - Deletar Item");
        System.out.println("4 - Listar Itens");
        int opcao = scan.nextInt();
        switch (opcao)
        {
            case 0:
                estadoConsole = EnumEstadoConsole.BEM_VINDO.getEstadoMaquina();
                break;
            case 1:
                estadoConsole = EnumEstadoConsole.CADASTRO_ITEM.getEstadoMaquina();
                break;
            case 2:
                estadoConsole = EnumEstadoConsole.ALTERAR_ITEM.getEstadoMaquina();
                break;
            case 3:
                estadoConsole = EnumEstadoConsole.DELETAR_ITEM.getEstadoMaquina();
                break;
            case 4:
                estadoConsole = EnumEstadoConsole.LISTAGEM_ITENS.getEstadoMaquina();
                break;
        }
        return sair;
    }
}
