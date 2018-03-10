/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.encomiendas.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jose Luis
 */
@Entity
@Table(name = "reciente", catalog = "encomdb", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Reciente.findAll", query = "SELECT r FROM Reciente r")
    , @NamedQuery(name = "Reciente.findByIdreciente", query = "SELECT r FROM Reciente r WHERE r.idreciente = :idreciente")
    , @NamedQuery(name = "Reciente.findByEmisor", query = "SELECT r FROM Reciente r WHERE r.emisor.idemisor = :idemisor")})
public class Reciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreciente", nullable = false)
    private Integer idreciente;
    @JoinColumn(name = "emisor", referencedColumnName = "idemisor")
    @ManyToOne
    private Emisor emisor;
    @JoinColumn(name = "receptor", referencedColumnName = "idreceptor")
    @ManyToOne
    private Receptor receptor;

    public Reciente() {
    }

    public Reciente(Integer idreciente) {
        this.idreciente = idreciente;
    }

    public Integer getIdreciente() {
        return idreciente;
    }

    public void setIdreciente(Integer idreciente) {
        this.idreciente = idreciente;
    }

    public Emisor getEmisor() {
        return emisor;
    }

    public void setEmisor(Emisor emisor) {
        this.emisor = emisor;
    }

    public Receptor getReceptor() {
        return receptor;
    }

    public void setReceptor(Receptor receptor) {
        this.receptor = receptor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreciente != null ? idreciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reciente)) {
            return false;
        }
        Reciente other = (Reciente) object;
        if ((this.idreciente == null && other.idreciente != null) || (this.idreciente != null && !this.idreciente.equals(other.idreciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pereira.encomiendas.model.Reciente[ idreciente=" + idreciente + " ]";
    }

}
