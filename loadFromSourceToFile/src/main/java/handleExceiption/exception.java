package handleExceiption;

import Email.EmailService;
import database.ConnectToDatabase;
import entities.logs;

import java.sql.Timestamp;

import static dao.logsDao.logException;
import static database.ConnectToDatabase.getEmail;

public class exception {


    // Exception xử lý không kết nối thành công đến config
    public static boolean connectConfigException(Exception e){
        EmailService emailService = new EmailService();
        System.err.println("Không thể kết nối đến config");
        logException(new logs(3, "Không thể kết nối đến config",  new Timestamp(System.currentTimeMillis()), "Error"));

        String subject = "KHÔNG LẤY CÁC DỮ LIỆU TRONG CONFIG";
        emailService.send(getEmail(),subject,"Lỗi khi kết nối đến config: "+ e.getMessage().toString());
        return false;
    }

    //Exception xử lý không thể lấy mô tả từ trang tiki
    public static boolean getShortDescriptionTikiException(Exception e){
        EmailService emailService = new EmailService();
        System.err.println("Lỗi khi lấy mô tả từ tiki");
        logException(new logs(3, "Lỗi khi lấy mô tả từ tiki",  new Timestamp(System.currentTimeMillis()), "Error"));

        String subject = "LỖI KHI LẤY MÔ TẢ TỪ LIÊN KẾT TRANG TIKI";
        emailService.send(getEmail(),subject,"Lỗi khi lấy dữ liệu mô tả từ trang tiki: "+ e.getMessage().toString());
        return false;
    }

    //Exception xử lý khi lưu dữ liệu được crawl vào file csv
    public static boolean saveDataToCSVException(Exception e){
        EmailService emailService = new EmailService();
        System.err.println("Lỗi khi lưu dữ liệu vào file csv");
        logException(new logs(3, "Lỗi khi lưu dữ liệu vào file csv",  new Timestamp(System.currentTimeMillis()), "Error"));

        String subject = "LỖI KHI LƯU DỮ LIỆU VÀO FILE CSV";
        emailService.send(getEmail(),subject,"Lỗi khi lưu dữ liệu vào file csv: "+ e.getMessage().toString());
        return false;
    }

    //Exeption xử lý lỗi khi duyệt qua liên kết của trang tiki
    public static boolean linkTikiException (Exception e){
        EmailService emailService = new EmailService();
        System.err.println("Lỗi khi duyệt qua liên kết của tiki");

        String subject = "LỖI KHI KHI DUYỆT QUA LIÊN KẾT CỦA TIKI";
        emailService.send(getEmail(),subject,"Lỗi khi duyệt qua liên kết của tiki: "+ e.getMessage().toString());
        logException(new logs(3, "Lỗi khi duyệt qua liên kết Tiki",  new Timestamp(System.currentTimeMillis()), "Error"));
        return false;
    }

    }

