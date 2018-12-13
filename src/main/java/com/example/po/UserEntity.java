package com.example.po;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "test")
public class UserEntity {
    private int userId;
    private String userName;

    public UserEntity(){

    }

    public UserEntity(int userId,String userName){
        this.userId = userId;
        this.userName = userName;
    }

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return userId == that.userId &&
                Objects.equals(userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName);
    }
}
