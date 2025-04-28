package study202502425;

public class method {
    public static void main(String[] args) {
        method trip = new method();
        /* 빨간머리 앤이 어느 날 초록지붕집에서 나와 짧은 여행을 떠났습니다 */
        System.out.println("여행 시작됨");

        /* 1. 첫 번째 갈림길을 마주쳤네요.
         * 오른쪽 길 나무들이 더 멋있는 느낌이 납니다.
         * 사용할이름.메소드명();을 사용해 오른쪽 길로 가봅시다. */

        trip.roadR();
    }

    public void roadR() {
        System.out.println("오른쪽 길을 택해봄");
        /* 2.오른쪽길을 쭉 들어가보니 냇가가 나옵니다.
         * 돌다리와 나무다리가 나오는데, 아무래도 안전한 나무다리가 낫겠네요.
         * 메소드명();을 이용해 나무다리를 건너가봅시다.*/

        treeB();

        /* 6. 짧지만 알찬 하루 여행이 끝났습니다.
         * System.out.println("집 도착");을 선언해봅시다.
         * 어디에 코드를 넣어야할까요? */
        System.out.println("집 도착");
    }

    public void treeB() {
        System.out.println("나무다리를 건넜다.");

        /* 3. 어라? 나무다리를 건넜는데 친구 Caroline을 만났어요.
         * 메소드를 이용해 친구를 불러볼까요 */
        friendC();

        /*5. 버찌가 정말 맛있네요. 먹다보니 아주머니와 아저씨가 그리워졌어요.
         * System.out.println("집으로 돌아가자");을 이용해 집으로 돌아가봅시다.
         * 어느 줄에 코드를 넣어야할까요? */
        System.out.println("집으로 돌아가자");
    }

    public void friendC() {
        System.out.println("friend Caroline 만남 ");
        // 친구를 만나서 수다를 떨다보니 Caroline네 집 앞에 가까워졌어요.

        /* 4. 친구네 가족이 방금 막 땄다며 버찌를 나눠줬어요.
         * System.out.println("버찌를 받았다");를 이용해
         * 집으로 가져가 봅시다. 어디에 코드를 달아야할까요? */
        System.out.println("버찌를 받았다");
    }
}
