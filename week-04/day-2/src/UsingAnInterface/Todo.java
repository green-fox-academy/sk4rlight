package UsingAnInterface;

import java.util.ArrayList;
import java.util.Collections;

public class Todo implements Comparable<Todo> {

    private final String name;
    private boolean isCompleted = false;

    public Todo(String name) {
        this.name = name;
    }

    public void complete() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Todo o) {
        if ((this.isCompleted && o.isCompleted) || (!this.isCompleted && !o.isCompleted)) {
            return 0;
            // }  else if (this.isCompleted && !o.isCompleted) {
            //  return 1;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        var todo = new ArrayList<Todo>();

        var todoMilk = new Todo("Get milk");
        var todoObstacles = new Todo("Remove the obstacles");
        var todoStandUp = new Todo("Stand Up");
        var todoEatLunch = new Todo("Eat lunch");

        todo.add(todoMilk);
        todo.add(todoObstacles);
        todo.add(todoStandUp);
        todo.add(todoEatLunch);

        todoStandUp.complete();
        todoEatLunch.complete();

        System.out.println("Before sorting:");
        System.out.println();

        for (Todo list : todo) {
            System.out.println(list.toString());
        }

        System.out.println();
        System.out.println("After sorting:");
        System.out.println();

        Collections.sort(todo);

        for (Todo list : todo) {
            System.out.println(list.toString());
        }
    }
}
