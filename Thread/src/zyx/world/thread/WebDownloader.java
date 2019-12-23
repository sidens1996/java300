package zyx.world.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @ClassName: WebDownloader
 * @Description: 使用多线程下载图片
 * @Author: Achilles
 * @Date: 18/12/2019  21:59
 * @Version: 1.0
 **/

public class WebDownloader extends Thread{

    private String url;
    private String name;

    public WebDownloader(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public void download() {
        try {
            FileUtils.copyURLToFile(new URL(this.url), new File(this.name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        download();
    }

    public static void main(String[] args) {
        WebDownloader webDownloader = new WebDownloader(
                "http://apache-mirror.8birdsvideo.com/hive/hive-2.3.6/apache-hive-2.3.6-bin.tar.gz",
                "G:/1.tar.gz");
        WebDownloader webDownloader1 = new WebDownloader(
                "http://apache-mirror.8birdsvideo.com/hive/hive-2.3.6/apache-hive-2.3.6-bin.tar.gz",
                "G:/2.tar.gz");
        WebDownloader webDownloader2 = new WebDownloader(
                "http://apache-mirror.8birdsvideo.com/hive/hive-2.3.6/apache-hive-2.3.6-bin.tar.gz",
                "G:/3.tar.gz");
        webDownloader.start();
        webDownloader1.start();
        webDownloader2.start();

    }
}
