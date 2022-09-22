package jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @Author Qiao
 * @Create 2022/6/5 13:44
 */

public class JedisDemo1 {

    //创建一个jedis对象
    static Jedis jedis = new Jedis("124.221.120.151", 6379);

    public static void main(String[] args) {
        jedis.close();
    }

    @Test
    public void demo1(){
        jedis.auth("qiao9999");

        jedis.set("name", "乔");


        Set<String> keys = jedis.keys("*");
        for(String key : keys){
            System.out.println(key + " : " + jedis.get(key));
        }
    }

}
