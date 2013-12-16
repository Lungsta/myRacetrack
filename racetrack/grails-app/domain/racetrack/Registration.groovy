package racetrack

class Registration {
	
	String name
	Date dateOfBirth
	String gender
	String address
	String city
	String state
	String zipcode
	String email
	Date dateCreated //Note: this is a special name
	Date lastUpdated
	static mapping = {
	autoTimestamp false
	sort "startDate"
	}

    static constraints = {
    }
}
