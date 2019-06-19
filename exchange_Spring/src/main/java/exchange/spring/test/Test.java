package exchange.spring.test;

import exchange.spring.beans.IFinance;
import exchange.spring.beans.IStockDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IFinance finance = (IFinance) context.getBean("finance");
        System.out.println(finance.exchange("EURUSD=x", 1000));
    }

}
