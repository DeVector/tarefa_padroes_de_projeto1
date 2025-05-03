package factory;

public class Cliente {

    private String carroDesejado;
    private String tipoDeCombustivel;

    public Cliente(String carroDesejado, String tipoDeCombustivel){
        this.carroDesejado = carroDesejado;
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public String getCarroDesejado(){
        return carroDesejado;
    }

    public String getTipoDeCombustivel(){
        return tipoDeCombustivel;
    }
}
