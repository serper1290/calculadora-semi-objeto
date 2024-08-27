package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public int resta(int a, int b){
      int resultado = a - b;
    return resultado;
    }
  public int suma(int a, int b) {
    int resultado = a + b;
    return resultado;}
  
   public int multiplicacion(int a, int b) {
    int resultado = a * b;
    return resultado;}
   
  public double division(double a, double b) {
    double resultado = a / b;
    return resultado;}
    
   public static void main (String[] args) {
       String firstNumber;
       String secondNumber;
       String selection;
       int n1;
       int n2;      
       int c;
       
       Calculadora calculo = new Calculadora();
       
       selection = JOptionPane.showInputDialog( "Enter option\nsuma:  1\nresta:  2\nmultiplicacion:  3\ndivision:  4");
       firstNumber = JOptionPane.showInputDialog( "ingrese el primer nuemro" );
       secondNumber = JOptionPane.showInputDialog( "ingrese el segundo numero" );
       
       n1 = Integer.parseInt( firstNumber );
       n2 = Integer.parseInt( secondNumber );
       c = Integer.parseInt(selection);
       
       if(c==1){
           JOptionPane.showMessageDialog(null,"su suma es: " + calculo.suma(n1, n2));
       }
       if(c==2){
           JOptionPane.showMessageDialog(null,"su resta es : "+calculo.resta(n1, n2));
       }
       if(c==3){
           JOptionPane.showMessageDialog(null,"su multiplicacion es : "+calculo.multiplicacion(n1, n2));
       }
       if(c==4){
           JOptionPane.showMessageDialog(null,"su division es : "+ calculo.division(n1, n2));
       }
   }
}
