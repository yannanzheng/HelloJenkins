import org.junit.Test;
import practice.Person;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by jfyang on 13/12/2016.
 */
public class PersonTest {
    @Test
    public void should_return_person_object_when_create(){
        Person person=new Person("Jack",18);
        assertEqu als("Jack1",person.getName());

    }
}
