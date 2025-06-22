package com.onlyteo.sandbox.app.model

import jakarta.json.bind.annotation.JsonbNillable

data class Greeting(
    @JsonbNillable(value = false) var message: String? = null
)
