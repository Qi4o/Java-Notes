package rabbitmq.one;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @Author Qiao
 * @Create 2022/8/1 11:04
 */

//生产者：发消息
public class Producer {

    //队列名称
    public static final String QUEUE_NAME = "hello";

    //发消息
    public static void main(String[] args) throws Exception{
        //创建一个连接工程
        ConnectionFactory factory = new ConnectionFactory();
        //工厂ID 连接rabbitMQ的队列
        factory.setHost("124.221.120.151");
        //设置用户名
        factory.setUsername("qiao");
        //密码
        factory.setPassword("qiao9999");

        //创建连接
        Connection connection = factory.newConnection();
        //获取信道
        Channel channel = connection.createChannel();
        /**
         * 生成一个队列
         * 1.队列名称
         * 2.队列里面的消息是否持久化 默认情况消息存储在内存中
         * 3.该队列是否只供一个消费者进行消费，是否进行消息共享 true表示可以多个消费者消费
         * 4.是否自动删除，最后一个消费者断开连接以后，该队列是否删除 true自动删除
         * 5.其他参数
         */
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        //发消息
        String message = "hello world";

        /**
         * 发送一个消息
         * 1.发送到哪个交换机
         * 2.路由的Key值是哪个，本次是队列的名称
         * 3.其他参数信息
         * 4.发送的消息体
         */
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
        System.out.println("消息发送结束");
    }

}
