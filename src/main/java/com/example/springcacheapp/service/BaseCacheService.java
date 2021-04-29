package com.example.caching.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.support.NullValue;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Slf4j
public abstract class BaseCacheService<K, V> {

    @Autowired
    private CacheManager cacheManager;

    public abstract String getDefaultCacheName();

    public List<V> getAllValues() {
        ConcurrentHashMap<K, V> map = getNativeCache();
        return getValues(map.values());
    }

    public List<K> getAllKeys() {
        ConcurrentHashMap<K, V> map = getNativeCache();
        return getValues(map.keySet());
    }

    protected ConcurrentHashMap<K, V> getNativeCache() {
        Cache cache = cacheManager.getCache(getDefaultCacheName());
        if (!(cache.getNativeCache() instanceof ConcurrentHashMap)) {
            String msg = "Please check spring.cache.type = SIMPLE";
            log.error(msg);
        }
        ConcurrentHashMap<K, V> map = (ConcurrentHashMap<K, V>) cache.getNativeCache();
        return map;
    }

    private <V> List<V> getValues(Collection<V> data) {
        return data.stream().filter(o -> !(o instanceof NullValue)).collect(Collectors.toList());
    }

    public void evictAllCacheValues(String cacheName) {
        cacheManager.getCache(cacheName).clear();
    }

    public void evictAllCacheValues() {
        evictAllCacheValues(getDefaultCacheName());
    }

    public void evictSingleCacheValue(String cacheName, Object cacheKey) {
        cacheManager.getCache(cacheName).evict(cacheKey);
    }

    public void evictSingleCacheValue(Object cacheKey) {
        cacheManager.getCache(getDefaultCacheName()).evict(cacheKey);
    }
}
