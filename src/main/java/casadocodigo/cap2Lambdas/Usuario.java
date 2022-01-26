package casadocodigo.cap2Lambdas;

import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
class Usuario {

    @NotNull
    private String nome;
    @NotNull
    private Integer pontos;
    private boolean moderador;

//    public Usuario(String nome, Integer pontos) {
//        this.nome = nome;
//        this.pontos = pontos;
//    }
}
