package casadocodigo.capitulo4;

import casadocodigo.capitulo2.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Cap4Main {

    public static void main(String[] args) {

        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usersList = Arrays.asList(user1, user2, user3);

        Consumer<Usuario> imprimeMensagem = u -> System.out.println("EXECUTANDO ANTES DE IMPRIMIR OS NOMES");
        Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());

        //PARA UTILIZAR O DEFAULT METHOD DO CONSUMER A IMPLEMENTACAO DEVEM SER DO TIPO EM COMUM
        //ASSIM PODENDO SER CHAMADA A SEGUNDA IMPLEMENTE APÓS A EXECUCAO DA PRIMEIRA SE FOREMD O MESMO TIPO
        usersList.forEach(imprimeMensagem.andThen(imprimeNome));


        //TODO CONTINUAR NA PAGINA 21

    }
}
