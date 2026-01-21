package lk.neo369.kamakade.model;

import jakarta.persistence.*;
import lk.neo369.kamakade.enums.AddOns;
import lk.neo369.kamakade.enums.PortionSize;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "item_variants")
@Getter
@Setter
@NoArgsConstructor
public class ItemVariant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_variant_code", unique = true)
    private String itemVariantCode;

    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "portion_size")
    private PortionSize portionSize;

    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    @Column(name = "add_ons")
    private List<AddOns> addOnsList;

    @Column(name = "prepare_time_minutes")
    private Integer prepTimeMinutes;


    @ManyToOne
    @JoinColumn(name = "menu_item_id")
    private MenuItem menuItem;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;


    @CreationTimestamp
    @Column(name = "created_at")
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Instant updatedAt;

    @Version
    private int version;




}
