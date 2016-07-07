package com.web.app.model.entity;

import com.web.app.model.entity.templ.BaseEntity;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@ToString(callSuper = true)
@Table(name = "users")
public class UserEntity extends BaseEntity {

    public UserEntity() {
    }

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "password", nullable = false)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    //    TODO: one to many relationship
//    @Setter
//    @Getter
//    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
//    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
//    @JoinColumn(name = "id_image", unique = true, nullable = false)
//    private AccountEntity image;

}
