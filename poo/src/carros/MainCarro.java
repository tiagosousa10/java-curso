package carros;


public class MainCarro {
    public static void main(String[] args) {


        Carro punto = new Carro();
        punto.cavalos = 100;
        punto.cor = "Preta";
        punto.transmissao = "Manual";
        punto.montadora = "Fiat";
        punto.capacidadeTanque = 50;
        punto.combustivel = 23;
        punto.kmPorLitros = 7;


        Carro civic = new Carro();
        civic.cavalos = 150;
        civic.cor = "Azul";
        civic.transmissao = "Manual";
        civic.montadora = "Honda";
        civic.capacidadeTanque = 70;
        civic.combustivel = 33;
        civic.kmPorLitros = 5;


        System.out.println("Combustivel do PUNTO: " + punto.combustivel);
        System.out.println("Combustivel do CIVIC: " + civic.combustivel);

        System.out.println("Abstecendo 10 litros no PUNTO");
        punto.abastecer(15);
        System.out.println("Abstecendo 15 litros no PUNTO");
        int sobraPunto = punto.abastecer(10);

        System.out.println("Abstecendo 30 litros no CIVIC");
        civic.abastecer(30);
        System.out.println("Abstecendo 30 litros no CIVIC");
        int sobraCivic = civic.abastecer(30);

        System.out.println("DEPOIS - Combustivel do PUNTO: " + punto.combustivel + "sobrou" + sobraPunto);
        System.out.println("DEPOIS - Combustivel do CIVIC: " + civic.combustivel + "sobrou" + sobraCivic);

        System.out.println("Autonomia PUNTO: " + punto.autonomiaCombustivel());
        System.out.println("Autonomia CIVIC: " + civic.autonomiaCombustivel());


    }
}
