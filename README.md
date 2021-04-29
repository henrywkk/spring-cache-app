# spring-cache-app
Simple application extended with spring cache

##What You Will build
An application that enables caching on a simple book repository, based on spring's caching sample code.

**Reference**
- https://spring.io/guides/gs/caching/
- https://github.com/spring-guides/gs-caching

##Difference to the original sample
Added a BaseCacheService, which supports get all keys/values from the cache. 
Example:
```
2021-04-29 22:04:59.858  INFO 7932 --- [           main] c.e.s.SpringCacheApplication             : Started SpringCacheApplication in 0.756 seconds (JVM running for 1.46)
2021-04-29 22:04:59.859  INFO 7932 --- [           main] com.example.springcacheapp.AppRunner     : .... Fetching books
2021-04-29 22:05:00.882  INFO 7932 --- [           main] com.example.springcacheapp.AppRunner     : isbn-1234 -->Book{isbn='isbn-1234', title='Some Book'}
2021-04-29 22:05:01.894  INFO 7932 --- [           main] com.example.springcacheapp.AppRunner     : isbn-4567 -->Book{isbn='isbn-4567', title='Some Book'}
2021-04-29 22:05:01.894  INFO 7932 --- [           main] com.example.springcacheapp.AppRunner     : isbn-1234 -->Book{isbn='isbn-1234', title='Some Book'}
2021-04-29 22:05:01.894  INFO 7932 --- [           main] com.example.springcacheapp.AppRunner     : isbn-4567 -->Book{isbn='isbn-4567', title='Some Book'}
2021-04-29 22:05:01.894  INFO 7932 --- [           main] com.example.springcacheapp.AppRunner     : isbn-1234 -->Book{isbn='isbn-1234', title='Some Book'}
2021-04-29 22:05:01.895  INFO 7932 --- [           main] com.example.springcacheapp.AppRunner     : isbn-1234 -->Book{isbn='isbn-1234', title='Some Book'}
2021-04-29 22:05:01.895  INFO 7932 --- [           main] com.example.springcacheapp.AppRunner     : --------All books in repository: --------
2021-04-29 22:05:01.895  INFO 7932 --- [           main] com.example.springcacheapp.AppRunner     : Book{isbn='isbn-1234', title='Some Book'}
2021-04-29 22:05:01.895  INFO 7932 --- [           main] com.example.springcacheapp.AppRunner     : Book{isbn='isbn-4567', title='Some Book'}
2021-04-29 22:05:01.895  INFO 7932 --- [           main] com.example.springcacheapp.AppRunner     : --------All keys in repository: --------
2021-04-29 22:05:01.896  INFO 7932 --- [           main] com.example.springcacheapp.AppRunner     : isbn-1234
2021-04-29 22:05:01.896  INFO 7932 --- [           main] com.example.springcacheapp.AppRunner     : isbn-4567
```
