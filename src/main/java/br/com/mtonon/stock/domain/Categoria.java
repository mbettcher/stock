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

@Entity(name = "categoria")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cat_codigo")
	private Integer id;
	
	@Column(name = "cat_descricao", nullable = false, unique = true)
	private String nome;
	
	@Column(name = "cat_ativo", columnDefinition = "BOOLEAN")
	private boolean ativo;
	
	@Column(name = "cat_data_cadastro")
	private LocalDateTime dataCadastro;
	
}
