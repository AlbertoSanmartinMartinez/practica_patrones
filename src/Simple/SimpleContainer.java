/**
 *
 * @author albertosanmartinmartinez
 */


package Simple;
import Common.DependencyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//clase que implementa la interfaz SimpleInjector
public class SimpleContainer implements SimpleInjector{

    private Map<Object, String> map;
    
    public SimpleContainer () {
        this.map = new HashMap<Object, String>();
    }
    
    @Override
    public void registerConstat(String name, Object value) throws DependencyException {
        map.put((Integer) value, name); //convertimos obejto en integer
    }

    @Override
    public Object getObject(String name) throws DependencyException {
        Iterator iter = map.keySet().iterator();
        while (iter.hasNext()) {
            Object key = iter.next();
            if (map.get(key).equals(name)) {
                return key;
            }
        }
        return new DependencyException("No hay un valor asociado a este nombre.");
    }

    @Override
    public void registerFactory(String name, SimpleFactory creator, String parameters) throws DependencyException {
        if () {
            
        }
        name= 
    }    
}
