public class Draugr extends CriaturaMitologica {
    public Draugr() {
        super("Draugr", 80, 12, new Habilidad());
    }

    @Override
    public String getMensajeInicio() { return "Un demonio aparece... es un Draugr!!!"; }
    @Override
    public String getMensajeDerrota() { return "demonio que de ceniza vino... en ceniza se va..."; }
    
}
