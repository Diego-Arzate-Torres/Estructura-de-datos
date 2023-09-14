package edu.diego.arzate.torres.Modulo1.tarea2.utils;

import edu.diego.arzate.torres.Modulo1.tarea2.boletos.listaEnlazadaBoletos;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class listaEnlazadaBoletosTestBoletos {

    @Test
    public void add1ElementTest(){
        listaEnlazadaBoletos lista = new listaEnlazadaBoletos();
        lista.add(5);
        Assert.assertEquals(Optional.of(5),lista.get(0));
        Assert.assertEquals(1,lista.size());
    }

    @Test
    public void add2Element2Test(){
        listaEnlazadaBoletos lista = new listaEnlazadaBoletos();
        lista.add(5);
        lista.add(78);
        Assert.assertEquals(Optional.of(5),lista.get(0));
        Assert.assertEquals(Optional.of(78),lista.get(1));
        Assert.assertEquals(2,lista.size());
    }
    @Test
    public void getNegativeIndexTest(){
        listaEnlazadaBoletos lista = new listaEnlazadaBoletos();
        lista.add(5);
        Assert.assertThrows(IndexOutOfBoundsException.class,()->lista.get(-1));
        Assert.assertEquals(1,lista.size());
    }

    @Test
    public void getIndexOutOfBoundsTest(){
        listaEnlazadaBoletos lista = new listaEnlazadaBoletos();
        lista.add(5);
        Assert.assertThrows(IndexOutOfBoundsException.class,()->lista.get(1));
        Assert.assertEquals(1,lista.size());
    }

    @Test
    public void containsElementsTest(){
        listaEnlazadaBoletos lista = new listaEnlazadaBoletos();
        lista.add(5);
        lista.add(78);
        Assert.assertTrue(lista.contains(78));
        Assert.assertTrue(lista.contains(5));
        Assert.assertEquals(2,lista.size());
    }

    @Test
    public void containsNotPResentElementsTest(){
        listaEnlazadaBoletos lista = new listaEnlazadaBoletos();
        lista.add(5);
        lista.add(78);
        Assert.assertFalse(lista.contains(79));
    }

    @Test
    public void updateTest(){
        listaEnlazadaBoletos lista = new listaEnlazadaBoletos();
        lista.add(5);
        lista.update(5,78);
        Assert.assertFalse(lista.contains(5));
        Assert.assertTrue(lista.contains(78));
    }


    @Test
    public void removeEmptyTest(){
        listaEnlazadaBoletos lista = new listaEnlazadaBoletos();
        lista.remove(5);
        Assert.assertEquals(0,lista.size());
    }
    @Test
    public void removeRootTest(){
        listaEnlazadaBoletos lista = new listaEnlazadaBoletos();
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
        listaEnlazadaBoletos lista = new listaEnlazadaBoletos();
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
        listaEnlazadaBoletos lista = new listaEnlazadaBoletos();
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
