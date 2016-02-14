



public class Agenda {

    Persona[] contactos;
    int siguiente = 0;

    public Agenda(int tam) {
        contactos = new Persona[tam];
    }

    public boolean añadir(Persona per) {
        if(siguiente  >= contactos.length){
            redimensionar();
            añadir(per);
            return false;
        }else
            contactos[siguiente++]  =   per;
        return true;
    }
    
    public void redimensionar(){
        Persona[]contactos2=new Persona[contactos.length*2];
        
        System.arraycopy(contactos, 0, contactos2, 0, contactos.length);
        contactos=contactos2;
    }

    public String getTelefono(String nom) {
        int posición = buscar(nom);
        if(posición==-1)
            return null;
        return contactos[posición].getTelefono();
    }
    /*- buscar: recibe un nombre y devuelve la posición de la matriz en la que se encuentra.
    Si no lo encuentra devuelve -1.*/

    public int buscar(String nom) {
        for (int i = 0; i < siguiente; i++) {
            String nombre = contactos[i].getNombre();
            if (nombre.equalsIgnoreCase(nom))
                return i;
        }
        return -1;
    }
    //- getPersona: recibe una posición y devuelve la persona que se encuentra en esa posición.

    public Persona getPersona(int posicion) {
        return contactos[posicion];
    }
    //- getPersona: recibe un nombre, busca su posición y devuelve una copia de ese objeto persona.

    public Persona getPersona(String nom) {
        int posición = buscar(nom);
        if (posición != -1) {
            // return getPersona(posición).getCopia();
            Persona per = getPersona(posición);
            return new Persona(per.getNombre(), per.getTelefono());
        }
        return null;
    }
    /*modificarTelefono: recibe el nombre de una persona y un nuevo número de teléfono
    para modificar el actual.*/

    public boolean modificarTelefono(String nombre, String nuevoTelefono) {
        int posicion = buscar(nombre);
        if (posicion != -1) {
            contactos[posicion].setTelefono(nuevoTelefono);
            return true;
        }
        else
            return false;
    }
}
