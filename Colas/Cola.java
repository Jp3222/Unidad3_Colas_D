package Colas;

public class Cola {

    private Nodo inicio, fin;
    private int size;

    public Cola() {
        this.inicio = null;
        this.fin = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void enqueue(int d) {
        Nodo nuevo = new Nodo(d);
        if (isEmpty()) {
            inicio = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        size++;
    }

    public int dequeue() {
        int aux = inicio.datos;
        inicio = inicio.siguiente;
        size--;
        return aux;
    }

    public int first() {
        return inicio.datos;
    }

    public int last() {
        return fin.datos;
    }

    public int size() {
        return size;

    }

    //Mostrar la cola
    public void show() {
        Nodo R = inicio;
        while (R != null) {
            System.out.print("[" + R.datos + "]");
            R = R.siguiente;
        }
        System.out.println("");

    }
}
