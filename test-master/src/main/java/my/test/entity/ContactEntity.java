package my.test.entity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name = "contact", schema = "javastudy", catalog = "javastudy")

public class ContactEntity {
    private Date birthDate;
    private String firstName;
    private int id;
    private String lastName;
    private Integer vrsion;

    @Temporal(TemporalType.DATE)
    @Column(name = "birthdate", nullable = true, insertable = true, updatable = true)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "firstname", nullable = true, length = 60)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "lastname", nullable = true, length = 40)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Version
    @Column(name = "vrsion", nullable = true)
    public Integer getVrsion() {
        return vrsion;
    }

    public void setVrsion(Integer vrsion) {
        this.vrsion = vrsion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactEntity that = (ContactEntity) o;

        if (id != that.id) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (vrsion != null ? !vrsion.equals(that.vrsion) : that.vrsion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = birthDate != null ? birthDate.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (vrsion != null ? vrsion.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ContactEntity{" +
                "birthDate=" + birthDate +
                ", firstName='" + firstName + '\'' +
                ", id=" + id +
                ", lastName='" + lastName + '\'' +
                ", vrsion=" + vrsion +
                '}';
    }
}
