public class Main {
    public static void main(String[] args) {
        Backend [] java = {new Java(), new CSharp(), new Python()};
        for (Backend a :java ) {
            System.out.println(a.getClass());
        if (a instanceof  Java){
            Java java1=(Java) a;
            java1.spring();
        }else if (a instanceof CSharp){
            CSharp cSharp=(CSharp) a;
            cSharp.doNet();
        }else if (a instanceof  Python) {
            Python python = (Python)  a;
        python.django();
    }
}}}