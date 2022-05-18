package kr.co.clozet.auth.domains;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;

import javax.persistence.*;
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component // 컴포넌트는 프로퍼티와 메소드의 집합이다.
@Entity

@Table(name="articles")
public class Article {
    @Id
    @Column(name = "article_id")
    @GeneratedValue private long articleId;
    @Column @NotNull private String title;
    @Column @NotNull private String content;
    @Column(name = "written_date") @NotNull private String writtenDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User u;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board b;

}

