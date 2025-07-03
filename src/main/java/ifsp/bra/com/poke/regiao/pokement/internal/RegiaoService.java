package ifsp.bra.com.poke.regiao.pokement.internal;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifsp.bra.com.poke.regiao.pokement.Regiao;
import ifsp.bra.com.poke.regiao.pokement.provided.RegiaoServiceInterface;
import ifsp.bra.com.poke.regiao.pokement.required.RegiaoRepository;

@Service
public class RegiaoService implements RegiaoServiceInterface {

    private final RegiaoRepository regiaoRepository;

    
    @Autowired
    public RegiaoService(RegiaoRepository regiaoRepository) {
        this.regiaoRepository = regiaoRepository;
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
