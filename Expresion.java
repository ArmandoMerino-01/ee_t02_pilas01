package unidadiii;
/**
 *
 * @author Armando1
 */
import javax.swing.*;

public class Expresion {

    public boolean validar() {
        Pila p = new Pila();
        String cadena = JOptionPane.showInputDialog("DIGITE LA EXPRESION A EVALUAR");

        for (int f = 0; f < cadena.length(); f++) {

            if (cadena.charAt(f) == '(' || cadena.charAt(f) == '[' || cadena.charAt(f) == '{') {
                p.Push(cadena.charAt(f));
            } else {
                if (cadena.charAt(f) == ')') {
                    if (p.Pop() != '(') {
                        return false;
                    }
                } else {
                    if (cadena.charAt(f) == ']') {
                        if (p.Pop() != '[') {
                            return false;
                        }
                    } else {
                        if (cadena.charAt(f) == '}') {
                            if (p.Pop() != '{') {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        if (p.vacia()) {
            return true;
        } else {
            return false;
        }
    }

    public void mensaje() {
        if (validar()) {
            JOptionPane.showMessageDialog(null, "Está correctamente balanceada.");
        } else {
            JOptionPane.showMessageDialog(null, "No está balanceada");
        }
    }

    public static void main(String[] arrgs) {
        int menu = 0;
        do {
            try {
                menu = Integer.parseInt(JOptionPane.showInputDialog("......QUE DESEA HACER......??\n\n1.Evaluar expresion Matematica\n2.salir"));
                switch (menu) {
                    case 1:
                        Expresion e = new Expresion();

                        e.mensaje();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Nos vemos :)");
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "DIGITE BIEN SU OPCION :)");
            }
        } while (menu != 2);

    }
}
