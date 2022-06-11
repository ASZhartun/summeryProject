import configurations.ApartmentHolderConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApartmentHolderConfiguration.class);
        System.out.println(context);
    }
}
