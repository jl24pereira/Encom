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
@Table(name = "emisor", catalog = "encomdb", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Emisor.findAll", query = "SELECT e FROM Emisor e")
    , @NamedQuery(name = "Emisor.findByIdemisor", query = "SELECT e FROM Emisor e WHERE e.idemisor = :idemisor")
    , @NamedQuery(name = "Emisor.findByNombres", query = "SELECT e FROM Emisor e WHERE e.nombres = :nombres")
    , @NamedQuery(name = "Emisor.findByApellidos", query = "SELECT e FROM Emisor e WHERE e.apellidos = :apellidos")
    , @NamedQuery(name = "Emisor.findByDui", query = "SELECT e FROM Emisor e WHERE e.dui = :dui")
    , @NamedQuery(name = "Emisor.findByTelefono", query = "SELECT e FROM Emisor e WHERE e.telefono = :telefono")
    , @NamedQuery(name = "Emisor.findByDireccion", query = "SELECT e FROM Emisor e WHERE e.direccion = :direccion")
    , @NamedQuery(name = "Emisor.findByMunicipio", query = "SELECT e FROM Emisor e WHERE e.municipio = :municipio")
    , @NamedQuery(name = "Emisor.findByDepartamento", query = "SELECT e FROM Emisor e WHERE e.departamento = :departamento")})
public class Emisor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idemisor", nullable = false)
    private Integer idemisor;
    @Size(max = 50)
    @Column(name = "nombres", length = 50)
    private String nombres;
    @Size(max = 50)
    @Column(name = "apellidos", length = 50)
    private String apellidos;
    @Size(max = 11)
    @Column(name = "dui", length = 11)
    private String dui;
    @Size(max = 9)
    @Column(name = "telefono", length = 9)
    private String telefono;
    @Size(max = 150)
    @Column(name = "direccion", length = 150)
    private String direccion;
    @Size(max = 50)
    @Column(name = "municipio", length = 50)
    private String municipio;
    @Size(max = 25)
    @Column(name = "departamento", length = 25)
    private String departamento;
    @OneToMany(mappedBy = "emisor")
    private List<Reciente> recienteList;
    @OneToMany(mappedBy = "emisor")
    private List<Orden> ordenList;

    public Emisor() {
    }

    public Emisor(Integer idemisor) {
        this.idemisor = idemisor;
    }

    public Integer getIdemisor() {
        return idemisor;
    }

    public void setIdemisor(Integer idemisor) {
        this.idemisor = idemisor;
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

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
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

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
        hash += (idemisor != null ? idemisor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emisor)) {
            return false;
        }
        Emisor other = (Emisor) object;
        if ((this.idemisor == null && other.idemisor != null) || (this.idemisor != null && !this.idemisor.equals(other.idemisor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pereira.encomiendas.model.Emisor[ idemisor=" + idemisor + " ]";
    }
    
}
