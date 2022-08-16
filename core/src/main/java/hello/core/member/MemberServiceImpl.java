package hello.core.member;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memoryMemberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memoryMemberRepository) {
        this.memoryMemberRepository = memoryMemberRepository;
    }

    @Override
    public void join(Member member) {
        memoryMemberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memoryMemberRepository.findById(memberId);
    }

    public MemberRepository getMemberRepository() {
        return memoryMemberRepository;
    }
}
