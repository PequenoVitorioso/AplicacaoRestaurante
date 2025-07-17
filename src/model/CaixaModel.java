package model;

import java.time.LocalDate;
import java.time.ZoneId;
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
    private ClienteModel cliente;

    public CaixaModel() {
        numNotaFiscal = 0;
        valorTotal = 0;
        formPagamento = "";
        cliente = new ClienteModel();
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
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
    
    public String toStringDataVenda() {
        LocalDate localDate = data.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        int dia = localDate.getDayOfMonth();
        int mes = localDate.getMonthValue();
        int ano = localDate.getYear();
        
        String retorno = String.valueOf(ano)+'-'+String.valueOf(mes)+'-'+String.valueOf(dia);
        return retorno;
    }
    
    
    
}
