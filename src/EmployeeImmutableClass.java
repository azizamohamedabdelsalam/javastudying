/*
* The instance variable of the class is final i.e. we cannot change its value of it after creating an object.
The class is final so we cannot create the subclass.
There are no setter methods i.e. we have no option to change the value of the instance variable.
* */
public final class EmployeeImmutableClass {
    final String identificationIDNumber;

    EmployeeImmutableClass(String identificationIDNumber){
        this.identificationIDNumber=identificationIDNumber;
    }
    public String getIdentificationIDNumber(){
        return identificationIDNumber;
    }

}
