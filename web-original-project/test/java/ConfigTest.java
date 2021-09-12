
import config.DataSourceConfig;
import config.ProjectConfig;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/9/10
 */
public class ConfigTest {


    /**
     * 测试是否可以获取配置
     */
    @Test
    public void configTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/spring-context.xml");
        ProjectConfig projectConfig = applicationContext.getBean(ProjectConfig.class);
        System.out.println(projectConfig);
    }

    /**
     * 测试是否可以获取配置
     */
    @Test
    public void datasourceConfigTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/spring-context.xml");
        DataSourceConfig dataSourceConfig = applicationContext.getBean(DataSourceConfig.class);
        System.out.println(dataSourceConfig);
    }
}
