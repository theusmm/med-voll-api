package med.voll.api.domain;

public class ValidacaoExcepction extends RuntimeException {
    public ValidacaoExcepction(String mensagem) {
        super(mensagem);
    }
}
