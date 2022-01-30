package casadocodigo.capitulo3;

@FunctionalInterface
public interface Validador<T> {

    boolean validar(T t);
//    boolean outroMetodo(T t);

}
