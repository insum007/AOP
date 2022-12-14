package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
        
        ShoppingCard card=context.getBean(ShoppingCard.class);
        card.checkOut("CANCELLED");
    }
    
    
}
