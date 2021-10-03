package lesson_14;
import lombok.*;

@EqualsAndHashCode
@NoArgsConstructor
@ToString
@Getter
@Setter
@AllArgsConstructor
public class Person {

    private Integer id;
    private String name;
    private String email;

}
