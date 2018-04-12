class StringToArray{
    public static void main(String args[]){
	
	Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
        }

        
        System.out.println(ROW);
    }
}