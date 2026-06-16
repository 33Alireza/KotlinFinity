package beyond.sessionSeventeen

class MemberClass {
    private val _membersList = mutableListOf<Member>()
    val membersList = _membersList.toList()

    fun showMembers() {
        if (_membersList.isEmpty()) println("No Members")
        else for (member in _membersList) {
            println("${member.fullName} -> ${member.email} -> ${member.type}")
        }
    }

    fun addMember(fullName: String, email: String, type: MemberType) {
        _membersList.add(Member(fullName, email, type))
    }
}