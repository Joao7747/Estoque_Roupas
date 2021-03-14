/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

import static Console.TelaInicial.estadoConsole;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Caio
 */
public class Login extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
        boolean sair = false;
        try {
            FileReader arq = new FileReader("login.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            boolean acesso = false;
            String nome = "";
            String senha = "";
            String linha = "";
            String[] vetor = new String[2];
            Scanner scan = new Scanner(System.in);
            while (acesso == false) {
                System.out.println("**** LOGIN ****");
                System.out.println("Digite seu usuário");
                nome = scan.nextLine();
                System.out.println("Digite sua senha");
                senha = scan.nextLine();

                while (linha != null) {
                    linha = lerArq.readLine();
                    if(linha == null){
                        continue;
                    }
                    vetor = linha.split(";");
                    if (nome.equals(vetor[0]) && senha.equals(vetor[1])) {
                        acesso = true;
                        estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();
                    }
                }
                if(!acesso){
                    System.out.println("Dados inválidos!");
                }
            }

        } catch (Exception e) {
            System.out.println("");
        }
        return sair;
    }
}
