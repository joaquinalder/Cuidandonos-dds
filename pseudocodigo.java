enum EstrategiaTrayectoPorParada {
    DETENER,
    AVISAR
}


public class Trayecto {

    private List<Parada>                destino
    private int                         numeroParadaActual
    private EstrategiaTrayectoPorParada tipoTrayecto
    private tiempoDetencionPorParada    Duration

    public void calcularTiempoDemora()

    public void irASiguienteParada(){
        this.calcularTiempoDemora();
    }
    
    public void solicitarEstadoTranseunte()

    public void cambiarEstrategiaParadas(EstrategiaTrayectoPorParada estrategia){
        this.tipoTrayecto = estrategia;
    }

}

public interface EstrategiaParadas{

    public void ejecutar(Trayecto trayecto)

}


public class EstrategiaDetener implements EstrategiaParadas {

     @Override
     public void ejecutar(Trayecto trayecto) {
         // espera tantos minutos como tiempoDetencionPorParada del Trayecto
         trayecto.irASiguienteParada();
     }

}


public class EstrategiaAvisar implements EstrategiaParadas {

    @Override
    public void ejecutar(Trayecto trayecto) {
       trayecto.solicitarEstadoTranseunte();
       trayecto.irASiguienteParada();
    }

}
