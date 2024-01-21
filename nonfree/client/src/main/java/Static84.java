import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!sd;")
	public static Class60 aClass60_20;

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Lclient!wd;")
	public static Class97 aClass97_9;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1229 = Static118.method2249("(Udns");

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1231 = Static118.method2249("No reply from loginserver)3");

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1230 = aClass65_1231;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "[Lclient!oc;")
	public static final Class65[] aClass65Array28 = new Class65[1000];

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	public static int anInt2050 = 0;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1232 = Static118.method2249("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(BI)V")
	public static void method1456(@OriginalArg(1) int arg0) {
		Static41.anInt1102 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIIZZZII)Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3 method1457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(30) long local30 = ((long) arg0 << 40) + (arg2 ? 137438953472L : 0L) + ((long) arg6 << 16) + (long) arg1 + ((long) arg5 << 38);
		@Pc(40) Class1_Sub2_Sub5_Sub3 local40;
		if (!arg3 && !arg4) {
			local40 = (Class1_Sub2_Sub5_Sub3) Static1.aClass87_75.method3062(local30);
			if (local40 != null) {
				return local40;
			}
		}
		@Pc(50) Class1_Sub2_Sub2 local50 = Static40.method700(arg1);
		if (arg6 > 1 && local50.anIntArray36 != null) {
			@Pc(60) int local60 = -1;
			for (@Pc(62) int local62 = 0; local62 < 10; local62++) {
				if (arg6 >= local50.anIntArray35[local62] && local50.anIntArray35[local62] != 0) {
					local60 = local50.anIntArray36[local62];
				}
			}
			if (local60 != -1) {
				local50 = Static40.method700(local60);
			}
		}
		@Pc(102) Class6_Sub3_Sub1 local102 = local50.method226();
		if (local102 == null) {
			return null;
		}
		@Pc(108) Class1_Sub2_Sub5_Sub3 local108 = null;
		if (local50.anInt300 != -1) {
			local108 = method1457(0, local50.anInt290, arg2, true, false, 1, 10);
			if (local108 == null) {
				return null;
			}
		} else if (local50.anInt304 != -1) {
			local108 = method1457(arg0, local50.anInt280, arg2, false, true, arg5, arg6);
			if (local108 == null) {
				return null;
			}
		}
		@Pc(149) int[] local149 = Static194.anIntArray468;
		@Pc(151) int local151 = Static194.anInt4129;
		@Pc(153) int local153 = Static194.anInt4131;
		@Pc(156) int[] local156 = new int[4];
		Static194.method3097(local156);
		local40 = new Class1_Sub2_Sub5_Sub3(36, 32);
		Static194.method3101(local40.anIntArray204, 36, 32);
		Static194.method3102();
		Static56.method1025();
		Static56.method1040(16, 16);
		Static56.aBoolean60 = false;
		if (local50.anInt304 != -1) {
			local108.method1315(0, 0);
		}
		@Pc(188) int local188 = local50.anInt311;
		if (arg3) {
			local188 = (int) ((double) local188 * 1.5D);
		} else if (arg5 == 2) {
			local188 = (int) ((double) local188 * 1.04D);
		}
		@Pc(218) int local218 = local188 * Class1_Sub2_Sub5_Sub2.anIntArray142[local50.anInt323] >> 16;
		@Pc(227) int local227 = Class1_Sub2_Sub5_Sub2.anIntArray138[local50.anInt323] * local188 >> 16;
		local102.method1184(local50.anInt313, local50.anInt289, local50.anInt323, local50.anInt296, local227 + local50.anInt312 - local102.method2984() / 2, local218 + local50.anInt312);
		if (local50.anInt304 == -1) {
			if (arg5 >= 1) {
				local40.method1322(1);
			}
			if (arg5 >= 2) {
				local40.method1322(16777215);
			}
			if (arg0 != 0) {
				local40.method1309(arg0);
			}
		}
		Static194.method3101(local40.anIntArray204, 36, 32);
		if (local50.anInt300 != -1) {
			local108.method1315(0, 0);
		}
		if (!arg3 && (local50.anInt321 == 1 || arg6 != 1) && arg6 != -1 && arg2) {
			Static97.aClass1_Sub2_Sub5_Sub4_Sub1_3.method1597(Static14.method269(arg6), 0, 9, 16776960, 1);
		}
		if (!arg3 && !arg4) {
			Static1.aClass87_75.method3068(local40, local30);
		}
		Static194.method3101(local149, local153, local151);
		Static194.method3106(local156);
		Static56.method1025();
		Static56.aBoolean60 = true;
		return local40;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public static void method1458() {
		Static138.anIntArray384 = null;
		Static127.anIntArray364 = null;
		Static160.anIntArray328 = null;
		Static111.anIntArray308 = null;
		Static153.aByteArrayArray33 = null;
		Static61.anIntArray154 = null;
	}
}
