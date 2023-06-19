import javax.swing.JOptionPane;

/**
 * @author andresnitolamoreno
 * Fecha: jueves 15 de junio 2023
 * Materia: Introducción al Desarrollo de Software
 * Corporacion universitaria remington
 */

/*1. El sueldo de un vendedor es de $800000 mensuales más un 5% de comisión sobre las ventas mensuales realizadas.
Si al total obtenido hay que descontarle un 20% de rete fuente, indicar el sueldo neto al mes.
 */
public class ejercicio1 {
    public static void main(String[] args) {
        //Declaro constantes
        final int basico = 800000;
        //Declaro variables
        double ventas = 0, sueldoneto = 0, retefuente = 0, comision = 0, salariofinal = 0;
        try {
            //Entrada de informacion ventas del mes
            ventas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de las ventas realizadas en el mes: "));
            //Procesamiento de la informacion comisiones, sueldo neto, retefuente y salario final
            comision = ventas * 0.05;
            sueldoneto = basico + comision;
            retefuente = sueldoneto * 0.20;
            salariofinal = sueldoneto - retefuente;
            //Salida de la informacion
            JOptionPane.showMessageDialog(null, "###### Desprendible de pago ######\n\n-Salario basico $: " + basico +
                    "\n-Ventas realizadas en el mes $: " + ventas + "\n-Comisión del mes es $: " + comision +
                    "\n---------------------------" +
                    "\n-Salario neto $: " + sueldoneto + "\n-Descuento retefuente $: " + retefuente +
                    "\n---------------------------" +
                    "\n-El valor a pagar es $: " + salariofinal + "\n\n#############################");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, ingresa un valor correcto");
        }
    }

}
