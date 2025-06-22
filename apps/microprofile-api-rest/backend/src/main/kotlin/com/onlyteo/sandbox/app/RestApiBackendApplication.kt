package com.onlyteo.sandbox.app

import jakarta.ws.rs.ApplicationPath
import jakarta.ws.rs.core.Application

@ApplicationPath("/")
class RestApiBackendApplication : Application()