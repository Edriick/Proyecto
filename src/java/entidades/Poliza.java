/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alienware
 */
@Entity
@Table(name = "poliza")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Poliza.findAll", query = "SELECT p FROM Poliza p"),
    @NamedQuery(name = "Poliza.findByIdpolizatabla", query = "SELECT p FROM Poliza p WHERE p.idpolizatabla = :idpolizatabla"),
    @NamedQuery(name = "Poliza.findByNumpoliza", query = "SELECT p FROM Poliza p WHERE p.numpoliza = :numpoliza"),
    @NamedQuery(name = "Poliza.findByFechapagoanticipo", query = "SELECT p FROM Poliza p WHERE p.fechapagoanticipo = :fechapagoanticipo"),
    @NamedQuery(name = "Poliza.findByFechainicialcobertura", query = "SELECT p FROM Poliza p WHERE p.fechainicialcobertura = :fechainicialcobertura"),
    @NamedQuery(name = "Poliza.findByVencimientofechainicial", query = "SELECT p FROM Poliza p WHERE p.vencimientofechainicial = :vencimientofechainicial"),
    @NamedQuery(name = "Poliza.findByVencimientofechafinal", query = "SELECT p FROM Poliza p WHERE p.vencimientofechafinal = :vencimientofechafinal"),
    @NamedQuery(name = "Poliza.findByObservaciones", query = "SELECT p FROM Poliza p WHERE p.observaciones = :observaciones"),
    @NamedQuery(name = "Poliza.findByNumrenovaciones", query = "SELECT p FROM Poliza p WHERE p.numrenovaciones = :numrenovaciones"),
    @NamedQuery(name = "Poliza.findByValorcoberturaactual", query = "SELECT p FROM Poliza p WHERE p.valorcoberturaactual = :valorcoberturaactual"),
    @NamedQuery(name = "Poliza.findByValorcoberturainicial", query = "SELECT p FROM Poliza p WHERE p.valorcoberturainicial = :valorcoberturainicial")})
public class Poliza implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpolizatabla")
    private Integer idpolizatabla;
    @Column(name = "numpoliza")
    private String numpoliza;
    @Column(name = "fechapagoanticipo")
    @Temporal(TemporalType.DATE)
    private Date fechapagoanticipo;
    @Column(name = "fechainicialcobertura")
    @Temporal(TemporalType.DATE)
    private Date fechainicialcobertura;
    @Column(name = "vencimientofechainicial")
    @Temporal(TemporalType.DATE)
    private Date vencimientofechainicial;
    @Column(name = "vencimientofechafinal")
    @Temporal(TemporalType.DATE)
    private Date vencimientofechafinal;
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "numrenovaciones")
    private Integer numrenovaciones;
    @Column(name = "valorcoberturaactual")
    private String valorcoberturaactual;
    @Column(name = "valorcoberturainicial")
    private String valorcoberturainicial;
    @JoinColumn(name = "idaseguradora", referencedColumnName = "idaseguradora")
    @ManyToOne
    private Aseguradora idaseguradora;
    @JoinColumn(name = "idcontrato", referencedColumnName = "idcontrato")
    @ManyToOne
    private Contratos idcontrato;
    @JoinColumn(name = "idcobertura", referencedColumnName = "idcobertura")
    @ManyToOne
    private Tipocobertura idcobertura;
    @JoinColumn(name = "idestado", referencedColumnName = "idestado")
    @ManyToOne
    private Tipoestado idestado;

    public Poliza() {
    }

    public Poliza(Integer idpolizatabla) {
        this.idpolizatabla = idpolizatabla;
    }

    public Integer getIdpolizatabla() {
        return idpolizatabla;
    }

    public void setIdpolizatabla(Integer idpolizatabla) {
        this.idpolizatabla = idpolizatabla;
    }

    public String getNumpoliza() {
        return numpoliza;
    }

    public void setNumpoliza(String numpoliza) {
        this.numpoliza = numpoliza;
    }

    public Date getFechapagoanticipo() {
        return fechapagoanticipo;
    }

    public void setFechapagoanticipo(Date fechapagoanticipo) {
        this.fechapagoanticipo = fechapagoanticipo;
    }

    public Date getFechainicialcobertura() {
        return fechainicialcobertura;
    }

    public void setFechainicialcobertura(Date fechainicialcobertura) {
        this.fechainicialcobertura = fechainicialcobertura;
    }

    public Date getVencimientofechainicial() {
        return vencimientofechainicial;
    }

    public void setVencimientofechainicial(Date vencimientofechainicial) {
        this.vencimientofechainicial = vencimientofechainicial;
    }

    public Date getVencimientofechafinal() {
        return vencimientofechafinal;
    }

    public void setVencimientofechafinal(Date vencimientofechafinal) {
        this.vencimientofechafinal = vencimientofechafinal;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getNumrenovaciones() {
        return numrenovaciones;
    }

    public void setNumrenovaciones(Integer numrenovaciones) {
        this.numrenovaciones = numrenovaciones;
    }

    public String getValorcoberturaactual() {
        return valorcoberturaactual;
    }

    public void setValorcoberturaactual(String valorcoberturaactual) {
        this.valorcoberturaactual = valorcoberturaactual;
    }

    public String getValorcoberturainicial() {
        return valorcoberturainicial;
    }

    public void setValorcoberturainicial(String valorcoberturainicial) {
        this.valorcoberturainicial = valorcoberturainicial;
    }

    public Aseguradora getIdaseguradora() {
        return idaseguradora;
    }

    public void setIdaseguradora(Aseguradora idaseguradora) {
        this.idaseguradora = idaseguradora;
    }

    public Contratos getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(Contratos idcontrato) {
        this.idcontrato = idcontrato;
    }

    public Tipocobertura getIdcobertura() {
        return idcobertura;
    }

    public void setIdcobertura(Tipocobertura idcobertura) {
        this.idcobertura = idcobertura;
    }

    public Tipoestado getIdestado() {
        return idestado;
    }

    public void setIdestado(Tipoestado idestado) {
        this.idestado = idestado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpolizatabla != null ? idpolizatabla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Poliza)) {
            return false;
        }
        Poliza other = (Poliza) object;
        if ((this.idpolizatabla == null && other.idpolizatabla != null) || (this.idpolizatabla != null && !this.idpolizatabla.equals(other.idpolizatabla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Poliza[ idpolizatabla=" + idpolizatabla + " ]";
    }
    
}
