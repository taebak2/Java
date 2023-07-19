package sec01;

public class MessageListener implements Button.OnClickListener{ // OnClickListener가 Button class안에 있기 때문에
					
	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다");
		
	}

}
