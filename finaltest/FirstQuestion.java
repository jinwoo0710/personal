package finaltest;
import java.util.Scanner;

public class FirstQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("여러 과목의 학점을 빈 칸으로 분리 입력>> ");
            String input = scanner.nextLine();
            
            if (input.equals("그만")) {
                break;
            }

            String[] grades = input.split("\\s+");
            double sum = 0;
            int count = 0;

            for (String grade : grades) {
                double score;

                switch (grade) {
                    case "A":
                    case "a":
                        score = 100;
                        break;
                    case "B":
                    case "b":
                        score = 90;
                        break;
                    case "C":
                    case "c":
                        score = 80;
                        break;
                    case "D":
                    case "d":
                        score = 70;
                        break;
                    case "F":
                    case "f":
                        score = 0;
                        break;
                    default:
                        System.out.println("실행 오류: " + grade);
                        continue;
                }

                sum += score;
                count++;
            }

            if (count > 0) {
                double average = sum / count;
                System.out.println("평균은 " + average);
            }
        }
        
        scanner.close();
    }
}
