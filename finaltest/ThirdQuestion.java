3. Scanner 클래스로 -1이 입력될 떄까지 양의 정수를 입력받아 벡터 Vector<Integer>에 저장하라. 그리고 벡터를 검색하여 가장 작은 수를 출력하는 프로그램을 작성하라. 

package finaltest;
import java.util.Scanner;
import java.util.Vector;

public class ThirdQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> numbers = new Vector<>();

        System.out.print("정수 입력(-1이면 입력 끝)>>");

        while (true) {
            int input = scanner.nextInt(); // 정수를 입력받음
            if (input == -1) {
                break; // -1이 입력되면 종료
            }
            if (input > 0) {
                numbers.add(input); // 양의 정수만 벡터에 저장
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("입력된 양의 정수가 없습니다.");
        } else {
            int min = numbers.get(0); // 첫 번째 값을 초기 최소값으로 설정
            for (int num : numbers) {
                if (num < min) {
                    min = num; // 더 작은 값이 나오면 최소값 갱신
                }
            }
            System.out.println("제일 작은 수는 " + min);
        }

        scanner.close(); // Scanner 닫기
    }
}

