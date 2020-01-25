  
	  // Korzystajšc z klas: Pair oraz Triple (możesz je tu wkleić) - stwórz klasę Quadruple,
	  //która jest uniwersalnym kontenerem dla 4 typów generycznych. 
	  // W main pokaż użycie. 


import java.util.Scanner;

public class Quadruple <A,B,C,D> 
{
    private A  alpha;
    private B  beta;
    private C  charlie;
    private D  delta;

    protected Quadruple(A alpha,B beta,C charlie,D delta)
    {
        this.alpha=alpha;
        this.beta=beta;
        this.charlie=charlie;
        this.delta=delta;
    }
    public Quadruple listCrew(){
        System.out.println("A members:"+alpha);
        System.out.println("B members:"+beta);
        System.out.println("C members:"+charlie);
        System.out.println("D members:"+delta);

        Quadruple temp = new Quadruple(alpha,beta,charlie,delta);

        return temp;
    }
    public void AddUserA(A alpha)
    {
        this.alpha=alpha;
    }
    public void AddUserB(B beta)
    {
        this.beta=beta;
    }
    public void AddUserC(C charlie)
    {
        this.charlie=charlie;
    }
    public void AddUserD(D delta)
    {
        this.delta=delta;
    }



    public static void main(String[] args) 
    {

        Quadruple<String,String,String,String> quadruple = new Quadruple
                <String, String, String,String>
                ("Pablo","Marco","Miquel","Tommy");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String c = scanner.nextLine();

        quadruple.AddUserC(c);
        quadruple.AddUserB(a);
        quadruple.listCrew();
        
    }
}
