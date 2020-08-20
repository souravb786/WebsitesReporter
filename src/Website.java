public abstract class Website {

    protected String name;
    protected int value;

    public abstract void obtainMessage(String message);

    public Website(String name) {
        this.name = name;
        value = 0;
    }
}
