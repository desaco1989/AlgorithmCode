# AlgorithmCode

该仓库收集一些算法的答案，目标是整理一套系统的算法参考答案以供其他学习者参考

我也在慢慢的学算法并且在坚持刷题，我会不定期的上传新的题目，希望大家共同努力！

在线编程网站：

- [LeetCode](https://leetcode-cn.com/problemset/all/)
- [牛客网-剑指offer](https://www.nowcoder.com/ta/coding-interviews?page=1)

### 目录

- [排序算法](#排序算法)
- [LeetCode](#LeetCode)
- [剑指offer](#剑指offer)
- [码赛](#码赛)
- [笔试真题](#笔试真题)
- [面试感受](#面试感受)

### 排序算法

| 算法 | 稳定 | 时间复杂度 | 空间复杂度 | 备注 |
| :---: | :---: |:---: | :---: | :---: |
| 选择排序 | no | N<sup>2</sup> | 1 | |
| 冒泡排序 | yes |  N<sup>2</sup> | 1 | |
| 插入排序 | yes |  N \~ N<sup>2</sup> | 1 | 时间复杂度和初始顺序有关 |
| 希尔排序 | no |  N 的若干倍乘于递增序列的长度 | 1 | |
| 快速排序 | no | NlogN | logN | |
| 三向切分快速排序 | no |  N \~ NlogN | logN | 适用于有大量重复主键|
| 归并排序 | yes |  NlogN | N | |
| 堆排序 | no |  NlogN | 1 | | |

快速排序是最快的通用排序算法，它的内循环的指令很少，而且它还能利用缓存，因为它总是顺序地访问数据。它的运行时间近似为 \~cNlogN，这里的 c 比其他线性对数级别的排序算法都要小。使用三向切分快速排序，实际应用中可能出现的某些分布的输入能够达到线性级别，而其它排序算法仍然需要线性对数时间。

- [选择排序](src/sort/Selection.java)
- [插入排序](src/sort/Insertion.java)
- [冒泡排序](src/sort/Buddle.java)
- [冒泡排序改进版](src/sort/Buddle2.java)
- [希尔排序](src/sort/Shell.java)
- [自顶向下归并排序](src/sort/UpToDownMergeSort.java)
- [自底向上归并排序](src/sort/DownToUpMergeSort.java)
- [快速排序](src/sort/QuickSort.java)
- [三向切分快速排序](src/sort/ThreeWayQuickSort.java)
- [堆的基本操作](src/sort/Heap.java)
- [堆排序](src/sort/HeapSort.java)

### LeetCode

**1-100**

- [2.两数相加](src/leetcode/all/solution1_100/Solution2.java)
- [7.反转整数](src/leetcode/all/solution1_100/Solution7.java)
- [9.回文数](src/leetcode/all/solution1_100/Solution9.java)
- [13.罗马数字转整数](src/leetcode/all/solution1_100/Solution13.java)
- [15.三数之和](src/leetcode/all/solution1_100/Solution15.java)
- [16.最接近的三数之和](src/leetcode/all/solution1_100/Solution16.java)
- [18.四数之和](src/leetcode/all/solution1_100/Solution18.java)
- [27.移除元素](src/leetcode/all/solution1_100/Solution27.java)
- [28.实现strStr()](src/leetcode/all/solution1_100/Solution28.java)
- [32.最长有效括号](src/leetcode/all/solution1_100/Solution32.java)
- [35.搜索插入位置](src/leetcode/all/solution1_100/Solution35.java)
- [38.报数](src/leetcode/all/solution1_100/Solution38.java)
- [53.最大子序和](src/leetcode/all/solution1_100/Solution53.java)
- [58.最后一个单词的长度](src/leetcode/all/solution1_100/Solution58.java)
- [62.不同路径](src/leetcode/all/solution1_100/Solution62.java)
- [63.不同路径 II](src/leetcode/all/solution1_100/Solution63.java)
- [64.最小路径和](src/leetcode/all/solution1_100/Solution64.java)
- [66.加一](src/leetcode/all/solution1_100/Solution66.java)
- [67.二进制求和](src/leetcode/all/solution1_100/Solution67.java)
- [69.x的平方根](src/leetcode/all/solution1_100/Solution69.java)
- [83.删除排序链表中的重复元素](src/leetcode/all/solution1_100/Solution83.java)
- [100.相同的树](src/leetcode/all/solution1_100/Solution100.java)

**101-200**

- [110.二叉树的最小深度](src/leetcode/all/solution101_200/Solution111.java)
- [112.路径总和](src/leetcode/all/solution101_200/Solution112.java)
- [125.验证回文串](src/leetcode/all/solution101_200/Solution125.java)
- [160.相交链表](src/leetcode/all/solution101_200/Solution160.java)
- [167.两数之和 II - 输入有序数组](src/leetcode/all/solution101_200/Solution167.java)
- [188.杨辉三角](src/leetcode/all/solution101_200/Solution188.java)

**201-300**

- [226.翻转二叉树](src/leetcode/all/solution201_300/Solution226.java)
- [257.二叉树的所有路径](src/leetcode/all/solution201_300/Solution257.java)

**301-400**

- [303.区域和检索 - 数组不可变](src/leetcode/all/solution301_400/Solution303.java)
- [304.二维区域和检索 - 矩阵不可变](src/leetcode/all/solution301_400/Solution304.java)
- [349.两个数组的交集](src/leetcode/all/solution301_400/Solution349.java)
- [383.赎金信](src/leetcode/all/solution301_400/Solution383.java)
- [354.俄罗斯套娃信封问题](src/leetcode/all/solution301_400/Solution354.java)

**401-500**

- [404.左叶子之和](src/leetcode/all/solution401_500/Solution404.java)
- [434. 字符串中的单词数](src/leetcode/all/solution401_500/Solution434.java)
- [437.路径总和 III](src/leetcode/all/solution401_500/Solution437.java)
- [442.数组中重复的数据](src/leetcode/all/solution401_500/Solution442.java)
- [443.压缩字符串](src/leetcode/all/solution401_500/Solution443.java)
- [448.找到所有数组中消失的数字](src/leetcode/all/solution401_500/Solution448.java)

**501_600**

- [520.检测大写字母](src/leetcode/all/solution501_600/Solution520.java)
- [541.反转字符串 II](src/leetcode/all/solution501_600/Solution541.java)
- [543.二叉树的直径](src/leetcode/all/solution501_600/Solution543.java)
- [551.学生出勤纪录 I](src/leetcode/all/solution501_600/Solution551.java)
- [557.反转字符串中的单词 III](src/leetcode/all/solution501_600/Solution557.java)
- [559.N叉树的最大深度](src/leetcode/all/solution501_600/Solution559.java)
- [563.二叉树的坡度](src/leetcode/all/solution501_600/Solution563.java)
- [572.另一个树的子树](src/leetcode/all/solution501_600/Solution572.java)
- [589.N叉树的前序遍历(未使用迭代算法)](src/leetcode/all/solution501_600/Solution589.java)
- [590.N叉树的后序遍历(未使用迭代算法)](src/leetcode/all/solution501_600/Solution590.java)

**601-700**

- [606.根据二叉树创建字符串](src/leetcode/all/solution601_700/Solution606.java)
- [653.两数之和 IV - 输入 BST](src/leetcode/all/solution601_700/Solution653.java)
- [684.冗余连接](src/leetcode/all/solution601_700/Solution684.java)
- [687.最长同值路径(递归)](src/leetcode/all/solution601_700/Solution687.java)
- [698.划分为k个相等的子集（递归）](src/leetcode/all/solution601_700/Solution698.java)

**701-800**

- [746.使用最小花费爬楼梯](src/leetcode/all/solution701_800/Solution746.java)
- [779.第K个语法符号](src/leetcode/all/solution701_800/Solution779.java)

**801_900**

- [859.亲密字符串](src/leetcode/all/solution801_900/Solution859.java)
- [872.叶子相似的树](src/leetcode/all/solution801_900/Solution872.java)

### 剑指offer

- [两个链表的第一个公共结点](src/offer/FindFirstCommonNodeSolution.java)
- [链表中倒数第k个结点](src/offer/FindKthToTailSolution.java)
- [树的子结构](src/offer/HasSubtreeSolution.java)
- [合并两个排序的链表](src/offer/MergeSolution.java)
- [二叉树的镜像](src/offer/MirrorSolution.java)
- [矩形覆盖](src/offer/RectCoverSolution.java)
- [调整数组顺序使奇数位于偶数前面](src/offer/ReOrderArraySolution.java)
- [反转链表](src/offer/ReverseListSolution.java)

### 码赛

- [股神](src/masai/GuShen.java)

### 笔试真题

- [阿里2019秋招模拟题-内存回收](src/ali2019/Main.java)
- [阿里2019秋招在线测评-工时预估](src/ali2019/MaxWorkinghourGap.java)
- [阿里2019秋招笔试题1-火柴棍](src/ali2019/Main2.java)
- [阿里2019秋招笔试题2-送快递](src/ali2019/Main3.java)
- [腾讯2019笔试模拟题-纸牌游戏](src/tencent/Main1.java)
- [腾讯2019笔试-反转数列](src/tencent/Main2.java)
- [腾讯2019笔试-贪吃的小Q](src/tencent/Main3.java)
- [腾讯2019笔试-贪吃的小Q（别人的递归算法）](src/tencent/Main4.java)
- [腾讯2019笔试-和谐数](src/tencent/Main6.java)
- [迅雷2019笔试模拟-求数列的和](src/other/XunleiTest1.java)
- [迅雷2019笔试模拟-水仙花数](src/other/XunleiTest2.java)
- [迅雷2019笔试模拟-数组中消失的数字](src/other/Xunlei1.java)
- [迅雷2019笔试模拟-最长无重复字符子串长度](src/other/Xunlei2.java)
- [京东2017秋招真题-集合](src/jd/Solution1.java)
- [百词斩2019笔试题-时间相关](src/other/Baicizhan1.java)
- [百词斩2019笔试题-连续数字合并](src/other/Baicizhan2.java)
- [神策数据2019笔试题-日志输出](src/other/ShenCe.java)
- [神策数据2019笔试题-时间累加](src/other/ShenCe2.java)
- [神策数据2019笔试题-陀峰命名改为下划线命名](src/other/ShenCe1.java)
- [神策数据2019面试手写算法题-折半查找的实现](src/other/ShenCeInterview1.java)
- [神策数据2019面试手写算法题-统计数字个数](src/other/ShenCeInterview2.java)
- [蘑菇街2019笔试题-网格路径数（未完成）](src/other/Mogujie1.java)
- [蘑菇街2019笔试题-分词（未完成）](src/other/Mogujie2.java)
- [百度2019笔试题-地外文明](src/other/Baidu1.java)
- [百度2019笔试题-生日蛋糕（未完成）](src/other/Baidu2.java)
- [百度2019笔试题-B序（未完成）](src/other/Baidu3.java)
- [完美2019笔试题-诱惑值](src/other/Wanmei1.java)
- [顺网科技2019笔试题-去除数组中重复元素](src/other/Shunwang.java)

### 其他练习

- [图的输入和遍历](src/other/GraphTest.java)

### 面试感受

**腾讯**

初面过了，复试挂了！

一轮的时候氛围很轻松，我没有回答上来的会有提示，说的不正确的地方面试官会把他的理解说下，大致的问题有：

- 设计模式中的单例如何实现线程安全？几种方法？
- gc？
- 三次握手？为什么需要三次？
- 四次挥手？为什么需要四次？为什么要等待2MSL？
- 应用层协议？
- OSI五层协议有哪些？

还要很多很多，但是我已经想不起来了，初面在一个半小时以上（我应该是最后一个，下午6点半才面完），中间写了两道题目：


1.一个题是给你一个字符串数组，如["1"，"3"，"30"，"7"]组成的最大的数是多少，示例输出为73301？
这道题可以使用排序的思路来做，但是比较的规则有所变化，假设要比较3和30的大小，那么直接比较330和303的大小，330>303，那么以本题的规则就是3>30

2.第二题是给你整形数组{1，2，3，4，5，6}，还有一个右移位数n=3，返回一个右移之后的数组，数组个数用m表示，示例输出[4，5，6，1，2，3]，要求时间复杂度和占用的空间最小并说明占用空间大小？
最笨的方法就是循环n次，然后每次移动一位，时间复杂度为O(n*m)；好一点的方法：首先将数组完全反转，此时为6 5 4 3 2 1，然后对前n位再次反转，后面的不变，此时为4 5 6 3 2 1，然后对第n位之后的全部进行反转，即为4 5 6 1 2 3。，时间复杂度0(3*m)


复试问题很少，如下：

会C或者C++吗？
> 学过C语言，但是不太熟悉，常用的是Java（os：我报的是Android岗位呀）

问题没了，问的就这一个，然后下边开始做题

第1题是Java题目，写出输出结果，考察的知识点是try、catch、finally

第2题还是写输出结果，考察的知识点是继承、静态代码块加载顺序问题，形如：

```java
Child child=new Child();
Parent parent=new Child();
```

第3题是手写算法，给定一个数组，元素都是整型，然后给定一个S，输出三个数相加之和与S最接近的那三个数在原数组中的索引，然后就没有然后了...

总结来说，复试主要考察的是算法，所以挂了也是必然的，以后要继续加强对算法的强化

**同花顺**

因为我的项目中用到了长连接，所以面试官就以此为入口开始问问题了：

- 长连接和短连接？
- 三次握手？
- 长连接是在Service服务中建立的吗？
- Service保活问题？
- 项目中有没有用过push？
- 快速排序的思想？
> 大致说来就是先找切分点，然后对切分点左侧继续这个步骤，右侧继续这个步骤
> 寻找切分点：将第1个元素设为基准，j从后往前查找比基准小的数，i从前（第2个元素开始）往后查找比基准大的位置，找到之后两者交换，交换之后继续此步骤，直到i>j时停止，将j位置元素和基准交换，返回切分点j
- Looper原理？
- 课表控件原理？
- java中gc回收原理？
- 自定义View的过程？

**神策数据**

- 线程池相关？
- Android如何配置进程？
- ButterKnife原理？
- Android中怎么执行异步任务？
- 项目中用过多线程吗？
- 如何保证界面跳转过程中不出现回退很多下才会退出的问题？（其实问的就是LaunchMode的问题）
- 加载模式有几种？
- 课表控件原理？
- 集合有哪几类？List和Set的区别？LinkedList和ArrayList的区别？
- 根据项目来说明IO的运用？

总结来看，神策的面试官基本上把简历上写的东西都问了，我写了多进程、多线程、同步、异步，所以简历上写的东西一定要全部过一遍

**同花顺**

技术复试：

- socket长连接、心跳保持
- jni
- 代码混淆
- Android调试工具
- JVM和DVM的区别
- eclipse和Android Studio的区别
- 使用原生写的软件越来越少，你的看法？
- 网络请求框架

Hr面试：

- 个人优缺点
- 如何统计西湖中有多少条鱼
- 最值得骄傲的一件事
- 说下对我们公司的了解
- 你是以什么样的标准来选择工作的？优先考虑哪方面？
- 你还有什么想问的吗？





