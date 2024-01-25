import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!et", name = "a", descriptor = "I")
	public static final int anInt1825 = 1406;

	@OriginalMember(owner = "client!et", name = "e", descriptor = "Z")
	public static boolean aBoolean126 = false;

	@OriginalMember(owner = "client!et", name = "f", descriptor = "[Lclient!id;")
	public static final Class119[] aClass119Array1 = new Class119[14];

	@OriginalMember(owner = "client!et", name = "g", descriptor = "I")
	public static int anInt1829 = 0;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!ma;Lclient!la;ILclient!li;IIIIILjava/lang/String;Lclient!hd;)V")
	public static void method1501(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class123 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class158 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) String arg9, @OriginalArg(11) Class110 arg10) {
		@Pc(11) int local11;
		if (Static97.anInt1791 == 4) {
			local11 = (int) Static109.aFloat75 & 0x3FFF;
		} else {
			local11 = (int) Static109.aFloat75 + Static35.anInt575 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg10.anInt2617 / 2, arg10.anInt2590 / 2) + 10;
		@Pc(41) int local41 = arg0 * arg0 + arg8 * arg8;
		if (local41 > local32 * local32) {
			return;
		}
		@Pc(55) int local55 = Class100.anIntArray206[local11];
		@Pc(59) int local59 = Class100.anIntArray208[local11];
		if (Static97.anInt1791 != 4) {
			local59 = local59 * 256 / (Static380.anInt6188 + 256);
			local55 = local55 * 256 / (Static380.anInt6188 + 256);
		}
		@Pc(90) int local90 = local59 * arg0 + arg8 * local55 >> 15;
		@Pc(100) int local100 = arg8 * local59 - local55 * arg0 >> 15;
		@Pc(109) int local109 = arg4.method3036(100, arg9, null);
		@Pc(115) int local115 = local90 - local109 / 2;
		@Pc(125) int local125 = arg4.method3025(null, arg9);
		if (local115 >= -arg10.anInt2617 && local115 <= arg10.anInt2617 && local100 >= -arg10.anInt2590 && arg10.anInt2590 >= local100) {
			arg2.method5789(0, arg3 + arg10.anInt2590 / 2 - local100 - arg6 - local125, null, arg5, local109, 50, arg10.anInt2617 / 2 + local115 + arg5, arg9, null, arg1, arg3, 0, arg7);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)Z")
	public static boolean method1502(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!fh;)Lclient!vv;")
	public static Class51_Sub4 method1504(@OriginalArg(1) Class4_Sub9 arg0) {
		return new Class51_Sub4(arg0.method5061(), arg0.method5061(), arg0.method5061(), arg0.method5061(), arg0.method5008(), arg0.method5008(), arg0.method5007());
	}
}
