package smart.frame.model;

public class Customer {
    private long id;
    private String name;
    private String contact;
    private String telephone;
    private String email;
    private String remark;
    public long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getContact(){
        return this.contact;
    }
    public String getTelephone(){
        return this.telephone;
    }
    public String getEmail(){
        return this.email;
    }
    public String getRemark(){
        return this.remark;
    }
    public void setId(long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setContact(String contact){
        this.contact=contact;
    }
    public void setTelephone(String telephone){
        this.telephone=telephone;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setRemark(String remark){
        this.remark=remark;
    }
}
