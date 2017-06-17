/**
 *
 * @author albertosanmartinmartinez
 */

package Common;

class DependencyException extends Exception {
    
    //private String exception;
    
    public DependencyException (Exception cause) {
        super(cause);
    }
    
    public DependencyException (String message) {
        super(message);
    }
    
    /*
    - registrar un nombre que ya tiene una factoria registrada
    - crear objetos sobre un nombre no registrado
    - intentar crear objetos que no tienen sus dependencias registradas
    pasar a una factoria un obeto de tipo inadecuado para ser usado en el constructor de la clase
    */
}
