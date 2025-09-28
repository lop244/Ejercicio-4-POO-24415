public class Habilidad {
    private String nombre;
    private String descripcion;

    @Override
    public void usar(CombatienteNordico ejecutor, CombatienteNordico objetivo) {
        System.out.println(ejecutor.getNombre() + " usa " + nombre + " sobre " + objetivo.getNombre());
    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
    }
}




