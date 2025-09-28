
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

    public void pasarTurno() {
        System.out.println(this.nombre + " ha decidido pasar su turno.");
    }

    public void atacar(CombatienteNordico objetivo) {
        System.out.println(this.nombre + " ataca a " + objetivo.getNombre() + "!");
        objetivo.recibirDaño(this.poderAtaque);
    }
    public void recibirDaño(int daño) {
        this.puntosDeVida -= daño;



    }






