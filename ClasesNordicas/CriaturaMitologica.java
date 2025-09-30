import java.util.List;

public abstract class CriaturaMitologica extends CombatienteNordico {
    protected Habilidad habilidadPrimaria;

    public CriaturaMitologica(String nombre, int vida, int ataque, Habilidad habilidad) {
        super(nombre, vida, ataque);
        this.habilidadPrimaria = habilidad;
}

    public void usarHabilidadPrimaria(CombatienteNordico objetivo) {
        this.habilidadPrimaria.usar(this, objetivo);
    }

    @Override
    public void tomarTurno(List<CombatienteNordico> enemigos, List<CombatienteNordico> aliados) {
        if (!aliados.isEmpty() && aliados.get(0).estaVivo()) {
            atacar(aliados.get(0));
        }
    }
}
