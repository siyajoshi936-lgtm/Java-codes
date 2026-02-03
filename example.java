interface university{
    void admission();
}

class faculty implements university{
    public void admission(){
        System.out.println("Faulty handles admission process in this university");
    }
}

public class example{
    public static void main(String[] args) {
        faculty f = new faculty();
        f.admission();
    }
}