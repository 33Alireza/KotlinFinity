package beyond.sessionSeventeen

class MemberClass {
    private val _membersList = mutableListOf<Member>()
    val membersList = _membersList.toList()

    fun showMembers() {
        try {
            if (_membersList.isEmpty()) println("No Members")
            else for (member in _membersList) {
                println("${member.fullName} -> ${member.email} -> ${member.type}")
            }
        } catch (_: Exception) {
            println("Unknown Error")
        }
    }

    fun addMember(fullName: String, email: String, type: MemberType) {
        try {
            _membersList.add(Member(fullName, email, type))
            println("Member Added Successfully")
        } catch (_: Exception) {
            println("Unknown Error")
        }
    }
}