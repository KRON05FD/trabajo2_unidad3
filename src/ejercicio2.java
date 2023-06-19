import javax.swing.JOptionPane;

/**
 * @author andresnitolamoreno
 * Fecha: jueves 15 de junio 2023
 * Materia: Introducción al Desarrollo de Software
 * Corporacion universitaria remington
 */

/*2. Leer de un registro los datos de un trabajador así:
Salario básico por día: número de días trabajados, incentivos y deducciones.
Calcular e imprimir el salario neto a pagar teniendo presente Si el salario esta entre $800000 y $1500000 auméntele el 5%.
 */

public class ejercicio2 {
    public static void main(String[] args) {
        //Declaración de variables
        int diastrabajados = 0;
        double basico = 0, incentivos = 0, deducciones = 0, neto = 0, valorapagar = 0;
        //trycatch control de errores
        try {
            //Entrada de informacion salario basico, diastrabajados, incentivos y deducciones
            basico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario por dia del trabajador"));
            diastrabajados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias laborados"));
            incentivos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de los incentivos"));
            deducciones = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las deducciones a realizar"));
            //Procesamiento calculo valor a pagar
            valorapagar = ((basico * diastrabajados) + incentivos) - deducciones;
            //Condicional para identificar si el sueldo esta entre 800.000 y 1.500.0000 para hacer incremento del 5%
            if (valorapagar >= 800000 && valorapagar <= 1500000) {
                valorapagar = valorapagar + (valorapagar * 0.05);
            }
            //Salida de informacion
            JOptionPane.showMessageDialog(null, "###### Liquidación de nomina ######\n\n-Salario basico $: " + basico +
                    "\n-Dias trabajados: " + diastrabajados + "\n-Valor de incentivos $: " + incentivos +
                    "\n---------------------------" +
                    "\n-Valor deducciones $: " + deducciones +
                    "\n---------------------------" +
                    "\n-El valor a pagar es $: " + valorapagar + "\n\n#############################");
            //mensaje en caso de ingresar informacion errada
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, ingresa un valor correcto");
        }
    }
}
