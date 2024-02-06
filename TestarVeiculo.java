// Classe de teste
public class TestarVeiculo {
    public static void main(String[] args) {
        Moto moto = new Moto("ABC1234");
        Carro carro = new Carro("XYZ5678");

        moto.abastecer(10.0);
        carro.abastecer(20.0);

        System.out.println("Moto antes da viagem: " + moto.toString());
        System.out.println("Carro antes da viagem: " + carro.toString());

        boolean viagemMoto = moto.viajar(150.0);
        boolean viagemCarro = carro.viajar(200.0);

        System.out.println("Viagem de moto realizada? " + viagemMoto);
        System.out.println("Viagem de carro realizada? " + viagemCarro);

        System.out.println("Moto depois da viagem: " + moto.toString());
        System.out.println("Carro depois da viagem: " + carro.toString());
    }
}