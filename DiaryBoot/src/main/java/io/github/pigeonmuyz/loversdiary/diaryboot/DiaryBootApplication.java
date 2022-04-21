package io.github.pigeonmuyz.loversdiary.diaryboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class DiaryBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiaryBootApplication.class, args);
    }

}
