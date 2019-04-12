package j2se;

public class Item {
	String name;
	int price;
	public void buy() {
		System.out.println("购买");
	}
	public void effect() {
		System.out.println("物品使用后，有一点效果");
	}
	
	public static void main(String[] args) {
		Item bloodBottle = new Item();
		bloodBottle.name = "血瓶";
		bloodBottle.price = 50;
		
		Item grassShoe = new Item();
		grassShoe.name = "草鞋";
		grassShoe.price = 300;
		
		Item longSword = new Item();
		longSword.name = "长剑";
		longSword.price = 350;
	}

}
