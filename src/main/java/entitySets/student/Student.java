package entitySets.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Year;

@Entity
@Table(name = "Student")
public class Student implements Serializable {
    @Id
    private int studentId;

    private String name;
    private String parentName;
    private String parentEmail;
    private Year bithYear;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public Year getBithYear() {
        return bithYear;
    }

    public void setBithYear(Year bithYear) {
        this.bithYear = bithYear;
    }
}
