import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest2 {
    class Member {
        private String name;
        private int penaltyCount;
        private String nickName;

        public Member(String name, int penaltyCount, String nickName) {
            this.name = name;
            this.penaltyCount = penaltyCount;
            this.nickName = nickName;
        }

        public int getPenaltyCount() {
            return penaltyCount;
        }
    }

    public static void main(String[] args) {
        StreamTest2 outerClass = new StreamTest2();
        List<StreamTest2.Member> members = Arrays.asList(
                outerClass.new Member("기영이", 2, "바트심슨"),
                outerClass.new Member("기철이", 5, "불꽃드립"),
                outerClass.new Member("오덕", 8, "자라나라머리머"),
                outerClass.new Member("이말룡", 6, "머선129")
        );
        int sum = members.stream().map(s -> s.getPenaltyCount()).reduce(0, (a, b) -> a + b);
        System.out.println("기영이네 페널티의 합은 : " + sum);
    }
}
