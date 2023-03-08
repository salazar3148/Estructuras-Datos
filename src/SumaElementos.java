import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SumaElementos {
    public static void main(String[] args) {
        int[] lista = {1, 3, 7};
        System.out.println(sumaElementos(lista, 8));
        System.out.println(sumaElementos(lista, 6));
    }

    public static String sumaElementos(int[] enteros, int k){
        Set<Integer> set = new HashSet();
        for(int i = 0; i < enteros.length; i++){
            if(set.contains(k - enteros[i])){
                return "YES";
            }
            set.add(enteros[i]);
        }
        return "NO";
    }
}
