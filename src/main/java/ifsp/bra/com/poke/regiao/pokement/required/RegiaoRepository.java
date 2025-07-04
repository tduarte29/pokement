package ifsp.bra.com.poke.regiao.pokement.required;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifsp.bra.com.poke.regiao.pokement.Regiao;

// Porta Requerida: Interface de acesso a dados (Repository) do padrão PIC
@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Long> {
    Optional<Regiao> findByNome(String nome);
}
