package 상속;

public class CoffeTruck extends Truck{
	public void space() {
		System.out.println("커피트럭입니다.");
		System.out.println("트럭은 " + color + "색입니다.");
		oiling();
	}
}
