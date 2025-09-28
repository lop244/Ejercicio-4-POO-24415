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

    public String getNombre() { return nombre; }
    public int getPuntosDeVida() { return puntosDeVida; }
    public int getPoderAtaque() { return poderAtaque; }

    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }






