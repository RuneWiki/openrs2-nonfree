import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!kf", name = "V", descriptor = "Lclient!rf;")
	private static Class70 aClass70_900 = Static49.method1293("Create a free account");

	@OriginalMember(owner = "client!kf", name = "W", descriptor = "Lclient!ge;")
	public static Class30 aClass30_9 = new Class30(4096);

	@OriginalMember(owner = "client!kf", name = "X", descriptor = "Lclient!rf;")
	public static Class70 aClass70_901 = Static49.method1293("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!kf", name = "Z", descriptor = "J")
	public static long aLong86 = 0L;

	@OriginalMember(owner = "client!kf", name = "ab", descriptor = "Z")
	public static boolean aBoolean108 = false;

	@OriginalMember(owner = "client!kf", name = "eb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_902 = aClass70_900;

	@OriginalMember(owner = "client!kf", name = "fb", descriptor = "Z")
	public static boolean aBoolean109 = false;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "(B)V")
	public static void method2038() {
		aClass70_901 = null;
		aClass30_9 = null;
		aClass70_900 = null;
		aClass70_902 = null;
	}

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "(B)V")
	public static void method2039() {
		Static95.aClass16_1.method1663();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static96.aLongArray6[local10] = 0L;
		}
		for (@Pc(30) int local30 = 0; local30 < 32; local30++) {
			Static81.aLongArray5[local30] = 0L;
		}
		Static102.anInt2918 = 0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II[B[Lclient!oa;I)V")
	public static void method2040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class59[] arg3) {
		@Pc(7) int local7 = -1;
		@Pc(12) Class1_Sub9 local12 = new Class1_Sub9(arg2);
		while (true) {
			@Pc(21) int local21 = local12.method1258();
			if (local21 == 0) {
				return;
			}
			@Pc(25) int local25 = 0;
			local7 += local21;
			while (true) {
				@Pc(33) int local33 = local12.method1244();
				if (local33 == 0) {
					break;
				}
				local25 += local33 - 1;
				@Pc(45) int local45 = local25 & 0x3F;
				@Pc(51) int local51 = local25 >> 6 & 0x3F;
				@Pc(55) int local55 = local25 >> 12;
				@Pc(59) int local59 = local12.method1234();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				@Pc(71) int local71 = local51 + arg1;
				@Pc(76) int local76 = local45 + arg0;
				if (local71 > 0 && local76 > 0 && local71 < 103 && local76 < 103) {
					@Pc(88) int local88 = local55;
					@Pc(90) Class59 local90 = null;
					if ((Static20.aByteArrayArrayArray1[1][local71][local76] & 0x2) == 2) {
						local88 = local55 - 1;
					}
					if (local88 >= 0) {
						local90 = arg3[local88];
					}
					Static75.method1677(local63, local7, local55, local67, local76, local71, local90);
				}
			}
		}
	}
}
