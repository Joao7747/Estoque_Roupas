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
public enum EnumEstadoConsole {
    BEM_VINDO(new BemVindo()),
    
    LOGIN(new Login()),
    
    MENU_PRINCIPAL (new MenuPrincipal()),
    
    LISTAGEM_ITENS (new ListagemItens()),
    
    CADASTRO_ITEM (new CadastroItem()),
    
    DELETAR_ITEM (new DeletarItem()),
    
    ALTERAR_ITEM (new AlterarItem()),
    
    REGISTRO_USUARIO(new RegistroUsuario());
    
    
    
 
    private final MaquinaEstadoConsole estadoMaquina;
    
    EnumEstadoConsole(MaquinaEstadoConsole estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }
 
    public MaquinaEstadoConsole getEstadoMaquina() {
        return estadoMaquina;
    }
}
