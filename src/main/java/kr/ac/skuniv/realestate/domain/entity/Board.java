package kr.ac.skuniv.realestate.domain.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by YoungMan on 2019-02-16.
 */

@Entity
@Getter
@Setter
@Table(name = "board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    private String title;

    private String content;

    private String author;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date registerDate;

    @UpdateTimestamp
    @Temporal(TemporalType.DATE)
    private Date modifyDate;

    @OneToMany(mappedBy = "board", cascade = {CascadeType.REMOVE}, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Answer> answers = new ArrayList<>();

    public Board() {
    }

    @Builder
    public Board(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Board{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", registerDate=" + registerDate +
                ", modifyDate=" + modifyDate +
                ", answers=" + answers +
                '}';
    }
}
