import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
	public static int anInt6483 = 0;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
	public static final int anInt6484 = 52;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BB)C")
	public static char method5199(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(46) char local46 = Static292.aCharArray3[local7 - 128];
			if (local46 == '\u0000') {
				local46 = '?';
			}
			local7 = local46;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!eq;Z)Z")
	public static boolean method5201(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static452.aClass139Array3 == Static397.aClass139Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5185();
		if (arg0.aShort103 < 0 || arg0.aShort101 < 0 || arg0.aShort100 >= Static174.anInt2873 || arg0.aShort102 >= Static325.anInt5351) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort103; local34 <= arg0.aShort100; local34++) {
			for (local38 = arg0.aShort101; local38 <= arg0.aShort102; local38++) {
				@Pc(45) Class216 local45 = Static161.method2122(arg0.aByte90, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort103) {
						local49++;
					}
					if (local34 < arg0.aShort100) {
						local49 += 4;
					}
					if (local38 > arg0.aShort101) {
						local49 += 8;
					}
					if (local38 < arg0.aShort102) {
						local49 += 2;
					}
					@Pc(74) Class259 local74 = Static39.method535(local49, arg0);
					@Pc(77) Class259 local77 = local45.aClass259_1;
					if (local77 == null) {
						local45.aClass259_1 = local74;
					} else {
						while (local77.aClass259_4 != null) {
							local77 = local77.aClass259_4;
						}
						local77.aClass259_4 = local74;
					}
					local45.aByte83 = (byte) (local45.aByte83 | local49);
					if (local6 && (Static105.anIntArrayArray18[local34][local38] & 0xFF000000) != 0) {
						local8 = Static105.anIntArrayArray18[local34][local38];
						local10 = Static425.aShortArrayArray9[local34][local38];
						local12 = Static240.aByteArrayArray81[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort103; local38 <= arg0.aShort100; local38++) {
				for (@Pc(150) int local150 = arg0.aShort101; local150 <= arg0.aShort102; local150++) {
					if ((Static105.anIntArrayArray18[local38][local150] & 0xFF000000) == 0) {
						Static105.anIntArrayArray18[local38][local150] = local8;
						Static425.aShortArrayArray9[local38][local150] = local10;
						Static240.aByteArrayArray81[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static56.aClass11_Sub1Array1[Static24.anInt352++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Z")
	public static boolean method5202(@OriginalArg(1) int arg0) {
		if (Static411.aBooleanArray144[arg0]) {
			return true;
		} else if (Static164.aClass185_110.method4021(arg0)) {
			@Pc(23) int local23 = Static164.aClass185_110.method4011(arg0);
			if (local23 == 0) {
				Static411.aBooleanArray144[arg0] = true;
				return true;
			}
			if (Static45.aClass107ArrayArray1[arg0] == null) {
				Static45.aClass107ArrayArray1[arg0] = new Class107[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static45.aClass107ArrayArray1[arg0][local45] == null) {
					@Pc(64) byte[] local64 = Static164.aClass185_110.method4002(arg0, local45);
					if (local64 != null) {
						@Pc(76) Class107 local76 = Static45.aClass107ArrayArray1[arg0][local45] = new Class107();
						local76.anInt2660 = local45 + (arg0 << 16);
						if (local64[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local76.method2118(new Class1_Sub19(local64));
					}
				}
			}
			Static411.aBooleanArray144[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!dh;)Ljava/lang/String;")
	public static String method5204(@OriginalArg(1) Class1_Sub10 arg0) {
		return arg0.aString9 == null || arg0.aString9.length() <= 0 ? arg0.aString10 : arg0.aString10 + Static343.aClass142_85.method3118(Static63.anInt981) + arg0.aString9;
	}
}
