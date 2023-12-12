import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        String [] vect = new String[]{"Fernando","Vieira", "Goya"};
//        int [] arrayInt = {1,2,3,4,5,6,7};
//        for(String data : vect){
//            System.out.print(data+ " ");
//        }
//        System.out.println("");
//        for(int data : arrayInt){
//            System.out.print(data+" ");
//        }
        List<Integer> listaInt = new ArrayList<Integer>();
        List<String> listaStr = new ArrayList<String>();

        listaInt.add(1);
        listaInt.add(12);

        listaStr.add("Fernando");

        listaStr.add("Fernanda");

        listaStr.add(0,"Vieira");

        listaStr.add("Goya");

        listaStr.remove(0);

        for(Integer x : listaInt){
            System.out.print(x + " ");
        }
        System.out.println("");

        for(String i : listaStr){
            System.out.print(i + " ");
        }

        System.out.print("\n"+listaInt.size());
        System.out.print("\n"+listaStr.size());

        //Permite que faça operações lambda com a lista em stream
        List<String> result = listaStr.stream().filter(x -> x.charAt(0) == 'F').collect(Collectors.toList());

        //Vai imprimir somente nomes começados com F. Will print only elements that it s first letter is F
        for(String x : result){
            System.out.println(x);
        }
    }
}