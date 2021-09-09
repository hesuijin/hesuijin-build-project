package config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/9/10
 */
@Configuration
@Data
public class ProjectConfig {


//    @Value("${ENV.DEV}")
    private String envDev;

//    @Value("${ENV.Test}")
    private String envTest;

}
