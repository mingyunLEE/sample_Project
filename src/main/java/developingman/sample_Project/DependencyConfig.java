package developingman.sample_Project;

import developingman.sample_Project.member.MemberRepository;
import developingman.sample_Project.member.MemberService;
import developingman.sample_Project.snack.SnackRepository;
import developingman.sample_Project.snack.SnackService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(new MemberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }

    @Bean
    public SnackService snackService(){
        return new SnackService(new SnackRepository());
    }
    @Bean
    public SnackRepository snackRepository() {
        return new SnackRepository();
    }
}
