
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    
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
        return apellido.substring(0, 3) + nombre.toLowerCase().substring(0, 3) + " " + 
            apellidoMadre.substring(0, 2) + ciudadNac.toLowerCase().substring(0, 3);
    }
}
