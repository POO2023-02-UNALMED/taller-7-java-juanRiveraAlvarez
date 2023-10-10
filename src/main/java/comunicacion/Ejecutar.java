package comunicacion;

public class Ejecutar {
    public static void main(String[] args) {

        Alfabeto alfabeto = new Alfabeto("alfabeto griego, occidente",
                new String [] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
                "Alfabeto latino");
        Fabula fabula = new Fabula("pensamiento", "La tortuga y la liebre", "Esopo", 2,
                "no se debe uno burlar de los demas, ni presumir o ser vanidoso", "Cuento corto");

        Libro libro = new Libro("Creacion", "El resplandor", "Stephen King", 599, "N/A", "Doubleday", "Primera", "Escrito largo");

        Periodico periodico = new Periodico("Investigacion", "Se encontro la solucion", "Colombiano", 6, "20/12/2020", "Cura del covid", "Escrito informativo");

        Tesis tesis = new Tesis("Pensamiento expansivo", "Recomendador", "Alejandro", 20, "Recomendar asignaturas", new String [] {"Primero", "Segundo"},
                "Se hace trabajo futuro", "[1] Maquinaria",  "Escrito investigativo");


        String  comp = "Creacion\n" +
                "El resplandor\n" +
                "Stephen King\n" +
                "599\n" +
                "N/A\n" +
                "Doubleday\n" +
                "Primera";
        boolean ok = false;
        if (libro.toString().equals(comp)) {
            ok = true;
        }
        System.out.println(libro.toString());
        System.out.println(ok);
    }
}
