package padroescomportamentais.mediator;

public class CentralAjuda {

    private static CentralAjuda instancia = new CentralAjuda();

    private CentralAjuda() {}

    public static CentralAjuda getInstancia() {
        return instancia;
    }

    public String receberElogioLogistica(String mensagem) {
        return "A Central de Ajuda agradece o seu contacto.\n"+
                "A Logística respondeu à sua demanda conforme mensagem a seguir.\n" +
                ">>" + Logistica.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoLogistica(String mensagem) {
        return "A Central de Ajuda agradece o seu contacto.\n"+
                "A Logística respondeu à sua demanda conforme mensagem a seguir.\n" +
                ">>" + Logistica.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoLogistica(String mensagem) {
        return "A Central de Ajuda agradece o seu contacto.\n"+
                "A Logística respondeu à sua demanda conforme mensagem a seguir.\n" +
                ">>" + Logistica.getInstancia().receberSugestao(mensagem);
    }

}