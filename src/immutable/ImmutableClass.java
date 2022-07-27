package immutable;

//Using Builder pattern is easy when number of optional attributes are more in the immutable class.

import java.util.HashMap;

public class ImmutableClass {
    //being immutable means i don't want its object to change its state through its lifecycle in the project
    // so the immutable class should have only getter methods and don't have setter
    //The immutable class will have a private constructor with Builder object as parameter that will be used to create the immutable class.


    //required fields
    private int id;
    private String name;

    //optional fields
    private HashMap<String, String> properties;
    private String company;

/* Getter Methods*/
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //since  i want to make xxxx immutable these attributes are not immutable(HashMap), i should perform cloning to avoid modification of these attributes.
    public HashMap<String, String> getProperties() {
        //return cloned object to avoid changing it
        return (HashMap<String, String>) properties.clone();
    }

    public String getCompany() {
        return company;
    }
/*---------*/
/* Constructor*/
private ImmutableClass(ImmutableClassBuilder builder) {
    this.id = builder.id;
    this.name = builder.name;
    this.properties = builder.properties;
    this.company = builder.company;
}
/*-------------*/
/* Builder Class*/
public static class ImmutableClassBuilder{
    //required fields
    private int id;
    private String name;

    //optional fields
    private HashMap<String, String> properties;
    private String company;

    public ImmutableClassBuilder(int i, String nm){
        this.id=i;
        this.name=nm;
    }

    public ImmutableClassBuilder setProperties(HashMap<String,String> hm){
        this.properties = (HashMap<String, String>) hm.clone();
        return this;
    }

    public ImmutableClassBuilder setCompany(String comp){
        this.company = comp;
        return this;
    }

    public ImmutableClass build(){
        return new ImmutableClass(this);
    }
}
/*--------*/


}
