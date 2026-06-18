package beyond.sessionSeventeen

class MemberClass {
    private val _membersList = mutableListOf<Member>()
    val membersList = _membersList.toList()

    fun showMembers() {
        try {
            if (_membersList.isEmpty()) println("No Members")
            else for (member in _membersList) {
                println("${member.id} = ${member.fullName} -> ${member.email} -> ${member.type}")
            }
        } catch (_: Exception) {
            println("Unknown Error")
        }
    }

    fun addMember(id: String, fullName: String, email: String, type: MemberType) {
        try {
            _membersList.add(Member(id, fullName, email, type))
            println("Member Added Successfully")
        } catch (_: Exception) {
            println("Unknown Error")
        }
    }

    fun removeMember(id: String) {
        try {
            _membersList.removeIf { it.id == id }
            println("Member Removed Successfully")
        } catch (_: Exception) {
            println("Unknown Error")
        }
    }
}