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
@Table(name = "tipocobertura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipocobertura.findAll", query = "SELECT t FROM Tipocobertura t"),
    @NamedQuery(name = "Tipocobertura.findByIdcobertura", query = "SELECT t FROM Tipocobertura t WHERE t.idcobertura = :idcobertura"),
    @NamedQuery(name = "Tipocobertura.findByDescripcioncobertura", query = "SELECT t FROM Tipocobertura t WHERE t.descripcioncobertura = :descripcioncobertura")})
public class Tipocobertura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcobertura")
    private Integer idcobertura;
    @Basic(optional = false)
    @Column(name = "descripcioncobertura")
    private String descripcioncobertura;
    @OneToMany(mappedBy = "idcobertura")
    private Collection<Poliza> polizaCollection;

    public Tipocobertura() {
    }

    public Tipocobertura(Integer idcobertura) {
        this.idcobertura = idcobertura;
    }

    public Tipocobertura(Integer idcobertura, String descripcioncobertura) {
        this.idcobertura = idcobertura;
        this.descripcioncobertura = descripcioncobertura;
    }

    public Integer getIdcobertura() {
        return idcobertura;
    }

    public void setIdcobertura(Integer idcobertura) {
        this.idcobertura = idcobertura;
    }

    public String getDescripcioncobertura() {
        return descripcioncobertura;
    }

    public void setDescripcioncobertura(String descripcioncobertura) {
        this.descripcioncobertura = descripcioncobertura;
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
        hash += (idcobertura != null ? idcobertura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipocobertura)) {
            return false;
        }
        Tipocobertura other = (Tipocobertura) object;
        if ((this.idcobertura == null && other.idcobertura != null) || (this.idcobertura != null && !this.idcobertura.equals(other.idcobertura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Tipocobertura[ idcobertura=" + idcobertura + " ]";
    }
    
}
