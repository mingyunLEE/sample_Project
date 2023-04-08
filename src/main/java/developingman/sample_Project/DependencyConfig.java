package developingman.sample_Project;

import developingman.sample_Project.member.MemberRepository;
import developingman.sample_Project.member.MemberService;
import developingman.sample_Project.snack.SnackRepository;
import developingman.sample_Project.snack.SnackService;

public class DependencyConfig {
    public MemberService memberService() {
        return new MemberService(new MemberRepository());
    }
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }

    public SnackService snackService(){
        return new SnackService(new SnackRepository());
    }

    public SnackRepository snackRepository() {
        return new SnackRepository();
    }
}
