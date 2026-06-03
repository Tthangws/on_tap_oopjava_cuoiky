package game;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/2/2026
 * TIME: 1:59 AM
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("====== ⚔️ ĐẤU TRƯỜNG SINH TỬ ⚔️ ======");

        // 1. Khởi tạo nhân vật
        // Warrior: Máu trâu (1000), Công (100), Giáp (50)
        Warrior garen = new Warrior("Garen", 1000, 100, 50);

        // Mage: Máu giấy (500), Công to (150), Năng lượng (100)
        Mage ryze = new Mage("Ryze", 500, 150, 100);

        System.out.println("Hai đấu thủ đã sẵn sàng: " + garen.getName() + " vs " + ryze.getName() + "!\n");

        // 2. Vòng lặp trận đấu
        try {
            System.out.println("--- LƯỢT 1: Ryze ra đòn trước ---");
            ryze.attack(garen); // Ryze bắn cầu lửa (Mất 10 mana). Garen dùng giáp đỡ.
            inChiSo(garen, ryze);

            System.out.println("--- LƯỢT 2: Garen phản công ---");
            garen.attack(ryze); // Garen chém thường. Ryze không có giáp, chịu 100% sát thương.
            inChiSo(garen, ryze);

            System.out.println("--- LƯỢT 3: Ryze dồn sát thương! ---");
            ryze.useUltimate(garen); // Thiên thạch lửa (Sát thương 450, Mất 50 mana). Garen đỡ bằng giáp 50 -> Nhận 400.
            inChiSo(garen, ryze);

            System.out.println("--- LƯỢT 4: Garen dùng lá bài tẩy! ---");
            garen.useUltimate(ryze); // Sát thương chuẩn 200 xuyên giáp!
            inChiSo(garen, ryze);

            System.out.println("--- LƯỢT 5: Đòn quyết định của Garen ---");
            // Lần này Ryze chỉ còn 300 HP, Garen vận chiêu cuối lần nữa sẽ gây 200 sát thương.
            // Cú đánh tiếp theo sẽ kết liễu Ryze!
            garen.useUltimate(ryze);
            garen.useUltimate(ryze); // Cố tình đánh bồi thêm để máu Ryze < 0, kích hoạt Exception!

        } catch (RuntimeException e) {
            // Bắt lỗi HeroDeadException (Do HeroDeadException kế thừa RuntimeException)
            System.out.println("\n💀 TRẬN ĐẤU KẾT THÚC: " + e.getMessage());
        }

        System.out.println("====== KẾT QUẢ CUỐI CÙNG ======");
        inChiSo(garen, ryze);
    }

    /**
     * Hàm hỗ trợ in chỉ số máu và mana để dễ theo dõi (Clean Code)
     */
    private static void inChiSo(Warrior w, Mage m) {
        System.out.println("   [Chỉ số] " + w.getName() + " (HP: " + w.getHp() + ") | " + m.getName() + " (HP: " + m.getHp() + ")");
        System.out.println("--------------------------------------------------");
    }
}
