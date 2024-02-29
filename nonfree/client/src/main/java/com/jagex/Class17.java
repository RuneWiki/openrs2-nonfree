package com.jagex;

import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aar")
public class Class17 {

	@OriginalMember(owner = "client!aar", name = "w", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!aar", name = "t", descriptor = "Lclient!aac;")
	public final Interface1 anInterface1_1;

	@OriginalMember(owner = "client!aar", name = "p", descriptor = "[B")
	byte[] aByteArray3;

	@OriginalMember(owner = "client!aar", name = "c", descriptor = "[[B")
	byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!aar", name = "v", descriptor = "I")
	public int anInt50;

	@OriginalMember(owner = "client!aar", name = "l", descriptor = "I")
	public int anInt52;

	@OriginalMember(owner = "client!aar", name = "y", descriptor = "I")
	public int anInt51;

	@OriginalMember(owner = "client!aar", name = "u", descriptor = "(Lclient!pw;II)Lclient!aar;", line = 18)
	public static Class17 method279(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class316.method27377(arg0, arg1, arg2, null);
	}

	@OriginalMember(owner = "client!aar", name = "e", descriptor = "(Lclient!pw;II)Lclient!aar;", line = 18)
	public static Class17 method280(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class316.method27377(arg0, arg1, arg2, null);
	}

	@OriginalMember(owner = "client!aar", name = "f", descriptor = "(Lclient!pw;IILclient!aac;)Lclient!aar;", line = 22)
	public static Class17 method281(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface1 arg3) {
		@Pc(5) byte[] local5 = arg0.method29725(arg1, arg2);
		return local5 == null ? null : new Class17(local5, arg3);
	}

	@OriginalMember(owner = "client!aar", name = "o", descriptor = "(Lclient!pw;IILclient!aac;)Lclient!aar;", line = 22)
	public static Class17 method282(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface1 arg3) {
		@Pc(5) byte[] local5 = arg0.method29725(arg1, arg2);
		return local5 == null ? null : new Class17(local5, arg3);
	}

	@OriginalMember(owner = "client!aar", name = "b", descriptor = "(Lclient!pw;IILclient!aac;)Lclient!aar;", line = 22)
	public static Class17 method283(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface1 arg3) {
		@Pc(5) byte[] local5 = arg0.method29725(arg1, arg2);
		return local5 == null ? null : new Class17(local5, arg3);
	}

	@OriginalMember(owner = "client!aar", name = "h", descriptor = "(Lclient!pw;ILclient!aac;)Lclient!aar;", line = 28)
	public static Class17 method284(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface1 arg2) {
		@Pc(4) byte[] local4 = arg0.method29745(arg1);
		return local4 == null ? null : new Class17(local4, arg2);
	}

	@OriginalMember(owner = "client!aar", name = "n", descriptor = "(Lclient!pw;ILclient!aac;)Lclient!aar;", line = 28)
	public static Class17 method285(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface1 arg2) {
		@Pc(4) byte[] local4 = arg0.method29745(arg1);
		return local4 == null ? null : new Class17(local4, arg2);
	}

	@OriginalMember(owner = "client!aar", name = "a", descriptor = "(Lclient!pw;ILclient!aac;)Lclient!aar;", line = 28)
	public static Class17 method286(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface1 arg2) {
		@Pc(4) byte[] local4 = arg0.method29745(arg1);
		return local4 == null ? null : new Class17(local4, arg2);
	}

	@OriginalMember(owner = "client!aar", name = "m", descriptor = "(Lclient!pw;ILclient!aac;)Lclient!aar;", line = 28)
	public static Class17 method287(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface1 arg2) {
		@Pc(4) byte[] local4 = arg0.method29745(arg1);
		return local4 == null ? null : new Class17(local4, arg2);
	}

	@OriginalMember(owner = "client!aar", name = "<init>", descriptor = "([BLclient!aac;)V", line = 33)
	Class17(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Interface1 arg1) {
		this.anInterface1_1 = arg1;
		@Pc(9) Class77_Sub39 local9 = new Class77_Sub39(arg0);
		@Pc(13) int local13 = local9.method22478();
		if (local13 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local9.method22478() == 1;
		this.aByteArray3 = new byte[256];
		local9.method22533(this.aByteArray3, 0, 256);
		if (local30) {
			@Pc(46) int[] local46 = new int[256];
			@Pc(49) int[] local49 = new int[256];
			@Pc(51) int local51;
			for (local51 = 0; local51 < 256; local51++) {
				local46[local51] = local9.method22478();
			}
			for (local51 = 0; local51 < 256; local51++) {
				local49[local51] = local9.method22478();
			}
			@Pc(78) byte[][] local78 = new byte[256][];
			@Pc(94) int local94;
			for (@Pc(80) int local80 = 0; local80 < 256; local80++) {
				local78[local80] = new byte[local46[local80]];
				@Pc(92) byte local92 = 0;
				for (local94 = 0; local94 < local78[local80].length; local94++) {
					local92 += local9.method22481();
					local78[local80][local94] = local92;
				}
			}
			@Pc(120) byte[][] local120 = new byte[256][];
			@Pc(122) int local122;
			for (local122 = 0; local122 < 256; local122++) {
				local120[local122] = new byte[local46[local122]];
				@Pc(134) byte local134 = 0;
				for (@Pc(136) int local136 = 0; local136 < local120[local122].length; local136++) {
					local134 += local9.method22481();
					local120[local122][local136] = local134;
				}
			}
			this.aByteArrayArray1 = new byte[256][256];
			for (local122 = 0; local122 < 256; local122++) {
				if (local122 != 32 && local122 != 160) {
					for (local94 = 0; local94 < 256; local94++) {
						if (local94 != 32 && local94 != 160) {
							this.aByteArrayArray1[local122][local94] = (byte) Class86.method19924(local78, local120, local49, this.aByteArray3, local46, local122, local94);
						}
					}
				}
			}
			this.anInt50 = (local46[32] + local49[32]) * 1399519477;
		} else {
			this.anInt50 = local9.method22478() * 1399519477;
		}
		local9.method22478();
		local9.method22478();
		this.anInt52 = local9.method22478() * 1271484663;
		this.anInt51 = local9.method22478() * -1770526733;
	}

	@OriginalMember(owner = "client!aar", name = "aj", descriptor = "([[B[[B[I[B[III)I", line = 82)
	static int method288(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!aar", name = "ai", descriptor = "(IC)I", line = 104)
	public int method289(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray1 == null ? 0 : this.aByteArrayArray1[arg0][arg1];
	}

	@OriginalMember(owner = "client!aar", name = "ag", descriptor = "(IC)I", line = 104)
	public int method290(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray1 == null ? 0 : this.aByteArrayArray1[arg0][arg1];
	}

	@OriginalMember(owner = "client!aar", name = "al", descriptor = "(IC)I", line = 104)
	public int method291(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray1 == null ? 0 : this.aByteArrayArray1[arg0][arg1];
	}

	@OriginalMember(owner = "client!aar", name = "ao", descriptor = "(IC)I", line = 104)
	public int method292(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray1 == null ? 0 : this.aByteArrayArray1[arg0][arg1];
	}

	@OriginalMember(owner = "client!aar", name = "y", descriptor = "(ICI)I", line = 104)
	public int method293(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray1 == null ? 0 : this.aByteArrayArray1[arg0][arg1];
	}

	@OriginalMember(owner = "client!aar", name = "ak", descriptor = "(I)I", line = 109)
	public int method294(@OriginalArg(0) int arg0) {
		return this.aByteArray3[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aar", name = "w", descriptor = "(II)I", line = 109)
	public int method295(@OriginalArg(0) int arg0) {
		return this.aByteArray3[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aar", name = "au", descriptor = "(I)I", line = 109)
	public int method296(@OriginalArg(0) int arg0) {
		return this.aByteArray3[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aar", name = "t", descriptor = "(Ljava/lang/String;I)I", line = 113)
	public int method297(@OriginalArg(0) String arg0) {
		return this.method299(arg0, null);
	}

	@OriginalMember(owner = "client!aar", name = "ax", descriptor = "(Ljava/lang/String;)I", line = 113)
	public int method298(@OriginalArg(0) String arg0) {
		return this.method299(arg0, null);
	}

	@OriginalMember(owner = "client!aar", name = "q", descriptor = "(Ljava/lang/String;[Lclient!aam;B)I", line = 117)
	public int method299(@OriginalArg(0) String arg0, @OriginalArg(1) Interface2[] arg1) {
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
						local21 = ' ';
					} else if (local40.equals("shy")) {
						local21 = '\u00ad';
					} else if (local40.equals("times")) {
						local21 = '×';
					} else if (local40.equals("euro")) {
						local21 = '\u0080';
					} else if (local40.equals("copy")) {
						local21 = '©';
					} else {
						if (!local40.equals("reg")) {
							@Pc(111) int local111;
							if (local40.startsWith("img=") && arg1 != null) {
								try {
									local111 = Class679.method36041(local40.substring(4));
									local9 += arg1[local111].method18121();
									local7 = -1;
								} catch (@Pc(122) Exception local122) {
								}
								continue;
							}
							if (local40.startsWith("sprite=") && this.anInterface1_1 != null) {
								try {
									@Pc(132) boolean local132 = true;
									@Pc(136) int local136 = local40.indexOf(44);
									if (local136 == -1) {
										local111 = Class679.method36041(local40.substring(7));
									} else {
										local111 = Class679.method36041(local40.substring(7, local136));
									}
									local9 += this.anInterface1_1.method28619(local111);
									local7 = -1;
								} catch (@Pc(165) Exception local165) {
								}
							}
							continue;
						}
						local21 = '®';
					}
				}
				if (local5 == -1) {
					local9 += this.aByteArray3[Class544.method30950(local21) & 0xFF] & 0xFF;
					if (this.aByteArrayArray1 != null && local7 != -1) {
						local9 += this.aByteArrayArray1[local7][local21];
					}
					local7 = local21;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!aar", name = "x", descriptor = "(Ljava/lang/String;I[Lclient!aam;B)Ljava/lang/String;", line = 172)
	public String method300(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2) {
		if (this.method299(arg0, arg2) <= arg1) {
			return arg0;
		}
		@Pc(16) int local16 = arg1 - this.method299("...", null);
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
						local36 = ' ';
					} else if (local55.equals("shy")) {
						local36 = '\u00ad';
					} else if (local55.equals("times")) {
						local36 = '×';
					} else if (local55.equals("euro")) {
						local36 = '\u0080';
					} else if (local55.equals("copy")) {
						local36 = '©';
					} else {
						if (!local55.equals("reg")) {
							@Pc(125) int local125;
							if (local55.startsWith("img=") && arg2 != null) {
								try {
									local125 = Class679.method36041(local55.substring(4));
									local22 += arg2[local125].method18121();
									local20 = -1;
									if (local22 > local16) {
										return local27 + "...";
									}
									local27 = arg0.substring(0, local29 + 1);
								} catch (@Pc(155) Exception local155) {
								}
								continue;
							}
							if (local55.startsWith("sprite=") && this.anInterface1_1 != null) {
								try {
									@Pc(165) boolean local165 = true;
									@Pc(169) int local169 = local55.indexOf(44);
									if (local169 == -1) {
										local125 = Class679.method36041(local55.substring(7));
									} else {
										local125 = Class679.method36041(local55.substring(7, local169));
									}
									local22 += this.anInterface1_1.method28619(local125);
									local20 = -1;
									if (local22 > local16) {
										return local27 + "...";
									}
									local27 = arg0.substring(0, local29 + 1);
								} catch (@Pc(217) Exception local217) {
								}
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local18 == -1) {
					local22 += this.aByteArray3[Class544.method30950(local36) & 0xFF] & 0xFF;
					if (this.aByteArrayArray1 != null && local20 != -1) {
						local22 += this.aByteArrayArray1[local20][local36];
					}
					local20 = local36;
					@Pc(253) int local253 = local22;
					if (this.aByteArrayArray1 != null) {
						local253 = local22 + this.aByteArrayArray1[local36][46];
					}
					if (local253 > local16) {
						return local27 + "...";
					}
					local27 = arg0.substring(0, local29 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!aar", name = "ar", descriptor = "(Ljava/lang/String;I[Lclient!aam;)Ljava/lang/String;", line = 172)
	public String method301(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2) {
		if (this.method299(arg0, arg2) <= arg1) {
			return arg0;
		}
		@Pc(16) int local16 = arg1 - this.method299("...", null);
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
						local36 = ' ';
					} else if (local55.equals("shy")) {
						local36 = '\u00ad';
					} else if (local55.equals("times")) {
						local36 = '×';
					} else if (local55.equals("euro")) {
						local36 = '\u0080';
					} else if (local55.equals("copy")) {
						local36 = '©';
					} else {
						if (!local55.equals("reg")) {
							@Pc(125) int local125;
							if (local55.startsWith("img=") && arg2 != null) {
								try {
									local125 = Class679.method36041(local55.substring(4));
									local22 += arg2[local125].method18121();
									local20 = -1;
									if (local22 > local16) {
										return local27 + "...";
									}
									local27 = arg0.substring(0, local29 + 1);
								} catch (@Pc(155) Exception local155) {
								}
								continue;
							}
							if (local55.startsWith("sprite=") && this.anInterface1_1 != null) {
								try {
									@Pc(165) boolean local165 = true;
									@Pc(169) int local169 = local55.indexOf(44);
									if (local169 == -1) {
										local125 = Class679.method36041(local55.substring(7));
									} else {
										local125 = Class679.method36041(local55.substring(7, local169));
									}
									local22 += this.anInterface1_1.method28619(local125);
									local20 = -1;
									if (local22 > local16) {
										return local27 + "...";
									}
									local27 = arg0.substring(0, local29 + 1);
								} catch (@Pc(217) Exception local217) {
								}
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local18 == -1) {
					local22 += this.aByteArray3[Class544.method30950(local36) & 0xFF] & 0xFF;
					if (this.aByteArrayArray1 != null && local20 != -1) {
						local22 += this.aByteArrayArray1[local20][local36];
					}
					local20 = local36;
					@Pc(253) int local253 = local22;
					if (this.aByteArrayArray1 != null) {
						local253 = local22 + this.aByteArrayArray1[local36][46];
					}
					if (local253 > local16) {
						return local27 + "...";
					}
					local27 = arg0.substring(0, local29 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!aar", name = "ad", descriptor = "(Ljava/lang/String;I[Lclient!aam;)Ljava/lang/String;", line = 172)
	public String method302(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2) {
		if (this.method299(arg0, arg2) <= arg1) {
			return arg0;
		}
		@Pc(16) int local16 = arg1 - this.method299("...", null);
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
						local36 = ' ';
					} else if (local55.equals("shy")) {
						local36 = '\u00ad';
					} else if (local55.equals("times")) {
						local36 = '×';
					} else if (local55.equals("euro")) {
						local36 = '\u0080';
					} else if (local55.equals("copy")) {
						local36 = '©';
					} else {
						if (!local55.equals("reg")) {
							@Pc(125) int local125;
							if (local55.startsWith("img=") && arg2 != null) {
								try {
									local125 = Class679.method36041(local55.substring(4));
									local22 += arg2[local125].method18121();
									local20 = -1;
									if (local22 > local16) {
										return local27 + "...";
									}
									local27 = arg0.substring(0, local29 + 1);
								} catch (@Pc(155) Exception local155) {
								}
								continue;
							}
							if (local55.startsWith("sprite=") && this.anInterface1_1 != null) {
								try {
									@Pc(165) boolean local165 = true;
									@Pc(169) int local169 = local55.indexOf(44);
									if (local169 == -1) {
										local125 = Class679.method36041(local55.substring(7));
									} else {
										local125 = Class679.method36041(local55.substring(7, local169));
									}
									local22 += this.anInterface1_1.method28619(local125);
									local20 = -1;
									if (local22 > local16) {
										return local27 + "...";
									}
									local27 = arg0.substring(0, local29 + 1);
								} catch (@Pc(217) Exception local217) {
								}
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local18 == -1) {
					local22 += this.aByteArray3[Class544.method30950(local36) & 0xFF] & 0xFF;
					if (this.aByteArrayArray1 != null && local20 != -1) {
						local22 += this.aByteArrayArray1[local20][local36];
					}
					local20 = local36;
					@Pc(253) int local253 = local22;
					if (this.aByteArrayArray1 != null) {
						local253 = local22 + this.aByteArrayArray1[local36][46];
					}
					if (local253 > local16) {
						return local27 + "...";
					}
					local27 = arg0.substring(0, local29 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!aar", name = "d", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;[Lclient!aam;I)I", line = 237)
	public int method303(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Interface2[] arg3) {
		return this.method305(arg0, arg1, arg2, arg3, true);
	}

	@OriginalMember(owner = "client!aar", name = "at", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;[Lclient!aam;Z)I", line = 241)
	int method304(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Interface2[] arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = -1;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = -1;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(36) int local36 = Class544.method30950(arg0.charAt(local25)) & 0xFF;
			@Pc(38) int local38 = 0;
			if (local36 == 60) {
				local16 = local25;
			} else {
				@Pc(53) int local53;
				if (local16 == -1) {
					local53 = local25;
					local38 += this.method295(local36);
					if (this.aByteArrayArray1 != null && local18 != -1) {
						local38 += this.aByteArrayArray1[local18][local36];
					}
					local18 = local36;
				} else {
					if (local36 != 62) {
						continue;
					}
					local53 = local16;
					@Pc(60) String local60 = arg0.substring(local16 + 1, local25);
					local16 = -1;
					if (local60.equals("br")) {
						arg2[local20] = arg0.substring(local8, local25 + 1);
						local20++;
						if (local20 >= arg2.length) {
							return 0;
						}
						local8 = local25 + 1;
						local6 = 0;
						local10 = -1;
						local18 = -1;
						continue;
					}
					if (local60.equals("lt")) {
						local38 += this.method295(60);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][60];
						}
						local18 = 60;
					} else if (local60.equals("gt")) {
						local38 += this.method295(62);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][62];
						}
						local18 = 62;
					} else if (local60.equals("nbsp")) {
						local38 += this.method295(160);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][160];
						}
						local18 = 160;
					} else if (local60.equals("shy")) {
						local38 += this.method295(173);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][173];
						}
						local18 = 173;
					} else if (local60.equals("times")) {
						local38 += this.method295(215);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][215];
						}
						local18 = 215;
					} else if (local60.equals("euro")) {
						local38 += this.method295(128);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][128];
						}
						local18 = 128;
					} else if (local60.equals("copy")) {
						local38 += this.method295(169);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][169];
						}
						local18 = 169;
					} else if (local60.equals("reg")) {
						local38 += this.method295(174);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][174];
						}
						local18 = 174;
					} else {
						@Pc(338) int local338;
						if (local60.startsWith("img=") && arg3 != null) {
							try {
								local338 = Class679.method36041(local60.substring(4));
								local38 += arg3[local338].method18121();
								local18 = -1;
							} catch (@Pc(349) Exception local349) {
							}
						} else if (local60.startsWith("sprite=") && this.anInterface1_1 != null) {
							try {
								@Pc(360) boolean local360 = true;
								@Pc(364) int local364 = local60.indexOf(44);
								if (local364 == -1) {
									local338 = Class679.method36041(local60.substring(7));
								} else {
									local338 = Class679.method36041(local60.substring(7, local364));
								}
								@Pc(388) int local388 = local38 + this.anInterface1_1.method28619(local338);
								local18 = -1;
							} catch (@Pc(393) Exception local393) {
							}
							continue;
						}
					}
					local36 = -1;
				}
				if (local38 > 0) {
					local6 += local38;
					if (arg1 != null) {
						if (local36 == 32) {
							local10 = local25;
							local12 = local6;
							local14 = arg4 ? 1 : 0;
						}
						if (local6 > arg1[local20 < arg1.length ? local20 : arg1.length - 1]) {
							if (local10 >= 0) {
								arg2[local20] = arg0.substring(local8, local10 + 1 - local14);
								local20++;
								if (local20 >= arg2.length) {
									return 0;
								}
								local8 = local10 + 1;
								local10 = -1;
								local6 -= local12;
								local18 = -1;
							} else {
								arg2[local20] = arg0.substring(local8, local53);
								local20++;
								if (local20 >= arg2.length) {
									return 0;
								}
								local8 = local53;
								local10 = -1;
								local6 = local38;
								local18 = -1;
							}
						}
						if (local36 == 45) {
							local10 = local25;
							local12 = local6;
							local14 = 0;
						}
					}
				}
			}
		}
		if (arg0.length() > local8) {
			arg2[local20] = arg0.substring(local8, arg0.length());
			local20++;
		}
		return local20;
	}

	@OriginalMember(owner = "client!aar", name = "s", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;[Lclient!aam;ZI)I", line = 241)
	int method305(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Interface2[] arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = -1;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = -1;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(36) int local36 = Class544.method30950(arg0.charAt(local25)) & 0xFF;
			@Pc(38) int local38 = 0;
			if (local36 == 60) {
				local16 = local25;
			} else {
				@Pc(53) int local53;
				if (local16 == -1) {
					local53 = local25;
					local38 += this.method295(local36);
					if (this.aByteArrayArray1 != null && local18 != -1) {
						local38 += this.aByteArrayArray1[local18][local36];
					}
					local18 = local36;
				} else {
					if (local36 != 62) {
						continue;
					}
					local53 = local16;
					@Pc(60) String local60 = arg0.substring(local16 + 1, local25);
					local16 = -1;
					if (local60.equals("br")) {
						arg2[local20] = arg0.substring(local8, local25 + 1);
						local20++;
						if (local20 >= arg2.length) {
							return 0;
						}
						local8 = local25 + 1;
						local6 = 0;
						local10 = -1;
						local18 = -1;
						continue;
					}
					if (local60.equals("lt")) {
						local38 += this.method295(60);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][60];
						}
						local18 = 60;
					} else if (local60.equals("gt")) {
						local38 += this.method295(62);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][62];
						}
						local18 = 62;
					} else if (local60.equals("nbsp")) {
						local38 += this.method295(160);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][160];
						}
						local18 = 160;
					} else if (local60.equals("shy")) {
						local38 += this.method295(173);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][173];
						}
						local18 = 173;
					} else if (local60.equals("times")) {
						local38 += this.method295(215);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][215];
						}
						local18 = 215;
					} else if (local60.equals("euro")) {
						local38 += this.method295(128);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][128];
						}
						local18 = 128;
					} else if (local60.equals("copy")) {
						local38 += this.method295(169);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][169];
						}
						local18 = 169;
					} else if (local60.equals("reg")) {
						local38 += this.method295(174);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][174];
						}
						local18 = 174;
					} else {
						@Pc(338) int local338;
						if (local60.startsWith("img=") && arg3 != null) {
							try {
								local338 = Class679.method36041(local60.substring(4));
								local38 += arg3[local338].method18121();
								local18 = -1;
							} catch (@Pc(349) Exception local349) {
							}
						} else if (local60.startsWith("sprite=") && this.anInterface1_1 != null) {
							try {
								@Pc(360) boolean local360 = true;
								@Pc(364) int local364 = local60.indexOf(44);
								if (local364 == -1) {
									local338 = Class679.method36041(local60.substring(7));
								} else {
									local338 = Class679.method36041(local60.substring(7, local364));
								}
								@Pc(388) int local388 = local38 + this.anInterface1_1.method28619(local338);
								local18 = -1;
							} catch (@Pc(393) Exception local393) {
							}
							continue;
						}
					}
					local36 = -1;
				}
				if (local38 > 0) {
					local6 += local38;
					if (arg1 != null) {
						if (local36 == 32) {
							local10 = local25;
							local12 = local6;
							local14 = arg4 ? 1 : 0;
						}
						if (local6 > arg1[local20 < arg1.length ? local20 : arg1.length - 1]) {
							if (local10 >= 0) {
								arg2[local20] = arg0.substring(local8, local10 + 1 - local14);
								local20++;
								if (local20 >= arg2.length) {
									return 0;
								}
								local8 = local10 + 1;
								local10 = -1;
								local6 -= local12;
								local18 = -1;
							} else {
								arg2[local20] = arg0.substring(local8, local53);
								local20++;
								if (local20 >= arg2.length) {
									return 0;
								}
								local8 = local53;
								local10 = -1;
								local6 = local38;
								local18 = -1;
							}
						}
						if (local36 == 45) {
							local10 = local25;
							local12 = local6;
							local14 = 0;
						}
					}
				}
			}
		}
		if (arg0.length() > local8) {
			arg2[local20] = arg0.substring(local8, arg0.length());
			local20++;
		}
		return local20;
	}

	@OriginalMember(owner = "client!aar", name = "ac", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;[Lclient!aam;Z)I", line = 241)
	int method306(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Interface2[] arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = -1;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = -1;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(36) int local36 = Class544.method30950(arg0.charAt(local25)) & 0xFF;
			@Pc(38) int local38 = 0;
			if (local36 == 60) {
				local16 = local25;
			} else {
				@Pc(53) int local53;
				if (local16 == -1) {
					local53 = local25;
					local38 += this.method295(local36);
					if (this.aByteArrayArray1 != null && local18 != -1) {
						local38 += this.aByteArrayArray1[local18][local36];
					}
					local18 = local36;
				} else {
					if (local36 != 62) {
						continue;
					}
					local53 = local16;
					@Pc(60) String local60 = arg0.substring(local16 + 1, local25);
					local16 = -1;
					if (local60.equals("br")) {
						arg2[local20] = arg0.substring(local8, local25 + 1);
						local20++;
						if (local20 >= arg2.length) {
							return 0;
						}
						local8 = local25 + 1;
						local6 = 0;
						local10 = -1;
						local18 = -1;
						continue;
					}
					if (local60.equals("lt")) {
						local38 += this.method295(60);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][60];
						}
						local18 = 60;
					} else if (local60.equals("gt")) {
						local38 += this.method295(62);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][62];
						}
						local18 = 62;
					} else if (local60.equals("nbsp")) {
						local38 += this.method295(160);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][160];
						}
						local18 = 160;
					} else if (local60.equals("shy")) {
						local38 += this.method295(173);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][173];
						}
						local18 = 173;
					} else if (local60.equals("times")) {
						local38 += this.method295(215);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][215];
						}
						local18 = 215;
					} else if (local60.equals("euro")) {
						local38 += this.method295(128);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][128];
						}
						local18 = 128;
					} else if (local60.equals("copy")) {
						local38 += this.method295(169);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][169];
						}
						local18 = 169;
					} else if (local60.equals("reg")) {
						local38 += this.method295(174);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][174];
						}
						local18 = 174;
					} else {
						@Pc(338) int local338;
						if (local60.startsWith("img=") && arg3 != null) {
							try {
								local338 = Class679.method36041(local60.substring(4));
								local38 += arg3[local338].method18121();
								local18 = -1;
							} catch (@Pc(349) Exception local349) {
							}
						} else if (local60.startsWith("sprite=") && this.anInterface1_1 != null) {
							try {
								@Pc(360) boolean local360 = true;
								@Pc(364) int local364 = local60.indexOf(44);
								if (local364 == -1) {
									local338 = Class679.method36041(local60.substring(7));
								} else {
									local338 = Class679.method36041(local60.substring(7, local364));
								}
								@Pc(388) int local388 = local38 + this.anInterface1_1.method28619(local338);
								local18 = -1;
							} catch (@Pc(393) Exception local393) {
							}
							continue;
						}
					}
					local36 = -1;
				}
				if (local38 > 0) {
					local6 += local38;
					if (arg1 != null) {
						if (local36 == 32) {
							local10 = local25;
							local12 = local6;
							local14 = arg4 ? 1 : 0;
						}
						if (local6 > arg1[local20 < arg1.length ? local20 : arg1.length - 1]) {
							if (local10 >= 0) {
								arg2[local20] = arg0.substring(local8, local10 + 1 - local14);
								local20++;
								if (local20 >= arg2.length) {
									return 0;
								}
								local8 = local10 + 1;
								local10 = -1;
								local6 -= local12;
								local18 = -1;
							} else {
								arg2[local20] = arg0.substring(local8, local53);
								local20++;
								if (local20 >= arg2.length) {
									return 0;
								}
								local8 = local53;
								local10 = -1;
								local6 = local38;
								local18 = -1;
							}
						}
						if (local36 == 45) {
							local10 = local25;
							local12 = local6;
							local14 = 0;
						}
					}
				}
			}
		}
		if (arg0.length() > local8) {
			arg2[local20] = arg0.substring(local8, arg0.length());
			local20++;
		}
		return local20;
	}

	@OriginalMember(owner = "client!aar", name = "av", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;[Lclient!aam;Z)I", line = 241)
	int method307(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Interface2[] arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = -1;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = -1;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(36) int local36 = Class544.method30950(arg0.charAt(local25)) & 0xFF;
			@Pc(38) int local38 = 0;
			if (local36 == 60) {
				local16 = local25;
			} else {
				@Pc(53) int local53;
				if (local16 == -1) {
					local53 = local25;
					local38 += this.method295(local36);
					if (this.aByteArrayArray1 != null && local18 != -1) {
						local38 += this.aByteArrayArray1[local18][local36];
					}
					local18 = local36;
				} else {
					if (local36 != 62) {
						continue;
					}
					local53 = local16;
					@Pc(60) String local60 = arg0.substring(local16 + 1, local25);
					local16 = -1;
					if (local60.equals("br")) {
						arg2[local20] = arg0.substring(local8, local25 + 1);
						local20++;
						if (local20 >= arg2.length) {
							return 0;
						}
						local8 = local25 + 1;
						local6 = 0;
						local10 = -1;
						local18 = -1;
						continue;
					}
					if (local60.equals("lt")) {
						local38 += this.method295(60);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][60];
						}
						local18 = 60;
					} else if (local60.equals("gt")) {
						local38 += this.method295(62);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][62];
						}
						local18 = 62;
					} else if (local60.equals("nbsp")) {
						local38 += this.method295(160);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][160];
						}
						local18 = 160;
					} else if (local60.equals("shy")) {
						local38 += this.method295(173);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][173];
						}
						local18 = 173;
					} else if (local60.equals("times")) {
						local38 += this.method295(215);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][215];
						}
						local18 = 215;
					} else if (local60.equals("euro")) {
						local38 += this.method295(128);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][128];
						}
						local18 = 128;
					} else if (local60.equals("copy")) {
						local38 += this.method295(169);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][169];
						}
						local18 = 169;
					} else if (local60.equals("reg")) {
						local38 += this.method295(174);
						if (this.aByteArrayArray1 != null && local18 != -1) {
							local38 += this.aByteArrayArray1[local18][174];
						}
						local18 = 174;
					} else {
						@Pc(338) int local338;
						if (local60.startsWith("img=") && arg3 != null) {
							try {
								local338 = Class679.method36041(local60.substring(4));
								local38 += arg3[local338].method18121();
								local18 = -1;
							} catch (@Pc(349) Exception local349) {
							}
						} else if (local60.startsWith("sprite=") && this.anInterface1_1 != null) {
							try {
								@Pc(360) boolean local360 = true;
								@Pc(364) int local364 = local60.indexOf(44);
								if (local364 == -1) {
									local338 = Class679.method36041(local60.substring(7));
								} else {
									local338 = Class679.method36041(local60.substring(7, local364));
								}
								@Pc(388) int local388 = local38 + this.anInterface1_1.method28619(local338);
								local18 = -1;
							} catch (@Pc(393) Exception local393) {
							}
							continue;
						}
					}
					local36 = -1;
				}
				if (local38 > 0) {
					local6 += local38;
					if (arg1 != null) {
						if (local36 == 32) {
							local10 = local25;
							local12 = local6;
							local14 = arg4 ? 1 : 0;
						}
						if (local6 > arg1[local20 < arg1.length ? local20 : arg1.length - 1]) {
							if (local10 >= 0) {
								arg2[local20] = arg0.substring(local8, local10 + 1 - local14);
								local20++;
								if (local20 >= arg2.length) {
									return 0;
								}
								local8 = local10 + 1;
								local10 = -1;
								local6 -= local12;
								local18 = -1;
							} else {
								arg2[local20] = arg0.substring(local8, local53);
								local20++;
								if (local20 >= arg2.length) {
									return 0;
								}
								local8 = local53;
								local10 = -1;
								local6 = local38;
								local18 = -1;
							}
						}
						if (local36 == 45) {
							local10 = local25;
							local12 = local6;
							local14 = 0;
						}
					}
				}
			}
		}
		if (arg0.length() > local8) {
			arg2[local20] = arg0.substring(local8, arg0.length());
			local20++;
		}
		return local20;
	}

	@OriginalMember(owner = "client!aar", name = "r", descriptor = "(Ljava/lang/String;I[Lclient!aam;I)I", line = 386)
	public int method308(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2) {
		@Pc(12) int local12 = this.method303(arg0, new int[] { arg1 }, aStringArray3, arg2);
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(27) int local27 = this.method299(aStringArray3[local16], arg2);
			if (local27 > local14) {
				local14 = local27;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!aar", name = "g", descriptor = "(Ljava/lang/String;I[Lclient!aam;B)I", line = 396)
	public int method309(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2) {
		return this.method303(arg0, new int[] { arg1 }, aStringArray3, arg2);
	}

	@OriginalMember(owner = "client!aar", name = "ae", descriptor = "(Ljava/lang/String;I[Lclient!aam;)I", line = 396)
	public int method310(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2) {
		return this.method303(arg0, new int[] { arg1 }, aStringArray3, arg2);
	}

	@OriginalMember(owner = "client!aar", name = "z", descriptor = "(Ljava/lang/String;I[Lclient!aam;II)Ljava/lang/String;", line = 400)
	public String method311(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = this.method303(arg0, new int[] { arg1 }, aStringArray3, arg2);
		return arg3 >= 0 && arg3 < local12 ? aStringArray3[arg3] : null;
	}

	@OriginalMember(owner = "client!aar", name = "j", descriptor = "(Ljava/lang/String;II[Lclient!aam;I)I", line = 406)
	public int method312(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface2[] arg3) {
		if (arg2 == 0) {
			arg2 = this.anInt50 * -1062735011;
		}
		@Pc(19) int local19 = this.method303(arg0, new int[] { arg1 }, aStringArray3, arg3);
		@Pc(25) int local25 = arg2 * (local19 - 1);
		return local25 + this.anInt52 * 102396103 + this.anInt51 * 728893755;
	}

	@OriginalMember(owner = "client!aar", name = "i", descriptor = "(Ljava/lang/String;III[Lclient!aam;I)Ljava/awt/Point;", line = 413)
	public Point method313(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface2[] arg4) {
		if (arg3 <= 0) {
			return new Point(0, arg2 + this.anInt52 * 102396103);
		}
		if (arg3 > arg0.length()) {
			arg3 = arg0.length();
		}
		if (arg2 == 0) {
			arg2 = this.anInt50 * -1062735011;
		}
		@Pc(40) int local40 = this.method305(arg0, new int[] { arg1 }, aStringArray3, arg4, false);
		@Pc(42) int local42 = 0;
		for (@Pc(44) int local44 = 0; local44 < local40; local44++) {
			@Pc(52) int local52 = aStringArray3[local44].length();
			if (local42 + local52 > arg3 || local44 == local40 - 1 && arg3 == arg0.length()) {
				@Pc(71) String local71 = arg0.substring(local42, arg3);
				if (local71.endsWith("<br>")) {
					local71 = "";
					@Pc(80) int local80 = local42 + local52;
					local44++;
				}
				@Pc(88) int local88 = this.method299(local71, arg4);
				@Pc(97) int local97 = this.anInt52 * 102396103 + local44 * arg2;
				return new Point(local88, local97);
			}
			local42 += local52;
		}
		return null;
	}

	@OriginalMember(owner = "client!aar", name = "ah", descriptor = "(Ljava/lang/String;III[Lclient!aam;)Ljava/awt/Point;", line = 413)
	public Point method314(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface2[] arg4) {
		if (arg3 <= 0) {
			return new Point(0, arg2 + this.anInt52 * 102396103);
		}
		if (arg3 > arg0.length()) {
			arg3 = arg0.length();
		}
		if (arg2 == 0) {
			arg2 = this.anInt50 * -1062735011;
		}
		@Pc(40) int local40 = this.method305(arg0, new int[] { arg1 }, aStringArray3, arg4, false);
		@Pc(42) int local42 = 0;
		for (@Pc(44) int local44 = 0; local44 < local40; local44++) {
			@Pc(52) int local52 = aStringArray3[local44].length();
			if (local42 + local52 > arg3 || local44 == local40 - 1 && arg3 == arg0.length()) {
				@Pc(71) String local71 = arg0.substring(local42, arg3);
				if (local71.endsWith("<br>")) {
					local71 = "";
					@Pc(80) int local80 = local42 + local52;
					local44++;
				}
				@Pc(88) int local88 = this.method299(local71, arg4);
				@Pc(97) int local97 = this.anInt52 * 102396103 + local44 * arg2;
				return new Point(local88, local97);
			}
			local42 += local52;
		}
		return null;
	}

	@OriginalMember(owner = "client!aar", name = "as", descriptor = "(Ljava/lang/String;III[Lclient!aam;)Ljava/awt/Point;", line = 413)
	public Point method315(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface2[] arg4) {
		if (arg3 <= 0) {
			return new Point(0, arg2 + this.anInt52 * 102396103);
		}
		if (arg3 > arg0.length()) {
			arg3 = arg0.length();
		}
		if (arg2 == 0) {
			arg2 = this.anInt50 * -1062735011;
		}
		@Pc(40) int local40 = this.method305(arg0, new int[] { arg1 }, aStringArray3, arg4, false);
		@Pc(42) int local42 = 0;
		for (@Pc(44) int local44 = 0; local44 < local40; local44++) {
			@Pc(52) int local52 = aStringArray3[local44].length();
			if (local42 + local52 > arg3 || local44 == local40 - 1 && arg3 == arg0.length()) {
				@Pc(71) String local71 = arg0.substring(local42, arg3);
				if (local71.endsWith("<br>")) {
					local71 = "";
					@Pc(80) int local80 = local42 + local52;
					local44++;
				}
				@Pc(88) int local88 = this.method299(local71, arg4);
				@Pc(97) int local97 = this.anInt52 * 102396103 + local44 * arg2;
				return new Point(local88, local97);
			}
			local42 += local52;
		}
		return null;
	}

	@OriginalMember(owner = "client!aar", name = "ay", descriptor = "(Ljava/lang/String;IIII[Lclient!aam;)I", line = 439)
	public int method316(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface2[] arg5) {
		if (arg2 == 0) {
			arg2 = this.anInt50 * -1062735011;
		}
		@Pc(21) int local21 = this.method305(arg0, new int[] { arg1 }, aStringArray3, arg5, false);
		if (local21 == 0) {
			return 0;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		arg4 /= arg2;
		if (arg4 >= local21) {
			arg4 = local21 - 1;
		}
		@Pc(44) String local44 = aStringArray3[arg4];
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(50) int local50;
		for (local50 = 0; local50 < arg3 && local46 < local44.length(); local50 = this.method299(local44.substring(0, local46), arg5)) {
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
			local46 += aStringArray3[local89].length();
		}
		return local46;
	}

	@OriginalMember(owner = "client!aar", name = "k", descriptor = "(Ljava/lang/String;IIII[Lclient!aam;B)I", line = 439)
	public int method317(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface2[] arg5) {
		if (arg2 == 0) {
			arg2 = this.anInt50 * -1062735011;
		}
		@Pc(21) int local21 = this.method305(arg0, new int[] { arg1 }, aStringArray3, arg5, false);
		if (local21 == 0) {
			return 0;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		arg4 /= arg2;
		if (arg4 >= local21) {
			arg4 = local21 - 1;
		}
		@Pc(44) String local44 = aStringArray3[arg4];
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(50) int local50;
		for (local50 = 0; local50 < arg3 && local46 < local44.length(); local50 = this.method299(local44.substring(0, local46), arg5)) {
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
			local46 += aStringArray3[local89].length();
		}
		return local46;
	}

	@OriginalMember(owner = "client!aar", name = "aq", descriptor = "(Ljava/lang/String;IIII[Lclient!aam;)I", line = 439)
	public int method318(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface2[] arg5) {
		if (arg2 == 0) {
			arg2 = this.anInt50 * -1062735011;
		}
		@Pc(21) int local21 = this.method305(arg0, new int[] { arg1 }, aStringArray3, arg5, false);
		if (local21 == 0) {
			return 0;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		arg4 /= arg2;
		if (arg4 >= local21) {
			arg4 = local21 - 1;
		}
		@Pc(44) String local44 = aStringArray3[arg4];
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(50) int local50;
		for (local50 = 0; local50 < arg3 && local46 < local44.length(); local50 = this.method299(local44.substring(0, local46), arg5)) {
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
			local46 += aStringArray3[local89].length();
		}
		return local46;
	}

	@OriginalMember(owner = "client!aar", name = "am", descriptor = "(Ljava/lang/String;IIII[Lclient!aam;)I", line = 439)
	public int method319(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface2[] arg5) {
		if (arg2 == 0) {
			arg2 = this.anInt50 * -1062735011;
		}
		@Pc(21) int local21 = this.method305(arg0, new int[] { arg1 }, aStringArray3, arg5, false);
		if (local21 == 0) {
			return 0;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		arg4 /= arg2;
		if (arg4 >= local21) {
			arg4 = local21 - 1;
		}
		@Pc(44) String local44 = aStringArray3[arg4];
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(50) int local50;
		for (local50 = 0; local50 < arg3 && local46 < local44.length(); local50 = this.method299(local44.substring(0, local46), arg5)) {
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
			local46 += aStringArray3[local89].length();
		}
		return local46;
	}

	@OriginalMember(owner = "client!aar", name = "cz", descriptor = "(Lclient!yf;I)V", line = 4900)
	static final void method320(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class77_Sub13.method21761(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!aar", name = "ik", descriptor = "(Lclient!yf;B)V", line = 6083)
	static final void method321(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class196.method25465(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!aar", name = "aui", descriptor = "(Lclient!yf;I)V", line = 12999)
	static final void method322(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class349.anInt4495 * -383096907;
	}
}
