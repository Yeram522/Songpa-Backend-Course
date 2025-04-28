package study202502425;

public class logical {

    public static void main(String[] args) {
        // 동생과 참거짓참 내기를 하기로 했어요.
        // 동생은 1.거짓 2.참 3.참 4.거짓을 낸다고 하네요.
        // 다음과 같은 논리식이 주어질 떄
        int a = 14;
        int b = 60;
        int c = 50;
        int d = 99;

        //아래 주석을 이용하여 동생과 반대값을 내도록 해봅시다(연산자는 삭제하지 말아주세요)
        System.out.println((a<b) && (c<d));
        System.out.println((a>b) && (c>d));
        System.out.println((a>b) || (c>d));
        System.out.println((a<b) ||(c<d));
    }
}
