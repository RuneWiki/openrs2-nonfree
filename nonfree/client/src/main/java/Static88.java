import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!k", name = "w", descriptor = "I")
	public static int anInt1834;

	@OriginalMember(owner = "client!k", name = "D", descriptor = "Lclient!ra;")
	public static Class78 aClass78_2;

	@OriginalMember(owner = "client!k", name = "J", descriptor = "Lclient!qf;")
	public static Class77 aClass77_6;

	@OriginalMember(owner = "client!k", name = "A", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_720 = Static120.method1824("Username: ");

	@OriginalMember(owner = "client!k", name = "s", descriptor = "Lclient!rd;")
	public static Class80 aClass80_718 = aClass80_720;

	@OriginalMember(owner = "client!k", name = "R", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_721 = Static120.method1824("Loaded interfaces");

	@OriginalMember(owner = "client!k", name = "y", descriptor = "Lclient!rd;")
	public static Class80 aClass80_719 = aClass80_721;

	@OriginalMember(owner = "client!k", name = "L", descriptor = "[I")
	public static final int[] anIntArray223 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg1) {
			Static171.method2759(arg4, arg6, arg3, arg5, arg2, arg0);
		} else if (arg6 - arg3 >= Static172.anInt3861 && arg3 + arg6 <= Static85.anInt1779 && Static34.anInt790 <= arg0 - arg1 && Static17.anInt440 >= arg0 + arg1) {
			Static195.method3155(arg3, arg1, arg2, arg4, arg6, arg0, arg5);
		} else {
			Static48.method729(arg1, arg2, arg6, arg4, arg3, arg5, arg0);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIBIILclient!qf;I)V")
	public static void method1281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class77 arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = Math.min(arg4.anInt3251 / 2, arg4.anInt3221 / 2);
		@Pc(25) int local25 = arg5 * arg5 + arg2 * arg2;
		if (local25 <= local17 * local17 || local25 >= 90000) {
			Static182.method2910(arg2, arg4, arg3, Static12.aClass3_Sub1_Sub4_Sub4Array2[arg1], arg0, arg5);
			return;
		}
		@Pc(44) int local44 = Static126.anInt2704 + Static126.anInt2707 & 0x7FF;
		@Pc(48) int local48 = Class3_Sub1_Sub4_Sub2.anIntArray188[local44];
		@Pc(56) int local56 = local48 * 256 / (Static148.anInt3314 + 256);
		local17 -= 10;
		@Pc(61) int local61 = Class3_Sub1_Sub4_Sub2.anIntArray190[local44];
		@Pc(69) int local69 = local61 * 256 / (Static148.anInt3314 + 256);
		@Pc(80) int local80 = local69 * arg5 - arg2 * local56 >> 16;
		@Pc(90) int local90 = arg5 * local56 + arg2 * local69 >> 16;
		@Pc(96) double local96 = Math.atan2((double) local90, (double) local80);
		@Pc(103) int local103 = (int) (Math.sin(local96) * (double) local17);
		@Pc(110) int local110 = (int) (Math.cos(local96) * (double) local17);
		Static9.aClass3_Sub1_Sub4_Sub4Array3[arg1].method2589(arg4.anInt3251 / 2 + arg0 + local103 - 10, arg3 + -10 + arg4.anInt3221 / 2 + -local110, local96);
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
	public static void method1282() {
		if (Static183.aClass83_1 != null) {
			@Pc(3) Class83 local3 = Static183.aClass83_1;
			synchronized (Static183.aClass83_1) {
				Static183.aClass83_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!bc;)V")
	public static void method1284(@OriginalArg(1) Class1 arg0) {
		Static28.aClass1_3 = arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BZ)V")
	public static void method1286(@OriginalArg(1) boolean arg0) {
		Static174.method2812();
		Static153.anInt672++;
		if (Static153.anInt672 < 50 && !arg0) {
			return;
		}
		Static153.anInt672 = 0;
		if (Static140.aBoolean117 || Static31.aClass78_1 == null) {
			return;
		}
		Static146.aClass3_Sub17_Sub1_3.method2146(193);
		try {
			Static31.aClass78_1.method2419(Static146.aClass3_Sub17_Sub1_3.aByteArray40, Static146.aClass3_Sub17_Sub1_3.anInt2923);
			Static146.aClass3_Sub17_Sub1_3.anInt2923 = 0;
		} catch (@Pc(38) IOException local38) {
			Static140.aBoolean117 = true;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IBIII)V")
	public static void method1288(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static172.anInt3861 && Static85.anInt1779 >= arg0) {
			@Pc(19) int local19 = Static61.method895(arg1, Static34.anInt790, Static17.anInt440);
			@Pc(25) int local25 = Static61.method895(arg3, Static34.anInt790, Static17.anInt440);
			Static56.method820(local19, local25, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V")
	public static void method1289() {
		Static77.aFont3 = null;
		Static112.anImage4 = null;
		Static54.aFontMetrics1 = null;
	}
}
