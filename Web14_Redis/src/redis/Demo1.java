package redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.util.JedisUtil;

/*
 * 	ʹ��Java�������redis���ݿ�
 * 
 */
public class Demo1 {

	@Test
	public void test() {

		// 1��������Ӷ���
		Jedis jedis = new Jedis("192.168.154.128", 6379);

		// 2���������ݿ⡪����������
		jedis.set("username", "zhangsan");

		// 3���������
		String name = jedis.get("username");
		System.out.println(name);

	}

	// ͨ��Jedis���ӳػ��jedis���Ӷ���
	@Test
	public void test2() {
		// 0.�������ӳص����ö���
		JedisPoolConfig con = new JedisPoolConfig();
		con.setMaxIdle(30); // ������ø���
		con.setMinIdle(10); // ��С���ø���
		con.setMaxTotal(30); // ���������

		// 1.����jedis���ӳ�
		JedisPool pool = new JedisPool(con, "192.168.154.128", 6379);

		// 2.�����ӳ��л��jedis���Ӷ���
		Jedis jedis = pool.getResource();

		// 3.�������ݿ�
		jedis.set("xxx", "yyy"); // redis��ֻ�ܴ��ַ���,������json���洫�����
		System.out.println(jedis.get("xxx"));

		// 4.�ر�jedis��Դ
		jedis.close();
		pool.close();
	}
	
	//ʹ��JedisUtil���߻��Jedis����
	@Test
	public void test3() {
		Jedis jedis = JedisUtil.getJedis();
		System.out.println(jedis.get("xxx"));;
		jedis.close();
	}
}
