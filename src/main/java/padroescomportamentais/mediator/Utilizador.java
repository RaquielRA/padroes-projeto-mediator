package padroescomportamentais.mediator;

public class Utilizador {

    public String elogiarLogistica(String mensagem) {
        return CentralAjuda.getInstancia().receberElogioLogistica(mensagem);
    }

    public String reclamarLogistica(String mensagem) {
        return CentralAjuda.getInstancia().receberReclamacaoLogistica(mensagem);
    }

    public String sugerirLogistica(String mensagem) {
        return CentralAjuda.getInstancia().receberSugestaoLogistica(mensagem);
    }

}