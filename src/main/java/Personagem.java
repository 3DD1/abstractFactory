public class Personagem {

    private Raca raca;
    private Habilidade habilidade;

    public Personagem(FabricaAbstrata fabrica){
        this.raca = fabrica.createRaca();
        this.habilidade = fabrica.createHabilidade();
    }

    public String tipoRaca(){
        return this.raca.tipo();

    }
    public String tipoHabilidade(){
        return this.habilidade.tipo();
    }
}
