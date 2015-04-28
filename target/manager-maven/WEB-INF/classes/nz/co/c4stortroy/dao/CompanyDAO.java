package nz.co.c4stortroy.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nz.co.c4stortroy.manager.Company;

public class CompanyDAO {

	private final static Map<Long, Company> COMPANIES = new HashMap<>();
	static {
	    generateIDAndAdd(new Company("Doceria Bela Vista"));
	    generateIDAndAdd(new Company("Ferragens Docel"));
	    generateIDAndAdd(new Company("Alura"));
	    generateIDAndAdd(new Company("Google"));
	    generateIDAndAdd(new Company("Caelum"));
	    generateIDAndAdd(new Company("Casa do Código"));
	}

	public Collection<Company> searchBySimilarity(String name) {
		if (name == null)
			return COMPANIES.values();
		
		List<Company> similar = new ArrayList<>();
		for (Company company : COMPANIES.values()) {
			if (company.getName().toLowerCase().contains(name.toLowerCase()))
				similar.add(company);
		}
		return similar;
	}

	public void addCompany(Company empresa) {
	    generateIDAndAdd(empresa);
	}

	private static void generateIDAndAdd(Company empresa) {
		long id = COMPANIES.size()+1l;
		empresa.setId(id);
		COMPANIES.put(id, empresa);
	}
}
