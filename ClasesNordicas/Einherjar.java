import java.util.ArrayList;
import java.util.List;

public abstract class Einherjar extends CombatienteNordico {
    protected List<Item> inventario;
    protected int capacidadItems;

    public Einherjar(String nombre, int puntosDeVida, int poderAtaque, int capacidadItems) {
        super(nombre, puntosDeVida, poderAtaque);
        this.capacidadItems = capacidadItems;
        this.inventario = new ArrayList<>();
    }

    public void usarItem(Item item, CombatienteNordico objetivo) {
        item.usar(this, objetivo);
    }
}



