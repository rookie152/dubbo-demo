package io.github.wzp.dubboconsumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations= {"classpath:consumer.xml"})
public class Config {


}
