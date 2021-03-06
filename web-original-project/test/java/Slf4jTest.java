import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/9/12
 */
public class Slf4jTest {

    private final static Logger logger = LoggerFactory.getLogger(Slf4jTest.class);

    @Test
    public void log4jTest() {
        logger.error("logback 成功了");
        logger.debug("logback 成功了");
    }
}