package models;

import java.io.Serializable;
import java.util.List;

public class Venda implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String clienteId;
    private String atendenteId;
    private List<Produto> produtos;

    public Venda(String id, String clienteId, String atendenteId, List<Produto> produtos) {
        this.id = id;
        this.clienteId = clienteId;
        this.atendenteId = atendenteId;
        this.produtos = produtos;
    }

    public String getId() {
        return this.id;
    }

    public String getClienteId() {
        return this.clienteId;
    }

    public String getAtendenteId() {
        return this.atendenteId;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public void setAtendenteId(String atendenteId) {
        this.atendenteId = atendenteId;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}