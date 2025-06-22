package com.onlyteo.sandbox.app.exception

import com.onlyteo.sandbox.app.model.ProblemDetails

class ProblemDetailException(problemDetails: ProblemDetails) : RuntimeException(problemDetails.detail)