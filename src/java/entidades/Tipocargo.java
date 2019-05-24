/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alienware
 */
@Entity
@Table(name = "tipocargo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipocargo.findAll", query = "SELECT t FROM Tipocargo t"),
    @NamedQuery(name = "Tipocargo.findByIdcargo", query = "SELECT t FROM Tipocargo t WHERE t.idcargo = :idcargo"),
    @NamedQuery(name = "Tipocargo.findByDescripcion", query = "SELECT t FROM Tipocargo t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "Tipocargo.findByLugar", query = "SELECT t FROM Tipocargo t WHERE t.lugar = :lugar")})
public class Tipocargo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcargo")
    private Integer idcargo;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "lugar")
    private String lugar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcargo")
    private Collection<Administradorcontrato> administradorcontratoCollection;

    public Tipocargo() {
    }

    public Tipocargo(Integer idcargo) {
        this.idcargo = idcargo;
    }

    public Tipocargo(Integer idcargo, String descripcion, String lugar) {
        this.idcargo = idcargo;
        this.descripcion = descripcion;
        this.lugar = lugar;
    }

    public Integer getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(Integer idcargo) {
        this.idcargo = idcargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @XmlTransient
    public Collection<Administradorcontrato> getAdministradorcontratoCollection() {
        return administradorcontratoCollection;
    }

    public void setAdministradorcontratoCollection(Collection<Administradorcontrato> administradorcontratoCollection) {
        this.administradorcontratoCollection = administradorcontratoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcargo != null ? idcargo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipocargo)) {
            return false;
        }
        Tipocargo other = (Tipocargo) object;
        if ((this.idcargo == null && other.idcargo != null) || (this.idcargo != null && !this.idcargo.equals(other.idcargo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Tipocargo[ idcargo=" + idcargo + " ]";
    }
    
}
