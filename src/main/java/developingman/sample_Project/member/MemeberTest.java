package developingman.sample_Project.member;

import developingman.sample_Project.DependencyConfig;

public class MemeberTest {
    public static void main(String[] args){
        DependencyConfig dependencyConfig = new DependencyConfig();
        MemberService memberService = dependencyConfig.memberService();

        Member member = new Member(0L, "leenom@korean.com","LeeNom" , "010-1234-1234");
        memberService.createMember(member);

        Member currentMember = memberService.getMember(0L);

        System.out.println("회원 가입한 유저 : " + member.getName());
        System.out.println("현재 첫번째 유저 : " + currentMember.getName());

        if(member.getName().equals(currentMember.getName())) {
            System.out.println("새롭게 가입한 유저와 현재 유저가 같습니다.");
        }

        memberService.deleteMember(0L);

        if(memberService.getMember(0L) == null){
            System.out.println("회원 삭제가 정상적으로 완료 되었습니다.");
        }
    }
}
