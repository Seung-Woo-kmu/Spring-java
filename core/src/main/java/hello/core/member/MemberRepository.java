package hello.core.member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);

    default int happy() {
        return 1;
    }
    static void happier() {
        System.out.println("true = " + true);
    }
}
