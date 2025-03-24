public class Multi_try_catch {
  public static void main(String[] args) {
    try {
      int arr[] = {1, 2, 3};
      System.out.println(arr[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index out of bounds");
    } catch (Exception e) {
      System.out.println("Something went wrong");
    }
  }
  
}
