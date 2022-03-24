import java.sql.SQLOutput;

public class Mocoso extends Personaje{
    //colorPerta
    private String colorPuerta;

    public Mocoso(String nombre, double estatura, double peso, String colorPuerta) {
        super(nombre, estatura, peso);
        this.colorPuerta = colorPuerta;
        System.out.println("estoy en constrcutor de mocoso");
    }

    public String getColorPuerta() {
        return colorPuerta;
    }

    public void setColorPuerta(String colorPuerta) {
        this.colorPuerta = colorPuerta;
    }

    //reir
    public void reir(){
        System.out.println("KKKKKKK");
    }
    //llorar
    public void llorar(){
        System.out.println("¡¡¡¡¡¡AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!!!!!!");
    }
}
