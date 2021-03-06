/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Felipe Cardozo
 */
@Entity
public class Solicitacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double preco;
    private Status status;
    @OneToMany(cascade = ALL, mappedBy = "solicitacao")
    private List<Item> itens;
    
    public Solicitacao(){
        this.status = Status.aberto;
        this.preco = 0;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public Status getStatus(){
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    public List<Item> getItens(){
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitacao)) {
            return false;
        }
        Solicitacao other = (Solicitacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Solicitacao[ id=" + id + " ]";
    }

}
