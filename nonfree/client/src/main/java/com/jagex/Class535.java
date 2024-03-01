package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public class Class535 {

	@OriginalMember(owner = "client!vr", name = "p", descriptor = "[C")
	static final char[] aCharArray5 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V", line = 6)
	Class535() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!vr", name = "y", descriptor = "(B)Z", line = 61)
	public static boolean method32528(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = arg0 & 0xFF;
		if (local3 == 0) {
			return false;
		} else {
			return local3 < 128 || local3 >= 160 || aCharArray5[local3 - 128] != 0;
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)Z", line = 61)
	public static boolean method32529(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = arg0 & 0xFF;
		if (local3 == 0) {
			return false;
		} else {
			return local3 < 128 || local3 >= 160 || aCharArray5[local3 - 128] != 0;
		}
	}

	@OriginalMember(owner = "client!vr", name = "z", descriptor = "(B)C", line = 70)
	public static char method32530(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = arg0 & 0xFF;
		if (local3 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(local3, 16));
		}
		if (local3 >= 128 && local3 < 160) {
			@Pc(31) char local31 = aCharArray5[local3 - 128];
			if (local31 == 0) {
				local31 = '?';
			}
			local3 = local31;
		}
		return (char) local3;
	}

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "(B)C", line = 70)
	public static char method32531(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = arg0 & 0xFF;
		if (local3 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(local3, 16));
		}
		if (local3 >= 128 && local3 < 160) {
			@Pc(31) char local31 = aCharArray5[local3 - 128];
			if (local31 == 0) {
				local31 = '?';
			}
			local3 = local31;
		}
		return (char) local3;
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(B)C", line = 70)
	public static char method32532(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = arg0 & 0xFF;
		if (local3 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(local3, 16));
		}
		if (local3 >= 128 && local3 < 160) {
			@Pc(31) char local31 = aCharArray5[local3 - 128];
			if (local31 == 0) {
				local31 = '?';
			}
			local3 = local31;
		}
		return (char) local3;
	}

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "(B)C", line = 70)
	public static char method32533(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = arg0 & 0xFF;
		if (local3 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(local3, 16));
		}
		if (local3 >= 128 && local3 < 160) {
			@Pc(31) char local31 = aCharArray5[local3 - 128];
			if (local31 == 0) {
				local31 = '?';
			}
			local3 = local31;
		}
		return (char) local3;
	}

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "(Ljava/lang/CharSequence;)[B", line = 81)
	public static byte[] method32527(@OriginalArg(0) CharSequence arg0) {
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

	@OriginalMember(owner = "client!vr", name = "r", descriptor = "(Ljava/lang/CharSequence;)[B", line = 81)
	public static byte[] method32534(@OriginalArg(0) CharSequence arg0) {
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

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "(Ljava/lang/CharSequence;)[B", line = 81)
	public static byte[] method32535(@OriginalArg(0) CharSequence arg0) {
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

	@OriginalMember(owner = "client!vr", name = "q", descriptor = "(Ljava/lang/CharSequence;II[BI)I", line = 119)
	public static int method32536(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg2 - arg1;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(14) char local14 = arg0.charAt(arg1 + local5);
			if (local14 > 0 && local14 < 128 || !(local14 < 160 || local14 > 255)) {
				arg3[arg4 + local5] = (byte) local14;
			} else if (local14 == 8364) {
				arg3[local5 + arg4] = -128;
			} else if (local14 == 8218) {
				arg3[arg4 + local5] = -126;
			} else if (local14 == 402) {
				arg3[arg4 + local5] = -125;
			} else if (local14 == 8222) {
				arg3[arg4 + local5] = -124;
			} else if (local14 == 8230) {
				arg3[arg4 + local5] = -123;
			} else if (local14 == 8224) {
				arg3[arg4 + local5] = -122;
			} else if (local14 == 8225) {
				arg3[local5 + arg4] = -121;
			} else if (local14 == 710) {
				arg3[local5 + arg4] = -120;
			} else if (local14 == 8240) {
				arg3[local5 + arg4] = -119;
			} else if (local14 == 352) {
				arg3[arg4 + local5] = -118;
			} else if (local14 == 8249) {
				arg3[arg4 + local5] = -117;
			} else if (local14 == 338) {
				arg3[local5 + arg4] = -116;
			} else if (local14 == 381) {
				arg3[local5 + arg4] = -114;
			} else if (local14 == 8216) {
				arg3[local5 + arg4] = -111;
			} else if (local14 == 8217) {
				arg3[local5 + arg4] = -110;
			} else if (local14 == 8220) {
				arg3[local5 + arg4] = -109;
			} else if (local14 == 8221) {
				arg3[arg4 + local5] = -108;
			} else if (local14 == 8226) {
				arg3[arg4 + local5] = -107;
			} else if (local14 == 8211) {
				arg3[arg4 + local5] = -106;
			} else if (local14 == 8212) {
				arg3[local5 + arg4] = -105;
			} else if (local14 == 732) {
				arg3[local5 + arg4] = -104;
			} else if (local14 == 8482) {
				arg3[local5 + arg4] = -103;
			} else if (local14 == 353) {
				arg3[local5 + arg4] = -102;
			} else if (local14 == 8250) {
				arg3[arg4 + local5] = -101;
			} else if (local14 == 339) {
				arg3[local5 + arg4] = -100;
			} else if (local14 == 382) {
				arg3[arg4 + local5] = -98;
			} else if (local14 == 376) {
				arg3[arg4 + local5] = -97;
			} else {
				arg3[arg4 + local5] = 63;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "(Ljava/lang/CharSequence;II[BI)I", line = 119)
	public static int method32537(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg2 - arg1;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(14) char local14 = arg0.charAt(arg1 + local5);
			if (local14 > 0 && local14 < 128 || !(local14 < 160 || local14 > 255)) {
				arg3[arg4 + local5] = (byte) local14;
			} else if (local14 == 8364) {
				arg3[local5 + arg4] = -128;
			} else if (local14 == 8218) {
				arg3[arg4 + local5] = -126;
			} else if (local14 == 402) {
				arg3[arg4 + local5] = -125;
			} else if (local14 == 8222) {
				arg3[arg4 + local5] = -124;
			} else if (local14 == 8230) {
				arg3[arg4 + local5] = -123;
			} else if (local14 == 8224) {
				arg3[arg4 + local5] = -122;
			} else if (local14 == 8225) {
				arg3[local5 + arg4] = -121;
			} else if (local14 == 710) {
				arg3[local5 + arg4] = -120;
			} else if (local14 == 8240) {
				arg3[local5 + arg4] = -119;
			} else if (local14 == 352) {
				arg3[arg4 + local5] = -118;
			} else if (local14 == 8249) {
				arg3[arg4 + local5] = -117;
			} else if (local14 == 338) {
				arg3[local5 + arg4] = -116;
			} else if (local14 == 381) {
				arg3[local5 + arg4] = -114;
			} else if (local14 == 8216) {
				arg3[local5 + arg4] = -111;
			} else if (local14 == 8217) {
				arg3[local5 + arg4] = -110;
			} else if (local14 == 8220) {
				arg3[local5 + arg4] = -109;
			} else if (local14 == 8221) {
				arg3[arg4 + local5] = -108;
			} else if (local14 == 8226) {
				arg3[arg4 + local5] = -107;
			} else if (local14 == 8211) {
				arg3[arg4 + local5] = -106;
			} else if (local14 == 8212) {
				arg3[local5 + arg4] = -105;
			} else if (local14 == 732) {
				arg3[local5 + arg4] = -104;
			} else if (local14 == 8482) {
				arg3[local5 + arg4] = -103;
			} else if (local14 == 353) {
				arg3[local5 + arg4] = -102;
			} else if (local14 == 8250) {
				arg3[arg4 + local5] = -101;
			} else if (local14 == 339) {
				arg3[local5 + arg4] = -100;
			} else if (local14 == 382) {
				arg3[arg4 + local5] = -98;
			} else if (local14 == 376) {
				arg3[arg4 + local5] = -97;
			} else {
				arg3[arg4 + local5] = 63;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!vr", name = "z", descriptor = "(Lclient!age;IIIIB)V", line = 405)
	static void method32538(@OriginalArg(0) Class3_Sub20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0.anInt1280 * 1695234699 == -1 && arg0.anIntArray182 == null) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt1281 * 319712961;
		if (arg0.anInt1271 * 2129834111 != 0 && Class510.aClass3_Sub45_37.aClass60_Sub33_4.method14179() != 0 && arg0.anInt1273 * -1591342007 == arg1) {
			if (arg0.aClass366_3 != null && (arg0.aClass366_3.method26844() == Class378.aClass378_8 || arg0.aClass366_3.method26844() == Class378.aClass378_2)) {
				Class510.aClass183_1.method23684(arg0.aClass366_3);
				arg0.aClass366_3 = null;
			}
			@Pc(103) int local103;
			@Pc(123) int local123;
			@Pc(204) int local204;
			if (arg0.aClass366_3 != null) {
				local204 = (int) ((float) (arg0.anInt1267 * 369723815) + (float) (arg0.anInt1268 * -1607691517 - arg0.anInt1267 * 369723815) * 0.5F);
				local103 = (int) ((float) (arg0.anInt1277 * 313866263) + (float) (arg0.anInt1269 * 299015817 - arg0.anInt1277 * 313866263) * 0.5F);
				arg0.aClass320_47.aFloat259 = local204;
				arg0.aClass320_47.aFloat261 = local103;
			} else if (arg0.anInt1280 * 1695234699 >= 0) {
				@Pc(83) short local83 = 256;
				local103 = (int) ((float) (arg0.anInt1267 * 369723815) + (float) (arg0.anInt1268 * -1607691517 - arg0.anInt1267 * 369723815) * 0.5F);
				local123 = (int) ((float) (arg0.anInt1277 * 313866263) + (float) (arg0.anInt1269 * 299015817 - arg0.anInt1277 * 313866263) * 0.5F);
				arg0.aClass320_47.aFloat259 = local103;
				arg0.aClass320_47.aFloat261 = local123;
				arg0.aClass366_3 = Class510.aClass183_1.method23686(Class160.aClass160_2, arg0, arg0.anInt1280 * 1695234699, -1, 0, Class141.aClass141_5.method23024(), Class158.aClass158_5, (float) (arg0.anInt1270 * 447860907), (float) (arg0.anInt1271 * 2129834111), arg0.aClass320_47, 0, local83, false);
				if (arg0.aClass366_3 != null) {
					@Pc(173) float local173 = (float) local15 / 255.0F;
					arg0.aClass366_3.method26828(local173, 150);
					arg0.aClass366_3.method26818();
				}
			}
			if (arg0.aClass366_4 != null) {
				local204 = (int) ((float) (arg0.anInt1267 * 369723815) + (float) (arg0.anInt1268 * -1607691517 - arg0.anInt1267 * 369723815) * 0.5F);
				local103 = (int) ((float) (arg0.anInt1269 * 299015817 - arg0.anInt1277 * 313866263) * 0.5F + (float) (arg0.anInt1277 * 313866263));
				arg0.aClass320_46.aFloat259 = local204;
				arg0.aClass320_46.aFloat261 = local103;
				if (arg0.aClass366_4.method26844() == Class378.aClass378_8 || arg0.aClass366_4.method26844() == Class378.aClass378_2) {
					Class510.aClass183_1.method23684(arg0.aClass366_4);
					arg0.aClass366_4 = null;
				}
			} else if (arg0.anIntArray182 != null && (arg0.anInt1284 -= arg4 * 55542789) * -1359959859 <= 0) {
				local204 = arg0.anInt1279 * 78634583 == 256 && arg0.anInt1278 * -925341849 == 256 ? 256 : (int) (Math.random() * (double) (arg0.anInt1279 * 78634583 - arg0.anInt1278 * -925341849)) + arg0.anInt1278 * -925341849;
				local103 = (int) (Math.random() * (double) arg0.anIntArray182.length);
				local123 = (int) ((float) (arg0.anInt1268 * -1607691517 - arg0.anInt1267 * 369723815) * 0.5F + (float) (arg0.anInt1267 * 369723815));
				@Pc(334) int local334 = (int) ((float) (arg0.anInt1269 * 299015817 - arg0.anInt1277 * 313866263) * 0.5F + (float) (arg0.anInt1277 * 313866263));
				arg0.aClass320_46.aFloat259 = local123;
				arg0.aClass320_46.aFloat261 = local334;
				arg0.aClass366_4 = Class510.aClass183_1.method23686(Class160.aClass160_3, arg0, arg0.anIntArray182[local103], 0, local15, Class141.aClass141_8.method23024(), Class158.aClass158_5, (float) (arg0.anInt1270 * 447860907), (float) (arg0.anInt1271 * 2129834111 + arg0.anInt1270 * 447860907), arg0.aClass320_46, 0, local204, false);
				if (arg0.aClass366_4 != null) {
					arg0.aClass366_4.method26818();
				}
				arg0.anInt1284 = (arg0.anInt1282 * 1458644985 + (int) (Math.random() * (double) (arg0.anInt1283 * 538321471 - arg0.anInt1282 * 1458644985))) * 55542789;
			}
		} else if (arg0.aClass366_3 != null) {
			arg0.aClass366_3.method26819(100);
			Class510.aClass183_1.method23684(arg0.aClass366_3);
			arg0.aClass366_3 = null;
		}
	}

	@OriginalMember(owner = "client!vr", name = "yy", descriptor = "(Lclient!vs;I)V", line = 8464)
	static final void method32539(@OriginalArg(0) Class536 arg0) {
		if (client.aString154 == null) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = client.aString154;
		}
	}
}
