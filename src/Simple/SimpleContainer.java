/**
 *
 * @author albertosanmartinmartinez
 */


package Simple;
import Common.DependencyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import Implementations.*;
import java.lang.Integer;

//clase que implementa la interfaz SimpleInjector
public class SimpleContainer implements SimpleInjector {

    private Map<String, Integer> map_constant;
    private Map<String, Object> map_factory;
    
    public SimpleContainer () {
        this.map_constant = new HashMap<String, Integer>();
        this.map_factory = new HashMap<String, Object>();
    }
    
    @Override
    public void registerConstat(String name, Object value) throws DependencyException {
        //System.out.println("Registramos la constante");
        if (map_constant.containsKey(name)) {
            throw new DependencyException("El nombre ya está registrado.");
        }
        else {
            map_constant.put(name, (Integer) value);
            /*
            if (value instanceof Integer) {
                map_constant.put(name, (Integer) value);
            }
            else if (value instanceof String) {
                map_constant.put(name, (String) value);
            }
            */
        }
    }

    @Override
    public Object getObject(String name) throws DependencyException {
        if (map_constant.containsKey(name)) {
            return map_constant.get(name);
        }
        else if (map_factory.containsKey(name))  {
            return map_factory.get(name);
        }
        else {
            return new DependencyException("No hay un valor asociado a este nombre.");
        }
    }

    @Override
    public void registerFactory(String name, SimpleFactory creator, String... parameters) throws DependencyException {
        //System.out.println("Registramos la factoria");
        Object[] array = new Object[parameters.length];
        for (int i=0; i<parameters.length; i++) {
            array[i] = map_constant.get(parameters[i]);
        }
        this.map_factory.put(name, creator.create(array));
    }    
}
