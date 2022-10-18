public class Actor extends Personaje{

    String animado,apellidos,nombre;
    Sexo sexo;

    public Actor() {
    }

    public String getAnimado() {
        return animado;
    }

    public void setAnimado(String animado) {
        this.animado = animado;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "animado='" + animado + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
