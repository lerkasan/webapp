package com.web.app.model.entity.templ;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@NoArgsConstructor
@MappedSuperclass
@ToString
public class BaseEntity {

    @Id
    @SequenceGenerator(name = "app_sequence", sequenceName = "app_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_sequence")
    private Long id;

    public BaseEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
