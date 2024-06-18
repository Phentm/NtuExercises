package JavaBasics.section13;

public class Towers {
    private final int[][] rods;
    private final int[] numDisks;
    private final int disks;

    public Towers(int n) {
        this.rods = new int[3][n];
        this.numDisks = new int[3];
        this.numDisks[0] = n;
        this.disks = n;

        for (int i = 0; i < this.disks; i++) {
            this.rods[0][i] = i + 1;
        }
    }

    public void printTower() {
        for (int i = 0; i < this.disks; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(this.rods[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public void moveDisk(int src, int dest) {
        if (src == dest)
            return;
        if (src > 2 || src < 0)
            return;
        if (dest > 2 || dest < 0)
            return;
        if (this.numDisks[src] == 0 || this.numDisks[dest] == this.disks)
            return;
        
        int topDisk = this.rods[src][this.disks - this.numDisks[src]];
        
        this.rods[src][this.disks - this.numDisks[src]] = 0;
        this.numDisks[src]--;
        
        this.rods[dest][this.disks - this.numDisks[dest] - 1] = topDisk;
        this.numDisks[dest]++;
        
        System.out.println("Moved disk "+topDisk+": "+src+" -> "+dest);
        this.printTower();
        
    }
    
    public boolean validate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < this.disks - 1; j++) {
                if (this.rods[i][j] > this.rods[i][j+1])
                    return false;
            }
        }
        return true;
    }
    
    public boolean isDefault() {
        return !(this.numDisks[0] != this.disks && !this.validate());
    }
    
    public void solve(int src, int dest, int aux) {
        this.solve(this.disks, src, dest, aux);
    }
    
    public void solve(int n, int src, int dest, int aux) { 
        
        if (!this.validate())
            return;
        
        if (n == 1) {
            this.moveDisk(src, dest);
            return;
        }
        
        this.solve(n-1, src, aux, dest);
        this.moveDisk(src, dest);
        this.solve(n-1, aux, dest, src);
        
    }
}
