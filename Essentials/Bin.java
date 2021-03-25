public class Bin<T> {
    private Object content;

    public  Bin(Object content){
        this.content = content;

    }
    public Object getContent(){
        return content;
    }
    public void setContent(Object content){
        this.content = content;
    }

    public static void main(String[] args) {
        Bin<String> test = new Bin<>("I'm a basic string.");
        //test.setContent(new YellowJacket(1,4));
        //test.setContent(new Car("Yuhina", "Spark", 2037));
        System.out.println(test.getContent());
    }
}
