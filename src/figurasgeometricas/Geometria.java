
package figurasgeometricas;

    import java.math.*;

public class Geometria {
    
    double resul;
    
    
    public double perimetroCirculo(double radio){
        resul= 2*Math.PI*radio;
        return(resul);
    }
    
    public double areaCirculo(double radio){
        resul= Math.PI*Math.pow(radio,2);
        return(resul);
    }
   
    public double perimetroCuadrado(double lado){
        resul= 4*lado;
        return(resul);
    }
    
    public double areaCuadrado(double lado){
        resul= Math.pow(lado,2);
        return(resul);
    }
    
    public double perimetroTriangulo(double lado, double lado1,double lado2){
        resul= lado+lado1+lado2;
        return(resul);
    }
   
    public double areaTriangulo(double lado, double lado1,double lado2){
        double sp= (perimetroTriangulo(lado, lado1, lado2))/2;
        resul= Math.sqrt(sp*(sp-lado)*(sp-lado1)*(sp-lado2));
        return(resul);
    }
    
}
