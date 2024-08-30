# Ktor CRUD Exposed

This example shows a React frontend and Microprofile REST API.

## Architecture

The example consists of a `Frontend` and a `Backend` application.

```mermaid
graph TD
    subgraph Frontend
        A[REST Client]:::react
    end
    subgraph Frontend API
        B[REST API]:::microprofile
    end
    subgraph Backend
        C[REST API]:::microprofile
    end

    A -- REST --> B
    B-- REST --> C

    classDef react fill: #58c4dc, stroke: #000000, color: #000000
    classDef microprofile fill: #fdb71c, stroke: #000000, color: #000000
```

The `Frontend` application communicates with the `Backend` application using REST.
