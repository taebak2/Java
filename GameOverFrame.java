package test;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

class GameOverFrame extends JFrame implements ActionListener {

    private JButton bt_OK;
    private JTextField tf;

    private String namePlayer;

    static int SCORE;
    static int SCORE_REPAINT; // 리페인트 한 횟수를 점수에 활용하기로..

    GameOverFrame() {
        setTitle("마동석 키우기 - Game Over");
        setResizable(false);
        setLayout(null);
        setBounds(100, 100, GameFrame.FRAME_WIDTH, GameFrame.FRAME_HEIGHT);

        tf = new JTextField(15);
        tf.setBounds(GameFrame.FRAME_WIDTH / 2 - 250 / 2, GameFrame.FRAME_HEIGHT / 2 - 25 / 2, 180, 46);
        tf.addActionListener(this);


        bt_OK = new JButton("등록");
        bt_OK.setBounds(350, GameFrame.FRAME_HEIGHT / 2 - 25 / 2, 60, 45);
        bt_OK.addActionListener(this);

        add(tf);
        add(bt_OK);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) { // 사용자가 등록 버튼을 눌렀을 때 실행되는 메서드
        namePlayer = tf.getText();
        try (
                FileWriter fw = new FileWriter("test.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            bw.write(namePlayer);
            bw.newLine();
            bw.write(Integer.toString(SCORE));
            bw.newLine();
            bw.write(Integer.toString(SCORE_REPAINT));
            bw.newLine();
            bw.flush();
        } catch (IOException ie) {
            System.out.println(ie);
        }
        new Ranking(); // Ranking 클래스를 호출하여 랭킹을 표시
    }

}
