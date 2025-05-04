import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Tarea1");
        lista.add("Tarea2");
        lista.add("Tarea3");
        System.out.println("¿Contiene 'Tarea2'? " + EjerciciosGenericos.buscarElemento(lista, "Tarea2"));

        List<String> listaInvertida = EjerciciosGenericos.invertirLista(lista);
        System.out.println("Lista invertida: " + listaInvertida);

        Node<Integer> head = new Node<>(10);
        head = EjerciciosGenericos.insertarAlFinal(head, 20);
        head = EjerciciosGenericos.insertarAlFinal(head, 30);
        System.out.print("Lista enlazada después de insertar: ");
        imprimirLista(head);

        System.out.println("Cantidad de nodos: " + EjerciciosGenericos.contarNodos(head));

        Node<Integer> head2 = new Node<>(10);
        head2 = EjerciciosGenericos.insertarAlFinal(head2, 20);
        head2 = EjerciciosGenericos.insertarAlFinal(head2, 30);
        System.out.println("¿Las listas son iguales? " + EjerciciosGenericos.sonIguales(head, head2));

        Node<Integer> head3 = new Node<>(40);
        Node<Integer> listaConcatenada = EjerciciosGenericos.concatenarListas(head, head3);
        System.out.print("Lista concatenada: ");
        imprimirLista(listaConcatenada);
    }

    private static <T> void imprimirLista(Node<T> head) {
        Node<T> actual = head;
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        }
        System.out.println("null");
    }
}