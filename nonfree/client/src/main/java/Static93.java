import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "[I")
	public static int[] anIntArray139;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString56 = "";

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
	public static int anInt1804 = -1;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "Lclient!ub;")
	public static final Class240 aClass240_2 = new Class240("", 11);

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "[I")
	public static final int[] anIntArray140 = new int[8];

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_46 = new Class211(40, 0);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	public static void method1468() {
		Static419.method5306(Static2.aClass148_Sub1_1.anInt3776);
		@Pc(17) int local17 = (Static275.anInt4506 >> 3) + (Static174.anInt3028 >> 10);
		@Pc(33) int local33 = (Static209.anInt3497 >> 3) + (Static143.anInt2544 >> 10);
		Static61.anInt1129 = Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91 = 0;
		Static60.aClass3_Sub4_Sub1_Sub2_1.method4020(8, 8);
		Static228.aByteArrayArray31 = new byte[18][];
		Static403.aByteArrayArray56 = new byte[18][];
		Static193.anIntArray266 = new int[18];
		Static378.aByteArrayArray51 = new byte[18][];
		Static98.aByteArrayArray12 = new byte[18][];
		Static388.anIntArray415 = new int[18];
		Static278.anIntArrayArray33 = new int[18][4];
		Static142.aByteArrayArray19 = new byte[18][];
		Static319.anIntArray478 = new int[18];
		Static225.anIntArray310 = new int[18];
		Static27.anIntArray188 = new int[18];
		Static128.anIntArray181 = new int[18];
		@Pc(84) int local84 = 0;
		@Pc(104) int local104;
		for (@Pc(93) int local93 = (local17 - (Static166.anInt2852 >> 4)) / 8; local93 <= (local17 + (Static166.anInt2852 >> 4)) / 8; local93++) {
			for (local104 = (local33 - (Static426.anInt6923 >> 4)) / 8; local104 <= (local33 + (Static426.anInt6923 >> 4)) / 8; local104++) {
				@Pc(112) int local112 = local104 + (local93 << 8);
				Static225.anIntArray310[local84] = local112;
				Static128.anIntArray181[local84] = Static309.aClass54_84.method1102("m" + local93 + "_" + local104);
				Static193.anIntArray266[local84] = Static309.aClass54_84.method1102("l" + local93 + "_" + local104);
				Static27.anIntArray188[local84] = Static309.aClass54_84.method1102("n" + local93 + "_" + local104);
				Static388.anIntArray415[local84] = Static309.aClass54_84.method1102("um" + local93 + "_" + local104);
				Static319.anIntArray478[local84] = Static309.aClass54_84.method1102("ul" + local93 + "_" + local104);
				if (Static27.anIntArray188[local84] == -1) {
					Static128.anIntArray181[local84] = -1;
					Static193.anIntArray266[local84] = -1;
					Static388.anIntArray415[local84] = -1;
					Static319.anIntArray478[local84] = -1;
				}
				local84++;
			}
		}
		for (local104 = local84; local104 < Static27.anIntArray188.length; local104++) {
			Static27.anIntArray188[local104] = -1;
			Static128.anIntArray181[local104] = -1;
			Static193.anIntArray266[local104] = -1;
			Static388.anIntArray415[local104] = -1;
			Static319.anIntArray478[local104] = -1;
		}
		@Pc(291) byte local291;
		if (Static290.anInt4777 == 1 || Static290.anInt4777 == 2) {
			local291 = 3;
		} else {
			local291 = 7;
		}
		Static359.method4735(local291, local17, false, local33);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public static void method1469() {
		Static336.aClass140_1.method5399();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static387.aLongArray11[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static360.aLongArray9[local24] = 0L;
		}
		Static319.anInt5486 = 0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIBILclient!pm;)V")
	public static void method1470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class192 arg3) {
		for (@Pc(15) Class2_Sub35 local15 = (Class2_Sub35) Static111.aClass156_12.method3155(); local15 != null; local15 = (Class2_Sub35) Static111.aClass156_12.method3150()) {
			if (local15.anInt4561 == arg0 && local15.anInt4556 == arg2 << 7 && local15.anInt4565 == arg1 << 7 && local15.aClass192_1.anInt5325 == arg3.anInt5325) {
				if (local15.aClass2_Sub1_Sub3_3 != null) {
					Static421.aClass2_Sub1_Sub4_2.method3237(local15.aClass2_Sub1_Sub3_3);
					local15.aClass2_Sub1_Sub3_3 = null;
				}
				if (local15.aClass2_Sub1_Sub3_4 != null) {
					Static421.aClass2_Sub1_Sub4_2.method3237(local15.aClass2_Sub1_Sub3_4);
					local15.aClass2_Sub1_Sub3_4 = null;
				}
				local15.method5703();
				return;
			}
		}
	}
}
