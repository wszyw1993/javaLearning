package j2se;

public class SuperHero {
    String name; //����
    
    float hp; //Ѫ��
     
    float armor; //����
     
    int moveSpeed; //�ƶ��ٶ�
 
    //��������������һ��
    //�ڷ������У�ֻ�ܷ��ʵ�����name
    public void setName1(String name){
        name = name;
    }
     
    //Ϊ�˱���setName1�е����⣬���������ò�ʹ������������
    public void setName2(String heroName){
        name = heroName;
    }
     
    //ͨ��this��������
    public void setName3(String name){
        //name������ǲ���name
        //this.name�����������name
        this.name = name;
    }
     
    public static void main(String[] args) {
    	SuperHero  h =new SuperHero();
         
        h.setName1("teemo");
        System.out.println(h.name);
         
        h.setName2("garen");
        System.out.println(h.name);    
         
        h.setName3("����");
        System.out.println(h.name);    
    }

}
