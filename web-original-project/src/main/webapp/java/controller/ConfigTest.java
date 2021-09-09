package controller;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/9/9
 */
@Configuration
public class ConfigTest {

    @Value("${ENV.DEV}")
    private String env;

}
