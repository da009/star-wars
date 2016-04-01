
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    private int INICIO = 0;
    private int FIN_NOMBRE = 3;
    private int FIN_APELLIDO = 3;
    private int FIN_CIUDADNAC = 3;
    private int FIN_APELLIDOMADRE = 2;
    
    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String generateStarWarsName(String nombre, String apellido, String apellidoMadre, String ciudadNac)
    {
        return apellido.substring(INICIO, FIN_APELLIDO) + nombre.toLowerCase().substring(INICIO, FIN_NOMBRE) +
            " " +  apellidoMadre.substring(INICIO, FIN_APELLIDOMADRE) +
            ciudadNac.toLowerCase().substring(INICIO, FIN_CIUDADNAC);
    }
}
