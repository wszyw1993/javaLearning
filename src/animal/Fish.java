package animal;

public class Fish extends Animal implements Pet{
    private String name;
    
    public void walk() {
        System.out.println("�㣺������ģ�Ϊʲô����");
    }
    
    protected Fish() {
        super(0);
        this.setName("");
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void play(){
        System.out.println("����"+name+"��ҧ��");
    }
    
    public void eat() {
        System.out.println("�������ڽ�ʳ");
    }
}
