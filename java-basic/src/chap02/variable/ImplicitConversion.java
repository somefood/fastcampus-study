package chap02.variable;

public class ImplicitConversion {
    public static void main(String[] args) {
        byte bNum = 10;
        int iNum = bNum; // 묵시적 형 변환

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2; // 더 정밀

        System.out.println(iNum2);
        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum; // 정수가 플로트로 바뀌고 더블로 최종 변환

        System.out.println(dNum);
    }
}
