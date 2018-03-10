/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.encomiendas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jose Luis
 */
@Entity
@Table(name = "orden", catalog = "encomdb", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Orden.findAll", query = "SELECT o FROM Orden o")
    , @NamedQuery(name = "Orden.findByIdorden", query = "SELECT o FROM Orden o WHERE o.idorden = :idorden")
    , @NamedQuery(name = "Orden.findByNorden", query = "SELECT o FROM Orden o WHERE o.norden = :norden")
    , @NamedQuery(name = "Orden.findByFrecibido", query = "SELECT o FROM Orden o WHERE o.frecibido = :frecibido")
    , @NamedQuery(name = "Orden.findByPeso", query = "SELECT o FROM Orden o WHERE o.peso = :peso")
    , @NamedQuery(name = "Orden.findByCosto", query = "SELECT o FROM Orden o WHERE o.costo = :costo")
    , @NamedQuery(name = "Orden.findBySalida", query = "SELECT o FROM Orden o WHERE o.salida = :salida")})
public class Orden implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idorden", nullable = false)
    private Integer idorden;
    @Column(name = "norden")
    private Integer norden;
    @Column(name = "frecibido")
    @Temporal(TemporalType.DATE)
    private Date frecibido;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "peso", precision = 6, scale = 2)
    private BigDecimal peso;
    @Column(name = "costo", precision = 6, scale = 2)
    private BigDecimal costo;
    @JoinColumn(name = "emisor", referencedColumnName = "idemisor")
    @ManyToOne
    private Emisor emisor;
    @JoinColumn(name = "receptor", referencedColumnName = "idreceptor")
    @ManyToOne
    private Receptor receptor;
    @JoinColumn(name = "salida", referencedColumnName = "idsalida")
    @ManyToOne
    private Salida salida;
    @OneToMany(mappedBy = "orden", cascade = {CascadeType.PERSIST}, fetch = FetchType.EAGER)
    private List<Paquete> paqueteList;

    public Orden() {
    }

    public Orden(Integer idorden) {
        this.idorden = idorden;
    }

    public Integer getIdorden() {
        return idorden;
    }

    public void setIdorden(Integer idorden) {
        this.idorden = idorden;
    }

    public Integer getNorden() {
        return norden;
    }

    public void setNorden(Integer norden) {
        this.norden = norden;
    }

    public Date getFrecibido() {
        return frecibido;
    }

    public void setFrecibido(Date frecibido) {
        this.frecibido = frecibido;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
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

    public Salida getSalida() {
        return salida;
    }

    public void setSalida(Salida salida) {
        this.salida = salida;
    }

    public List<Paquete> getPaqueteList() {
        return paqueteList;
    }

    public void setPaqueteList(List<Paquete> paqueteList) {
        this.paqueteList = paqueteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idorden != null ? idorden.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orden)) {
            return false;
        }
        Orden other = (Orden) object;
        if ((this.idorden == null && other.idorden != null) || (this.idorden != null && !this.idorden.equals(other.idorden))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pereira.encomiendas.model.Orden[ idorden=" + idorden + " ]";
    }

}
