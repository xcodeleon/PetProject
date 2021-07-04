import java.io.File;
import java.io.IOException;


public class MainRenameFiles {

    public static void main(String[] args) throws IOException {

        File[] filesList;
        File filesPath = new java.io.File("D:\\picture\\oboi"); // создаем объект на папку с файлами

        filesList = filesPath.listFiles(); // записываем файлы из папки в массив объектов типа File

        for (int i = 0; i < filesList.length; i++) {
            String buf = filesList[i].getName(); // читаем текущее имя файла
            if (buf.endsWith(".jpg")) {
                buf = buf.concat("1234" + ".jpg");
                filesList[i].renameTo(new File("D:\\wallpapers\\" + buf));
            }
        }
    }
}
