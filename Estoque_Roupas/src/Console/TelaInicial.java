/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;


/**
 *
 * @author Caio
 */
public class TelaInicial {
    public static MaquinaEstadoConsole estadoConsole;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        estadoConsole = EnumEstadoConsole.BEM_VINDO.getEstadoMaquina();
        Boolean saida = false;
        while (!saida) {
            saida = estadoConsole.Executa();
        }
    }
}
