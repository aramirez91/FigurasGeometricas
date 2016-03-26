
package figurasgeometricas;

import java.util.Scanner;

public class FigurasGeometricas {

    public static void main(String[] args) {
        
        Geometria operar = new Geometria();
        
        Scanner teclado = new Scanner(System.in);
        int opcion;
        double radio, lado, lado1, lado2;
        double perimetro = 0, area = 0;
        
        System.out.println("Perímetro y Area de un circulo, un triangulo, y un cuadrado");
        System.out.println("");
        System.out.println("Ingrese el número de la operación que desea realizar: ");
        System.out.println("");
        System.out.println("1) Perímetro y área de un circulo");
        System.out.println("2) Perímetro y área de un cuadrado");
        System.out.println("3) Perímetro y área de un triangulo ");
        System.out.println("");
        
        opcion= teclado.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Digite la medida del radio del circulo");
                radio = teclado.nextDouble();
                perimetro= operar.perimetroCirculo(radio);
                area= operar.areaCirculo(radio);
                break;
            case 2: 
                System.out.println("Digite la medida de uno de sus lados");
                lado = teclado.nextDouble();
                perimetro= operar.perimetroCuadrado(lado);
                area= operar.areaCuadrado(lado);
                break;
                
            case 3: 
                System.out.println("Digite la medida de uno de sus lados");
                lado = teclado.nextDouble();
                
                System.out.println("Digite la medida de otro de sus lados");
                lado1 = teclado.nextDouble();
                
                System.out.println("Digite la medida del último de sus lados");
                lado2 = teclado.nextDouble();
                perimetro= operar.perimetroTriangulo(lado, lado1, lado2);
                area= operar.areaTriangulo(lado,lado1,lado2);
                break;
                
            default :
                System.out.println("Opción inválida, por favor intente nuevamente");
                break;
                
                
        }
        
        System.out.println("El perímetro es: "+perimetro);
        System.out.println("El área es: "+area);

    }
    
}
