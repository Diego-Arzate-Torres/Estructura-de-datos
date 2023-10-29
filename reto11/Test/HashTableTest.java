package modulo3.reto11.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import modulo3.reto11.utils.collections.HashTable;

import java.util.ArrayList;


public class HashTableTest {
    @Test
    public void testIsEmpty() {
       HashTable<String, Integer> hashtable = new HashTable<>(10);
       assertTrue(hashtable.isEmpty());
       hashtable.add("Cuatro", 4);
       assertFalse(hashtable.isEmpty());
    }

    @Test
    public void testAddAndSize() {
        HashTable<String, Integer> hashtable= new HashTable<>(10);
        hashtable.add("cuatro", 4);
        hashtable.add("cinco", 5);
        hashtable.add("seis", 6);
        assertEquals(3, hashtable.size());
    }

    @Test
    public void testGetByKey() {
        HashTable<String, Integer> hashtable = new HashTable<>(10);
        hashtable.add("do", 2);
        ArrayList<Integer> expectedValuesForKeyDos = new ArrayList<>();
        expectedValuesForKeyDos.add(2);
        assertEquals(expectedValuesForKeyDos, hashtable.getByKey("do"));
    }

    @Test
    public void testGetValues() {
        HashTable<String, Integer> hashtable = new HashTable<>(10);
        hashtable.add("Pepe", 1);
        hashtable.add("Juan", 2);
        hashtable.add("Pedro", 3);
        ArrayList<Integer> ExpectedValues = new ArrayList<>();
        ExpectedValues.add(1);
        ExpectedValues.add(2);
        ExpectedValues.add(3);
        assertTrue(hashtable.getValues().containsAll(ExpectedValues) &&ExpectedValues.containsAll(hashtable.getValues()));
    }
}
