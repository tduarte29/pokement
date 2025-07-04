package ifsp.bra.com.poke.regiao.pokement.internal;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ifsp.bra.com.poke.regiao.pokement.Regiao;
import ifsp.bra.com.poke.regiao.pokement.provided.RegiaoServiceInterface;
import ifsp.bra.com.poke.regiao.pokement.required.RegiaoRepository;
import io.github.lifveras.bredeco_pic_abstract.provided.InterfacePort;

/**
 * Implementação concreta do serviço de Região.
 * Porta Interna: Implementa a interface provida (porta de entrada do componente).
 * Estende InterfacePort do PIC.
 */
@Service
public class RegiaoService extends InterfacePort implements RegiaoServiceInterface {
    private final RegiaoRepository regiaoRepository;

    public RegiaoService(RegiaoRepository regiaoRepository) {
        this.regiaoRepository = regiaoRepository;
    }

    @Override
    public void initialize() {
    
    }

    @Override
    public List<Regiao> findAll() {
        return regiaoRepository.findAll();
    }

    @Override
    public Optional<Regiao> findById(Long id) {
        return regiaoRepository.findById(id);
    }

    @Override
    public Optional<Regiao> findByNome(String nome) {
        return regiaoRepository.findByNome(nome);
    }

    @Override
    public Regiao save(Regiao regiao) {
        return regiaoRepository.save(regiao);
    }

    @Override
    public void deleteById(Long id) {
        regiaoRepository.deleteById(id);
    }
}
