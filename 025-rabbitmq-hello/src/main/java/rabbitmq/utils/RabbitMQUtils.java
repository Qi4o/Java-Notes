package rabbitmq.utils;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @Author Qiao
 * @Create 2022/8/1 12:29
 */

public class RabbitMQUtils {

    public static Channel getChannel() throws Exception{
        //创建一个连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("124.221.120.151");
        factory.setUsername("qiao");
        factory.setPassword("qiao9999");
        Connection connection = factory.newConnection();

        return connection.createChannel();
    }
}
