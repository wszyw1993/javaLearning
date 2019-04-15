package animal;

public abstract class Animal {
    protected int leg;
    
    protected Animal(int leg) {
        this.leg = leg;
    }
    
    public abstract void eat();
    
    public void walk() {
        System.out.println("ʹ��"+leg+"������·��");
    }
}
