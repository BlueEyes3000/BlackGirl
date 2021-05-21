import org.junit.Test;

import java.io.*;
import java.util.Scanner;

public class A {

    
    @Test
    public void mixTwoTxt() throws IOException {
        String filePathA = "D:\\新建文本文档.txt";
//        String dbFileContentA = dbFileContent(filePathA);
        String dbFileContentA = scannerInput(filePathA);
        System.out.println(dbFileContentA);
    }


    private String dbFileContent(String filePath) throws IOException {
        // 第一步：建立连接关系
        File file = new File(filePath);

        // 第二步：获取输入流
        FileInputStream stream = new FileInputStream(file);

        // 第三步：读取输入流
        InputStreamReader inputStreamReader = new InputStreamReader(stream);

        // 第四步：将流写进StringBuffer中，输出
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = null;
        StringBuilder strBuilder = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {
            strBuilder.append(line);
        }

        // 第五步：关流
        bufferedReader.close();
        inputStreamReader.close();
        stream.close();

        // 返回
        return strBuilder.toString();
    }



    private String scannerInput(String filePath) throws FileNotFoundException {

        StringBuilder stringBuilder = new StringBuilder(1000);
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);


        while (scanner.hasNext()) {
            stringBuilder.append(scanner.next());
        }

        return stringBuilder.toString();
    }

}
