package com.tekdays

class Sponsor {

    String name
    String website
    String description
    byte[] logo
    
    static hasMany = [sponsorship: Sponsorship]
    
    String toString() {
	name
    }

    static constraints = {
	name blank: false
	website blank: false, url: true
	description nullable: true, maxSize: 5000
	logo nullable: true, maxSize: 2000000
	sponsorship nullable: true
    }
    
    
}
