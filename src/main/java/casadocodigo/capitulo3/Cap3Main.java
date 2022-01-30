package casadocodigo.capitulo3;

public class Cap3Main {

    public static void main(String[] args) {

        //USANDO INTERFACE PESSOAL CRIADA NO PADRAO CLASSE ANONIMA
//        Validador<String> validadorCep = new Validador<String>() {
//            @Override
//            public boolean validar(String valor) {
//                return valor.matches("[0-9]{5}-[0-9]{3}");
//            }
//        };

        //USANDO INTERFACE CRIADA ATRAVES DE EXPRESSAO LAMBDA
        // COMO POSSUI UNICO METODO ABSTRADO E CONSIDERADA INTERFACE FUNCIONAL PELO COMPILADOR

//        Validador<String> validadorCepLambda = cepString -> {
//             return cepString.matches("[0-9]{5}-[0-9]{3}");
//        };

        Validador<String> validadorCepLambda2 = valor -> valor.matches("[0-9]{5}-[0-9]{3}");

        boolean cepEhValido = validadorCepLambda2.validar("74475-370");

        if(cepEhValido){
            System.out.println("CEP É VALIDO");
        }else{
            System.out.println("CEP É INVALIDO");
        }
    }

}
