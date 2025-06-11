import java.util.ArrayList;
import java.util.List;

public class Profesor extends PersonalAcademico{
    private List<Curso> cursosACargo;
    private List<Foro> foros;
    
    public Profesor(String user, String pass, String name, String lastname){
        super(user, pass, name, lastname);
        this.cursosACargo = new ArrayList<>();
        this.foros = new ArrayList<>();
    }
    public void cargarActividadSumativa(Curso c, ActividadSumativa ac){
        c.getActividadesSumativas().add(ac);
    }

    public void calificarActividadSumativa(Curso c, Estudiante e, ActividadSumativa ac, float calificacion){
        ac.setCalificacion(calificacion);
    }

    public void aceptarInscripcion(Curso c, String userEstudiante){
        Estudiante estudiante = null;
        for(Estudiante estudianteEnLista : c.getEstudiantesEnEsperaDeInscripcion()){
            if (estudianteEnLista.getUsuario().equals(userEstudiante)){
                estudiante = estudianteEnLista;
                break;
            }
        }
        c.getEstudiantesEnEsperaDeInscripcion().remove(estudiante);
        c.getEstudiantesInscritos().add(estudiante);
    }

    public void crearNuevoForo(Foro f){
        this.foros.add(f);
    }
}