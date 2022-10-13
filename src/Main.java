public class Main {
    public static void main(String[] args) {
        sumar(5, 7, 3);
        Coche miCoche = new Coche();
        miCoche.incremetarPuertas();
    }

    public static int sumar(int num1, int num2, int num3) {
        int resultado;
        resultado = num1 + num2 + num3;
        System.out.println(resultado);

        return resultado;
    }
}

    class Coche {
        public int puertas = 4;
        public void incremetarPuertas() {
            this.puertas++;
            System.out.println(puertas);
        }

    }



