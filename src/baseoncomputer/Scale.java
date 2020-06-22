package baseoncomputer;

/**
 * @author Sweeney
 * @date 2020/6/22 3:01 PM
 */
public class Scale {
    public static void main(String[] args) {
       /**
        * 测试正数左移 、右移
        * 35 35 的补码 00100011 左移后结果为70  右移后结果为17
        *
        * */
        System.out.println(35<<1);
        System.out.println(35>>1);
        /**
         * 测试负数的左移、右移
         * -35的补码 11011101 左移后结果-70 右移后结果-18
         * 左移右移运算中 符号位均参与移动
         * 初负数向右移动高位补一其余情况空位补0
         * */
        System.out.println((-35)<<1);
        System.out.println((-35)>>1);

        /**
         * 测试无符号左移 右移
         * 对于三个大于号的>>>无符号向右移动 (注意不存在<<<无符号向左移动的运算方式)
         * 当向右移动时 正负数高位均补0 ，正数不断向右移动的最小值是0
         * 负数不断向右移动的最小值是1 。无符号意即藐视符号位，符号位失去特权 必须像
         * 其他平常的数字位一起向右移动 高位直接补0 根本不关心是正数还是负数。
         * */
        System.out.println(35>>>1);
        System.out.println(35>>>2);
        System.out.println(35>>>3);

        int a  = -35;
        System.out.println(a>>>32);
        System.out.println(a>>>33);
        System.out.println(a>>>34);
    }
}
