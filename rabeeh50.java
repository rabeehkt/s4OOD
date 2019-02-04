class rabeeh50 {
    public static void create(int size){
        for (int i=1; i<=size; i++) {
            for (int j=0; j<(2*size-1-i); j++)
                System.out.print(" ");
            for (int j=0; j<(2*i-1); j++)
                System.out.print("1");
                System.out.println();
        }

        for (int i=1; i<=size-1; i++) {
                  for (int j=0; j<size-1-i; j++)
            System.out.print(" ");
            for (int j=0; j<size; j++)
                   System.out.print("1");
            for (int j=0; j<(2*i-1); j++)
                    System.out.print(" ");
            for (int j=0; j<size; j++)
                System.out.print("1");
            System.out.println();
        }

        for (int i=1; i<=size-2; i++) {
            for (int j=0; j<i; j++)
                System.out.print(" ");
            for (int j=0; j<size; j++)
                System.out.print("1");
            for (int j=0; j<((2*size-3)-2*i); j++)
                System.out.print(" ");
            for (int j=0; j<size; j++)
                System.out.print("1");
            System.out.println();
        }
        for (int i=1; i<=size; i++) {
            for (int j=0; j<size-2+i; j++)
                System.out.print(" ");
            for (int j=0; j<((2*size+1)-2*i); j++)
                System.out.print("1");
            System.out.println();
        }
    }
    public static void main(String[] args){
        create(11);
    }
}
