package com.onlyteo.sandbox.model

import jakarta.ws.rs.core.Response

/**
 * This is an error response class that implements the format of the Problem Details specification of RFC7807.
 * @see <a href="https://datatracker.ietf.org/doc/html/rfc7807">IETF RFC7807</a>
 */
data class ProblemDetails(
    val type: String,
    val status: Int,
    val title: String,
    val detail: String,
    val instance: String
) {
    constructor(httpStatus: Response.Status, detail: String, instance: String) : this(
        type = "about:blank",
        status = httpStatus.statusCode,
        title = httpStatus.reasonPhrase,
        detail = detail,
        instance = instance
    )
}
