package casadocodigo.capitulo3;

public class IntroducaoInterfacesFuncionais {

    //INTERFACE QUE POSSUEM SOMENTE UM METODO ABSTRATO SAO CONHECIDAS COMO
    //INTERFACES FUNCIONAIS A PARTIR DO JAVA 8 E PODEM SER INSTANCIADAS ATRAVES DE UM EXPRESSAO LAMBDA

    //EX ANTIGO
    Runnable r1 = new Runnable() {
        @Override
        public void run() {

            for(int i=0; i <= 1000 ; i++ ){
                System.out.println("CONTANDO :" + i);
            }
        }
    };
//        new Thread(r1).start();

    //EX JAVA 8
    Runnable r2 = () -> {
        for(int i=0; i <= 1000 ; i++ ){
            System.out.println("CONTANDO :" + i);
        }
    };
//        new Thread(r2).start();

    //EX JAVA 8 COM MELHOR LEGIBILIDADE
//        new Thread(() ->{
//        for(int i=0; i <= 1000 ; i++ ){
//            System.out.println("CONTANDO :" + i);
//        }
//    }).start();

}
