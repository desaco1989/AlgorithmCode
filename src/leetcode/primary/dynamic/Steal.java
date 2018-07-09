package leetcode.primary.dynamic;

/**
 * 打家劫舍.
 * 
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * 
 * 示例 1:
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 * 偷窃到的最高金额 = 1 + 3 = 4 。
 * 
 * 示例 2:
 * 输入: [2,7,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 * 偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 *  
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Steal {
	
	/**
	 * 计算抢到的最大利润.
	 * 
	 * @param nums
	 * @return
	 */
	public int rob(int[] nums) {
		int[] m = new int[nums.length];
		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);
		m[0] = nums[0];
		m[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			m[i] = Math.max(m[i - 2] + nums[i], m[i - 1]);
		}
		return m[nums.length - 1];
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 9, 3, 1 };
		int r = new Steal().rob(nums);
		System.out.println(r);
	}
}
