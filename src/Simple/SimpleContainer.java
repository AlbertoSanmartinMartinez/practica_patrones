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
public class SimpleContainer implements SimpleInjector, SimpleFactory{

    private Map<String, Object> map_constant;
    private Map<String, SimpleFactory> map_factory;
    
    public SimpleContainer () {
        this.map_constant = new HashMap<String, Object>();
        this.map_factory = new HashMap<String, SimpleFactory>();
    }
    
    @Override
    public void registerConstat(String name, Object value) throws DependencyException {
        System.out.println("Registramos la constante");
        if (map_constant.containsKey(name)) {
            throw new DependencyException("El nombre ya está registrado.");
        }
        else {
            map_constant.put(name, value); //convertimos obejto en integer
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
        System.out.println("Registramos la factoria");
        Object[] params = parameters;
        
        Object factory = create(params);
        if (map_factory.containsKey(name)) {
            throw new DependencyException("El nombre ya està registrado");
        }
        else {
            map_constant.put(name, creator);
        }
    }    

    @Override
    public Object create(Object... param) throws DependencyException {
        System.out.println("Creamos la factoria");
        System.out.println("" + param.getClass());
        /*
        if (param.getClass()) {
            
        }
        else if () {
            
        }
        else if () {
            
        }
        else if () {
            
        }
        else {
            throw new DependencyExceptio("Este tipo de factoria no existe");
        }
                */
        return null;
    }
}
