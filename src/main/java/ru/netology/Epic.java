package ru.netology;

public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id); // вызов родительского конструктора
        this.subtasks = subtasks; // заполнение своих полей
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String i : subtasks)
            if (i.contains(query)) {
                return true;
            }
//        else {
//                return false;
//            }


//        if (.contains(query)) {
//            return true;
//        }
//        if (project.contains(query)) {
//            return true;
//        }
//        return false;
        return false;
    }
}