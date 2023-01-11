import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Escreva um código que encontre os elementos em comum que 
        // existem em dois arrays e imprima os nomes dos itens em comum! 

        List<String> fruits = new ArrayList<>();
        List<String> fruitsWithL = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Pera");
        fruits.add("Manga");
        fruits.add("Morango");
        fruits.add("Melancia");
        fruits.add("Uva");
        fruits.add("Limao");
        fruits.add("Pessego");
        fruits.add("Lichia");
        fruits.add("Laranja");

        fruitsWithL.add("Limao");
        fruitsWithL.add("Lima");
        fruitsWithL.add("Laranja");
        fruitsWithL.add("Lichia");
        fruitsWithL.add("Limão Galego");

        List<String> first;
        List<String> second;

        if ( fruits.size() > fruitsWithL.size()){
            first = fruits;
            second = fruitsWithL;
        } else {
            first = fruitsWithL;
            second = fruits;
        }

        for (int i = 0; i < first.size(); i++){
            for(int j = 0; j < second.size(); j++){
                if ( first.get(i) == second.get(j) ) {
                    System.out.println(second.get(j));
                }
            }
        }

    }
}
