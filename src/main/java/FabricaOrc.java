public class FabricaOrc implements FabricaAbstrata{

    @Override
    public Raca createRaca(){
        return new RacaOrc();
    }

    @Override
    public Habilidade createHabilidade(){
        return new HabilidadeOrc();
    }
}
