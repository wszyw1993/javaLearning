package j2se;

public class ADAPHero extends Hero implements AD,AP,Mortal{
	public void die() {
		System.out.println("ɱ��������ħ�����Ӣ��");
	}
	//����ӿڵ�default�����ظ�,����Ҫ�ڵ��õ�ʱ����д�÷���,����super���ø÷���.
	public void attack() {
		AD.super.attack();
		AP.super.attack();
		}
	
	public static void main(String[] args) {
		ADAPHero garen = new ADAPHero();
		garen.attack();

	}
}
