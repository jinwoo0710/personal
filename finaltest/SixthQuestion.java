6. 100에서 200까지 조절할 수 있는 수평 슬라이더와 레이블을 하나 만들고, 사용자가 슬라이더를 움직이면 레이블 컴포넌트에 수치로 보여주는 스윙 응용프로그램을 작성하라.

package finaltest;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SixthQuestion {
    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("Slider Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        // 컨텐트 팬 설정
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());

        // 레이블 생성 (초기값: 100)
        JLabel label = new JLabel("Value: 100", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        // 슬라이더 생성 (범위: 100 ~ 200, 초기값: 100)
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 100, 200, 100);
        slider.setMajorTickSpacing(20); // 큰 틱 간격
        slider.setMinorTickSpacing(5);  // 작은 틱 간격
        slider.setPaintTicks(true);     // 틱 표시
        slider.setPaintLabels(true);   // 레이블 표시

        // 슬라이더 이벤트 리스너 추가
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue(); // 슬라이더의 현재 값
                label.setText("Value: " + value); // 레이블 갱신
            }
        });

        // 컴포넌트 배치
        contentPane.add(slider, BorderLayout.CENTER);
        contentPane.add(label, BorderLayout.SOUTH);

        // 프레임 표시
        frame.setVisible(true);
    }
}
