import javax.swing.JOptionPane;

/**
 * @author andresnitolamoreno
 * Fecha: jueves 15 de junio 2023
 * Materia: Introducción al Desarrollo de Software
 * Corporacion universitaria remington
 */

/*3. Diseñe un algoritmo que calcule la velocidad promedio de un automóvil dado el espacio en kilómetros
y el tiempo en horas e imprima un mensaje de exceso de velocidad si la velocidad sobrepasa los 120 kilómetros por hora,
un mensaje de fallas mecánicas si la velocidad no llega a los 40 kilómetros.
 */
public class ejercicio3 {
    public static void main(String[] args) {
        //declaracion de variables
        int distancia = 0;
        float tiempo = 0, velocidad = 0;
        //trycatch control de errores
        try {
            //entrada de informacion distancia, tiempo
            distancia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia recorrida en Km/h"));
            tiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en horas que duro el recorrido"));
            //procesamiento calcula velocidad
            velocidad = distancia / tiempo;
            //Condicional para mostrar mensaje dependiendo la velocidad y salida de informacion
            if (velocidad > 120) {
                JOptionPane.showMessageDialog(null, "Su velocidad es: " + velocidad + " Km/h" + " Exceso de velocidad");
            } else if (velocidad < 40) {
                JOptionPane.showMessageDialog(null, "Su velocidad es: " + velocidad + " Km/h" + " Fallas mecanicas");
            } else {
                JOptionPane.showMessageDialog(null, "Su velocidad es: " + velocidad + " Km/h");
            }
            //mensaje en caso de ingresar informacion errada
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, ingresa un valor correcto");
        }


    }

}
