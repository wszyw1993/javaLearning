package j2se;

public class Item {
	String name;
	int price;
	public void buy() {
		System.out.println("����");
	}
	public void effect() {
		System.out.println("��Ʒʹ�ú���һ��Ч��");
	}
	
	public static void main(String[] args) {
		Item bloodBottle = new Item();
		bloodBottle.name = "Ѫƿ";
		bloodBottle.price = 50;
		
		Item grassShoe = new Item();
		grassShoe.name = "��Ь";
		grassShoe.price = 300;
		
		Item longSword = new Item();
		longSword.name = "����";
		longSword.price = 350;
	}

}
