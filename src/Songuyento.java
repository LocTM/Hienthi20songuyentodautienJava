public class Songuyento     {
    public static void main(String[] args) {
        int soLuongSNT = 20;
        int dem = 0;
        int so = 2;
        System.out.println("20 So nguyen to dau tien la: ");
        while (dem < soLuongSNT) {
            if (isNguyenTo(so)) {
                System.out.print(so + " ");
                dem++;
            }
            so++;
        }
    }

    public static boolean isNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
