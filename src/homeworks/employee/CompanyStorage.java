package homeworks.employee;

public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size = 0;

    public boolean add(Company company) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyId().equalsIgnoreCase(company.getCompanyId())) {
                return false;
            }
        }

        if (size == companies.length) {
            Company[] temp = new Company[companies.length + 10];
            System.arraycopy(companies, 0, temp, 0, companies.length);
            companies = temp;
        }
        companies[size++] = company;
        return true;
    }

    public void printAll() {
        if (size == 0) {
            System.out.println("No companies found.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i].getCompanyId() + " - " + companies[i].getName() + " - " + companies[i].getCountry());
        }
    }

    public Company getById(String id) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyId().equalsIgnoreCase(id)) {
                return companies[i];
            }
        }
        return null;
    }
}