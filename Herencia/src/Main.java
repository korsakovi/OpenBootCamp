public class Main {
    public static void main(String[] args) {
        Client client1 = new Client();
        var edad = client1.age = 25;
        var telf = client1.phone = "689452123";
        var nombre = client1.name = "Jacob";
        var credito = client1.credit = 300;

        System.out.println("Mi edad es de:" + edad + " con el teléfono:" + telf + ".Me llamo " + nombre + " y tengo un crédito de:" + credito);

        Trabajador trabajador1 = new Trabajador();
        var edadTrabajador = trabajador1.age = 36;
        var telfTrabajador = trabajador1.phone = "68568123";
        var nombreTrabajador = trabajador1.name = "Paco";
        var salarioTrabajador = trabajador1.salario = 1500;

        System.out.println("Mi edad es de:" + edadTrabajador + " con el teléfono:" + telfTrabajador + ".Me llamo " + nombreTrabajador + " y tengo un salario de:" + salarioTrabajador);

    }
}

class Persona {
    int age;
    String name;
    String phone;
}

class Client extends Persona {
    int credit;
}

class Trabajador extends Persona {
    int salario;
}