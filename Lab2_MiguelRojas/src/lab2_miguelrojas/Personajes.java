
package lab2_miguelrojas;


public class Personajes {
    //Atributos
    private String tipo_personaje;
    private String nombre;
    private String raza;
    private Double estatura;
    private int peso;
    private int años;
    private String descripcion;
    private String nacionalidad;
    private int HP;
    private int AC;

    //Constructor
    public Personajes(String tipo_personaje, String nombre, String raza, Double estatura, int peso, int años, String descripcion, String nacionalidad, int HP, int AC) {
        this.tipo_personaje = tipo_personaje;
        this.nombre = nombre;
        this.raza = raza;
        this.estatura = estatura;
        this.peso = peso;
        this.años = años;
        this.descripcion = descripcion;
        this.nacionalidad = nacionalidad;
        this.HP = HP;
        this.AC = AC;
    }
    
    //Mutadores

    public String getTipo_personaje() {
        return tipo_personaje;
    }

    public void setTipo_personaje(String tipo_personaje) {
        this.tipo_personaje = tipo_personaje;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }
    

    //Metodo Administrativo

    @Override
    public String toString() {
        return "Personaje\nClase : " 
                + tipo_personaje + "\nNombre : " 
                + nombre + "\nRaza : " 
                + raza + "\nEstatura : " 
                + estatura + "m\nPeso : " 
                + peso + " kg\nAños : " 
                + años + "\nDescripcion : " 
                + descripcion + "\nNacionalidad : " 
                + nacionalidad + "\nHP: " 
                + HP + "\nAC : " 
                + AC ;
    }
    
 
}
