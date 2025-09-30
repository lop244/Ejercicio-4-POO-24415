import java.util.List;

public class Berserker extends Einherjar {
    public Berserker(String nombre) {
        super(nombre, 150, 25, 2); 
    }

    @Override
    public void tomarTurno(List<CombatienteNordico> enemigos, List<CombatienteNordico> aliados) {
    }

    @Override
    public String getMensajeInicio() { return "¡" + this.nombre + " ruge listo para la batalla!"; }
    @Override
    public String getMensajeDerrota() { return this.nombre + " cae, pero su furia será recordada..."; }
}
