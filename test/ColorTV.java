package test;

public class ColorTV extends TV{
	int cost;
	
public ColorTV(int size, int cost) {
		super(size); // TV class의 size 호출 
		this.cost=cost;
	}
public void printProperty() {
	System.out.println(getSize()+"인치 " + cost+"만원");
}


}
