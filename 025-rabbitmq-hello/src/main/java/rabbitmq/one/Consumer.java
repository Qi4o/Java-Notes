package rabbitmq.one;

import com.rabbitmq.client.*;

/**
 * @Author Qiao
 * @Create 2022/8/1 11:56
 * 消费者 接收消息
 */

public class Consumer {
    //队列名称
    public static final String QUEUE_NAME = "hello";

    //接收者
    public static void main(String[] args) throws Exception{
        //创建连接工程
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("124.221.120.151");
        factory.setUsername("qiao");
        factory.setPassword("qiao9999");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        //声明 接收消息
        DeliverCallback deliverCallback = (consumerTag,message) -> {
            System.out.println(new String(message.getBody()));
        };

        //取消消息
        CancelCallback cancelCallback = consumerTag -> {
            System.out.println("消息消费被中断");
        };
        /**
         * 消费者接受消息
         * 1.消费哪个队列
         * 2.消费成功之后是否要自动应答，true代表自动
         * 3.消费者未成功接受的回调
         * 4.消费者取消接受的回调
         */
        channel.basicConsume(QUEUE_NAME, true, deliverCallback, cancelCallback);
    }
}
