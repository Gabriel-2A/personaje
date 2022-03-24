import java.util.ArrayList;

//extends NombreClasePadre
public class Monstruo extends Personaje{

    //cuernos
    //tentaculos
    //color
    //habilidades
    private boolean cuernos;
    private boolean tentaculos;
    private String color;
    private ArrayList<String> habilidades = new ArrayList<>();

    public Monstruo(String nombre, double estatura, double peso, boolean cuernos, boolean tentaculos, String color, ArrayList<String> habilidades) {
        super(nombre, estatura, peso);
        this.cuernos = cuernos;
        this.tentaculos = tentaculos;
        this.color = color;
        this.habilidades = habilidades;
        System.out.println("Soy el constructor monstruo");
    }

    public boolean getCuernos() {
        return cuernos;
    }

    public void setCuernos(boolean cuernos) {
        this.cuernos = cuernos;
    }

    public boolean getTentaculos() {
        return tentaculos;
    }

    public void setTentaculos(boolean tentaculos) {
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
    public void espantar(){
        System.out.println("Espantando");
    }
    public void trabajar(){
        System.out.println("trabajando");
    }
    public void hacerReir(){
        System.out.println("JAJAJAJAJAJA");
    }
}
