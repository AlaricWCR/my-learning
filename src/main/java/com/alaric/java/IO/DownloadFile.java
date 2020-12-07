package com.alaric.java.IO;

import java.io.*;
import java.net.URL;

/**
 * @ClassName DownloadFile
 * @Description TODO 字节流结合URL编程实现文件的下载
 * @Author Alaric
 * @Date 2020/11/30
 **/
//public class DownloadFile {
//    public static void main(String[] args) {
//        try {
//            download("https://imgchr.com/i/DJHD4f","my.jpg","F:\\code");
//        } catch (IOException e) {
//            System.err.println("文件下载出现异常");
//        }
//    }
//
//    /**
//     * 将网络文件下载到本地
//     *
//     * @param urlString 文件到url路径
//     * @param fileName 保存的文件名
//     * @param savePath 保存路径
//     * @throws IOException 异常
//     */
//    public static void  download(String urlString, String fileName, String savePath) throws  IOException {
//        //构造url
//        URL url = new URL(urlString);
//        //打开链接
//        URL Connection conn = url.openConnection();
//        //设置请求超时
//        conn.setCOnnectTimeout(5000);
//        //构造输入流
//        InputStream is = conn.getInputStream();
//        //定义数据缓冲
//        byte[] bytes = new byte[1024];
//        //读取的数据长度
//        int len;
//        //创建文件对象
//        File file = new File(savePath);
//        if (!file.exists()) {
//            file.mkdirs();
//        }
//        //构造输出文件流
//        File file1;
//        OutputStream os = new FileOutputStream(file.getPath() + File.separator + fileName );
//        //开始读取，每次读取缓冲区大小的字节数
//        while((len = is.read(bytes)) != -1) {
//            os.write(bytes, 0, len);
//        }
//        //关闭连接
//        os.close();
//        is.close();
//    }
//}
