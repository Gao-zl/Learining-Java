import java.io.File;

public class CreateDir { 
    public static void main(String[] args) { 
        String dirname = "./test/test01";
        File d = new File(dirname);
        d.mkdirs();
    }
}
