package sec01;

public class CallListener implements Button.OnClickListener{ // OnClickListener가 Button class안에 있기 때문에
					
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다");
		
	}

}
