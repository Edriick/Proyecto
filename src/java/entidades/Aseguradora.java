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
@Table(name = "aseguradora")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aseguradora.findAll", query = "SELECT a FROM Aseguradora a"),
    @NamedQuery(name = "Aseguradora.findByIdaseguradora", query = "SELECT a FROM Aseguradora a WHERE a.idaseguradora = :idaseguradora"),
    @NamedQuery(name = "Aseguradora.findByNombreaseguradora", query = "SELECT a FROM Aseguradora a WHERE a.nombreaseguradora = :nombreaseguradora"),
    @NamedQuery(name = "Aseguradora.findByCodaseguradora", query = "SELECT a FROM Aseguradora a WHERE a.codaseguradora = :codaseguradora")})
public class Aseguradora implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idaseguradora")
    private Integer idaseguradora;
    @Basic(optional = false)
    @Column(name = "nombreaseguradora")
    private String nombreaseguradora;
    @Column(name = "codaseguradora")
    private String codaseguradora;
    @OneToMany(mappedBy = "idaseguradora")
    private Collection<Poliza> polizaCollection;

    public Aseguradora() {
    }

    public Aseguradora(Integer idaseguradora) {
        this.idaseguradora = idaseguradora;
    }

    public Aseguradora(Integer idaseguradora, String nombreaseguradora) {
        this.idaseguradora = idaseguradora;
        this.nombreaseguradora = nombreaseguradora;
    }

    public Integer getIdaseguradora() {
        return idaseguradora;
    }

    public void setIdaseguradora(Integer idaseguradora) {
        this.idaseguradora = idaseguradora;
    }

    public String getNombreaseguradora() {
        return nombreaseguradora;
    }

    public void setNombreaseguradora(String nombreaseguradora) {
        this.nombreaseguradora = nombreaseguradora;
    }

    public String getCodaseguradora() {
        return codaseguradora;
    }

    public void setCodaseguradora(String codaseguradora) {
        this.codaseguradora = codaseguradora;
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
        hash += (idaseguradora != null ? idaseguradora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aseguradora)) {
            return false;
        }
        Aseguradora other = (Aseguradora) object;
        if ((this.idaseguradora == null && other.idaseguradora != null) || (this.idaseguradora != null && !this.idaseguradora.equals(other.idaseguradora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Aseguradora[ idaseguradora=" + idaseguradora + " ]";
    }
    
}
