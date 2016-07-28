package dm.model;

import onlineOrder.model.OnlineOrder;

public class Redtype {
	
	//OnlineOrder ppq=new OnlineOrder();
	
	
	public Redtype(){}
	/*public Redtype(OnlineOrder ppq){
		this.ppq=ppq;
	}*/
	
	


public OnlineOrder[] kspx(OnlineOrder  r[],int t,int w   )  {
int i,j;
OnlineOrder  x;
OnlineOrder  gh[]=new OnlineOrder[w+1];                 //Integer.parseInt(

if(t<w){
	i=t;j=w;x=r[i];
	while(i<j){
		while((Integer.parseInt(r[j].getRoomNO().substring(1, 5))>=Integer.parseInt(x.getRoomNO().substring(1, 5)))&&(j>i))
			j--;
		if(i<j){
			r[i]=r[j];i++;													
		}
		while((Integer.parseInt(r[j].getRoomNO().substring(1, 5))<=Integer.parseInt(x.getRoomNO().substring(1, 5)))&&(j>i))
			i++;
		if(i<j){
			r[j]=r[i];j--;													
		}
		
	}
r[i]=x;
kspx(r,t,j-1);
kspx(r,j+1,w);
		
	}
for(int kk=0;kk<=w;kk++){
	gh[kk]=r[kk];
}
return gh;
}
}

	
/*		int key;
		Object data;
		
		public Redtype(){}
		public Redtype(int key ,Object data){
			this.key=key;
			this.data=data;
		}
		
		
	
	
public int[] kspx(Redtype  r[],int t,int w   )  {
	int i,j;
	Redtype  x;
	int  gh[]=new int[w+1];
	
	if(t<w){
		i=t;j=w;x=r[i];
		while(i<j){
			while((r[j].key>=x.key)&&(j>i))
				j--;
			if(i<j){
				
				r[i]=r[j];j--;													
			}
			
	r[i]=x;
	kspx(r,t,j-1);
	kspx(r,j+1,w);
			
			
			
		}
	}
	for(int kk=0;kk<=w;kk++){
		gh[kk]=r[kk].key;
	}
	return gh;
}*/

