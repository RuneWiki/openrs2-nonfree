import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
	public static int anInt2029 = -1;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Lclient!pe;")
	public static Class65 aClass65_849 = Static119.method1462("null");

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
	public static int anInt2030 = 0;

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "Lclient!pe;")
	private static Class65 aClass65_852 = Static119.method1462("Ok");

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "Lclient!pe;")
	public static Class65 aClass65_850 = aClass65_852;

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "Lclient!pe;")
	private static Class65 aClass65_859 = Static119.method1462("yellow:");

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "Lclient!pe;")
	public static Class65 aClass65_851 = aClass65_859;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "Lclient!pe;")
	public static Class65 aClass65_853 = Static119.method1462("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "Lclient!pe;")
	public static Class65 aClass65_854 = aClass65_859;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "Lclient!pe;")
	private static Class65 aClass65_856 = Static119.method1462("red:");

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "Lclient!pe;")
	public static Class65 aClass65_855 = aClass65_856;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "Lclient!pe;")
	public static Class65 aClass65_857 = Static119.method1462("headicons_hint");

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
	public static int anInt2038 = 0;

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "Lclient!pe;")
	public static Class65 aClass65_858 = aClass65_856;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBLclient!be;Lclient!df;)V")
	public static void method1513(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub4 arg1, @OriginalArg(3) Class20 arg2) {
		@Pc(9) Class2_Sub21 local9 = new Class2_Sub21();
		local9.anInt2635 = arg1.method933();
		local9.anInt2638 = arg1.method903();
		local9.aClass15Array2 = new Class15[local9.anInt2635];
		local9.anIntArray348 = new int[local9.anInt2635];
		local9.aByteArrayArrayArray6 = new byte[local9.anInt2635][][];
		local9.aClass15Array1 = new Class15[local9.anInt2635];
		local9.anIntArray349 = new int[local9.anInt2635];
		local9.anIntArray347 = new int[local9.anInt2635];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt2635; local51++) {
			try {
				@Pc(57) int local57 = arg1.method933();
				@Pc(85) String local85;
				@Pc(94) String local94;
				@Pc(98) int local98;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local85 = new String(arg1.method931().method1478());
					local94 = new String(arg1.method931().method1478());
					local98 = 0;
					if (local57 == 1) {
						local98 = arg1.method903();
					}
					local9.anIntArray349[local51] = local57;
					local9.anIntArray347[local51] = local98;
					local9.aClass15Array2[local51] = arg2.method369(Static70.method1231(local85), local94);
				} else if (local57 == 3 || local57 == 4) {
					local85 = new String(arg1.method931().method1478());
					local94 = new String(arg1.method931().method1478());
					local98 = arg1.method933();
					@Pc(101) String[] local101 = new String[local98];
					for (@Pc(103) int local103 = 0; local103 < local98; local103++) {
						local101[local103] = new String(arg1.method931().method1478());
					}
					@Pc(123) byte[][] local123 = new byte[local98][];
					@Pc(134) int local134;
					if (local57 == 3) {
						for (@Pc(128) int local128 = 0; local128 < local98; local128++) {
							local134 = arg1.method903();
							local123[local128] = new byte[local134];
							arg1.method910(local123[local128], local134);
						}
					}
					local9.anIntArray349[local51] = local57;
					@Pc(163) Class[] local163 = new Class[local98];
					for (local134 = 0; local134 < local98; local134++) {
						local163[local134] = Static70.method1231(local101[local134]);
					}
					local9.aClass15Array1[local51] = arg2.method368(local94, Static70.method1231(local85), local163);
					local9.aByteArrayArrayArray6[local51] = local123;
				}
			} catch (@Pc(248) ClassNotFoundException local248) {
				local9.anIntArray348[local51] = -1;
			} catch (@Pc(255) SecurityException local255) {
				local9.anIntArray348[local51] = -2;
			} catch (@Pc(262) NullPointerException local262) {
				local9.anIntArray348[local51] = -3;
			} catch (@Pc(269) Exception local269) {
				local9.anIntArray348[local51] = -4;
			} catch (@Pc(276) Throwable local276) {
				local9.anIntArray348[local51] = -5;
			}
		}
		Static16.aClass13_14.method263(local9);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIILclient!e;II)V")
	public static void method1514(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub4_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) int local19 = arg3 * arg3 + arg4 * arg4;
		if (local19 <= 4225 || local19 >= 90000) {
			Static104.method2062(arg1, arg0, arg4, arg3, arg2);
			return;
		}
		@Pc(43) int local43 = Static117.anInt2576 + Static82.anInt2719 & 0x7FF;
		@Pc(47) int local47 = Class2_Sub1_Sub4_Sub4.anIntArray248[local43];
		@Pc(55) int local55 = local47 * 256 / (Static54.anInt1338 + 256);
		@Pc(59) int local59 = Class2_Sub1_Sub4_Sub4.anIntArray251[local43];
		@Pc(67) int local67 = local59 * 256 / (Static54.anInt1338 + 256);
		@Pc(77) int local77 = local55 * arg3 - local67 * arg4 >> 16;
		@Pc(87) int local87 = arg3 * local67 + arg4 * local55 >> 16;
		@Pc(93) double local93 = Math.atan2((double) local87, (double) local77);
		@Pc(99) int local99 = (int) (Math.sin(local93) * 63.0D);
		@Pc(105) int local105 = (int) (Math.cos(local93) * 57.0D);
		Static5.aClass2_Sub1_Sub4_Sub1_1.method445(arg0 + local99 + 94 + 4 - 10, arg1 + 83 - local105 + -20, local93);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public static void method1515() {
		aClass65_852 = null;
		aClass65_851 = null;
		aClass65_855 = null;
		aClass65_856 = null;
		aClass65_853 = null;
		aClass65_854 = null;
		aClass65_859 = null;
		aClass65_857 = null;
		aClass65_858 = null;
		aClass65_849 = null;
		aClass65_850 = null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	public static void method1516() {
		for (@Pc(11) Class2_Sub1_Sub1_Sub3 local11 = (Class2_Sub1_Sub1_Sub3) Static67.aClass13_10.method270(); local11 != null; local11 = (Class2_Sub1_Sub1_Sub3) Static67.aClass13_10.method273()) {
			if (local11.anInt684 != Static59.anInt1479 || local11.aBoolean28) {
				local11.method2053();
			} else if (Static10.anInt2951 >= local11.anInt686) {
				local11.method577(Static117.anInt2579);
				if (local11.aBoolean28) {
					local11.method2053();
				} else {
					Static124.aClass49_1.method1158(local11.anInt684, local11.anInt697, local11.anInt689, local11.anInt690, 60, local11, 0, -1, false);
				}
			}
		}
	}
}
