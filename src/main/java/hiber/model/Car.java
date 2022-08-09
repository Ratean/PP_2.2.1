package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "series")
    private int series;

    @Column(name = "model")
    private String model;

    @OneToOne(mappedBy = "car", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private User user;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, User user) {
        this.model = model;
        this.user = user;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
