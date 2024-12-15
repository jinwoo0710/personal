package finaltest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EighthQuestion {
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("메뉴 프로그램");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // 메뉴바 생성
        JMenuBar menuBar = new JMenuBar();

        // "파일", "편집", "보기", "입력" 메뉴 생성
        JMenu fileMenu = new JMenu("파일");
        JMenu editMenu = new JMenu("편집");
        JMenu viewMenu = new JMenu("보기");
        JMenu inputMenu = new JMenu("입력");

        // "화면확대"와 "쪽윤곽" 메뉴 아이템 생성 및 추가
        JMenuItem zoomInItem = new JMenuItem("화면확대");
        JMenuItem pageOutlineItem = new JMenuItem("쪽윤곽");
        viewMenu.add(zoomInItem);
        viewMenu.add(pageOutlineItem);

        // 메뉴를 메뉴바에 추가
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(inputMenu);

        // 프레임에 메뉴바 설정
        frame.setJMenuBar(menuBar);

        // 액션 리스너 추가
        zoomInItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "화면확대 선택됨");
            }
        });

        pageOutlineItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "쪽윤곽 선택됨");
            }
        });

        // 프레임 표시
        frame.setVisible(true);
    }
}
