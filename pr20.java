public class pr20 {
    public static void main(String[] args) {
        degree D = new degree();
        undergraduate U = new undergraduate();
        postgraduate P = new postgraduate();
        D.getdegree();
        U.getdegree();
        P.getdegree();

    }
    
}
class degree{
    void getdegree(){
        System.out.println("I got degree");

    }
}
class undergraduate extends degree{
    void getdegree(){
        System.out.println("I got undergraduate");

    }

}
class postgraduate extends degree{
    void getdegree(){
        System.out.println("I got postgraduate");
    }

}
