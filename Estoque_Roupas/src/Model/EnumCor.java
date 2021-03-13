package Model;

public enum EnumCor {
    PRETO("PRETO"), 
    BRANCO("BRANCO"), 
    AZUL("AZUL"), 
    AMARELO("AMARELO"), 
    VERMELHO("VERMELHO"),
    CINZA("CINZA"),
    ROXO("ROXO"),
    MARROM("MARROM"),
    ROSA("ROSA"),
    BEGE("BEGE"),
    LARANJA("LARANJA");

    private String descricao;

    EnumCor(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}