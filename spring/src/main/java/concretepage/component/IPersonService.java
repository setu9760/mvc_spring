package concretepage.component;

import concretepage.Person;

public interface IPersonService {

	public Person getPersonDetail(Integer id);

	public void insertPerson(Person person);
}
