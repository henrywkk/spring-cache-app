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
2021-04-27 14:41:25.775  INFO 28476 --- [           main] com.example.caching.AppRunner            : .... Fetching books
2021-04-27 14:41:26.786  INFO 28476 --- [           main] com.example.caching.AppRunner            : isbn-1234 -->Book{isbn='isbn-1234', title='Some Book'}
2021-04-27 14:41:27.786  INFO 28476 --- [           main] com.example.caching.AppRunner            : isbn-4567 -->Book{isbn='isbn-4567', title='Some Book'}
2021-04-27 14:41:27.786  INFO 28476 --- [           main] com.example.caching.AppRunner            : isbn-1234 -->Book{isbn='isbn-1234', title='Some Book'}
2021-04-27 14:41:27.786  INFO 28476 --- [           main] com.example.caching.AppRunner            : isbn-4567 -->Book{isbn='isbn-4567', title='Some Book'}
2021-04-27 14:41:27.786  INFO 28476 --- [           main] com.example.caching.AppRunner            : isbn-1234 -->Book{isbn='isbn-1234', title='Some Book'}
2021-04-27 14:41:27.787  INFO 28476 --- [           main] com.example.caching.AppRunner            : isbn-1234 -->Book{isbn='isbn-1234', title='Some Book'}
2021-04-27 14:41:27.787  INFO 28476 --- [           main] com.example.caching.AppRunner            : --------All books in repository: --------
2021-04-27 14:41:27.787  INFO 28476 --- [           main] com.example.caching.AppRunner            : Book{isbn='isbn-1234', title='Some Book'}
2021-04-27 14:41:27.787  INFO 28476 --- [           main] com.example.caching.AppRunner            : Book{isbn='isbn-4567', title='Some Book'}
2021-04-27 14:41:27.787  INFO 28476 --- [           main] com.example.caching.AppRunner            : --------All keys in repository: --------
2021-04-27 14:41:27.788  INFO 28476 --- [           main] com.example.caching.AppRunner            : isbn-1234
2021-04-27 14:41:27.788  INFO 28476 --- [           main] com.example.caching.AppRunner            : isbn-4567
```
