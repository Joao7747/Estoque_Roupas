package Model;

public enum EnumTamanho {
    P("P"), M("M"), G("G"), GG("GG");

    private String descricao;

    EnumTamanho(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
