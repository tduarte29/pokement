package ifsp.bra.com.poke.regiao.pokement.provided;

import java.util.List;
import java.util.Optional;

import ifsp.bra.com.poke.regiao.pokement.Regiao;

/**
 * Porta Provida: Interface pública do componente Região (PIC/Beyond).
 * Define os serviços expostos para uso externo.
 */
public interface RegiaoServiceInterface {
    void initialize();
    List<Regiao> findAll();
    Optional<Regiao> findById(Long id);
    Optional<Regiao> findByNome(String nome);
    Regiao save(Regiao regiao);
    void deleteById(Long id);
}
