package finaltest;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class FouthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열들을 입력하세요>>");
            String input = scanner.nextLine();

            if (input.equals("그만")) {
                break; // "그만" 입력 시 프로그램 종료
            }

            String[] words = input.split("\\s+"); // 공백으로 문자열 분리
            ArrayList<String> wordList = new ArrayList<>();

            // 문자열을 ArrayList에 추가
            for (String word : words) {
                wordList.add(word);
            }

            // 중복 제거: LinkedHashSet 사용 (입력 순서 유지)
            LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(wordList);

            // 결과 출력
            System.out.println(String.join(" ", uniqueWords));
        }

        scanner.close(); // Scanner 닫기
    }
}
