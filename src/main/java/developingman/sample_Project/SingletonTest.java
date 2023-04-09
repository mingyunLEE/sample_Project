package developingman.sample_Project;

import developingman.sample_Project.singleton.SingletonService;

public class SingletonTest {

    static SingletonService singletonService1 = SingletonService.getInstance();
    static SingletonService singletonService2 = SingletonService.getInstance();

    public static void main(String[] args){
        System.out.println("memberService1 : " + singletonService1);
        System.out.println("memberService2 : " + singletonService2);

    }
}
