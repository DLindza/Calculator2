package lindsay.devon.Calculator2;

/**
 * Created by devon on 10/2/16.
 */
class DivisionByZeroException extends Exception {}
class ComplexNumberException extends Exception {}

public class Calculator {

   static int add(int x, int y) {
       return x + y;
   }

   static int subtract(int x, int y) {
       return x - y;
   }

   static int multiply(int x, int y) {
       return x*y;
   }

   static int divide(int x, int y) throws DivisionByZeroException {
       if(y == 0) {
           throw new DivisionByZeroException();
       }
       return x/y;
   }

   static double squareRoot(int x) throws ComplexNumberException {
        if(x < 0) {
            throw new ComplexNumberException();
        }
        return Math.sqrt(x);
   }

}
