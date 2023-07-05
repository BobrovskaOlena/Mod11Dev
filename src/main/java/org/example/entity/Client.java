package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Client")
public class Client {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "name", nullable = false, length = 200)
        private String name;


        public Long getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public void setName(String name) {
                this.name = name;
        }

        @Override
        public String toString() {
                return "Client{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
        }
}
