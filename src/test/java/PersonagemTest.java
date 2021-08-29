import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void adquiriNovoTipoDeHabilidadeOrc(){
        FabricaAbstrata fabrica = new FabricaOrc();
        Personagem personagem = new Personagem(fabrica);
        assertEquals("Força e Alquimia", personagem.tipoHabilidade());
    }

    @Test
    void adquiriNovoTipoDeHabilidadeElfo(){
        FabricaAbstrata fabrica = new FabricaElfo();
        Personagem personagem = new Personagem(fabrica);
        assertEquals("Magia da Floresta e arco-flecha", personagem.tipoHabilidade());
    }

    @Test
    void personagemRecebeNovaRacaOrc(){
        FabricaAbstrata fabrica = new FabricaOrc();
        Personagem personagem = new Personagem(fabrica);
        assertEquals("Orc - ( O Orsimer, vivem Wrothgarian e Dragontail montanhas.)", personagem.tipoRaca());
    }

    @Test
    void personagemRecebeNovaRacaElfo(){
        FabricaAbstrata fabrica = new FabricaElfo();
        Personagem personagem = new Personagem(fabrica);
        assertEquals("Elfo da Neve - ( O Falmer, Durante a Era Merética , eles eram os principais habitantes de Skyrim e tinham uma sociedade muito avançada.", personagem.tipoRaca());
    }


}