package factory;

public abstract class Factory {

    public Carro criando(String nomeCarro){
        Carro carro = tipoDeCombustivel(nomeCarro);
        carro = venderCarro(carro);
        return carro;
    }

    private Carro venderCarro(Carro carro) {
        carro.qualidadeDoCarro();
        carro.infoCarro();
        return carro;
    }

    abstract Carro tipoDeCombustivel(String nomeCarro);

}
