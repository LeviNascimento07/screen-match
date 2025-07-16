package br.com.alura.screenmatch.repository;

import br.com.alura.screenmatch.model.Categoria;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface SerieRepository extends JpaRepository<Serie, Long> {

   Optional<Serie> findByTituloContainingIgnoreCase(String nomeSerie);

   List<Serie> findByGenero(Categoria categoria);

   @Query("select s from Serie s where s.totalTemporadas <= :totalTemporadas and s.avaliacao >= :avaliacao")
   List<Serie> seriesPorTemporadaAvaliacao(int totalTemporadas, double avaliacao);

   @Query("SELECT e FROM Serie s JOIN s.episodios e WHERE e.titulo ILIKE %:trechoEpisodio%")
   List<Episodio> episodiosPorTrecho(String trechoEpisodio);

   List<Serie> findTop5ByOrderByAvaliacaoDesc();

   @Query("select s from Serie s " +
           "join s.episodios e  " +
           "group by s " +
           "order by max(e.dataEpisodio) desc limit 5 ")
   List<Serie> lancamentoMaisRecente();

   @Query("SELECT e FROM Serie s JOIN s.episodios e WHERE s.id = :id AND e.temporada = :numero")
   List<Episodio> obterEpisodiosPorTemporada(Long id, Long numero);
}



