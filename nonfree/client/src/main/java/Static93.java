import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "Lclient!pb;")
	public static Class71 aClass71_17;

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "[I")
	public static int[] anIntArray197;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_729 = Static151.method2243("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_730 = Static151.method2243("The server is being updated)3");

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
	public static int anInt2052 = 0;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "Lclient!mb;")
	public static Class62 aClass62_731 = aClass62_730;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
	public static int anInt2057 = 0;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
	public static int anInt2059 = 0;

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_732 = Static151.method2243("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)[Lclient!rd;")
	public static Class42_Sub1[] method1397() {
		@Pc(14) Class42_Sub1[] local14 = new Class42_Sub1[Static208.anInt4345];
		for (@Pc(16) int local16 = 0; local16 < Static208.anInt4345; local16++) {
			local14[local16] = new Class42_Sub1(Static138.anInt2900, Static127.anInt2808, Static19.anIntArray38[local16], Static25.anIntArray57[local16], Static86.anIntArray298[local16], Static138.anIntArray256[local16], Static8.aByteArrayArray1[local16], Static108.anIntArray222);
		}
		Static169.method2456();
		return local14;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	public static void method1398() {
		@Pc(5) Object local5 = Static118.anObject3;
		synchronized (Static118.anObject3) {
			if (Static214.anInt4479 != 0) {
				Static214.anInt4479 = 1;
				try {
					Static118.anObject3.wait();
				} catch (@Pc(15) InterruptedException local15) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BII)Lclient!ii;")
	public static Class47 method1400(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class47 local12 = Static143.method2159(arg1);
		if (arg0 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass47Array1 == null || local12.aClass47Array1.length <= arg0) {
			return null;
		} else {
			return local12.aClass47Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!mf;III)V")
	public static void method1401(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class2_Sub18 local12;
		if (arg2 < Static198.anInt4147) {
			local12 = Static92.aClass2_Sub18ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass10_1 != null && local12.aClass10_1.aClass7_1.method3150()) {
				arg0.method3144(local12.aClass10_1.aClass7_1, 128, 0, 0, true);
			}
		}
		if (arg3 < Static198.anInt4147) {
			local12 = Static92.aClass2_Sub18ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass10_1 != null && local12.aClass10_1.aClass7_1.method3150()) {
				arg0.method3144(local12.aClass10_1.aClass7_1, 0, 0, 128, true);
			}
		}
		if (arg2 < Static198.anInt4147 && arg3 < Static12.anInt319) {
			local12 = Static92.aClass2_Sub18ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass10_1 != null && local12.aClass10_1.aClass7_1.method3150()) {
				arg0.method3144(local12.aClass10_1.aClass7_1, 128, 0, 128, true);
			}
		}
		if (arg2 < Static198.anInt4147 && arg3 > 0) {
			local12 = Static92.aClass2_Sub18ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass10_1 != null && local12.aClass10_1.aClass7_1.method3150()) {
				arg0.method3144(local12.aClass10_1.aClass7_1, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V")
	public static void method1403(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub24 local10 = (Class2_Sub24) Static204.aClass58_14.method1704((long) arg0);
		if (local10 != null) {
			local10.method3183();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!ii;II)V")
	public static void method1404(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(3) int arg2) {
		if (Static6.anInt182 != 0 && Static6.anInt182 != 3) {
			return;
		}
		@Pc(21) int local21 = arg2 - arg1.anInt1858 / 2;
		@Pc(28) int local28 = arg0 - arg1.anInt1910 / 2;
		@Pc(35) int local35 = Static203.anInt4219 + Static151.anInt3204 & 0x7FF;
		@Pc(39) int local39 = Class26.anIntArray77[local35];
		@Pc(43) int local43 = Class26.anIntArray76[local35];
		@Pc(51) int local51 = local43 * (Static206.anInt397 + 256) >> 8;
		@Pc(59) int local59 = (Static206.anInt397 + 256) * local39 >> 8;
		@Pc(74) int local74 = local21 * local59 + local51 * local28 >> 11;
		@Pc(82) int local82 = Static186.aClass7_Sub2_Sub2_1.anInt3046 + local74 >> 7;
		@Pc(92) int local92 = local21 * local51 - local59 * local28 >> 11;
		@Pc(100) int local100 = Static186.aClass7_Sub2_Sub2_1.anInt3085 - local92 >> 7;
		@Pc(122) boolean local122 = Static33.method571(0, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], true, 0, 0, local82, 1, local100, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
		if (!local122) {
			return;
		}
		Static58.aClass2_Sub11_Sub1_2.method1565(local28);
		Static58.aClass2_Sub11_Sub1_2.method1565(local21);
		Static58.aClass2_Sub11_Sub1_2.method1533(Static203.anInt4219);
		Static58.aClass2_Sub11_Sub1_2.method1565(57);
		Static58.aClass2_Sub11_Sub1_2.method1565(Static151.anInt3204);
		Static58.aClass2_Sub11_Sub1_2.method1565(Static206.anInt397);
		Static58.aClass2_Sub11_Sub1_2.method1565(89);
		Static58.aClass2_Sub11_Sub1_2.method1533(Static186.aClass7_Sub2_Sub2_1.anInt3046);
		Static58.aClass2_Sub11_Sub1_2.method1533(Static186.aClass7_Sub2_Sub2_1.anInt3085);
		Static58.aClass2_Sub11_Sub1_2.method1565(Static167.anInt3569);
		Static58.aClass2_Sub11_Sub1_2.method1565(63);
	}
}
