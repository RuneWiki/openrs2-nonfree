import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
	public static int anInt3738;

	@OriginalMember(owner = "client!lc", name = "P", descriptor = "[I")
	public static int[] anIntArray391;

	@OriginalMember(owner = "client!lc", name = "S", descriptor = "[I")
	public static int[] anIntArray392;

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1288 = Static161.method2971("sl_back");

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
	public static int anInt3737 = -1;

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
	public static int anInt3739 = 0;

	@OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
	public static int anInt3740 = 1;

	@OriginalMember(owner = "client!lc", name = "K", descriptor = "J")
	public static long aLong134 = 0L;

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "[I")
	public static int[] anIntArray390 = new int[2000];

	@OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
	public static int anInt3743 = 0;

	@OriginalMember(owner = "client!lc", name = "Q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1289 = Static161.method2971("l");

	@OriginalMember(owner = "client!lc", name = "R", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1290 = Static161.method2971("This world is full)3");

	@OriginalMember(owner = "client!lc", name = "U", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1291 = aClass13_1290;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Lclient!dd;")
	public static Class13 method2705(@OriginalArg(1) int arg0) {
		return Static164.aClass13Array27[arg0].method904() <= 0 ? Static58.aClass13Array15[arg0] : Static57.method1349(new Class13[] { Static58.aClass13Array15[arg0], Static69.aClass13_679, Static164.aClass13Array27[arg0] });
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIILclient!fd;)V")
	public static void method2707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class20 arg5) {
		@Pc(13) int local13 = Math.min(arg5.anInt1559 / 2, arg5.anInt1603 / 2);
		@Pc(21) int local21 = arg2 * arg2 + arg1 * arg1;
		if (local13 * local13 >= local21 || local21 >= 90000) {
			Static126.method2304(arg5, arg3, Static40.aClass1_Sub2_Sub1_Sub3Array7[arg4], arg1, arg0, arg2);
			return;
		}
		local13 -= 10;
		@Pc(52) int local52 = Static79.anInt2241 + Static2.anInt101 & 0x7FF;
		@Pc(56) int local56 = Class1_Sub2_Sub1_Sub2.anIntArray38[local52];
		@Pc(60) int local60 = Class1_Sub2_Sub1_Sub2.anIntArray41[local52];
		@Pc(68) int local68 = local60 * 256 / (Static60.anInt1871 + 256);
		@Pc(76) int local76 = local56 * 256 / (Static60.anInt1871 + 256);
		@Pc(87) int local87 = arg1 * local76 - local68 * arg2 >> 16;
		@Pc(97) int local97 = local76 * arg2 + local68 * arg1 >> 16;
		@Pc(103) double local103 = Math.atan2((double) local97, (double) local87);
		@Pc(110) int local110 = (int) ((double) local13 * Math.sin(local103));
		@Pc(117) int local117 = (int) ((double) local13 * Math.cos(local103));
		Static88.aClass1_Sub2_Sub1_Sub3Array9[arg4].method416(arg3 + arg5.anInt1559 / 2 + local110 - 10, arg5.anInt1603 / 2 + arg0 + -local117 - 10, local103);
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	public static void method2708() {
		aClass13_1288 = null;
		aClass13_1290 = null;
		anIntArray391 = null;
		aClass13_1289 = null;
		anIntArray390 = null;
		anIntArray392 = null;
		aClass13_1291 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ce;I)Lclient!dd;")
	public static Class13 method2709(@OriginalArg(0) Class1_Sub8 arg0) {
		return Static167.method2852(arg0);
	}
}
