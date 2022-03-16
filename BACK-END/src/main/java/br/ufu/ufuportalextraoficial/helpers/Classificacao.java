package br.ufu.ufuportalextraoficial.helpers;

public enum Classificacao {
    ADM("ADM", "Administrador"),
    DIS("DIS", "Discente"),
    DOS("DOS", "Doscente");

    private String sigla;

    private String descricao;

    Classificacao(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }
}
