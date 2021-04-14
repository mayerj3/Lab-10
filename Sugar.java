class Sugar extends Cookie {
  String shape;
  boolean decorated;
  
  Sugar() 
  {
    shape = "";
    decorated = false;
    }
    Sugar(String a) {
      shape = a;
      decorated = false;
    }
    String getShape() {
      return shape;
    }
    void changeShape (String a) {
      shape = a;
    }
    void cutShape(String a, int b) {
      System.out.println(b + "cookies were cut into " + a);
      super.setNumCookie(b);
    }

    void decorated() {
      if(super.isReady()==true){
        decorated = true;
        System.out.println("The cookies were cut into " + a);
        super.setNumCookie(b);
      }
    }
    void decorate() {
      if(super.isReady()== true)
      {
        decorated = true;
        System.out.println("The cookies were decorated!");
      }
    
      else{
      System.out.println("Make sure you bake the cookies first!");
    }
  }
}

