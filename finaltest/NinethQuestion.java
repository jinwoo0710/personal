9. 프로그램이 시작되면 바로 오디오를 재생하라. 그리고 마우스가 프로그램을 벗어나면 연주를 일시 중단시키고, 다시 마우스가 프로그램으로 올라오면 연주를 계속하도록 하라. 

package finaltest;
import javax.swing.*;
import javax.sound.sampled.*;
import java.awt.event.*;
import java.io.File;

public class NinethQuestion extends JFrame {
    private Clip audioClip;

    public NinethQuestion() {
        // JFrame 설정
        setTitle("Kiosk Interface");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 오디오 파일 로드 (절대 경로 또는 상대 경로 사용)
        try {
            File audioFile = new File("music.wav"); // music.wav 파일 경로
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 마우스 이벤트 리스너 추가
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // 마우스가 JFrame 안으로 들어오면 오디오 재생
                if (!audioClip.isRunning()) {
                    audioClip.setFramePosition(0); // 오디오 처음으로 되돌리기
                    audioClip.start();
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // 마우스가 JFrame을 벗어나면 오디오 일시 정지
                audioClip.stop();
            }
        });

        // JFrame을 화면에 표시
        setVisible(true);
    }

    public static void main(String[] args) {
        new NinethQuestion();
    }
}
