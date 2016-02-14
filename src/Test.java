

public class Test {

    public static void main(String[] agrs) {

        Persona per1 = new Persona("Catalina", "956071456");
        Persona per2 = new Persona("Antonio", "856435657");
        Persona per3 = new Persona("Victor", "614834764");
        Persona per4 = new Persona("Nuria", "612561437");
        Persona per5 = new Persona("Martina", "11111111");
        Agenda Ag = new Agenda(1);
        Ag.añadir(per1);
        Ag.añadir(per2);
        Ag.añadir(per3);
        Ag.añadir(per4);
        Ag.añadir(per5);
        
        System.out.println(Ag.getTelefono("Antonio"));
        System.out.println(Ag.getTelefono("Catalina"));
        System.out.println(Ag.getTelefono("Martina"));
        
        System.out.println(Ag.buscar("Victor"));
        System.out.println(Ag.getPersona(2).getNombre());
        System.out.println(Ag.getPersona("Victor").getTelefono());
        Ag.modificarTelefono("Victor", "666123456");

        System.out.println(Ag.getTelefono("Victor"));
    }
}
