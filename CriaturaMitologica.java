import java.util.List;

public abstract class CriaturaMitologica extends CombatienteNordico {
    protected Habilidad habilidadPrimaria;

    public CriaturaMitologica(String nombre, int vida, int ataque, Habilidad habilidad) {
        super(nombre, vida, ataque);
        this.habilidadPrimaria = habilidad;
}

    public CriaturaMitologica(String nombre)