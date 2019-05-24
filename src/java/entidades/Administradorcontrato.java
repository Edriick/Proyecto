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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "administradorcontrato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administradorcontrato.findAll", query = "SELECT a FROM Administradorcontrato a"),
    @NamedQuery(name = "Administradorcontrato.findByIdadministrador", query = "SELECT a FROM Administradorcontrato a WHERE a.idadministrador = :idadministrador"),
    @NamedQuery(name = "Administradorcontrato.findByNumadministrador", query = "SELECT a FROM Administradorcontrato a WHERE a.numadministrador = :numadministrador"),
    @NamedQuery(name = "Administradorcontrato.findByNombreadmin", query = "SELECT a FROM Administradorcontrato a WHERE a.nombreadmin = :nombreadmin")})
public class Administradorcontrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idadministrador")
    private Integer idadministrador;
    @Basic(optional = false)
    @Column(name = "numadministrador")
    private int numadministrador;
    @Column(name = "nombreadmin")
    private String nombreadmin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idadministrador")
    private Collection<Contratos> contratosCollection;
    @JoinColumn(name = "idcargo", referencedColumnName = "idcargo")
    @ManyToOne(optional = false)
    private Tipocargo idcargo;

    public Administradorcontrato() {
    }

    public Administradorcontrato(Integer idadministrador) {
        this.idadministrador = idadministrador;
    }

    public Administradorcontrato(Integer idadministrador, int numadministrador) {
        this.idadministrador = idadministrador;
        this.numadministrador = numadministrador;
    }

    public Integer getIdadministrador() {
        return idadministrador;
    }

    public void setIdadministrador(Integer idadministrador) {
        this.idadministrador = idadministrador;
    }

    public int getNumadministrador() {
        return numadministrador;
    }

    public void setNumadministrador(int numadministrador) {
        this.numadministrador = numadministrador;
    }

    public String getNombreadmin() {
        return nombreadmin;
    }

    public void setNombreadmin(String nombreadmin) {
        this.nombreadmin = nombreadmin;
    }

    @XmlTransient
    public Collection<Contratos> getContratosCollection() {
        return contratosCollection;
    }

    public void setContratosCollection(Collection<Contratos> contratosCollection) {
        this.contratosCollection = contratosCollection;
    }

    public Tipocargo getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(Tipocargo idcargo) {
        this.idcargo = idcargo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idadministrador != null ? idadministrador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administradorcontrato)) {
            return false;
        }
        Administradorcontrato other = (Administradorcontrato) object;
        if ((this.idadministrador == null && other.idadministrador != null) || (this.idadministrador != null && !this.idadministrador.equals(other.idadministrador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Administradorcontrato[ idadministrador=" + idadministrador + " ]";
    }
    
}
