package ifsp.bra.com.poke.regiao.pokement;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import ifsp.bra.com.poke.regiao.pokement.internal.RegiaoService;
import ifsp.bra.com.poke.regiao.pokement.provided.RegiaoServiceInterface;
import ifsp.bra.com.poke.regiao.pokement.required.RegiaoRepository;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class RegiaoServiceTest {

    @Test
    void testFindById() {
        RegiaoRepository repoMock = mock(RegiaoRepository.class);
        RegiaoServiceInterface service = new RegiaoService(repoMock);

        Regiao regiao = new Regiao("Kanto", "Primeira região", 1);
        regiao.setId(1L);
        when(repoMock.findById(1L)).thenReturn(Optional.of(regiao));

        Optional<Regiao> result = service.findById(1L);

        assertTrue(result.isPresent());
        assertEquals("Kanto", result.get().getNome());
        verify(repoMock, times(1)).findById(1L);
    }

    @Test
    void testFindByIdNotFound() {
        RegiaoRepository repoMock = mock(RegiaoRepository.class);
        RegiaoServiceInterface service = new RegiaoService(repoMock);

        when(repoMock.findById(99L)).thenReturn(Optional.empty());

        Optional<Regiao> result = service.findById(99L);

        assertFalse(result.isPresent());
        verify(repoMock, times(1)).findById(99L);
    }

    @Test
    void testFindAll() {
        RegiaoRepository repoMock = mock(RegiaoRepository.class);
        RegiaoServiceInterface service = new RegiaoService(repoMock);

        Regiao r1 = new Regiao("Kanto", "Primeira região", 1);
        Regiao r2 = new Regiao("Johto", "Segunda região", 2);
        when(repoMock.findAll()).thenReturn(List.of(r1, r2));

        List<Regiao> result = service.findAll();

        assertEquals(2, result.size());
        assertEquals("Kanto", result.get(0).getNome());
        verify(repoMock, times(1)).findAll();
    }

    @Test
    void testSave() {
        RegiaoRepository repoMock = mock(RegiaoRepository.class);
        RegiaoServiceInterface service = new RegiaoService(repoMock);

        Regiao regiao = new Regiao("Hoenn", "Terceira região", 3);
        when(repoMock.save(regiao)).thenReturn(regiao);

        Regiao saved = service.save(regiao);

        assertEquals("Hoenn", saved.getNome());
        verify(repoMock, times(1)).save(regiao);
    }

    @Test
    void testDeleteById() {
        RegiaoRepository repoMock = mock(RegiaoRepository.class);
        RegiaoServiceInterface service = new RegiaoService(repoMock);

        service.deleteById(10L);

        verify(repoMock, times(1)).deleteById(10L);
    }

    @Test
    void testFindByNome() {
        RegiaoRepository repoMock = mock(RegiaoRepository.class);
        RegiaoServiceInterface service = new RegiaoService(repoMock);

        Regiao regiao = new Regiao("Sinnoh", "Quarta região", 4);
        when(repoMock.findByNome("Sinnoh")).thenReturn(Optional.of(regiao));

        Optional<Regiao> result = service.findByNome("Sinnoh");

        assertTrue(result.isPresent());
        assertEquals("Sinnoh", result.get().getNome());
        verify(repoMock, times(1)).findByNome("Sinnoh");
    }
}
