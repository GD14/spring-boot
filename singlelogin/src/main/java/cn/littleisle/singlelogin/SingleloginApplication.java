package cn.littleisle.singlelogin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.littleisle.singlelogin.orm.dao")
@SpringBootApplication
public class SingleloginApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingleloginApplication.class, args);
    }
}
