package zyx.world.thread;

/**
 * @ClassName: TestStartThread2
 * @Description: 测试创建线程方式2，实现Runnable接口
 * @Author: Achilles
 * @Date: 19/12/2019  13:37
 * @Version: 1.0
 **/

public class TestStartThread2 implements Runnable{

    private String url;
    private String name;

    public TestStartThread2(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        new WebDownloader(url, name).download();
    }

    public static void main(String[] args) {

        new Thread(new TestStartThread2(
                "http://apache-mirror.8birdsvideo.com/hive/hive-2.3.6/apache-hive-2.3.6-bin.tar.gz",
                "G:/1.tar.gz"));
        new Thread(new TestStartThread2(
                "http://apache-mirror.8birdsvideo.com/hive/hive-2.3.6/apache-hive-2.3.6-bin.tar.gz",
                "G:/1.tar.gz")).start();
        new Thread(new TestStartThread2(
                "http://apache-mirror.8birdsvideo.com/hive/hive-2.3.6/apache-hive-2.3.6-bin.tar.gz",
                "G:/1.tar.gz")).start();
    }
}
