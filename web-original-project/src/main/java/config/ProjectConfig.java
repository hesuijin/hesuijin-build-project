package config;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/9/10
 */
@Configuration
@Data
public class ProjectConfig {

    private String envDev;

    private String envTest;

    private String envNotExist;
}
