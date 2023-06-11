package Caballeros;

public class Caballero {
    private String nombre;
    private String contelacion;
    private int edad;
    private String altura;
    private int peso;
    private String nacimiento;
    private String tipoSangre;
    private String lugarOrigen;
    private String lugarEntrenamiento;
    private int vida;
    private int puntosAtaque;

    public Caballero(String nombre, String contelacion, int edad, String altura, int peso, String nacimiento, String tipoSangre, String lugarOrigen, String lugarEntrenamiento,int vida,int puntosAtaque) {
        this.nombre = nombre;
        this.contelacion = contelacion;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.nacimiento = nacimiento;
        this.tipoSangre = tipoSangre;
        this.lugarOrigen = lugarOrigen;
        this.lugarEntrenamiento = lugarEntrenamiento;
        this.puntosAtaque=puntosAtaque;
        this.vida=vida;
    }
    public void atacarPunio(){
        System.out.println("Atacando PUM");
    }
    public void defenderseManos(){
        System.out.println("Me estoy defendiendo WOW");
    }

    @Override
    public String toString() {
        return "Caballeros.Caballero{" +
                "nombre='" + nombre + '\'' +
                ", contelacion='" + contelacion + '\'' +
                ", edad=" + edad +
                ", altura='" + altura + '\'' +
                ", peso=" + peso +
                ", nacimiento='" + nacimiento + '\'' +
                ", tipoSangre='" + tipoSangre + '\'' +
                ", lugarOrigen='" + lugarOrigen + '\'' +
                ", lugarEntrenamiento='" + lugarEntrenamiento + '\'' +
                ", vida=" + vida +
                ", puntosAtaque=" + puntosAtaque +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContelacion() {
        return contelacion;
    }

    public void setContelacion(String contelacion) {
        this.contelacion = contelacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getLugarEntrenamiento() {
        return lugarEntrenamiento;
    }

    public void setLugarEntrenamiento(String lugarEntrenamiento) {
        this.lugarEntrenamiento = lugarEntrenamiento;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }
}
