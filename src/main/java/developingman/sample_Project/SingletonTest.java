package developingman.sample_Project;

import developingman.sample_Project.member.MemberService;
import developingman.sample_Project.singleton.SingletonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonTest {

    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DependencyConfig.class);

    static MemberService memberService1 = ac.getBean("memberService", MemberService.class);
    static MemberService memberService2 = ac.getBean("memberService", MemberService.class);

    public static void main(String[] args){
        System.out.println("memberService1 : " + memberService1);
        System.out.println("memberService2 : " + memberService2);

    }
}
