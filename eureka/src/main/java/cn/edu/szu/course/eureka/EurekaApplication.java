package cn.edu.szu.course.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(EurekaApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(EurekaApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOGGER.info("启动成功！");
        LOGGER.info("Eureka Server Address: \t http://127.0.0.1:{}",env.getProperty("server.port"));
    }

}
