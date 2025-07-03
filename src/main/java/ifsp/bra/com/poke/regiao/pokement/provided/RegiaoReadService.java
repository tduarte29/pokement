package ifsp.bra.com.poke.regiao.pokement.provided;

import java.util.List;
import java.util.Optional;

import ifsp.bra.com.poke.regiao.pokement.Regiao;

/**
 * Responsável apenas por operações de leitura de Regiao.
 */
public interface RegiaoReadService {
    List<Regiao> findAll();
    Optional<Regiao> findById(Long id);
    Optional<Regiao> findByNome(String nome);
}
