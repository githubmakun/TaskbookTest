/**  
* <p>Title: SY8_HashSearch_1.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) May 5, 2019</p>  
* @author 马坤  
* @date May 5, 2019  
* @version 1.0  
*/
package Search;

import java.util.Scanner;

//测试类
public class SY8_HashSearch_1 {
	static HashTable T = null;

	// 建立待查找的哈希表
	public static void createHashtable() throws Exception {
		T = new HashTable(20);
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入待查找的关键字的个数:");
		int n = sc.nextInt();
		System.out.print("请输入查找表中的关键字序列:");
		for (int i = 0; i < n; i++) { // 输入关键字序列,并插入哈希表中
			T.hashInsert(sc.nextInt());
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println("---创建哈希表---");
		createHashtable();
		System.out.println("创建的哈希表为:");
		T.Hashdisplay();
		System.out.print("请输入待查找的关键字:");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		RecordNode p = T.hashSearch(key);
		if ((p.getKey()).compareTo(key) == 0)
			System.out.println(" 查找成功!");
		else
			System.out.println(" 查找失败!");
	}
}
