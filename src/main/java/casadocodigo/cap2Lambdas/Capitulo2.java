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

        //op 3 - INSTANCIA DE CLASSE ANONIMA DIRETO NO FOREACH
        usersList.forEach(new Consumer<Usuario>() {
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getNome());
            }
        });


        //op 4 - SIMPLICANDO OPERACAO COM LAMBDAS

        Consumer<Usuario> mostradorLambda =  (Usuario u) -> {
            System.out.println(u.getNome());
        };

        //OU
        Consumer<Usuario> mostradorLambda2 = u -> {
            System.out.println(u.getNome());
        } ;
        //OU
        // SE EXISTIR SOMENTE UMA INSTRUCAO AS CHAVES SAO OPCIONAIS
        Consumer<Usuario> mostradorLambda3 = u -> System.out.println(u.getNome());

        // OP MAIS COMUM COM SINTAXE MAIS LIMPA, SEM VAR TEMPORARIA PASSANDO O CONSUMER DIRETAMENTE NO EACH
        usersList.forEach( u -> System.out.println(u.getNome()));

    }

}

//implements consumer interface to used on forEach interator
class Mostrador implements Consumer<Usuario>{

    @Override
    public void accept(Usuario usuario) {
        System.out.println(usuario.getNome());
    }
}
