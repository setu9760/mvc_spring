package concretepage.component;

import org.springframework.stereotype.Component;

import concretepage.Person;

@Component
public class PersonService implements IPersonService {
	public Person getPersonDetail(Integer id) {
		Person p = new Person();
		p.setId(id);
		p.setLocation("Varanasi");
		p.setName("Ram");
		return p;
	}

	public void insertPerson(Person person) {
		Person p = new Person();

	}
}
