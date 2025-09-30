import java.util.List;

public class Skjaldmaer extends Einherjar {
    public Skjaldmaer(String nombre) {
        super(nombre, 100, 15, 5); 
}

@Override
public void tomarTurno(List<CombatienteNordico> enemigos, List<CombatienteNordico> aliados) {
}

@Override
public String getMensajeInicio() { return "¡" + this.nombre + " youre finally awake, referencia skyrim, pelea ya"; }
@Override
public String getMensajeDerrota() { return this.nombre + " ha comenzado su camino hacia el valhalla "; }
}
