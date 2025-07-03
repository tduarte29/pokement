package ifsp.bra.com.poke.regiao.pokement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class RegiaoTest {

    @Test
    void testEqualsAndHashCode() {
        Regiao r1 = new Regiao("Kanto", "Primeira região", 1);
        r1.setId(1L);
        Regiao r2 = new Regiao("Kanto", "Primeira região", 1);
        r2.setId(1L);

        assertEquals(r1, r2);
        assertEquals(r1.hashCode(), r2.hashCode());
    }

    @Test
    void testNotEquals() {
        Regiao r1 = new Regiao("Kanto", "Primeira região", 1);
        r1.setId(1L);
        Regiao r2 = new Regiao("Johto", "Segunda região", 2);
        r2.setId(2L);

        assertNotEquals(r1, r2);
    }

    @Test
    void testToString() {
        Regiao r = new Regiao("Johto", "Segunda região", 2);
        r.setId(2L);
        String str = r.toString();
        assertTrue(str.contains("Johto"));
        assertTrue(str.contains("Segunda região"));
        assertTrue(str.contains("2"));
    }
}
