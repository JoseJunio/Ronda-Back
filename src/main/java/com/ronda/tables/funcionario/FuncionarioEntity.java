package com.ronda.tables.funcionario;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.ronda.tables.utils.BaseEntity;

@Entity
@Table(name = "funcionario")
@AttributeOverride(name = "id", column = @Column (name = "cod_func"))
public class FuncionarioEntity extends BaseEntity<Long>{
	
	private static final long serialVersionUID = 1L;
	
	/*@Column(name = "nome_cidade", nullable = false)
	private Integer id;*/
	/*@Column(name = "codfunc", nullable = false)
    private String codigo;*/
	@Column(name = "nomefunc", nullable = false)
    private String name;
	
	@Column(name = "cargo", nullable = false)
    private String cargo;
	
	@Column(name = "empresa", nullable = false)
    private String empresa;
	
	@Column(name = "horario_inicio", nullable = false)
    private String horarioInicio;
	
	@Column(name = "horario_fim", nullable = false)
    private String horarioFim;
	
	@Column(name = "contrato", nullable = false)
    private Integer contrato;
	
	@Column(name = "usuario", nullable = false)
    private String usuario;
	
	@Column(name = "senha", nullable = false)
    private String senha;
	
	@Column(name = "ativo", nullable = false)
    private String ativo;
	
	@Column(name = "latitude", nullable = false)
    private String latitude;
	
	@Column(name = "longitude", nullable = false)
    private String longitude;
	
	public FuncionarioEntity(){
		
		
	}
	
	public FuncionarioEntity(String name, String cargo, String empresa, String horarioInicio, String horarioFim,
			Integer contrato, String usuario, String senha, String ativo, String latitude, String longitude) {
		super();
		this.name = name;
		this.cargo = cargo;
		this.empresa = empresa;
		this.horarioInicio = horarioInicio;
		this.horarioFim = horarioFim;
		this.contrato = contrato;
		this.usuario = usuario;
		this.senha = senha;
		this.ativo = ativo;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getHorarioInicio() {
		return horarioInicio;
	}
	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
	public String getHorarioFim() {
		return horarioFim;
	}
	public void setHorarioFim(String horarioFim) {
		this.horarioFim = horarioFim;
	}
	public Integer getContrato() {
		return contrato;
	}
	public void setContrato(Integer contrato) {
		this.contrato = contrato;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
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
