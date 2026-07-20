package LocalCep;

public class FormatoInvalidoDoCepException extends RuntimeException {
    private String mensagem;

    public FormatoInvalidoDoCepException(String formatoInvalidoDoCep) {
        this.mensagem = formatoInvalidoDoCep;
    }

    public String getMensagem() {
        return mensagem;
    }
}
