package me.wanpin.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

/**
 * 1,整合MyBatis-Plus
 *  1)依赖导入
 *  2）配置
 *    1，配置数据源：导入数据库驱动
 *
 */

@MapperScan("me.wanpin.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {
    public static void main(String[] args) {
            SpringApplication.run(GulimallProductApplication.class, args);
        }
    }

