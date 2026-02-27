public class Mascota {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    private String especie;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    private int edad;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private double peso;

    public boolean isSaludable() {
        return saludable;
    }

    public void setSaludable(boolean saludable) {
        this.saludable = saludable;
    }

    private boolean saludable;

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", saludable=" + saludable +
                '}';
    }

    public Mascota(String nombre, String especie, int edad, double peso, boolean saludable) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.saludable = saludable;
    }


    public int cumplirAnios() {
        edad++;
        return edad;
    }


    public double engordar() {
        peso += 1;
        return peso;
    }


    public double adelgazar() {
        if (peso > 1) {
            peso -= 1;
        }
        return peso;
    }


    public boolean enfermar() {
        saludable = false;
        return saludable;
    }


    public boolean recuperarSalud() {
        saludable = true;
        return saludable;
    }


    public String mostrarFicha() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", saludable=" + saludable +
                '}';
    }


}
