package printableinterface;

public class ToDo implements Printable{
    private String task;
    private String priority;
    private boolean done;

    ToDo(String task, String priority, boolean done){
        this.task = task;
        this.priority =priority;
        this.done = done;
    }


    @Override
    public String printAllFields() {
        return "Task: "+this.task+" | Priority: "+this.priority+" | Done: "+ this.done;
    }
}
