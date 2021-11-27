import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/9/12
 */

//一样会被logback影响
@Slf4j
public class LombokSlf4jTest {

    @Test
    public void log4jTest() {
        log.error("logback 成功了");
        log.debug("logback 成功了");
        log.info("打印日志");

        log.info("test1");
        log.info("test2");
        log.info("test3");

        log.info("hesuijin");

        log.info("你好啊");

        log.info("你好啊第二次");

        log.info("MyTest1");
        log.info("MyTest2");
        log.info("MyTest3");
    }
}