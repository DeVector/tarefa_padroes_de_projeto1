package factory;

public abstract class Factory {

    public Carro criando(String nomeCarro){
        Carro carro = carroDesejado(nomeCarro);
        carro = venderCarro(carro);
        return carro;
    }

    private Carro venderCarro(Carro carro) {
        carro.qualidadeDoCarro();
        carro.infoCarro();
        return carro;
    }

    abstract Carro carroDesejado(String nomeCarro);

}
