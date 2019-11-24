/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DEV
 */
@Entity
@Table(name = "demo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Demo.findAll", query = "SELECT d FROM Demo d"),
    @NamedQuery(name = "Demo.findByIddemo", query = "SELECT d FROM Demo d WHERE d.iddemo = :iddemo"),
    @NamedQuery(name = "Demo.findByNombre", query = "SELECT d FROM Demo d WHERE d.nombre = :nombre")})
public class Demo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "iddemo")
    private Integer iddemo;
    @Column(name = "nombre")
    private String nombre;

    public Demo() {
    }

    public Demo(Integer iddemo) {
        this.iddemo = iddemo;
    }

    public Integer getIddemo() {
        return iddemo;
    }

    public void setIddemo(Integer iddemo) {
        this.iddemo = iddemo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddemo != null ? iddemo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Demo)) {
            return false;
        }
        Demo other = (Demo) object;
        if ((this.iddemo == null && other.iddemo != null) || (this.iddemo != null && !this.iddemo.equals(other.iddemo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Demo[ iddemo=" + iddemo + " ]";
    }
    
}
