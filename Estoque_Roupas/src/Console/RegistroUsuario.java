/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;
import static Console.TelaInicial.estadoConsole;
import Model.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
/**
 *
 * @author Caio
 */
public class RegistroUsuario extends MaquinaEstadoConsole{
    @Override
    public boolean Executa() {
        boolean sair = false;
        try{
            FileReader fr = new FileReader("login.txt");
            BufferedReader lerArq = new BufferedReader(fr);
            
            String linha = "";
            String texto = "";
        
        
        Usuario usuario = new Usuario();
        String login = "";
        String senha = "";
        Scanner scanner = new Scanner(System.in);
        while(login.equals("") || login.contains(" ")){
            
            System.out.println("Digite o seu login(não pode conter espaços e nem ser vazio):");
            login = scanner.nextLine();
            usuario.setNome(login);
        }
        while(senha.equals("") || senha.contains(" ")){
            
            System.out.println("Digite a sua senha(não pode conter espaços e nem ser vazia):");
            senha = scanner.nextLine();
            usuario.setSenha(senha);
        }
        while(linha != null){
            linha = lerArq.readLine();
            if(linha != null){
                texto += linha + "\n";
            }
        }
        
        FileWriter fw = new FileWriter("login.txt");
        BufferedWriter bw = new BufferedWriter( fw );
        texto += usuario.getNome() + ";" + usuario.getSenha();
        bw.write(texto);
        bw.newLine();
        bw.close();
        fw.close();
        System.out.println("Cadastro realizado com sucesso!");
        estadoConsole = EnumEstadoConsole.LOGIN.getEstadoMaquina();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return sair;
    }
}
