package app;

import repository.Data;
import repository.DataRepositoryImpl;

public class Home {
    public static void main(String[]args){
        UI frontend=new UI();
        Backend backend=new Backend(new DataRepositoryImpl(new Data()));
        while(true){
            frontend.showOptions();
            backend.runBackend();
            System.out.println("\n");
        }
    }
}
