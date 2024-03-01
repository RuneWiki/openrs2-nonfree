package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class521 {

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 6)
	Class521() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "(Ljava/lang/CharSequence;C)I", line = 11)
	static int method29768(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) char arg1) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			if (arg0.charAt(local6) == arg1) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "(Ljava/lang/CharSequence;C)I", line = 11)
	static int method29769(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) char arg1) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			if (arg0.charAt(local6) == arg1) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "(Ljava/lang/CharSequence;C)I", line = 11)
	static int method29771(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) char arg1) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			if (arg0.charAt(local6) == arg1) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "(Ljava/lang/CharSequence;C)I", line = 11)
	static int method29806(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) char arg1) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			if (arg0.charAt(local6) == arg1) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "([Ljava/lang/Object;II)Ljava/lang/String;", line = 20)
	public static String method29773(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(11) CharSequence local11 = (CharSequence) arg0[arg1];
			return local11 == null ? "null" : local11.toString();
		} else {
			@Pc(23) int local23 = arg1 + arg2;
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = arg1; local27 < local23; local27++) {
				@Pc(35) CharSequence local35 = (CharSequence) arg0[local27];
				if (local35 == null) {
					local25 += 4;
				} else {
					local25 += local35.length();
				}
			}
			@Pc(52) StringBuilder local52 = new StringBuilder(local25);
			for (@Pc(54) int local54 = arg1; local54 < local23; local54++) {
				@Pc(62) CharSequence local62 = (CharSequence) arg0[local54];
				if (local62 == null) {
					local52.append("null");
				} else {
					local52.append(local62);
				}
			}
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "([Ljava/lang/Object;II)Ljava/lang/String;", line = 20)
	public static String method29784(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(11) CharSequence local11 = (CharSequence) arg0[arg1];
			return local11 == null ? "null" : local11.toString();
		} else {
			@Pc(23) int local23 = arg1 + arg2;
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = arg1; local27 < local23; local27++) {
				@Pc(35) CharSequence local35 = (CharSequence) arg0[local27];
				if (local35 == null) {
					local25 += 4;
				} else {
					local25 += local35.length();
				}
			}
			@Pc(52) StringBuilder local52 = new StringBuilder(local25);
			for (@Pc(54) int local54 = arg1; local54 < local23; local54++) {
				@Pc(62) CharSequence local62 = (CharSequence) arg0[local54];
				if (local62 == null) {
					local52.append("null");
				} else {
					local52.append(local62);
				}
			}
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "(Ljava/lang/CharSequence;)Z", line = 43)
	public static boolean method29774(@OriginalArg(0) CharSequence arg0) {
		return Class462.method28603(arg0, 10, true);
	}

	@OriginalMember(owner = "client!vb", name = "at", descriptor = "(Ljava/lang/CharSequence;IZ)Z", line = 47)
	static boolean method29775(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(56) int local56;
			if (local35 >= '0' && local35 <= '9') {
				local56 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local56 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local56 = local35 - 'W';
			} else {
				return false;
			}
			if (local56 >= arg1) {
				return false;
			}
			if (local19) {
				local56 = -local56;
			}
			@Pc(91) int local91 = arg1 * local23 + local56;
			if (local91 / arg1 != local23) {
				return false;
			}
			local23 = local91;
			local21 = true;
		}
		return local21;
	}

	@OriginalMember(owner = "client!vb", name = "af", descriptor = "(Ljava/lang/CharSequence;)I", line = 76)
	public static int method29776(@OriginalArg(0) CharSequence arg0) {
		return Class165.method23339(arg0, 10, true);
	}

	@OriginalMember(owner = "client!vb", name = "ah", descriptor = "(Ljava/lang/CharSequence;I)I", line = 80)
	public static int method29767(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		return Class165.method23339(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!vb", name = "ak", descriptor = "(Ljava/lang/CharSequence;I)I", line = 80)
	public static int method29777(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		return Class165.method23339(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!vb", name = "aa", descriptor = "(Ljava/lang/CharSequence;I)I", line = 80)
	public static int method29778(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		return Class165.method23339(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!vb", name = "an", descriptor = "(Ljava/lang/CharSequence;I)I", line = 80)
	public static int method29780(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		return Class165.method23339(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!vb", name = "aj", descriptor = "(Ljava/lang/CharSequence;IZ)I", line = 84)
	static int method29781(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(57) int local57;
			if (local35 >= '0' && local35 <= '9') {
				local57 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local57 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local57 = local35 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local57 >= arg1) {
				throw new NumberFormatException();
			}
			if (local19) {
				local57 = -local57;
			}
			@Pc(96) int local96 = local57 + arg1 * local23;
			if (local23 != local96 / arg1) {
				throw new NumberFormatException();
			}
			local23 = local96;
			local21 = true;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!vb", name = "as", descriptor = "(Ljava/lang/CharSequence;IZ)I", line = 84)
	static int method29782(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(57) int local57;
			if (local35 >= '0' && local35 <= '9') {
				local57 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local57 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local57 = local35 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local57 >= arg1) {
				throw new NumberFormatException();
			}
			if (local19) {
				local57 = -local57;
			}
			@Pc(96) int local96 = local57 + arg1 * local23;
			if (local23 != local96 / arg1) {
				throw new NumberFormatException();
			}
			local23 = local96;
			local21 = true;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!vb", name = "ai", descriptor = "(Ljava/lang/CharSequence;IZ)I", line = 84)
	static int method29783(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(57) int local57;
			if (local35 >= '0' && local35 <= '9') {
				local57 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local57 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local57 = local35 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local57 >= arg1) {
				throw new NumberFormatException();
			}
			if (local19) {
				local57 = -local57;
			}
			@Pc(96) int local96 = local57 + arg1 * local23;
			if (local23 != local96 / arg1) {
				throw new NumberFormatException();
			}
			local23 = local96;
			local21 = true;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!vb", name = "aq", descriptor = "(Ljava/lang/CharSequence;IZ)I", line = 84)
	static int method29789(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(57) int local57;
			if (local35 >= '0' && local35 <= '9') {
				local57 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local57 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local57 = local35 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local57 >= arg1) {
				throw new NumberFormatException();
			}
			if (local19) {
				local57 = -local57;
			}
			@Pc(96) int local96 = local57 + arg1 * local23;
			if (local23 != local96 / arg1) {
				throw new NumberFormatException();
			}
			local23 = local96;
			local21 = true;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "(Lclient!ny;III)Lclient!amh;", line = 87)
	static Class3_Sub1_Sub4 method29810(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub41 local8 = new Class3_Sub41(arg0.method26713(arg1, arg2));
		@Pc(39) Class3_Sub1_Sub4 local39 = new Class3_Sub1_Sub4(arg2, local8.method20283(), local8.method20283(), local8.method20275(), local8.method20275(), local8.method20269() == 1, local8.method20269(), local8.method20269());
		@Pc(43) int local43 = local8.method20269();
		for (@Pc(45) int local45 = 0; local45 < local43; local45++) {
			local39.aClass553_40.method32702(new Class3_Sub31(local8.method20269(), local8.method20271(), local8.method20271(), local8.method20271(), local8.method20271(), local8.method20271(), local8.method20271(), local8.method20271(), local8.method20271()));
		}
		local39.method18897();
		return local39;
	}

	@OriginalMember(owner = "client!vb", name = "av", descriptor = "(IIZ)Ljava/lang/String;", line = 119)
	static String method29785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		} else if (arg2 && arg0 >= 0) {
			@Pc(27) int local27 = 2;
			@Pc(31) int local31 = arg0 / arg1;
			while (local31 != 0) {
				local31 /= arg1;
				local27++;
			}
			@Pc(43) char[] local43 = new char[local27];
			local43[0] = '+';
			for (@Pc(51) int local51 = local27 - 1; local51 > 0; local51--) {
				@Pc(55) int local55 = arg0;
				arg0 /= arg1;
				@Pc(65) int local65 = local55 - arg0 * arg1;
				if (local65 >= 10) {
					local43[local51] = (char) (local65 + 87);
				} else {
					local43[local51] = (char) (local65 + 48);
				}
			}
			return new String(local43);
		} else {
			return Integer.toString(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!vb", name = "ax", descriptor = "(IIZ)Ljava/lang/String;", line = 119)
	static String method29786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		} else if (arg2 && arg0 >= 0) {
			@Pc(27) int local27 = 2;
			@Pc(31) int local31 = arg0 / arg1;
			while (local31 != 0) {
				local31 /= arg1;
				local27++;
			}
			@Pc(43) char[] local43 = new char[local27];
			local43[0] = '+';
			for (@Pc(51) int local51 = local27 - 1; local51 > 0; local51--) {
				@Pc(55) int local55 = arg0;
				arg0 /= arg1;
				@Pc(65) int local65 = local55 - arg0 * arg1;
				if (local65 >= 10) {
					local43[local51] = (char) (local65 + 87);
				} else {
					local43[local51] = (char) (local65 + 48);
				}
			}
			return new String(local43);
		} else {
			return Integer.toString(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!vb", name = "az", descriptor = "(Ljava/lang/CharSequence;)I", line = 140)
	public static int method29770(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + Class525.method32378(arg0.charAt(local6));
		}
		return local4;
	}

	@OriginalMember(owner = "client!vb", name = "ao", descriptor = "(Ljava/lang/CharSequence;)I", line = 147)
	public static int method29790(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!vb", name = "al", descriptor = "(Ljava/lang/CharSequence;)I", line = 147)
	public static int method29804(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!vb", name = "ap", descriptor = "(Ljava/lang/CharSequence;)J", line = 154)
	public static long method29779(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) long local4 = 0L;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + (long) arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!vb", name = "ab", descriptor = "(Ljava/lang/CharSequence;)J", line = 154)
	public static long method29788(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) long local4 = 0L;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + (long) arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!vb", name = "au", descriptor = "(Ljava/lang/CharSequence;)J", line = 154)
	public static long method29791(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) long local4 = 0L;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + (long) arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!vb", name = "ay", descriptor = "(Ljava/lang/CharSequence;)J", line = 154)
	public static long method29792(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) long local4 = 0L;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + (long) arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!vb", name = "ag", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I", line = 161)
	public static int method29793(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg1.length();
		if (local2 == 0) {
			return local5;
		} else if (local5 == 0) {
			return local2;
		} else {
			@Pc(19) int[] local19 = new int[local2 + 1];
			@Pc(24) int[] local24 = new int[local2 + 1];
			@Pc(26) int local26 = 0;
			while (local26 <= local2) {
				local19[local26] = local26++;
			}
			for (local26 = 1; local26 <= local5; local26++) {
				local24[0] = local26;
				@Pc(50) char local50 = arg1.charAt(local26 - 1);
				for (@Pc(52) int local52 = 1; local52 <= local2; local52++) {
					local24[local52] = Math.min(Math.min(local24[local52 - 1] + 1, local19[local52] + 1), local19[local52 - 1] + (arg0.charAt(local52 - 1) == local50 ? 0 : 1));
				}
				@Pc(92) int[] local92 = local19;
				local19 = local24;
				local24 = local92;
			}
			return local19[local2];
		}
	}

	@OriginalMember(owner = "client!vb", name = "am", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I", line = 161)
	public static int method29794(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg1.length();
		if (local2 == 0) {
			return local5;
		} else if (local5 == 0) {
			return local2;
		} else {
			@Pc(19) int[] local19 = new int[local2 + 1];
			@Pc(24) int[] local24 = new int[local2 + 1];
			@Pc(26) int local26 = 0;
			while (local26 <= local2) {
				local19[local26] = local26++;
			}
			for (local26 = 1; local26 <= local5; local26++) {
				local24[0] = local26;
				@Pc(50) char local50 = arg1.charAt(local26 - 1);
				for (@Pc(52) int local52 = 1; local52 <= local2; local52++) {
					local24[local52] = Math.min(Math.min(local24[local52 - 1] + 1, local19[local52] + 1), local19[local52 - 1] + (arg0.charAt(local52 - 1) == local50 ? 0 : 1));
				}
				@Pc(92) int[] local92 = local19;
				local19 = local24;
				local24 = local92;
			}
			return local19[local2];
		}
	}

	@OriginalMember(owner = "client!vb", name = "ar", descriptor = "(C)Z", line = 182)
	public static boolean method29796(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!vb", name = "ad", descriptor = "(C)Z", line = 182)
	public static boolean method29797(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!vb", name = "ae", descriptor = "(C)Z", line = 182)
	public static boolean method29802(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!vb", name = "aw", descriptor = "(C)Z", line = 190)
	public static boolean method29798(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!vb", name = "bw", descriptor = "(C)Z", line = 190)
	public static boolean method29800(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!vb", name = "bp", descriptor = "(C)Z", line = 190)
	public static boolean method29801(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!vb", name = "ac", descriptor = "(C)Z", line = 190)
	public static boolean method29809(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!vb", name = "bd", descriptor = "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", line = 194)
	public static String method29787(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1, @OriginalArg(2) String arg2) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg2.length();
		@Pc(7) int local7 = local2;
		@Pc(11) int local11 = local5 - 1;
		if (local11 != 0) {
			@Pc(15) int local15 = 0;
			while (true) {
				local15 = arg0.indexOf(arg1, local15);
				if (local15 < 0) {
					break;
				}
				local15++;
				local7 += local11;
			}
		}
		@Pc(34) StringBuilder local34 = new StringBuilder(local7);
		@Pc(36) int local36 = 0;
		while (true) {
			@Pc(41) int local41 = arg0.indexOf(arg1, local36);
			if (local41 < 0) {
				local34.append(arg0.substring(local36));
				return local34.toString();
			}
			local34.append(arg0.substring(local36, local41));
			local34.append(arg2);
			local36 = local41 + 1;
		}
	}

	@OriginalMember(owner = "client!vb", name = "bm", descriptor = "(Ljava/lang/String;C)[Ljava/lang/String;", line = 221)
	public static String[] method29772(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(4) int local4 = Class422.method27874(arg0, arg1);
		@Pc(9) String[] local9 = new String[local4 + 1];
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local4; local15++) {
			@Pc(20) int local20;
			for (local20 = local13; arg0.charAt(local20) != arg1; local20++) {
			}
			local9[local11++] = arg0.substring(local13, local20);
			local13 = local20 + 1;
		}
		local9[local4] = arg0.substring(local13);
		return local9;
	}

	@OriginalMember(owner = "client!vb", name = "bs", descriptor = "(Ljava/lang/String;C)[Ljava/lang/String;", line = 221)
	public static String[] method29803(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(4) int local4 = Class422.method27874(arg0, arg1);
		@Pc(9) String[] local9 = new String[local4 + 1];
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local4; local15++) {
			@Pc(20) int local20;
			for (local20 = local13; arg0.charAt(local20) != arg1; local20++) {
			}
			local9[local11++] = arg0.substring(local13, local20);
			local13 = local20 + 1;
		}
		local9[local4] = arg0.substring(local13);
		return local9;
	}

	@OriginalMember(owner = "client!vb", name = "bf", descriptor = "(Ljava/lang/String;C)[Ljava/lang/String;", line = 221)
	public static String[] method29805(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(4) int local4 = Class422.method27874(arg0, arg1);
		@Pc(9) String[] local9 = new String[local4 + 1];
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local4; local15++) {
			@Pc(20) int local20;
			for (local20 = local13; arg0.charAt(local20) != arg1; local20++) {
			}
			local9[local11++] = arg0.substring(local13, local20);
			local13 = local20 + 1;
		}
		local9[local4] = arg0.substring(local13);
		return local9;
	}

	@OriginalMember(owner = "client!vb", name = "bt", descriptor = "(Ljava/lang/String;C)[Ljava/lang/String;", line = 221)
	public static String[] method29808(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(4) int local4 = Class422.method27874(arg0, arg1);
		@Pc(9) String[] local9 = new String[local4 + 1];
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local4; local15++) {
			@Pc(20) int local20;
			for (local20 = local13; arg0.charAt(local20) != arg1; local20++) {
			}
			local9[local11++] = arg0.substring(local13, local20);
			local13 = local20 + 1;
		}
		local9[local4] = arg0.substring(local13);
		return local9;
	}

	@OriginalMember(owner = "client!vb", name = "bg", descriptor = "(C)Z", line = 236)
	public static boolean method29795(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= 160 && arg0 <= 255) {
			return true;
		} else {
			return arg0 == 8364 || arg0 == 338 || arg0 == 8212 || arg0 == 339 || arg0 == 376;
		}
	}

	@OriginalMember(owner = "client!vb", name = "br", descriptor = "(C)Z", line = 236)
	public static boolean method29799(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= 160 && arg0 <= 255) {
			return true;
		} else {
			return arg0 == 8364 || arg0 == 338 || arg0 == 8212 || arg0 == 339 || arg0 == 376;
		}
	}

	@OriginalMember(owner = "client!vb", name = "bk", descriptor = "(C)Z", line = 236)
	public static boolean method29807(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= 160 && arg0 <= 255) {
			return true;
		} else {
			return arg0 == 8364 || arg0 == 338 || arg0 == 8212 || arg0 == 339 || arg0 == 376;
		}
	}

	@OriginalMember(owner = "client!vb", name = "qa", descriptor = "(Lclient!vs;B)V", line = 7064)
	static final void method29811(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		Class5.method745(local11, arg0);
	}
}
