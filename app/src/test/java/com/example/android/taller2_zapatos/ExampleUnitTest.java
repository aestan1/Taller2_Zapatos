package com.example.android.taller2_zapatos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    //HOMBRE
    //ZAPATILLAS
    @Test
    public void HombresZapatillaNike(){
        double vEsperado=120000;
        double vReal=Metodos.calcular(1,1,1,1);

        assertEquals(vEsperado,vReal, 0);
    }

    @Test
    public void HombresZapatillaAdidas(){
        double vEsperado=140000;
        double vReal=Metodos.calcular(1,1,2,1);

        assertEquals(vEsperado,vReal, 0);
    }
    @Test
    public void HombresZapatillaPuma(){
        double vEsperado=130000;
        double vReal=Metodos.calcular(1,1,3,1);

        assertEquals(vEsperado,vReal, 0);
    }


    //CLASICOS
    @Test
    public void HombresClasicoNike(){
        double vEsperado=50000;
        double vReal=Metodos.calcular(1,2,1,1);

        assertEquals(vEsperado,vReal, 0);
    }

    @Test
    public void HombresClasicoAdidas(){
        double vEsperado=80000;
        double vReal=Metodos.calcular(1,2,2,1);

        assertEquals(vEsperado,vReal, 0);
    }
    @Test
    public void HombresClasicoPuma(){
        double vEsperado=100000;
        double vReal=Metodos.calcular(1,2,3,1);

        assertEquals(vEsperado,vReal, 0);
    }



    //MUJER
    //ZAPATILLAS
    @Test
    public void MujerZapatillaNike(){
        double vEsperado=100000;
        double vReal=Metodos.calcular(2,1,1,1);

        assertEquals(vEsperado,vReal, 0);
    }

    @Test
    public void MujerZapatillaAdidas(){
        double vEsperado=130000;
        double vReal=Metodos.calcular(2,1,2,1);

        assertEquals(vEsperado,vReal, 0);
    }
    @Test
    public void MujerZapatillaPuma(){
        double vEsperado=110000;
        double vReal=Metodos.calcular(2,1,3,1);

        assertEquals(vEsperado,vReal, 0);
    }


    //CLASICOS
    @Test
    public void MujerClasicoNike(){
        double vEsperado=60000;
        double vReal=Metodos.calcular(2,2,1,1);

        assertEquals(vEsperado,vReal, 0);
    }

    @Test
    public void MujerClasicoAdidas(){
        double vEsperado=70000;
        double vReal=Metodos.calcular(2,2,2,1);

        assertEquals(vEsperado,vReal, 0);
    }
    @Test
    public void MujerClasicoPuma(){
        double vEsperado=120000;
        double vReal=Metodos.calcular(2,2,3,1);

        assertEquals(vEsperado,vReal, 0);
    }
}