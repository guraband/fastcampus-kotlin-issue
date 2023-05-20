package fastcampus.issue.domain.enums

enum class IssueStatus {
    TODO, IN_PROGRESS, RESOLVED;

    companion object {
        operator fun invoke(status: String) = IssuePriority.valueOf(status.uppercase())
    }
}
