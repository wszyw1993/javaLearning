package j2se;

public class MagicPotion extends Item {
	public void effect() {
		System.out.println("使用蓝瓶，魔力回复");
	}
    
	public static void main(String[] args) {
		MagicPotion mp = new MagicPotion();
		mp.effect();
	}
}
