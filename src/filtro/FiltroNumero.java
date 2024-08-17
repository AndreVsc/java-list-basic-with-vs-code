package filtro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FiltroNumero {
    private List<Integer> numeros;

    public FiltroNumero() {
        this.numeros = new ArrayList<>();
    }

    public void ordenarAscendente() {
        numeros.sort(Comparator.naturalOrder());
        System.out.println("Ordenado em ordem ascendente: " + numeros);
    }

    public void ordenarDescendente() {
        numeros.sort(Comparator.reverseOrder());
        System.out.println("Ordenado em ordem descendente: " + numeros);
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }
}