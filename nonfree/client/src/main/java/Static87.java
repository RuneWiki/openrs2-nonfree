import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!je", name = "e", descriptor = "[I")
	public static int[] anIntArray241;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)I")
	public static int method1467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 >>> 31;
		return (arg1 + local11) / arg0 - local11;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method1468() {
		Static205.aClass87_74.method3061();
		Static63.aClass67_2.method2568();
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	public static void method1469() {
		for (@Pc(11) Class1_Sub5 local11 = (Class1_Sub5) Static131.aClass91_13.method3148(); local11 != null; local11 = (Class1_Sub5) Static131.aClass91_13.method3150()) {
			if (local11.aClass1_Sub6_Sub3_1 != null) {
				Static93.aClass1_Sub6_Sub1_1.method2000(local11.aClass1_Sub6_Sub3_1);
				local11.aClass1_Sub6_Sub3_1 = null;
			}
			if (local11.aClass1_Sub6_Sub3_2 != null) {
				Static93.aClass1_Sub6_Sub1_1.method2000(local11.aClass1_Sub6_Sub3_2);
				local11.aClass1_Sub6_Sub3_2 = null;
			}
		}
		Static131.aClass91_13.method3147();
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(III)I")
	public static int method1471(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) long local18 = (long) ((arg0 << 16) + arg1);
		return Static82.aClass1_Sub2_Sub21_1 != null && Static82.aClass1_Sub2_Sub21_1.aLong150 == local18 ? Static108.aClass1_Sub14_2.anInt2306 * 99 / (Static108.aClass1_Sub14_2.aByteArray29.length - Static82.aClass1_Sub2_Sub21_1.aByte9) + 1 : 0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!da;Lclient!wa;I)V")
	public static void method1472(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class1_Sub14 arg2) {
		@Pc(7) Class1_Sub4 local7 = new Class1_Sub4();
		local7.anInt458 = arg2.method1738();
		local7.anInt459 = arg2.method1700();
		local7.anIntArray49 = new int[local7.anInt458];
		local7.anIntArray51 = new int[local7.anInt458];
		local7.anIntArray50 = new int[local7.anInt458];
		local7.aClass34Array1 = new Class34[local7.anInt458];
		local7.aClass34Array2 = new Class34[local7.anInt458];
		local7.aByteArrayArrayArray12 = new byte[local7.anInt458][][];
		for (@Pc(53) int local53 = 0; local53 < local7.anInt458; local53++) {
			try {
				@Pc(58) int local58 = arg2.method1738();
				@Pc(86) String local86;
				@Pc(95) String local95;
				@Pc(99) int local99;
				if (local58 == 0 || local58 == 1 || local58 == 2) {
					local86 = new String(arg2.method1706().method2452());
					local99 = 0;
					local95 = new String(arg2.method1706().method2452());
					if (local58 == 1) {
						local99 = arg2.method1700();
					}
					local7.anIntArray49[local53] = local58;
					local7.anIntArray50[local53] = local99;
					local7.aClass34Array1[local53] = arg1.method623(local95, Static15.method285(local86));
				} else if (local58 == 3 || local58 == 4) {
					local86 = new String(arg2.method1706().method2452());
					local95 = new String(arg2.method1706().method2452());
					local99 = arg2.method1738();
					@Pc(102) String[] local102 = new String[local99];
					for (@Pc(104) int local104 = 0; local104 < local99; local104++) {
						local102[local104] = new String(arg2.method1706().method2452());
					}
					@Pc(127) byte[][] local127 = new byte[local99][];
					@Pc(137) int local137;
					if (local58 == 3) {
						for (@Pc(132) int local132 = 0; local132 < local99; local132++) {
							local137 = arg2.method1700();
							local127[local132] = new byte[local137];
							arg2.method1719(local137, local127[local132]);
						}
					}
					local7.anIntArray49[local53] = local58;
					@Pc(162) Class[] local162 = new Class[local99];
					for (local137 = 0; local137 < local99; local137++) {
						local162[local137] = Static15.method285(local102[local137]);
					}
					local7.aClass34Array2[local53] = arg1.method626(local162, Static15.method285(local86), local95);
					local7.aByteArrayArrayArray12[local53] = local127;
				}
			} catch (@Pc(253) ClassNotFoundException local253) {
				local7.anIntArray51[local53] = -1;
			} catch (@Pc(260) SecurityException local260) {
				local7.anIntArray51[local53] = -2;
			} catch (@Pc(267) NullPointerException local267) {
				local7.anIntArray51[local53] = -3;
			} catch (@Pc(274) Exception local274) {
				local7.anIntArray51[local53] = -4;
			} catch (@Pc(281) Throwable local281) {
				local7.anIntArray51[local53] = -5;
			}
		}
		Static147.aClass91_15.method3151(local7);
	}
}
