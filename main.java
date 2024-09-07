public class Main {
    public static void main(String[] args) {
        FabricaTransporte fabricaAuto = new FabricaAuto();
        Transporte auto = fabricaAuto.crearTransporte();
        auto.entregar();

        FabricaTransporte fabricaBicicleta = new FabricaBicicleta();
        Transporte bicicleta = fabricaBicicleta.crearTransporte();
        bicicleta.entregar();
    }
}
