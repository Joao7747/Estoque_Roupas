package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import Model.Item;
import Model.EnumCor;
import Model.EnumTamanho;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class DAOItem implements DaoGenerica<Item> {

    private ConexaoBanco conexao;

    public DAOItem() {
        this.conexao = new ConexaoBanco();
    }

    @Override
    public void inserir(Item item) {
        String sql = "insert into Item (data_entrada, tipo, marca,caracteristica, tamanho,\n" +
"    cor, preco_sugerido, quantidade, local_compra, valor_da_etiqueta, valor_pago, \n" +
"    valor_para_margem_100 ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            if (this.conexao.conectar()) {

                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);

                sentenca.setString(1, item.getDataDeEntrada().toString());
                sentenca.setString(2, item.getTipo());
                sentenca.setString(3, item.getMarca());
                sentenca.setString(4, item.getCaracteristica());
                sentenca.setString(5,item.getTamanho());
                sentenca.setString(6,item.getCor());
                sentenca.setDouble(7, item.getValorSugerido());
                sentenca.setInt(8, item.getQuantidade());
                sentenca.setDouble(9, item.getValorEtiqueta());
                sentenca.setDouble(10, item.getValorPago());
                sentenca.setString(11, item.getLocalCompra());
                sentenca.setString(12, "valor_pago * 2");

                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    @Override
    public void alterar(Item item) {
        String sql = "UPDATE Item SET data_entrada = ? , tipo = ? , marca = ?, "
                + "caracteristica = ?, tamanho = ? , cor = ?, preco_sugerido = ?, quantidade = ?, "
                + " local_compra = ?, valor_da_etiqueta = ?, valor_pago = ?, valor_para_margem_100 = ? WHERE id = ?";

        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);

                sentenca.setString(1, item.getDataDeEntrada().toString());
                sentenca.setString(2, item.getTipo());
                sentenca.setString(3, item.getMarca());
                sentenca.setString(4, item.getCaracteristica());
                sentenca.setString(5,item.getTamanho());
                sentenca.setString(6,item.getCor());
                sentenca.setDouble(7, item.getValorSugerido());
                sentenca.setInt(8, item.getQuantidade());
                sentenca.setString(9, item.getLocalCompra());
                sentenca.setDouble(10, item.getValorEtiqueta());
                sentenca.setDouble(11, item.getValorPago());
                sentenca.setString(12, "valor_pago * 2");
                sentenca.setInt(13, item.id);

                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    @Override
    public void excluir(int id) {
        String sql = "DELETE FROM Item WHERE id = ?";

        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);

                sentenca.setInt(1, id);

                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public ArrayList<Item> consultar()
    {
    ArrayList<Item> listaItem = new ArrayList<Item>();
    
        String sql = "SELECT * FROM Item ORDER BY id";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                
                ResultSet resultadoSentenca = sentenca.executeQuery();

                
                while(resultadoSentenca.next()) 
                {
                    
                    Item item = new Item();
                    item.id = resultadoSentenca.getInt("id");
                    item.setDataDeEntrada(resultadoSentenca.getDate("data_entrada"));
                    item.setTipo(resultadoSentenca.getString("tipo"));
                    item.setMarca(resultadoSentenca.getString("marca"));
                    item.setCaracteristica(resultadoSentenca.getString("caracteristica"));
                    item.setTamanho(resultadoSentenca.getString("tamanho"));
                    item.setCor(resultadoSentenca.getString("cor"));
                    item.setValorSugerido(resultadoSentenca.getDouble("preco_sugerido"));
                    item.setQuantidade(resultadoSentenca.getInt("quantidade"));
                    item.setValorEtiqueta(resultadoSentenca.getDouble("valor_da_etiqueta"));
                    item.setValorPago(resultadoSentenca.getDouble("valor_pago"));
                    item.setValorParaMargem(resultadoSentenca.getDouble("valor_para_margem_100"));
                    item.setLocalCompra(resultadoSentenca.getString("local_compra"));
                    
                   
                    listaItem.add(item);
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }
            
            return listaItem;
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    
    
    
    }

}
