package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yl")
public class Class669 {

	@OriginalMember(owner = "client!yl", name = "ni", descriptor = "I")
	public static int anInt5790;

	@OriginalMember(owner = "client!yl", name = "<init>", descriptor = "()V", line = 6)
	Class669() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!yl", name = "x", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lclient!yi;)I", line = 11)
	public static int method33181(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1, @OriginalArg(2) Class667 arg2) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg1.length();
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(11) char local11 = 0;
		@Pc(13) char local13 = 0;
		while (local7 - local11 < local2 || local9 - local13 < local5) {
			if (local7 - local11 >= local2) {
				return -1;
			}
			if (local9 - local13 >= local5) {
				return 1;
			}
			@Pc(43) char local43;
			if (local11 == '\u0000') {
				local43 = arg0.charAt(local7++);
			} else {
				local43 = local11;
				@Pc(45) boolean local45 = false;
			}
			@Pc(56) char local56;
			if (local13 == '\u0000') {
				local56 = arg1.charAt(local9++);
			} else {
				local56 = local13;
				@Pc(58) boolean local58 = false;
			}
			local11 = Class315.method27370(local43);
			local13 = Class315.method27370(local56);
			local43 = Class628.method32546(local43, arg2);
			local56 = Class628.method32546(local56, arg2);
			if (local43 != local56 && Character.toUpperCase(local43) != Character.toUpperCase(local56)) {
				local43 = Character.toLowerCase(local43);
				local56 = Character.toLowerCase(local56);
				if (local43 != local56) {
					return Class477.method29708(local43, arg2) - Class477.method29708(local56, arg2);
				}
			}
		}
		@Pc(114) int local114 = Math.min(local2, local5);
		@Pc(147) char local147;
		@Pc(116) int local116;
		for (local116 = 0; local116 < local114; local116++) {
			if (Class667.aClass667_11 == arg2) {
				local7 = local2 - 1 - local116;
				local9 = local5 - 1 - local116;
			} else {
				local9 = local116;
				local7 = local116;
			}
			@Pc(143) char local143 = arg0.charAt(local7);
			local147 = arg1.charAt(local9);
			if (local143 != local147 && Character.toUpperCase(local143) != Character.toUpperCase(local147)) {
				local143 = Character.toLowerCase(local143);
				local147 = Character.toLowerCase(local147);
				if (local143 != local147) {
					return Class477.method29708(local143, arg2) - Class477.method29708(local147, arg2);
				}
			}
		}
		local116 = local2 - local5;
		if (local116 != 0) {
			return local116;
		}
		for (@Pc(186) int local186 = 0; local186 < local114; local186++) {
			local147 = arg0.charAt(local186);
			@Pc(197) char local197 = arg1.charAt(local186);
			if (local197 != local147) {
				return Class477.method29708(local147, arg2) - Class477.method29708(local197, arg2);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!yl", name = "t", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lclient!yi;)I", line = 11)
	public static int method33182(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1, @OriginalArg(2) Class667 arg2) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg1.length();
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(11) char local11 = 0;
		@Pc(13) char local13 = 0;
		while (local7 - local11 < local2 || local9 - local13 < local5) {
			if (local7 - local11 >= local2) {
				return -1;
			}
			if (local9 - local13 >= local5) {
				return 1;
			}
			@Pc(43) char local43;
			if (local11 == '\u0000') {
				local43 = arg0.charAt(local7++);
			} else {
				local43 = local11;
				@Pc(45) boolean local45 = false;
			}
			@Pc(56) char local56;
			if (local13 == '\u0000') {
				local56 = arg1.charAt(local9++);
			} else {
				local56 = local13;
				@Pc(58) boolean local58 = false;
			}
			local11 = Class315.method27370(local43);
			local13 = Class315.method27370(local56);
			local43 = Class628.method32546(local43, arg2);
			local56 = Class628.method32546(local56, arg2);
			if (local43 != local56 && Character.toUpperCase(local43) != Character.toUpperCase(local56)) {
				local43 = Character.toLowerCase(local43);
				local56 = Character.toLowerCase(local56);
				if (local43 != local56) {
					return Class477.method29708(local43, arg2) - Class477.method29708(local56, arg2);
				}
			}
		}
		@Pc(114) int local114 = Math.min(local2, local5);
		@Pc(147) char local147;
		@Pc(116) int local116;
		for (local116 = 0; local116 < local114; local116++) {
			if (Class667.aClass667_11 == arg2) {
				local7 = local2 - 1 - local116;
				local9 = local5 - 1 - local116;
			} else {
				local9 = local116;
				local7 = local116;
			}
			@Pc(143) char local143 = arg0.charAt(local7);
			local147 = arg1.charAt(local9);
			if (local143 != local147 && Character.toUpperCase(local143) != Character.toUpperCase(local147)) {
				local143 = Character.toLowerCase(local143);
				local147 = Character.toLowerCase(local147);
				if (local143 != local147) {
					return Class477.method29708(local143, arg2) - Class477.method29708(local147, arg2);
				}
			}
		}
		local116 = local2 - local5;
		if (local116 != 0) {
			return local116;
		}
		for (@Pc(186) int local186 = 0; local186 < local114; local186++) {
			local147 = arg0.charAt(local186);
			@Pc(197) char local197 = arg1.charAt(local186);
			if (local197 != local147) {
				return Class477.method29708(local147, arg2) - Class477.method29708(local197, arg2);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!yl", name = "q", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lclient!yi;)I", line = 11)
	public static int method33183(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1, @OriginalArg(2) Class667 arg2) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg1.length();
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(11) char local11 = 0;
		@Pc(13) char local13 = 0;
		while (local7 - local11 < local2 || local9 - local13 < local5) {
			if (local7 - local11 >= local2) {
				return -1;
			}
			if (local9 - local13 >= local5) {
				return 1;
			}
			@Pc(43) char local43;
			if (local11 == '\u0000') {
				local43 = arg0.charAt(local7++);
			} else {
				local43 = local11;
				@Pc(45) boolean local45 = false;
			}
			@Pc(56) char local56;
			if (local13 == '\u0000') {
				local56 = arg1.charAt(local9++);
			} else {
				local56 = local13;
				@Pc(58) boolean local58 = false;
			}
			local11 = Class315.method27370(local43);
			local13 = Class315.method27370(local56);
			local43 = Class628.method32546(local43, arg2);
			local56 = Class628.method32546(local56, arg2);
			if (local43 != local56 && Character.toUpperCase(local43) != Character.toUpperCase(local56)) {
				local43 = Character.toLowerCase(local43);
				local56 = Character.toLowerCase(local56);
				if (local43 != local56) {
					return Class477.method29708(local43, arg2) - Class477.method29708(local56, arg2);
				}
			}
		}
		@Pc(114) int local114 = Math.min(local2, local5);
		@Pc(147) char local147;
		@Pc(116) int local116;
		for (local116 = 0; local116 < local114; local116++) {
			if (Class667.aClass667_11 == arg2) {
				local7 = local2 - 1 - local116;
				local9 = local5 - 1 - local116;
			} else {
				local9 = local116;
				local7 = local116;
			}
			@Pc(143) char local143 = arg0.charAt(local7);
			local147 = arg1.charAt(local9);
			if (local143 != local147 && Character.toUpperCase(local143) != Character.toUpperCase(local147)) {
				local143 = Character.toLowerCase(local143);
				local147 = Character.toLowerCase(local147);
				if (local143 != local147) {
					return Class477.method29708(local143, arg2) - Class477.method29708(local147, arg2);
				}
			}
		}
		local116 = local2 - local5;
		if (local116 != 0) {
			return local116;
		}
		for (@Pc(186) int local186 = 0; local186 < local114; local186++) {
			local147 = arg0.charAt(local186);
			@Pc(197) char local197 = arg1.charAt(local186);
			if (local197 != local147) {
				return Class477.method29708(local147, arg2) - Class477.method29708(local197, arg2);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!yl", name = "w", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lclient!yi;)I", line = 11)
	public static int method33184(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1, @OriginalArg(2) Class667 arg2) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg1.length();
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(11) char local11 = 0;
		@Pc(13) char local13 = 0;
		while (local7 - local11 < local2 || local9 - local13 < local5) {
			if (local7 - local11 >= local2) {
				return -1;
			}
			if (local9 - local13 >= local5) {
				return 1;
			}
			@Pc(43) char local43;
			if (local11 == '\u0000') {
				local43 = arg0.charAt(local7++);
			} else {
				local43 = local11;
				@Pc(45) boolean local45 = false;
			}
			@Pc(56) char local56;
			if (local13 == '\u0000') {
				local56 = arg1.charAt(local9++);
			} else {
				local56 = local13;
				@Pc(58) boolean local58 = false;
			}
			local11 = Class315.method27370(local43);
			local13 = Class315.method27370(local56);
			local43 = Class628.method32546(local43, arg2);
			local56 = Class628.method32546(local56, arg2);
			if (local43 != local56 && Character.toUpperCase(local43) != Character.toUpperCase(local56)) {
				local43 = Character.toLowerCase(local43);
				local56 = Character.toLowerCase(local56);
				if (local43 != local56) {
					return Class477.method29708(local43, arg2) - Class477.method29708(local56, arg2);
				}
			}
		}
		@Pc(114) int local114 = Math.min(local2, local5);
		@Pc(147) char local147;
		@Pc(116) int local116;
		for (local116 = 0; local116 < local114; local116++) {
			if (Class667.aClass667_11 == arg2) {
				local7 = local2 - 1 - local116;
				local9 = local5 - 1 - local116;
			} else {
				local9 = local116;
				local7 = local116;
			}
			@Pc(143) char local143 = arg0.charAt(local7);
			local147 = arg1.charAt(local9);
			if (local143 != local147 && Character.toUpperCase(local143) != Character.toUpperCase(local147)) {
				local143 = Character.toLowerCase(local143);
				local147 = Character.toLowerCase(local147);
				if (local143 != local147) {
					return Class477.method29708(local143, arg2) - Class477.method29708(local147, arg2);
				}
			}
		}
		local116 = local2 - local5;
		if (local116 != 0) {
			return local116;
		}
		for (@Pc(186) int local186 = 0; local186 < local114; local186++) {
			local147 = arg0.charAt(local186);
			@Pc(197) char local197 = arg1.charAt(local186);
			if (local197 != local147) {
				return Class477.method29708(local147, arg2) - Class477.method29708(local197, arg2);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!yl", name = "d", descriptor = "(CLclient!yi;)C", line = 69)
	static char method33185(@OriginalArg(0) char arg0, @OriginalArg(1) Class667 arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != Class667.aClass667_8) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != Class667.aClass667_8) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!yl", name = "s", descriptor = "(C)C", line = 95)
	static char method33186(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!yl", name = "r", descriptor = "(CLclient!yi;)I", line = 104)
	static int method33187(@OriginalArg(0) char arg0, @OriginalArg(1) Class667 arg1) {
		@Pc(3) int local3 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local3 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == Class667.aClass667_8) {
			local3 = 1762;
		}
		return local3;
	}

	@OriginalMember(owner = "client!yl", name = "g", descriptor = "(CLclient!yi;)I", line = 104)
	static int method33188(@OriginalArg(0) char arg0, @OriginalArg(1) Class667 arg1) {
		@Pc(3) int local3 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local3 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == Class667.aClass667_8) {
			local3 = 1762;
		}
		return local3;
	}

	@OriginalMember(owner = "client!yl", name = "z", descriptor = "(JIZLclient!yi;)Ljava/lang/String;", line = 114)
	public static String method33189(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class667 arg3) {
		@Pc(1) char local1 = ',';
		@Pc(3) char local3 = '.';
		if (arg3 == Class667.aClass667_6) {
			local1 = '.';
			local3 = ',';
		}
		if (arg3 == Class667.aClass667_11) {
			local3 = ' ';
		}
		@Pc(17) boolean local17 = false;
		if (arg0 < 0L) {
			local17 = true;
			arg0 = -arg0;
		}
		@Pc(31) StringBuilder local31 = new StringBuilder(26);
		@Pc(35) int local35;
		@Pc(41) int local41;
		if (arg1 > 0) {
			for (local35 = 0; local35 < arg1; local35++) {
				local41 = (int) arg0;
				arg0 /= 10L;
				local31.append((char) (local41 + 48 - (int) arg0 * 10));
			}
			local31.append(local1);
		}
		local35 = 0;
		while (true) {
			local41 = (int) arg0;
			arg0 /= 10L;
			local31.append((char) (local41 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local17) {
					local31.append('-');
				}
				return local31.reverse().toString();
			}
			if (arg2) {
				local35++;
				if (local35 % 3 == 0) {
					local31.append(local3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!yl", name = "arh", descriptor = "(Lclient!yf;B)V", line = 12479)
	static final void method33190(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub14_1.method15386();
	}
}
