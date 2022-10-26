package proyectoJM;

// importes lombok

import lombok.Setter;
import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;



@Builder
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@CommonsLog
@Log
@Log4j
@Log4j2





public class Usuario implements Serializable {

    private static final long serialVersionUID = 2567898860L;
    private @Setter long id;
    private @Getter String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String mail;
    private String telefono;
    private boolean activo;
    
   

   
    public Usuario(long id, String nombre, String primerApellido, String segundoApellido, String mail, String telefono,
            boolean activo) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.mail = mail;
        this.telefono = telefono;
        this.activo = activo;
    }
    
    
 
    
    public Usuario() {
    
    }






    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPrimerApellido() {
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public String getSegundoApellido() {
        return segundoApellido;
    }
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
  
    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
                + segundoApellido + ", mail=" + mail + ", telefono=" + telefono + ", activo=" + activo + "]";
    }
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (activo ? 1231 : 1237);
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((mail == null) ? 0 : mail.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((primerApellido == null) ? 0 : primerApellido.hashCode());
        result = prime * result + ((segundoApellido == null) ? 0 : segundoApellido.hashCode());
        result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
        return result;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (activo != other.activo)
            return false;
        if (id != other.id)
            return false;
        if (mail == null) {
            if (other.mail != null)
                return false;
        } else if (!mail.equals(other.mail))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (primerApellido == null) {
            if (other.primerApellido != null)
                return false;
        } else if (!primerApellido.equals(other.primerApellido))
            return false;
        if (segundoApellido == null) {
            if (other.segundoApellido != null)
                return false;
        } else if (!segundoApellido.equals(other.segundoApellido))
            return false;
        if (telefono == null) {
            if (other.telefono != null)
                return false;
        } else if (!telefono.equals(other.telefono))
            return false;
        return true;
    }
    



   
    
    
}