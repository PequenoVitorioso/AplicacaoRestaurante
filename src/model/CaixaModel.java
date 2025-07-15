package model;

import java.util.Date;

/**
 *
 * @author paulo
 */
public class CaixaModel {
    private int numNotaFiscal;
    private float valorTotal;
    private Date data;
    private String formPagamento;

    public CaixaModel() {
        numNotaFiscal = 0;
        valorTotal = 0;
        formPagamento = "";
    }

    public int getNumNotaFiscal() {
        return numNotaFiscal;
    }

    public void setNumNotaFiscal(int numNotaFiscal) {
        this.numNotaFiscal = numNotaFiscal;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getFormPagamento() {
        return formPagamento;
    }

    public void setFormPagamento(String formPagamento) {
        this.formPagamento = formPagamento;
    }
    
    
    
    
    
}
