package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

class GameFrame extends JFrame implements KeyListener, Runnable { // KeyListener 키보드 입력에 따라 플레이어 이동, 게임 루프 관리 

	private boolean isRunning = true;
	private boolean isKeyUp, isKeyDown, isKeyLeft, isKeyRight = false;

	// 게임끝나고 GameOverFrame에서 활용하기 위해 static으로 설정
	static final int FRAME_WIDTH = 600;
	static final int FRAME_HEIGHT = 600;

	private int xPlayer, yPlayer, xCoin, yCoin;

	private int score = 0;
	private double count = 0;

	Image imagePlayer = new ImageIcon("C:/SelfStudyJava/test/src/test/image/동석이.jpg").getImage();
	Image imageCoin = new ImageIcon("C:/SelfStudyJava/test/src/test/image/닭가슴살.jpg").getImage();

	int widthPlayer = imagePlayer.getWidth(this);
	int heightPlayer = imagePlayer.getHeight(this);
	int widthCoin = imageCoin.getWidth(this);
	int heightCoin = imageCoin.getHeight(this);

	Image bufferImage;
	Graphics gp;
	Thread t;

	Random rd = new Random();

	// 벽에 부딪히는 것을 구현
	Insets insets = getInsets();
	int TOP = insets.top;
	int BOTTOM = FRAME_HEIGHT - insets.bottom;
	int LEFT = insets.left;
	int RIGHT = FRAME_WIDTH - insets.right;

	// Ball들을 담을 ArrayList
	ArrayList balls = new ArrayList();

	GameFrame() {

		init(); // 게임 초기화를 담당하는 메서드로, 게임 창의 타이틀, 사이즈, 플레이어 및 코인의 초기 위치를 설정
		addKeyListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		t = new Thread(this);
		t.start();

		setVisible(true);

	}

	public void run() { //  게임 루프를 실행하는 메서드
		new BallGenerator().start();
		while (isRunning) {
			try {
				Thread.sleep(20);
			} catch (Exception e) {
			}
			takeBallsOutFromArray();
			movePlayer(); // isKey가 true인지 확인
			checkPlayerNWallBumped();
			checkPlayerNCoinBumped();
			checkPlayerNBallBumped();
			repaint(); // 다시 그려줌
			count += 20;
		}
	}

	private void init() {
		setTitle("마동석 키우기");
		setResizable(false);
		setBounds(100, 100, FRAME_WIDTH, FRAME_HEIGHT);

		// xPlayer, yPlayer를 프레임의 가운데에 배치하는 값을 저장
		xPlayer = (FRAME_WIDTH - widthPlayer) / 2;
		yPlayer = (FRAME_HEIGHT - heightPlayer) / 2;

		genCoin();

	}

	public void update(Graphics g) {
		g.drawImage(bufferImage, 0, 0, this);
	}

	public void paint(Graphics g) {
		// 가상(back buffer)에 그려줌
		bufferImage = createImage(FRAME_WIDTH, FRAME_HEIGHT);
		gp = bufferImage.getGraphics();
		gp.drawImage(imagePlayer, xPlayer, yPlayer, this);
		gp.drawImage(imageCoin, xCoin, yCoin, this);

		int a = (int) count / 70;
		gp.drawString(("시간 : " + String.valueOf((double) a / 10)), 50, 50);
		gp.drawString(("Score : " + Integer.toString(score)), 300, 50);

		gp.setColor(Color.RED);
		int size = balls.size();
		for (int i = 0; i < size; i++) {
			Ball b = (Ball) balls.get(i); // (Ball) 부분을 모르겠음
			gp.fillOval(b.x, b.y, b.SIZE, b.SIZE); // ballgenerator에서 값을 3초마다 하나씩 넣어 생성
		}

		update(g);
	}

	class BallGenerator extends Thread { // 일정 간격으로 공을 생성하는 쓰레드
		public void run() {
			int x, y;
			while (true) {
				x = (int) (Math.random() * (RIGHT - Ball.SIZE));
				y = (int) (Math.random() * (BOTTOM - Ball.SIZE));

				balls.add(new Ball(x, y));

				try {
					Thread.sleep(3 * 1000);
				} catch (Exception e) {

				}
			}
		}
	}

