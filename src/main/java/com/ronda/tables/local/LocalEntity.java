package com.ronda.tables.local;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ronda.tables.utils.BaseEntity;


@Entity
@Table(name = "local")
@AttributeOverride(name = "id", column = @Column (name = "cod_local"))
public class LocalEntity extends BaseEntity<Long>{

	private static final long serialVersionUID = 1L;

	@Column(name = "marcacaorota", nullable = false)
	private String marcacaoRota; 
	
	@Column(name = "duracaoronda", nullable = false)
    private String duracaoRonda;
	
	@Column(name = "rota", nullable = false)
    private String rota;

	
	public LocalEntity(){
		
	}

	
	public LocalEntity(String marcacaoRota, String duracaoRonda, String rota) {
		super();
		this.marcacaoRota = marcacaoRota;
		this.duracaoRonda = duracaoRonda;
		this.rota = rota;
	}

	public String getMarcacaoRota() {
		return marcacaoRota;
	}

	public void setMarcacaoRota(String marcacaoRota) {
		this.marcacaoRota = marcacaoRota;
	}

	public String getDuracaoRonda() {
		return duracaoRonda;
	}

	public void setDuracaoRonda(String duracaoRonda) {
		this.duracaoRonda = duracaoRonda;
	}

	public String getRota() {
		return rota;
	}

	public void setRota(String rota) {
		this.rota = rota;
	}

}
