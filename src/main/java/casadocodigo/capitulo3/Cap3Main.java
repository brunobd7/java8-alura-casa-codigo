package casadocodigo.capitulo3;

public class Cap3Main {

    public static void main(String[] args) {

        //EXEMPLO INTERFACE FUNCIONAL COM OO ou COM IMPLEMENTACAO DIRETA NO OBJETO 'validadorCepLambda'
//        Validador<String> validadorCepLambda = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
        Validador<String> validadorCepLambda = new ValidadorImplExemplo().validadorCepLambda2;
        boolean cepEhValido = validadorCepLambda.validar("74475-370");

//        if (cepEhValido) {
//            System.out.println("CEP É VALIDO");
//        } else {
//            System.out.println("CEP É INVALIDO");
//        }

        //FIM EXEMPLO

        // PARA UTILIZACAO DA EXPRESSAO LAMBDA É OBRIGATORIO O USO DE UMA INTERFACE FUNCIONAL SENAO O CODIGO NAO IRA COMPILAR
        // CONFORME O EXEMPLO ABAIXO

        //TENTATIVA DE USO INCORRETO DA LAMBDA SEM INTERFACE FUNCIONAL
//        Object o = () -> {
//            System.out.println("NAO COMPILARA , NAO ENVOLVE OU INFERE UM INTERFACE FUNCIONAL");
//        };

        // USO CORRETO
        // COMPILA POIS IMPLEMENTA A INTERFACE FUNCIONAL DE EXEMPLO "(UNICO METODO 'run()' NA INTERFACE 'Runnable')
        Runnable r = () -> {
            System.out.println("O que sou eu? Que Lambda?");
        };

        System.out.println(r);
        System.out.println(r.getClass());

        //FIM EXEMPLO

        //CAPTURA DE VARIAVEIS LOCAIS

        final int numero = 5;
        int numero2 = 21;
//        new Thread(() -> System.out.println(numero)).start();
        new Thread(() -> {
            System.out.println(numero);
        }).start();

    }

}
