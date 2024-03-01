package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zo")
public class Class712 {

	@OriginalMember(owner = "client!zo", name = "cl", descriptor = "Ljava/lang/String;")
	static String aString243;

	@OriginalMember(owner = "client!zo", name = "e", descriptor = "[C")
	static final char[] aCharArray8 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!zo", name = "<init>", descriptor = "()V", line = 6)
	Class712() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!zo", name = "z", descriptor = "(C)B", line = 12)
	public static byte method36815(@OriginalArg(0) char arg0) {
		@Pc(13) byte local13;
		if (arg0 > 0 && arg0 < 128 || !(arg0 < 160 || arg0 > 255)) {
			local13 = (byte) arg0;
		} else if (arg0 == 8364) {
			local13 = -128;
		} else if (arg0 == 8218) {
			local13 = -126;
		} else if (arg0 == 402) {
			local13 = -125;
		} else if (arg0 == 8222) {
			local13 = -124;
		} else if (arg0 == 8230) {
			local13 = -123;
		} else if (arg0 == 8224) {
			local13 = -122;
		} else if (arg0 == 8225) {
			local13 = -121;
		} else if (arg0 == 710) {
			local13 = -120;
		} else if (arg0 == 8240) {
			local13 = -119;
		} else if (arg0 == 352) {
			local13 = -118;
		} else if (arg0 == 8249) {
			local13 = -117;
		} else if (arg0 == 338) {
			local13 = -116;
		} else if (arg0 == 381) {
			local13 = -114;
		} else if (arg0 == 8216) {
			local13 = -111;
		} else if (arg0 == 8217) {
			local13 = -110;
		} else if (arg0 == 8220) {
			local13 = -109;
		} else if (arg0 == 8221) {
			local13 = -108;
		} else if (arg0 == 8226) {
			local13 = -107;
		} else if (arg0 == 8211) {
			local13 = -106;
		} else if (arg0 == 8212) {
			local13 = -105;
		} else if (arg0 == 732) {
			local13 = -104;
		} else if (arg0 == 8482) {
			local13 = -103;
		} else if (arg0 == 353) {
			local13 = -102;
		} else if (arg0 == 8250) {
			local13 = -101;
		} else if (arg0 == 339) {
			local13 = -100;
		} else if (arg0 == 382) {
			local13 = -98;
		} else if (arg0 == 376) {
			local13 = -97;
		} else {
			local13 = 63;
		}
		return local13;
	}

	@OriginalMember(owner = "client!zo", name = "p", descriptor = "(C)B", line = 12)
	public static byte method36823(@OriginalArg(0) char arg0) {
		@Pc(13) byte local13;
		if (arg0 > 0 && arg0 < 128 || !(arg0 < 160 || arg0 > 255)) {
			local13 = (byte) arg0;
		} else if (arg0 == 8364) {
			local13 = -128;
		} else if (arg0 == 8218) {
			local13 = -126;
		} else if (arg0 == 402) {
			local13 = -125;
		} else if (arg0 == 8222) {
			local13 = -124;
		} else if (arg0 == 8230) {
			local13 = -123;
		} else if (arg0 == 8224) {
			local13 = -122;
		} else if (arg0 == 8225) {
			local13 = -121;
		} else if (arg0 == 710) {
			local13 = -120;
		} else if (arg0 == 8240) {
			local13 = -119;
		} else if (arg0 == 352) {
			local13 = -118;
		} else if (arg0 == 8249) {
			local13 = -117;
		} else if (arg0 == 338) {
			local13 = -116;
		} else if (arg0 == 381) {
			local13 = -114;
		} else if (arg0 == 8216) {
			local13 = -111;
		} else if (arg0 == 8217) {
			local13 = -110;
		} else if (arg0 == 8220) {
			local13 = -109;
		} else if (arg0 == 8221) {
			local13 = -108;
		} else if (arg0 == 8226) {
			local13 = -107;
		} else if (arg0 == 8211) {
			local13 = -106;
		} else if (arg0 == 8212) {
			local13 = -105;
		} else if (arg0 == 732) {
			local13 = -104;
		} else if (arg0 == 8482) {
			local13 = -103;
		} else if (arg0 == 353) {
			local13 = -102;
		} else if (arg0 == 8250) {
			local13 = -101;
		} else if (arg0 == 339) {
			local13 = -100;
		} else if (arg0 == 382) {
			local13 = -98;
		} else if (arg0 == 376) {
			local13 = -97;
		} else {
			local13 = 63;
		}
		return local13;
	}