	private void takeBallsOutFromArray() { // 생성된 공들을 이동시키고, 벽에 부딪히는 동작을 처리
		int size = balls.size();
		for (int i = 0; i < size; i++) { // 생성된 ball들을 for문에 넣고 조건을 줘서 움직여준다
			Ball b = (Ball) balls.get(i); // 생성된 ball들을 for문에 넣고 조건을 줘서 움직여준다

			b.x += b.xStep;
			b.y += b.yStep;

			if (b.y <= TOP) {
				b.y = TOP;
				b.yStep = -b.yStep; // 속도를 -로 바꿈
			}

			if (b.y >= BOTTOM - b.SIZE) {
				b.y = BOTTOM - b.SIZE;
				b.yStep = -b.yStep;
			}

			if (b.x <= LEFT) {
				b.x = LEFT;
				b.xStep = -b.xStep;
			}

			if (b.x >= RIGHT - b.SIZE) {
				b.x = RIGHT - b.SIZE;
				b.xStep = -b.xStep;
			}
		}
	}

	private void movePlayer() { // 플레이어의 이동을 처리
		if (isKeyUp) {
			yPlayer -= 5;
		}

		if (isKeyDown) {
			yPlayer += 5;
		}

		if (isKeyLeft) {
			xPlayer -= 5;
		}

		if (isKeyRight) {
			xPlayer += 5;
		}
	}

	private void genCoin() { // 코인의 위치를 랜덤하게 생성
		
		xCoin = rd.nextInt(FRAME_WIDTH);
		yCoin = rd.nextInt(FRAME_HEIGHT);

		// 화면을 넘기지 않도록 코인을 생성한다.
		while (xCoin > FRAME_WIDTH - widthCoin) {
			xCoin = rd.nextInt(FRAME_WIDTH);
		}
		while (yCoin < 30 || yCoin > FRAME_HEIGHT - heightCoin) {
			yCoin = rd.nextInt(FRAME_HEIGHT);
		}
	}

	private void checkPlayerNCoinBumped() {// 코인 충돌 

		if (xPlayer + widthPlayer > xCoin && yPlayer + heightPlayer > yCoin && xCoin + widthCoin > xPlayer
				&& yCoin + heightCoin > yPlayer) {

			score++;

			genCoin();
		}
	}

	private void checkPlayerNWallBumped() {// 벽 충돌

		if (yPlayer <= TOP) {
			yPlayer = TOP;
		}

		if (yPlayer >= BOTTOM - heightPlayer) {
			yPlayer = BOTTOM - heightPlayer;
		}

		if (xPlayer <= LEFT) {
			xPlayer = LEFT;
		}

		if (xPlayer >= RIGHT - widthPlayer) {
			xPlayer = RIGHT - widthPlayer;
		}
	}

	private void checkPlayerNBallBumped() {// 공 충돌
		int size = balls.size();

		int playerWidth = 25; // 가로 크기(이미지 포함)
		int playerHeight = 25; // 세로 크기(이미지 포함)

		for (int i = 0; i < size; i++) {
			Ball b = (Ball) balls.get(i);

			// 공의 중심 좌표
			int xCircleCenter = b.x + b.SIZE / 2;
			int yCircleCenter = b.y + b.SIZE / 2;

			// 플레이어의 바운딩 박스 좌표
			int xPlayerBoxLeft = xPlayer;
			int xPlayerBoxRight = xPlayer + playerWidth;
			int yPlayerBoxTop = yPlayer;
			int yPlayerBoxBottom = yPlayer + playerHeight;

			// 공과 플레이어의 바운딩 박스가 겹치는지 여부 확인
			if (xPlayerBoxLeft < xCircleCenter + b.SIZE / 2 && xPlayerBoxRight > xCircleCenter - b.SIZE / 2
					&& yPlayerBoxTop < yCircleCenter + b.SIZE / 2 && yPlayerBoxBottom > yCircleCenter - b.SIZE / 2) {
				// 겹친 경우의 처리
				GameOverFrame.SCORE = score;
				GameOverFrame.SCORE_REPAINT = (int) count;
				isRunning = false;
				this.setVisible(false);
				this.dispose();
				new GameOverFrame();
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) { // 키보드 입력을 처리하는 메서드 플레이어의 움직임을 처리하는 메서드

		switch (e.getKeyCode()) { // 입력된 키보드 값을 가져온다
		case KeyEvent.VK_UP:
			isKeyUp = true;
			break;

		case KeyEvent.VK_DOWN:
			isKeyDown = true;
			break;

		case KeyEvent.VK_LEFT:
			isKeyLeft = true;
			break;

		case KeyEvent.VK_RIGHT:
			isKeyRight = true;
			break;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) { // 키를 누른 상태에서 놓았을 때
		switch (e.getKeyCode()) { 
		case KeyEvent.VK_UP:
			isKeyUp = false;
			break;

		case KeyEvent.VK_DOWN:
			isKeyDown = false;
			break;

		case KeyEvent.VK_LEFT:
			isKeyLeft = false;
			break;

		case KeyEvent.VK_RIGHT:
			isKeyRight = false;
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) { // 키를 눌렀을 때 
	}
}
