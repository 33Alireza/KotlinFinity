package beyond.sessionSeventeen

class MemberClass {
    private val membersList = mutableListOf<Member>()

    fun showMembers() {
        try {
            if (membersList.isEmpty()) println("No Members")
            else for (member in membersList) {
                println("${member.id} = ${member.fullName} -> ${member.email} -> ${member.type}")
            }
        } catch (_: Exception) {
            println("Unknown Error")
        }
    }

    fun addMember(id: String, fullName: String, email: String, type: MemberType) {
        try {
            membersList.add(Member(id, fullName, email, type))
            println("Member Added Successfully")
        } catch (_: Exception) {
            println("Unknown Error")
        }
    }

    fun removeMember(id: String) {
        try {
            membersList.removeIf { it.id == id }
            println("Member Removed Successfully")
        } catch (_: Exception) {
            println("Unknown Error")
        }
    }
}