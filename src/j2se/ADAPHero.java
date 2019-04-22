package j2se;

public class ADAPHero extends Hero implements AD,AP,Mortal{
	public void die() {
		System.out.println("杀死了物理魔法混合英雄");
	}
	//如果接口的default方法重复,则需要在调用的时候重写该方法,并用super调用该方法.
	public void attack() {
		AD.super.attack();
		AP.super.attack();
		}
	
	public static void main(String[] args) {
		ADAPHero garen = new ADAPHero();
		garen.attack();

	}
}
