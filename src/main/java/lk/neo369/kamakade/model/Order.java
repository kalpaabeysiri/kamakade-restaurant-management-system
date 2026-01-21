package lk.neo369.kamakade.model;

import jakarta.persistence.*;
import lk.neo369.kamakade.enums.DeliveryStatus;
import lk.neo369.kamakade.enums.OrderStatus;
import lk.neo369.kamakade.enums.OrderType;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer orderNumber;

    private Short tableNumber;

    private OrderStatus orderStatus;

    private OrderType orderType;

    private DeliveryStatus deliveryStatus;

    private String phoneNumber;

    






}
