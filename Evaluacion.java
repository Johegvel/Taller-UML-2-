import java.time.LocalDateTime;

public class Evaluacion extends ActividadSumativa {
    private int limiteDeTiempo;

    public Evaluacion(String titulo, LocalDateTime entrega, float puntajemax, String content, float calificacion,
        int id, int limite){
            super(titulo, entrega, puntajemax, content, calificacion, id);
            this.limiteDeTiempo = limite;
    }

    //getters y setters 
    public int getLimiteDeTiempo (){
        return limiteDeTiempo;
    }

    public void setLimiteDeTiempo(int limite){
        this.limiteDeTiempo = limite;
    }
}
