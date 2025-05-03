package factory;

public class FabricaCombustao extends Factory{

    @Override
    Carro carroDesejado(String nomeCarro) {
        return switch (nomeCarro) {
            case "Civic" -> new Honda(297, "Gasolina", "Branco", "Novo");
            case "Hrv" -> new Honda(177, "Flex", "Vermelho", "Semi novo");
            case "Ram" -> new Ford(395, "Diesel", "Branco", "Novo");
            case "Mustang" -> new Ford(488, "Gasolina", "Azul meia noite", "Novo");
            default -> {
                System.out.println("Esse carro não existe na nossa loja.");
                yield null;
            }
        };
    }
}
