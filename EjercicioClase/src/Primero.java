
import javax.swing.JOptionPane;

public class Primero {

    static int cont;
    static char[] car;
    boolean aceptado;
    static int numero = (int)(Math.random()*2+1);
        
    

    void inicio() {
        cont = 0;
        aceptado = false;
        A();
    }
    

    void A() {
        System.out.println("Estado A");
        
        
               
        if ((cont < car.length)  ) {
            if ((car[cont]) == '1' && (numero == 1)) {
                cont++;
                A();
            } else if((car[cont]) == '1' && (numero == 2)){
                cont++;
                B();
            }
            
            else {

                if (car[cont] == '0') {
                    cont++;
                    A();
                }
            }
        }
    }

        
        
        


    void B() {
        System.out.println("Estado B");
        aceptado = true;
    }

    

    public static void main(String[] args) {

        String cadena = JOptionPane.showInputDialog("Ingrese una cadena de texto:");
        System.out.println("La cadena ingresas es: "+ cadena);
        System.out.println("random es igual a: "+numero);
        //"abbb"
        Primero au = new Primero();

        car = cadena.toCharArray();
        au.inicio();
        
        if (au.aceptado == true) //System.out.println("cadena aceptada");
        {
            JOptionPane.showMessageDialog(null, "la cadena: " + cadena + " es aceptada");
        } else {
            JOptionPane.showMessageDialog(null, "la cadena: " + cadena + " no es aceptada");
        }

    }

}
