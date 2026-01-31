public class Calculator 
{
    int add(int num1 , int num2){
     return (num1 + num2) ;}
    int sub(int num1 , int num2){
     return (num1 - num2) ;}
    int mul(int num1 , int num2){
     return (num1 * num2) ;}
    int div(int num1 , int num2){
     return (num1 / num2) ;} 
public static void main(String [] args){
    Calculator Casio = new Calculator();
    int Sum = Casio.add(10,5);
    System.out.println("Sum = "+Sum);
    int dif = Casio.sub(10,5);
    System.out.println("Difference = "+dif);
    int pro = Casio.mul(10,5);
    System.out.println("Product = "+pro);
    int quo = Casio.div(10,5);
    System.out.println("Quotient = "+quo);
}    
}
