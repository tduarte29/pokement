package ifsp.bra.com.poke.regiao.pokement;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import ifsp.bra.com.poke.regiao.pokement.required.RegiaoRepository;

@DataJpaTest
class RegiaoRepositoryIntegrationTest {

    @Autowired
    RegiaoRepository regiaoRepository;

    @Test
    void testSaveAndFindByNome() {
        Regiao regiao = new Regiao("Kalos", "Sexta região", 6);
        regiaoRepository.save(regiao);

        Optional<Regiao> found = regiaoRepository.findByNome("Kalos");
        assertTrue(found.isPresent());
        assertEquals("Kalos", found.get().getNome());
    }

    @Test
    void testFindById() {
        Regiao regiao = new Regiao("Unova", "Quinta região", 5);
        regiao = regiaoRepository.save(regiao);

        Optional<Regiao> found = regiaoRepository.findById(regiao.getId());
        assertTrue(found.isPresent());
        assertEquals("Unova", found.get().getNome());
    }

    @Test
    void testFindAll() {
        regiaoRepository.save(new Regiao("Alola", "Sétima região", 7));
        regiaoRepository.save(new Regiao("Galar", "Oitava região", 8));

        List<Regiao> all = regiaoRepository.findAll();
        assertTrue(all.size() >= 2);
    }

    @Test
    void testDeleteById() {
        Regiao regiao = new Regiao("Paldea", "Nona região", 9);
        regiao = regiaoRepository.save(regiao);

        regiaoRepository.deleteById(regiao.getId());
        Optional<Regiao> found = regiaoRepository.findById(regiao.getId());
        assertFalse(found.isPresent());
    }
}
