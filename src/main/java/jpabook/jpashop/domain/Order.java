package jpabook.jpashop.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Order {

    @Id @GeneratedValue
    private Long id;
    private Long memberId;
    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)//순서가 바뀌거나 하면 장애가 발생할 수도 있기때문에!! String!!!
    private OrderStatus status;

    private int test;
}
