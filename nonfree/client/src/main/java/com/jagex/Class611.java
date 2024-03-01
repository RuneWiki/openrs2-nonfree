package com.jagex;

import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yx")
public class Class611 {

	@OriginalMember(owner = "client!yx", name = "x", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!yx", name = "p", descriptor = "[B")
	byte[] aByteArray115;

	@OriginalMember(owner = "client!yx", name = "a", descriptor = "[[B")
	byte[][] aByteArrayArray29;

	@OriginalMember(owner = "client!yx", name = "g", descriptor = "I")
	public int anInt5538;

	@OriginalMember(owner = "client!yx", name = "l", descriptor = "I")
	public int anInt5537;

	@OriginalMember(owner = "client!yx", name = "h", descriptor = "I")
	public int anInt5536;

	@OriginalMember(owner = "client!yx", name = "d", descriptor = "(Lclient!ny;II)Lclient!yx;", line = 17)
	public static Class611 method33584(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method26713(arg1, arg2);
		return local5 == null ? null : new Class611(local5);
	}

	@OriginalMember(owner = "client!yx", name = "q", descriptor = "(Lclient!ny;II)Lclient!yx;", line = 17)
	public static Class611 method33588(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method26713(arg1, arg2);
		return local5 == null ? null : new Class611(local5);
	}

	@OriginalMember(owner = "client!yx", name = "r", descriptor = "(Lclient!ny;II)Lclient!yx;", line = 17)
	public static Class611 method33591(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method26713(arg1, arg2);
		return local5 == null ? null : new Class611(local5);
	}

	@OriginalMember(owner = "client!yx", name = "m", descriptor = "(Lclient!ny;II)Lclient!yx;", line = 17)
	public static Class611 method33594(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method26713(arg1, arg2);
		return local5 == null ? null : new Class611(local5);
	}

	@OriginalMember(owner = "client!yx", name = "v", descriptor = "(Lclient!ny;I)Lclient!yx;", line = 23)
	public static Class611 method33595(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method26705(arg1);
		return local4 == null ? null : new Class611(local4);
	}

	@OriginalMember(owner = "client!yx", name = "<init>", descriptor = "([B)V", line = 28)
	Class611(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class3_Sub41 local6 = new Class3_Sub41(arg0);
		@Pc(10) int local10 = local6.method20269();
		if (local10 != 0) {
			throw new RuntimeException("");
		}
		@Pc(26) boolean local26 = local6.method20269() == 1;
		this.aByteArray115 = new byte[256];
		local6.method20286(this.aByteArray115, 0, 256);
		if (local26) {
			@Pc(42) int[] local42 = new int[256];
			@Pc(45) int[] local45 = new int[256];
			@Pc(47) int local47;
			for (local47 = 0; local47 < 256; local47++) {
				local42[local47] = local6.method20269();
			}
			for (local47 = 0; local47 < 256; local47++) {
				local45[local47] = local6.method20269();
			}
			@Pc(74) byte[][] local74 = new byte[256][];
			@Pc(90) int local90;
			for (@Pc(76) int local76 = 0; local76 < 256; local76++) {
				local74[local76] = new byte[local42[local76]];
				@Pc(88) byte local88 = 0;
				for (local90 = 0; local90 < local74[local76].length; local90++) {
					local88 += local6.method20390();
					local74[local76][local90] = local88;
				}
			}
			@Pc(116) byte[][] local116 = new byte[256][];
			@Pc(118) int local118;
			for (local118 = 0; local118 < 256; local118++) {
				local116[local118] = new byte[local42[local118]];
				@Pc(130) byte local130 = 0;
				for (@Pc(132) int local132 = 0; local132 < local116[local118].length; local132++) {
					local130 += local6.method20390();
					local116[local118][local132] = local130;
				}
			}
			this.aByteArrayArray29 = new byte[256][256];
			for (local118 = 0; local118 < 256; local118++) {
				if (local118 != 32 && local118 != 160) {
					for (local90 = 0; local90 < 256; local90++) {
						if (local90 != 32 && local90 != 160) {
							this.aByteArrayArray29[local118][local90] = (byte) Class348.method26562(local74, local116, local45, this.aByteArray115, local42, local118, local90);
						}
					}
				}
			}
			this.anInt5538 = (local45[32] + local42[32]) * -1815769309;
		} else {
			this.anInt5538 = local6.method20269() * -1815769309;
		}
		local6.method20269();
		local6.method20269();
		this.anInt5537 = local6.method20269() * 1650604861;
		this.anInt5536 = local6.method20269() * -1364677853;
	}

	@OriginalMember(owner = "client!yx", name = "e", descriptor = "(Lclient!vs;I)V", line = 75)
	static void method33624(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).method29493(Class424.aClass165_1, arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]) ? 1 : 0;
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!yx", name = "t", descriptor = "([[B[[B[I[B[III)I", line = 76)
	static int method33596(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg2[arg5];
		@Pc(9) int local9 = arg4[arg5] + local3;
		@Pc(13) int local13 = arg2[arg6];
		@Pc(19) int local19 = local13 + arg4[arg6];
		@Pc(21) int local21 = local3;
		if (local13 > local3) {
			local21 = local13;
		}
		@Pc(28) int local28 = local9;
		if (local19 < local9) {
			local28 = local19;
		}
		@Pc(39) int local39 = arg3[arg5] & 0xFF;
		if ((arg3[arg6] & 0xFF) < local39) {
			local39 = arg3[arg6] & 0xFF;
		}
		@Pc(56) byte[] local56 = arg1[arg5];
		@Pc(60) byte[] local60 = arg0[arg6];
		@Pc(64) int local64 = local21 - local3;
		@Pc(68) int local68 = local21 - local13;
		for (@Pc(70) int local70 = local21; local70 < local28; local70++) {
			@Pc(83) int local83 = local56[local64++] + local60[local68++];
			if (local83 < local39) {
				local39 = local83;
			}
		}
		return -local39;
	}

	@OriginalMember(owner = "client!yx", name = "w", descriptor = "([[B[[B[I[B[III)I", line = 76)
	static int method33619(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg2[arg5];
		@Pc(9) int local9 = arg4[arg5] + local3;
		@Pc(13) int local13 = arg2[arg6];
		@Pc(19) int local19 = local13 + arg4[arg6];
		@Pc(21) int local21 = local3;
		if (local13 > local3) {
			local21 = local13;
		}
		@Pc(28) int local28 = local9;
		if (local19 < local9) {
			local28 = local19;
		}
		@Pc(39) int local39 = arg3[arg5] & 0xFF;
		if ((arg3[arg6] & 0xFF) < local39) {
			local39 = arg3[arg6] & 0xFF;
		}
		@Pc(56) byte[] local56 = arg1[arg5];
		@Pc(60) byte[] local60 = arg0[arg6];
		@Pc(64) int local64 = local21 - local3;
		@Pc(68) int local68 = local21 - local13;
		for (@Pc(70) int local70 = local21; local70 < local28; local70++) {
			@Pc(83) int local83 = local56[local64++] + local60[local68++];
			if (local83 < local39) {
				local39 = local83;
			}
		}
		return -local39;
	}

	@OriginalMember(owner = "client!yx", name = "o", descriptor = "([[B[[B[I[B[III)I", line = 76)
	static int method33623(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg2[arg5];
		@Pc(9) int local9 = arg4[arg5] + local3;
		@Pc(13) int local13 = arg2[arg6];
		@Pc(19) int local19 = local13 + arg4[arg6];
		@Pc(21) int local21 = local3;
		if (local13 > local3) {
			local21 = local13;
		}
		@Pc(28) int local28 = local9;
		if (local19 < local9) {
			local28 = local19;
		}
		@Pc(39) int local39 = arg3[arg5] & 0xFF;
		if ((arg3[arg6] & 0xFF) < local39) {
			local39 = arg3[arg6] & 0xFF;
		}
		@Pc(56) byte[] local56 = arg1[arg5];
		@Pc(60) byte[] local60 = arg0[arg6];
		@Pc(64) int local64 = local21 - local3;
		@Pc(68) int local68 = local21 - local13;
		for (@Pc(70) int local70 = local21; local70 < local28; local70++) {
			@Pc(83) int local83 = local56[local64++] + local60[local68++];
			if (local83 < local39) {
				local39 = local83;
			}
		}
		return -local39;
	}

	@OriginalMember(owner = "client!yx", name = "l", descriptor = "(ICI)I", line = 98)
	public int method33597(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray29 == null ? 0 : this.aByteArrayArray29[arg0][arg1];
	}

	@OriginalMember(owner = "client!yx", name = "i", descriptor = "(IC)I", line = 98)
	public int method33599(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray29 == null ? 0 : this.aByteArrayArray29[arg0][arg1];
	}

	@OriginalMember(owner = "client!yx", name = "f", descriptor = "(IC)I", line = 98)
	public int method33600(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray29 == null ? 0 : this.aByteArrayArray29[arg0][arg1];
	}

	@OriginalMember(owner = "client!yx", name = "k", descriptor = "(IC)I", line = 98)
	public int method33601(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray29 == null ? 0 : this.aByteArrayArray29[arg0][arg1];
	}

	@OriginalMember(owner = "client!yx", name = "h", descriptor = "(IB)I", line = 103)
	public int method33580(@OriginalArg(0) int arg0) {
		return this.aByteArray115[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!yx", name = "at", descriptor = "(I)I", line = 103)
	public int method33602(@OriginalArg(0) int arg0) {
		return this.aByteArray115[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!yx", name = "af", descriptor = "(I)I", line = 103)
	public int method33603(@OriginalArg(0) int arg0) {
		return this.aByteArray115[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!yx", name = "ak", descriptor = "(I)I", line = 103)
	public int method33604(@OriginalArg(0) int arg0) {
		return this.aByteArray115[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!yx", name = "x", descriptor = "(Ljava/lang/String;I)I", line = 107)
	public int method33592(@OriginalArg(0) String arg0) {
		return this.method33582(arg0, null);
	}

	@OriginalMember(owner = "client!yx", name = "aa", descriptor = "(Ljava/lang/String;)I", line = 107)
	public int method33605(@OriginalArg(0) String arg0) {
		return this.method33582(arg0, null);
	}

	@OriginalMember(owner = "client!yx", name = "s", descriptor = "(Ljava/lang/String;[Lclient!yh;B)I", line = 111)
	public int method33582(@OriginalArg(0) String arg0, @OriginalArg(1) Interface60[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(21) char local21 = arg0.charAt(local14);
			if (local21 == '<') {
				local5 = local14;
			} else {
				if (local21 == '>' && local5 != -1) {
					@Pc(40) String local40 = arg0.substring(local5 + 1, local14);
					local5 = -1;
					if (local40.equals("lt")) {
						local21 = '<';
					} else if (local40.equals("gt")) {
						local21 = '>';
					} else if (local40.equals("nbsp")) {
						local21 = 160;
					} else if (local40.equals("shy")) {
						local21 = 173;
					} else if (local40.equals("times")) {
						local21 = 215;
					} else if (local40.equals("euro")) {
						local21 = 8364;
					} else if (local40.equals("copy")) {
						local21 = 169;
					} else {
						if (!local40.equals("reg")) {
							if (local40.startsWith("img=") && arg1 != null) {
								try {
									@Pc(111) int local111 = Class70.method33883(local40.substring(4));
									local9 += arg1[local111].method16772();
									local7 = -1;
								} catch (@Pc(122) Exception local122) {
								}
							}
							continue;
						}
						local21 = 174;
					}
				}
				if (local5 == -1) {
					local9 += this.aByteArray115[Class525.method32378(local21) & 0xFF] & 0xFF;
					if (this.aByteArrayArray29 != null && local7 != -1) {
						local9 += this.aByteArrayArray29[local7][local21];
					}
					local7 = local21;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!yx", name = "aj", descriptor = "(Ljava/lang/String;[Lclient!yh;)I", line = 111)
	public int method33593(@OriginalArg(0) String arg0, @OriginalArg(1) Interface60[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(21) char local21 = arg0.charAt(local14);
			if (local21 == '<') {
				local5 = local14;
			} else {
				if (local21 == '>' && local5 != -1) {
					@Pc(40) String local40 = arg0.substring(local5 + 1, local14);
					local5 = -1;
					if (local40.equals("lt")) {
						local21 = '<';
					} else if (local40.equals("gt")) {
						local21 = '>';
					} else if (local40.equals("nbsp")) {
						local21 = 160;
					} else if (local40.equals("shy")) {
						local21 = 173;
					} else if (local40.equals("times")) {
						local21 = 215;
					} else if (local40.equals("euro")) {
						local21 = 8364;
					} else if (local40.equals("copy")) {
						local21 = 169;
					} else {
						if (!local40.equals("reg")) {
							if (local40.startsWith("img=") && arg1 != null) {
								try {
									@Pc(111) int local111 = Class70.method33883(local40.substring(4));
									local9 += arg1[local111].method16772();
									local7 = -1;
								} catch (@Pc(122) Exception local122) {
								}
							}
							continue;
						}
						local21 = 174;
					}
				}
				if (local5 == -1) {
					local9 += this.aByteArray115[Class525.method32378(local21) & 0xFF] & 0xFF;
					if (this.aByteArrayArray29 != null && local7 != -1) {
						local9 += this.aByteArrayArray29[local7][local21];
					}
					local7 = local21;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!yx", name = "an", descriptor = "(Ljava/lang/String;[Lclient!yh;)I", line = 111)
	public int method33607(@OriginalArg(0) String arg0, @OriginalArg(1) Interface60[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(21) char local21 = arg0.charAt(local14);
			if (local21 == '<') {
				local5 = local14;
			} else {
				if (local21 == '>' && local5 != -1) {
					@Pc(40) String local40 = arg0.substring(local5 + 1, local14);
					local5 = -1;
					if (local40.equals("lt")) {
						local21 = '<';
					} else if (local40.equals("gt")) {
						local21 = '>';
					} else if (local40.equals("nbsp")) {
						local21 = 160;
					} else if (local40.equals("shy")) {
						local21 = 173;
					} else if (local40.equals("times")) {
						local21 = 215;
					} else if (local40.equals("euro")) {
						local21 = 8364;
					} else if (local40.equals("copy")) {
						local21 = 169;
					} else {
						if (!local40.equals("reg")) {
							if (local40.startsWith("img=") && arg1 != null) {
								try {
									@Pc(111) int local111 = Class70.method33883(local40.substring(4));
									local9 += arg1[local111].method16772();
									local7 = -1;
								} catch (@Pc(122) Exception local122) {
								}
							}
							continue;
						}
						local21 = 174;
					}
				}
				if (local5 == -1) {
					local9 += this.aByteArray115[Class525.method32378(local21) & 0xFF] & 0xFF;
					if (this.aByteArrayArray29 != null && local7 != -1) {
						local9 += this.aByteArrayArray29[local7][local21];
					}
					local7 = local21;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!yx", name = "ah", descriptor = "(Ljava/lang/String;[Lclient!yh;)I", line = 111)
	public int method33615(@OriginalArg(0) String arg0, @OriginalArg(1) Interface60[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(21) char local21 = arg0.charAt(local14);
			if (local21 == '<') {
				local5 = local14;
			} else {
				if (local21 == '>' && local5 != -1) {
					@Pc(40) String local40 = arg0.substring(local5 + 1, local14);
					local5 = -1;
					if (local40.equals("lt")) {
						local21 = '<';
					} else if (local40.equals("gt")) {
						local21 = '>';
					} else if (local40.equals("nbsp")) {
						local21 = 160;
					} else if (local40.equals("shy")) {
						local21 = 173;
					} else if (local40.equals("times")) {
						local21 = 215;
					} else if (local40.equals("euro")) {
						local21 = 8364;
					} else if (local40.equals("copy")) {
						local21 = 169;
					} else {
						if (!local40.equals("reg")) {
							if (local40.startsWith("img=") && arg1 != null) {
								try {
									@Pc(111) int local111 = Class70.method33883(local40.substring(4));
									local9 += arg1[local111].method16772();
									local7 = -1;
								} catch (@Pc(122) Exception local122) {
								}
							}
							continue;
						}
						local21 = 174;
					}
				}
				if (local5 == -1) {
					local9 += this.aByteArray115[Class525.method32378(local21) & 0xFF] & 0xFF;
					if (this.aByteArrayArray29 != null && local7 != -1) {
						local9 += this.aByteArrayArray29[local7][local21];
					}
					local7 = local21;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!yx", name = "u", descriptor = "(Ljava/lang/String;I[Lclient!yh;I)Ljava/lang/String;", line = 154)
	public String method33583(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface60[] arg2) {
		if (this.method33582(arg0, arg2) <= arg1) {
			return arg0;
		}
		@Pc(16) int local16 = arg1 - this.method33582("...", null);
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = 0;
		@Pc(25) int local25 = arg0.length();
		@Pc(27) String local27 = "";
		for (@Pc(29) int local29 = 0; local29 < local25; local29++) {
			@Pc(36) char local36 = arg0.charAt(local29);
			if (local36 == '<') {
				local18 = local29;
			} else {
				if (local36 == '>' && local18 != -1) {
					@Pc(55) String local55 = arg0.substring(local18 + 1, local29);
					local18 = -1;
					if (local55.equals("lt")) {
						local36 = '<';
					} else if (local55.equals("gt")) {
						local36 = '>';
					} else if (local55.equals("nbsp")) {
						local36 = 160;
					} else if (local55.equals("shy")) {
						local36 = 173;
					} else if (local55.equals("times")) {
						local36 = 215;
					} else if (local55.equals("euro")) {
						local36 = 8364;
					} else if (local55.equals("copy")) {
						local36 = 169;
					} else {
						if (!local55.equals("reg")) {
							if (local55.startsWith("img=") && arg2 != null) {
								try {
									@Pc(126) int local126 = Class70.method33883(local55.substring(4));
									local22 += arg2[local126].method16772();
									local20 = -1;
									if (local22 > local16) {
										return local27 + "...";
									}
									local27 = arg0.substring(0, local29 + 1);
								} catch (@Pc(156) Exception local156) {
								}
							}
							continue;
						}
						local36 = 174;
					}
				}
				if (local18 == -1) {
					local22 += this.aByteArray115[Class525.method32378(local36) & 0xFF] & 0xFF;
					if (this.aByteArrayArray29 != null && local20 != -1) {
						local22 += this.aByteArrayArray29[local20][local36];
					}
					local20 = local36;
					@Pc(192) int local192 = local22;
					if (this.aByteArrayArray29 != null) {
						local192 = local22 + this.aByteArrayArray29[local36][46];
					}
					if (local192 > local16) {
						return local27 + "...";
					}
					local27 = arg0.substring(0, local29 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!yx", name = "as", descriptor = "(Ljava/lang/String;I[Lclient!yh;)Ljava/lang/String;", line = 154)
	public String method33609(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface60[] arg2) {
		if (this.method33582(arg0, arg2) <= arg1) {
			return arg0;
		}
		@Pc(16) int local16 = arg1 - this.method33582("...", null);
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = 0;
		@Pc(25) int local25 = arg0.length();
		@Pc(27) String local27 = "";
		for (@Pc(29) int local29 = 0; local29 < local25; local29++) {
			@Pc(36) char local36 = arg0.charAt(local29);
			if (local36 == '<') {
				local18 = local29;
			} else {
				if (local36 == '>' && local18 != -1) {
					@Pc(55) String local55 = arg0.substring(local18 + 1, local29);
					local18 = -1;
					if (local55.equals("lt")) {
						local36 = '<';
					} else if (local55.equals("gt")) {
						local36 = '>';
					} else if (local55.equals("nbsp")) {
						local36 = 160;
					} else if (local55.equals("shy")) {
						local36 = 173;
					} else if (local55.equals("times")) {
						local36 = 215;
					} else if (local55.equals("euro")) {
						local36 = 8364;
					} else if (local55.equals("copy")) {
						local36 = 169;
					} else {
						if (!local55.equals("reg")) {
							if (local55.startsWith("img=") && arg2 != null) {
								try {
									@Pc(126) int local126 = Class70.method33883(local55.substring(4));
									local22 += arg2[local126].method16772();
									local20 = -1;
									if (local22 > local16) {
										return local27 + "...";
									}
									local27 = arg0.substring(0, local29 + 1);
								} catch (@Pc(156) Exception local156) {
								}
							}
							continue;
						}
						local36 = 174;
					}
				}
				if (local18 == -1) {
					local22 += this.aByteArray115[Class525.method32378(local36) & 0xFF] & 0xFF;
					if (this.aByteArrayArray29 != null && local20 != -1) {
						local22 += this.aByteArrayArray29[local20][local36];
					}
					local20 = local36;
					@Pc(192) int local192 = local22;
					if (this.aByteArrayArray29 != null) {
						local192 = local22 + this.aByteArrayArray29[local36][46];
					}
					if (local192 > local16) {
						return local27 + "...";
					}
					local27 = arg0.substring(0, local29 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!yx", name = "y", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;[Lclient!yh;I)I", line = 205)
	public int method33579(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Interface60[] arg3) {
		return this.method33585(arg0, arg1, arg2, arg3, true);
	}

	@OriginalMember(owner = "client!yx", name = "ai", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;[Lclient!yh;)I", line = 205)
	public int method33589(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Interface60[] arg3) {
		return this.method33585(arg0, arg1, arg2, arg3, true);
	}

	@OriginalMember(owner = "client!yx", name = "aq", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;[Lclient!yh;)I", line = 205)
	public int method33611(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Interface60[] arg3) {
		return this.method33585(arg0, arg1, arg2, arg3, true);
	}

	@OriginalMember(owner = "client!yx", name = "b", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;[Lclient!yh;ZI)I", line = 209)
	int method33585(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Interface60[] arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = 0;
		@Pc(22) int local22 = arg0.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(35) int local35 = Class525.method32378(arg0.charAt(local24)) & 0xFF;
			@Pc(37) int local37 = 0;
			if (local35 == 60) {
				local15 = local24;
			} else {
				@Pc(52) int local52;
				if (local15 == -1) {
					local52 = local24;
					local37 += this.method33580(local35);
					if (this.aByteArrayArray29 != null && local17 != -1) {
						local37 += this.aByteArrayArray29[local17][local35];
					}
					local17 = local35;
				} else {
					if (local35 != 62) {
						continue;
					}
					local52 = local15;
					@Pc(59) String local59 = arg0.substring(local15 + 1, local24);
					local15 = -1;
					if (local59.equals("br")) {
						arg2[local19] = arg0.substring(local7, local24 + 1);
						local19++;
						if (local19 >= arg2.length) {
							return 0;
						}
						local7 = local24 + 1;
						local5 = 0;
						local9 = -1;
						local17 = -1;
						continue;
					}
					if (local59.equals("lt")) {
						local37 += this.method33580(60);
						if (this.aByteArrayArray29 != null && local17 != -1) {
							local37 += this.aByteArrayArray29[local17][60];
						}
						local17 = 60;
					} else if (local59.equals("gt")) {
						local37 += this.method33580(62);
						if (this.aByteArrayArray29 != null && local17 != -1) {
							local37 += this.aByteArrayArray29[local17][62];
						}
						local17 = 62;
					} else if (local59.equals("nbsp")) {
						local37 += this.method33580(160);
						if (this.aByteArrayArray29 != null && local17 != -1) {
							local37 += this.aByteArrayArray29[local17][160];
						}
						local17 = 160;
					} else if (local59.equals("shy")) {
						local37 += this.method33580(173);
						if (this.aByteArrayArray29 != null && local17 != -1) {
							local37 += this.aByteArrayArray29[local17][173];
						}
						local17 = 173;
					} else if (local59.equals("times")) {
						local37 += this.method33580(215);
						if (this.aByteArrayArray29 != null && local17 != -1) {
							local37 += this.aByteArrayArray29[local17][215];
						}
						local17 = 215;
					} else if (local59.equals("euro")) {
						local37 += this.method33580(8364);
						if (this.aByteArrayArray29 != null && local17 != -1) {
							local37 += this.aByteArrayArray29[local17][8364];
						}
						local17 = 8364;
					} else if (local59.equals("copy")) {
						local37 += this.method33580(169);
						if (this.aByteArrayArray29 != null && local17 != -1) {
							local37 += this.aByteArrayArray29[local17][169];
						}
						local17 = 169;
					} else if (local59.equals("reg")) {
						local37 += this.method33580(174);
						if (this.aByteArrayArray29 != null && local17 != -1) {
							local37 += this.aByteArrayArray29[local17][174];
						}
						local17 = 174;
					} else if (local59.startsWith("img=") && arg3 != null) {
						try {
							@Pc(336) int local336 = Class70.method33883(local59.substring(4));
							local37 += arg3[local336].method16772();
							local17 = -1;
						} catch (@Pc(347) Exception local347) {
						}
					}
					local35 = -1;
				}
				if (local37 > 0) {
					local5 += local37;
					if (arg1 != null) {
						if (local35 == 32) {
							local9 = local24;
							local11 = local5;
							local13 = arg4 ? 1 : 0;
						}
						if (local5 > arg1[local19 < arg1.length ? local19 : arg1.length - 1]) {
							if (local9 >= 0) {
								arg2[local19] = arg0.substring(local7, local9 + 1 - local13);
								local19++;
								if (local19 >= arg2.length) {
									return 0;
								}
								local7 = local9 + 1;
								local9 = -1;
								local5 -= local11;
								local17 = -1;
							} else {
								arg2[local19] = arg0.substring(local7, local52);
								local19++;
								if (local19 >= arg2.length) {
									return 0;
								}
								local7 = local52;
								local9 = -1;
								local5 = local37;
								local17 = -1;
							}
						}
						if (local35 == 45) {
							local9 = local24;
							local11 = local5;
							local13 = 0;
						}
					}
				}
			}
		}
		if (arg0.length() > local7) {
			arg2[local19] = arg0.substring(local7, arg0.length());
			local19++;
		}
		return local19;
	}

	@OriginalMember(owner = "client!yx", name = "av", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;[Lclient!yh;Z)I", line = 209)
	int method33612(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Interface60[] arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = 0;
		@Pc(22) int local22 = arg0.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(35) int local35 = Class525.method32378(arg0.charAt(local24)) & 0xFF;
			@Pc(37) int local37 = 0;
			if (local35 == 60) {
				local15 = local24;
			} else {
				@Pc(52) int local52;
				if (local15 == -1) {
					local52 = local24;
					local37 += this.method33580(local35);
					if (this.aByteArrayArray29 != null && local17 != -1) {
						local37 += this.aByteArrayArray29[local17][local35];
					}
					local17 = local35;
				} else {
					if (local35 != 62) {
						continue;
					}
					local52 = local15;
					@Pc(59) String local59 = arg0.substring(local15 + 1, local24);
					local15 = -1;
					if (local59.equals("br")) {
						arg2[local19] = arg0.substring(local7, local24 + 1);
						local19++;
						if (local19 >= arg2.length) {
							return 0;
						}
						local7 = local24 + 1;
						local5 = 0;
						local9 = -1;
						local17 = -1;
						continue;
					}
					if (local59.equals("lt")) {
						local37 += this.method33580(60);
						if (this.aByteArrayArray29 != null && local17 != -1) {
							local37 += this.aByteArrayArray29[local17][60];
						}
						local17 = 60;
					} else if (local59.equals("gt")) {
						local37 += this.method33580(62);
						if (this.aByteArrayArray29 != null && local17 != -1) {
							local37 += this.aByteArrayArray29[local17][62];
						}
						local17 = 62;
					} else if (local59.equals("nbsp")) {
						local37 += this.method33580(160);
						if (this.aByteArrayArray29 != null && local17 != -1) {
							local37 += this.aByteArrayArray29[local17][160];
						}
						local17 = 160;
					} else if (local59.equals("shy")) {
						local37 += this.method33580(173);
						if (this.aByteArrayArray29 != null && local17 != -1) {
							local37 += this.aByteArrayArray29[local17][173];
						}
						local17 = 173;
					} else if (local59.equals("times")) {
						local37 += this.method33580(215);
						if (this.aByteArrayArray29 != null && local17 != -1) {
							local37 += this.aByteArrayArray29[local17][215];
						}
						local17 = 215;
					} else if (local59.equals("euro")) {
						local37 += this.method33580(8364);
						if (this.aByteArrayArray29 != null && local17 != -1) {
							local37 += this.aByteArrayArray29[local17][8364];
						}
						local17 = 8364;
					} else if (local59.equals("copy")) {
						local37 += this.method33580(169);
						if (this.aByteArrayArray29 != null && local17 != -1) {
							local37 += this.aByteArrayArray29[local17][169];
						}
						local17 = 169;
					} else if (local59.equals("reg")) {
						local37 += this.method33580(174);
						if (this.aByteArrayArray29 != null && local17 != -1) {
							local37 += this.aByteArrayArray29[local17][174];
						}
						local17 = 174;
					} else if (local59.startsWith("img=") && arg3 != null) {
						try {
							@Pc(336) int local336 = Class70.method33883(local59.substring(4));
							local37 += arg3[local336].method16772();
							local17 = -1;
						} catch (@Pc(347) Exception local347) {
						}
					}
					local35 = -1;
				}
				if (local37 > 0) {
					local5 += local37;
					if (arg1 != null) {
						if (local35 == 32) {
							local9 = local24;
							local11 = local5;
							local13 = arg4 ? 1 : 0;
						}
						if (local5 > arg1[local19 < arg1.length ? local19 : arg1.length - 1]) {
							if (local9 >= 0) {
								arg2[local19] = arg0.substring(local7, local9 + 1 - local13);
								local19++;
								if (local19 >= arg2.length) {
									return 0;
								}
								local7 = local9 + 1;
								local9 = -1;
								local5 -= local11;
								local17 = -1;
							} else {
								arg2[local19] = arg0.substring(local7, local52);
								local19++;
								if (local19 >= arg2.length) {
									return 0;
								}
								local7 = local52;
								local9 = -1;
								local5 = local37;
								local17 = -1;
							}
						}
						if (local35 == 45) {
							local9 = local24;
							local11 = local5;
							local13 = 0;
						}
					}
				}
			}
		}
		if (arg0.length() > local7) {
			arg2[local19] = arg0.substring(local7, arg0.length());
			local19++;
		}
		return local19;
	}

	@OriginalMember(owner = "client!yx", name = "c", descriptor = "(Ljava/lang/String;I[Lclient!yh;I)I", line = 342)
	public int method33586(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface60[] arg2) {
		@Pc(12) int local12 = this.method33579(arg0, new int[] { arg1 }, aStringArray27, arg2);
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(27) int local27 = this.method33582(aStringArray27[local16], arg2);
			if (local27 > local14) {
				local14 = local27;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!yx", name = "ax", descriptor = "(Ljava/lang/String;I[Lclient!yh;)I", line = 342)
	public int method33590(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface60[] arg2) {
		@Pc(12) int local12 = this.method33579(arg0, new int[] { arg1 }, aStringArray27, arg2);
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(27) int local27 = this.method33582(aStringArray27[local16], arg2);
			if (local27 > local14) {
				local14 = local27;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!yx", name = "z", descriptor = "(Ljava/lang/String;I[Lclient!yh;I)I", line = 352)
	public int method33610(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface60[] arg2) {
		return this.method33579(arg0, new int[] { arg1 }, aStringArray27, arg2);
	}

	@OriginalMember(owner = "client!yx", name = "az", descriptor = "(Ljava/lang/String;I[Lclient!yh;)I", line = 352)
	public int method33614(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface60[] arg2) {
		return this.method33579(arg0, new int[] { arg1 }, aStringArray27, arg2);
	}

	@OriginalMember(owner = "client!yx", name = "au", descriptor = "(Ljava/lang/String;II[Lclient!yh;)I", line = 356)
	public int method33587(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface60[] arg3) {
		if (arg2 == 0) {
			arg2 = this.anInt5538 * 1433409675;
		}
		@Pc(20) int local20 = this.method33579(arg0, new int[] { arg1 }, aStringArray27, arg3);
		@Pc(26) int local26 = (local20 - 1) * arg2;
		return this.anInt5537 * -1760037867 + local26 + this.anInt5536 * -1990992757;
	}

	@OriginalMember(owner = "client!yx", name = "al", descriptor = "(Ljava/lang/String;II[Lclient!yh;)I", line = 356)
	public int method33598(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface60[] arg3) {
		if (arg2 == 0) {
			arg2 = this.anInt5538 * 1433409675;
		}
		@Pc(20) int local20 = this.method33579(arg0, new int[] { arg1 }, aStringArray27, arg3);
		@Pc(26) int local26 = (local20 - 1) * arg2;
		return this.anInt5537 * -1760037867 + local26 + this.anInt5536 * -1990992757;
	}

	@OriginalMember(owner = "client!yx", name = "j", descriptor = "(Ljava/lang/String;II[Lclient!yh;I)I", line = 356)
	public int method33606(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface60[] arg3) {
		if (arg2 == 0) {
			arg2 = this.anInt5538 * 1433409675;
		}
		@Pc(20) int local20 = this.method33579(arg0, new int[] { arg1 }, aStringArray27, arg3);
		@Pc(26) int local26 = (local20 - 1) * arg2;
		return this.anInt5537 * -1760037867 + local26 + this.anInt5536 * -1990992757;
	}

	@OriginalMember(owner = "client!yx", name = "ab", descriptor = "(Ljava/lang/String;II[Lclient!yh;)I", line = 356)
	public int method33613(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface60[] arg3) {
		if (arg2 == 0) {
			arg2 = this.anInt5538 * 1433409675;
		}
		@Pc(20) int local20 = this.method33579(arg0, new int[] { arg1 }, aStringArray27, arg3);
		@Pc(26) int local26 = (local20 - 1) * arg2;
		return this.anInt5537 * -1760037867 + local26 + this.anInt5536 * -1990992757;
	}

	@OriginalMember(owner = "client!yx", name = "ao", descriptor = "(Ljava/lang/String;II[Lclient!yh;)I", line = 356)
	public int method33616(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface60[] arg3) {
		if (arg2 == 0) {
			arg2 = this.anInt5538 * 1433409675;
		}
		@Pc(20) int local20 = this.method33579(arg0, new int[] { arg1 }, aStringArray27, arg3);
		@Pc(26) int local26 = (local20 - 1) * arg2;
		return this.anInt5537 * -1760037867 + local26 + this.anInt5536 * -1990992757;
	}

	@OriginalMember(owner = "client!yx", name = "ap", descriptor = "(Ljava/lang/String;II[Lclient!yh;)I", line = 356)
	public int method33617(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface60[] arg3) {
		if (arg2 == 0) {
			arg2 = this.anInt5538 * 1433409675;
		}
		@Pc(20) int local20 = this.method33579(arg0, new int[] { arg1 }, aStringArray27, arg3);
		@Pc(26) int local26 = (local20 - 1) * arg2;
		return this.anInt5537 * -1760037867 + local26 + this.anInt5536 * -1990992757;
	}

	@OriginalMember(owner = "client!yx", name = "n", descriptor = "(Ljava/lang/String;III[Lclient!yh;B)Ljava/awt/Point;", line = 363)
	public Point method33581(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface60[] arg4) {
		if (arg3 <= 0) {
			return new Point(0, this.anInt5537 * -1760037867 + arg2);
		}
		if (arg3 > arg0.length()) {
			arg3 = arg0.length();
		}
		if (arg2 == 0) {
			arg2 = this.anInt5538 * 1433409675;
		}
		@Pc(41) int local41 = this.method33585(arg0, new int[] { arg1 }, aStringArray27, arg4, false);
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < local41; local45++) {
			@Pc(53) int local53 = aStringArray27[local45].length();
			if (local53 + local43 > arg3 || local41 - 1 == local45 && arg3 == arg0.length()) {
				@Pc(72) String local72 = arg0.substring(local43, arg3);
				if (local72.endsWith("<br>")) {
					local72 = "";
					local45++;
				}
				@Pc(89) int local89 = this.method33582(local72, arg4);
				@Pc(98) int local98 = this.anInt5537 * -1760037867 + arg2 * local45;
				return new Point(local89, local98);
			}
			local43 += local53;
		}
		return null;
	}

	@OriginalMember(owner = "client!yx", name = "ay", descriptor = "(Ljava/lang/String;III[Lclient!yh;)Ljava/awt/Point;", line = 363)
	public Point method33620(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface60[] arg4) {
		if (arg3 <= 0) {
			return new Point(0, this.anInt5537 * -1760037867 + arg2);
		}
		if (arg3 > arg0.length()) {
			arg3 = arg0.length();
		}
		if (arg2 == 0) {
			arg2 = this.anInt5538 * 1433409675;
		}
		@Pc(41) int local41 = this.method33585(arg0, new int[] { arg1 }, aStringArray27, arg4, false);
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < local41; local45++) {
			@Pc(53) int local53 = aStringArray27[local45].length();
			if (local53 + local43 > arg3 || local41 - 1 == local45 && arg3 == arg0.length()) {
				@Pc(72) String local72 = arg0.substring(local43, arg3);
				if (local72.endsWith("<br>")) {
					local72 = "";
					local45++;
				}
				@Pc(89) int local89 = this.method33582(local72, arg4);
				@Pc(98) int local98 = this.anInt5537 * -1760037867 + arg2 * local45;
				return new Point(local89, local98);
			}
			local43 += local53;
		}
		return null;
	}

	@OriginalMember(owner = "client!yx", name = "ag", descriptor = "(Ljava/lang/String;III[Lclient!yh;)Ljava/awt/Point;", line = 363)
	public Point method33621(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface60[] arg4) {
		if (arg3 <= 0) {
			return new Point(0, this.anInt5537 * -1760037867 + arg2);
		}
		if (arg3 > arg0.length()) {
			arg3 = arg0.length();
		}
		if (arg2 == 0) {
			arg2 = this.anInt5538 * 1433409675;
		}
		@Pc(41) int local41 = this.method33585(arg0, new int[] { arg1 }, aStringArray27, arg4, false);
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < local41; local45++) {
			@Pc(53) int local53 = aStringArray27[local45].length();
			if (local53 + local43 > arg3 || local41 - 1 == local45 && arg3 == arg0.length()) {
				@Pc(72) String local72 = arg0.substring(local43, arg3);
				if (local72.endsWith("<br>")) {
					local72 = "";
					local45++;
				}
				@Pc(89) int local89 = this.method33582(local72, arg4);
				@Pc(98) int local98 = this.anInt5537 * -1760037867 + arg2 * local45;
				return new Point(local89, local98);
			}
			local43 += local53;
		}
		return null;
	}

	@OriginalMember(owner = "client!yx", name = "e", descriptor = "(Ljava/lang/String;IIII[Lclient!yh;I)I", line = 389)
	public int method33608(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface60[] arg5) {
		if (arg2 == 0) {
			arg2 = this.anInt5538 * 1433409675;
		}
		@Pc(20) int local20 = this.method33579(arg0, new int[] { arg1 }, aStringArray27, arg5);
		if (local20 == 0) {
			return 0;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		arg4 /= arg2;
		if (arg4 >= local20) {
			arg4 = local20 - 1;
		}
		@Pc(44) String local44 = aStringArray27[arg4];
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(50) int local50;
		for (local50 = 0; local50 < arg3 && local46 < local44.length(); local50 = this.method33582(local44.substring(0, local46), arg5)) {
			local48 = local50;
			local46++;
		}
		if (local46 == local44.length() && local44.endsWith("<br>")) {
			local46 -= 4;
		}
		if (arg3 - local48 < local50 - arg3) {
			local46--;
		}
		for (@Pc(89) int local89 = 0; local89 < arg4; local89++) {
			local46 += aStringArray27[local89].length();
		}
		return local46;
	}

	@OriginalMember(owner = "client!yx", name = "ar", descriptor = "(Ljava/lang/String;IIII[Lclient!yh;)I", line = 389)
	public int method33618(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface60[] arg5) {
		if (arg2 == 0) {
			arg2 = this.anInt5538 * 1433409675;
		}
		@Pc(20) int local20 = this.method33579(arg0, new int[] { arg1 }, aStringArray27, arg5);
		if (local20 == 0) {
			return 0;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		arg4 /= arg2;
		if (arg4 >= local20) {
			arg4 = local20 - 1;
		}
		@Pc(44) String local44 = aStringArray27[arg4];
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(50) int local50;
		for (local50 = 0; local50 < arg3 && local46 < local44.length(); local50 = this.method33582(local44.substring(0, local46), arg5)) {
			local48 = local50;
			local46++;
		}
		if (local46 == local44.length() && local44.endsWith("<br>")) {
			local46 -= 4;
		}
		if (arg3 - local48 < local50 - arg3) {
			local46--;
		}
		for (@Pc(89) int local89 = 0; local89 < arg4; local89++) {
			local46 += aStringArray27[local89].length();
		}
		return local46;
	}

	@OriginalMember(owner = "client!yx", name = "am", descriptor = "(Ljava/lang/String;IIII[Lclient!yh;)I", line = 389)
	public int method33622(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface60[] arg5) {
		if (arg2 == 0) {
			arg2 = this.anInt5538 * 1433409675;
		}
		@Pc(20) int local20 = this.method33579(arg0, new int[] { arg1 }, aStringArray27, arg5);
		if (local20 == 0) {
			return 0;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		arg4 /= arg2;
		if (arg4 >= local20) {
			arg4 = local20 - 1;
		}
		@Pc(44) String local44 = aStringArray27[arg4];
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(50) int local50;
		for (local50 = 0; local50 < arg3 && local46 < local44.length(); local50 = this.method33582(local44.substring(0, local46), arg5)) {
			local48 = local50;
			local46++;
		}
		if (local46 == local44.length() && local44.endsWith("<br>")) {
			local46 -= 4;
		}
		if (arg3 - local48 < local50 - arg3) {
			local46--;
		}
		for (@Pc(89) int local89 = 0; local89 < arg4; local89++) {
			local46 += aStringArray27[local89].length();
		}
		return local46;
	}
}
