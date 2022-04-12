package vn.daotq.interviewapp.model;

import javax.persistence.*;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@NoArgsConstructor
@Table(name = "categories")
@Data
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String image;
    @NotNull
    private long dateCreate;
    @NotNull
    private long dateUpdate;

    @NotNull
    private byte status;

    @ManyToOne(optional=false)
    @JoinColumn(referencedColumnName="id", insertable=false, updatable=false) //cart_id chính là trường khoá phụ trong table Item liên kết với khóa chính trong table Cart
    private Department department;

    @OneToMany
    private Set<Question> questions;
}

