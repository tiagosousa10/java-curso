public class MainCarro {
    public static void main(String[] args) {
        Carro punto = new Carro();
        punto.cavalos = 100;
        punto.cor = "Preta";
        punto.transmissao = "Manual";
        punto.montadora = "Fiat";


        Carro civic = new Carro();
        civic.cavalos = 150;
        civic.cor = "Azul";
        civic.transmissao = "Manual";
        civic.montadora = "Honda";


        System.out.println("Cavalos do punto: " + punto.cavalos);
        System.out.println("Cor do punto: " + punto.cor);
        System.out.println("Cavalos do Civic: " +  civic.cavalos);
    }
}
