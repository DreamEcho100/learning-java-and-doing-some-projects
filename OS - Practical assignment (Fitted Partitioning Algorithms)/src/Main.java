public class Main {
	// A method that returns a new block array with a new reference
    static int[] blockSizeValue() {
    	int blockSize[] = { 100, 500, 200, 300, 600 };
		return blockSize;
    }
	
	// A method to print block size we will use it before and after the change
	// to compare and see the difference
	static void printBlockSize(int blockSize[]) {
		int i;

        for (i = 0; i < blockSize.length; i++) {
			System.out.print((i + 1) + "\t" );
		}
        
        System.out.println();
        
        for (i = 0; i < blockSize.length; i++) {
			System.out.print(blockSize[i] + "\t" );
		}
        
        System.out.println();
	}
	// A method that will use printBlockSize method but will print a header first 
	static void printBlockSizeWithHeader(String header, int blockSize[]) {
        System.out.println(header);
        
        printBlockSize(blockSize);
	}
	
	// A method to print the table of the process size and their allocation
	static void printTable(int processSize[], int allocation[]) {
		int i;

        System.out.println("## Result:\nProcess Index\tProcess Size\tBlock Index");
        
        for (i = 0; i < processSize.length; i++) {
            System.out.print("   " + (i + 1) + "\t\t" + processSize[i] + "\t\t");
            
            if (allocation[i] != -1) {
            	System.out.print(allocation[i] + 1);
            } else {
            	System.out.print("Not Allocated");
            }
            
            System.out.println();
        }
	}
	
	// Allocate memory to blocks by using Best fit algorithm
    static void bestFit(int blockSize[], int processSize[]) {
        printBlockSizeWithHeader("## Current block size:", blockSize);

        // Stores block id of the block allocated to a
        // process
        int allocation[] = new int[processSize.length];
        int i, j, bestIdx;
       
        // Initially no block is assigned to any process
        for (i = 0; i < allocation.length; i++) {
        	allocation[i] = -1;
        }
       
        // pick each process and find suitable blocks
        // according to its size ad assign to it
        for (i = 0; i < processSize.length; i++) {
            // Find the best fit block for current process
            bestIdx = -1;
            
            for (j = 0; j < blockSize.length; j++) {
                if (blockSize[j] >= processSize[i]) {
                	// Assign bestIdx for the first loop
                    if (bestIdx == -1) {
                    	bestIdx = j;
                    } else if (blockSize[bestIdx] > blockSize[j]) {
                    	bestIdx = j;
                    }
                    // We will continue the loop (there is no break here) since the best-fit algorithm
                    // need to go throw the whole blockSize array to find the best fit
                }
            }
       
            // If we could find a block for current process
            if (bestIdx != -1) {
                // Allocate block j to p[i] process
                allocation[i] = bestIdx;
       
                // Reduce available memory in this block.
                blockSize[bestIdx] -= processSize[i];
            }
        }

        printTable(processSize, allocation);
        
        printBlockSizeWithHeader("## Remaining block size:", blockSize);
    }
	
	// Allocate memory to blocks by using First fit algorithm
    static void firstFit(int blockSize[], int processSize[]) {
        printBlockSizeWithHeader("## Current block size:", blockSize);

        // Stores block id of the
        // block allocated to a process
        int allocation[] = new int[processSize.length];
        int i, j;
     
        // Initially no block is assigned to any process
        for (i = 0; i < allocation.length; i++) {
        	allocation[i] = -1;
        }
     
        // pick each process and find suitable blocks
        // according to its size ad assign to it
        for (i = 0; i < processSize.length; i++) {
            for (j = 0; j < blockSize.length; j++) {
                if (blockSize[j] >= processSize[i]) {
                    // allocate block j to p[i] process
                    allocation[i] = j;
     
                    // Reduce available memory in this block.
                    blockSize[j] -= processSize[i];
     
                    // We break the loop since the first-fit algorithm decide the allocation of the process if the block fit it
                    // So there is no need to do another or continue this loop
                    break;
                }
            }
        }

        printTable(processSize, allocation);
        
        printBlockSizeWithHeader("## Remaining block size:", blockSize);
    }

    // Allocate memory to blocks by using worst fit algorithm
    static void worstFit(int blockSize[], int processSize[]) {
        printBlockSizeWithHeader("## Current block size:", blockSize);

        // Stores block id of the block allocated to a
        // process
        int allocation[] = new int[processSize.length];
        int i, j, wstIdx;
        
        // Initially no block is assigned to any process
        for (i = 0; i < allocation.length; i++) {
        	allocation[i] = -1;
        }
      
        // pick each process and find suitable blocks
        // according to its size ad assign to it
        for (i = 0; i < processSize.length; i++) {
            // Find the best fit block for current process
            wstIdx = -1;
            for (j = 0; j < blockSize.length; j++) {
                if (blockSize[j] >= processSize[i]) {
                	// Assign wstIdx for the first loop
                    if (wstIdx == -1) {
                    	wstIdx = j;
                    }
                    else if (blockSize[wstIdx] < blockSize[j]) {
                    	wstIdx = j;
                    }
                    // We will continue the loop (there is no break here) since the worst-fit algorithm
                    // need to go throw the whole blockSize array to find the worst fit
                }
            }
      
            // If we could find a block for current process
            if (wstIdx != -1) {
                // allocate block j to p[i] process
                allocation[i] = wstIdx;
      
                // Reduce available memory in this block.
                blockSize[wstIdx] -= processSize[i];
            }
        }

        printTable(processSize, allocation);
        
        printBlockSizeWithHeader("## Remaining block size:", blockSize);
    }

    
	public static void main(String[] args) {
		int processSize[] = { 212, 417, 112, 426 };

        // I use blockSizeValue method to create arrays
        // with same values but different reference,
        // since in the following algorithms
        // I reduce the available memory in this block and process.
        // That's why I have to put a new blockSize and a new processSize in everyone of them,
        // so the calculations would work probably
		int BFBlockSize[] = blockSizeValue();
		int FFBlockSize[] = blockSizeValue();
		int WFBlockSize[] = blockSizeValue();

        System.out.println("/* ************************ */");
        System.out.println("/* ** Best-Fit Algorithem ** */");
        System.out.println("/* ************************ */");
        bestFit(BFBlockSize, processSize);
        System.out.println();
        System.out.println("/* ************************ */");
        System.out.println("/* * First-Fit Algorithem * */");
        System.out.println("/* ************************ */");
        firstFit(FFBlockSize, processSize);
        System.out.println();
        System.out.println("/* ************************ */");
        System.out.println("/* * Worst-Fit Algorithem * */");
        System.out.println("/* ************************ */");
        worstFit(WFBlockSize, processSize);
        System.out.println();
	}

}
