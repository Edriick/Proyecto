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
@Table(name = "contratista")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contratista.findAll", query = "SELECT c FROM Contratista c"),
    @NamedQuery(name = "Contratista.findByIdcontratista", query = "SELECT c FROM Contratista c WHERE c.idcontratista = :idcontratista"),
    @NamedQuery(name = "Contratista.findByCiruc", query = "SELECT c FROM Contratista c WHERE c.ciruc = :ciruc"),
    @NamedQuery(name = "Contratista.findByNombrecontratista", query = "SELECT c FROM Contratista c WHERE c.nombrecontratista = :nombrecontratista"),
    @NamedQuery(name = "Contratista.findByCodigoespoch", query = "SELECT c FROM Contratista c WHERE c.codigoespoch = :codigoespoch"),
    @NamedQuery(name = "Contratista.findByCorreoelectronico", query = "SELECT c FROM Contratista c WHERE c.correoelectronico = :correoelectronico"),
    @NamedQuery(name = "Contratista.findByTelefono", query = "SELECT c FROM Contratista c WHERE c.telefono = :telefono")})
public class Contratista implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontratista")
    private Integer idcontratista;
    @Basic(optional = false)
    @Column(name = "ciruc")
    private String ciruc;
    @Column(name = "nombrecontratista")
    private String nombrecontratista;
    @Column(name = "codigoespoch")
    private String codigoespoch;
    @Column(name = "correoelectronico")
    private String correoelectronico;
    @Column(name = "telefono")
    private String telefono;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcontratista")
    private Collection<Contratos> contratosCollection;

    public Contratista() {
    }

    public Contratista(Integer idcontratista) {
        this.idcontratista = idcontratista;
    }

    public Contratista(Integer idcontratista, String ciruc) {
        this.idcontratista = idcontratista;
        this.ciruc = ciruc;
    }

    public Integer getIdcontratista() {
        return idcontratista;
    }

    public void setIdcontratista(Integer idcontratista) {
        this.idcontratista = idcontratista;
    }

    public String getCiruc() {
        return ciruc;
    }

    public void setCiruc(String ciruc) {
        this.ciruc = ciruc;
    }

    public String getNombrecontratista() {
        return nombrecontratista;
    }

    public void setNombrecontratista(String nombrecontratista) {
        this.nombrecontratista = nombrecontratista;
    }

    public String getCodigoespoch() {
        return codigoespoch;
    }

    public void setCodigoespoch(String codigoespoch) {
        this.codigoespoch = codigoespoch;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @XmlTransient
    public Collection<Contratos> getContratosCollection() {
        return contratosCollection;
    }

    public void setContratosCollection(Collection<Contratos> contratosCollection) {
        this.contratosCollection = contratosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontratista != null ? idcontratista.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contratista)) {
            return false;
        }
        Contratista other = (Contratista) object;
        if ((this.idcontratista == null && other.idcontratista != null) || (this.idcontratista != null && !this.idcontratista.equals(other.idcontratista))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Contratista[ idcontratista=" + idcontratista + " ]";
    }
    
}
