package fastcampus.issue.web

import fastcampus.issue.config.AuthUser
import fastcampus.issue.domain.CommentRequest
import fastcampus.issue.domain.CommentResponse
import fastcampus.issue.service.CommentService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/issues/{issueId}/comment")
class CommentController(
    private val commentService: CommentService
) {
    @PostMapping
    fun create(
        authUser: AuthUser,
        @PathVariable issueId: Long,
        @RequestBody request: CommentRequest,
    ): CommentResponse {
        return commentService.create(issueId, authUser.userId, authUser.username, request)
    }
}