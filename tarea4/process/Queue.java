package edu.diego.arzate.torres.Modulo1.tarea4.process;

import edu.diego.arzate.torres.Modulo1.tarea4.utils.Lista;
import edu.diego.arzate.torres.Modulo1.tarea4.utils.ListaEnlazada;
import edu.diego.arzate.torres.Modulo1.tarea4.utils.Node;

import java.util.Optional;

public class Queue <E> {
    private final ListaEnlazada<E> ListaEnlazada= new ListaEnlazada<>();


    public Optional<E> peek() {
        if (ListaEnlazada.size()!=0) {
            return ListaEnlazada.get(0);
        }
        return Optional.empty();
    }

    public int size(){
        return ListaEnlazada.size();
    }


    public boolean isEmpty() {
        return (ListaEnlazada.size()==0);
    }
    public void offer(E element){
        ListaEnlazada.add(element);
    }
    public Optional<E> poll(){
        if (ListaEnlazada.size()!=0) {
            Optional<E> removedData = ListaEnlazada.get(0);
            ListaEnlazada.removeFirst();
            return removedData;
        }
        return Optional.empty();
    }
    public void inverse() {
        Stack pila = new Stack();

        while (ListaEnlazada.size() != 0) {
            pila.push(ListaEnlazada.getFirstNode().get().data);
            ListaEnlazada.removeFirst();
        }
        while (pila.size() != 0) {
            Optional<E> data = pila.pop();
            ListaEnlazada.add(data.get());
        }
    }
    public void showQueue(){
        ListaEnlazada.showList();
    }


}
