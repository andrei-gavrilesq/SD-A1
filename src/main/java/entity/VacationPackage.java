package entity;
import javax.persistence.*;

@Entity
@Table(name = "vacationPackage")
public class VacationPackage {

    @Id
    private int vacation_id;

    @Column
    private String vacationName;


    @Column
    private int price;
    @Column
    private int period;
    @Column
    private String extra_details;
    @Column
    private int number_of_persons;

    @ManyToOne
    @JoinColumn
    private Destination destination;



}
