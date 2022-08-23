package n0yrtr.akka_persistence_study.ui

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping


@Controller
class MainController {
    @GetMapping("/")
    fun index(model: Model): String {
        model["title"] = "Index"
        return "index"
    }
}
