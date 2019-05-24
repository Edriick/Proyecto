/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alienware
 */
@Entity
@Table(name = "contratos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contratos.findAll", query = "SELECT c FROM Contratos c"),
    @NamedQuery(name = "Contratos.findByIdcontrato", query = "SELECT c FROM Contratos c WHERE c.idcontrato = :idcontrato"),
    @NamedQuery(name = "Contratos.findByConcepto", query = "SELECT c FROM Contratos c WHERE c.concepto = :concepto"),
    @NamedQuery(name = "Contratos.findByFechainiciocontrato", query = "SELECT c FROM Contratos c WHERE c.fechainiciocontrato = :fechainiciocontrato"),
    @NamedQuery(name = "Contratos.findByFechafincontrato", query = "SELECT c FROM Contratos c WHERE c.fechafincontrato = :fechafincontrato"),
    @NamedQuery(name = "Contratos.findByCodcontrato", query = "SELECT c FROM Contratos c WHERE c.codcontrato = :codcontrato")})
public class Contratos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontrato")
    private Integer idcontrato;
    @Column(name = "concepto")
    private String concepto;
    @Column(name = "fechainiciocontrato")
    @Temporal(TemporalType.DATE)
    private Date fechainiciocontrato;
    @Column(name = "fechafincontrato")
    @Temporal(TemporalType.DATE)
    private Date fechafincontrato;
    @Column(name = "codcontrato")
    private String codcontrato;
    @JoinColumn(name = "idadministrador", referencedColumnName = "idadministrador")
    @ManyToOne(optional = false)
    private Administradorcontrato idadministrador;
    @JoinColumn(name = "idcontratista", referencedColumnName = "idcontratista")
    @ManyToOne(optional = false)
    private Contratista idcontratista;
    @OneToMany(mappedBy = "idcontrato")
    private Collection<Poliza> polizaCollection;

    public Contratos() {
    }

    public Contratos(Integer idcontrato) {
        this.idcontrato = idcontrato;
    }

    public Integer getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(Integer idcontrato) {
        this.idcontrato = idcontrato;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Date getFechainiciocontrato() {
        return fechainiciocontrato;
    }

    public void setFechainiciocontrato(Date fechainiciocontrato) {
        this.fechainiciocontrato = fechainiciocontrato;
    }

    public Date getFechafincontrato() {
        return fechafincontrato;
    }

    public void setFechafincontrato(Date fechafincontrato) {
        this.fechafincontrato = fechafincontrato;
    }

    public String getCodcontrato() {
        return codcontrato;
    }

    public void setCodcontrato(String codcontrato) {
        this.codcontrato = codcontrato;
    }

    public Administradorcontrato getIdadministrador() {
        return idadministrador;
    }

    public void setIdadministrador(Administradorcontrato idadministrador) {
        this.idadministrador = idadministrador;
    }

    public Contratista getIdcontratista() {
        return idcontratista;
    }

    public void setIdcontratista(Contratista idcontratista) {
        this.idcontratista = idcontratista;
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
        hash += (idcontrato != null ? idcontrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contratos)) {
            return false;
        }
        Contratos other = (Contratos) object;
        if ((this.idcontrato == null && other.idcontrato != null) || (this.idcontrato != null && !this.idcontrato.equals(other.idcontrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Contratos[ idcontrato=" + idcontrato + " ]";
    }
    
}
