import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZonedDateTime;

/**
 * @author :Alanwti
 * @date :2022/10/23 22:19
 * @description:
 */
public class T1 {
    @Test
    void getTime(){
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
        //2022-10-23T22:22:17.674010400+08:00[Asia/Shanghai]
    }


}
