package study.heros.entity;

public class Hero {
    private int id;
    private String name;
    private Float hp;

    public Hero() {
    }

    public Hero(int id, String name, Float hp) {
        this.id = id;
        this.name = name;
        this.hp = hp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getHp() {
        return hp;
    }

    public void setHp(Float hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
