import java.util.List;
import java.util.ArrayList;

public abstract class Einherjar extends CombatienteNordico {
    protected List<Item> inventario;
    protected int capacidadItems;

    public Einherjar(String nombre, int puntosDeVida, int poderAtaque, int capacidadItems) {
    super(nombre, puntosDeVida, poderAtaque);

