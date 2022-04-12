package vn.daotq.interviewapp.model;

import javax.persistence.*;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "question")
@NoArgsConstructor
@Data
public class Question {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String title;
    @NotNull
    private String description;
    @NotNull
    private String answerHTML;
    @NotNull
    private byte level;
    @NotNull
    private String image;
    @NotNull
    private long dateCreate;
    @NotNull
    private long dateUpdate;
    @NotNull
    private byte status;
    @ManyToOne(optional=false)
    @JoinColumn(referencedColumnName="id", insertable=false, updatable=false)
    private Department department;
}
