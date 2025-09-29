
public class DraugrLord extends Draugr {
    protected Habilidad habilidadDeJefe;

    public DraugrLord() {
        super();
        this.nombre = "Dios y señor de los Draugr";
        this.puntosDeVida = 200;
        this.poderAtaque = 20;
        this.habilidadDeJefe = new Habilidad();

    }
    public void usarHabilidadDeJefe(CombatienteNordico objetivo) {
        this.habilidadDeJefe.usar(this, objetivo);
    }

    @Override
    public void 