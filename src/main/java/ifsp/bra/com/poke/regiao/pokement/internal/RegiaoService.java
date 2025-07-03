package ifsp.bra.com.poke.regiao.pokement.internal;

import java.util.List;
import java.util.Optional;

import ifsp.bra.com.poke.regiao.pokement.Regiao;
import ifsp.bra.com.poke.regiao.pokement.provided.RegiaoServiceInterface;
import ifsp.bra.com.poke.regiao.pokement.required.RegiaoRepository;

public class RegiaoService implements RegiaoServiceInterface {

    private final RegiaoRepository regiaoRepository;

    // DIP: depende apenas da abstração (interface RegiaoRepository)
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
