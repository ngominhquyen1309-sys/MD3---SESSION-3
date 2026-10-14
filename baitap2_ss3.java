import java.util.Scanner;

public class baitap2_ss3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        int count = 0;
        double sum = 0;
        double max = 0;
        double min = 0;

        while (true) {
            System.out.println("\n************ MENU NHẬP ĐIỂM ************");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Nhập điểm học viên (-1 để kết thúc): ");
                        double score = sc.nextDouble();

                        if (score == -1) {
                            break;
                        }

                        if (score < 0 || score > 10) {
                            System.out.println("Điểm không hợp lệ! Vui lòng nhập từ 0 đến 10.");
                            continue;
                        }

                        // Cập nhật thống kê
                        sum += score;
                        count++;

                        if (count == 1) {
                            max = score;
                            min = score;
                        } else {
                            if (score > max) {
                                max = score;
                            }

                            if (score < min) {
                                min = score;
                            }
                        }

                        // Xếp loại học lực
                        if (score < 5) {
                            System.out.println("Xếp loại: Yếu");
                        } else if (score < 7) {
                            System.out.println("Xếp loại: Trung Bình");
                        } else if (score < 8) {
                            System.out.println("Xếp loại: Khá");
                        } else if (score < 9) {
                            System.out.println("Xếp loại: Giỏi");
                        } else {
                            System.out.println("Xếp loại: Xuất sắc");
                        }
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        System.out.println("Số học viên đã nhập: " + count);
                        System.out.printf("Điểm trung bình: %.2f%n", sum / count);
                        System.out.println("Điểm cao nhất: " + max);
                        System.out.println("Điểm thấp nhất: " + min);
                    }
                    break;

                case 3:
                    System.out.println("Kết thúc chương trình!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 3.");
            }
        }
    }
}
