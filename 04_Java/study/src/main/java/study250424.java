public class study250424 {
    public static void main(String[] args) {

        /* 모든 내용은 문제를 위한 가상의 설정이고 연습을 위해 상황이 설정되었으니
        논리적으로 맞지 않아도 throughThrough 해주십쇼
        Q. 송파구에 새로 가게를 열었습니다!
        주석처리된 System.out.println(); 자리에
        300 이하 세 자리 정수 두 개를 곱하여 가게 우편번호를 등록해봅시다
         */
        System.out.println("가게 우편번호 : ");
        System.out.println(123*290);

        /* Q.왠지 좀 독특하게 가게 이름을 지으면 주목을 받을 수 있을 것 같아요
        주석처리된 System.out.println(); 자리에
        소수점 두번째자리까지 떨어지는 실수 두 개를 더하여 가게이름을 정해봅시다
         */
        double storename = 1.23 + 5.98;
        System.out.println(storename);

        /* Q.마수걸이로 절친이 오기로 했어요. 그러고보니 얘 생일이 곧이었던 거 같은데...
        주석처리된 System.out.println(); 자리에
        정수 10과 1.x 실수 한 개를 더하여
        친구 생일을 기억해봅시다
         */
        System.out.println("친구 생일은 ");
        System.out.println(10 + 1.6);

         /* 가게 보안을 책임질 도어락이 와서 설치를 했어요.
        주석처리된 System.out.println(); 자리에
        문자 2개(영어 소문자)를 곱하여 비밀번호를 설정해봅시다.
         */
        System.out.println("비밀번호는 ");
        System.out.println('a'*'h');

        /* 와! 가게가 생각보다 잘 되네요
        손님들을 대상으로 이벤트를 하기로 했어요.
        n번째 손님을 대상으로 하고 싶은데,
        주석처리된 System.out.println(); 자리에
        문자(영어 소문자)와 한 자리 정수를 뺄셈하여
        몇 번째 결제 손님을 대상으로 이벤트를 할 지 결정해봅시다.
         */
        System.out.println("이벤트 당첨!");
        System.out.println('y'-3);

        /* 사업확장을 위해 온라인스토어를 만들기로 했어요
        환영하는 문구를 Welcome과 OurStore 2개를 이어붙여서 만들어봅시다.
         */
        System.out.println("온라인스토어를 열었습니다.");
        System.out.println("Welcome" + "OurStore");

        /* 그러고보니 업종이 카페라고 얘기를 했던가요?
        위에서 정한 가게 이름(실수)과 Cafe을 합쳐서 출력해봅시다.
        !!Cafe는 문자일까요 문자열일까요?? - 문자열!*/
        System.out.println(storename + "Cafe");

        /* Q. 헉. 그러고 보니 메뉴 목록을 안 만들었네요.
        Latte와 영어 대문자 2가지를 이용해 지금이라도 정해볼까요? */
        System.out.println("MENU : ");
        System.out.println("Latte와");
        System.out.println("EGG");

        /* Q. 장사가 잘 되어서 2호점을 차리기로 했어요
         * 진짜 커피를 팔겠다는 마인드를 담아 Coffee와 boolean 값(true)을 이용해
         * 2호점명을 만들어봅시다
         * Q-2: 두 가지 값을 합쳤을 때 나온 결과는 문자값일까요?  네ㅐㅇ*/
        System.out.println("2호점 이름 : ");
        System.out.println("Coffee" + true);

    }
}
