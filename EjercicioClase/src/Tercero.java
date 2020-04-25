import javax.swing.JOptionPane;

public class Tercero {

    static int cont;
    static char[] car;
    boolean aceptado;
    static int numero = (int) (Math.random() * 3 + 1);

    void inicio() {
        cont = 0;
        aceptado = false;
        q0();
    }

    void q0() {
        System.out.println("Estado q0");
        //System.out.println("Valor actual de cadena: "+car[cont]);

        if ((cont < car.length)) {
            //a
            if ((car[cont]) == 'a' && (numero == 1)) {
                cont++;
                q0();
            } else if ((car[cont]) == 'a' && (numero == 2)) {
                cont++;
                q1();
            } else if ((car[cont]) == 'a' && (numero == 3)) {
                cont++;
                q0();
            } else {
                //b

                if ((car[cont]) == 'b' && (numero == 1)) {
                    cont++;
                    q0();
                } else if ((car[cont]) == 'b' && (numero == 2)) {
                    cont++;
                    q3();
                } else if ((car[cont]) == 'b' && (numero == 3)) {
                    cont++;
                    q0();
                } else {
                    //c
                    if ((car[cont]) == 'c' && (numero == 1)) {
                        cont++;
                        q0();
                    } else if ((car[cont]) == 'c' && (numero == 2)) {
                        cont++;
                        q3();
                    } else if ((car[cont]) == 'c' && (numero == 3)) {
                        cont++;
                        q0();
                    }

                }

            }
        }
    }

    void q1() {
        System.out.println("Estado q1");
        //System.out.println("Valor actual de cadena: "+car[cont]);

        //a
        if ((cont < car.length)) {
        if ((car[cont]) == 'a' && (numero == 1)) {
            cont++;
            q4();
        } else if ((car[cont]) == 'a' && (numero == 2)) {
            cont++;
            q4();
        } else if ((car[cont]) == 'a' && (numero == 3)) {
            cont++;
            q4();
        } else {
            //b

            if ((car[cont]) == 'b' && (numero == 1)) {
                cont++;
                q5();
            } else if ((car[cont]) == 'b' && (numero == 2)) {
                cont++;
                q5();
            } else if ((car[cont]) == 'b' && (numero == 3)) {
                cont++;
                q5();
            } else {
                //c

                if ((car[cont]) == 'c' && (numero == 1)) {
                    cont++;
                    q2();
                } else if ((car[cont]) == 'c' && (numero == 2)) {
                    cont++;
                    q2();
                } else if ((car[cont]) == 'c' && (numero == 3)) {
                    cont++;
                    q2();
                }

            }

        }
        }

    }

    void q2() {
        System.out.println("Estado q2");
        //System.out.println("Valor actual de cadena: "+car[cont]);
        aceptado = true;
        
        
        //a
        if ((cont < car.length)) {
        if ((car[cont]) == 'a' && (numero == 1)) {
            cont++;
            q2();
        } else if ((car[cont]) == 'a' && (numero == 2)) {
            cont++;
            q2();
        } else if ((car[cont]) == 'a' && (numero == 3)) {
            cont++;
            q2();
        } else {
            //b

            if ((car[cont]) == 'b' && (numero == 1)) {
                cont++;
                q2();
            } else if ((car[cont]) == 'b' && (numero == 2)) {
                cont++;
                q2();
            } else if ((car[cont]) == 'b' && (numero == 3)) {
                cont++;
                q2();
            } else {
                //c

                if ((car[cont]) == 'c' && (numero == 1)) {
                    cont++;
                    q2();
                } else if ((car[cont]) == 'c' && (numero == 2)) {
                    cont++;
                    q2();
                } else if ((car[cont]) == 'c' && (numero == 3)) {
                    cont++;
                    q2();
                }

            }

        }
        }
    }
    
    
    void q3() {
        System.out.println("Estado q3");
        //System.out.println("Valor actual de cadena: "+car[cont]);

        //a
        if ((cont < car.length)) {
        if ((car[cont]) == 'a' && (numero == 1)) {
            cont++;
            q4();
        } else if ((car[cont]) == 'a' && (numero == 2)) {
            cont++;
            q4();
        } else if ((car[cont]) == 'a' && (numero == 3)) {
            cont++;
            q4();
        } else {
            //b

            if ((car[cont]) == 'b' && (numero == 1)) {
                cont++;
                q3();
            } else if ((car[cont]) == 'b' && (numero == 2)) {
                cont++;
                q3();
            } else if ((car[cont]) == 'b' && (numero == 3)) {
                cont++;
                q3();
            } else {
                //c

                if ((car[cont]) == 'c' && (numero == 1)) {
                    cont++;
                    q3();
                } else if ((car[cont]) == 'c' && (numero == 2)) {
                    cont++;
                    q3();
                } else if ((car[cont]) == 'c' && (numero == 3)) {
                    cont++;
                    q3();
                }

            }

        }
        }
    }
    
    
    
