import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "J")
	public static long aLong70 = 0L;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
	public static int anInt1920 = 0;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
	public static int anInt1924 = 128;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method1499() {
		Static162.aClass61_62.method1697();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIILclient!o;)V")
	public static void method1501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class86 arg2) {
		if (arg2.aByte11 == 0) {
			arg2.anInt3268 = arg2.anInt3250;
		} else if (arg2.aByte11 == 1) {
			arg2.anInt3268 = (arg1 - arg2.anInt3270) / 2 + arg2.anInt3250;
		} else if (arg2.aByte11 == 2) {
			arg2.anInt3268 = arg1 - arg2.anInt3270 - arg2.anInt3250;
		} else if (arg2.aByte11 == 3) {
			arg2.anInt3268 = arg1 * arg2.anInt3250 >> 14;
		} else if (arg2.aByte11 == 4) {
			arg2.anInt3268 = (arg1 - arg2.anInt3270) / 2 + (arg1 * arg2.anInt3250 >> 14);
		} else {
			arg2.anInt3268 = arg1 - arg2.anInt3270 - (arg1 * arg2.anInt3250 >> 14);
		}
		if (arg2.aByte12 == 0) {
			arg2.anInt3215 = arg2.anInt3243;
		} else if (arg2.aByte12 == 1) {
			arg2.anInt3215 = (arg0 - arg2.anInt3280) / 2 + arg2.anInt3243;
		} else if (arg2.aByte12 == 2) {
			arg2.anInt3215 = arg0 - arg2.anInt3280 - arg2.anInt3243;
		} else if (arg2.aByte12 == 3) {
			arg2.anInt3215 = arg0 * arg2.anInt3243 >> 14;
		} else if (arg2.aByte12 == 4) {
			arg2.anInt3215 = (arg0 - arg2.anInt3280) / 2 + (arg0 * arg2.anInt3243 >> 14);
		} else {
			arg2.anInt3215 = arg0 - (arg0 * arg2.anInt3243 >> 14) - arg2.anInt3280;
		}
		if (!Static219.aBoolean426 || Static34.method676(arg2) == 0 && arg2.anInt3286 != 0) {
			return;
		}
		if (arg2.anInt3215 < 0) {
			arg2.anInt3215 = 0;
		} else if (arg0 < arg2.anInt3280 + arg2.anInt3215) {
			arg2.anInt3215 = arg0 - arg2.anInt3280;
		}
		if (arg2.anInt3268 < 0) {
			arg2.anInt3268 = 0;
		} else if (arg1 < arg2.anInt3268 + arg2.anInt3270) {
			arg2.anInt3268 = arg1 - arg2.anInt3270;
			return;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(JI)V")
	public static void method1502(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < Static231.anInt4994; local20++) {
			if (Static18.aLongArray1[local20] == arg0) {
				Static231.anInt4994--;
				for (@Pc(38) int local38 = local20; local38 < Static231.anInt4994; local38++) {
					Static178.aClass107Array23[local38] = Static178.aClass107Array23[local38 + 1];
					Static196.anIntArray351[local38] = Static196.anIntArray351[local38 + 1];
					Static149.aClass107Array17[local38] = Static149.aClass107Array17[local38 + 1];
					Static18.aLongArray1[local38] = Static18.aLongArray1[local38 + 1];
					Static151.anIntArray292[local38] = Static151.anIntArray292[local38 + 1];
					Static211.aBooleanArray27[local38] = Static211.aBooleanArray27[local38 + 1];
				}
				Static82.anInt1779 = Static218.anInt4760;
				Static193.aClass1_Sub26_Sub1_2.method3000(46);
				Static193.aClass1_Sub26_Sub1_2.method2940(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZIII)V")
	public static void method1503(@OriginalArg(0) boolean arg0) {
		Static97.aBoolean189 = arg0;
		Static14.anInt334 = 22050;
		Static7.anInt242 = 2;
	}
}
