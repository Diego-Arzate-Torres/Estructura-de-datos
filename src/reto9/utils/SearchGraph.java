package reto9.utils;

import reto9.utils.collections.grafo;

import java.util.*;
/**
 * Esta clase proporciona métodos estáticos para realizar búsquedas en un grafo.
 */
public class SearchGraph {
    /**
     * Realiza una búsqueda en anchura (BFS) en el grafo.
     * @param grafo El grafo en el que se realiza la búsqueda.
     * @param inicio El vértice de inicio de la búsqueda.
     * @param objetivo El vértice objetivo de la búsqueda.
     * @return El vértice objetivo si se encuentra, null en caso contrario.
     */
    public static vertice breadthFirstSearch(grafo grafo, String inicio, String objetivo) {
        Queue<vertice> queue = new LinkedList<>();
        Set<vertice> visited = new HashSet<>();

        vertice start = grafo.getVertice(inicio);
        queue.add(start);

        while (!queue.isEmpty()) {
            vertice current = queue.poll();
            visited.add(current);

            if (current.getNombre().equals(objetivo)) {
                return current;
            }

            for (vertice neighbor : current.getVecinos()) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                }
            }
        }

        return null;  // Retorna null si no se encuentra el objeto
    }
    /**
     * Realiza una búsqueda en profundidad (DFS) en el grafo.
     * @param grafo El grafo en el que se realiza la búsqueda.
     * @param inicio El vértice de inicio de la búsqueda.
     * @param objetivo El vértice objetivo de la búsqueda.
     * @return El vértice objetivo si se encuentra, null en caso contrario.
     */
    public static vertice deepFirstSearch(grafo grafo, String inicio, String objetivo) {
        Stack<vertice> stack = new Stack<>();
        Set<vertice> visited = new HashSet<>();

        vertice start = grafo.getVertice(inicio);
        stack.push(start);

        while (!stack.isEmpty()) {
            vertice current = stack.pop();
            visited.add(current);

            if (current.getNombre().equals(objetivo)) {
                return current;
            }

            for (vertice neighbor : current.getVecinos()) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                }
            }
        }

        return null;  // Retorna null si no se encuentra el objeto
    }
}