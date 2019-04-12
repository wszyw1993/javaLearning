package j2se;
//函数的重载
public class Support extends Hero{
	public void heal() {
		System.out.println(name + "不确定治疗了谁");
	}
	
	public void heal(String heroName) {
		System.out.println(name + "对" + heroName + "进行了一次治疗");
	}
	
	public void heal(String heroName1,String heroName2) {
		System.out.println(name + "对" + heroName1 + "和" + heroName2 +"进行了一次治疗");
	}
	
	public void heal(String heroName1,int hp) {
		System.out.println(name + "对" + heroName1 + "进行了一次治疗，" +"回复了"+ hp + "血量");
	}
	

	public static void main(String[] args) {
		Support soul = new Support();
		soul.name = "魂灵";
		
		Hero garen = new Hero();
		garen.name = "盖伦";
		
		Hero timor = new Hero();
		timor.name = "提莫";
		
		soul.heal();
		soul.heal(garen.name);
		soul.heal(garen.name,timor.name);
		soul.heal(garen.name,300);
	}
}
