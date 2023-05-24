import java.lang.RuntimeException

// Create a Person class with properties such as firstName, lastName, age, and address. Implement a PersonBuilder
// class that allows the step-by-step construction of a Person object. The PersonBuilder should have methods like
// setFirstName(), setLastName(), setAge(), setAddress(), etc. Finally, provide a method build() in the PersonBuilder
// class that returns the constructed Person object.

class Person internal constructor(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val address: String,
) {

    override fun toString() = "A person:\n first name: $firstName\n last name: $lastName\n age: $age\n address: $address"

    class Builder {
        private var _firstName: String = ""
        private var _lastName: String = ""
        private var _age: Int = 0
        private var _address: String = ""

        fun setFirstName(firstName: String) = apply {
            _firstName = firstName
        }

        fun setLastName(lastName: String) = apply {
            _lastName = lastName
        }

        fun setAge(age: Int) = apply {
            _age = age
        }

        fun setAddress(address: String) = apply {
            _address = address
        }

        fun build(): Person {
            if (_firstName.isEmpty() || _lastName.isEmpty() || _age == 0 || _address.isEmpty()) throw RuntimeException("Insufficient information to build a person")
            return Person(
                firstName = _firstName,
                lastName = _lastName,
                age = _age,
                address = _address
            )
        }
    }
}



