public class Automovil {
    //Declaración de atributos
    private String marca = "MERCEDES BENZ";
    private String modelo;
    private String color = "Verde"; //Así viene el molde.
    private float cilindraje;
    private float consumo = 40;
    /*
    1. Siempre se debe llegar a los atributos mediante LOS METODOS ya sea con los getters o setters.
    2. Nunca directamente.
    3. A un atributo también se le llama ESTADO de una clase.
     */

    //Constructores.

    //Getters y Setters
    // SET: ASIGNO  GET = LEO.
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }
    //Cuando trabajo dentro de la clase no necesito  utilizar el set o el get para asignar valores.

}
