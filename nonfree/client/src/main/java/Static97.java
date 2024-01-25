import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "J")
	public static long aLong58;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIIIBI)Z")
	public static boolean method2223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (!Static368.method5737(arg6, arg2, arg7)) {
			return false;
		}
		@Pc(15) int local15 = Static513.anIntArray501[1];
		@Pc(19) int local19 = Static513.anIntArray501[0];
		@Pc(23) int local23 = Static513.anIntArray501[2];
		if (!Static368.method5737(arg0, arg1, arg5)) {
			return false;
		}
		@Pc(35) int local35 = Static513.anIntArray501[0];
		@Pc(44) int local44 = Static513.anIntArray501[2];
		@Pc(48) int local48 = Static513.anIntArray501[1];
		if (Static368.method5737(arg3, arg8, arg4)) {
			@Pc(60) int local60 = Static513.anIntArray501[2];
			@Pc(64) int local64 = Static513.anIntArray501[0];
			@Pc(68) int local68 = Static513.anIntArray501[1];
			return Static65.method1727(local19, local35, local23, local60, local68, local15, local48, local44, local64);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!ha;IILclient!ei;IIIIIIII)V")
	public static void method2224(@OriginalArg(0) Class16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class8_Sub5_Sub6 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg9 > arg5 && arg6 + arg5 > arg9 && arg3 - 13 < arg10 && arg3 + 3 > arg10) {
			arg7 = arg4;
		}
		@Pc(39) String local39 = Static595.method8218(arg2);
		Static206.aClass27_20.method7004(arg7, Static446.anIntArray421, arg3, local39, arg5 + 3, Static99.aClass21Array5);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;IZI[BI)I")
	public static int method2225(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		@Pc(9) int local9 = arg3;
		for (@Pc(16) int local16 = 0; local16 < local9; local16++) {
			@Pc(24) char local24 = arg0.charAt(local16);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				arg2[local16 + arg1] = (byte) local24;
			} else if (local24 == '€') {
				arg2[arg1 + local16] = -128;
			} else if (local24 == '‚') {
				arg2[arg1 + local16] = -126;
			} else if (local24 == 'ƒ') {
				arg2[local16 + arg1] = -125;
			} else if (local24 == '„') {
				arg2[local16 + arg1] = -124;
			} else if (local24 == '…') {
				arg2[local16 + arg1] = -123;
			} else if (local24 == '†') {
				arg2[local16 + arg1] = -122;
			} else if (local24 == '‡') {
				arg2[arg1 + local16] = -121;
			} else if (local24 == 'ˆ') {
				arg2[arg1 + local16] = -120;
			} else if (local24 == '‰') {
				arg2[local16 + arg1] = -119;
			} else if (local24 == 'Š') {
				arg2[arg1 + local16] = -118;
			} else if (local24 == '‹') {
				arg2[local16 + arg1] = -117;
			} else if (local24 == 'Œ') {
				arg2[arg1 + local16] = -116;
			} else if (local24 == 'Ž') {
				arg2[local16 + arg1] = -114;
			} else if (local24 == '‘') {
				arg2[local16 + arg1] = -111;
			} else if (local24 == '’') {
				arg2[arg1 + local16] = -110;
			} else if (local24 == '“') {
				arg2[local16 + arg1] = -109;
			} else if (local24 == '”') {
				arg2[arg1 + local16] = -108;
			} else if (local24 == '•') {
				arg2[local16 + arg1] = -107;
			} else if (local24 == '–') {
				arg2[arg1 + local16] = -106;
			} else if (local24 == '—') {
				arg2[arg1 + local16] = -105;
			} else if (local24 == '˜') {
				arg2[arg1 + local16] = -104;
			} else if (local24 == '™') {
				arg2[arg1 + local16] = -103;
			} else if (local24 == 'š') {
				arg2[arg1 + local16] = -102;
			} else if (local24 == '›') {
				arg2[arg1 + local16] = -101;
			} else if (local24 == 'œ') {
				arg2[arg1 + local16] = -100;
			} else if (local24 == 'ž') {
				arg2[local16 + arg1] = -98;
			} else if (local24 == 'Ÿ') {
				arg2[local16 + arg1] = -97;
			} else {
				arg2[arg1 + local16] = 63;
			}
		}
		return local9;
	}
}
