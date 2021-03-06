package ru.aqrc.project.api.web.controller.extensions

import ru.aqrc.project.api.model.Account
import ru.aqrc.project.api.model.User
import ru.aqrc.project.api.web.dto.AccountDTO
import ru.aqrc.project.api.web.dto.UserDTO


fun UserDTO.asModel(): User {
    return User(
        id = this.id,
        name = this.name
    )
}

fun User.asDTO(): UserDTO {
    return UserDTO(
        id = this.id,
        name = this.name
    )
}

fun Account.asDTO(): AccountDTO {
    return AccountDTO(
        id = this.id,
        userId = this.userId,
        amount = this.amount
    )
}