package br.com.treinaweb.springboot.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.treinaweb.springboot.entidades.Aluno;

public interface RepositorioAluno extends JpaRepository<Aluno, Long> {
	
	@Query("SELECT a FROM Aluno a WHERE a.instituicao.id = :id")
	List<Aluno> findByInstituicao(@Param("id") Long id);
	
	List<Aluno> findByNomeContaining(String nome);
}
