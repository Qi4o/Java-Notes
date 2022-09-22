package jedis;

import redis.clients.jedis.Jedis;

/**
 * @Author Qiao
 * @Create 2022/6/6 00:00
 */

public class Test {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("124.221.120.151", 7290);
        jedis.auth("qiao9999");
        System.out.println(jedis.ping());
    }
}
