/**
 *
 * @author albertosanmartinmartinez
 */

package SimpleTest;

import Common.DependencyException;
import Implementations.ImplementationB;
import Implementations.*;
import Simple.*;
import SimpleFactories.*;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class SimpleFactoryBTest {
    @Test
    public void simple_factory_b () throws DependencyException {
        SimpleInjector injector = new SimpleContainer();
        InterfaceD d = (InterfaceD) new FactoryD().create((Object)1);
        injector.registerConstat("IF", d);
        injector.registerFactory("B", new FactoryB(), "IF");
        InterfaceB b = (InterfaceB) injector.getObject("B");
        assertThat(b, is(instanceOf(ImplementationB.class)));
        ImplementationB b1 = (ImplementationB) b;
        assertThat(b1.d, is(d));
        System.out.println("Test B Ok");
    }
    
    public static void main(String[] args) throws DependencyException {
        SimpleFactoryBTest simple_factory_b = new SimpleFactoryBTest();
        simple_factory_b.simple_factory_b();
    }
}
