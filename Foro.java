public class Foro {
    private String id;
    private String tematica;
    private int numeroDeComentarios;
    private Curso curso;

    public Foro(String id, String tematica, int numero, Curso curso){
        this.id = id;
        this.tematica = tematica;
        this.numeroDeComentarios = numero;
        this.curso = curso;
    }

    //getters y setters
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getTematica() {
        return tematica;
    }
    
    public void setTematica(String tematica) {
        this.tematica = tematica;
    }
    
    public int getNumeroDeComentarios() {
        return numeroDeComentarios;
    }
    
    public void setNumeroDeComentarios(int numeroDeComentarios) {
        this.numeroDeComentarios = numeroDeComentarios;
    }
    
    public Curso getCurso() {
        return curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
}
