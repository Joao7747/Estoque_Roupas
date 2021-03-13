package Model;

import java.sql.Date;
import java.time.LocalDate;



public class Item {

    public int id;
    private Date dataDeEntrada;
    private String LocalCompra;
    private String tipo;
    private String Marca;
    private String caracteristica;
    private String tamanho; //ENUM
    private String cor; //ENUM
    private int quantidade;
    private double valorEtiqueta;
    private double valorPago;
    private double valorParaMargem;
    private double valorSugerido;
    
    
    /**
     * @return the tamanho
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

  
    
    /**
     * @return the LocalCompra
     */
    public String getLocalCompra() {
        return LocalCompra;
    }

    /**
     * @param LocalCompra the LocalCompra to set
     */
    public void setLocalCompra(String LocalCompra) {
        this.LocalCompra = LocalCompra;
    }

    
    
   
    /**
     * @return the dataDeEntrada
     */
    public Date getDataDeEntrada() {
        return dataDeEntrada;
    }

    /**
     * @param dataDeEntrada the dataDeEntrada to set
     */
    public void setDataDeEntrada(Date dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

  

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the caracteristica
     */
    public String getCaracteristica() {
        return caracteristica;
    }

    /**
     * @param caracteristica the caracteristica to set
     */
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

 

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valorEtiqueta
     */
    public double getValorEtiqueta() {
        return valorEtiqueta;
    }

    /**
     * @param valorEtiqueta the valorEtiqueta to set
     */
    public void setValorEtiqueta(double valorEtiqueta) {
        this.valorEtiqueta = valorEtiqueta;
    }

    /**
     * @return the valorPago
     */
    public double getValorPago() {
        return valorPago;
    }

    /**
     * @param valorPago the valorPago to set
     */
    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    /**
     * @return the valorParaMargem
     */
    public double getValorParaMargem() {
        return valorParaMargem;
    }

    /**
     * @param valorParaMargem the valorParaMargem to set
     */
    public void setValorParaMargem(double valorParaMargem) {
        this.valorParaMargem = valorParaMargem;
    }

    /**
     * @return the valorSugerido
     */
    public double getValorSugerido() {
        return valorSugerido;
    }

    /**
     * @param valorSugerido the valorSugerido to set
     */
    public void setValorSugerido(double valorSugerido) {
        this.valorSugerido = valorSugerido;
    }
    
    
    
}
