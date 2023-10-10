package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma{
    private static String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String interpretacion(){
        return this.getInterpretacion();
    }

    public int cantidadLetras(){
        return letras.length;
    }

    @Override
    public String toString() {
        String cadena  = "";
        for (int i = 0; i < this.getLetras().length; i++) {

            if(i==25){
                cadena = cadena + this.getLetras()[i];
                System.out.println(i);

            }else{
                cadena = cadena + this.getLetras()[i]+", ";
            }
        }
        return cadena;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
