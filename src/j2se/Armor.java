package j2se;

public class Armor extends Item{
    int armorLevel;
    
    public static void main(String[] args) {
    	Armor clothArmor = new Armor();
    	clothArmor.name = "����";
    	clothArmor.price = 300;
    	clothArmor.armorLevel = 15;
    	
    	Armor chainmail = new Armor();
    	chainmail.name = "���Ӽ�";
    	chainmail.price = 500;
    	chainmail.armorLevel = 40;
    	
    }

}
