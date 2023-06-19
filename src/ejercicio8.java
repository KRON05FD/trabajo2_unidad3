import javax.swing.JOptionPane;

/**
 * @author andresnitolamoreno
 * Fecha: viernes 16 de junio 2023
 * Materia: Introducción al Desarrollo de Software
 * Corporacion universitaria remington
 */
/*8. (N) obreros necesitan calcular su salario semanal, el cual se obtiene de la siguiente manera:
Si trabaja 40 horas o menos se le paga un salario de $20000 por hora,
si trabaja más de 40 horas se le paga un salario de $20000 por cada una de las primeras 40 horas
y un salario de $25000 por cada hora extra. Utilizar el ciclo repita.
 */
public class ejercicio8 {
    public static void main(String[] args) {
        //Declaro variables
        int n = 0, i = 1, horastrabajadas = 0;
        double apagar = 0;
        try {
            //Entrada: numero de trabajadores a procesar
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de empleados a procesar"));
            //Proceso: ciclo repita
            do {
                //Entrada: numero de horas trabajadas
                horastrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de horas trabajadas"));
                //Proceso: si horas trabajadas es menor o igual que 40 calculo el numero de horas por 20.000
                if (horastrabajadas <= 40) {
                    apagar = horastrabajadas * 20000;
                } else {
                    //Si no se cumple es decir que es mayor calculo las horas trabajadas menos las 40 por 25.000 y le sumo los 800.000 de las primeras 40
                    apagar = (horastrabajadas - 40) * 25000 + 800000;
                }
                //Salida: imprimo en pantalla el valor a pagar al trabajador segun la condicion
                JOptionPane.showMessageDialog(null, "El valor a pagar al empleado es $" + apagar);
                i++;//Incremento el contador

            } while (i <= n);//Valido si el contador es menor o igual a la varia n es decir numero de empleadois


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, ingresa un valor correcto");
        }

    }

}
