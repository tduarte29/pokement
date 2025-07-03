package ifsp.bra.com.poke.regiao.pokement.provided;

import ifsp.bra.com.poke.regiao.pokement.Regiao;


public interface RegiaoWriteService {
    Regiao save(Regiao regiao);
    void deleteById(Long id);
}
