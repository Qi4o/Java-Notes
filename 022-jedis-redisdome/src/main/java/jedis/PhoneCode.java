package jedis;

import redis.clients.jedis.Jedis;

import java.util.Random;

/**
 * @Author Qiao
 * @Create 2022/6/5 15:07
 */

public class PhoneCode {
    public static void main(String[] args) {
        //模拟验证码发送
        verifyCode("18871137821");

//        getRedisCode("18871137821", "395534");
    }

    //1.生成六位数字验证码
    public static String getCode(){
        Random random = new Random();
        String code = "";
        for (int i = 0; i < 6; i++) {
            code += random.nextInt(10);
        }
        return code;
    }

    //2.每个手机每天只能发送三次,验证码放到redis里，设置过期时间
    public static void verifyCode(String phone){
        Jedis jedis = new Jedis("124.221.120.151", 6379);
        jedis.auth("qiao9999");

        //手机发送次数的key
        String countKey = "VerifyCode" + phone + ":count";
        //验证码key
        String codeKey = "VerifyCode" + phone + ":code";

        String count = jedis.get(countKey);
        if (count == null){
            //没有发送次数，第一次发送
            jedis.setex(countKey, 24*60*60, "1");
        } else if (Integer.parseInt(count) <= 2){
            //发送次数加1
            jedis.incr(countKey);
        } else if (Integer.parseInt(count) > 2){
            //发送三次，不能再发送
            System.out.println("今天的发送次数已经超过三次");
            jedis.close();
        }

        //发送的验证码要存到redis里面
        String vcode = getCode();
        jedis.setex(codeKey, 120, vcode);

        jedis.close();
    }

    //3.验证码校验
    public static void getRedisCode(String phone, String code){
        //从redis获取验证码
        Jedis jedis = new Jedis("124.221.120.151", 6379);
        jedis.auth("qiao9999");

        String codeKey = "VerifyCode" + phone + ":code";
        String redisCode = jedis.get(codeKey);

        if (redisCode.equals(code)){
            System.out.println("成功");
        } else{
            System.out.println("失败");
        }
        jedis.close();
    }
}
