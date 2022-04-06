package entity;
import javax.persistence.*;


@Entity
@Table(name = "destination")
public class Destination {

    @Id
    private int dest_id;

    @Column
    private String destinationName;

    public Destination(int dest_id, String destinationName) {
        this.dest_id = dest_id;
        this.destinationName = destinationName;
    }


}
