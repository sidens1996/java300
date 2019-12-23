package zyx.world.thread;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.Serializable;
import java.util.concurrent.*;

/**
 * @ClassName: TestThread3
 * @Description: 测试Callable
 * @Author: Achilles
 * @Date: 19/12/2019  14:32
 * @Version: 1.0
 **/

public class TestStartThread3 implements Callable<Boolean> {

    private String url;
    private String name;

    public TestStartThread3(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() throws Exception {
        new WebDownloader(this.url, this.name).download();
        return true;
    }

    public static void main(String[] args) {
        TestStartThread3 testStartThread3 = new TestStartThread3(
                "http://apache-mirror.8birdsvideo.com/hive/hive-2.3.6/apache-hive-2.3.6-bin.tar.gz",
                "G:/1.tar.gz");
        TestStartThread3 testStartThread31 = new TestStartThread3(
                "http://apache-mirror.8birdsvideo.com/hive/hive-2.3.6/apache-hive-2.3.6-bin.tar.gz",
                "G:/1.tar.gz");
        TestStartThread3 testStartThread32 = new TestStartThread3(
                "http://apache-mirror.8birdsvideo.com/hive/hive-2.3.6/apache-hive-2.3.6-bin.tar.gz",
                "G:/1.tar.gz");
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Boolean> submit = executorService.submit(testStartThread3);
        Future<Boolean> submit1 = executorService.submit(testStartThread31);
        Future<Boolean> submit2 = executorService.submit(testStartThread32);
        executorService.shutdown();
    }
}
