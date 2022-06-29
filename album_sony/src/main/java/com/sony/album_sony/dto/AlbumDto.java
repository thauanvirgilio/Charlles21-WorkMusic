package com.sony.album_sony.dto;

import java.util.Date;

public class AlbumDto {
    
    private Date dataLancamento;
    private String nome;
    private String duracao;

    public Albumdto(Date dataLancamento, String nome, String duracao) {
        this.dataLancamento = dataLancamento;
        this.nome = nome;
        this.duracao = duracao;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }
    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDuracao() {
        return duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

}
