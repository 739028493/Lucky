package game;

import java.util.Scanner;

public class Lucky {
	static int flag=-1;
	public static void main(String[] args) {
		String userNames[]=new String[10];
		int passWords[]=new int[10];
		int myCards[]=new int[10];
		int index=0;
		Scanner input =new Scanner(System.in);
		do {
		System.out.println("******欢迎进入抽奖系统******");
		System.out.println("        1、注册                        ");
		System.out.println("        2、登录                        ");
		System.out.println("        3、抽奖                        ");
		System.out.println("        0、退出                        ");
		System.out.println("***************************");
		System.out.println("请选择菜单！");
		int key=input.nextInt(); 
		switch (key) {
		case 1:
			//注册
			int flag1=1;
			System.out.println("*****注册*****");
			for (int i = 0; i < passWords.length; i++) {
				while(flag1==1){//利用while来控制是否继续注册
					for (int j = i; j <i+1; j++) {
					System.out.println("请输入用户名！");
					userNames[i]=input.next();
						
					}
				System.out.println("请输入密码！只能是数字！");
				passWords[i]=input.nextInt();
				myCards[i]=(int)(Math.random()*10);
				System.out.println("注册成功！");
				System.out.println("用户名\t密码\t卡号");
				System.out.println(userNames[i]+"\t"+passWords[i]+"\t"+myCards[i]);
				System.out.println("继续注册另一个账号吗？");//改变flag1的值，控制注册次数
				System.out.println("1、Yes");
				System.out.println("0、No");
				flag1=input.nextInt();
				} 
			}
			System.out.println("返回主菜单？");
			System.out.println("1、是！");
			System.out.println("0、否！");
			flag=input.nextInt();
			break;
		case 2:
			//登录
			int flag2=0;
			String userName=null;
			int passWord=0;
			int p=0;
			do{
			System.out.println("*****登录*****");
			System.out.println("请输入你的用户名！");
			userName=input.next();
			System.out.println("请输入密码！");
			passWord=input.nextInt();
			//下面比较输入数据与注册数据
			for (int i = 0; i < myCards.length; i++) {
				if ((passWord==passWords[i])&& userName.equals(userNames[i])){
					System.out.println("登陆成功！");
					index=i;//传递登录账号的卡号给抽奖环节
					p=3;
					flag2=0;
				}else{
					flag2=1;
					p++;
					if (p<3) {//控制第三次时不再输出“重新输入”
						
						System.out.println("账号或密码有误！");
						System.out.println("请重新输入");
					}
					break;
				}
			}
		}
			while(flag2==1&&p>=0&&p<3);
			while (p>=3) {
				System.out.println("返回主菜单！");
				break;
			}
			System.out.println("继续吗？");
			System.out.println("1、Yes");
			System.out.println("0、No");
			flag=input.nextInt();
			
			break;
		case 3:
			//抽奖
			System.out.println("*****抽奖*****");
			int[] cards = new int[5];
			for (int i = 0; i < cards.length; i++) {
				cards[i]=(int)(Math.random()*10);
				//检查随机数有无重复
							for (int j = 0; j < i; j++) {
								if (cards[i]==cards[j]) {
									i--;									
								}
			}
		}
			//输出随机数
			for (int i = 0; i < cards.length; i++) {
				System.out.print(cards[i]+" ");
			}
			System.out.println(" ");
			//比较所登录账号与随机数有无相等
			for(int i=0;i<cards.length;i++){
			if(myCards[index]==cards[i]){
				System.out.println("恭喜你！你中奖了！");
				break;
			}else if(i==cards.length-1){//比较到了数组最后一个还未有相同
				System.out.println("很遗憾，你没有中奖！");
			}
		}
			System.out.println("继续吗？");
			System.out.println("1、Yes");
			System.out.println("0、No");
			flag=input.nextInt();	
			break;
		case 0:
			//退出
			System.out.println("退出吗？");
			System.out.println("0、Yes");
			System.out.println("1、No");
			flag=input.nextInt();
			break;
			
		default:
			System.out.println("请选择有效菜单！");
			System.out.println("继续吗？");
			System.out.println("1、Yes");
			System.out.println("0、No");
			flag=input.nextInt();	
			break;
			}
		}
		while (flag==1);
		if (flag!=1&&flag!=0) {
			System.out.println("输入有误！");
			
		}
		System.out.println("ByeBye!");
		input.close();
	}

}
