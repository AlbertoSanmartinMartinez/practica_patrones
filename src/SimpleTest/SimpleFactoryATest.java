/**
 *
 * @author albertosanmartinmartinez
 */

package SimpleTest;

import Common.DependencyException;
import Implementations.*;
import Simple.*;
import SimpleFactories.*;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class SimpleFactoryATest {
    @Test
    public void simple_factory_a () throws DependencyException {
        SimpleInjector injector = new SimpleContainer();
        InterfaceD d = (InterfaceD) new FactoryD().create((Object)2);
        InterfaceB b = (InterfaceB) new FactoryB().create((Object)d);
        InterfaceC c = (InterfaceC) new FactoryC().create((Object)"prueba");
        injector.registerConstat("IFb", b);
        injector.registerConstat("IFc", c);
        injector.registerFactory("A", new FactoryA(), "IFb", "IFc");
        InterfaceA a = (InterfaceA) injector.getObject("A");
        assertThat(a, is(instanceOf(ImplementationA.class)));
        ImplementationA a1 = (ImplementationA) a;
        
        assertThat(a1.b, is(b));
        assertThat(a1.c, is(c));
        
        System.out.println("Test A Ok");
    }
    
    public static void main(String[] args) throws DependencyException {
        SimpleFactoryATest simple_factory_a = new SimpleFactoryATest();
        simple_factory_a.simple_factory_a();
    }
}
