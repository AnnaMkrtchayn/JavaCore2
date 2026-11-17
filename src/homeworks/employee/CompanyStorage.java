package homeworks.employee;

public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size = 0;

    public void add(Company company) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyId().equals(company.getCompanyId())) {
                return;
            }
        }

        if (size == companies.length) {
            Company[] temp = new Company[companies.length + 10];
            System.arraycopy(companies, 0, temp, 0, companies.length);
            companies = temp;
        }
        companies[size++] = company;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i].getCompanyId() + " - " + companies[i].getName() + " - " + companies[i].getCountry());
        }
    }

    public Company getById(String id) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyId().equals(id)) {
                return companies[i];
            }
        }
        return null;
    }
}