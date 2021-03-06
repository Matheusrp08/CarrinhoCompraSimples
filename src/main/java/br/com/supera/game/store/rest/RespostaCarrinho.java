package br.com.supera.game.store.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class RespostaCarrinho extends Resposta {

    @JsonInclude(Include.NON_NULL)
    private Double valorTotal;

    @JsonInclude(Include.NON_NULL)
    private Double valorFrete;

    @JsonInclude(Include.NON_NULL)
    private Integer qtdTotal;

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setValorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public Integer getQtdTotal() {
        return qtdTotal;
    }

    public void setQtdTotal(Integer qtdTotal) {
        this.qtdTotal = qtdTotal;
    }
}
