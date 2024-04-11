package clases;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Matriz {

    private List<LinkedList<Nodo>> matriz;

    public Matriz(int filas, int columnas) {
        matriz = new ArrayList<>(filas);
        for (int i = 0; i < filas; i++) {
            matriz.add(new LinkedList<>());
        }
    }

    public void insertar(int fila, int columna, Nodo nodo) {
        matriz.get(fila).add(columna, nodo);
    }

    public Nodo buscar(int fila, int columna) {
        return matriz.get(fila).get(columna);
    }

    public void eliminar(int fila, int columna) {
        matriz.get(fila).remove(columna);
    }

    public void imprimir() {
        for (LinkedList<Nodo> fila : matriz) {
        	System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            for (Nodo nodo : fila) {
                System.out.print(nodo.imprimirParqueo() + " ");
            }
            System.out.println();
        }
        System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }
}