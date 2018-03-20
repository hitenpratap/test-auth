import com.testapp.Role
import com.testapp.User
import com.testapp.UserRole

class BootStrap {

    def init = { servletContext ->

        def adminRole = new Role(authority: 'ROLE_ADMIN').save()

        def testUser = new User(username: 'user@email.com', password: 'password').save()

        UserRole.create testUser, adminRole

        UserRole.withSession {
            it.flush()
            it.clear()
        }

    }
    def destroy = {
    }
}
