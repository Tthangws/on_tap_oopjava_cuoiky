package hethongquanlythethanhvienphonggym;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/8/2026
 * TIME: 9:32 AM
 */
public class Main {
    public static void main(String[] args) {
        GymManager gm = new GymManager();

        BasicMember bs1 = new BasicMember("BS01","Nguyễn Trọng Thắng",350000);
        BasicMember bs2 = new BasicMember("BS05","Hoàng Cửu Bảo",251000);
        VIPMember vm1 = new VIPMember("VM03","Lê văn Hưng",425000);
        VIPMember vm2 = new VIPMember("VM12","Trần Đắc Tâm",499000);
        VIPMember vm3 = new VIPMember("VM09","Phạm Quang Tuấn",515000);

        gm.addMember(bs1);
        gm.addMember(bs2);
        gm.addMember(vm1);
        gm.addMember(vm2);
        gm.addMember(vm3);

        //Đăng ký bình thường
        gm.processSubscription("BS01",9);

        //Đăng ký sai tháng
        gm.processSubscription("BS05",-3);

        //Đăng ký chuẩn vip
        gm.processSubscription("VM03",5);

        //Đăng ký vip trên 6 tháng
        gm.processSubscription("VM12",8);

        //Đăng ký sai tên
        gm.processSubscription("DM09",7);

        //xoa thanh vien
        gm.deleteMemberByName("Hoàng cửu Bảo");
        gm.deleteMemberByName("Trần Đắc Hai");




    }
}
