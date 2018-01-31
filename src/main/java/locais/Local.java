/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locais;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author José_Junio
 */
@Entity
@Table(name = "locais", schema = "public")
public class Local implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String marcacaoRota; 
    private String tempoPermanencia;
    private String inicioRonda;
    private String latitude;
    private String longitude;
    
    public Local(){
        
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarcacaoRota() {
        return marcacaoRota;
    }

    public void setMarcacaoRota(String marcacaoRota) {
        this.marcacaoRota = marcacaoRota;
    }

    public String getTempoPermanencia() {
        return tempoPermanencia;
    }

    public void setTempoPermanencia(String tempoPermanencia) {
        this.tempoPermanencia = tempoPermanencia;
    }

    public String getInicioRonda() {
        return inicioRonda;
    }

    public void setInicioRonda(String inicioRonda) {
        this.inicioRonda = inicioRonda;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    
    
    
}