	@OriginalMember(owner = "client!zo", name = "d", descriptor = "(C)Z", line = 45)
	public static boolean method36816(@OriginalArg(0) char arg0) {
		if (arg0 > 0 && arg0 < 128 || !(arg0 < 160 || arg0 > 255)) {
			return true;
		}
		if (arg0 != 0) {
			@Pc(16) char[] local16 = aCharArray8;
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				@Pc(26) char local26 = local16[local18];
				if (local26 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!zo", name = "c", descriptor = "(C)Z", line = 45)
	public static boolean method36819(@OriginalArg(0) char arg0) {
		if (arg0 > 0 && arg0 < 128 || !(arg0 < 160 || arg0 > 255)) {
			return true;
		}
		if (arg0 != 0) {
			@Pc(16) char[] local16 = aCharArray8;
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				@Pc(26) char local26 = local16[local18];
				if (local26 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!zo", name = "r", descriptor = "(C)Z", line = 45)
	public static boolean method36822(@OriginalArg(0) char arg0) {
		if (arg0 > 0 && arg0 < 128 || !(arg0 < 160 || arg0 > 255)) {
			return true;
		}
		if (arg0 != 0) {
			@Pc(16) char[] local16 = aCharArray8;
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				@Pc(26) char local26 = local16[local18];
				if (local26 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!zo", name = "o", descriptor = "(C)Z", line = 61)
	public static boolean method36817(@OriginalArg(0) char arg0) {
		if (arg0 > ' ' && arg0 < 127 || !(arg0 <= 127 || arg0 >= 160) || arg0 > 160 && arg0 <= 255) {
			return true;
		}
		if (arg0 != 0) {
			@Pc(24) char[] local24 = aCharArray8;
			for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
				@Pc(34) char local34 = local24[local26];
				if (arg0 == local34) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!zo", name = "v", descriptor = "(C)Z", line = 61)
	public static boolean method36820(@OriginalArg(0) char arg0) {
		if (arg0 > ' ' && arg0 < 127 || !(arg0 <= 127 || arg0 >= 160) || arg0 > 160 && arg0 <= 255) {
			return true;
		}
		if (arg0 != 0) {
			@Pc(24) char[] local24 = aCharArray8;
			for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
				@Pc(34) char local34 = local24[local26];
				if (arg0 == local34) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!zo", name = "y", descriptor = "(Ljava/lang/CharSequence;)[B", line = 90)
	public static byte[] method36818(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) byte[] local5 = new byte[local2];
		for (@Pc(7) int local7 = 0; local7 < local2; local7++) {
			@Pc(14) char local14 = arg0.charAt(local7);
			if (local14 > 0 && local14 < 128 || !(local14 < 160 || local14 > 255)) {
				local5[local7] = (byte) local14;
			} else if (local14 == 8364) {
				local5[local7] = -128;
			} else if (local14 == 8218) {
				local5[local7] = -126;
			} else if (local14 == 402) {
				local5[local7] = -125;
			} else if (local14 == 8222) {
				local5[local7] = -124;
			} else if (local14 == 8230) {
				local5[local7] = -123;
			} else if (local14 == 8224) {
				local5[local7] = -122;
			} else if (local14 == 8225) {
				local5[local7] = -121;
			} else if (local14 == 710) {
				local5[local7] = -120;
			} else if (local14 == 8240) {
				local5[local7] = -119;
			} else if (local14 == 352) {
				local5[local7] = -118;
			} else if (local14 == 8249) {
				local5[local7] = -117;
			} else if (local14 == 338) {
				local5[local7] = -116;
			} else if (local14 == 381) {
				local5[local7] = -114;
			} else if (local14 == 8216) {
				local5[local7] = -111;
			} else if (local14 == 8217) {
				local5[local7] = -110;
			} else if (local14 == 8220) {
				local5[local7] = -109;
			} else if (local14 == 8221) {
				local5[local7] = -108;
			} else if (local14 == 8226) {
				local5[local7] = -107;
			} else if (local14 == 8211) {
				local5[local7] = -106;
			} else if (local14 == 8212) {
				local5[local7] = -105;
			} else if (local14 == 732) {
				local5[local7] = -104;
			} else if (local14 == 8482) {
				local5[local7] = -103;
			} else if (local14 == 353) {
				local5[local7] = -102;
			} else if (local14 == 8250) {
				local5[local7] = -101;
			} else if (local14 == 339) {
				local5[local7] = -100;
			} else if (local14 == 382) {
				local5[local7] = -98;
			} else if (local14 == 376) {
				local5[local7] = -97;
			} else {
				local5[local7] = 63;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!zo", name = "s", descriptor = "(Ljava/lang/CharSequence;)[B", line = 90)
	public static byte[] method36821(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) byte[] local5 = new byte[local2];
		for (@Pc(7) int local7 = 0; local7 < local2; local7++) {
			@Pc(14) char local14 = arg0.charAt(local7);
			if (local14 > 0 && local14 < 128 || !(local14 < 160 || local14 > 255)) {
				local5[local7] = (byte) local14;
			} else if (local14 == 8364) {
				local5[local7] = -128;
			} else if (local14 == 8218) {
				local5[local7] = -126;
			} else if (local14 == 402) {
				local5[local7] = -125;
			} else if (local14 == 8222) {
				local5[local7] = -124;
			} else if (local14 == 8230) {
				local5[local7] = -123;
			} else if (local14 == 8224) {
				local5[local7] = -122;
			} else if (local14 == 8225) {
				local5[local7] = -121;
			} else if (local14 == 710) {
				local5[local7] = -120;
			} else if (local14 == 8240) {
				local5[local7] = -119;
			} else if (local14 == 352) {
				local5[local7] = -118;
			} else if (local14 == 8249) {
				local5[local7] = -117;
			} else if (local14 == 338) {
				local5[local7] = -116;
			} else if (local14 == 381) {
				local5[local7] = -114;
			} else if (local14 == 8216) {
				local5[local7] = -111;
			} else if (local14 == 8217) {
				local5[local7] = -110;
			} else if (local14 == 8220) {
				local5[local7] = -109;
			} else if (local14 == 8221) {
				local5[local7] = -108;
			} else if (local14 == 8226) {
				local5[local7] = -107;
			} else if (local14 == 8211) {
				local5[local7] = -106;
			} else if (local14 == 8212) {
				local5[local7] = -105;
			} else if (local14 == 732) {
				local5[local7] = -104;
			} else if (local14 == 8482) {
				local5[local7] = -103;
			} else if (local14 == 353) {
				local5[local7] = -102;
			} else if (local14 == 8250) {
				local5[local7] = -101;
			} else if (local14 == 339) {
				local5[local7] = -100;
			} else if (local14 == 382) {
				local5[local7] = -98;
			} else if (local14 == 376) {
				local5[local7] = -97;
			} else {
				local5[local7] = 63;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!zo", name = "x", descriptor = "(Ljava/lang/CharSequence;II[BI)I", line = 128)
	public static int method36824(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg2 - arg1;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(14) char local14 = arg0.charAt(local5 + arg1);
			if (local14 > 0 && local14 < 128 || !(local14 < 160 || local14 > 255)) {
				arg3[arg4 + local5] = (byte) local14;
			} else if (local14 == 8364) {
				arg3[local5 + arg4] = -128;
			} else if (local14 == 8218) {
				arg3[arg4 + local5] = -126;
			} else if (local14 == 402) {
				arg3[local5 + arg4] = -125;
			} else if (local14 == 8222) {
				arg3[arg4 + local5] = -124;
			} else if (local14 == 8230) {
				arg3[arg4 + local5] = -123;
			} else if (local14 == 8224) {
				arg3[arg4 + local5] = -122;
			} else if (local14 == 8225) {
				arg3[local5 + arg4] = -121;
			} else if (local14 == 710) {
				arg3[arg4 + local5] = -120;
			} else if (local14 == 8240) {
				arg3[local5 + arg4] = -119;
			} else if (local14 == 352) {
				arg3[local5 + arg4] = -118;
			} else if (local14 == 8249) {
				arg3[local5 + arg4] = -117;
			} else if (local14 == 338) {
				arg3[arg4 + local5] = -116;
			} else if (local14 == 381) {
				arg3[local5 + arg4] = -114;
			} else if (local14 == 8216) {
				arg3[local5 + arg4] = -111;
			} else if (local14 == 8217) {
				arg3[arg4 + local5] = -110;
			} else if (local14 == 8220) {
				arg3[local5 + arg4] = -109;
			} else if (local14 == 8221) {
				arg3[local5 + arg4] = -108;
			} else if (local14 == 8226) {
				arg3[local5 + arg4] = -107;
			} else if (local14 == 8211) {
				arg3[local5 + arg4] = -106;
			} else if (local14 == 8212) {
				arg3[arg4 + local5] = -105;
			} else if (local14 == 732) {
				arg3[arg4 + local5] = -104;
			} else if (local14 == 8482) {
				arg3[arg4 + local5] = -103;
			} else if (local14 == 353) {
				arg3[local5 + arg4] = -102;
			} else if (local14 == 8250) {
				arg3[local5 + arg4] = -101;
			} else if (local14 == 339) {
				arg3[local5 + arg4] = -100;
			} else if (local14 == 382) {
				arg3[arg4 + local5] = -98;
			} else if (local14 == 376) {
				arg3[local5 + arg4] = -97;
			} else {
				arg3[arg4 + local5] = 63;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!zo", name = "b", descriptor = "(Ljava/lang/CharSequence;II[BI)I", line = 128)
	public static int method36825(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg2 - arg1;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(14) char local14 = arg0.charAt(local5 + arg1);
			if (local14 > 0 && local14 < 128 || !(local14 < 160 || local14 > 255)) {
				arg3[arg4 + local5] = (byte) local14;
			} else if (local14 == 8364) {
				arg3[local5 + arg4] = -128;
			} else if (local14 == 8218) {
				arg3[arg4 + local5] = -126;
			} else if (local14 == 402) {
				arg3[local5 + arg4] = -125;
			} else if (local14 == 8222) {
				arg3[arg4 + local5] = -124;
			} else if (local14 == 8230) {
				arg3[arg4 + local5] = -123;
			} else if (local14 == 8224) {
				arg3[arg4 + local5] = -122;
			} else if (local14 == 8225) {
				arg3[local5 + arg4] = -121;
			} else if (local14 == 710) {
				arg3[arg4 + local5] = -120;
			} else if (local14 == 8240) {
				arg3[local5 + arg4] = -119;
			} else if (local14 == 352) {
				arg3[local5 + arg4] = -118;
			} else if (local14 == 8249) {
				arg3[local5 + arg4] = -117;
			} else if (local14 == 338) {
				arg3[arg4 + local5] = -116;
			} else if (local14 == 381) {
				arg3[local5 + arg4] = -114;
			} else if (local14 == 8216) {
				arg3[local5 + arg4] = -111;
			} else if (local14 == 8217) {
				arg3[arg4 + local5] = -110;
			} else if (local14 == 8220) {
				arg3[local5 + arg4] = -109;
			} else if (local14 == 8221) {
				arg3[local5 + arg4] = -108;
			} else if (local14 == 8226) {
				arg3[local5 + arg4] = -107;
			} else if (local14 == 8211) {
				arg3[local5 + arg4] = -106;
			} else if (local14 == 8212) {
				arg3[arg4 + local5] = -105;
			} else if (local14 == 732) {
				arg3[arg4 + local5] = -104;
			} else if (local14 == 8482) {
				arg3[arg4 + local5] = -103;
			} else if (local14 == 353) {
				arg3[local5 + arg4] = -102;
			} else if (local14 == 8250) {
				arg3[local5 + arg4] = -101;
			} else if (local14 == 339) {
				arg3[local5 + arg4] = -100;
			} else if (local14 == 382) {
				arg3[arg4 + local5] = -98;
			} else if (local14 == 376) {
				arg3[local5 + arg4] = -97;
			} else {
				arg3[arg4 + local5] = 63;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!zo", name = "h", descriptor = "(Ljava/lang/CharSequence;II[BI)I", line = 128)
	public static int method36826(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg2 - arg1;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(14) char local14 = arg0.charAt(local5 + arg1);
			if (local14 > 0 && local14 < 128 || !(local14 < 160 || local14 > 255)) {
				arg3[arg4 + local5] = (byte) local14;
			} else if (local14 == 8364) {
				arg3[local5 + arg4] = -128;
			} else if (local14 == 8218) {
				arg3[arg4 + local5] = -126;
			} else if (local14 == 402) {
				arg3[local5 + arg4] = -125;
			} else if (local14 == 8222) {
				arg3[arg4 + local5] = -124;
			} else if (local14 == 8230) {
				arg3[arg4 + local5] = -123;
			} else if (local14 == 8224) {
				arg3[arg4 + local5] = -122;
			} else if (local14 == 8225) {
				arg3[local5 + arg4] = -121;
			} else if (local14 == 710) {
				arg3[arg4 + local5] = -120;
			} else if (local14 == 8240) {
				arg3[local5 + arg4] = -119;
			} else if (local14 == 352) {
				arg3[local5 + arg4] = -118;
			} else if (local14 == 8249) {
				arg3[local5 + arg4] = -117;
			} else if (local14 == 338) {
				arg3[arg4 + local5] = -116;
			} else if (local14 == 381) {
				arg3[local5 + arg4] = -114;
			} else if (local14 == 8216) {
				arg3[local5 + arg4] = -111;
			} else if (local14 == 8217) {
				arg3[arg4 + local5] = -110;
			} else if (local14 == 8220) {
				arg3[local5 + arg4] = -109;
			} else if (local14 == 8221) {
				arg3[local5 + arg4] = -108;
			} else if (local14 == 8226) {
				arg3[local5 + arg4] = -107;
			} else if (local14 == 8211) {
				arg3[local5 + arg4] = -106;
			} else if (local14 == 8212) {
				arg3[arg4 + local5] = -105;
			} else if (local14 == 732) {
				arg3[arg4 + local5] = -104;
			} else if (local14 == 8482) {
				arg3[arg4 + local5] = -103;
			} else if (local14 == 353) {
				arg3[local5 + arg4] = -102;
			} else if (local14 == 8250) {
				arg3[local5 + arg4] = -101;
			} else if (local14 == 339) {
				arg3[local5 + arg4] = -100;
			} else if (local14 == 382) {
				arg3[arg4 + local5] = -98;
			} else if (local14 == 376) {
				arg3[local5 + arg4] = -97;
			} else {
				arg3[arg4 + local5] = 63;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!zo", name = "q", descriptor = "(Ljava/lang/CharSequence;II[BI)I", line = 128)
	public static int method36827(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg2 - arg1;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(14) char local14 = arg0.charAt(local5 + arg1);
			if (local14 > 0 && local14 < 128 || !(local14 < 160 || local14 > 255)) {
				arg3[arg4 + local5] = (byte) local14;
			} else if (local14 == 8364) {
				arg3[local5 + arg4] = -128;
			} else if (local14 == 8218) {
				arg3[arg4 + local5] = -126;
			} else if (local14 == 402) {
				arg3[local5 + arg4] = -125;
			} else if (local14 == 8222) {
				arg3[arg4 + local5] = -124;
			} else if (local14 == 8230) {
				arg3[arg4 + local5] = -123;
			} else if (local14 == 8224) {
				arg3[arg4 + local5] = -122;
			} else if (local14 == 8225) {
				arg3[local5 + arg4] = -121;
			} else if (local14 == 710) {
				arg3[arg4 + local5] = -120;
			} else if (local14 == 8240) {
				arg3[local5 + arg4] = -119;
			} else if (local14 == 352) {
				arg3[local5 + arg4] = -118;
			} else if (local14 == 8249) {
				arg3[local5 + arg4] = -117;
			} else if (local14 == 338) {
				arg3[arg4 + local5] = -116;
			} else if (local14 == 381) {
				arg3[local5 + arg4] = -114;
			} else if (local14 == 8216) {
				arg3[local5 + arg4] = -111;
			} else if (local14 == 8217) {
				arg3[arg4 + local5] = -110;
			} else if (local14 == 8220) {
				arg3[local5 + arg4] = -109;
			} else if (local14 == 8221) {
				arg3[local5 + arg4] = -108;
			} else if (local14 == 8226) {
				arg3[local5 + arg4] = -107;
			} else if (local14 == 8211) {
				arg3[local5 + arg4] = -106;
			} else if (local14 == 8212) {
				arg3[arg4 + local5] = -105;
			} else if (local14 == 732) {
				arg3[arg4 + local5] = -104;
			} else if (local14 == 8482) {
				arg3[arg4 + local5] = -103;
			} else if (local14 == 353) {
				arg3[local5 + arg4] = -102;
			} else if (local14 == 8250) {
				arg3[local5 + arg4] = -101;
			} else if (local14 == 339) {
				arg3[local5 + arg4] = -100;
			} else if (local14 == 382) {
				arg3[arg4 + local5] = -98;
			} else if (local14 == 376) {
				arg3[local5 + arg4] = -97;
			} else {
				arg3[arg4 + local5] = 63;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!zo", name = "a", descriptor = "([B)Ljava/lang/String;", line = 165)
	public static String method36814(@OriginalArg(0) byte[] arg0) {
		return Class155.method15308(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!zo", name = "g", descriptor = "([B)Ljava/lang/String;", line = 165)
	public static String method36828(@OriginalArg(0) byte[] arg0) {
		return Class155.method15308(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!zo", name = "i", descriptor = "([B)Ljava/lang/String;", line = 165)
	public static String method36829(@OriginalArg(0) byte[] arg0) {
		return Class155.method15308(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!zo", name = "j", descriptor = "([BII)Ljava/lang/String;", line = 169)
	public static String method36830(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) char[] local2 = new char[arg2];
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = arg0[arg1 + local6] & 0xFF;
			if (local17 != 0) {
				if (local17 >= 128 && local17 < 160) {
					@Pc(32) char local32 = aCharArray8[local17 - 128];
					if (local32 == 0) {
						local32 = '?';
					}
					local17 = local32;
				}
				local2[local4++] = (char) local17;
			}
		}
		return new String(local2, 0, local4);
	}

	@OriginalMember(owner = "client!zo", name = "t", descriptor = "([BII)Ljava/lang/String;", line = 169)
	public static String method36831(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) char[] local2 = new char[arg2];
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = arg0[arg1 + local6] & 0xFF;
			if (local17 != 0) {
				if (local17 >= 128 && local17 < 160) {
					@Pc(32) char local32 = aCharArray8[local17 - 128];
					if (local32 == 0) {
						local32 = '?';
					}
					local17 = local32;
				}
				local2[local4++] = (char) local17;
			}
		}
		return new String(local2, 0, local4);
	}

	@OriginalMember(owner = "client!zo", name = "ml", descriptor = "(Lclient!yf;I)V", line = 7244)
	static final void method36832(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class75.method1266(local11, local14, arg0);
	}
}
