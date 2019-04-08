import org.docx4j.XmlUtils;
import org.docx4j.jaxb.Context;
import org.docx4j.jaxb.NamespacePrefixMapperUtils;
import org.docx4j.wml.P;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloWorld implements BundleActivator {
	
    public void start(BundleContext ctx) {
        System.out.println("Hello world.");
        
        try {
	        P p = Context.getWmlObjectFactory().createP();
	        System.out.println("NamespacePrefixMapper: " + NamespacePrefixMapperUtils.getPrefixMapper().getClass().getName());
	        System.out.println(XmlUtils.marshaltoString(p));
	        System.out.println("it worked.");
        } catch (Throwable e) {
        	e.printStackTrace();
        }
        
    }
    public void stop(BundleContext bundleContext) {
        System.out.println("Goodbye world.");
    }
}	