    void q4() {
        System.out.println("Estado q4");
        //System.out.println("Valor actual de cadena: "+car[cont]);

        //a
        if ((cont < car.length)) {
        if ((car[cont]) == 'a' && (numero == 1)) {
            cont++;
            q4();
        } else if ((car[cont]) == 'a' && (numero == 2)) {
            cont++;
            q4();
        } else if ((car[cont]) == 'a' && (numero == 3)) {
            cont++;
            q4();
        } else {
            //b

            if ((car[cont]) == 'b' && (numero == 1)) {
                cont++;
                q5();
            } else if ((car[cont]) == 'b' && (numero == 2)) {
                cont++;
                q5();
            } else if ((car[cont]) == 'b' && (numero == 3)) {
                cont++;
                q5();
            } else {
                //c

                if ((car[cont]) == 'c' && (numero == 1)) {
                    cont++;
                    q3();
                } else if ((car[cont]) == 'c' && (numero == 2)) {
                    cont++;
                    q3();
                } else if ((car[cont]) == 'c' && (numero == 3)) {
                    cont++;
                    q3();
                }

            }
        }

        }
    }
    
    
    
    void q5() {
        System.out.println("Estado q5");
        //System.out.println("Valor actual de cadena: "+car[cont]);
        
        aceptado = true;

        //a
        if ((cont < car.length)) {
        if ((car[cont]) == 'a' && (numero == 1)) {
            aceptado = false;
            cont++;
            q4();
        } else if ((car[cont]) == 'a' && (numero == 2)) {
            aceptado = false;
            cont++;
            q4();
        } else if ((car[cont]) == 'a' && (numero == 3)) {
            aceptado = false;
            cont++;
            q4();
        } else {
            //b

            if ((car[cont]) == 'b' && (numero == 1)) {
                aceptado = false;
                cont++;
                q3();
            } else if ((car[cont]) == 'b' && (numero == 2)) {
                aceptado = false;
                cont++;
                q3();
            } else if ((car[cont]) == 'b' && (numero == 3)) {
                aceptado = false;
                cont++;
                q3();
            } else {
                //c

                if ((car[cont]) == 'c' && (numero == 1)) {
                    aceptado = false;
                    cont++;
                    q3();
                } else if ((car[cont]) == 'c' && (numero == 2)) {
                    aceptado = false;
                    cont++;
                    q3();
                } else if ((car[cont]) == 'c' && (numero == 3)) {
                    aceptado = false;
                    cont++;
                    q3();
                }

            }
        }

        }
    }
    
    
/*
    void qerror() {
        System.out.println("Estado error");

    }
    */

    public static void main(String[] args) {

        String cadena = JOptionPane.showInputDialog("Ingrese una cadena de texto:");
        System.out.println("La cadena ingresas es: " + cadena);
        System.out.println("random es igual a: " + numero);
        //"abbb"
        Tercero au = new Tercero();

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
