package test;

public class ColorTV extends TV{
	int cost;
	
public ColorTV(int size, int cost) {
		super(size); // TV class�� size ȣ�� 
		this.cost=cost;
	}
public void printProperty() {
	System.out.println(getSize()+"��ġ " + cost+"����");
}


}
