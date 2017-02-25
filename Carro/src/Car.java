/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Car {
    private Person passanger;
    private Person otherPassanger;
    private Person drive;

    
    public Person getPassanger() {
        return passanger;
    }

    public void setPassanger(Person passanger) {
        this.passanger = passanger;
    }

    public Person getOtherPassanger() {
        return otherPassanger;
    }

    public void setOtherPassanger(Person otherPassanger) {
        this.otherPassanger = otherPassanger;
    }

    public Person getDrive() {
        return drive;
    }

    public void setDrive(Person drive) {
        this.drive = drive;
    }
    
    String[] getPassangers(){
        String[] names = new String[2];
        names[0]=this.passanger.getName();
        names[1]=this.otherPassanger.getName();
        return names; 
    }

    public Person getDriver() { 
        return drive; 
    }
}
