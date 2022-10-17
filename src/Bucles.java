

public class Bucles {
    public static void main(String[] args) {
       evaluate(-25, -5, -2, -1);
    }

    public static void evaluate(int num, int numeroWhile, int numDoWhile, int numeroFor) {
       if(num > 0) {
           System.out.println("The number " + num + " is positive");
       } else if (num < 0) {
           System.out.println("The number " + num + " is negative");
       } else {
           System.out.println("The number " + num + " is zero");
       }

       while(numeroWhile < 3) {
           System.out.println(numeroWhile);
           numeroWhile++;
       }

       do {
           System.out.println(numDoWhile);
           numDoWhile++;
       } while(numDoWhile < 3);

       for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
           System.out.println(numeroFor);
       }

       String estacion = "invierno";
       switch ( estacion ) {
           case "primavera":
           System.out.println("Es primavera");
           break;
           case "verano":
               System.out.println("Es verano");
               break;
           case "otoño":
               System.out.println("Es otoño");
               break;
           case "invierno":
               System.out.println("Es invierno");
               break;
           default:
               System.out.println("NO es ninguna estación");
       }
    }

}
