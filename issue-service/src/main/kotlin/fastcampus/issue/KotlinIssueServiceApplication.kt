package fastcampus.issue

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class KotlinIssueServiceApplication

fun main(args: Array<String>) {
    runApplication<KotlinIssueServiceApplication>(*args)
}
