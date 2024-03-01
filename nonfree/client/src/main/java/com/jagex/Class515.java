package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public class Class515 {

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "[I")
	public static int[] anIntArray490;

	@OriginalMember(owner = "client!uv", name = "sl", descriptor = "B")
	public static byte aByte169;

	@OriginalMember(owner = "client!uv", name = "p", descriptor = "I")
	static int anInt5271 = 0;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
	static int anInt5270 = 0;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V", line = 10)
	Class515() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "(ZZ)V", line = 26)
	public static void method29620(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			anInt5271 -= 171058891;
			if (anInt5271 * -1733718301 == 0) {
				anIntArray490 = null;
			}
		}
		if (arg1) {
			anInt5270 -= 1353385231;
			if (anInt5270 * -2016720401 == 0) {
				Class360.anIntArray422 = null;
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "(ZZ)V", line = 26)
	public static void method29621(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			anInt5271 -= 171058891;
			if (anInt5271 * -1733718301 == 0) {
				anIntArray490 = null;
			}
		}
		if (arg1) {
			anInt5270 -= 1353385231;
			if (anInt5270 * -2016720401 == 0) {
				Class360.anIntArray422 = null;
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "(ZZ)V", line = 26)
	public static void method29622(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			anInt5271 -= 171058891;
			if (anInt5271 * -1733718301 == 0) {
				anIntArray490 = null;
			}
		}
		if (arg1) {
			anInt5270 -= 1353385231;
			if (anInt5270 * -2016720401 == 0) {
				Class360.anIntArray422 = null;
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "q", descriptor = "()V", line = 37)
	static void method29624() {
		if (anIntArray490 != null) {
			return;
		}
		anIntArray490 = new int[65536];
		@Pc(13) double local13 = Math.random() * 0.03D - 0.015D + 0.7D;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 512; local17++) {
			@Pc(32) float local32 = ((float) (local17 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(41) float local41 = (float) (local17 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(43) int local43 = 0; local43 < 128; local43++) {
				@Pc(51) float local51 = (float) local43 / 128.0F;
				@Pc(53) float local53 = 0.0F;
				@Pc(55) float local55 = 0.0F;
				@Pc(57) float local57 = 0.0F;
				@Pc(61) float local61 = local32 / 60.0F;
				@Pc(64) int local64 = (int) local61;
				@Pc(68) int local68 = local64 % 6;
				@Pc(73) float local73 = local61 - (float) local64;
				@Pc(79) float local79 = local51 * (1.0F - local41);
				@Pc(87) float local87 = local51 * (1.0F - local41 * local73);
				@Pc(97) float local97 = local51 * (1.0F - local41 * (1.0F - local73));
				if (local68 == 0) {
					local53 = local51;
					local55 = local97;
					local57 = local79;
				} else if (local68 == 1) {
					local53 = local87;
					local55 = local51;
					local57 = local79;
				} else if (local68 == 2) {
					local53 = local79;
					local55 = local51;
					local57 = local97;
				} else if (local68 == 3) {
					local53 = local79;
					local55 = local87;
					local57 = local51;
				} else if (local68 == 4) {
					local53 = local97;
					local55 = local79;
					local57 = local51;
				} else if (local68 == 5) {
					local53 = local51;
					local55 = local79;
					local57 = local87;
				}
				local53 = (float) Math.pow((double) local53, local13);
				local55 = (float) Math.pow((double) local55, local13);
				local57 = (float) Math.pow((double) local57, local13);
				@Pc(178) int local178 = (int) (local53 * 256.0F);
				@Pc(183) int local183 = (int) (local55 * 256.0F);
				@Pc(188) int local188 = (int) (local57 * 256.0F);
				@Pc(200) int local200 = local188 + (local183 << 8) + (local178 << 16) + -16777216;
				anIntArray490[local15++] = local200;
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "()V", line = 37)
	static void method29625() {
		if (anIntArray490 != null) {
			return;
		}
		anIntArray490 = new int[65536];
		@Pc(13) double local13 = Math.random() * 0.03D - 0.015D + 0.7D;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 512; local17++) {
			@Pc(32) float local32 = ((float) (local17 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(41) float local41 = (float) (local17 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(43) int local43 = 0; local43 < 128; local43++) {
				@Pc(51) float local51 = (float) local43 / 128.0F;
				@Pc(53) float local53 = 0.0F;
				@Pc(55) float local55 = 0.0F;
				@Pc(57) float local57 = 0.0F;
				@Pc(61) float local61 = local32 / 60.0F;
				@Pc(64) int local64 = (int) local61;
				@Pc(68) int local68 = local64 % 6;
				@Pc(73) float local73 = local61 - (float) local64;
				@Pc(79) float local79 = local51 * (1.0F - local41);
				@Pc(87) float local87 = local51 * (1.0F - local41 * local73);
				@Pc(97) float local97 = local51 * (1.0F - local41 * (1.0F - local73));
				if (local68 == 0) {
					local53 = local51;
					local55 = local97;
					local57 = local79;
				} else if (local68 == 1) {
					local53 = local87;
					local55 = local51;
					local57 = local79;
				} else if (local68 == 2) {
					local53 = local79;
					local55 = local51;
					local57 = local97;
				} else if (local68 == 3) {
					local53 = local79;
					local55 = local87;
					local57 = local51;
				} else if (local68 == 4) {
					local53 = local97;
					local55 = local79;
					local57 = local51;
				} else if (local68 == 5) {
					local53 = local51;
					local55 = local79;
					local57 = local87;
				}
				local53 = (float) Math.pow((double) local53, local13);
				local55 = (float) Math.pow((double) local55, local13);
				local57 = (float) Math.pow((double) local57, local13);
				@Pc(178) int local178 = (int) (local53 * 256.0F);
				@Pc(183) int local183 = (int) (local55 * 256.0F);
				@Pc(188) int local188 = (int) (local57 * 256.0F);
				@Pc(200) int local200 = local188 + (local183 << 8) + (local178 << 16) + -16777216;
				anIntArray490[local15++] = local200;
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "()V", line = 37)
	static void method29627() {
		if (anIntArray490 != null) {
			return;
		}
		anIntArray490 = new int[65536];
		@Pc(13) double local13 = Math.random() * 0.03D - 0.015D + 0.7D;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 512; local17++) {
			@Pc(32) float local32 = ((float) (local17 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(41) float local41 = (float) (local17 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(43) int local43 = 0; local43 < 128; local43++) {
				@Pc(51) float local51 = (float) local43 / 128.0F;
				@Pc(53) float local53 = 0.0F;
				@Pc(55) float local55 = 0.0F;
				@Pc(57) float local57 = 0.0F;
				@Pc(61) float local61 = local32 / 60.0F;
				@Pc(64) int local64 = (int) local61;
				@Pc(68) int local68 = local64 % 6;
				@Pc(73) float local73 = local61 - (float) local64;
				@Pc(79) float local79 = local51 * (1.0F - local41);
				@Pc(87) float local87 = local51 * (1.0F - local41 * local73);
				@Pc(97) float local97 = local51 * (1.0F - local41 * (1.0F - local73));
				if (local68 == 0) {
					local53 = local51;
					local55 = local97;
					local57 = local79;
				} else if (local68 == 1) {
					local53 = local87;
					local55 = local51;
					local57 = local79;
				} else if (local68 == 2) {
					local53 = local79;
					local55 = local51;
					local57 = local97;
				} else if (local68 == 3) {
					local53 = local79;
					local55 = local87;
					local57 = local51;
				} else if (local68 == 4) {
					local53 = local97;
					local55 = local79;
					local57 = local51;
				} else if (local68 == 5) {
					local53 = local51;
					local55 = local79;
					local57 = local87;
				}
				local53 = (float) Math.pow((double) local53, local13);
				local55 = (float) Math.pow((double) local55, local13);
				local57 = (float) Math.pow((double) local57, local13);
				@Pc(178) int local178 = (int) (local53 * 256.0F);
				@Pc(183) int local183 = (int) (local55 * 256.0F);
				@Pc(188) int local188 = (int) (local57 * 256.0F);
				@Pc(200) int local200 = local188 + (local183 << 8) + (local178 << 16) + -16777216;
				anIntArray490[local15++] = local200;
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "(Ljava/lang/String;II)V", line = 72)
	public static void method29647(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Class570.aClass585_6 == null) {
			Class570.aClass585_6 = new Class585();
		}
		Class570.aClass585_6.aString242 = arg0;
		Class570.aClass585_6.anInt5458 = (arg1 + 1099) * 664190749;
		Class570.aClass585_6.anInt5459 = Class570.aClass585_6.anInt5458 * -1027819553 + 117580992;
		Class570.aClass585_6.anInt5457 = Class570.aClass585_6.anInt5458 * 550241065 + 1338898016;
	}

	@OriginalMember(owner = "client!uv", name = "v", descriptor = "()V", line = 99)
	static void method29626() {
		if (Class360.anIntArray422 != null) {
			return;
		}
		Class360.anIntArray422 = new int[65536];
		Class179.anIntArray372 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D - 0.015D + 0.7D;
		for (@Pc(19) int local19 = 0; local19 < 65536; local19++) {
			@Pc(33) double local33 = (double) (local19 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(44) double local44 = (double) (local19 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(51) double local51 = (double) (local19 & 0x7F) / 128.0D;
			@Pc(53) double local53 = local51;
			@Pc(55) double local55 = local51;
			@Pc(57) double local57 = local51;
			if (local44 != 0.0D) {
				@Pc(71) double local71;
				if (local51 < 0.5D) {
					local71 = local51 * (local44 + 1.0D);
				} else {
					local71 = local44 + local51 - local51 * local44;
				}
				@Pc(86) double local86 = local51 * 2.0D - local71;
				@Pc(90) double local90 = local33 + 0.3333333333333333D;
				if (local90 > 1.0D) {
					local90--;
				}
				@Pc(104) double local104 = local33 - 0.3333333333333333D;
				if (local104 < 0.0D) {
					local104++;
				}
				if (local90 * 6.0D < 1.0D) {
					local53 = (local71 - local86) * 6.0D * local90 + local86;
				} else if (local90 * 2.0D < 1.0D) {
					local53 = local71;
				} else if (local90 * 3.0D < 2.0D) {
					local53 = local86 + (local71 - local86) * (0.6666666666666666D - local90) * 6.0D;
				} else {
					local53 = local86;
				}
				if (local33 * 6.0D < 1.0D) {
					local55 = (local71 - local86) * 6.0D * local33 + local86;
				} else if (local33 * 2.0D < 1.0D) {
					local55 = local71;
				} else if (local33 * 3.0D < 2.0D) {
					local55 = local86 + (local71 - local86) * 6.0D * (0.6666666666666666D - local33);
				} else {
					local55 = local86;
				}
				if (local104 * 6.0D < 1.0D) {
					local57 = (local71 - local86) * 6.0D * local104 + local86;
				} else if (local104 * 2.0D < 1.0D) {
					local57 = local71;
				} else if (local104 * 3.0D < 2.0D) {
					local57 = (local71 - local86) * 6.0D * (0.6666666666666666D - local104) + local86;
				} else {
					local57 = local86;
				}
			}
			local53 = Math.pow(local53, local17);
			local55 = Math.pow(local55, local17);
			local57 = Math.pow(local57, local17);
			@Pc(270) int local270 = (int) (local53 * 256.0D);
			@Pc(275) int local275 = (int) (local55 * 256.0D);
			@Pc(280) int local280 = (int) (local57 * 256.0D);
			@Pc(290) int local290 = local280 + (local270 << 16) + (local275 << 8);
			Class360.anIntArray422[local19] = local290 & 0xFFFFFF;
			@Pc(306) int local306 = (local280 << 16) + (local275 << 8) + local270;
			Class179.anIntArray372[local19] = local306;
		}
	}

	@OriginalMember(owner = "client!uv", name = "t", descriptor = "()V", line = 99)
	static void method29630() {
		if (Class360.anIntArray422 != null) {
			return;
		}
		Class360.anIntArray422 = new int[65536];
		Class179.anIntArray372 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D - 0.015D + 0.7D;
		for (@Pc(19) int local19 = 0; local19 < 65536; local19++) {
			@Pc(33) double local33 = (double) (local19 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(44) double local44 = (double) (local19 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(51) double local51 = (double) (local19 & 0x7F) / 128.0D;
			@Pc(53) double local53 = local51;
			@Pc(55) double local55 = local51;
			@Pc(57) double local57 = local51;
			if (local44 != 0.0D) {
				@Pc(71) double local71;
				if (local51 < 0.5D) {
					local71 = local51 * (local44 + 1.0D);
				} else {
					local71 = local44 + local51 - local51 * local44;
				}
				@Pc(86) double local86 = local51 * 2.0D - local71;
				@Pc(90) double local90 = local33 + 0.3333333333333333D;
				if (local90 > 1.0D) {
					local90--;
				}
				@Pc(104) double local104 = local33 - 0.3333333333333333D;
				if (local104 < 0.0D) {
					local104++;
				}
				if (local90 * 6.0D < 1.0D) {
					local53 = (local71 - local86) * 6.0D * local90 + local86;
				} else if (local90 * 2.0D < 1.0D) {
					local53 = local71;
				} else if (local90 * 3.0D < 2.0D) {
					local53 = local86 + (local71 - local86) * (0.6666666666666666D - local90) * 6.0D;
				} else {
					local53 = local86;
				}
				if (local33 * 6.0D < 1.0D) {
					local55 = (local71 - local86) * 6.0D * local33 + local86;
				} else if (local33 * 2.0D < 1.0D) {
					local55 = local71;
				} else if (local33 * 3.0D < 2.0D) {
					local55 = local86 + (local71 - local86) * 6.0D * (0.6666666666666666D - local33);
				} else {
					local55 = local86;
				}
				if (local104 * 6.0D < 1.0D) {
					local57 = (local71 - local86) * 6.0D * local104 + local86;
				} else if (local104 * 2.0D < 1.0D) {
					local57 = local71;
				} else if (local104 * 3.0D < 2.0D) {
					local57 = (local71 - local86) * 6.0D * (0.6666666666666666D - local104) + local86;
				} else {
					local57 = local86;
				}
			}
			local53 = Math.pow(local53, local17);
			local55 = Math.pow(local55, local17);
			local57 = Math.pow(local57, local17);
			@Pc(270) int local270 = (int) (local53 * 256.0D);
			@Pc(275) int local275 = (int) (local55 * 256.0D);
			@Pc(280) int local280 = (int) (local57 * 256.0D);
			@Pc(290) int local290 = local280 + (local270 << 16) + (local275 << 8);
			Class360.anIntArray422[local19] = local290 & 0xFFFFFF;
			@Pc(306) int local306 = (local280 << 16) + (local275 << 8) + local270;
			Class179.anIntArray372[local19] = local306;
		}
	}

	@OriginalMember(owner = "client!uv", name = "w", descriptor = "(I)S", line = 147)
	public static short method29629(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 >> 10 & 0x3F;
		@Pc(11) int local11 = arg0 >> 3 & 0x70;
		@Pc(15) int local15 = arg0 & 0x7F;
		@Pc(32) int local32 = local15 <= 64 ? local11 * local15 >> 7 : local11 * (127 - local15) >> 7;
		@Pc(36) int local36 = local32 + local15;
		@Pc(44) int local44;
		if (local36 == 0) {
			local44 = local32 << 1;
		} else {
			local44 = (local32 << 8) / local36;
		}
		return (short) (local5 << 10 | local44 >> 4 << 7 | local36);
	}

	@OriginalMember(owner = "client!uv", name = "o", descriptor = "(I)S", line = 147)
	public static short method29638(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 >> 10 & 0x3F;
		@Pc(11) int local11 = arg0 >> 3 & 0x70;
		@Pc(15) int local15 = arg0 & 0x7F;
		@Pc(32) int local32 = local15 <= 64 ? local11 * local15 >> 7 : local11 * (127 - local15) >> 7;
		@Pc(36) int local36 = local32 + local15;
		@Pc(44) int local44;
		if (local36 == 0) {
			local44 = local32 << 1;
		} else {
			local44 = (local32 << 8) / local36;
		}
		return (short) (local5 << 10 | local44 >> 4 << 7 | local36);
	}

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "(II)I", line = 160)
	public static int method29619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "(II)I", line = 160)
	public static int method29631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "(II)I", line = 160)
	public static int method29632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!uv", name = "at", descriptor = "(II)I", line = 167)
	public static int method29623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		@Pc(25) int local25 = (local3 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local3 & 0xFF0000) >>> 8;
		return local25 + ((local7 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local7 * (arg0 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!uv", name = "af", descriptor = "(II)I", line = 167)
	public static int method29633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		@Pc(25) int local25 = (local3 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local3 & 0xFF0000) >>> 8;
		return local25 + ((local7 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local7 * (arg0 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!uv", name = "ak", descriptor = "(II)I", line = 167)
	public static int method29634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		@Pc(25) int local25 = (local3 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local3 & 0xFF0000) >>> 8;
		return local25 + ((local7 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local7 * (arg0 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!uv", name = "aa", descriptor = "(III)I", line = 174)
	public static int method29635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = 255 - arg2;
		@Pc(21) int local21 = ((arg1 & 0xFF00FF) * arg2 & 0xFF00FF00 | arg2 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return local21 + (((arg0 & 0xFF00FF) * local3 & 0xFF00FF00 | local3 * (arg0 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!uv", name = "ah", descriptor = "(II)I", line = 219)
	public static final int method29636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!uv", name = "an", descriptor = "(II)I", line = 219)
	public static final int method29637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!uv", name = "aj", descriptor = "(II)I", line = 227)
	public static final int method29628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!uv", name = "as", descriptor = "(II)I", line = 227)
	public static final int method29639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!uv", name = "ai", descriptor = "(III)I", line = 240)
	public static final int method29640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + ((arg0 & 0xFF) >> 2 << 10) + (arg2 >> 1);
	}

	@OriginalMember(owner = "client!uv", name = "aq", descriptor = "(III)I", line = 240)
	public static final int method29641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + ((arg0 & 0xFF) >> 2 << 10) + (arg2 >> 1);
	}

	@OriginalMember(owner = "client!uv", name = "ci", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 4532)
	static final void method29642(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3575 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * 232600389;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!uv", name = "tr", descriptor = "(Lclient!vs;I)V", line = 7639)
	static final void method29643(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 1248498196;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(43) int local43 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3];
		@Pc(45) short local45 = 256;
		Class510.aClass183_1.method23589(Class160.aClass160_9, local13, local23, local43, Class141.aClass141_3.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, local45, local33);
	}

	@OriginalMember(owner = "client!uv", name = "vm", descriptor = "(Lclient!vs;I)V", line = 7938)
	static final void method29644(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3127 * 629481983;
	}

	@OriginalMember(owner = "client!uv", name = "abz", descriptor = "(Lclient!vs;I)V", line = 8945)
	static final void method29645(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class50.method9447(Class431.method27960(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]), Class469.aClass530_2.method33765());
	}

	@OriginalMember(owner = "client!uv", name = "ahc", descriptor = "(Lclient!vs;I)V", line = 10303)
	static final void method29646(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (local12 >= 1 && local12 <= 2) {
			Class157.method23193(local12, -1, -1, false);
		}
	}
}
