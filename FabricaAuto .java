public class FabricaAuto extends FabricaTransporte {
  
    public Transporte crearTransporte() {
        return new Auto(); 
    }
}
