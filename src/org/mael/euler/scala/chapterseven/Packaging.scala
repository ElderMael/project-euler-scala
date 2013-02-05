package com {

  object Utils {
    def isInCom() : Boolean = true
  }

}

package hortsman {
  object Utils{
	def isInHortsman() : Boolean = true
  }
}

package impatient {
  object Utils{
	def isInImpatient() : Boolean = true
  }
}

package com.horstmann.impatient {
	object Utils extends App {
	  
	  // cannot use other Utils objects D:
	  
	}
}