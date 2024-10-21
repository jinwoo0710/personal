//실습문제 12번문제
import java.util.*;

class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2eng(String voca) {
        return eng[Arrays.asList(kor).indexOf(voca)];
    }
}
public class report13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("한영단어 검색 프로그램입니다.");
        while(true) {
            System.out.print("한글단어>>");   
            String voca = sc.nextLine();
            if(voca.equals("그만")) {
                break;
            }
            System.out.println(Dictionary.kor2eng(voca));
        }
        sc.close();
    }
}
