package com.ronda.tables.ronda;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ronda.tables.utils.BaseEntity;

@Entity
@Table(name = "ronda")
@AttributeOverride(name = "id", column = @Column (name = "cod_ronda"))
public class RondaEntity extends BaseEntity<Long>{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "codfunc", nullable = false)
	private String codfunc; 
	
	@Column(name = "codlocal", nullable = false)
    private String codlocal;
	
	@Column(name = "diasTrabalho", nullable = false)
    private String diasTrabalho;

	public RondaEntity(){
		
	}
	
	public RondaEntity(String codfunc, String codlocal, String diasTrabalho) {
		super();
		this.codfunc = codfunc;
		this.codlocal = codlocal;
		this.diasTrabalho = diasTrabalho;
	}



	public String getCodfunc() {
		return codfunc;
	}

	public void setCodfunc(String codfunc) {
		this.codfunc = codfunc;
	}

	public String getCodlocal() {
		return codlocal;
	}

	public void setCodlocal(String codlocal) {
		this.codlocal = codlocal;
	}

	public String getDiasTrabalho() {
		return diasTrabalho;
	}

	public void setDiasTrabalho(String diasTrabalho) {
		this.diasTrabalho = diasTrabalho;
	}
	
	
}
