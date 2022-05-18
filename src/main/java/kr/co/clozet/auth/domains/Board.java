package kr.co.clozet.auth.domains;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
@Entity
@Table(name = "boards")
public class Board {
    @Id
    @Column(name = "board_id")
    @GeneratedValue private long boardId;
    @Column private @NotNull String boardName;
    @Column(name = "created_date") @NotNull private String createdDate;

    @OneToMany(mappedBy = "b")
    List<Article> articles = new ArrayList<>();


}
