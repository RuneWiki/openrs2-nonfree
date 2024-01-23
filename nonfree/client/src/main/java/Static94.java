import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!h", name = "k", descriptor = "I")
	public static int anInt6155;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "S")
	public static short aShort50 = 1;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "[I")
	public static int[] anIntArray609 = new int[2];

	@OriginalMember(owner = "client!h", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString198 = "Loaded fonts";

	@OriginalMember(owner = "client!h", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray139 = new byte[50][];

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V")
	public static void method4769() {
		Static80.aClass155_12.method4364(5);
		Static146.aClass155_29.method4364(5);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIIII)V")
	public static void method4772(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub14 local7 = Static132.aClass1_Sub14ArrayArrayArray2[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class94 local13 = local7.aClass94_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt3556;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class20 local58 = local7.aClass20_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt474;
		@Pc(67) int local67 = local58.anInt475;
		@Pc(70) int local70 = local58.anInt473;
		@Pc(73) int local73 = local58.anInt476;
		@Pc(77) int[] local77 = Static175.anIntArrayArray27[local23];
		@Pc(81) int[] local81 = Static86.anIntArrayArray16[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method4774(@OriginalArg(1) String arg0) {
		@Pc(3) long local3 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local3 *= 37L;
			@Pc(28) char local28 = arg0.charAt(local17);
			if (local28 >= 'A' && local28 <= 'Z') {
				local3 += local28 - 64;
			} else if (local28 >= 'a' && local28 <= 'z') {
				local3 += local28 + 1 - 97;
			} else if (local28 >= '0' && local28 <= '9') {
				local3 += local28 - 21;
			}
			if (local3 >= 177917621779460413L) {
				break;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method4775() {
		Static133.aBoolean152 = true;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
	public static void method4777() {
		for (@Pc(7) int local7 = 0; local7 < Static147.anInt3493; local7++) {
			@Pc(22) int local22 = Static65.anIntArray25[local7];
			@Pc(26) Class25_Sub1_Sub2 local26 = Static27.aClass25_Sub1_Sub2Array1[local22];
			if (local26 != null) {
				Static161.method3008(local26.aClass143_1.anInt5188, local26);
			}
		}
	}
}
