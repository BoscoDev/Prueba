

public class Test {

    public static void main(String[] agrs) {
        // Vamos a añadir personas a la agenda
        Persona per1 = new Persona("Adrián", "956071456");
        Persona per2 = new Persona("Pepe", "856435657");
        Persona per3 = new Persona("Juanito", "614834764");
        Persona per4 = new Persona("Alfredo", "612561437");
        Persona per5 = new Persona("Ambrosio", "11111111");
        Agenda Ag = new Agenda(1);
        Ag.añadir(per1);
        Ag.añadir(per2);
        Ag.añadir(per3);
        Ag.añadir(per4);
        Ag.añadir(per5);
        // se confirma que se añaden contactos a la agenda.
        System.out.println("Se han añadido contactos a la agenda");
        
        
       
    }
}
