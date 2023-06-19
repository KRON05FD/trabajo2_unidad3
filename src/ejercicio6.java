import javax.swing.JOptionPane;

/**
 * @author andresnitolamoreno
 * Fecha: viernes 16 de junio 2023
 * Materia: Introducción al Desarrollo de Software
 * Corporacion universitaria remington
 */

/*6. Elabore un programa que le pregunte a (N) usuarios su salario básico mensual.
Si el salario es mayor o igual a $4000000 debe imprimir un mensaje que diga "huyyyyyyyyyyyy usted tiene salario de profesional",
de lo contrario imprima un mensaje que diga "usted NO tiene salario de profesional". Utilice el ciclo para.
 */
public class ejercicio6 {
    public static void main(String[] args) {
        //Declaracion de variables
        int n = 0, salario = 0;

        try {
            //Entrada de informacion
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de personas a encuestar"));

            //Procesamiento de la informacion, ciclo para consulta usuarios y recorre el ciclo hasta que se cumpla la condicion
            //Salida: dependiendo el valor ingresado en salario, pintara el mensaje de acuerdo a la condicion.
            for (int i = 1; i <= n; i++) {
                salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario de la persona " + i));
                if (salario >= 4000000) {
                    JOptionPane.showMessageDialog(null, "¡Felicidades tienes salario de un profesional! :)");
                } else
                    JOptionPane.showMessageDialog(null, ":( Aun no tienes salario de profesional, sigue estudiando...");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, ingresa un valor correcto");
        }

    }

}
