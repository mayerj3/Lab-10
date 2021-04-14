//Lab 10, Elliott Hurst & John Mayer, 4/13/21

class Main {
  public static void main(String[] args) {
    Sugar tree=new Sugar ("Tree");
    tree.cutShapes(tree.getShape(),10);
    tree.bakeCookies(350,12);
    tree.decorate();
    Sugar aCookie = new Sugar();
    aCookie.decorate();
  }
}