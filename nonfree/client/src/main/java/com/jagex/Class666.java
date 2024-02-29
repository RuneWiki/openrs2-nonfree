package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yh")
public final class Class666 {

	@OriginalMember(owner = "client!yh", name = "<init>", descriptor = "()V", line = 6)
	Class666() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!yh", name = "o", descriptor = "([Ljava/lang/Object;II)Ljava/lang/String;", line = 20)
	public static String method33110(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(12) CharSequence local12 = (CharSequence) arg0[arg1];
			return local12 == null ? "null" : local12.toString();
		} else {
			@Pc(24) int local24 = arg1 + arg2;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = arg1; local28 < local24; local28++) {
				@Pc(36) CharSequence local36 = (CharSequence) arg0[local28];
				if (local36 == null) {
					local26 += 4;
				} else {
					local26 += local36.length();
				}
			}
			@Pc(52) StringBuilder local52 = new StringBuilder(local26);
			for (@Pc(54) int local54 = arg1; local54 < local24; local54++) {
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

	@OriginalMember(owner = "client!yh", name = "b", descriptor = "([Ljava/lang/Object;II)Ljava/lang/String;", line = 20)
	public static String method33111(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(12) CharSequence local12 = (CharSequence) arg0[arg1];
			return local12 == null ? "null" : local12.toString();
		} else {
			@Pc(24) int local24 = arg1 + arg2;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = arg1; local28 < local24; local28++) {
				@Pc(36) CharSequence local36 = (CharSequence) arg0[local28];
				if (local36 == null) {
					local26 += 4;
				} else {
					local26 += local36.length();
				}
			}
			@Pc(52) StringBuilder local52 = new StringBuilder(local26);
			for (@Pc(54) int local54 = arg1; local54 < local24; local54++) {
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

	@OriginalMember(owner = "client!yh", name = "n", descriptor = "([Ljava/lang/Object;II)Ljava/lang/String;", line = 20)
	public static String method33112(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(12) CharSequence local12 = (CharSequence) arg0[arg1];
			return local12 == null ? "null" : local12.toString();
		} else {
			@Pc(24) int local24 = arg1 + arg2;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = arg1; local28 < local24; local28++) {
				@Pc(36) CharSequence local36 = (CharSequence) arg0[local28];
				if (local36 == null) {
					local26 += 4;
				} else {
					local26 += local36.length();
				}
			}
			@Pc(52) StringBuilder local52 = new StringBuilder(local26);
			for (@Pc(54) int local54 = arg1; local54 < local24; local54++) {
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

	@OriginalMember(owner = "client!yh", name = "f", descriptor = "([Ljava/lang/Object;II)Ljava/lang/String;", line = 20)
	public static String method33113(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(12) CharSequence local12 = (CharSequence) arg0[arg1];
			return local12 == null ? "null" : local12.toString();
		} else {
			@Pc(24) int local24 = arg1 + arg2;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = arg1; local28 < local24; local28++) {
				@Pc(36) CharSequence local36 = (CharSequence) arg0[local28];
				if (local36 == null) {
					local26 += 4;
				} else {
					local26 += local36.length();
				}
			}
			@Pc(52) StringBuilder local52 = new StringBuilder(local26);
			for (@Pc(54) int local54 = arg1; local54 < local24; local54++) {
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

	@OriginalMember(owner = "client!yh", name = "a", descriptor = "(Ljava/lang/CharSequence;)Z", line = 43)
	public static boolean method33114(@OriginalArg(0) CharSequence arg0) {
		return Class525.method30665(arg0, 10, true);
	}

	@OriginalMember(owner = "client!yh", name = "m", descriptor = "(Ljava/lang/CharSequence;IZ)Z", line = 47)
	static boolean method33115(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
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
				return false;
			}
			if (local57 >= arg1) {
				return false;
			}
			if (local19) {
				local57 = -local57;
			}
			@Pc(92) int local92 = local23 * arg1 + local57;
			if (local92 / arg1 != local23) {
				return false;
			}
			local23 = local92;
			local21 = true;
		}
		return local21;
	}

	@OriginalMember(owner = "client!yh", name = "h", descriptor = "(Ljava/lang/CharSequence;IZ)Z", line = 47)
	static boolean method33116(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
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
				return false;
			}
			if (local57 >= arg1) {
				return false;
			}
			if (local19) {
				local57 = -local57;
			}
			@Pc(92) int local92 = local23 * arg1 + local57;
			if (local92 / arg1 != local23) {
				return false;
			}
			local23 = local92;
			local21 = true;
		}
		return local21;
	}

	@OriginalMember(owner = "client!yh", name = "ai", descriptor = "(Ljava/lang/CharSequence;)I", line = 76)
	public static int method33117(@OriginalArg(0) CharSequence arg0) {
		return Class526.method30676(arg0, 10, true);
	}

	@OriginalMember(owner = "client!yh", name = "aj", descriptor = "(Ljava/lang/CharSequence;)I", line = 76)
	public static int method33118(@OriginalArg(0) CharSequence arg0) {
		return Class526.method30676(arg0, 10, true);
	}

	@OriginalMember(owner = "client!yh", name = "ag", descriptor = "(Ljava/lang/CharSequence;I)I", line = 80)
	public static int method33119(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		return Class526.method30676(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!yh", name = "al", descriptor = "(Ljava/lang/CharSequence;I)I", line = 80)
	public static int method33120(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		return Class526.method30676(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!yh", name = "ao", descriptor = "(Ljava/lang/CharSequence;IZ)I", line = 84)
	static int method33121(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
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

	@OriginalMember(owner = "client!yh", name = "ak", descriptor = "(IZ)Ljava/lang/String;", line = 114)
	public static String method33122(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg1 && arg0 >= 0 ? Class302.method27133(arg0, 10, arg1) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!yh", name = "au", descriptor = "(IIZ)Ljava/lang/String;", line = 119)
	static String method33123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
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

	@OriginalMember(owner = "client!yh", name = "ax", descriptor = "(IIZ)Ljava/lang/String;", line = 119)
	static String method33124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
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

	@OriginalMember(owner = "client!yh", name = "ar", descriptor = "(IIZ)Ljava/lang/String;", line = 119)
	static String method33125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
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

	@OriginalMember(owner = "client!yh", name = "ad", descriptor = "(Ljava/lang/CharSequence;)I", line = 140)
	public static int method33126(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + Class544.method30950(arg0.charAt(local6));
		}
		return local4;
	}

	@OriginalMember(owner = "client!yh", name = "ac", descriptor = "(Ljava/lang/CharSequence;)I", line = 147)
	public static int method33127(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!yh", name = "at", descriptor = "(Ljava/lang/CharSequence;)J", line = 154)
	public static long method33128(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) long local4 = 0L;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + (long) arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!yh", name = "av", descriptor = "(Ljava/lang/CharSequence;)J", line = 154)
	public static long method33129(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) long local4 = 0L;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + (long) arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!yh", name = "ae", descriptor = "(Ljava/lang/CharSequence;)J", line = 154)
	public static long method33130(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) long local4 = 0L;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + (long) arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!yh", name = "ah", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I", line = 161)
	public static int method33131(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg1.length();
		if (local2 == 0) {
			return local5;
		} else if (local5 == 0) {
			return local2;
		} else {
			@Pc(20) int[] local20 = new int[local2 + 1];
			@Pc(25) int[] local25 = new int[local2 + 1];
			@Pc(27) int local27 = 0;
			while (local27 <= local2) {
				local20[local27] = local27++;
			}
			for (local27 = 1; local27 <= local5; local27++) {
				local25[0] = local27;
				@Pc(51) char local51 = arg1.charAt(local27 - 1);
				for (@Pc(53) int local53 = 1; local53 <= local2; local53++) {
					local25[local53] = Math.min(Math.min(local25[local53 - 1] + 1, local20[local53] + 1), local20[local53 - 1] + (arg0.charAt(local53 - 1) == local51 ? 0 : 1));
				}
				@Pc(93) int[] local93 = local20;
				local20 = local25;
				local25 = local93;
			}
			return local20[local2];
		}
	}

	@OriginalMember(owner = "client!yh", name = "as", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I", line = 161)
	public static int method33132(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg1.length();
		if (local2 == 0) {
			return local5;
		} else if (local5 == 0) {
			return local2;
		} else {
			@Pc(20) int[] local20 = new int[local2 + 1];
			@Pc(25) int[] local25 = new int[local2 + 1];
			@Pc(27) int local27 = 0;
			while (local27 <= local2) {
				local20[local27] = local27++;
			}
			for (local27 = 1; local27 <= local5; local27++) {
				local25[0] = local27;
				@Pc(51) char local51 = arg1.charAt(local27 - 1);
				for (@Pc(53) int local53 = 1; local53 <= local2; local53++) {
					local25[local53] = Math.min(Math.min(local25[local53 - 1] + 1, local20[local53] + 1), local20[local53 - 1] + (arg0.charAt(local53 - 1) == local51 ? 0 : 1));
				}
				@Pc(93) int[] local93 = local20;
				local20 = local25;
				local25 = local93;
			}
			return local20[local2];
		}
	}

	@OriginalMember(owner = "client!yh", name = "am", descriptor = "(C)Z", line = 182)
	public static boolean method33133(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!yh", name = "aq", descriptor = "(C)Z", line = 182)
	public static boolean method33134(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!yh", name = "ay", descriptor = "(C)Z", line = 190)
	public static boolean method33135(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!yh", name = "an", descriptor = "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", line = 194)
	public static String method33136(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1, @OriginalArg(2) String arg2) {
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

	@OriginalMember(owner = "client!yh", name = "aa", descriptor = "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", line = 194)
	public static String method33137(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1, @OriginalArg(2) String arg2) {
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

	@OriginalMember(owner = "client!yh", name = "af", descriptor = "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", line = 194)
	public static String method33138(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1, @OriginalArg(2) String arg2) {
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

	@OriginalMember(owner = "client!yh", name = "ab", descriptor = "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", line = 194)
	public static String method33139(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1, @OriginalArg(2) String arg2) {
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

	@OriginalMember(owner = "client!yh", name = "ap", descriptor = "(Ljava/lang/String;C)[Ljava/lang/String;", line = 221)
	public static String[] method33140(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(4) int local4 = Class408.method28556(arg0, arg1);
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

	@OriginalMember(owner = "client!yh", name = "aw", descriptor = "(C)Z", line = 236)
	public static boolean method33141(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
