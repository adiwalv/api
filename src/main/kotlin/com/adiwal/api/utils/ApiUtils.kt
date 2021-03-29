package com.adiwal.api.utils

import org.springframework.security.core.context.SecurityContextHolder
import java.util.*

class ApiUtils {

    companion object {
        @JvmStatic
        fun getCurrentUserName(): String? {
            val authentication = SecurityContextHolder.getContext().authentication
            return if (Objects.nonNull(authentication)) {
                authentication.name
            } else null
        }
    }
}