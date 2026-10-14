import java.util.Scanner;

public class baitap1_ss3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin khách hàng
        System.out.print("Nhập tên khách hàng: ");
        String customerName = scanner.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        String productName = scanner.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();

        System.out.print("Nhập số lượng mua: ");
        int quantity = scanner.nextInt();

        System.out.print("Khách hàng có thẻ thành viên không (true/false): ");
        boolean isMember = scanner.nextBoolean();

        // Tính thành tiền
        double amount = price * quantity;

        // Tính giảm giá
        double discount = 0;
        if (isMember) {
            discount = amount * 0.10;
        }

        // Tính VAT sau khi giảm giá
        double vat = (amount - discount) * 0.08;

        // Tính tổng thanh toán
        double total = amount - discount + vat;

        // In hóa đơn
        System.out.println("\n========== HÓA ĐƠN ==========");
        System.out.println("Khách hàng: " + customerName);
        System.out.println("Sản phẩm: " + productName);
        System.out.println("-----------------------------");
        System.out.printf("Số lượng:       %d%n", quantity);
        System.out.printf("Đơn giá:        %,.0f%n", price);
        System.out.printf("Thành tiền:     %,.0f%n", amount);
        System.out.printf("Giảm giá:       %,.0f%n", discount);
        System.out.printf("Tiền VAT (8%%):  %,.0f%n", vat);
        System.out.println("-----------------------------");
        System.out.printf("Tổng thanh toán: %,.0f%n", total);
        System.out.println("=============================");

        scanner.close();
    }
}
