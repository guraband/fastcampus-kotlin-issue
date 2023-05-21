package fastcampus.issue.web

import fastcampus.issue.config.AuthUser
import fastcampus.issue.domain.enums.IssueStatus
import fastcampus.issue.model.IssueRequest
import fastcampus.issue.service.IssueService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/issues")
class IssueController(
    private val issueService: IssueService,
) {
    @GetMapping
    fun getAll(
        authUser: AuthUser,
        @RequestParam(required = false, defaultValue = "TODO") status: IssueStatus,
    ) = issueService.getAll(status)

    @PostMapping
    fun create(
        authUser: AuthUser,
        @RequestBody request: IssueRequest,
    ) = issueService.create(authUser.userId, request)
}