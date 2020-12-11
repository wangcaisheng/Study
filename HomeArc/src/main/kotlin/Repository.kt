import com.hyman.home.bean.User
import java.util.*
import kotlin.collections.ArrayList

/**
 *@author: Hyman
 *time: 2020/12/9 下午7:11
 *des:  使用object表示单利
 */
object Repository {
    private var users=mutableListOf<User>()
    fun getUsers(): List<User?>? {
        return users
    }

    fun getFormattedUserNames(): List<String> {
        val userNames: MutableList<String> = ArrayList(users.size)
        //可以对user进行解构（如果user是data类型）解构写法：for((firstName,lastName) in users())
        users.map {user ->
            if(user.lastName!=null){
                if(user.firstName!=null){
                    "${user.firstName} ${user.lastName}"
                }else{
                    user.lastName?:"Unknown"
                }
            }else{
                user.firstName?:"Unknown"
            }
        }
//        for ((firstName,lastName) in users) {
//            var name: String
//            name = if(lastName!=null){
//                if(firstName!=null){
//                    "$firstName $lastName"
//                }else{
//                    lastName?:"Unknown"
//                }
//            }else {
//                firstName?:"Unknown"
//            }
//            userNames.add(name)
//        }
        return userNames
    }


    // keeping the constructor private to enforce the usage of getInstance
    init {
        val user1 = User("Jane", "")
        val user2 = User("John", null)
        val user3 = User("Anne", "Doe")
        users?.add(user1)
        users?.add(user2)
        users?.add(user3)
    }
}
