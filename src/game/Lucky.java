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
		System.out.println("******��ӭ����齱ϵͳ******");
		System.out.println("        1��ע��                        ");
		System.out.println("        2����¼                        ");
		System.out.println("        3���齱                        ");
		System.out.println("        0���˳�                        ");
		System.out.println("***************************");
		System.out.println("��ѡ��˵���");
		int key=input.nextInt(); 
		switch (key) {
		case 1:
			//ע��
			int flag1=1;
			System.out.println("*****ע��*****");
			for (int i = 0; i < passWords.length; i++) {
				while(flag1==1){//����while�������Ƿ����ע��
					for (int j = i; j <i+1; j++) {
					System.out.println("�������û�����");
					userNames[i]=input.next();
						
					}
				System.out.println("���������룡ֻ�������֣�");
				passWords[i]=input.nextInt();
				myCards[i]=(int)(Math.random()*10);
				System.out.println("ע��ɹ���");
				System.out.println("�û���\t����\t����");
				System.out.println(userNames[i]+"\t"+passWords[i]+"\t"+myCards[i]);
				System.out.println("����ע����һ���˺���");//�ı�flag1��ֵ������ע�����
				System.out.println("1��Yes");
				System.out.println("0��No");
				flag1=input.nextInt();
				} 
			}
			System.out.println("�������˵���");
			System.out.println("1���ǣ�");
			System.out.println("0����");
			flag=input.nextInt();
			break;
		case 2:
			//��¼
			int flag2=0;
			String userName=null;
			int passWord=0;
			int p=0;
			do{
			System.out.println("*****��¼*****");
			System.out.println("����������û�����");
			userName=input.next();
			System.out.println("���������룡");
			passWord=input.nextInt();
			//����Ƚ�����������ע������
			for (int i = 0; i < myCards.length; i++) {
				if ((passWord==passWords[i])&& userName.equals(userNames[i])){
					System.out.println("��½�ɹ���");
					index=i;//���ݵ�¼�˺ŵĿ��Ÿ��齱����
					p=3;
					flag2=0;
				}else{
					flag2=1;
					p++;
					if (p<3) {//���Ƶ�����ʱ����������������롱
						
						System.out.println("�˺Ż���������");
						System.out.println("����������");
					}
					break;
				}
			}
		}
			while(flag2==1&&p>=0&&p<3);
			while (p>=3) {
				System.out.println("�������˵���");
				break;
			}
			System.out.println("������");
			System.out.println("1��Yes");
			System.out.println("0��No");
			flag=input.nextInt();
			
			break;
		case 3:
			//�齱
			System.out.println("*****�齱*****");
			int[] cards = new int[5];
			for (int i = 0; i < cards.length; i++) {
				cards[i]=(int)(Math.random()*10);
				//�������������ظ�
							for (int j = 0; j < i; j++) {
								if (cards[i]==cards[j]) {
									i--;									
								}
			}
		}
			//��������
			for (int i = 0; i < cards.length; i++) {
				System.out.print(cards[i]+" ");
			}
			System.out.println(" ");
			//�Ƚ�����¼�˺���������������
			for(int i=0;i<cards.length;i++){
			if(myCards[index]==cards[i]){
				System.out.println("��ϲ�㣡���н��ˣ�");
				break;
			}else if(i==cards.length-1){//�Ƚϵ����������һ����δ����ͬ
				System.out.println("���ź�����û���н���");
			}
		}
			System.out.println("������");
			System.out.println("1��Yes");
			System.out.println("0��No");
			flag=input.nextInt();	
			break;
		case 0:
			//�˳�
			System.out.println("�˳���");
			System.out.println("0��Yes");
			System.out.println("1��No");
			flag=input.nextInt();
			break;
			
		default:
			System.out.println("��ѡ����Ч�˵���");
			System.out.println("������");
			System.out.println("1��Yes");
			System.out.println("0��No");
			flag=input.nextInt();	
			break;
			}
		}
		while (flag==1);
		if (flag!=1&&flag!=0) {
			System.out.println("��������");
			
		}
		System.out.println("ByeBye!");
		input.close();
	}

}
