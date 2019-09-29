class classeWilder {
    private String firstname;
    private boolean aware;
    public classeWilder(String firstname){
        this.firstname=firstname;
        this.aware=false;
        
    }
    public classeWilder(String firstname,boolean aware){
        this.firstname=firstname;
        this.aware=aware;
        
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public void setAware(boolean aware){
        this.aware=aware;
    }
    public String getFirstname(){
        return this.firstname;
    }
    public boolean getAware(){
        return this.aware;
    }
    public String whoAmI(){
        if(this.aware==true){
       String me="Je m'appelle " +this.getFirstname()+ " et je suis aware";
        return me;
        }
        else
        {
       String me="Je m'appelle " +this.getFirstname()+ " et je ne suis pas aware";
       return me;
        }
        
    }

}

	


























