# http-status-code
A simple API that returns a random status code for tests.

```bash
docker run -it -p 8080:8080 http-status-code:latest
```

# Example

```bash
curl localhost:8080/random -i
```

```
HTTP/1.1 500
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 11 Nov 2019 23:24:33 GMT
Connection: close

{"code":500,"message":"Internal Server Error"}
```

# Random Request

```bash
while true; do curl localhost:8080/random; echo; done;
```

```
{"code":500,"message":"Internal Server Error"}
{"code":200,"message":"Success"}
{"code":200,"message":"Success"}
{"code":200,"message":"Success"}
{"code":200,"message":"Success"}
{"code":200,"message":"Success"}
{"code":200,"message":"Success"}
{"code":500,"message":"Internal Server Error"}
{"code":500,"message":"Internal Server Error"}
{"code":500,"message":"Internal Server Error"}
{"code":200,"message":"Success"}
{"code":500,"message":"Internal Server Error"}
{"code":200,"message":"Success"}
{"code":500,"message":"Internal Server Error"}
{"code":500,"message":"Internal Server Error"}
{"code":500,"message":"Internal Server Error"}
{"code":500,"message":"Internal Server Error"}
```
