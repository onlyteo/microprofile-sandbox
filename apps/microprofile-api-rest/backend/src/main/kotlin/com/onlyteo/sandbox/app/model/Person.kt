package com.onlyteo.sandbox.app.model

import jakarta.json.bind.annotation.JsonbNillable

data class Person(
    @JsonbNillable(value = false) var name: String? = null
)
