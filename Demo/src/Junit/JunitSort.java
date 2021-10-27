package Junit;

public class JunitSort {

}
//@Test public void testGetPeopleSortsByPeopleName() {
//    String COUNTRY = "Whatistan";
//
//    // set up test (the 3 lines below are actually in a @Before setup method)
//    PeopleStuff peopleStuff = new PeopleStuff();
//    IData mockData = createNiceMock(IData.class);
//    peopleStuff.data = mockData;
//
//    // set up data
//    List<PersonName> mockPeopleList = new ArrayList<PersonName>();
//    mockPeopleList.add(new Person(COUNTRY, "A"));
//    mockPeopleList.add(new Person(COUNTRY, "D"));
//    mockPeopleList.add(new Person(COUNTRY, "B"));
//    mockPeopleList.add(new Person(COUNTRY, "C"));
//
//    when(mockData.getPeopleForCountry(COUNTRY)).thenReturn(mockPeopleList);
//
//    // exercise
//    List<String> result = peopleStuff.getSortedPeopleForCountry(COUNTRY);
//
//    // assert
//    assertEquals("A", result.get(0).name);
//    assertEquals("B", result.get(1).name);
//    assertEquals("C", result.get(2).name);
//    assertEquals("D", result.get(3).name);
//}