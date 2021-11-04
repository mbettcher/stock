package br.com.mtonon.stock.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "unidade")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Unidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "uni_codigo")
	private Integer id;
	
	@Column(name = "uni_descricao", nullable = false, unique = true)
	private String nome;
	
	@Column(name = "uni_sigla", nullable = false, unique = true)
	private String sigla;
	
	@Column(name = "uni_ativo", columnDefinition = "BOOLEAN")
	private boolean ativo;
	
	@Column(name = "uni_data_cadastro")
	private LocalDateTime dataCatastro;

}
