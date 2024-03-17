package Bai1;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        try {
            // Tạo mới file
            File newFile = new File("newfile.txt");
            newFile.createNewFile();
            System.out.println("File moi da duoc tao.");

            // Ghi dữ liệu vào file
            FileWriter writer = new FileWriter(newFile);
            writer.write("Day la noi dung duoc ghi vao file.");
            writer.close();
            System.out.println("Du lieu da duoc ghi vao file.");

            // Đọc file
            FileReader reader = new FileReader(newFile);
            int character;
            System.out.print("Noi dung cua file: ");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();

            // Lấy đường dẫn file
            String filePath = newFile.getAbsolutePath();
            System.out.println("\nDuong dan cua file: " + filePath);

            // Xóa file
            if (newFile.delete()) {
                System.out.println("File da duoc xoa.");
            } else {
                System.out.println("Khong the xoa file.");
            }

            // Tạo thư mục
            File newDirectory = new File("ThuMucMoiDcTao");
            if (newDirectory.mkdir()) {
                System.out.println("Thu muc moi da duoc tao.");
            } else {
                System.out.println("Khong the tao thu muc.");
            }
        } catch (IOException e) {
            System.out.println("Da xay ra loi khi thao tac voi file: " + e.getMessage());
        }
    }
}
