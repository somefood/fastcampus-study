package chap10.string;

public class StringTest2 {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");
        System.out.println(System.identityHashCode(java));

        java = java.concat(android); // 새로 메모리 변경됨
        System.out.println(java);
        System.out.println(System.identityHashCode(java));
    }
}
