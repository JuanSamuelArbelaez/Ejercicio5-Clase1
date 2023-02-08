//Valores de un cubo

package ejercicio5.clase1;

import javax.swing.JOptionPane;

public class Ejercicio5Clase1
{
    public static void main(String[] args)
    {
        double lado, areaCaras, perimetro, volumen;
        
        lado=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en centimetros (cm) de uno de los lados de un cubo regular: "));
        
        perimetro=12*lado;
        areaCaras=lado*lado;
        volumen=lado*lado*lado;
        
        JOptionPane.showMessageDialog(null, "El perimetro del cubo es: "+perimetro+"cm" + 
                                            "\nEl area de las caras del cubo es: "+areaCaras+"cm²" + 
                                            "\nEl volumen del cubo es: "+volumen+"cm³");
    }
}