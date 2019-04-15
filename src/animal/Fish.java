package animal;

public class Fish extends Animal implements Pet{
    private String name;
    
    public void walk() {
        System.out.println("鱼：“你妈的，为什么！”");
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
        System.out.println("鱼鱼"+name+"，咬他");
    }
    
    public void eat() {
        System.out.println("鱼鱼正在进食");
    }
}
