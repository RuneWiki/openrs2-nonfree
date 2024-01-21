import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!t", name = "q", descriptor = "I")
	public static int anInt2135;

	@OriginalMember(owner = "client!t", name = "u", descriptor = "Lclient!i;")
	public static Class2_Sub2_Sub9 aClass2_Sub2_Sub9_1;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Lclient!o;")
	public static Class40 aClass40_608 = Static13.method257("Too many connections from your address)3");

	@OriginalMember(owner = "client!t", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_609 = Static13.method257("(Y");

	@OriginalMember(owner = "client!t", name = "j", descriptor = "Lclient!qc;")
	public static Class47 aClass47_17 = new Class47(260);

	@OriginalMember(owner = "client!t", name = "l", descriptor = "Lclient!qc;")
	public static Class47 aClass47_18 = new Class47(50);

	@OriginalMember(owner = "client!t", name = "m", descriptor = "I")
	public static int anInt2132 = 0;

	@OriginalMember(owner = "client!t", name = "n", descriptor = "Lclient!o;")
	public static Class40 aClass40_610 = Static13.method257("glow1:");

	@OriginalMember(owner = "client!t", name = "o", descriptor = "I")
	public static int anInt2133 = 0;

	@OriginalMember(owner = "client!t", name = "r", descriptor = "Lclient!qc;")
	public static Class47 aClass47_19 = new Class47(50);

	@OriginalMember(owner = "client!t", name = "s", descriptor = "Lclient!o;")
	public static Class40 aClass40_611 = Static13.method257("Please contact customer support)3");

	@OriginalMember(owner = "client!t", name = "t", descriptor = "I")
	public static int anInt2136 = 0;

	@OriginalMember(owner = "client!t", name = "v", descriptor = "Lclient!qc;")
	public static Class47 aClass47_20 = new Class47(50);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BII[Lclient!fb;[BII)V")
	public static void method1460(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class20[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (arg4 + local7 > 0 && local7 + arg4 < 103 && arg0 + local11 > 0 && local11 + arg0 < 103) {
						arg2[local3].anIntArrayArray9[local7 + arg4][local11 + arg0] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(98) Class2_Sub3 local98 = new Class2_Sub3(arg3);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
				for (@Pc(108) int local108 = 0; local108 < 64; local108++) {
					Static58.method990(local108 + arg0, local11, 0, arg5, local98, arg1, local104 + arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!vb;I)V")
	public static void method1461(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2_Sub2_Sub4 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		@Pc(12) int local12 = Static84.anInt1978 + Static67.anInt1669 & 0x7FF;
		@Pc(20) int local20 = arg2 * arg2 + arg0 * arg0;
		if (local20 > 6400) {
			return;
		}
		@Pc(35) int local35 = Static71.anIntArray402[local12];
		@Pc(43) int local43 = local35 * 256 / (Static15.anInt1857 + 256);
		@Pc(47) int local47 = Static71.anIntArray386[local12];
		@Pc(55) int local55 = local47 * 256 / (Static15.anInt1857 + 256);
		@Pc(66) int local66 = arg2 * local43 - arg0 * local55 >> 16;
		@Pc(76) int local76 = arg2 * local55 + arg0 * local43 >> 16;
		if (local20 <= 2500) {
			arg1.method1624(local76 + 94 + 4 - arg1.anInt2445 / 2, -local66 + -4 + (83 - arg1.anInt2443 / 2));
		} else {
			arg1.method1622(Static17.aClass2_Sub2_Sub2_Sub3_6, local76 + 4 + 94 - arg1.anInt2445 / 2, -(arg1.anInt2443 / 2) + -4 + 83 + -local66);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public static void method1464() {
		aClass47_18 = null;
		aClass40_609 = null;
		aClass40_611 = null;
		aClass40_610 = null;
		aClass47_20 = null;
		aClass47_17 = null;
		aClass2_Sub2_Sub9_1 = null;
		aClass40_608 = null;
		aClass47_19 = null;
	}
}
