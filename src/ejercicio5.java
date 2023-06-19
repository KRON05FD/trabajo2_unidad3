import javax.swing.JOptionPane;

/**
 * @author andresnitolamoreno
 * Fecha: viernes 16 de junio 2023
 * Materia: Introducción al Desarrollo de Software
 * Corporacion universitaria remington
 */

/*5. Crear un programa para generar los siguientes valores pidiendo el límite en la variable n,
por ejemplo, si se digita 4 entonces se deberá mostrar:
1,2,3,4
1,2,3
1,2
1   */
public class ejercicio5 {
    public static void main(String[] args) {
        //Declaracion de variables
        String limitecadena;
        try {
            //Entrada: se solicita el limite para realizar la secuancia
            limitecadena = JOptionPane.showInputDialog(null, "Ingrese el límite para generar la secuencia:");
            //Se parsea en valor ingresado como cadena a entero
            int limite = Integer.parseInt(limitecadena);
            //Se le pasa como entero el valor limite a la funcion que genera la secuancia
            generarsecuencia(limite);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, ingresa un valor correcto");
        }
    }

    //Se crea funcion que recibe el valor de limite
    public static void generarsecuencia(int n) {
        //Se utiliza la clase de java que me concatena en la variable resultado
        StringBuilder resultado = new StringBuilder();
        //Se recorren don ciclos para el primero se decrementara para que la seria se pinte de la forma y las cantidad de veces del ciclo
        //El segundo se incrementa, agrega los numeros en el orden y cuando el valor anterior sea menor agrega la (,)
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                resultado.append(j);
                if (j < i) {
                    resultado.append(",");
                }
            }
            //Cuando termina el ciclo le agregamos un enter o salto de linea
            resultado.append("\n");
        }
        //Pintamos lo que se concatena en la variable resultado como cadena
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
