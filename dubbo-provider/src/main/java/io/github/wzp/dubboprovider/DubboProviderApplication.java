package io.github.wzp.dubboprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;


@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DubboProviderApplication.class, args);
        System.out.println("服务器启动成功");
    }

}
