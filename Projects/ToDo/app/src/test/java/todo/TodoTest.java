package todo;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TodoTest {
  @Test public void testTodoHasEmptyList() {
    Todo test = new Todo();
    ArrayList<String> emptylist = test.createEmptyList();
    assertTrue(emptylist.isEmpty());
  }

  @Test public void testTodoAddTask() {
    Todo test = new Todo();
    ArrayList<String> expectedList = new ArrayList<>();
    expectedList.add("Hoover");
    assertEquals(expectedList, test.addTask("Hoover"));

    // assertEquals(1, result.size());
    // assertEquals(task, result.get(0));
  }
  @Test public void testTodoGetTaskList() {
    Todo test = new Todo();
    
    ArrayList<String> expectedList = new ArrayList<>();
    expectedList.add("Buy Milk");
    expectedList.add("Buy Coffee");

    test.addTask("Buy Milk");
    test.addTask("Buy Coffee");

    assertEquals(expectedList, test.getTaskList());
}
}