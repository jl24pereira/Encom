/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.encomiendas.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Jose Luis
 */
@Entity
@Table(name = "receptor", catalog = "encomdb", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Receptor.findAll", query = "SELECT r FROM Receptor r")
    , @NamedQuery(name = "Receptor.findByIdreceptor", query = "SELECT r FROM Receptor r WHERE r.idreceptor = :idreceptor")
    , @NamedQuery(name = "Receptor.findByNombres", query = "SELECT r FROM Receptor r WHERE r.nombres = :nombres")
    , @NamedQuery(name = "Receptor.findByApellidos", query = "SELECT r FROM Receptor r WHERE r.apellidos = :apellidos")
    , @NamedQuery(name = "Receptor.findByTelefono", query = "SELECT r FROM Receptor r WHERE r.telefono = :telefono")
    , @NamedQuery(name = "Receptor.findByDireccion", query = "SELECT r FROM Receptor r WHERE r.direccion = :direccion")
    , @NamedQuery(name = "Receptor.findByCiudad", query = "SELECT r FROM Receptor r WHERE r.ciudad = :ciudad")
    , @NamedQuery(name = "Receptor.findByEstado", query = "SELECT r FROM Receptor r WHERE r.estado = :estado")
    , @NamedQuery(name = "Receptor.findByZipcode", query = "SELECT r FROM Receptor r WHERE r.zipcode = :zipcode")})
public class Receptor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreceptor", nullable = false)
    private Integer idreceptor;
    @Size(max = 50)
    @Column(name = "nombres", length = 50)
    private String nombres;
    @Size(max = 50)
    @Column(name = "apellidos", length = 50)
    private String apellidos;
    @Size(max = 15)
    @Column(name = "telefono", length = 15)
    private String telefono;
    @Size(max = 150)
    @Column(name = "direccion", length = 150)
    private String direccion;
    @Size(max = 50)
    @Column(name = "ciudad", length = 50)
    private String ciudad;
    @Size(max = 25)
    @Column(name = "estado", length = 25)
    private String estado;
    @Size(max = 10)
    @Column(name = "zipcode", length = 10)
    private String zipcode;
    @OneToMany(mappedBy = "receptor")
    private List<Reciente> recienteList;
    @OneToMany(mappedBy = "receptor")
    private List<Orden> ordenList;

    public Receptor() {
    }

    public Receptor(Integer idreceptor) {
        this.idreceptor = idreceptor;
    }

    public Integer getIdreceptor() {
        return idreceptor;
    }

    public void setIdreceptor(Integer idreceptor) {
        this.idreceptor = idreceptor;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public List<Reciente> getRecienteList() {
        return recienteList;
    }

    public void setRecienteList(List<Reciente> recienteList) {
        this.recienteList = recienteList;
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
        hash += (idreceptor != null ? idreceptor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Receptor)) {
            return false;
        }
        Receptor other = (Receptor) object;
        if ((this.idreceptor == null && other.idreceptor != null) || (this.idreceptor != null && !this.idreceptor.equals(other.idreceptor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pereira.encomiendas.model.Receptor[ idreceptor=" + idreceptor + " ]";
    }
    
}
