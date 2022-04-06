package entity;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {


    @Id
    private int user_id;
    @Column
    private String username;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column(unique = true,nullable = false)
    private String email;
    //@Column
    //private String password;


    public User(){
    }

    public User(int user_id, String firstName, String lastName, String username, String email){
        this.user_id = user_id;
        this.firstName= firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }


}
