package casadocodigo.capitulo5;

import casadocodigo.capitulo2.Usuario;

import java.util.*;
import java.util.function.Consumer;

public class Cap5Main {

    public static void main(String[] args) {


        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usersList = new ArrayList<>();
        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);


        Comparator<Usuario> comparator = new Comparator<Usuario>() {
            public int compare(Usuario u1, Usuario u2) {
                return u1.getNome().compareTo(u2.getNome());
            }
        };
        Comparator<Usuario> comparator2 =  (u1,u2) ->  u1.getNome().compareTo(u2.getNome());

//        Collections.sort(usersList, comparator);
        Collections.sort(usersList, comparator2);

        //TODO PAGINA 28 CONHECENDO MELHOR A FACTORY COMPARATOR.COMPARING\

        //TEST MULTI USERS GIT CONFIG

    }

}
