import java.util.ArrayList;

//extends NombreClasePadre
public class Monstruo extends Personaje{

    //cuernos
    //tentaculos
    //color
    //habilidades
    private double cuernos;
    private double tentaculos;
    private String color;
    private ArrayList<String> habilidades = new ArrayList<>();

    public Monstruo(String nombre, double estatura, double peso, double cuernos, double tentaculos, String color, ArrayList<String> habilidades) {
        super(nombre, estatura, peso);
        this.cuernos = cuernos;
        this.tentaculos = tentaculos;
        this.color = color;
        this.habilidades = habilidades;
        System.out.println("Soy el constructor hijo");
    }

    public double getCuernos() {
        return cuernos;
    }

    public void setCuernos(double cuernos) {
        this.cuernos = cuernos;
    }

    public double getTentaculos() {
        return tentaculos;
    }

    public void setTentaculos(double tentaculos) {
        this.tentaculos = tentaculos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    //espantar
    //trabajar
    //hacerReir
    public void espantar(){}
    public void trabajar(){}
    public void hacerReir(){}
}
