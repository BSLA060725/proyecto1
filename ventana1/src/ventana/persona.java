
package ventana;


public class persona {
    private String nonbre;
    private int edad;
    private String nacionalidad;

    public persona(String nonbre, int edad, String nacionalidad) {
        this.nonbre = nonbre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public String getNonbre() {
        return nonbre;
    }

    public void setNonbre(String nonbre) {
        this.nonbre = nonbre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    @Override
    public String toString(){
        return this.nonbre;
    }
}
