package j2se;
//����������
public class Support extends Hero{
	public void heal() {
		System.out.println(name + "��ȷ��������˭");
	}
	
	public void heal(String heroName) {
		System.out.println(name + "��" + heroName + "������һ������");
	}
	
	public void heal(String heroName1,String heroName2) {
		System.out.println(name + "��" + heroName1 + "��" + heroName2 +"������һ������");
	}
	
	public void heal(String heroName1,int hp) {
		System.out.println(name + "��" + heroName1 + "������һ�����ƣ�" +"�ظ���"+ hp + "Ѫ��");
	}
	

	public static void main(String[] args) {
		Support soul = new Support();
		soul.name = "����";
		
		Hero garen = new Hero();
		garen.name = "����";
		
		Hero timor = new Hero();
		timor.name = "��Ī";
		
		soul.heal();
		soul.heal(garen.name);
		soul.heal(garen.name,timor.name);
		soul.heal(garen.name,300);
	}
}
