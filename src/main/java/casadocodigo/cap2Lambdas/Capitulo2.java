package casadocodigo.cap2Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2 {


    public static void main(String[] args) {

        Usuario user1 = new Usuario("Bruno Dantas", 150);
        Usuario user2 = new Usuario("Duda", 120);
        Usuario user3 = new Usuario("Giselle", 190);

        List<Usuario> usersList = Arrays.asList(user1,user2,user3);

        for (Usuario user : usersList){
            System.out.println(user.getNome());
        }

        //JAVA 8 WAY

        //op 1 - IMPLEMENTANDO CONSUMER EM OUTRA CLASSE
        Mostrador mostrador1 = new Mostrador();
        usersList.forEach(mostrador1);

        //op 2 - GERAR OBJETO E INSTANCIA DE CLASSE ANONIMA , IMPLEMENTANDO DIRETAMENTE
        Consumer<Usuario> mostrador2 = new Consumer<Usuario>() {
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getNome());
            }
        } ;
        usersList.forEach(mostrador2);

        //op 3 - INSTACIA DE CLASSE ANONIMA DIRETO NO FOREACH
        usersList.forEach(new Consumer<Usuario>() {
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getNome());
            }
        });


    }

}

//implements consumer interface to used on forEach interator
class Mostrador implements Consumer<Usuario>{

    @Override
    public void accept(Usuario usuario) {
        System.out.println(usuario.getNome());
    }
}
