import java.util.Scanner;

/**
 * @author 马坤
 * @date May 11, 2019
 * @version 1.0
 */

public class SY1_SqList {
	public static void main(String[] args) throws Exception {
		SqList L = new SqList(20); // 构造一个存储容量为0的空顺序表
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入顺序表的长度:");
		int n = sc.nextInt();
		System.out.println("请输入顺序表中的各个数据元素:");
		for (int i = 0; i < n; i++)
			L.insert(i, sc.nextInt());
		System.out.println("请输入待插入的位置i(0～curLen):");
		int i = sc.nextInt();
		System.out.println("请输入待插入的数据值x:");
		int x = sc.nextInt();
		L.insert(i, x);
		System.out.println("插入后的顺序表为:");
		L.display();
		System.out.println("请输入待删除元素的位置(0～curLen-1):");
		i = sc.nextInt();
		L.remove(i);
		System.out.println("删除后的顺序表为:");
		L.display();
		System.out.println("请输入待查找的数据元素:");
		x = sc.nextInt();
		int order = L.indexOf(x);
		if (order == -1)
			System.out.println("此顺序表中不包含值为" + x + "的数据元素!");
		else
			System.out.println("值为" + x + "元素在顺序表中的第" + order + "个位置上");
	}

}
