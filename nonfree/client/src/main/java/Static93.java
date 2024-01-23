import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
	public static int anInt2064;

	@OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
	public static int anInt2065;

	@OriginalMember(owner = "client!ja", name = "G", descriptor = "I")
	public static int anInt2067;

	@OriginalMember(owner = "client!ja", name = "H", descriptor = "Lclient!me;")
	public static Class71 aClass71_19;

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "Lclient!ia;")
	private static Class51 aClass51_669 = Static64.method1101("Cancel");

	@OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
	public static int anInt2061 = 0;

	@OriginalMember(owner = "client!ja", name = "F", descriptor = "Lclient!ia;")
	public static Class51 aClass51_670 = aClass51_669;

	@OriginalMember(owner = "client!ja", name = "I", descriptor = "Lclient!ia;")
	public static Class51 aClass51_671 = Static64.method1101("titlebg");

	@OriginalMember(owner = "client!ja", name = "L", descriptor = "Lclient!ia;")
	private static Class51 aClass51_673 = Static64.method1101("wishes to trade with you)3");

	@OriginalMember(owner = "client!ja", name = "K", descriptor = "Lclient!ia;")
	public static Class51 aClass51_672 = aClass51_673;

	@OriginalMember(owner = "client!ja", name = "M", descriptor = "Lclient!ia;")
	public static Class51 aClass51_674 = Static64.method1101("");

	@OriginalMember(owner = "client!ja", name = "N", descriptor = "Lclient!ia;")
	public static Class51 aClass51_675 = Static64.method1101("null");

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(II)I")
	public static int method1544(@OriginalArg(0) int arg0) {
		if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
			return arg0 + 32;
		} else if (arg0 == 159) {
			return 255;
		} else if (arg0 == 140) {
			return 156;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)Lclient!pb;")
	public static Class83 method1545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1124; local13++) {
			@Pc(19) Class83 local19 = local7.aClass83Array3[local13];
			if ((local19.aLong118 >> 29 & 0x3L) == 2L && local19.anInt3340 == arg1 && local19.anInt3336 == arg2) {
				Static38.method672(local19);
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!me;)V")
	public static void method1546(@OriginalArg(1) Class71 arg0) {
		@Pc(2) int local2 = arg0.anInt2815;
		if (local2 == 324) {
			if (Static66.anInt1480 == -1) {
				Static83.anInt1935 = arg0.anInt2833;
				Static66.anInt1480 = arg0.anInt2819;
			}
			if (Static17.aClass111_1.aBoolean191) {
				arg0.anInt2819 = Static66.anInt1480;
			} else {
				arg0.anInt2819 = Static83.anInt1935;
			}
		} else if (local2 == 325) {
			if (Static66.anInt1480 == -1) {
				Static66.anInt1480 = arg0.anInt2819;
				Static83.anInt1935 = arg0.anInt2833;
			}
			if (Static17.aClass111_1.aBoolean191) {
				arg0.anInt2819 = Static83.anInt1935;
			} else {
				arg0.anInt2819 = Static66.anInt1480;
			}
		} else if (local2 == 327) {
			arg0.anInt2776 = 150;
			arg0.anInt2825 = (int) (Math.sin((double) Static109.anInt2430 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2805 = -1;
			arg0.anInt2821 = 5;
		} else if (local2 == 328) {
			if (Static73.aClass5_Sub1_Sub1_1.aClass51_619 == null) {
				arg0.anInt2805 = 0;
			} else {
				arg0.anInt2776 = 150;
				arg0.anInt2825 = (int) (Math.sin((double) Static109.anInt2430 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt2821 = 5;
				arg0.anInt2805 = ((int) Static73.aClass5_Sub1_Sub1_1.aClass51_619.method1388() << 11) + 2047;
				arg0.anInt2793 = Static73.aClass5_Sub1_Sub1_1.anInt3632;
				arg0.anInt2782 = Static73.aClass5_Sub1_Sub1_1.anInt3620;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
	public static void method1547() {
		Static50.aClass53_9.method1498();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!k;I)Lclient!ka;")
	public static Class15_Sub4 method1549(@OriginalArg(0) Class1_Sub16 arg0) {
		return new Class15_Sub4(arg0.method3817(), arg0.method3817(), arg0.method3817(), arg0.method3817(), arg0.method3806(), arg0.method3806(), arg0.method3793());
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILclient!vb;)V")
	public static void method1550(@OriginalArg(0) int arg0, @OriginalArg(2) Class70_Sub1 arg1) {
		if (Static38.aClass1_Sub16_1 == null) {
			Static203.method3260(true, 255, (byte) 0, null, 255, 0);
			Static144.aClass70_Sub1Array1[arg0] = arg1;
		} else {
			Static38.aClass1_Sub16_1.anInt4860 = arg0 * 8 + 5;
			@Pc(16) int local16 = Static38.aClass1_Sub16_1.method3784();
			@Pc(20) int local20 = Static38.aClass1_Sub16_1.method3784();
			arg1.method3547(local20, local16);
		}
	}
}
