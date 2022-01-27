package ExtraerClase;

import java.util.Date;

public class Customer {
    private String name;
    private String dni;

    public Customer(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    public boolean isValid() {
        boolean result = false;
        // Some code here...
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}