import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NadadorTest.
 *
 * @author  Nícolas Jardin e Gustavo James
 * @version 1.0
 * @since 01/06/2020 - 9:57
 */
public class NadadorTest {
    
    private Nadador nadador = new Nadador();
    
    /**
     * Default constructor for test class NadadorTest
     */
    public NadadorTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        nadador.setIdade(4);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }
    
    /**
     * 1° Teste com idade 4
     * 2° Teste com idade 8
     * 3° Teste com idade 11
     * 4° Teste com idade 18
     * 5° Teste com idade 0
     */
    @Test
    public void testClassificarCategoria() {
        assertEquals("Não pode ser nadador. mínimo oito anos.", nadador.classificarCategoria());
        nadador.setIdade(8);
        assertEquals("Infantil", nadador.classificarCategoria());
        nadador.setIdade(11);
        assertEquals("Juvenil", nadador.classificarCategoria());
        nadador.setIdade(18);
        assertEquals("Adulto", nadador.classificarCategoria());
        nadador.setIdade(0);
        assertEquals("Idade inválida", nadador.classificarCategoria());
    }
}
