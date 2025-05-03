package factory;

public abstract class Carro {

    private int cavalosPotencia;
    private String tipoCombustivel;
    private String corVeiculo;
    private String estadoCarro;

    public Carro(int cavalosPotencia,
                 String tipoCombustivel,
                 String corVeiculo,
                 String estadoCarro){
        this.cavalosPotencia = cavalosPotencia;
        this.tipoCombustivel = tipoCombustivel;
        this.corVeiculo = corVeiculo;
        this.estadoCarro = estadoCarro;
    }

    public void qualidadeDoCarro(){
        System.out.println("Este carro é " + estadoCarro.toLowerCase() +
                " e utiliza como combustível " + tipoCombustivel.toLowerCase());
    }

    public void infoCarro() {
        System.out.println("A cor do veiculo é " + corVeiculo.toLowerCase() +
                " e tem " + cavalosPotencia + " cavalos de potencia.");
    }
}
