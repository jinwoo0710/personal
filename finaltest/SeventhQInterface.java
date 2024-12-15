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
