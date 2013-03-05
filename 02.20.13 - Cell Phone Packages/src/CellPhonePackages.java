import model.CellPhonePackage;
import model.Phone;
import model.Package;
import view.MainWindow;

import java.util.ArrayList;
import java.util.List;

public class CellPhonePackages
{
    public static void main(String[] args)
    {
        /**
         * Packages offered by Cell Solutions.
         */
        List<CellPhonePackage> packages = new ArrayList<CellPhonePackage>();
        /**
         * Additional packages offered by Cell Solutions.
         */
        List<Package> additionalPackages = new ArrayList<Package>();
        /**
         * Phones offered by Cell Solutions.
         */
        List<Phone> phones = new ArrayList<Phone>();

        packages.add(new CellPhonePackage("Starter", 300, 45.00));
        packages.add(new CellPhonePackage("Normal", 800, 65.00));
        packages.add(new CellPhonePackage("Pro", 1500, 99.00));

        additionalPackages.add(new Package("Voice mail", 5.00));
        additionalPackages.add(new Package("Text messaging", 10.00));

        phones.add(new Phone("Model 100", 29.95));
        phones.add(new Phone("Model 110", 49.95));
        phones.add(new Phone("Model 200", 99.95));

        new MainWindow(packages, additionalPackages, phones);
    }
}
