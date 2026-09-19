package com.workintech.s19d2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "role", schema = "bank", uniqueConstraints = @UniqueConstraint(columnNames = "authority"))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String authority;

    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
    private List<Member> members = new ArrayList<>();
}
