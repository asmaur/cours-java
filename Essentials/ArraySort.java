import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] lista = {200, 0, 7, 22, 44, 5, 123};
        int indexFrom;
        int valueIndexFrom;
        int indexTo;
        int valueIndexTo;
        int i = 0;
        int j=0;
        if( lista.length == 1){
            System.out.printf("Lista com um valor unico: %d", lista[0]);
        }else {
            //int current = lista[0];
            while(j< lista.length){
                while (i<lista.length-1){
                    indexFrom = i;
                    valueIndexFrom = lista[i];
                    indexTo = i+1;
                    valueIndexTo = lista[i+1];

                    if(valueIndexFrom > valueIndexTo ){
                        lista[indexTo] = valueIndexFrom;
                        lista[indexFrom] = valueIndexTo;
                        System.out.println(Arrays.toString(lista));
                        i=0;
                    }else{
                        i++;
                    }
                }
                j++;
            }


        }

    }
}
