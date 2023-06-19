import javax.swing.JOptionPane;

/**
 * @author andresnitolamoreno
 * Fecha: viernes 16 de junio 2023
 * Materia: Introducción al Desarrollo de Software
 * Corporacion universitaria remington
 */

/*7. En un almacén se hace un 10% de descuento a los clientes cuya compra supere los $100000
¿Cuál será la cantidad que pagaran (N) personas por su compra? Utilice el ciclo mientras.
 */
public class ejercicio7 {
    public static void main(String[] args) {
        //Declaro variables
        int n = 0, i = 1;
        double vrcompra = 0, descuento = 0, apagar = 0;

        //Control de errores
        try {
            //Entrada cantidad de personas a procesar con el que se compara el contador
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de personas"));

            while (i <= n) {
                //Entrada solicito el valor de la compra de cada persona
                vrcompra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la compra"));
                //JOptionPane.showMessageDialog(null, "## Persona ##");
                //Condicional si la compra es mayor que 100.000
                if (vrcompra > 100000) {
                    //Proceso el descuento y calculo el valor a pagar
                    descuento = vrcompra * 0.10;
                    apagar = vrcompra - descuento;
                    //Salida numero de persona, valor de descuento y valor a pagar
                    JOptionPane.showMessageDialog(null, "El valor del descuento para la persona # " + i + ", es $" + descuento +
                            "\nEl valor final a pagar es $" + apagar);
                    i++;//Incremento contador
                } else
                    //Si la compra no supera los 100.000, pinto numero de persona y el valor a pagar
                    JOptionPane.showMessageDialog(null, "El valor de la compra de la persona # " + i + ", no supera $100.000" +
                            "\nEl valor final a pagar es $" + vrcompra);
                i++;//Incremento contador

            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, ingresa un valor correcto");
        }

    }

}
