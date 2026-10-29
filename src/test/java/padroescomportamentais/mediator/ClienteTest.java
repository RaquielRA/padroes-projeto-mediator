package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarLogistica() {
        Cliente cliente = new Cliente();
        assertEquals("A Central de Ajuda agradece o seu contacto.\nA Logística respondeu à sua demanda conforme mensagem a seguir.\n" +
                ">>A Logística agradece a mensagem: Entrega rápida e produto bem embalado",
                cliente.elogiarLogistica("Entrega rápida e produto bem embalado"));
    }

    @Test
    void deveReclamarLogistica() {
        Cliente cliente = new Cliente();
        assertEquals("A Central de Ajuda agradece o seu contacto.\nA Logística respondeu à sua demanda conforme mensagem a seguir.\n" +
                ">>A Logística vai procurar melhorar o serviço da reclamação: Atraso na entrega",
                cliente.reclamarLogistica("Atraso na entrega"));
    }

    @Test
    void deveSugerirLogistica() {
        Cliente cliente = new Cliente();
        assertEquals("A Central de Ajuda agradece o seu contacto.\nA Logística respondeu à sua demanda conforme mensagem a seguir.\n" +
                ">>A Logística vai analisar a sugestão: Disponibilizar código de rastreio em tempo real",
                cliente.sugerirLogistica("Disponibilizar código de rastreio em tempo real"));
    }

}