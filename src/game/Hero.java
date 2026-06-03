package game;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/2/2026
 * TIME: 1:10 AM
 */
public abstract class Hero {
    private String name;
    private int hp;
    private int baseAttack;

    //constructer
    Hero(String name, int hp, int baseAttack){
        this.name = name;
        this.hp = hp;
        this.baseAttack = baseAttack;
    }

    //getter setter
    public void setHp(int hp) throws HeroDeadException{
        if(hp < 0){
            this.hp = 0;
            throw new HeroDeadException("Anh hùng đã tử trận !");
        }
        this.hp = hp;
    }
    public int getHp(){
        return hp;
    }
    public String getName(){
        return name;
    }
    public int getBaseAttack(){
        return baseAttack;
    }

    public void takeDamage(int damage) {
        // Trừ máu dựa trên sát thương truyền vào (Nhớ gọi setHp để kích hoạt Exception nếu máu < 0 nhé)
        setHp(this.hp - damage);
    }

    public abstract void attack(Hero target);
}
