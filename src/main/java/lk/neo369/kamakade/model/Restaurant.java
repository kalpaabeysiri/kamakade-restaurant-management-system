package lk.neo369.kamakade.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lk.neo369.kamakade.enums.RestaurantStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @Column(name = "restaurant_id")
    private Long restaurantId;

    @Column(name = "restaurant_no" , unique = true)
    private String restaurantNo;

    private String name;

    @Column(unique = true)
    @Email(message = "Invalid email address")
    private String email;

    @Enumerated(EnumType.STRING)
    private RestaurantStatus status;

    @Column(name = "contact_number")
    private String contactNumber;

    @OneToMany(mappedBy = "restaurant")
    private List<Branch> branches;

    @CreationTimestamp
    @Column(name = "created_at")
    private Instant createdAt;


    @UpdateTimestamp
    @Column(name = "updated_at")
    private Instant updatedAt;

    @Version
    private int version;


}
