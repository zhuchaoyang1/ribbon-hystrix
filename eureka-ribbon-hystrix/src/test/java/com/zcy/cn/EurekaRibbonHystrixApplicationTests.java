package com.zcy.cn;

import com.zcy.cn.service.FeignProvider;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class EurekaRibbonHystrixApplicationTests {

    @Autowired
    private FeignProvider feignProvider;

    @Test
    public void contextLoads() {
        log.info("FeignClient Fetch Remote Result:{}", feignProvider.provider());
    }

}
