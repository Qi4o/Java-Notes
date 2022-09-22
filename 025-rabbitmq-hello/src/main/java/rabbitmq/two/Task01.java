package rabbitmq.two;

import com.rabbitmq.client.Channel;
import rabbitmq.utils.RabbitMQUtils;

import java.util.Scanner;

/**
 * @Author Qiao
 * @Create 2022/8/1 15:38
 */

public class Task01 {

    //队列名称
    public static final String QUEUE_NAME = "hello";

    //发送大量消息
    public static void main(String[] args) throws Exception{
        Channel channel = RabbitMQUtils.getChannel();

        //队列的声明
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        //从控制台中接收消息
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String message = scanner.next();
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println("发送消息完成 " + message);
        }
    }
}
