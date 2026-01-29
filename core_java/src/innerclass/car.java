package innerclass;

public class car {

       private String model;
        private boolean status;

    public String getModel() {
        return model;
    }

    public car(String model) {
        this.model = model;
        status=false;
    }
    public boolean isStatus() {
        return status;
    }
  class Engine {
void start(){
    if(status){
        System.out.println( model + "car is start ALREADY");
    }
    else if(!status){
        status=true;
        System.out.println(model +"car is start");
    }
}
void stop(){
    if(status) {
        status = false;
        System.out.println(model + "car is stop");
    }
    else{
        System.out.println(model +"car is stop already");
    }
}
  }
}
