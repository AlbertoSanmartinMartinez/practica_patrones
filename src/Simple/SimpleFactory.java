/**
 *
 * @author albertosanmartinmartinez
 */

package Simple;

//clase que permite al SimpleContainer crear nuevas instancias
public interface SimpleFactory {
    
    Object create (Object param) throws DependencyException;
}
