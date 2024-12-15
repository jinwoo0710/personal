package finaltest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FifthQuestion {
    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("Button Click Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // 컨텐트 팬 설정
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(1, 5)); // 버튼 5개를 가로로 배치

        // 버튼 배열 생성
        JButton[] buttons = new JButton[5];
        int[] clickCounts = new int[5]; // 각 버튼의 클릭 횟수를 저장할 배열

        // 버튼 초기화 및 클릭 이벤트 추가
        for (int i = 0; i < 5; i++) {
            buttons[i] = new JButton("0"); // 초기 버튼 텍스트는 0
            final int index = i; // 람다식에서 사용할 인덱스 (final로 설정)
            
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    clickCounts[index]++; // 클릭 횟수 증가
                    buttons[index].setText(String.valueOf(clickCounts[index])); // 버튼 텍스트 갱신
                }
            });

            contentPane.add(buttons[i]); // 컨텐트 팬에 버튼 추가
        }

        // 프레임 보이도록 설정
        frame.setVisible(true);
    }
}
