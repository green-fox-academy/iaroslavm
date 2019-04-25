package zoo;

public abstract class Animal {
    protected int age;
    protected String name;
    protected String gender;

    public String getName() {
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }

    public abstract String breed();

    public abstract void eat();

    public abstract void drink();


}
