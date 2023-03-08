import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(15);
        array.add(3);
        array.add(6);
        array.add(10);

        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(7);
        array2.add(6);
        array2.add(5);
        array2.add(4);
        array2.add(3);

        System.out.println(maximaDiferencia(array));
        System.out.println(maximaDiferencia(array2));
    }

    public static int maximaDiferencia(ArrayList<Integer> array){
        int mayor = -1;
        for (int i = 0; i < array.size(); i++) {
            for(int j = i + 1; j < array.size(); j++){
                if(array.get(j) - array.get(i) > mayor) mayor = array.get(j) - array.get(i);
            }

        }
        return mayor;
    }
}
