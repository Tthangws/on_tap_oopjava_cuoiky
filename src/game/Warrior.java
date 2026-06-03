package game;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/2/2026
 * TIME: 1:10 AM
 */
public class Warrior extends Hero implements IUltimate{
    private int armor;
    Warrior(String name, int hp, int baseAttack, int armor) {
        super(name, hp, baseAttack);
        this.armor = armor;
    }

    // Viết trong lớp Warrior
    @Override
    public void takeDamage(int damage) {
        // Tính sát thương thực tế
        int actualDamage = damage - this.armor;

        // Đề phòng trường hợp giáp to hơn sát thương (không thể đánh xong lại được hồi máu)
        if (actualDamage < 0) {
            actualDamage = 0;
        }

        System.out.println(getName() + " dùng giáp chặn đòn! Sát thương thực tế phải nhận: " + actualDamage);

        // Gọi hàm takeDamage của lớp cha (Hero) để tiến hành trừ máu
        super.takeDamage(actualDamage);
    }

    @Override
    public void attack(Hero target) {
        System.out.println(this.getName() + " chém thường vào " + target.getName());
        // Quăng cục sát thương sang cho target tự xử lý!
        target.takeDamage(getBaseAttack());
    }

    @Override
    public void useUltimate(Hero target) {
        System.out.println("\n🔥 [CHIÊU CUỐI] " + this.getName() + " vận nội công thi triển [CHÉM XUYÊN GIÁP] vào " + target.getName() + "!");

        int ultimateDamage = this.getBaseAttack() * 2;
        System.out.println("⚡ Gây ra " + ultimateDamage + " SÁT THƯƠNG CHUẨN (Bỏ qua giáp)!");

        // Bí quyết xuyên giáp: Ép thẳng lượng máu mới bằng setter, không thông qua hàm takeDamage của mục tiêu!
        target.setHp(target.getHp() - ultimateDamage);
    }
}
