package adaptAssignment.intermediateOopsAssignment;

public class ques1 {
    static class Singleton {

        private static Singleton single_instance = null;

        public String s;

        //private constructor
        private Singleton()
        {
            s = "Hello ";
        }

        // Static method
        public static synchronized Singleton getInstance()
        {
            if (single_instance == null)
                single_instance = new Singleton();

            return single_instance;
        }
    }
    static class Dummy extends Singleton {
        // This will give error as Singleton class has private constructor
        // So we cannot inherit from a Singleton class
    }

    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        System.out.println("Hashcode of x is "
                + x.hashCode());
    }
}
