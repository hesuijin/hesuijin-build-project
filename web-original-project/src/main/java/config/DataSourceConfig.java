package config;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:数据库连接信息
 * @Author HeSuiJin
 * @Date 2021/9/12
 */
@Configuration
@Data
public class DataSourceConfig {

    private String driverClassName;

    private String url;

    private String username;

    private String password;
}
