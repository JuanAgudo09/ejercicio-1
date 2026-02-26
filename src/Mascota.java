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

    public void crearMascota(String _nombre, String _especie, int _edad, double _peso, boolean _saludable){

        nombre = _nombre;
        especie = _especie;
        edad = _edad;
        peso = _peso;
        saludable = _saludable;

    }

    //ni preguntando fui capaz de usar metodos propios bien

}
