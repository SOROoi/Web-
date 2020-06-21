package redis.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtil {

	private static JedisPool pool = null;

	static {

		// ���������ļ�
		InputStream in = JedisUtil.class.getClassLoader().getResourceAsStream("redis/util/redis.properties");	//�����src��
		Properties pro = new Properties();
		try {
			pro.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ��ó��Ӷ���
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxIdle(Integer.parseInt(pro.get("redis.maxIdle").toString()));// ������ø���
		poolConfig.setMinIdle(Integer.parseInt(pro.get("redis.minIdle").toString()));// ��С���ø���
		poolConfig.setMaxTotal(Integer.parseInt(pro.get("redis.maxTotal").toString()));// ���������
		pool = new JedisPool(poolConfig, pro.getProperty("redis.url"),
				Integer.parseInt(pro.get("redis.port").toString()));
	}

	// ���jedis��Դ�ķ���
	public static Jedis getJedis() {
		return pool.getResource();
	}

}
