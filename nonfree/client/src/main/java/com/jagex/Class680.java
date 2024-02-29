package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yx")
public class Class680 {

	@OriginalMember(owner = "client!yx", name = "l", descriptor = "Lclient!aaz;")
	public static Class25 aClass25_8;

	@OriginalMember(owner = "client!yx", name = "p", descriptor = "[C")
	static final char[] aCharArray8 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!yx", name = "<init>", descriptor = "()V", line = 6)
	Class680() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!yx", name = "q", descriptor = "(C)B", line = 12)
	public static byte method36061(@OriginalArg(0) char arg0) {
		@Pc(13) byte local13;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local13 = (byte) arg0;
		} else if (arg0 == '€') {
			local13 = -128;
		} else if (arg0 == '‚') {
			local13 = -126;
		} else if (arg0 == 'ƒ') {
			local13 = -125;
		} else if (arg0 == '„') {
			local13 = -124;
		} else if (arg0 == '…') {
			local13 = -123;
		} else if (arg0 == '†') {
			local13 = -122;
		} else if (arg0 == '‡') {
			local13 = -121;
		} else if (arg0 == 'ˆ') {
			local13 = -120;
		} else if (arg0 == '‰') {
			local13 = -119;
		} else if (arg0 == 'Š') {
			local13 = -118;
		} else if (arg0 == '‹') {
			local13 = -117;
		} else if (arg0 == 'Œ') {
			local13 = -116;
		} else if (arg0 == 'Ž') {
			local13 = -114;
		} else if (arg0 == '‘') {
			local13 = -111;
		} else if (arg0 == '’') {
			local13 = -110;
		} else if (arg0 == '“') {
			local13 = -109;
		} else if (arg0 == '”') {
			local13 = -108;
		} else if (arg0 == '•') {
			local13 = -107;
		} else if (arg0 == '–') {
			local13 = -106;
		} else if (arg0 == '—') {
			local13 = -105;
		} else if (arg0 == '˜') {
			local13 = -104;
		} else if (arg0 == '™') {
			local13 = -103;
		} else if (arg0 == 'š') {
			local13 = -102;
		} else if (arg0 == '›') {
			local13 = -101;
		} else if (arg0 == 'œ') {
			local13 = -100;
		} else if (arg0 == 'ž') {
			local13 = -98;
		} else if (arg0 == 'Ÿ') {
			local13 = -97;
		} else {
			local13 = 63;
		}
		return local13;
	}

	@OriginalMember(owner = "client!yx", name = "d", descriptor = "(C)Z", line = 45)
	public static boolean method36062(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(17) char[] local17 = aCharArray8;
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				@Pc(27) char local27 = local17[local19];
				if (arg0 == local27) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!yx", name = "x", descriptor = "(C)Z", line = 45)
	public static boolean method36063(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(17) char[] local17 = aCharArray8;
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				@Pc(27) char local27 = local17[local19];
				if (arg0 == local27) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!yx", name = "s", descriptor = "(B)C", line = 61)
	public static char method36064(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = arg0 & 0xFF;
		if (local3 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(local3, 16));
		}
		if (local3 >= 128 && local3 < 160) {
			@Pc(31) char local31 = aCharArray8[local3 - 128];
			if (local31 == '\u0000') {
				local31 = '?';
			}
			local3 = local31;
		}
		return (char) local3;
	}

	@OriginalMember(owner = "client!yx", name = "r", descriptor = "(B)C", line = 61)
	public static char method36065(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = arg0 & 0xFF;
		if (local3 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(local3, 16));
		}
		if (local3 >= 128 && local3 < 160) {
			@Pc(31) char local31 = aCharArray8[local3 - 128];
			if (local31 == '\u0000') {
				local31 = '?';
			}
			local3 = local31;
		}
		return (char) local3;
	}

	@OriginalMember(owner = "client!yx", name = "g", descriptor = "(B)C", line = 61)
	public static char method36066(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = arg0 & 0xFF;
		if (local3 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(local3, 16));
		}
		if (local3 >= 128 && local3 < 160) {
			@Pc(31) char local31 = aCharArray8[local3 - 128];
			if (local31 == '\u0000') {
				local31 = '?';
			}
			local3 = local31;
		}
		return (char) local3;
	}

	@OriginalMember(owner = "client!yx", name = "l", descriptor = "(Lclient!akv;B)V", line = 66)
	static void method36067(@OriginalArg(0) Class77_Sub39 arg0) {
		for (@Pc(1) int local1 = 0; local1 < Class544.anInt5212 * 1699576543; local1++) {
			@Pc(10) int local10 = arg0.method22537();
			@Pc(14) int local14 = arg0.method22483();
			if (local14 == 65535) {
				local14 = -1;
			}
			if (Class616.aClass145_Sub1Array2[local10] != null) {
				Class616.aClass145_Sub1Array2[local10].anInt2059 = local14 * 734920847;
			}
		}
	}

	@OriginalMember(owner = "client!yx", name = "z", descriptor = "(Ljava/lang/CharSequence;II[BI)I", line = 110)
	public static int method36068(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg2 - arg1;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(14) char local14 = arg0.charAt(arg1 + local5);
			if (local14 > '\u0000' && local14 < '\u0080' || !(local14 < ' ' || local14 > 'ÿ')) {
				arg3[arg4 + local5] = (byte) local14;
			} else if (local14 == '€') {
				arg3[arg4 + local5] = -128;
			} else if (local14 == '‚') {
				arg3[local5 + arg4] = -126;
			} else if (local14 == 'ƒ') {
				arg3[arg4 + local5] = -125;
			} else if (local14 == '„') {
				arg3[local5 + arg4] = -124;
			} else if (local14 == '…') {
				arg3[local5 + arg4] = -123;
			} else if (local14 == '†') {
				arg3[arg4 + local5] = -122;
			} else if (local14 == '‡') {
				arg3[arg4 + local5] = -121;
			} else if (local14 == 'ˆ') {
				arg3[local5 + arg4] = -120;
			} else if (local14 == '‰') {
				arg3[local5 + arg4] = -119;
			} else if (local14 == 'Š') {
				arg3[arg4 + local5] = -118;
			} else if (local14 == '‹') {
				arg3[local5 + arg4] = -117;
			} else if (local14 == 'Œ') {
				arg3[local5 + arg4] = -116;
			} else if (local14 == 'Ž') {
				arg3[arg4 + local5] = -114;
			} else if (local14 == '‘') {
				arg3[local5 + arg4] = -111;
			} else if (local14 == '’') {
				arg3[local5 + arg4] = -110;
			} else if (local14 == '“') {
				arg3[local5 + arg4] = -109;
			} else if (local14 == '”') {
				arg3[local5 + arg4] = -108;
			} else if (local14 == '•') {
				arg3[arg4 + local5] = -107;
			} else if (local14 == '–') {
				arg3[arg4 + local5] = -106;
			} else if (local14 == '—') {
				arg3[local5 + arg4] = -105;
			} else if (local14 == '˜') {
				arg3[arg4 + local5] = -104;
			} else if (local14 == '™') {
				arg3[local5 + arg4] = -103;
			} else if (local14 == 'š') {
				arg3[arg4 + local5] = -102;
			} else if (local14 == '›') {
				arg3[local5 + arg4] = -101;
			} else if (local14 == 'œ') {
				arg3[arg4 + local5] = -100;
			} else if (local14 == 'ž') {
				arg3[local5 + arg4] = -98;
			} else if (local14 == 'Ÿ') {
				arg3[local5 + arg4] = -97;
			} else {
				arg3[arg4 + local5] = 63;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!yx", name = "j", descriptor = "([BII)Ljava/lang/String;", line = 151)
	public static String method36069(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) char[] local2 = new char[arg2];
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = arg0[local6 + arg1] & 0xFF;
			if (local17 != 0) {
				if (local17 >= 128 && local17 < 160) {
					@Pc(32) char local32 = aCharArray8[local17 - 128];
					if (local32 == '\u0000') {
						local32 = '?';
					}
					local17 = local32;
				}
				local2[local4++] = (char) local17;
			}
		}
		return new String(local2, 0, local4);
	}

	@OriginalMember(owner = "client!yx", name = "g", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I", line = 161)
	public static int method36070(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg1.length();
		if (local2 == 0) {
			return local5;
		} else if (local5 == 0) {
			return local2;
		} else {
			@Pc(20) int[] local20 = new int[local2 + 1];
			@Pc(25) int[] local25 = new int[local2 + 1];
			@Pc(27) int local27 = 0;
			while (local27 <= local2) {
				local20[local27] = local27++;
			}
			for (local27 = 1; local27 <= local5; local27++) {
				local25[0] = local27;
				@Pc(51) char local51 = arg1.charAt(local27 - 1);
				for (@Pc(53) int local53 = 1; local53 <= local2; local53++) {
					local25[local53] = Math.min(Math.min(local25[local53 - 1] + 1, local20[local53] + 1), local20[local53 - 1] + (arg0.charAt(local53 - 1) == local51 ? 0 : 1));
				}
				@Pc(93) int[] local93 = local20;
				local20 = local25;
				local25 = local93;
			}
			return local20[local2];
		}
	}

	@OriginalMember(owner = "client!yx", name = "ain", descriptor = "(Lclient!yf;I)V", line = 11006)
	static final void method36071(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		if (Class706.aBoolean868) {
			Class196.method25463(3, local13, local23, false);
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class184.aFrame1 == null ? 0 : 1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}
}
