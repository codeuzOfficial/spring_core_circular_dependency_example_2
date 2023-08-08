package dasturlash.uz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentService studentService = (StudentService) context.getBean("studentService");
        System.out.println(studentService);
    }
}