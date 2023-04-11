package developingman.sample_Project;

import developingman.sample_Project.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanTest {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(DependencyConfig.class);

        MemberService memberService = ac.getBean(MemberService.class);

        System.out.println(MemberService.class.isInstance(memberService));
    }
}
