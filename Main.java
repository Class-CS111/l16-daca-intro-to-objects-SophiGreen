/********************************************
*	DEVELOPER:	<name>
* COLLABORATORS: <names>
*	LAST MODIFIED:	<date>
********************************************/
/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/

class Main 
{
  public static void main(String[] args) 
	{
    //TODO PART 3: test your setter/getter here!
  //String surname;
	//String givenName;
	//String uscisNumber;
	//String countryOfOrigin; 
	//int birthday, validFromDate, expirationDate;
	//char sex;

    
  DACArecipient test1 = new DACArecipient();
  DACArecipient test2 = new DACArecipient();
   

    test1.setSurname("Platas");
    test1.setGivenName("Sophia");
    test1.setUscisNumber("12-3-456");
    test1.setCountryOfOrigin("USA");
    test1.setBirthday(2453381);
    test1.setValidFromDate(2460808);
    test1.setExpirationDate(2462634);
    test1.setSex('F');
    
   
    

    //test.surname = "Platas";
    System.out.println("----------------------------------");
    System.out.println("Person 1");
    System.out.println("----------------------------------");
    System.out.println("Surname: " + test1.getSurname());
    System.out.println("Give name: " + test1.getGivenName());
    System.out.println("USCIS Number: " + test1.getUscisNumber());
    System.out.println("Country of Origin: " + test1.getCountryOfOrigin());
    System.out.println("Birthday (JDN): " + test1.getBirthday());
    System.out.println("Valid From Date (JDN): " + test1.getValidFromDate());
    System.out.println("Expiration Date (JDN): " + test1.getExpirationDate());
    System.out.println("Sex: " + test1.getSex());

  test2.setAll("Mendez", "Javier", "56-3-445", "Venezuela", 2451564, 3956753, 3956840, 'M');
  
    System.out.println("----------------------------------");
    System.out.println("Person 2");
    System.out.println("----------------------------------");
    System.out.println("Surname: " + test2.getSurname());
    System.out.println("Give name: " + test2.getGivenName());
    System.out.println("USCIS Number: " + test2.getUscisNumber());
    System.out.println("Country of Origin: " + test2.getCountryOfOrigin());
    System.out.println("Birthday (JDN): " + test2.getBirthday());
    System.out.println("Valid From Date (JDN): " + test2.getValidFromDate());
    System.out.println("Expiration Date (JDN): " + test2.getExpirationDate());
    System.out.println("Sex: " + test2.getSex());

    //test.surname);

  }
}