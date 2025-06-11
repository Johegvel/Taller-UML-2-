import java.time.LocalDateTime;

public class Tarea extends ActividadSumativa {
    private LocalDateTime fechaDePublicacion;

    public Tarea(String titulo, LocalDateTime entrega, float puntajemax, String content, float calificacion,
        int id, LocalDateTime publicacion){
            super(titulo, entrega, puntajemax, content, calificacion, id);
            this.fechaDePublicacion = publicacion;
    }

    //getters y setters
    public LocalDateTime getFechaDePublicacion() {
        return fechaDePublicacion;
    }
    
    public void setFechaDePublicacion(LocalDateTime fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }    
}
