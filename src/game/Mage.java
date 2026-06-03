package game;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/2/2026
 * TIME: 1:10 AM
 */
public class Mage extends Hero implements IUltimate{
    private int mana;
    Mage(String name, int hp, int baseAttack, int mana) {
        super(name, hp, baseAttack);
        this.mana = mana;
    }
    @Override
    public void attack(Hero target) {
        System.out.println("\n🪄 " + this.getName() + " chuẩn bị bắn cầu lửa...");

        if (this.mana >= 10) {
            this.mana = this.mana - 10; // Trừ mana trước
            System.out.println("Tốn 10 mana. Bắn cầu lửa vào " + target.getName() + " (Mana còn lại: " + this.mana + ")");
            target.takeDamage(this.getBaseAttack());
        } else {
            System.out.println("❌ Thất bại! " + this.getName() + " không đủ 10 mana để đánh thường!");
        }
    }

    // Chiêu cuối: Tốn 50 Mana, Sát thương x3 (Có bị cản bởi giáp)
    @Override
    public void useUltimate(Hero target) {
        System.out.println("\n☄️ [CHIÊU CUỐI] " + this.getName() + " niệm chú gọi [THIÊN THẠCH LỬA]...");

        if (this.mana >= 50) {
            this.mana = this.mana - 50; // Trừ mana
            int ultimateDamage = this.getBaseAttack() * 3;

            System.out.println("Tốn 50 mana. Thiên thạch rơi trúng " + target.getName() + " (Mana còn lại: " + this.mana + ")");
            // Gây sát thương bình thường (Mục tiêu có giáp thì mục tiêu vẫn được đỡ)
            target.takeDamage(ultimateDamage);
        } else {
            System.out.println("❌ Thất bại! " + this.getName() + " không đủ 50 mana để dùng chiêu cuối!");
        }
    }
}
