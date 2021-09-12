
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/9/12
 */
@Slf4j
public class Slf4jTest {

    @Test
    public void log4jTest() {
        log.info("********          " + "你好啊" + "             *******");
        log.info("-----------------------------");

    }
}