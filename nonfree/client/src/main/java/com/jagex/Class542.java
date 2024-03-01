package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vy")
public final class Class542 {

	@OriginalMember(owner = "client!vy", name = "tp", descriptor = "I")
	static int anInt5325;

	@OriginalMember(owner = "client!vy", name = "t", descriptor = "[Lclient!co;")
	static Class6[] aClass6Array15;

	@OriginalMember(owner = "client!vy", name = "p", descriptor = "[C")
	static final char[] aCharArray6 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!vy", name = "a", descriptor = "[J")
	static long[] aLongArray19 = new long[12];

	static {
		for (@Pc(155) int local155 = 0; local155 < aLongArray19.length; local155++) {
			aLongArray19[local155] = (long) Math.pow(37.0D, (double) local155);
		}
	}

	@OriginalMember(owner = "client!vy", name = "<init>", descriptor = "()V", line = 11)
	Class542() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!vy", name = "x", descriptor = "(Ljava/lang/CharSequence;)J", line = 16)
	static long method32589(@OriginalArg(0) CharSequence arg0) {
		@Pc(1) long local1 = 0L;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			local1 *= 37L;
			@Pc(17) char local17 = arg0.charAt(local6);
			if (local17 >= 'A' && local17 <= 'Z') {
				local1 += local17 + 1 - 65;
			} else if (local17 >= 'a' && local17 <= 'z') {
				local1 += local17 + 1 - 97;
			} else if (local17 >= '0' && local17 <= '9') {
				local1 += local17 + 27 - 48;
			}
			if (local1 >= 177917621779460413L) {
				break;
			}
		}
		while (local1 % 37L == 0L && local1 != 0L) {
			local1 /= 37L;
		}
		return local1;
	}

	@OriginalMember(owner = "client!vy", name = "l", descriptor = "(Ljava/lang/CharSequence;)J", line = 16)
	static long method32590(@OriginalArg(0) CharSequence arg0) {
		@Pc(1) long local1 = 0L;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			local1 *= 37L;
			@Pc(17) char local17 = arg0.charAt(local6);
			if (local17 >= 'A' && local17 <= 'Z') {
				local1 += local17 + 1 - 65;
			} else if (local17 >= 'a' && local17 <= 'z') {
				local1 += local17 + 1 - 97;
			} else if (local17 >= '0' && local17 <= '9') {
				local1 += local17 + 27 - 48;
			}
			if (local1 >= 177917621779460413L) {
				break;
			}
		}
		while (local1 % 37L == 0L && local1 != 0L) {
			local1 /= 37L;
		}
		return local1;
	}

	@OriginalMember(owner = "client!vy", name = "h", descriptor = "(Ljava/lang/CharSequence;)J", line = 16)
	static long method32591(@OriginalArg(0) CharSequence arg0) {
		@Pc(1) long local1 = 0L;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			local1 *= 37L;
			@Pc(17) char local17 = arg0.charAt(local6);
			if (local17 >= 'A' && local17 <= 'Z') {
				local1 += local17 + 1 - 65;
			} else if (local17 >= 'a' && local17 <= 'z') {
				local1 += local17 + 1 - 97;
			} else if (local17 >= '0' && local17 <= '9') {
				local1 += local17 + 27 - 48;
			}
			if (local1 >= 177917621779460413L) {
				break;
			}
		}
		while (local1 % 37L == 0L && local1 != 0L) {
			local1 /= 37L;
		}
		return local1;
	}

	@OriginalMember(owner = "client!vy", name = "s", descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;", line = 57)
	public static String method32592(@OriginalArg(0) CharSequence arg0) {
		@Pc(4) String local4 = Class205.method24186(Class230.method24544(arg0));
		if (local4 == null) {
			local4 = "";
		}
		return local4;
	}

	@OriginalMember(owner = "client!vy", name = "u", descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;", line = 57)
	public static String method32593(@OriginalArg(0) CharSequence arg0) {
		@Pc(4) String local4 = Class205.method24186(Class230.method24544(arg0));
		if (local4 == null) {
			local4 = "";
		}
		return local4;
	}

	@OriginalMember(owner = "client!vy", name = "y", descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;", line = 57)
	public static String method32594(@OriginalArg(0) CharSequence arg0) {
		@Pc(4) String local4 = Class205.method24186(Class230.method24544(arg0));
		if (local4 == null) {
			local4 = "";
		}
		return local4;
	}
}
