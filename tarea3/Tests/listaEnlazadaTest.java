package edu.diego.arzate.torres.Modulo1.tarea3.Tests;

import edu.diego.arzate.torres.Modulo1.tarea2.futbol.ListaEnlazada;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class listaEnlazadaTest {

    @Test
    public void add1ElementTest(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(5);
        Assert.assertEquals(Optional.of(5),lista.get(0));
        Assert.assertEquals(1,lista.size());
    }

    @Test
    public void add2Element2Test(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(5);
        lista.add(78);
        Assert.assertEquals(Optional.of(5),lista.get(0));
        Assert.assertEquals(Optional.of(78),lista.get(1));
        Assert.assertEquals(2,lista.size());
    }
    @Test
    public void getNegativeIndexTest(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(5);
        Assert.assertThrows(IndexOutOfBoundsException.class,()->lista.get(-1));
        Assert.assertEquals(1,lista.size());
    }

    @Test
    public void getIndexOutOfBoundsTest(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(5);
        Assert.assertThrows(IndexOutOfBoundsException.class,()->lista.get(1));
        Assert.assertEquals(1,lista.size());
    }

    @Test
    public void containsElementsTest(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(5);
        lista.add(78);
        Assert.assertTrue(lista.contains(78));
        Assert.assertTrue(lista.contains(5));
        Assert.assertEquals(2,lista.size());
    }

    @Test
    public void containsNotPResentElementsTest(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(5);
        lista.add(78);
        Assert.assertFalse(lista.contains(79));
    }

    @Test
    public void updateTest(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(5);
        lista.update(5,78);
        Assert.assertFalse(lista.contains(5));
        Assert.assertTrue(lista.contains(78));
    }


    @Test
    public void removeEmptyTest(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.remove(5);
        Assert.assertEquals(0,lista.size());
    }
    @Test
    public void removeRootTest(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(5);
        lista.add(78);
        lista.add(105);
        lista.remove(5);
        Assert.assertTrue(lista.contains(78));
        Assert.assertTrue(lista.contains(105));
        Assert.assertFalse(lista.contains(5));
        Assert.assertEquals(2,lista.size());
    }
    @Test
    public void removeMiddleTest(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(5);
        lista.add(78);
        lista.add(105);
        lista.remove(78);
        Assert.assertTrue(lista.contains(5));
        Assert.assertTrue(lista.contains(105));
        Assert.assertFalse(lista.contains(78));
        Assert.assertEquals(2,lista.size());
    }
    @Test
    public void removeLastTest(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(5);
        lista.add(78);
        lista.add(105);
        lista.remove(105);
        Assert.assertTrue(lista.contains(5));
        Assert.assertTrue(lista.contains(78));
        Assert.assertFalse(lista.contains(105));
        Assert.assertEquals(2,lista.size());
    }
}
