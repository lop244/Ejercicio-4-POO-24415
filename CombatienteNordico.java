import java.util.List;

public abstract class CombatienteNordico {
    protected String nombre;
    protected int puntosDeVida;
    protected int poderAtaque;

    public CombatienteNordico(String nombre, int puntosDeVida, int poderAtaque) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.poderAtaque = poderAtaque;
    }



