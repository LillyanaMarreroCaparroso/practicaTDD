import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
public class testContador {

    //Al incrementar el contador se suma al
    //valor actual el incremento y nos indican si se superó el límite.
        contador cont = new contador(0, 1, 1, 0);

        @Test
        public void testConstructor(){
            contador con = new contador(0, 1, 1, 0);
        }

        @Test
        public void testValorActual(){
            contador con = new contador(0, 1, 1, 0);
            assertEquals(0, con.getValorActual());
        }
        @Test
        public void testIncrementarContador(){
            contador con = new contador(0, 1, 1, 0);
            con.incrementarContador();
            assertEquals(1, con.getValorActual());
        }

        @Test
        public void testResetearContador(){
            contador con = new contador(0, 1, 1, 0);
            con.resetearContador();
            assertEquals(con.getValorInicial(), con.getValorActual());
        }
    }
