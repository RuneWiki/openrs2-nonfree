package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yd")
public class Class663 {

	@OriginalMember(owner = "client!yd", name = "hu", descriptor = "Lclient!aoy;")
	public static Class35_Sub21 aClass35_Sub21_1;

	@OriginalMember(owner = "client!yd", name = "p", descriptor = "[C")
	static char[] aCharArray7 = new char[64];

	@OriginalMember(owner = "client!yd", name = "c", descriptor = "[C")
	static char[] aCharArray5;

	@OriginalMember(owner = "client!yd", name = "v", descriptor = "[C")
	static char[] aCharArray6;

	@OriginalMember(owner = "client!yd", name = "l", descriptor = "[I")
	static int[] anIntArray533;

	static {
		@Pc(4) int local4;
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray7[local4] = (char) (local4 + 65);
		}
		for (local4 = 26; local4 < 52; local4++) {
			aCharArray7[local4] = (char) (local4 + 97 - 26);
		}
		for (local4 = 52; local4 < 62; local4++) {
			aCharArray7[local4] = (char) (local4 + 48 - 52);
		}
		aCharArray7[62] = '+';
		aCharArray7[63] = '/';
		aCharArray5 = new char[64];
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray5[local4] = (char) (local4 + 65);
		}
		for (local4 = 26; local4 < 52; local4++) {
			aCharArray5[local4] = (char) (local4 + 97 - 26);
		}
		for (local4 = 52; local4 < 62; local4++) {
			aCharArray5[local4] = (char) (local4 + 48 - 52);
		}
		aCharArray5[62] = '*';
		aCharArray5[63] = '-';
		aCharArray6 = new char[64];
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray6[local4] = (char) (local4 + 65);
		}
		for (local4 = 26; local4 < 52; local4++) {
			aCharArray6[local4] = (char) (local4 + 97 - 26);
		}
		for (local4 = 52; local4 < 62; local4++) {
			aCharArray6[local4] = (char) (local4 + 48 - 52);
		}
		aCharArray6[62] = '-';
		aCharArray6[63] = '_';
		anIntArray533 = new int[128];
		for (local4 = 0; local4 < anIntArray533.length; local4++) {
			anIntArray533[local4] = -1;
		}
		for (local4 = 65; local4 <= 90; local4++) {
			anIntArray533[local4] = local4 - 65;
		}
		for (local4 = 97; local4 <= 122; local4++) {
			anIntArray533[local4] = local4 - 97 + 26;
		}
		for (local4 = 48; local4 <= 57; local4++) {
			anIntArray533[local4] = local4 - 48 + 52;
		}
		@Pc(230) int[] local230 = anIntArray533;
		anIntArray533[43] = 62;
		local230[42] = 62;
		@Pc(240) int[] local240 = anIntArray533;
		anIntArray533[47] = 63;
		local240[45] = 63;
	}

	@OriginalMember(owner = "client!yd", name = "<init>", descriptor = "()V", line = 53)
	Class663() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!yd", name = "l", descriptor = "([B)Ljava/lang/String;", line = 58)
	public static String method33100(@OriginalArg(0) byte[] arg0) {
		return Class358.method27971(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!yd", name = "y", descriptor = "([B)Ljava/lang/String;", line = 58)
	public static String method33101(@OriginalArg(0) byte[] arg0) {
		return Class358.method27971(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!yd", name = "w", descriptor = "([B)Ljava/lang/String;", line = 58)
	public static String method33102(@OriginalArg(0) byte[] arg0) {
		return Class358.method27971(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!yd", name = "v", descriptor = "([B)Ljava/lang/String;", line = 58)
	public static String method33103(@OriginalArg(0) byte[] arg0) {
		return Class358.method27971(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!yd", name = "q", descriptor = "([BII)Ljava/lang/String;", line = 62)
	static String method33104(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = arg1; local5 < arg2 + arg1; local5 += 3) {
			@Pc(16) int local16 = arg0[local5] & 0xFF;
			local3.append(aCharArray7[local16 >>> 2]);
			if (local5 < arg2 - 1) {
				@Pc(37) int local37 = arg0[local5 + 1] & 0xFF;
				local3.append(aCharArray7[(local16 & 0x3) << 4 | local37 >>> 4]);
				if (local5 < arg2 - 2) {
					@Pc(64) int local64 = arg0[local5 + 2] & 0xFF;
					local3.append(aCharArray7[(local37 & 0xF) << 2 | local64 >>> 6]).append(aCharArray7[local64 & 0x3F]);
				} else {
					local3.append(aCharArray7[(local37 & 0xF) << 2]).append('=');
				}
			} else {
				local3.append(aCharArray7[(local16 & 0x3) << 4]).append('=').append('=');
			}
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!yd", name = "t", descriptor = "([BII)Ljava/lang/String;", line = 62)
	static String method33105(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = arg1; local5 < arg2 + arg1; local5 += 3) {
			@Pc(16) int local16 = arg0[local5] & 0xFF;
			local3.append(aCharArray7[local16 >>> 2]);
			if (local5 < arg2 - 1) {
				@Pc(37) int local37 = arg0[local5 + 1] & 0xFF;
				local3.append(aCharArray7[(local16 & 0x3) << 4 | local37 >>> 4]);
				if (local5 < arg2 - 2) {
					@Pc(64) int local64 = arg0[local5 + 2] & 0xFF;
					local3.append(aCharArray7[(local37 & 0xF) << 2 | local64 >>> 6]).append(aCharArray7[local64 & 0x3F]);
				} else {
					local3.append(aCharArray7[(local37 & 0xF) << 2]).append('=');
				}
			} else {
				local3.append(aCharArray7[(local16 & 0x3) << 4]).append('=').append('=');
			}
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!yd", name = "x", descriptor = "([BII)Ljava/lang/String;", line = 62)
	static String method33106(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = arg1; local5 < arg2 + arg1; local5 += 3) {
			@Pc(16) int local16 = arg0[local5] & 0xFF;
			local3.append(aCharArray7[local16 >>> 2]);
			if (local5 < arg2 - 1) {
				@Pc(37) int local37 = arg0[local5 + 1] & 0xFF;
				local3.append(aCharArray7[(local16 & 0x3) << 4 | local37 >>> 4]);
				if (local5 < arg2 - 2) {
					@Pc(64) int local64 = arg0[local5 + 2] & 0xFF;
					local3.append(aCharArray7[(local37 & 0xF) << 2 | local64 >>> 6]).append(aCharArray7[local64 & 0x3F]);
				} else {
					local3.append(aCharArray7[(local37 & 0xF) << 2]).append('=');
				}
			} else {
				local3.append(aCharArray7[(local16 & 0x3) << 4]).append('=').append('=');
			}
		}
		return local3.toString();
	}
}
