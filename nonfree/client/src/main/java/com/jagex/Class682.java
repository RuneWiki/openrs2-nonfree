package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yz")
public final class Class682 {

	@OriginalMember(owner = "client!yz", name = "p", descriptor = "[C")
	static final char[] aCharArray9 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!yz", name = "c", descriptor = "[J")
	static long[] aLongArray29 = new long[12];

	static {
		for (@Pc(155) int local155 = 0; local155 < aLongArray29.length; local155++) {
			aLongArray29[local155] = (long) Math.pow(37.0D, (double) local155);
		}
	}

	@OriginalMember(owner = "client!yz", name = "<init>", descriptor = "()V", line = 11)
	Class682() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!yz", name = "y", descriptor = "(Ljava/lang/CharSequence;)J", line = 16)
	static long method36086(@OriginalArg(0) CharSequence arg0) {
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

	@OriginalMember(owner = "client!yz", name = "l", descriptor = "(Ljava/lang/CharSequence;)J", line = 16)
	static long method36087(@OriginalArg(0) CharSequence arg0) {
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

	@OriginalMember(owner = "client!yz", name = "w", descriptor = "(J)Ljava/lang/String;", line = 31)
	static String method36088(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(19) int local19 = 0;
			for (@Pc(21) long local21 = arg0; local21 != 0L; local21 /= 37L) {
				local19++;
			}
			@Pc(36) StringBuilder local36 = new StringBuilder(local19);
			while (arg0 != 0L) {
				@Pc(42) long local42 = arg0;
				arg0 /= 37L;
				@Pc(55) char local55 = aCharArray9[(int) (local42 - arg0 * 37L)];
				if (local55 == '_') {
					@Pc(63) int local63 = local36.length() - 1;
					local36.setCharAt(local63, Character.toUpperCase(local36.charAt(local63)));
					local55 = ' ';
				}
				local36.append(local55);
			}
			local36.reverse();
			local36.setCharAt(0, Character.toUpperCase(local36.charAt(0)));
			return local36.toString();
		}
	}

	@OriginalMember(owner = "client!yz", name = "t", descriptor = "(J)Ljava/lang/String;", line = 31)
	static String method36089(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(19) int local19 = 0;
			for (@Pc(21) long local21 = arg0; local21 != 0L; local21 /= 37L) {
				local19++;
			}
			@Pc(36) StringBuilder local36 = new StringBuilder(local19);
			while (arg0 != 0L) {
				@Pc(42) long local42 = arg0;
				arg0 /= 37L;
				@Pc(55) char local55 = aCharArray9[(int) (local42 - arg0 * 37L)];
				if (local55 == '_') {
					@Pc(63) int local63 = local36.length() - 1;
					local36.setCharAt(local63, Character.toUpperCase(local36.charAt(local63)));
					local55 = ' ';
				}
				local36.append(local55);
			}
			local36.reverse();
			local36.setCharAt(0, Character.toUpperCase(local36.charAt(0)));
			return local36.toString();
		}
	}

	@OriginalMember(owner = "client!yz", name = "q", descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;", line = 57)
	public static String method36090(@OriginalArg(0) CharSequence arg0) {
		@Pc(4) String local4 = Class556.method31083(Class662.method33091(arg0));
		if (local4 == null) {
			local4 = "";
		}
		return local4;
	}

	@OriginalMember(owner = "client!yz", name = "x", descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;", line = 57)
	public static String method36091(@OriginalArg(0) CharSequence arg0) {
		@Pc(4) String local4 = Class556.method31083(Class662.method33091(arg0));
		if (local4 == null) {
			local4 = "";
		}
		return local4;
	}

	@OriginalMember(owner = "client!yz", name = "abv", descriptor = "(Lclient!yf;I)V", line = 9379)
	static final void method36092(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1] = arg0.aClass77_Sub25_3.method13616()[arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1]];
	}

	@OriginalMember(owner = "client!yz", name = "aei", descriptor = "(Lclient!yf;I)V", line = 9923)
	static final void method36093(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class18 local18 = (Class18) Class537.aClass35_Sub7_1.method18319(local12);
		if (local18.anInt94 * -667959667 >= 0 && local18.anInt93 * 344178797 >= 0) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local18.anInt93 * 344178797;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local12;
		}
	}
}
