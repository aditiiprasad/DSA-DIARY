 
 class SearchInMountain  {
    static int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        
        
        int peak = findPeak(mountainArr, n);
        
        
        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) {
            return index;
        }
        
        
        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }
    
    
    static int findPeak(MountainArray mountainArr, int n) {
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    
    
    static int binarySearch(MountainArray mountainArr, int target, int low, int high, boolean isAscending) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = mountainArr.get(mid);
            if (midValue == target) {
                return mid;
            }
            if (isAscending) {
                if (midValue < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (midValue > target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}

