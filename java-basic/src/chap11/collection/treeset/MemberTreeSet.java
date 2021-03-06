package chap11.collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<>(new Member()); // Comparator일 때는 인자로 new 객체 넣어줘야함
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> ir = treeSet.iterator();
        while(ir.hasNext()) {
            Member member = ir.next();
            if(member.getMemberId() == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "번호가 존재하지 않습니다.");;
        return false;
    }

    public void showAllMember() {
        for(Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
