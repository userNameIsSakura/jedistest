package com.fzw.jedis;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

public class JedisApplication {

    private Jedis jedis;

    @BeforeEach
    public void setup() {
        jedis = JedisConnectionFactory.getJedis();
        jedis.select(1);
    }

    @Test
    public void main() {
        jedis.set("idea","yyds");
        System.out.println(jedis.get("idea"));
    }

    @AfterEach
    public void shutDown() {
        if(jedis != null)
            jedis.close();
    }




}
