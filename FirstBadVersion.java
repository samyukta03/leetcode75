public class FirstBadVersion {
    public int firstbadversion(int n){
        int mid=0;
        int ans=n;
        int l=0,r=n;
        while(l<=r){
            mid=(l+r)/2;
            if(isbadversion(mid)==true){
                 ans = Math.min(ans,mid);
                 r=mid-1;
            }
            else l=mid+1;
        }
        return ans;
    }
    //the below is a fn which is actually predefined abstract in the problem and here added to avoid errors
    private boolean isbadversion(int mid) {
        return false;
    }
    public static void main(String[] args) {
        FirstBadVersion bs = new FirstBadVersion();
        int ans = bs.firstbadversion(11);
        System.out.println(ans);
    }
}
