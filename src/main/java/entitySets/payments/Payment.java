package entitySets.payments;

import java.io.Serializable;
import java.sql.Time;
import java.time.ZonedDateTime;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Payment")

public class Payment implements Serializable {

    @Id
    private int paymentNumber;

    private int studentId;

    private ZonedDateTime date;
    private Float amount;
    private String formOfPayment;
    private int lessonsPaid;

    public int getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(int paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getFormOfPayment() {
        return formOfPayment;
    }

    public void setFormOfPayment(String formOfPayment) {
        this.formOfPayment = formOfPayment;
    }

    public int getLessonsPaid() {
        return lessonsPaid;
    }

    public void setLessonsPaid(int lessonsPaid) {
        this.lessonsPaid = lessonsPaid;
    }
}
