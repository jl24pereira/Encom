/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.encomiendas.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Jose Luis
 */
@Entity
@Table(name = "salida", catalog = "encomdb", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Salida.findAll", query = "SELECT s FROM Salida s")
    , @NamedQuery(name = "Salida.findByIdsalida", query = "SELECT s FROM Salida s WHERE s.idsalida = :idsalida")
    , @NamedQuery(name = "Salida.findByDestino", query = "SELECT s FROM Salida s WHERE s.destino = :destino")
    , @NamedQuery(name = "Salida.findByDetalle", query = "SELECT s FROM Salida s WHERE s.detalle = :detalle")
    , @NamedQuery(name = "Salida.findByFecha", query = "SELECT s FROM Salida s WHERE s.fecha = :fecha")
    , @NamedQuery(name = "Salida.findReciente", query = "SELECT s FROM Salida s WHERE s.fecha > :fecha order by s.fecha asc")})
public class Salida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsalida", nullable = false)
    private Integer idsalida;
    @Size(max = 100)
    @Column(name = "destino", length = 100)
    private String destino;
    @Size(max = 200)
    @Column(name = "detalle", length = 200)
    private String detalle;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @OneToMany(mappedBy = "salida",cascade = {CascadeType.PERSIST},fetch = FetchType.EAGER)
    private List<Orden> ordenList;

    public Salida() {
    }

    public Salida(Integer idsalida) {
        this.idsalida = idsalida;
    }

    public Integer getIdsalida() {
        return idsalida;
    }

    public void setIdsalida(Integer idsalida) {
        this.idsalida = idsalida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Orden> getOrdenList() {
        return ordenList;
    }

    public void setOrdenList(List<Orden> ordenList) {
        this.ordenList = ordenList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsalida != null ? idsalida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salida)) {
            return false;
        }
        Salida other = (Salida) object;
        if ((this.idsalida == null && other.idsalida != null) || (this.idsalida != null && !this.idsalida.equals(other.idsalida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");        
        return sdf.format(fecha)+" - "+this.destino;
    }

}
