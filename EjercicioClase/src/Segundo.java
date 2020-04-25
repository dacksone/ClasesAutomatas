
import javax.swing.JOptionPane;

public class Segundo {

    static int cont;
    static char[] car;
    boolean aceptado;
    static int numero = (int)(Math.random()*2+1);
        
    

    void inicio() {
        cont = 0;
        aceptado = false;
        q0();
    }
    

    void q0() {
        System.out.println("Estado q0");
        
        
               
        if ((cont < car.length)  ) {
            if ((car[cont]) == '0' && (numero == 1)) {
                cont++;
                q0();
            } else if((car[cont]) == '0' && (numero == 2)){
                cont++;
                q1();
            }
            
            else {

                if (car[cont] == '1') {
                    cont++;
                    q0();
                }
            }
        }
    }

        
        
        


    void q1() {
        System.out.println("Estado q1");
        
        if ((cont < car.length)  ) {
            if ((car[cont]) == '1' && (numero == 1)) {
                cont++;
                q1();
            } else if((car[cont]) == '1' && (numero == 2)){
                cont++;
                q2();
            }
            
            else {

                if (car[cont] == '0') {
                    cont++;
                    q0();
                }
            }
        }
    }
    
    void q2() {
        System.out.println("Estado q2");
        aceptado = true;
        if ((cont < car.length)  ) {
            if (car[cont] == '0' ) {
                aceptado = false;
                cont++;
                qerror();
            }
        }
    }
    
    void qerror() {
        System.out.println("Estado error");
        
    }

    

    public static void main(String[] args) {

        String cadena = JOptionPane.showInputDialog("Ingrese una cadena de texto:");
        System.out.println("La cadena ingresas es: "+ cadena);
        System.out.println("random es igual a: "+numero);
        //"abbb"
        Segundo au = new Segundo();

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
