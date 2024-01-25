import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
	public static int anInt2018;

	@OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
	public static int anInt2025;

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_55 = new Class363(28, 3);

	@OriginalMember(owner = "client!dk", name = "s", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_56 = new Class363(42, 12);

	@OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
	public static int anInt2023 = 0;

	@OriginalMember(owner = "client!dk", name = "B", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_57 = new Class363(110, 3);

	@OriginalMember(owner = "client!dk", name = "K", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_58 = new Class363(95, -2);

	@OriginalMember(owner = "client!dk", name = "P", descriptor = "Lclient!wea;")
	public static final Class357 aClass357_2 = new Class357(1, 2);

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!qi;Lclient!ks;II)V")
	public static void method1472(@OriginalArg(1) Class6_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) Class2_Sub15_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(21) int local21;
		if ((arg2 & 0x20000) != 0) {
			local13 = Static412.anInt575;
			local17 = arg1.method4328();
			local21 = arg1.method4338();
			arg0.method6157(local13, local21, local17);
		}
		if ((arg2 & 0x2) != 0) {
			local13 = arg1.method4306();
			if (local13 == 65535) {
				local13 = -1;
			}
			arg0.anInt7339 = local13;
		}
		if ((arg2 & 0x100) != 0) {
			arg0.aString65 = arg1.method4324();
			if (arg0.aString65.charAt(0) == '~') {
				arg0.aString65 = arg0.aString65.substring(1);
				Static375.method5567(arg0.aString66, arg0.aString65, 2, arg0.method6178(), 0, arg0.method6174());
			} else if (arg0 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2) {
				Static375.method5567(arg0.aString66, arg0.aString65, 2, arg0.method6178(), 0, arg0.method6174());
			}
			arg0.anInt7359 = 0;
			arg0.anInt7413 = 0;
			arg0.anInt7344 = 150;
		}
		if ((arg2 & 0x1000) != 0) {
			local13 = arg1.method4294();
			if (local13 == 65535) {
				local13 = -1;
			}
			local17 = arg1.method4310();
			local21 = arg1.method4325();
			arg0.method6159(local17, local13, local21, true);
		}
		if ((arg2 & 0x8) != 0) {
			local13 = arg1.method4322();
			@Pc(155) byte[] local155 = new byte[local13];
			@Pc(160) Class2_Sub15 local160 = new Class2_Sub15(local155);
			arg1.method4295(local155, local13);
			Static566.aClass2_Sub15Array1[arg3] = local160;
			arg0.method6180(local160);
		}
		if ((arg2 & 0x2000) != 0) {
			arg0.aBoolean575 = arg1.method4338() == 1;
		}
		if ((arg2 & 0x10) != 0) {
			local13 = arg1.method4328();
			local17 = arg1.method4338();
			arg0.method6157(Static412.anInt575, local17, local13);
			arg0.anInt7410 = Static412.anInt575 + 300;
			arg0.anInt7375 = arg1.method4325();
		}
		if ((arg2 & 0x8000) != 0) {
			local13 = arg1.method4338();
			@Pc(235) int[] local235 = new int[local13];
			@Pc(238) int[] local238 = new int[local13];
			@Pc(241) int[] local241 = new int[local13];
			for (@Pc(243) int local243 = 0; local243 < local13; local243++) {
				@Pc(249) int local249 = arg1.method4306();
				if (local249 == 65535) {
					local249 = -1;
				}
				local235[local243] = local249;
				local238[local243] = arg1.method4325();
				local241[local243] = arg1.method4306();
			}
			Static368.method5482(local235, local241, arg0, local238);
		}
		if ((arg2 & 0x200) != 0) {
			arg0.anInt7340 = arg1.method4319();
			arg0.anInt7397 = arg1.method4319();
			arg0.anInt7390 = arg1.method4319();
			arg0.anInt7374 = arg1.method4319();
			arg0.anInt7415 = arg1.method4291() + Static412.anInt575;
			arg0.anInt7353 = arg1.method4294() + Static412.anInt575;
			arg0.anInt7367 = arg1.method4338();
			arg0.anInt7423 = 0;
			if (arg0.aBoolean574) {
				arg0.anInt7424 = 0;
				arg0.anInt7340 += arg0.anInt7439;
				arg0.anInt7397 += arg0.anInt7445;
				arg0.anInt7390 += arg0.anInt7439;
				arg0.anInt7374 += arg0.anInt7445;
			} else {
				arg0.anInt7424 = 1;
				arg0.anInt7374 += arg0.anIntArray509[0];
				arg0.anInt7397 += arg0.anIntArray509[0];
				arg0.anInt7390 += arg0.anIntArray510[0];
				arg0.anInt7340 += arg0.anIntArray510[0];
			}
		}
		if ((arg2 & 0x4) != 0) {
			arg0.anInt7434 = arg1.method4343();
			if (arg0.anInt7424 == 0) {
				arg0.method6163(arg0.anInt7434);
				arg0.anInt7434 = -1;
			}
		}
		if ((arg2 & 0x10000) != 0) {
			arg0.aByte98 = arg1.method4344();
			arg0.aByte99 = arg1.method4344();
			arg0.aByte100 = arg1.method4304();
			arg0.aByte101 = (byte) arg1.method4325();
			arg0.anInt7417 = Static412.anInt575 + arg1.method4291();
			arg0.anInt7373 = Static412.anInt575 + arg1.method4291();
		}
		if ((arg2 & 0x4000) != 0) {
			local13 = arg1.method4291();
			arg0.anInt7395 = arg1.method4338();
			arg0.anInt7357 = arg1.method4325();
			arg0.anInt7392 = local13 & 0x7FFF;
			arg0.aBoolean571 = (local13 & 0x8000) != 0;
			arg0.anInt7351 = Static412.anInt575 + arg0.anInt7392 + arg0.anInt7395;
		}
		if ((arg2 & 0x20) != 0) {
			@Pc(521) int[] local521 = new int[4];
			for (local17 = 0; local17 < 4; local17++) {
				local521[local17] = arg1.method4291();
				if (local521[local17] == 65535) {
					local521[local17] = -1;
				}
			}
			local21 = arg1.method4338();
			Static316.method4922(local21, local521, arg0);
		}
		if ((arg2 & 0x80) != 0) {
			Static195.aByteArray43[arg3] = arg1.method4319();
		}
		if ((arg2 & 0x1) != 0) {
			local13 = arg1.method4306();
			if (local13 == 65535) {
				local13 = -1;
			}
			local17 = arg1.method4310();
			local21 = arg1.method4322();
			arg0.method6159(local17, local13, local21, false);
		}
		if ((arg2 & 0x800) != 0) {
			local7 = arg1.method4319();
		}
		if (!arg0.aBoolean574) {
			return;
		}
		if (local7 == 127) {
			arg0.method6182(arg0.anInt7439, arg0.anInt7445);
			return;
		}
		@Pc(628) byte local628;
		if (local7 == -1) {
			local628 = Static195.aByteArray43[arg3];
		} else {
			local628 = local7;
		}
		arg0.method6173(local628, arg0.anInt7445, arg0.anInt7439);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)I")
	public static int method1474(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local24 >> 12) + 40960;
		return local32 * local13 >> 12;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1480(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(24) String local24 = Static281.method4201(arg0);
		if (local24 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static81.anInt1768; local29++) {
			@Pc(35) String local35 = Static360.aStringArray115[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static281.method4201(local35);
			if (local35 != null && local35.equals(local24)) {
				Static81.anInt1768--;
				for (@Pc(59) int local59 = local29; local59 < Static81.anInt1768; local59++) {
					Static360.aStringArray115[local59] = Static360.aStringArray115[local59 + 1];
					Static461.aStringArray144[local59] = Static461.aStringArray144[local59 + 1];
					Static323.aStringArray99[local59] = Static323.aStringArray99[local59 + 1];
					Static408.aStringArray133[local59] = Static408.aStringArray133[local59 + 1];
					Static128.aBooleanArray12[local59] = Static128.aBooleanArray12[local59 + 1];
				}
				Static455.anInt7881 = Static500.anInt8403;
				@Pc(120) Class2_Sub42 local120 = Static249.method3910(Static47.aClass286_16, Static400.aClass145_2);
				local120.aClass2_Sub15_Sub2_2.method4333(Static71.method1162(arg0));
				local120.aClass2_Sub15_Sub2_2.method4313(arg0);
				Static531.method7296(local120);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Z")
	public static boolean method1481(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}
}
