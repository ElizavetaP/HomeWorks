package homework160531.nuclearSubmarine;

@ClassPreamble(
        author = "Popugaeva Elizaveta",
        date = "08/06/2016",
        lastModified = "09/06/2016",
        lastModifiedBy = "Popugaeva Elizaveta"
)

public class NuclearSubmarine {
    Engine engine;
    private boolean canFloat;

    NuclearSubmarine(){
        engine = new Engine();
    }

    public void ship(){
        if(canFloat){
            System.out.println("Submarine floats");
        }else {
        System.out.println("Submarine can't float. The engine is not running");
    }}
    class Engine{
        public void startEngine(){
            canFloat = true;
            System.out.println("The engine is running");

        }
    }

}
