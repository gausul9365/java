public class PackageDetails {
    public static void main(String[] args) {
        try {
            // Get the package details using a class from the 'mypackage' package
            Package p = mypackage.Calculator.class.getPackage();

            if (p != null) {
                System.out.println("Package Name: " + p.getName());
                System.out.println("Specification Title: " + p.getSpecificationTitle());
                System.out.println("Specification Vendor: " + p.getSpecificationVendor());
                System.out.println("Specification Version: " + p.getSpecificationVersion());
                System.out.println("Implementation Title: " + p.getImplementationTitle());
                System.out.println("Implementation Vendor: " + p.getImplementationVendor());
                System.out.println("Implementation Version: " + p.getImplementationVersion());
                System.out.println("Is Sealed: " + p.isSealed());
            } else {
                System.out.println("Package 'mypackage' is not found or does not have metadata.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
