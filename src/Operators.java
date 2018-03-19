public abstract class Operators {
  public static double add(double a, double b){
    return a + b;
  }
  public static double subtract(double a, double b){
    return a - b;
  }
  public static double multiply(double a, double b){
    return a * b;
  }
  public static double divide(double a, double b) {
    return a / b;
  }
  public static int modulo(int a, int b){
    return a % b;
  }
  public static double sqrt(double a) {
    return Math.sqrt(a);
  }
  public static double exponent(double a, double b) {
    return Math.pow(a, b);
  }
  public static double naturalLog(double a) {
    return Math.log(a);
  }
  public static double log10(double a) {
    return Math.log10(a);
  }
  public static double log(double a, double base){
    return Math.log(a)/Math.log(base);
  }
  public static double natExp(double a){
    return Math.exp(a);
  }
  public static double hypotenuse(double x, double y){
    return Math.hypot(x,y);
  }
  public static double negate(double a){
    return 0 - a;
  }
  public static double inverse(double a){
    return 1 / a;
  }
  public static double square(double a){
    return a * a;
  }
  public static double cube(double a){
    return a * a * a;
  }
  public static double pow10(double a){
    return Math.pow(10,a);
  }
  public static double e(){
    return Math.E;
  }
  public static long factorial(int a){
    if(a <= 0) return 0;
    if(a == 1) return 1;
    return a * factorial(a -1);
  }
  public static double pi() {
    return Math.PI;
  }
  public static double random() {
    return Math.random();
  }
}//end class
