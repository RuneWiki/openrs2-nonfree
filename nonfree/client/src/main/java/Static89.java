import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Lclient!va;")
	private static Class61 aClass61_919 = Static88.method1421("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Lclient!va;")
	public static Class61 aClass61_918 = aClass61_919;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public static int anInt2328 = -1;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Lclient!va;")
	public static Class61 aClass61_920 = Static88.method1421("overlay_multiway");

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Ljava/lang/Object;")
	public static Object anObject4 = new Object();

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "J")
	public static long aLong72 = 0L;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!bb;")
	public static Class9 aClass9_9 = new Class9();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public static void method1424() {
		aClass9_9 = null;
		aClass61_920 = null;
		aClass61_919 = null;
		aClass61_918 = null;
		anObject4 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIILclient!d;III)V")
	public static void method1425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class10_Sub1_Sub4 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static27.aBoolean39) {
			Static42.anInt2370 = 32;
		} else {
			Static42.anInt2370 = 0;
		}
		Static27.aBoolean39 = false;
		if (arg5 >= arg3 && arg3 + 16 > arg5 && arg6 <= arg0 && arg0 < arg6 + 16) {
			if (arg2 == 2 || arg2 == 3) {
				Static7.aBoolean1 = true;
			}
			if (arg2 == 1) {
				Static80.aBoolean94 = true;
			}
			arg4.anInt579 -= Static6.anInt68 * 4;
		} else if (arg5 >= arg3 && arg5 < arg3 + 16 && arg0 >= arg6 + arg1 - 16 && arg0 < arg1 + arg6) {
			if (arg2 == 1) {
				Static80.aBoolean94 = true;
			}
			arg4.anInt579 += Static6.anInt68 * 4;
			if (arg2 == 2 || arg2 == 3) {
				Static7.aBoolean1 = true;
			}
		} else if (arg5 >= arg3 - Static42.anInt2370 && Static42.anInt2370 + arg3 + 16 > arg5 && arg0 >= arg6 + 16 && arg1 + arg6 - 16 > arg0 && Static6.anInt68 > 0) {
			Static27.aBoolean39 = true;
			if (arg2 == 1) {
				Static80.aBoolean94 = true;
			}
			@Pc(154) int local154 = (arg1 - 32) * arg1 / arg7;
			if (local154 < 8) {
				local154 = 8;
			}
			if (arg2 == 2 || arg2 == 3) {
				Static7.aBoolean1 = true;
			}
			@Pc(182) int local182 = arg0 - arg6 - local154 / 2 - 16;
			@Pc(189) int local189 = arg1 - local154 - 32;
			arg4.anInt579 = local182 * (arg7 - arg1) / local189;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILclient!bc;I)V")
	public static void method1426(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg2 * arg2 + arg0 * arg0;
		if (local11 <= 4225 || local11 >= 90000) {
			Static40.method650(arg0, arg1, arg2);
			return;
		}
		@Pc(32) int local32 = Static57.anInt1509 + Static79.anInt2144 & 0x7FF;
		@Pc(36) int local36 = Static84.anIntArray281[local32];
		@Pc(40) int local40 = Static84.anIntArray280[local32];
		@Pc(48) int local48 = local36 * 256 / (Static25.anInt776 + 256);
		@Pc(56) int local56 = local40 * 256 / (Static25.anInt776 + 256);
		@Pc(66) int local66 = arg2 * local48 - arg0 * local56 >> 16;
		@Pc(76) int local76 = local48 * arg0 + local56 * arg2 >> 16;
		@Pc(82) double local82 = Math.atan2((double) local76, (double) local66);
		@Pc(88) int local88 = (int) (Math.sin(local82) * 63.0D);
		@Pc(94) int local94 = (int) (Math.cos(local82) * 57.0D);
		Static20.aClass10_Sub1_Sub1_Sub1_57.method148(local88 + 94 - 6, -local94 + -20 + 83, local82);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
	public static void method1427() {
		if (Static5.aClass13_1 == null) {
			return;
		}
		Static7.method77();
		if (Static80.anInt2152 > 0) {
			Static5.aClass13_1.method1504(256);
			Static80.anInt2152 = 0;
		}
		Static5.aClass13_1.method1501();
		Static5.aClass13_1 = null;
	}
}
