package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public class Class529 {

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
	static int anInt5305;

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "[C")
	static char[] aCharArray4 = new char[64];

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "[C")
	static char[] aCharArray3;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "[I")
	static int[] anIntArray493;

	static {
		@Pc(4) int local4;
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray4[local4] = (char) (local4 + 65);
		}
		for (local4 = 26; local4 < 52; local4++) {
			aCharArray4[local4] = (char) (local4 + 97 - 26);
		}
		for (local4 = 52; local4 < 62; local4++) {
			aCharArray4[local4] = (char) (local4 + 48 - 52);
		}
		aCharArray4[62] = '+';
		aCharArray4[63] = '/';
		aCharArray3 = new char[64];
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray3[local4] = (char) (local4 + 65);
		}
		for (local4 = 26; local4 < 52; local4++) {
			aCharArray3[local4] = (char) (local4 + 97 - 26);
		}
		for (local4 = 52; local4 < 62; local4++) {
			aCharArray3[local4] = (char) (local4 + 48 - 52);
		}
		aCharArray3[62] = '*';
		aCharArray3[63] = '-';
		anIntArray493 = new int[128];
		for (local4 = 0; local4 < anIntArray493.length; local4++) {
			anIntArray493[local4] = -1;
		}
		for (local4 = 65; local4 <= 90; local4++) {
			anIntArray493[local4] = local4 - 65;
		}
		for (local4 = 97; local4 <= 122; local4++) {
			anIntArray493[local4] = local4 - 97 + 26;
		}
		for (local4 = 48; local4 <= 57; local4++) {
			anIntArray493[local4] = local4 - 48 + 52;
		}
		@Pc(173) int[] local173 = anIntArray493;
		anIntArray493[43] = 62;
		local173[42] = 62;
		@Pc(183) int[] local183 = anIntArray493;
		anIntArray493[47] = 63;
		local183[45] = 63;
	}

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "(I)[Lclient!vz;", line = 18)
	static Class543[] method32459() {
		return new Class543[] { Class543.aClass543_4, Class543.aClass543_7, Class543.aClass543_6, Class543.aClass543_9, Class543.aClass543_5, Class543.aClass543_8 };
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V", line = 42)
	Class529() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!vj", name = "x", descriptor = "(C)I", line = 47)
	static int method32454(@OriginalArg(0) char arg0) {
		return arg0 >= 0 && arg0 < anIntArray493.length ? anIntArray493[arg0] : -1;
	}

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "([BII)Ljava/lang/String;", line = 56)
	static String method32452(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = arg1; local5 < arg1 + arg2; local5 += 3) {
			@Pc(16) int local16 = arg0[local5] & 0xFF;
			local3.append(aCharArray4[local16 >>> 2]);
			if (local5 < arg2 - 1) {
				@Pc(37) int local37 = arg0[local5 + 1] & 0xFF;
				local3.append(aCharArray4[(local16 & 0x3) << 4 | local37 >>> 4]);
				if (local5 < arg2 - 2) {
					@Pc(64) int local64 = arg0[local5 + 2] & 0xFF;
					local3.append(aCharArray4[(local37 & 0xF) << 2 | local64 >>> 6]).append(aCharArray4[local64 & 0x3F]);
				} else {
					local3.append(aCharArray4[(local37 & 0xF) << 2]).append('=');
				}
			} else {
				local3.append(aCharArray4[(local16 & 0x3) << 4]).append('=').append('=');
			}
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "(Ljava/lang/String;[BI)I", line = 75)
	static int method32458(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = arg2;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6 += 4) {
			@Pc(15) int local15 = Class80.method21595(arg0.charAt(local6));
			@Pc(30) int local30 = local6 + 1 < local4 ? Class80.method21595(arg0.charAt(local6 + 1)) : -1;
			@Pc(45) int local45 = local6 + 2 < local4 ? Class80.method21595(arg0.charAt(local6 + 2)) : -1;
			@Pc(60) int local60 = local6 + 3 < local4 ? Class80.method21595(arg0.charAt(local6 + 3)) : -1;
			arg1[arg2++] = (byte) (local15 << 2 | local30 >>> 4);
			if (local45 == -1) {
				break;
			}
			arg1[arg2++] = (byte) ((local30 & 0xF) << 4 | local45 >>> 2);
			if (local60 == -1) {
				break;
			}
			arg1[arg2++] = (byte) ((local45 & 0x3) << 6 | local60);
		}
		return arg2 - local1;
	}

	@OriginalMember(owner = "client!vj", name = "z", descriptor = "(Ljava/lang/String;)[B", line = 92)
	public static byte[] method32453(@OriginalArg(0) String arg0) {
		@Pc(2) int local2 = arg0.length();
		if (local2 == 0) {
			return new byte[0];
		}
		@Pc(13) int local13 = local2 + 3 & 0xFFFFFFFC;
		@Pc(19) int local19 = local13 / 4 * 3;
		if (local13 - 2 >= local2 || Class80.method21595(arg0.charAt(local13 - 2)) == -1) {
			local19 -= 2;
		} else if (local13 - 1 >= local2 || Class80.method21595(arg0.charAt(local13 - 1)) == -1) {
			local19--;
		}
		@Pc(53) byte[] local53 = new byte[local19];
		Class427.method27913(arg0, local53, 0);
		return local53;
	}

	@OriginalMember(owner = "client!vj", name = "y", descriptor = "(Ljava/lang/String;)[B", line = 92)
	public static byte[] method32455(@OriginalArg(0) String arg0) {
		@Pc(2) int local2 = arg0.length();
		if (local2 == 0) {
			return new byte[0];
		}
		@Pc(13) int local13 = local2 + 3 & 0xFFFFFFFC;
		@Pc(19) int local19 = local13 / 4 * 3;
		if (local13 - 2 >= local2 || Class80.method21595(arg0.charAt(local13 - 2)) == -1) {
			local19 -= 2;
		} else if (local13 - 1 >= local2 || Class80.method21595(arg0.charAt(local13 - 1)) == -1) {
			local19--;
		}
		@Pc(53) byte[] local53 = new byte[local19];
		Class427.method27913(arg0, local53, 0);
		return local53;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(Ljava/lang/String;)[B", line = 92)
	public static byte[] method32456(@OriginalArg(0) String arg0) {
		@Pc(2) int local2 = arg0.length();
		if (local2 == 0) {
			return new byte[0];
		}
		@Pc(13) int local13 = local2 + 3 & 0xFFFFFFFC;
		@Pc(19) int local19 = local13 / 4 * 3;
		if (local13 - 2 >= local2 || Class80.method21595(arg0.charAt(local13 - 2)) == -1) {
			local19 -= 2;
		} else if (local13 - 1 >= local2 || Class80.method21595(arg0.charAt(local13 - 1)) == -1) {
			local19--;
		}
		@Pc(53) byte[] local53 = new byte[local19];
		Class427.method27913(arg0, local53, 0);
		return local53;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(Ljava/lang/String;)[B", line = 92)
	public static byte[] method32457(@OriginalArg(0) String arg0) {
		@Pc(2) int local2 = arg0.length();
		if (local2 == 0) {
			return new byte[0];
		}
		@Pc(13) int local13 = local2 + 3 & 0xFFFFFFFC;
		@Pc(19) int local19 = local13 / 4 * 3;
		if (local13 - 2 >= local2 || Class80.method21595(arg0.charAt(local13 - 2)) == -1) {
			local19 -= 2;
		} else if (local13 - 1 >= local2 || Class80.method21595(arg0.charAt(local13 - 1)) == -1) {
			local19--;
		}
		@Pc(53) byte[] local53 = new byte[local19];
		Class427.method27913(arg0, local53, 0);
		return local53;
	}

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)Z", line = 156)
	static boolean method32460() {
		return Class21_Sub1.method3215(Class44.aClass483_5.aClass468_3);
	}

	@OriginalMember(owner = "client!vj", name = "bg", descriptor = "(Lclient!vs;I)V", line = 4222)
	static final void method32461(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(29) Class534 local29;
		if (arg0.aBoolean822) {
			local29 = arg0.aClass534_2;
		} else {
			local29 = arg0.aClass534_1;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local23 != -1 && local29.method32513(local13, local23) ? 1 : 0;
	}
}
