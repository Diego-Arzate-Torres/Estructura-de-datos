package reto9.utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import reto9.utils.collections.grafo;
import reto9.utils.vertice;
/**
 * Esta clase contiene pruebas unitarias para los métodos de búsqueda en anchura y profundidad.
 */
public class test {
    /**
     * El grafo sobre el que se realizan las pruebas.
     */
    private grafo grafo;
    /**
     * Método que se ejecuta antes de cada prueba. Inicializa el grafo y agrega vértices y aristas.
     */
    @Before
    public void init() {
        final double PESO_NEUTRO = 0;
        grafo = new grafo();
        // nombres de vertices
        final String CINCO = "5";
        final String CUATRO = "4";
        final String TRES = "3";
        final String OCHO = "8";
        final String QUINCE = "15";
        final String DIEZ = "10";
        final String NUEVE = "9";
        // agregar vertices
        grafo.addVertice(CINCO);
        grafo.addVertice(CUATRO);
        grafo.addVertice(TRES);
        grafo.addVertice(OCHO);
        grafo.addVertice(QUINCE);
        grafo.addVertice(DIEZ);
        grafo.addVertice(NUEVE);

        // agregar aristas
        grafo.addArista(CINCO,OCHO,PESO_NEUTRO);
        grafo.addArista(OCHO,CINCO,PESO_NEUTRO);

        grafo.addArista(CINCO,CUATRO,PESO_NEUTRO);
        grafo.addArista(CUATRO,CINCO,PESO_NEUTRO);

        grafo.addArista(CUATRO,OCHO,PESO_NEUTRO);
        grafo.addArista(OCHO,CUATRO,PESO_NEUTRO);

        grafo.addArista(CUATRO,TRES,PESO_NEUTRO);
        grafo.addArista(TRES,CUATRO,PESO_NEUTRO);

        grafo.addArista(TRES,OCHO,PESO_NEUTRO);
        grafo.addArista(OCHO,TRES,PESO_NEUTRO);

        grafo.addArista(TRES,DIEZ,PESO_NEUTRO);
        grafo.addArista(DIEZ,TRES,PESO_NEUTRO);

        grafo.addArista(OCHO,QUINCE,PESO_NEUTRO);
        grafo.addArista(QUINCE,OCHO,PESO_NEUTRO);

        grafo.addArista(QUINCE,NUEVE,PESO_NEUTRO);
        grafo.addArista(NUEVE,QUINCE,PESO_NEUTRO);

        grafo.addArista(NUEVE,DIEZ,PESO_NEUTRO);
        grafo.addArista(DIEZ,NUEVE,PESO_NEUTRO);

    }
    /**
     * Prueba el método de búsqueda en anchura con un objetivo que está en el grafo.
     */
    @Test
    public void testBreadthFirstSuccess(){
        System.out.println("TEST: BreadthFirstSuccess");
        vertice target = new vertice("10");
        assertEquals(SearchGraph.breadthFirstSearch(grafo,"5","10"),target);
        System.out.println("................................");
    }
    /**
     * Prueba el método de búsqueda en anchura con un objetivo que no está en el grafo.
     */
    @Test
    public void testBreadthFirstFail(){
        System.out.println("TEST: BreadthFirstFail");
        vertice target = new vertice("10");
        assertNotEquals(SearchGraph.breadthFirstSearch(grafo,"5","20"),target);
        System.out.println("................................");
    }
    /**
     * Prueba el método de búsqueda en profundidad con un objetivo que está en el grafo.
     */
    @Test
    public void testDeepFirstSuccess(){
        System.out.println("TEST: DeepFirstSuccess");
        vertice target = new vertice("10");
        assertEquals(SearchGraph.deepFirstSearch(grafo,"5","10"),target);
        System.out.println("................................");
    }
    /**
     * Prueba el método de búsqueda en profundidad con un objetivo que no está en el grafo.
     */
    @Test
    public void testDeepFirstFail(){
        System.out.println("TEST: DeepFirstFail");
        vertice target = new vertice("10");
        assertNotEquals(SearchGraph.deepFirstSearch(grafo,"5","20"),target);
        System.out.println("................................");
    }
}
