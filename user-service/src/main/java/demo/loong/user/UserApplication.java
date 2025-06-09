package demo.loong.user;

import cn.hutool.core.date.StopWatch;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "demo.loong.user.repository")
public class UserApplication {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        SpringApplication.run(UserApplication.class, args);
        stopWatch.stop();
        System.out.println("花费：" + stopWatch.getTotalTimeMillis());
    }

}
