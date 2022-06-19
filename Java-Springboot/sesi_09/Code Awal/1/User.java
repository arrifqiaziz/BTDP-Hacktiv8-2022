package Test;
public class User {
    
    int id;
    private String name;
    private String gender;
    private String role;

    public User(){

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender= gender;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }

    @Override
    public String toString(){

        StringBuilder builder = new StringBUilder();
        builder.append("User{").append("id=").append(id)
                .append(", Name=").append(name)
                .append(", Gender=").append(gender)
                .append(", role").append("}");

        return builder.toString();
    }
}
