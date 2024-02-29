package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xx")
public class Class656 {

	@OriginalMember(owner = "client!xx", name = "y", descriptor = "[I")
	public static int[] anIntArray531;

	@OriginalMember(owner = "client!xx", name = "l", descriptor = "[I")
	public static int[] anIntArray532;

	@OriginalMember(owner = "client!xx", name = "p", descriptor = "I")
	static int anInt5766 = 0;

	@OriginalMember(owner = "client!xx", name = "c", descriptor = "I")
	static int anInt5767 = 0;

	@OriginalMember(owner = "client!xx", name = "<init>", descriptor = "()V", line = 10)
	Class656() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!xx", name = "z", descriptor = "(ZZ)V", line = 15)
	public static void method33014(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			anInt5766 += 194044063;
			Class509.method30279();
		}
		if (arg1) {
			anInt5767 += 555410307;
			Class652.method32972();
		}
	}

	@OriginalMember(owner = "client!xx", name = "i", descriptor = "(ZZ)V", line = 26)
	public static void method33015(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			anInt5766 -= 194044063;
			if (anInt5766 * -477611169 == 0) {
				Class424.anIntArray462 = null;
			}
		}
		if (arg1) {
			anInt5767 -= 555410307;
			if (anInt5767 * -68828373 == 0) {
				anIntArray532 = null;
			}
		}
	}

	@OriginalMember(owner = "client!xx", name = "j", descriptor = "(ZZ)V", line = 26)
	public static void method33016(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			anInt5766 -= 194044063;
			if (anInt5766 * -477611169 == 0) {
				Class424.anIntArray462 = null;
			}
		}
		if (arg1) {
			anInt5767 -= 555410307;
			if (anInt5767 * -68828373 == 0) {
				anIntArray532 = null;
			}
		}
	}

	@OriginalMember(owner = "client!xx", name = "k", descriptor = "(ZZ)V", line = 26)
	public static void method33017(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			anInt5766 -= 194044063;
			if (anInt5766 * -477611169 == 0) {
				Class424.anIntArray462 = null;
			}
		}
		if (arg1) {
			anInt5767 -= 555410307;
			if (anInt5767 * -68828373 == 0) {
				anIntArray532 = null;
			}
		}
	}

	@OriginalMember(owner = "client!xx", name = "f", descriptor = "()V", line = 37)
	static void method33018() {
		if (Class424.anIntArray462 != null) {
			return;
		}
		Class424.anIntArray462 = new int[65536];
		@Pc(7) double local7 = 0.7D;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < 512; local11++) {
			@Pc(26) float local26 = ((float) (local11 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(35) float local35 = (float) (local11 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(37) int local37 = 0; local37 < 128; local37++) {
				@Pc(45) float local45 = (float) local37 / 128.0F;
				@Pc(47) float local47 = 0.0F;
				@Pc(49) float local49 = 0.0F;
				@Pc(51) float local51 = 0.0F;
				@Pc(55) float local55 = local26 / 60.0F;
				@Pc(58) int local58 = (int) local55;
				@Pc(62) int local62 = local58 % 6;
				@Pc(67) float local67 = local55 - (float) local58;
				@Pc(73) float local73 = (1.0F - local35) * local45;
				@Pc(81) float local81 = local45 * (1.0F - local67 * local35);
				@Pc(91) float local91 = local45 * (1.0F - local35 * (1.0F - local67));
				if (local62 == 0) {
					local47 = local45;
					local49 = local91;
					local51 = local73;
				} else if (local62 == 1) {
					local47 = local81;
					local49 = local45;
					local51 = local73;
				} else if (local62 == 2) {
					local47 = local73;
					local49 = local45;
					local51 = local91;
				} else if (local62 == 3) {
					local47 = local73;
					local49 = local81;
					local51 = local45;
				} else if (local62 == 4) {
					local47 = local91;
					local49 = local73;
					local51 = local45;
				} else if (local62 == 5) {
					local47 = local45;
					local49 = local73;
					local51 = local81;
				}
				local47 = (float) Math.pow((double) local47, local7);
				local49 = (float) Math.pow((double) local49, local7);
				local51 = (float) Math.pow((double) local51, local7);
				@Pc(173) int local173 = (int) (local47 * 256.0F);
				@Pc(178) int local178 = (int) (local49 * 256.0F);
				@Pc(183) int local183 = (int) (local51 * 256.0F);
				@Pc(195) int local195 = local183 + (local178 << 8) + -16777216 + (local173 << 16);
				Class424.anIntArray462[local9++] = local195;
			}
		}
	}

	@OriginalMember(owner = "client!xx", name = "o", descriptor = "()V", line = 37)
	static void method33019() {
		if (Class424.anIntArray462 != null) {
			return;
		}
		Class424.anIntArray462 = new int[65536];
		@Pc(7) double local7 = 0.7D;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < 512; local11++) {
			@Pc(26) float local26 = ((float) (local11 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(35) float local35 = (float) (local11 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(37) int local37 = 0; local37 < 128; local37++) {
				@Pc(45) float local45 = (float) local37 / 128.0F;
				@Pc(47) float local47 = 0.0F;
				@Pc(49) float local49 = 0.0F;
				@Pc(51) float local51 = 0.0F;
				@Pc(55) float local55 = local26 / 60.0F;
				@Pc(58) int local58 = (int) local55;
				@Pc(62) int local62 = local58 % 6;
				@Pc(67) float local67 = local55 - (float) local58;
				@Pc(73) float local73 = (1.0F - local35) * local45;
				@Pc(81) float local81 = local45 * (1.0F - local67 * local35);
				@Pc(91) float local91 = local45 * (1.0F - local35 * (1.0F - local67));
				if (local62 == 0) {
					local47 = local45;
					local49 = local91;
					local51 = local73;
				} else if (local62 == 1) {
					local47 = local81;
					local49 = local45;
					local51 = local73;
				} else if (local62 == 2) {
					local47 = local73;
					local49 = local45;
					local51 = local91;
				} else if (local62 == 3) {
					local47 = local73;
					local49 = local81;
					local51 = local45;
				} else if (local62 == 4) {
					local47 = local91;
					local49 = local73;
					local51 = local45;
				} else if (local62 == 5) {
					local47 = local45;
					local49 = local73;
					local51 = local81;
				}
				local47 = (float) Math.pow((double) local47, local7);
				local49 = (float) Math.pow((double) local49, local7);
				local51 = (float) Math.pow((double) local51, local7);
				@Pc(173) int local173 = (int) (local47 * 256.0F);
				@Pc(178) int local178 = (int) (local49 * 256.0F);
				@Pc(183) int local183 = (int) (local51 * 256.0F);
				@Pc(195) int local195 = local183 + (local178 << 8) + -16777216 + (local173 << 16);
				Class424.anIntArray462[local9++] = local195;
			}
		}
	}

	@OriginalMember(owner = "client!xx", name = "b", descriptor = "()V", line = 37)
	static void method33020() {
		if (Class424.anIntArray462 != null) {
			return;
		}
		Class424.anIntArray462 = new int[65536];
		@Pc(7) double local7 = 0.7D;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < 512; local11++) {
			@Pc(26) float local26 = ((float) (local11 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(35) float local35 = (float) (local11 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(37) int local37 = 0; local37 < 128; local37++) {
				@Pc(45) float local45 = (float) local37 / 128.0F;
				@Pc(47) float local47 = 0.0F;
				@Pc(49) float local49 = 0.0F;
				@Pc(51) float local51 = 0.0F;
				@Pc(55) float local55 = local26 / 60.0F;
				@Pc(58) int local58 = (int) local55;
				@Pc(62) int local62 = local58 % 6;
				@Pc(67) float local67 = local55 - (float) local58;
				@Pc(73) float local73 = (1.0F - local35) * local45;
				@Pc(81) float local81 = local45 * (1.0F - local67 * local35);
				@Pc(91) float local91 = local45 * (1.0F - local35 * (1.0F - local67));
				if (local62 == 0) {
					local47 = local45;
					local49 = local91;
					local51 = local73;
				} else if (local62 == 1) {
					local47 = local81;
					local49 = local45;
					local51 = local73;
				} else if (local62 == 2) {
					local47 = local73;
					local49 = local45;
					local51 = local91;
				} else if (local62 == 3) {
					local47 = local73;
					local49 = local81;
					local51 = local45;
				} else if (local62 == 4) {
					local47 = local91;
					local49 = local73;
					local51 = local45;
				} else if (local62 == 5) {
					local47 = local45;
					local49 = local73;
					local51 = local81;
				}
				local47 = (float) Math.pow((double) local47, local7);
				local49 = (float) Math.pow((double) local49, local7);
				local51 = (float) Math.pow((double) local51, local7);
				@Pc(173) int local173 = (int) (local47 * 256.0F);
				@Pc(178) int local178 = (int) (local49 * 256.0F);
				@Pc(183) int local183 = (int) (local51 * 256.0F);
				@Pc(195) int local195 = local183 + (local178 << 8) + -16777216 + (local173 << 16);
				Class424.anIntArray462[local9++] = local195;
			}
		}
	}

	@OriginalMember(owner = "client!xx", name = "u", descriptor = "()V", line = 37)
	static void method33021() {
		if (Class424.anIntArray462 != null) {
			return;
		}
		Class424.anIntArray462 = new int[65536];
		@Pc(7) double local7 = 0.7D;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < 512; local11++) {
			@Pc(26) float local26 = ((float) (local11 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(35) float local35 = (float) (local11 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(37) int local37 = 0; local37 < 128; local37++) {
				@Pc(45) float local45 = (float) local37 / 128.0F;
				@Pc(47) float local47 = 0.0F;
				@Pc(49) float local49 = 0.0F;
				@Pc(51) float local51 = 0.0F;
				@Pc(55) float local55 = local26 / 60.0F;
				@Pc(58) int local58 = (int) local55;
				@Pc(62) int local62 = local58 % 6;
				@Pc(67) float local67 = local55 - (float) local58;
				@Pc(73) float local73 = (1.0F - local35) * local45;
				@Pc(81) float local81 = local45 * (1.0F - local67 * local35);
				@Pc(91) float local91 = local45 * (1.0F - local35 * (1.0F - local67));
				if (local62 == 0) {
					local47 = local45;
					local49 = local91;
					local51 = local73;
				} else if (local62 == 1) {
					local47 = local81;
					local49 = local45;
					local51 = local73;
				} else if (local62 == 2) {
					local47 = local73;
					local49 = local45;
					local51 = local91;
				} else if (local62 == 3) {
					local47 = local73;
					local49 = local81;
					local51 = local45;
				} else if (local62 == 4) {
					local47 = local91;
					local49 = local73;
					local51 = local45;
				} else if (local62 == 5) {
					local47 = local45;
					local49 = local73;
					local51 = local81;
				}
				local47 = (float) Math.pow((double) local47, local7);
				local49 = (float) Math.pow((double) local49, local7);
				local51 = (float) Math.pow((double) local51, local7);
				@Pc(173) int local173 = (int) (local47 * 256.0F);
				@Pc(178) int local178 = (int) (local49 * 256.0F);
				@Pc(183) int local183 = (int) (local51 * 256.0F);
				@Pc(195) int local195 = local183 + (local178 << 8) + -16777216 + (local173 << 16);
				Class424.anIntArray462[local9++] = local195;
			}
		}
	}

	@OriginalMember(owner = "client!xx", name = "e", descriptor = "()V", line = 37)
	static void method33022() {
		if (Class424.anIntArray462 != null) {
			return;
		}
		Class424.anIntArray462 = new int[65536];
		@Pc(7) double local7 = 0.7D;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < 512; local11++) {
			@Pc(26) float local26 = ((float) (local11 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(35) float local35 = (float) (local11 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(37) int local37 = 0; local37 < 128; local37++) {
				@Pc(45) float local45 = (float) local37 / 128.0F;
				@Pc(47) float local47 = 0.0F;
				@Pc(49) float local49 = 0.0F;
				@Pc(51) float local51 = 0.0F;
				@Pc(55) float local55 = local26 / 60.0F;
				@Pc(58) int local58 = (int) local55;
				@Pc(62) int local62 = local58 % 6;
				@Pc(67) float local67 = local55 - (float) local58;
				@Pc(73) float local73 = (1.0F - local35) * local45;
				@Pc(81) float local81 = local45 * (1.0F - local67 * local35);
				@Pc(91) float local91 = local45 * (1.0F - local35 * (1.0F - local67));
				if (local62 == 0) {
					local47 = local45;
					local49 = local91;
					local51 = local73;
				} else if (local62 == 1) {
					local47 = local81;
					local49 = local45;
					local51 = local73;
				} else if (local62 == 2) {
					local47 = local73;
					local49 = local45;
					local51 = local91;
				} else if (local62 == 3) {
					local47 = local73;
					local49 = local81;
					local51 = local45;
				} else if (local62 == 4) {
					local47 = local91;
					local49 = local73;
					local51 = local45;
				} else if (local62 == 5) {
					local47 = local45;
					local49 = local73;
					local51 = local81;
				}
				local47 = (float) Math.pow((double) local47, local7);
				local49 = (float) Math.pow((double) local49, local7);
				local51 = (float) Math.pow((double) local51, local7);
				@Pc(173) int local173 = (int) (local47 * 256.0F);
				@Pc(178) int local178 = (int) (local49 * 256.0F);
				@Pc(183) int local183 = (int) (local51 * 256.0F);
				@Pc(195) int local195 = local183 + (local178 << 8) + -16777216 + (local173 << 16);
				Class424.anIntArray462[local9++] = local195;
			}
		}
	}

	@OriginalMember(owner = "client!xx", name = "n", descriptor = "()V", line = 99)
	static void method33023() {
		if (anIntArray532 != null) {
			return;
		}
		anIntArray532 = new int[65536];
		anIntArray531 = new int[65536];
		@Pc(11) double local11 = 0.7D;
		for (@Pc(13) int local13 = 0; local13 < 65536; local13++) {
			@Pc(27) double local27 = (double) (local13 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(38) double local38 = (double) (local13 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(45) double local45 = (double) (local13 & 0x7F) / 128.0D;
			@Pc(47) double local47 = local45;
			@Pc(49) double local49 = local45;
			@Pc(51) double local51 = local45;
			if (local38 != 0.0D) {
				@Pc(65) double local65;
				if (local45 < 0.5D) {
					local65 = local45 * (local38 + 1.0D);
				} else {
					local65 = local38 + local45 - local45 * local38;
				}
				@Pc(80) double local80 = local45 * 2.0D - local65;
				@Pc(84) double local84 = local27 + 0.3333333333333333D;
				if (local84 > 1.0D) {
					local84--;
				}
				@Pc(98) double local98 = local27 - 0.3333333333333333D;
				if (local98 < 0.0D) {
					local98++;
				}
				if (local84 * 6.0D < 1.0D) {
					local47 = (local65 - local80) * 6.0D * local84 + local80;
				} else if (local84 * 2.0D < 1.0D) {
					local47 = local65;
				} else if (local84 * 3.0D < 2.0D) {
					local47 = (0.6666666666666666D - local84) * 6.0D * (local65 - local80) + local80;
				} else {
					local47 = local80;
				}
				if (local27 * 6.0D < 1.0D) {
					local49 = local80 + local27 * (local65 - local80) * 6.0D;
				} else if (local27 * 2.0D < 1.0D) {
					local49 = local65;
				} else if (local27 * 3.0D < 2.0D) {
					local49 = (0.6666666666666666D - local27) * (local65 - local80) * 6.0D + local80;
				} else {
					local49 = local80;
				}
				if (local98 * 6.0D < 1.0D) {
					local51 = local98 * (local65 - local80) * 6.0D + local80;
				} else if (local98 * 2.0D < 1.0D) {
					local51 = local65;
				} else if (local98 * 3.0D < 2.0D) {
					local51 = (0.6666666666666666D - local98) * (local65 - local80) * 6.0D + local80;
				} else {
					local51 = local80;
				}
			}
			local47 = Math.pow(local47, local11);
			local49 = Math.pow(local49, local11);
			local51 = Math.pow(local51, local11);
			@Pc(264) int local264 = (int) (local47 * 256.0D);
			@Pc(269) int local269 = (int) (local49 * 256.0D);
			@Pc(274) int local274 = (int) (local51 * 256.0D);
			@Pc(284) int local284 = local274 + (local269 << 8) + (local264 << 16);
			anIntArray532[local13] = local284 & 0xFFFFFF;
			@Pc(300) int local300 = (local274 << 16) + (local269 << 8) + local264;
			anIntArray531[local13] = local300;
		}
	}

	@OriginalMember(owner = "client!xx", name = "m", descriptor = "(II)I", line = 160)
	public static int method33024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!xx", name = "a", descriptor = "(II)I", line = 160)
	public static int method33025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!xx", name = "h", descriptor = "(II)I", line = 167)
	public static int method33026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		@Pc(25) int local25 = (local3 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local3 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return (((arg0 & 0xFF00FF) * local7 & 0xFF00FF00 | local7 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local25;
	}

	@OriginalMember(owner = "client!xx", name = "aj", descriptor = "(III)I", line = 174)
	public static int method33027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = 255 - arg2;
		@Pc(21) int local21 = (arg2 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
		return local21 + ((local3 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local3 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!xx", name = "ai", descriptor = "(III)I", line = 174)
	public static int method33028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = 255 - arg2;
		@Pc(21) int local21 = (arg2 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
		return local21 + ((local3 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local3 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!xx", name = "ag", descriptor = "(III)I", line = 174)
	public static int method33029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = 255 - arg2;
		@Pc(21) int local21 = (arg2 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
		return local21 + ((local3 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local3 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!xx", name = "al", descriptor = "(IIF)I", line = 180)
	public static int method33030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		return Class227.method25798(arg0, arg1, (int) arg2);
	}

	@OriginalMember(owner = "client!xx", name = "ao", descriptor = "(I)I", line = 184)
	public static int method33031(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local40 + local26) / 2.0D;
		if (local40 != local26) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local40 + local26);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local40 == local8) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local40 == local17) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		@Pc(143) int local143 = (int) (local54 * 256.0D);
		@Pc(148) int local148 = (int) (local56 * 256.0D);
		@Pc(153) int local153 = (int) (local62 * 256.0D);
		if (local148 < 0) {
			local148 = 0;
		} else if (local148 > 255) {
			local148 = 255;
		}
		if (local153 < 0) {
			local153 = 0;
		} else if (local153 > 255) {
			local153 = 255;
		}
		if (local153 > 243) {
			local148 >>= 0x4;
		} else if (local153 > 217) {
			local148 >>= 0x3;
		} else if (local153 > 192) {
			local148 >>= 0x2;
		} else if (local153 > 179) {
			local148 >>= 0x1;
		}
		return (local153 >> 1) + ((local143 & 0xFF) >> 2 << 10) + (local148 >> 5 << 7);
	}

	@OriginalMember(owner = "client!xx", name = "ak", descriptor = "(II)I", line = 219)
	public static final int method33032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!xx", name = "au", descriptor = "(II)I", line = 227)
	public static final int method33033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!xx", name = "x", descriptor = "(I)I", line = 337)
	static int method33034() {
		@Pc(6) int local6;
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1.method16227() == 0) {
			for (local6 = 0; local6 < client.anInt3401 * 1779655715; local6++) {
				if (client.anInterface62Array1[local6].method14146() == 's' || client.anInterface62Array1[local6].method14146() == 'S') {
					Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1, 1);
					client.aBoolean590 = true;
					Class347.method27848(Class27.aClass27_9);
					break;
				}
			}
		}
		if (Class322.aClass322_14 == Class80.aClass322_4) {
			if (Class528.aClass473_1 == null) {
				Class528.aClass473_1 = new Class473(Class7.aClass129_1, Class47.aClass470_1, Class643.aClass469_3, Class291.aBigInteger1, Class291.aBigInteger4);
			}
			if (!Class528.aClass473_1.method29638()) {
				return 0;
			}
			Class75.method1148(0, null, true);
			Class252.aBoolean655 = !Class102.method7916();
			Class354.aClass478_109 = Class473.method29653(Class252.aBoolean655 ? Class40.aClass40_30 : Class40.aClass40_28, false, 1, true);
			Class354.aClass478_108 = Class473.method29653(Class40.aClass40_29, false, 1, true);
			Class145.aClass478_46 = Class473.method29653(Class40.aClass40_11, false, 1, true);
			Class585.aClass478_131 = Class473.method29653(Class40.aClass40_40, true, 1, true);
		}
		@Pc(127) int local127;
		@Pc(115) boolean local115;
		if (Class80.aClass322_4 == Class322.aClass322_12) {
			local115 = Class354.aClass478_108.method29737();
			@Pc(119) boolean local119 = Class585.aClass478_131.method29737();
			local127 = Class503.aClass126_Sub1Array2[Class40.aClass40_29.method677()].method11591();
			@Pc(143) int local143 = local127 + Class503.aClass126_Sub1Array2[Class252.aBoolean655 ? Class40.aClass40_30.method677() : Class40.aClass40_28.method677()].method11591();
			@Pc(153) int local153 = local143 + Class503.aClass126_Sub1Array2[Class40.aClass40_11.method677()].method11591();
			@Pc(163) int local163 = local153 + (local119 ? 100 : Class585.aClass478_131.method29743());
			@Pc(173) int local173 = local163 + (local115 ? 100 : Class354.aClass478_108.method29743());
			if (local173 != 500) {
				return local173 / 5;
			}
			Class617.aClass629_1 = new Class629(Class585.aClass478_131);
			Class568.method31388(Class617.aClass629_1);
			@Pc(193) int local193 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub43_1.method16275();
			Class354.aClass66_1 = new Class66(client.aClass670_4, Class128.aClass667_3, Class354.aClass478_108);
			@Pc(205) Class72[] local205 = Class354.aClass66_1.method948(local193);
			if (local205.length == 0) {
				local205 = Class354.aClass66_1.method948(0);
			}
			@Pc(219) Class339 local219 = new Class339(Class354.aClass478_109, Class145.aClass478_46);
			if (local205.length > 0) {
				Class354.anInterface32Array1 = new Interface32[local205.length];
				for (@Pc(228) int local228 = 0; local228 < Class354.anInterface32Array1.length; local228++) {
					Class354.anInterface32Array1[local228] = new Class319(Class354.aClass66_1.method946(local205[local228].anInt206 * 1064408419), local205[local228].anInt205 * -2060664041, local205[local228].anInt204 * -336114669, local219);
				}
			}
		}
		if (Class322.aClass322_8 == Class80.aClass322_4) {
			Class367.aClass415_1 = new Class415(Class284.aClass86_9, Class354.aClass478_109, Class145.aClass478_46, Class26.method461());
		}
		@Pc(285) int local285;
		if (Class322.aClass322_11 == Class80.aClass322_4) {
			local6 = Class367.aClass415_1.method28631();
			local285 = Class367.aClass415_1.method28637();
			if (local6 < local285) {
				return local6 * 100 / local285;
			}
		}
		if (Class80.aClass322_4 == Class322.aClass322_9) {
			if (Class354.anInterface32Array1 != null && Class354.anInterface32Array1.length > 0) {
				if (Class354.anInterface32Array1[0].method27491() < 100) {
					return 0;
				}
				if (Class354.anInterface32Array1.length > 1 && Class354.aClass66_1.method950() && Class354.anInterface32Array1[1].method27491() < 100) {
					return 0;
				}
			}
			Class367.aClass415_1.method28624(client.anInterface51_1);
			Class55.method830(Class284.aClass86_9);
			Class668.method33179(11);
		}
		if (Class322.aClass322_5 == Class80.aClass322_4) {
			Class470.aClass478_125 = Class473.method29653(Class40.aClass40_24, false, 1, true);
			Class211.aClass478_89 = Class473.method29653(Class40.aClass40_13, false, 1, true);
			Class395.aClass478_111 = Class473.method29653(Class40.aClass40_2, false, 1, true);
			Class262.aClass478_91 = Class473.method29653(Class40.aClass40_3, false, 1, true);
			Class7.aClass478_2 = Class473.method29653(Class40.aClass40_41, false, 1, true);
			Class317.aClass478_94 = Class473.method29653(Class40.aClass40_4, false, 1, true);
			Class107_Sub1.aClass478_28 = Class473.method29653(Class40.aClass40_5, true, 1, true);
			Class173.aClass478_87 = Class473.method29653(Class40.aClass40_6, false, 1, true);
			Class4.aClass478_1 = Class473.method29653(Class40.aClass40_42, true, 1, true);
			Class514.aClass478_127 = Class473.method29653(Class40.aClass40_36, true, 1, true);
			Class628.aClass478_135 = Class473.method29653(Class40.aClass40_38, false, 1, true);
			Class322.aClass478_95 = Class473.method29653(Class40.aClass40_9, false, 1, true);
			Class146_Sub1.aClass478_48 = Class473.method29653(Class40.aClass40_10, true, 1, false);
			Class569.aClass478_130 = Class473.method29653(Class40.aClass40_32, true, 1, false);
			Class220.aClass478_90 = Class473.method29653(Class40.aClass40_12, false, 1, true);
			Class272.aClass478_92 = Class473.method29653(Class40.aClass40_17, false, 1, true);
			Class96_Sub5.aClass478_17 = Class473.method29653(Class40.aClass40_1, false, 1, true);
			Class151_Sub3_Sub1.aClass478_86 = Class473.method29653(Class40.aClass40_15, false, 1, true);
			Class115_Sub3.aClass478_83 = Class473.method29653(Class40.aClass40_16, false, 1, true);
			Class338.aClass478_97 = Class473.method29653(Class40.aClass40_27, false, 1, true);
			Class39.aClass478_42 = Class473.method29653(Class40.aClass40_25, false, 1, true);
			Class688.aClass478_137 = Class473.method29653(Class40.aClass40_19, true, 1, false);
			Class52.aClass478_9 = Class473.method29653(Class40.aClass40_33, true, 1, true);
			Class499.aClass478_126 = Class473.method29653(Class40.aClass40_20, false, 1, true);
			Class379.aClass478_110 = Class473.method29653(Class40.aClass40_21, false, 1, true);
			Class694.aClass478_138 = Class473.method29653(Class40.aClass40_22, true, 1, true);
			Class675.aClass478_136 = Class473.method29653(Class40.aClass40_23, false, 1, true);
			Class406.aClass478_114 = Class473.method29653(Class40.aClass40_31, false, 1, true);
			client.aClass478_88 = Class473.method29653(Class40.aClass40_35, true, 1, true);
			Class517.aClass478_128 = Class473.method29653(Class40.aClass40_26, true, 1, true);
			Class323.aClass478_96 = Class473.method29653(Class40.aClass40_43, true, 1, true);
		}
		if (Class322.aClass322_21 == Class80.aClass322_4) {
			local6 = 0;
			local285 = 0;
			for (local127 = 0; local127 < Class503.aClass126_Sub1Array2.length; local127++) {
				if (Class503.aClass126_Sub1Array2[local127] != null) {
					local6 += Class503.aClass126_Sub1Array2[local127].method11591();
					local285++;
				}
			}
			if (local285 > 0) {
				local6 /= local285;
			}
			if (local6 != 100) {
				if (Class354.anInt4497 * -1948226033 < 0) {
					Class354.anInt4497 = local6 * -399326993;
				}
				return (local6 - Class354.anInt4497 * -1948226033) * 100 / (100 - Class354.anInt4497 * -1948226033);
			}
			Class75_Sub1.method1129(Class617.aClass629_1);
			Class367.aClass415_1 = new Class415(Class284.aClass86_9, Class470.aClass478_125, Class145.aClass478_46, Class26.method461());
		}
		if (Class322.aClass322_18 == Class80.aClass322_4) {
			@Pc(671) byte[] local671 = Class585.aClass478_131.method29745(Class614.aClass614_3.anInt5587 * -448671533);
			if (local671 == null) {
				return 0;
			}
			Class94_Sub4.aClass261_1 = new Class261();
			Class94_Sub4.aClass261_1.method26273(50, 7340032);
			Class647.method32852(local671);
			Class668.method33179(4);
		}
		if (Class80.aClass322_4 == Class322.aClass322_13 && Class629.aClass541_1 == null) {
			Class629.aClass541_1 = new Class541(Class517.aClass478_128);
			Class144.method14992(Class629.aClass541_1);
		}
		if (Class322.aClass322_7 == Class80.aClass322_4) {
			local6 = Class62.method904();
			if (local6 < 100) {
				return local6;
			}
			Class326.method27533(Class585.aClass478_131.method29745(Class614.aClass614_1.anInt5587 * -448671533));
			Class628.aShortArrayArray5 = Class617.aClass629_1.aShortArrayArray6;
			Class101.aShortArrayArrayArray9 = Class617.aClass629_1.aShortArrayArrayArray11;
			Class580.aShortArrayArray4 = Class617.aClass629_1.aShortArrayArray7;
			Class479.aShortArrayArrayArray10 = Class617.aClass629_1.aShortArrayArrayArray12;
			if (Class617.aClass629_1.anInt5673 * 1576674457 != -1 && Class617.aClass629_1.anInt5680 * -1351281821 != -1) {
				client.anInt3394 = Class617.aClass629_1.anInt5673 * -1669149727;
				client.anInt3464 = Class617.aClass629_1.anInt5680 * -807589047;
			}
			Class636.aClass627_1 = new Class627(Class585.aClass478_131);
			Class544.aClass620_1 = new Class620(Class585.aClass478_131);
			Class695.aClass635_1 = new Class635(Class585.aClass478_131);
			Class96_Sub16.aClass625_1 = new Class625(Class585.aClass478_131);
			Class136.aClass619_2 = new Class619(Class585.aClass478_131);
		}
		if (Class80.aClass322_4 == Class322.aClass322_15) {
			if (Class617.aClass629_1.anInt5689 * -1085389923 != -1 && !Class173.aClass478_87.method29727(Class617.aClass629_1.anInt5689 * -1085389923, 0)) {
				return 99;
			}
			Class147.aClass209_7 = new Class209(Class694.aClass478_138);
			Class77.anInterface24_117 = new Class87_Sub1(Class4.aClass478_1, Class514.aClass478_127);
			Class77_Sub13_Sub12.aClass35_Sub22_1 = new Class35_Sub22(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class96_Sub23.aClass35_Sub15_1 = new Class35_Sub15(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class648.aClass35_Sub5_1 = new Class35_Sub5(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class75_Sub1.aClass35_1 = new Class35(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class647.aClass647_71, 64, new Class46(Class24.class));
			Class149.aClass35_10 = new Class35(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class647.aClass647_49, 16, new Class46(Class52.class));
			Class663.aClass35_Sub21_1 = new Class35_Sub21(client.aClass670_4, Class128.aClass667_3, Class272.aClass478_92);
			Class555.aClass35_Sub17_3 = new Class35_Sub17(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class65.aClass35_Sub13_1 = new Class35_Sub13(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class629.aClass35_Sub1_1 = new Class35_Sub1(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class476.aClass35_Sub16_1 = new Class35_Sub16(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class333.aClass35_Sub14_1 = new Class35_Sub14(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class173.aClass478_87);
			Class248.aClass35_Sub19_1 = new Class35_Sub19(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class96_Sub10.aClass35_Sub20_1 = new Class35_Sub20(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class92_Sub1.aClass35_Sub12_13 = new Class35_Sub12(client.aClass670_4, Class128.aClass667_3, true, Class220.aClass478_90, Class173.aClass478_87);
			client.aClass517_1.method30461(Class92_Sub1.aClass35_Sub12_13);
			Class196.aClass514_1.method30346(new Class35_Sub12(client.aClass670_4, Class128.aClass667_3, true, Class220.aClass478_90, Class173.aClass478_87));
			Class251.aClass35_Sub10_3 = new Class35_Sub10(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class118_Sub1.aClass35_Sub18_4 = new Class35_Sub18(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class578.aClass35_Sub3_1 = new Class35_Sub3(client.aClass670_4, Class128.aClass667_3, true, Class96_Sub5.aClass478_17, Class173.aClass478_87);
			Class537.aClass35_Sub7_1 = new Class35_Sub7(client.aClass670_4, Class128.aClass667_3, true, Class77_Sub13_Sub12.aClass35_Sub22_1, Class151_Sub3_Sub1.aClass478_86, Class173.aClass478_87);
			Class252.aClass42_Sub2_1 = new Class42_Sub2(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, true);
			Class358.aClass35_Sub8_1 = new Class35_Sub8(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class96_Sub11.aClass35_Sub2_3 = new Class35_Sub2(client.aClass670_4, Class128.aClass667_3, Class115_Sub3.aClass478_83, Class211.aClass478_89, Class395.aClass478_111, Class358.aClass35_Sub8_1);
			Class214.aClass35_Sub6_1 = new Class35_Sub6(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class497.aClass35_Sub9_1 = new Class35_Sub9(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class482.aClass35_Sub4_1 = new Class35_Sub4(client.aClass670_4, Class128.aClass667_3, Class338.aClass478_97, Class173.aClass478_87);
			Class679.aClass42_Sub1_1 = new Class42_Sub1(client.aClass670_4, Class128.aClass667_3, Class39.aClass478_42, true);
			Class416.aClass80_Sub1_Sub2_4 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_64, Class128.aClass667_3, Class262.aClass478_91);
			Class562.aClass80_Sub1_Sub1_2 = new Class80_Sub1_Sub1(client.aClass670_4, Class127.aClass127_63, Class128.aClass667_3, Class262.aClass478_91);
			Class539.aClass80_Sub1_Sub2_6 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_68, Class128.aClass667_3, Class262.aClass478_91);
			Class55.aClass80_Sub1_Sub2_1 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_70, Class128.aClass667_3, Class262.aClass478_91);
			Class308.aClass80_Sub1_Sub2_3 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_71, Class128.aClass667_3, Class262.aClass478_91);
			Class528.aClass80_Sub1_Sub2_5 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_67, Class128.aClass667_3, Class262.aClass478_91);
			Class77_Sub23.aClass80_Sub1_Sub2_2 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_69, Class128.aClass667_3, Class262.aClass478_91);
			Class87_Sub1.aMap5 = Class404.method28523(new Class80_Sub1[] { Class416.aClass80_Sub1_Sub2_4, Class562.aClass80_Sub1_Sub1_2, Class539.aClass80_Sub1_Sub2_6, Class55.aClass80_Sub1_Sub2_1, Class308.aClass80_Sub1_Sub2_3, Class528.aClass80_Sub1_Sub2_5, Class77_Sub23.aClass80_Sub1_Sub2_2 });
			Class61.aClass35_Sub11_1 = new Class35_Sub11(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class87_Sub1.aMap5);
			Class310.anInterface17_4 = new Class332();
			Class75_Sub1.method1130(Class317.aClass478_94, Class173.aClass478_87, Class470.aClass478_125, Class145.aClass478_46);
			Class354.aClass411_1 = new Class411(Class406.aClass478_114);
			Class392.aClass398_1 = new Class398(Class675.aClass478_136);
			Class112.aClass405_3 = new Class405(Class675.aClass478_136);
			Class615.aClass465_1 = new Class465(Class128.aClass667_3, Class499.aClass478_126, Class379.aClass478_110);
			RuntimeException_Sub4.aClass41_2 = new Class41(Class128.aClass667_3, Class499.aClass478_126, Class379.aClass478_110, new Class408());
			Class55.aClass124_1 = new Class124(Class562.aClass80_Sub1_Sub1_2, Class61.aClass35_Sub11_1, Class544.aClass620_1.method32410());
			Class632.method32649();
			Class87_Sub1.method4258(Class96_Sub11.aClass35_Sub2_3);
			Class417.method28675(Class112.aClass405_3, Class392.aClass398_1);
			Class526.method30675(Class173.aClass478_87, Class147.aClass209_7, Class77.anInterface24_117);
			@Pc(1206) Class298 local1206 = new Class298(Class628.aClass478_135.method29778("huffman", ""));
			Class92.method23484(local1206);
			Class504.aClass125_2 = Class122_Sub1_Sub2.method18590();
			Class96_Sub23.aClass77_Sub28_1 = new Class77_Sub28(true);
		}
		if (Class80.aClass322_4 == Class322.aClass322_16) {
			local6 = Class630.method32602(Class470.aClass478_125) + Class367.aClass415_1.method28635(true);
			local285 = Class257.method26226() + Class367.aClass415_1.method28637();
			if (local6 < local285) {
				return local6 * 100 / local285;
			}
		}
		if (Class80.aClass322_4 == Class322.aClass322_17) {
			Class136.method13895(Class688.aClass478_137, Class52.aClass478_9, Class555.aClass35_Sub17_3, Class65.aClass35_Sub13_1, client.aClass517_1.method30444(), Class251.aClass35_Sub10_3, Class118_Sub1.aClass35_Sub18_4, Class55.aClass124_1, Class55.aClass124_1);
		}
		if (Class322.aClass322_10 == Class80.aClass322_4) {
			Class56.aClass93_Sub1_1 = new Class93_Sub1(Class416.aClass80_Sub1_Sub2_4);
			Class416.method28671();
			Class638.aClass240_1 = Class77_Sub31.method13784();
			Class107_Sub1.aClass478_28.method29757(false, true);
			Class470.aClass478_125.method29757(true, true);
			Class145.aClass478_46.method29757(true, true);
			Class628.aClass478_135.method29757(true, true);
			client.aBoolean627 = true;
		}
		if (Class322.aClass322_19 == Class80.aClass322_4 && Class617.aClass629_1.anInt5666 * 143908383 != -1) {
			if (!Class211.method25607(Class617.aClass629_1.anInt5666 * 143908383, null)) {
				return 0;
			}
			local115 = true;
			for (local285 = 0; local285 < Class35_Sub11.aClass273Array1[Class617.aClass629_1.anInt5666 * 143908383].aClass277Array2.length; local285++) {
				@Pc(1338) Class277 local1338 = Class35_Sub11.aClass273Array1[Class617.aClass629_1.anInt5666 * 143908383].aClass277Array2[local285];
				if (local1338.anInt3857 * -1960530827 == 5 && local1338.anInt3954 * 2083357573 != -1 && !Class470.aClass478_125.method29727(local1338.anInt3954 * 2083357573, 0)) {
					local115 = false;
				}
			}
			if (!local115) {
				return 0;
			}
		}
		if (Class322.aClass322_22 == Class80.aClass322_4) {
			Class149.method23150(true);
		}
		if (Class322.aClass322_6 == Class80.aClass322_4) {
			Class307.aClass327_1.method27570();
			try {
				Class354.aThread7.join();
			} catch (@Pc(1383) InterruptedException local1383) {
				return 0;
			}
			Class307.aClass327_1 = null;
			Class354.aThread7 = null;
			Class354.aClass478_109 = null;
			Class354.aClass478_108 = null;
			Class354.aClass66_1 = null;
			Class354.anInterface32Array1 = null;
			Class592.aMap21.remove(Class40.aClass40_29);
			Class592.aMap21.remove(Class40.aClass40_28);
			Class592.aMap21.remove(Class40.aClass40_30);
			Class108.method9021();
			client.aBoolean595 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1.method16227() == 1;
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1, 1);
			if (client.aBoolean595) {
				Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, 0);
			} else if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.aBoolean354 && Class96_Sub23.aClass77_Sub28_1.anInt1615 * -686202593 < 512 && Class96_Sub23.aClass77_Sub28_1.anInt1615 * -686202593 != 0) {
				Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, 0);
			}
			Class667.method33150();
			if (client.aBoolean595) {
				Class533.method30776(0, false);
				if (!client.aBoolean590) {
					Class347.method27848(Class27.aClass27_10);
				}
			} else {
				Class533.method30776(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.method15109(), false);
				if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.method15109() == 0) {
					Class347.method27848(Class27.aClass27_13);
				}
			}
			Class196.method25463(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub9_2.method15194(), -1, -1, false);
			Class367.aClass415_1.method28624(client.anInterface51_1);
			Class55.method830(Class284.aClass86_9);
			Class600.method32037(Class284.aClass86_9, Class470.aClass478_125);
		}
		return Class552.method31013();
	}

	@OriginalMember(owner = "client!xx", name = "fa", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 5531)
	static final void method33035(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3913 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * -156381549;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!xx", name = "iy", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 6032)
	static final void method33036(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(14) int local14 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] - 1;
		if (local14 >= 0 && local14 <= 9) {
			arg0.method26626(local14, (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147]);
		} else {
			arg2.anInt5781 -= 1460193483;
		}
	}

	@OriginalMember(owner = "client!xx", name = "jl", descriptor = "(Lclient!yf;B)V", line = 6155)
	static final void method33037(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class491.method30030(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!xx", name = "we", descriptor = "(Lclient!yf;B)V", line = 8622)
	static final void method33038(@OriginalArg(0) Class665 arg0) {
		@Pc(2) Class77_Sub1_Sub7 local2 = Class639.method32724();
		if (Class510.method30318(local2) == 7) {
			@Pc(12) int local12 = (int) local2.method21630();
			if (local12 >= 0 && local12 <= Class152.anInt2399 * -1843550713) {
				@Pc(23) Class104_Sub1_Sub1_Sub1_Sub2 local23 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local12];
				if (local23 != null) {
					arg0.aClass104_Sub1_Sub1_Sub1_4 = local23;
					arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
					return;
				}
			}
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}

	@OriginalMember(owner = "client!xx", name = "adg", descriptor = "(Lclient!yf;B)V", line = 9686)
	static final void method33039(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class192.method25433(local12);
	}

	@OriginalMember(owner = "client!xx", name = "atu", descriptor = "(Lclient!yf;I)V", line = 12780)
	static final void method33040(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (client.anInt3459 * -993629849 != -1) {
			if (local12 == 0) {
				arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3459 * -993629849;
				return;
			}
			local12--;
		}
		@Pc(44) Class77_Sub38 local44 = (Class77_Sub38) client.aClass12_20.method190();
		while (local12-- > 0) {
			local44 = (Class77_Sub38) client.aClass12_20.method192();
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local44.anInt3113 * 1225863589;
	}
}
