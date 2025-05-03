package factory;

public class FabricaEletrico extends Factory{

    @Override
    Carro tipoDeCombustivel(String nomeCarro) {
        return switch (nomeCarro) {
            case "Dolphi" -> new Byd(95, "Eletrico", "Prata", "Novo");
            case "Shark" -> new Byd(437, "Eletrico", "Branco", "Seminovo");
            case "Model S" -> new Tesla(1020, "Eletrico", "Cinza", "Novo");
            case "Cibertruck" -> new Tesla(845, "Eletrico", "Prata", "Novo");
            default -> {
                System.out.println("Carro não encontrado no sistema!!");
                yield null;
            }
        };
    }
}
