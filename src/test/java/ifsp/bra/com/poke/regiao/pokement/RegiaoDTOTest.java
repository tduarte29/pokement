package ifsp.bra.com.poke.regiao.pokement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class RegiaoDTOTest {

    @Test
    void testToDTO() {
        Regiao regiao = new Regiao("Kanto", "Primeira região", 1);
        regiao.setId(1L);

        RegiaoDTO dto = RegiaoDTO.toDTO(regiao);

        assertEquals(1L, dto.getId());
        assertEquals("Kanto", dto.getNome());
        assertEquals("Primeira região", dto.getDescricao());
    }

    @Test
    void testToDTOWithNull() {
        RegiaoDTO dto = RegiaoDTO.toDTO(null);
        assertNull(dto);
    }
}
