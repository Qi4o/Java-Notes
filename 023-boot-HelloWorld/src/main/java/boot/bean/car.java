package boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @Author Qiao
 * @Create 2022/6/19 10:17
 */

@ToString
@Data
@Component
public class car {

    private String brand;
    private Integer price;
}
