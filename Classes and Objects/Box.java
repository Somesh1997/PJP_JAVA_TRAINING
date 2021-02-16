class Box
{
	int width;
	int height;
	int depth;
	Box(int width,int height,int depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public int Volume()
	{
      return(width*height*depth);
	}
	public static void main(String[] args) {
	     int a=Integer.parseInt(args[0]);
         int b=Integer.parseInt(args[1]);
         int c=Integer.parseInt(args[2]);
		Box s=new Box(a,b,c);
		int p=s.Volume();
		System.out.println(p);

	}

}