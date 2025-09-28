public class Item implements Utilizable {
    private String nombre;
    private String descripcion;
    private String canitdad;

    @Override
    public void usar(CombatienteNordico ejecutor, CombatienteNordico objetivo) {
        System.out.println(ejecutor.getNombre() + " usa un " + nombre + " sobre " + objetivo.getNombre());
    
        
}





