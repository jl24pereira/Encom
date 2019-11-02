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
import javax.validation.constraints.Size;

/**
 *
 * @author Jose Luis
 */
@Entity
@Table(name = "paquete", catalog = "encomdb", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Paquete.findAll", query = "SELECT p FROM Paquete p")
    , @NamedQuery(name = "Paquete.findByIdpaquete", query = "SELECT p FROM Paquete p WHERE p.idpaquete = :idpaquete")
    , @NamedQuery(name = "Paquete.findByDescripcion", query = "SELECT p FROM Paquete p WHERE p.descripcion = :descripcion")})
public class Paquete implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpaquete", nullable = false)
    private Long idpaquete;
    @Size(max = 150)
    @Column(name = "descripcion", length = 150)
    private String descripcion;
    @JoinColumn(name = "orden", referencedColumnName = "idorden")
    @ManyToOne
    private Orden orden;

    public Paquete() {
    }

    public Paquete(Long idpaquete) {
        this.idpaquete = idpaquete;
    }

    public Long getIdpaquete() {
        return idpaquete;
    }

    public void setIdpaquete(Long idpaquete) {
        this.idpaquete = idpaquete;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpaquete != null ? idpaquete.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paquete)) {
            return false;
        }
        Paquete other = (Paquete) object;
        if ((this.idpaquete == null && other.idpaquete != null) || (this.idpaquete != null && !this.idpaquete.equals(other.idpaquete))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pereira.encomiendas.model.Paquete[ idpaquete=" + idpaquete + " ]";
    }
    
}
