package animal;

public class Cat extends Animal implements Pet {
    protected String name;
    
    protected Cat(String name) {
        super(4);
        this.name = name;  
    }
    
    protected Cat() {
        this("");
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void play(){
        System.out.println("一起玩喵~");
    }
    
    public void eat() {
        System.out.println("主人我们一起吃饭喵~");
    }
}
