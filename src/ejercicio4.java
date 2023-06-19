import javax.swing.JOptionPane;

/**
 * @author andresnitolamoreno
 * Fecha: viernes 16 de junio 2023
 * Materia: Introducción al Desarrollo de Software
 * Corporacion universitaria remington
 */

/*4. lea de un mismo registro tres notas de un estudiante. Calcule e imprima la nota definitiva sacando el promedio.
Si la nota definitiva es mayor o igual a 3,0 imprima el mensaje “gano satisfactoriamente”, de lo contrario imprima un mensaje que diga “perdió la materia”.
 */

public class ejercicio4 {
    public static void main(String[] args) {
        //Declaracion de variables
        double nota1 = 0, nota2 = 0, nota3 = 0, promedio = 0;
        String nombre;
        try {
            //Entrada de informacion
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2"));
            nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3"));
            //Procesamiento de informacion
            promedio = (nota1 + nota2 + nota3) / 3;

            if (promedio >= 3) {
                JOptionPane.showMessageDialog(null, nombre + " Su nota definitiva es: " + promedio + " Aprobaste la materia");
            } else
                JOptionPane.showMessageDialog(null, nombre + " Su nota definitiva es: " + promedio + " Reprobaste la materia");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, ingresa un valor correcto");
        }

    }

}
