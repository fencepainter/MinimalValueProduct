package com.example.MinimalValueProduct.Customer;

import java.util.Objects;

public class Customer {

    private Integer id;
    private String name;
    private String email;
    private Boolean likesPancakes;
    private Boolean likesCats;


    public Customer() {
    }

    public Customer(Integer id, String name, String email, Boolean likesPancakes, Boolean likesCats) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.likesPancakes = likesPancakes;
        this.likesCats = likesCats;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getLikesPancakes() {
        return likesPancakes;
    }

    public void setLikesPancakes(Boolean likesPancakes) {
        this.likesPancakes = likesPancakes;
    }

    public Boolean getLikesCats() {
        return likesCats;
    }

    public void setLikesCats(Boolean likesCats) {
        this.likesCats = likesCats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(likesPancakes, customer.likesPancakes) && Objects.equals(likesCats, customer.likesCats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, likesPancakes, likesCats);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", likesPancakes=" + likesPancakes +
                ", likesCats=" + likesCats +
                '}';
    }
}
