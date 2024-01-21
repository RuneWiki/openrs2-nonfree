import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "[Lclient!bg;")
	public static Class1_Sub2_Sub1_Sub4[] aClass1_Sub2_Sub1_Sub4Array9;

	@OriginalMember(owner = "client!ka", name = "X", descriptor = "Lclient!hf;")
	public static Class32 aClass32_5;

	@OriginalMember(owner = "client!ka", name = "hb", descriptor = "[I")
	public static int[] anIntArray240;

	@OriginalMember(owner = "client!ka", name = "Q", descriptor = "Lclient!dd;")
	private static Class13 aClass13_818 = Static161.method2971("Location");

	@OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
	public static volatile int anInt2471 = 0;

	@OriginalMember(owner = "client!ka", name = "T", descriptor = "Lclient!dd;")
	public static Class13 aClass13_819 = Static161.method2971("<img=1>");

	@OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
	public static int anInt2472 = -1;

	@OriginalMember(owner = "client!ka", name = "Z", descriptor = "Lclient!dd;")
	public static Class13 aClass13_820 = Static161.method2971("");

	@OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
	public static int anInt2478 = 0;

	@OriginalMember(owner = "client!ka", name = "eb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_821 = aClass13_818;

	@OriginalMember(owner = "client!ka", name = "jb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_823 = Static161.method2971("Please contact customer support)3");

	@OriginalMember(owner = "client!ka", name = "fb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_822 = aClass13_823;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)V")
	public static void method1846() {
		aClass13_820 = null;
		aClass13_823 = null;
		aClass1_Sub2_Sub1_Sub4Array9 = null;
		aClass13_819 = null;
		anIntArray240 = null;
		aClass13_822 = null;
		aClass32_5 = null;
		aClass13_821 = null;
		aClass13_818 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[Lclient!fd;)V")
	public static void method1847(@OriginalArg(0) int arg0, @OriginalArg(2) Class20[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class20 local9 = arg1[local3];
			if (local9 != null && arg0 == local9.anInt1623 && (!local9.aBoolean118 || !Static180.method2980(local9))) {
				if (local9.anInt1619 == 0) {
					if (!local9.aBoolean118 && Static180.method2980(local9) && Static120.aClass20_9 != local9) {
						continue;
					}
					method1847(local9.anInt1630, arg1);
					if (local9.aClass20Array1 != null) {
						method1847(local9.anInt1630, local9.aClass20Array1);
					}
					@Pc(57) Class1_Sub22 local57 = (Class1_Sub22) Static18.aClass45_3.method1988((long) local9.anInt1630);
					if (local57 != null) {
						Static43.method1143(local57.anInt3978);
					}
				}
				if (local9.anInt1619 == 6) {
					@Pc(86) int local86;
					if (local9.anInt1588 != -1 || local9.anInt1610 != -1) {
						@Pc(81) boolean local81 = Static163.method2800(local9);
						if (local81) {
							local86 = local9.anInt1610;
						} else {
							local86 = local9.anInt1588;
						}
						if (local86 != -1) {
							@Pc(99) Class1_Sub2_Sub8 local99 = Static142.method2538(local86);
							if (local99 != null) {
								local9.anInt1580 += Static117.anInt3116;
								while (local9.anInt1580 > local99.anIntArray155[local9.anInt1553]) {
									local9.anInt1580 -= local99.anIntArray155[local9.anInt1553];
									local9.anInt1553++;
									if (local9.anInt1553 >= local99.anIntArray157.length) {
										local9.anInt1553 -= local99.anInt1520;
										if (local9.anInt1553 < 0 || local9.anInt1553 >= local99.anIntArray157.length) {
											local9.anInt1553 = 0;
										}
									}
									Static125.method2300(local9);
								}
							}
						}
					}
					if (local9.anInt1614 != 0 && !local9.aBoolean118) {
						@Pc(178) int local178 = local9.anInt1614 >> 16;
						@Pc(182) int local182 = local178 * Static117.anInt3116;
						local86 = local9.anInt1614 << 16 >> 16;
						local86 *= Static117.anInt3116;
						local9.anInt1600 = local9.anInt1600 + local86 & 0x7FF;
						local9.anInt1589 = local9.anInt1589 + local182 & 0x7FF;
						Static125.method2300(local9);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIB)V")
	public static void method1848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(11) int local11 = arg0; local11 <= arg3 + arg0; local11++) {
			for (@Pc(15) int local15 = arg2; local15 <= arg2 + arg1; local15++) {
				if (local15 >= 0 && local15 < 104 && local11 >= 0 && local11 < 104) {
					Static81.aByteArrayArrayArray27[0][local15][local11] = 127;
					if (arg2 == local15 && local15 > 0) {
						Static183.anIntArrayArrayArray8[0][local15][local11] = Static183.anIntArrayArrayArray8[0][local15 - 1][local11];
					}
					if (local15 == arg2 + arg1 && local15 < 103) {
						Static183.anIntArrayArrayArray8[0][local15][local11] = Static183.anIntArrayArrayArray8[0][local15 + 1][local11];
					}
					if (arg0 == local11 && local11 > 0) {
						Static183.anIntArrayArrayArray8[0][local15][local11] = Static183.anIntArrayArrayArray8[0][local15][local11 - 1];
					}
					if (local11 == arg3 + arg0 && local11 < 103) {
						Static183.anIntArrayArrayArray8[0][local15][local11] = Static183.anIntArrayArrayArray8[0][local15][local11 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ag;I)V")
	public static void method1849(@OriginalArg(0) Class4 arg0) {
		Static88.aClass4_59 = arg0;
	}
}
