public class Personas {
    public static void main(String[] args) {
        Persona Jacobo = new Persona();

        Jacobo.setAge(49);
        Jacobo.setName("Jacob");
        Jacobo.setPhone("689120520");

        System.out.println("Mi nombre es " + Jacobo.getName() + ".Tengo " + Jacobo.getAge() + " años" + " y mi número de teléfono es el" + Jacobo.getPhone());
    }
}

 class Persona {
    private int age;
    private String name;
    private String phone;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }
}
