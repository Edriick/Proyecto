/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alienware
 */
@Entity
@Table(name = "tipoestado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoestado.findAll", query = "SELECT t FROM Tipoestado t"),
    @NamedQuery(name = "Tipoestado.getdescripcion", query = "SELECT t.descripcionestado FROM Tipoestado t WHERE t.idestado = :idestado"),
    @NamedQuery(name = "Tipoestado.findByDescripcionestado", query = "SELECT t FROM Tipoestado t WHERE t.descripcionestado = :descripcionestado")})
public class Tipoestado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestado")
    private Integer idestado;
    @Basic(optional = false)
    @Column(name = "descripcionestado")
    private String descripcionestado;
    @OneToMany(mappedBy = "idestado")
    private Collection<Poliza> polizaCollection;

    public Tipoestado() {
    }

    public Tipoestado(Integer idestado) {
        this.idestado = idestado;
    }

    public Tipoestado(Integer idestado, String descripcionestado) {
        this.idestado = idestado;
        this.descripcionestado = descripcionestado;
    }

    public Integer getIdestado() {
        return idestado;
    }

    public void setIdestado(Integer idestado) {
        this.idestado = idestado;
    }

    public String getDescripcionestado() {
        return descripcionestado;
    }

    public void setDescripcionestado(String descripcionestado) {
        this.descripcionestado = descripcionestado;
    }

    @XmlTransient
    public Collection<Poliza> getPolizaCollection() {
        return polizaCollection;
    }

    public void setPolizaCollection(Collection<Poliza> polizaCollection) {
        this.polizaCollection = polizaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestado != null ? idestado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoestado)) {
            return false;
        }
        Tipoestado other = (Tipoestado) object;
        if ((this.idestado == null && other.idestado != null) || (this.idestado != null && !this.idestado.equals(other.idestado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Tipoestado[ idestado=" + idestado + " ]";
    }
    
}
