package homework_6;

public class Wild extends Ground{

private boolean isPreadtor;

    public boolean isPreadtor() {
        return isPreadtor;
    }

    public void setPreadtor(boolean preadtor) {
        isPreadtor = preadtor;
    }



    public void hungry(){
        if (isPreadtor){
            System.out.println(" and I am angry.");
        }
        else{
            System.out.println(" and I'm eating grass of leaves.");
        }
    }

}
