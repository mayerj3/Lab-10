class Cookie {
  private int number;
  private int bakeTemp;
  private int bakeTime;
  private boolean isBaked;

  Cookie() {
    number = 0;
    bakeTemp = 0;
    bakeTime = 0;
    isBaked = false;
  }

  Cookie(int n, int bTemp, int bTime) {
    number = n;
    bakeTemp = bTemp;
    bakeTime = bTime;
    isBaked = false;
  }

  boolean isReady()
  {
    return isBaked;
  }

  void setNumCookie (int n)
  {
    number = n;
  }

  void bakeCookies (int bTemp, int bTime)
  {
  System.out.println(number + "cookies were baked at " + bTemp + "degrees F for " + bTime + " minutes.");
  isBaked = true;
  }
}

