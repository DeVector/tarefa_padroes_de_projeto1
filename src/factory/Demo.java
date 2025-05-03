package factory;

public class Demo {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Civic", "Combustão");

        Factory fabrica = getCarroFabrica(cliente);

        Carro carro = fabrica.carroDesejado(cliente.getCarroDesejado());
        carro.infoCarro();
        carro.qualidadeDoCarro();
    }

    private static Factory getCarroFabrica(Cliente cliente){
        if (cliente.getTipoDeCombustivel() == "Combustão"){
            return new FabricaCombustao();
        } else {
            return new FabricaEletrico();
        }
    }
}
