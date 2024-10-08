//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automovil bmw = new Automovil();
        //Utilizar set para asignar valores a los atributos declarados como private.
        bmw.setMarca("BMW");
        bmw.setModelo("i320");
        bmw.setColor("Negro");
        bmw.setCilindraje(3);
        //Imprimir los datos
        System.out.println("Marca: " +bmw.getMarca());
        System.out.println("Modelo: " +bmw.getModelo());
        System.out.println("Color: " +bmw.getColor());
        System.out.println("Cilindraje: " +bmw.getCilindraje());
    }
}