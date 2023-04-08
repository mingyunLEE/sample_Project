package developingman.sample_Project.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private static Map<Long, Member> members = new HashMap<>();

    public void postMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public Member getMember(Long memberId) {
        return members.get(memberId);
    }

    public void deleteMember(Long memberId){
        members.remove(memberId);
    }
}
