

public class Persona {
    String nombre;
    String telefono;

    public Persona(String nombre, String Telefono) {
        this.nombre = nombre;
        this.telefono = Telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public Persona getCopia() {
        return new Persona(nombre, telefono);
    }
    
    
}
