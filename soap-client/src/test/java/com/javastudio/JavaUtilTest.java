package com.javastudio;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class JavaUtilTest {

    private Logger logger= LoggerFactory.getLogger(JavaUtilTest.class);

    @Test
    void generateRandomUUID() {
        logger.info(UUID.randomUUID().toString());
    }
}
