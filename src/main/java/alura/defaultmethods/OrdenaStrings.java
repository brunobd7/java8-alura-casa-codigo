package alura.defaultmethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {


    public static void main(String[] args) {


        //DEFAULT METHODS permitem a evoução da interface sem quebrar as classes que já implementam essa interface
        // esses metodos podem ter corpo que delegam para metodos estaticos terceiros. Interface permanecem sem metodos concretos de fato.
        // ex: metodo "sort" que delega no corpo do metodos para o metodo ESTATICO Collections.sort
        List<String> palavras = Arrays.asList("alura online","casa do codigo", "caelum");


        Comparator<String> comparador = new ComparadorPorTamanho();
//        Collections.sort(palavras);
//        Collections.sort(palavras, comparador);
        palavras.sort(comparador);

        System.out.println(palavras);


    }
}


//COMPARTOR AUX IMPLEMENTANDO INTEFACE FUNCIONAL COMPARATOR
class ComparadorPorTamanho implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {

        if(s1.length() < s2.length())
            return -1;
        if(s1.length() > s2.length())
            return 1;
        return 0;
    }
}
