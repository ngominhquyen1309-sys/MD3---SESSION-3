import java.util.Scanner;

public class baitap3_ss3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        int count = 0;
        double sum = 0;
        double max = 0;
        double min = 0;
        double totalBonus = 0;

        while (true) {
            System.out.println("\n************ MENU NHẬP LƯƠNG ************");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tính tổng số tiền thưởng cho nhân viên");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Nhập lương nhân viên (-1 để kết thúc): ");
                        double salary = sc.nextDouble();

                        if (salary == -1) {
                            break;
                        }

                        if (salary < 0 || salary > 500_000_000) {
                            System.out.println(
                                    "Lương không hợp lệ! Vui lòng nhập từ 0 đến 500 triệu."
                            );
                            continue;
                        }

                        // Cập nhật thống kê
                        sum += salary;
                        count++;

                        if (count == 1) {
                            max = salary;
                            min = salary;
                        } else {
                            if (salary > max) {
                                max = salary;
                            }

                            if (salary < min) {
                                min = salary;
                            }
                        }

                        // Phân loại lương
                        if (salary < 5_000_000) {
                            System.out.println("Thu nhập thấp");
                        } else if (salary < 15_000_000) {
                            System.out.println("Thu nhập trung bình");
                        } else if (salary <= 50_000_000) {
                            System.out.println("Thu nhập khá");
                        } else {
                            System.out.println("Thu nhập cao");
                        }

                        // Tính tiền thưởng theo lương
                        if (salary < 5_000_000) {
                            totalBonus += salary * 0.05;
                        } else if (salary < 15_000_000) {
                            totalBonus += salary * 0.10;
                        } else if (salary < 50_000_000) {
                            totalBonus += salary * 0.15;
                        } else if (salary <= 100_000_000) {
                            totalBonus += salary * 0.20;
                        } else {
                            totalBonus += salary * 0.25;
                        }
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        System.out.println("Số nhân viên đã nhập: " + count);
                        System.out.printf("Lương trung bình: %,.0f đồng%n",
                                sum / count);
                        System.out.printf("Lương cao nhất: %,.0f đồng%n", max);
                        System.out.printf("Lương thấp nhất: %,.0f đồng%n", min);
                        System.out.printf("Tổng tiền lương: %,.0f đồng%n", sum);
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        System.out.printf("Tổng tiền thưởng: %,.0f đồng%n",
                                totalBonus);
                    }
                    break;

                case 4:
                    System.out.println("Kết thúc chương trình!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println(
                            "Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 4."
                    );
            }
        }
    }
}