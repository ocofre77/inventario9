/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Orlando
 */
@Entity
@Table(name = "producto_proveedor")
@NamedQueries({
    @NamedQuery(name = "ProductoProveedor.findAll", query = "SELECT p FROM ProductoProveedor p")
    , @NamedQuery(name = "Productos.findByProvId", query = "SELECT p FROM ProductoProveedor p WHERE p.provId = :ProvId")
})
@XmlRootElement
public class ProductoProveedor implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name="PROV_ID")
    private Integer provId;
    @Column(name="PROD_COD_PRO")
    private String proCodigopro;
    @Column(name="PROV_COD_PRO")
    private String provCodigoprov;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
   
    public Integer getProvId() {
        return provId;
    }

    public void setProvId(Integer provId) {
        this.provId = provId;
    }

    public String getProCodigopro() {
        return proCodigopro;
    }

    public void setProCodigopro(String proCodigopro) {
        this.proCodigopro = proCodigopro;
    }

    public String getProvCodigoprov() {
        return provCodigoprov;
    }

    public void setProvCodigoprov(String provCodigoprov) {
        this.provCodigoprov = provCodigoprov;
    }
    

}
