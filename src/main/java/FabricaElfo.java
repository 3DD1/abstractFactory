public class FabricaElfo implements FabricaAbstrata{
    @Override
    public Raca createRaca(){
        return new RacaElfo();
    }

    @Override
    public Habilidade createHabilidade(){
        return new HabilidadeElfo();
    }

}
