package com.wlt.mall.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.DefaultTypedTuple;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.TimeUnit;

@Repository
//@LibClientTimeStat(component = "redis")
public class RedisDao<T> {
    private final static Logger LOGGER = LoggerFactory.getLogger(RedisDao.class);

    @Autowired
    private RedisTemplate redisTemplate;


    public boolean expireAt(String key, Date date) {
        boolean result = false;
        try {
            result = redisTemplate.expireAt(key, date);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForList rightPush Error! %s", e.getMessage()), e);
        }
        return result;
    }


    public T getFromValue(String key) {
        T result = null;
        try {
            result = (T) redisTemplate.opsForValue().get(key);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForValue Error! %s", e.getMessage()), e);
        }
        return result;
    }


    public void putToValue(String key, T value, Long time, TimeUnit timeUnit) {
        try {
            redisTemplate.opsForValue().set(key, value, time, timeUnit);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForObject Error! %s", e.getMessage()), e);
        }

    }


    public void putToValue(String key, T value) {
        try {
            redisTemplate.opsForValue().set(key, value);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForObject Error! %s", e.getMessage()), e);
        }

    }

    public Long increment(String key, Long value, Long timeout, TimeUnit timeUnit) {
        Long result = null;
        try {
            result = redisTemplate.opsForValue().increment(key, value);
            redisTemplate.expire(key, timeout, timeUnit);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForValue increment Error! %s", e.getMessage()), e);
        }
        return result;
    }


    public Long increment(String key, Long value) {
        Long result = null;
        try {
            result = redisTemplate.opsForValue().increment(key, value);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForValue increment Error! %s", e.getMessage()), e);
        }
        return result;
    }


    public Double incrementDouble(String key, double value) {
        Double result = null;
        try {
            result = redisTemplate.opsForValue().increment(key, value);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForValue increment Error! %s", e.getMessage()), e);
        }
        return result;
    }


    public long putToList(String key, Object value) {
        long result = 0;
        try {
            result = redisTemplate.opsForList().rightPush(key, value);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForList rightPush Error! %s", e.getMessage()), e);
        }
        return result;
    }


    public boolean putToSortSet(String key, Object value, double score) {
        boolean result = false;
        try {
            result = redisTemplate.opsForZSet().add(key, value, score);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForList rightPush Error! %s", e.getMessage()), e);
        }
        return result;
    }


    public void putToHash(String key, String hashKey, Object value) {
        boolean result = false;
        try {
            redisTemplate.opsForHash().put(key, hashKey, value);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForHash put Error! %s", e.getMessage()), e);
        }
    }


    public List multiGetHash(String key, Set hashKey) {
        List result = null;
        try {
            result = redisTemplate.opsForHash().multiGet(key, hashKey);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForList rightPush Error! %s", e.getMessage()), e);
        }
        return result;
    }


    public Set getFromSortSet(String key, long length) {
        Set result = null;
        try {
            result = redisTemplate.opsForZSet().range(key, 0, length - 1);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForList rightPush Error! %s", e.getMessage()), e);
        }
        return result;
    }


    public long putToSortSet(String key, Set<DefaultTypedTuple> defaultTypedTuples) {
        long result = 0;
        try {
            result = redisTemplate.opsForZSet().add(key, defaultTypedTuples);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForList rightPush Error! %s", e.getMessage()), e);
        }
        return result;
    }


    public long getZsetRank(String key, Object member) {
        long result = 0;
        try {
            result = redisTemplate.opsForZSet().rank(key, member);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForZSet rank Error! %s", e.getMessage()), e);
        }
        return result;
    }


    public List<Object> leftGetAllList(String key) {
        List<Object> result = null;
        try {
            result = redisTemplate.opsForList().range(key, 0L, -1L);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForList rightPush Error! %s", e.getMessage()), e);
        }
        return result;
    }


    public Long incrementHash(String key, String hashKey, Long value) {
        Long result = null;
        try {
            result = redisTemplate.opsForHash().increment(key, hashKey, value);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForHash increment Error! %s", e.getMessage()), e);
        }
        return result;
    }


    public void removeCache(String key) {
        redisTemplate.delete(key);
    }

    public Integer deleteKeys(String keyPrefix) {
        Set<String> set = redisTemplate.keys("*" + keyPrefix + "*");
        redisTemplate.delete(set);
        return set.size();
    }


    public void putBoundHashWithExpire(String key, Map<String, String> dataMap, long time, TimeUnit timeUnit) {
        try {
            BoundHashOperations<String, String, String> boundHashOperations = redisTemplate.boundHashOps(key);

            boundHashOperations.putAll(dataMap);
            boundHashOperations.expire(time, timeUnit);
        } catch (Exception e) {
            LOGGER.error(String.format("Redis Cache putBoundHashWithExpire Error! %s", e.getMessage()), e);
        }
    }

    public Map<String, String> getBoundHashEntries(String key) {
        try {
            BoundHashOperations<String, String, String> boundHashOperations = redisTemplate.boundHashOps(key);
            return boundHashOperations.entries();
        } catch (Exception e) {
            LOGGER.error(String.format("Redis Cache getBoundHashEntries Error! %s", e.getMessage()), e);
            return new HashMap<>();
        }
    }


    public T getFromHash(String key, String hashKey) {
        try {
            return (T) redisTemplate.opsForHash().get(key, hashKey);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForList rightPush Error! %s", e.getMessage()), e);
        }
        return null;
    }


    public void putToHash(String key, String hashKey, T value, Long time, TimeUnit timeUnit) {
        try {
            redisTemplate.opsForHash().put(key, hashKey, value);
            redisTemplate.expire(key, time, timeUnit);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache opsForHash put Error! %s", e.getMessage()), e);
        }
    }

    public long getExpire(String key, TimeUnit timeUnit) {
        long remaining = 0L;
        try {
            remaining = redisTemplate.getExpire(key, timeUnit);
        } catch (Exception e) {
            LOGGER.error(String.format("Bili Redis Cache getExpire Error! %s", e.getMessage()), e);
        }
        return remaining;
    }

}
