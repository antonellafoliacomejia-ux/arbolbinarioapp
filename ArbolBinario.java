// Clase ArbolBinario: contiene los métodos del árbol
public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Insertar un número en el árbol
    public void insertar(int dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    private Nodo insertarRecursivo(Nodo actual, int dato) {
        if (actual == null) {
            return new Nodo(dato);
        }

        if (dato < actual.dato) {
            actual.izquierda = insertarRecursivo(actual.izquierda, dato);
        } else if (dato > actual.dato) {
            actual.derecha = insertarRecursivo(actual.derecha, dato);
        }
        return actual;
    }

    // Recorrido Inorden (izquierda - raíz - derecha)
    public void mostrarInorden() {
        System.out.print("Recorrido inorden: ");
        mostrarInordenRecursivo(raiz);
        System.out.println();
    }

    private void mostrarInordenRecursivo(Nodo actual) {
        if (actual != null) {
            mostrarInordenRecursivo(actual.izquierda);
            System.out.print(actual.dato + " ");
            mostrarInordenRecursivo(actual.derecha);
        }
    }

    // Buscar un número en el árbol
    public boolean buscar(int dato) {
        return buscarRecursivo(raiz, dato);
    }

    private boolean buscarRecursivo(Nodo actual, int dato) {
        if (actual == null) {
            return false;
        }
        if (actual.dato == dato) {
            return true;
        }
        return dato < actual.dato
                ? buscarRecursivo(actual.izquierda, dato)
                : buscarRecursivo(actual.derecha, dato);
    }
}
