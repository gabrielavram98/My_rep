package pack1;
public class OutTask implements Task{
    String message;
    public OutTask() {
        message="Salut!";
    }

    public void execute(){
        System.out.println(this.message);
    }
}
