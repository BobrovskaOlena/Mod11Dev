package org.example.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "Planet")
public class Planet {
    @Id
    @Column (name = "id", length = 20, nullable = false)
    private String id;

    @Column (name = "name", length = 500, nullable = false)
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
