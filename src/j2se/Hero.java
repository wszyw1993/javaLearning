package j2se;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    
    /*����
    public void legendary() {
    	System.out.println("����");
    }
    
    public float getHp() {
    	return hp;
    }
    
    public void recovery(float blood) {
    	hp = hp + blood;
    }
    
    public static void main(String[] args) {
    	Hero garen = new Hero();
    	garen.name = "����";
    	garen.hp = 616.28f;
    	garen.armor = 27.536f;
    	garen.moveSpeed = 350;
    	
    	Hero timor = new Hero();
    	timor.name = "��Ī";
    	timor.hp = 345.23f;
    	timor.armor = 13.234f;
    	timor.moveSpeed = 330;
    	
    	garen.legendary();
    	garen.recovery(100);
    	float hp = garen.getHp();
    	System.out.println("���׵�Ѫ��:"+hp);
    }
    */
    //���췽��
    //Ĭ�Ϲ��췽��
    public Hero() {
    }
    
    public Hero(String heroName) {
    	name = heroName;
    	System.out.println("���ù��췽��a");
    }
    public Hero(String heroName,float heroHp) {
    	this(heroName);
    	hp = heroHp;
    	System.out.println("���ù��췽��b");
    }
    
    public Hero(String heroName,float heroHp,float heroArmor,int heroMoveSpeed) {
    	this(heroName,heroHp);
    	armor = heroArmor;
    	moveSpeed = heroMoveSpeed;
    }
    public void kill(Mortal m) {
    	System.out.println(name);
    	m.die();
    }
    
    public static void main(String[] args) {
    	Hero garen = new Hero("����",616.28f,27.536f,350);

    	Hero timor = new Hero("��Ī");
    	timor.hp = 345.23f;
    	timor.armor = 13.234f;
    	timor.moveSpeed = 330;
    	
    	ADHero icer = new ADHero();
    	APHero anny = new APHero();
    	ADAPHero yi = new ADAPHero();
    	
    	garen.kill(icer);
    	garen.kill(anny);
    	garen.kill(yi);

    }
    
}
