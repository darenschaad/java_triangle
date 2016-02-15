public class Triangle {
  private int mSideA;
  private int mSideB;
  private int mSideC;

  public Triangle(int sideA, int sideB, int sideC) {
    mSideA = sideA;
    mSideB = sideB;
    mSideC = sideC;
  }

  public int getSideA() {
    return mSideA;
  }

  public int getSideB() {
    return mSideB;
  }

  public int getSideC() {
    return mSideC;
  }

  public boolean isTriangle() {
    if (((mSideA + mSideB) <= mSideC) || ((mSideA + mSideC) <= mSideB) || ((mSideC + mSideB) <= mSideA)){
      return false;
    }
    else {
      return true;
    }

  }
  public String triangleType(){

    if (mSideA == mSideB && mSideB == mSideC) {
      return "equilateral";
    }
    else if ((mSideA == mSideB) || (mSideA == mSideC) || (mSideB == mSideC)) {
      return "isosceles";
    }
    else {
      return "scalene";
    }
  }
  public boolean isRightTriangle(){
    if (mSideA * mSideA + mSideB * mSideB  == mSideC * mSideC || mSideC * mSideC + mSideB * mSideB  == mSideA * mSideA || mSideC * mSideC + mSideA * mSideA  == mSideB * mSideB) {
      return true;
    }
    else {
      return false;
    }
  }
}
