package j2se;

public class MagicPotion extends Item {
	public void effect() {
		System.out.println("ʹ����ƿ��ħ���ظ�");
	}
    
	public static void main(String[] args) {
		MagicPotion mp = new MagicPotion();
		mp.effect();
	}
}
