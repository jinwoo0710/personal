7. 실행되자마자 콘솔 창에 1에서 10까지 출력한 뒤 종류하는 스레드를 작성하는 문제이다. main()dms 사용자로부터 "go" 문자열을 입력받으면 이 스레드를 생성하고 실행시킨다.

package finaltest;
import java.util.Scanner;

class CountingRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("스레드 실행 시작");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(500); // 0.5초 간격
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n스레드 종료");
    }
}

public class SeventhQInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("시작하려면 go를 입력하세요>>");

        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("go")) {
            Thread thread = new Thread(new CountingRunnable());
            thread.start();
        } else {
            System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
        }

        scanner.close();
    }
}
