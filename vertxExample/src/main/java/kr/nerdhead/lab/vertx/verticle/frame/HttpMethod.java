package kr.nerdhead.lab.vertx.verticle.frame;

public enum HttpMethod {
    GET(io.vertx.core.http.HttpMethod.GET),
    POST(io.vertx.core.http.HttpMethod.POST),
    PUT(io.vertx.core.http.HttpMethod.PUT),
    PATCH(io.vertx.core.http.HttpMethod.PATCH),
    DELETE(io.vertx.core.http.HttpMethod.DELETE);

    private io.vertx.core.http.HttpMethod method;
    HttpMethod(io.vertx.core.http.HttpMethod value) { this.method = value; }

    public io.vertx.core.http.HttpMethod getMethod() {
        return method;
    }
}
