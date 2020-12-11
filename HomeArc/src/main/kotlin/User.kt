/**
 *@author: Hyman
 *time: 2020/12/9 下午7:06
 *des:
 */
class User(firstName: String, lastName: String) {
    private var firstName: String
    private var lastName: String
    fun getFirstName(): String {
        return firstName
    }

    fun setFirstName(firstName: String) {
        this.firstName = firstName
    }

    fun getLastName(): String {
        return lastName
    }

    fun setLastName(lastName: String) {
        this.lastName = lastName
    }

    init {
        this.firstName = firstName
        this.lastName = lastName
    }
}