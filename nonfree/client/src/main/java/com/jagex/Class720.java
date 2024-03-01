package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zw")
public class Class720 {

	@OriginalMember(owner = "client!zw", name = "<init>", descriptor = "()V", line = 6)
	Class720() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!zw", name = "w", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lclient!zt;)I", line = 11)
	public static int method36907(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1, @OriginalArg(2) Class717 arg2) {
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
			if (local11 == 0) {
				local43 = arg0.charAt(local7++);
			} else {
				local43 = local11;
			}
			@Pc(55) char local55;
			if (local13 == 0) {
				local55 = arg1.charAt(local9++);
			} else {
				local55 = local13;
			}
			local11 = Class379.method28098(local43);
			local13 = Class379.method28098(local55);
			local43 = Class13.method191(local43, arg2);
			local55 = Class13.method191(local55, arg2);
			if (local55 != local43 && Character.toUpperCase(local43) != Character.toUpperCase(local55)) {
				local43 = Character.toLowerCase(local43);
				local55 = Character.toLowerCase(local55);
				if (local55 != local43) {
					return Class75.method1269(local43, arg2) - Class75.method1269(local55, arg2);
				}
			}
		}
		@Pc(113) int local113 = Math.min(local2, local5);
		@Pc(146) char local146;
		@Pc(115) int local115;
		for (local115 = 0; local115 < local113; local115++) {
			if (arg2 == Class717.aClass717_11) {
				local7 = local2 - 1 - local115;
				local9 = local5 - 1 - local115;
			} else {
				local9 = local115;
				local7 = local115;
			}
			@Pc(142) char local142 = arg0.charAt(local7);
			local146 = arg1.charAt(local9);
			if (local146 != local142 && Character.toUpperCase(local142) != Character.toUpperCase(local146)) {
				local142 = Character.toLowerCase(local142);
				local146 = Character.toLowerCase(local146);
				if (local142 != local146) {
					return Class75.method1269(local142, arg2) - Class75.method1269(local146, arg2);
				}
			}
		}
		local115 = local2 - local5;
		if (local115 != 0) {
			return local115;
		}
		for (@Pc(185) int local185 = 0; local185 < local113; local185++) {
			local146 = arg0.charAt(local185);
			@Pc(196) char local196 = arg1.charAt(local185);
			if (local196 != local146) {
				return Class75.method1269(local146, arg2) - Class75.method1269(local196, arg2);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!zw", name = "l", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lclient!zt;)I", line = 11)
	public static int method36908(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1, @OriginalArg(2) Class717 arg2) {
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
			if (local11 == 0) {
				local43 = arg0.charAt(local7++);
			} else {
				local43 = local11;
			}
			@Pc(55) char local55;
			if (local13 == 0) {
				local55 = arg1.charAt(local9++);
			} else {
				local55 = local13;
			}
			local11 = Class379.method28098(local43);
			local13 = Class379.method28098(local55);
			local43 = Class13.method191(local43, arg2);
			local55 = Class13.method191(local55, arg2);
			if (local55 != local43 && Character.toUpperCase(local43) != Character.toUpperCase(local55)) {
				local43 = Character.toLowerCase(local43);
				local55 = Character.toLowerCase(local55);
				if (local55 != local43) {
					return Class75.method1269(local43, arg2) - Class75.method1269(local55, arg2);
				}
			}
		}
		@Pc(113) int local113 = Math.min(local2, local5);
		@Pc(146) char local146;
		@Pc(115) int local115;
		for (local115 = 0; local115 < local113; local115++) {
			if (arg2 == Class717.aClass717_11) {
				local7 = local2 - 1 - local115;
				local9 = local5 - 1 - local115;
			} else {
				local9 = local115;
				local7 = local115;
			}
			@Pc(142) char local142 = arg0.charAt(local7);
			local146 = arg1.charAt(local9);
			if (local146 != local142 && Character.toUpperCase(local142) != Character.toUpperCase(local146)) {
				local142 = Character.toLowerCase(local142);
				local146 = Character.toLowerCase(local146);
				if (local142 != local146) {
					return Class75.method1269(local142, arg2) - Class75.method1269(local146, arg2);
				}
			}
		}
		local115 = local2 - local5;
		if (local115 != 0) {
			return local115;
		}
		for (@Pc(185) int local185 = 0; local185 < local113; local185++) {
			local146 = arg0.charAt(local185);
			@Pc(196) char local196 = arg1.charAt(local185);
			if (local196 != local146) {
				return Class75.method1269(local146, arg2) - Class75.method1269(local196, arg2);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!zw", name = "m", descriptor = "(B)Lclient!akl;", line = 39)
	public static Class93_Sub22 method36918() {
		@Pc(2) Class93_Sub22 local2 = Class527.method30391();
		local2.aClass446_1 = null;
		local2.anInt1570 = 0;
		local2.aClass93_Sub41_Sub2_1 = new Class93_Sub41_Sub2(5000);
		return local2;
	}

	@OriginalMember(owner = "client!zw", name = "z", descriptor = "(CLclient!zt;)C", line = 69)
	static char method36910(@OriginalArg(0) char arg0, @OriginalArg(1) Class717 arg1) {
		if (arg0 >= 192 && arg0 <= 255) {
			if (arg0 >= 192 && arg0 <= 198) {
				return 'A';
			}
			if (arg0 == 199) {
				return 'C';
			}
			if (arg0 >= 200 && arg0 <= 203) {
				return 'E';
			}
			if (arg0 >= 204 && arg0 <= 207) {
				return 'I';
			}
			if (arg0 == 209 && arg1 != Class717.aClass717_12) {
				return 'N';
			}
			if (arg0 >= 210 && arg0 <= 214) {
				return 'O';
			}
			if (arg0 >= 217 && arg0 <= 220) {
				return 'U';
			}
			if (arg0 == 221) {
				return 'Y';
			}
			if (arg0 == 223) {
				return 's';
			}
			if (arg0 >= 224 && arg0 <= 230) {
				return 'a';
			}
			if (arg0 == 231) {
				return 'c';
			}
			if (arg0 >= 232 && arg0 <= 235) {
				return 'e';
			}
			if (arg0 >= 236 && arg0 <= 239) {
				return 'i';
			}
			if (arg0 == 241 && arg1 != Class717.aClass717_12) {
				return 'n';
			}
			if (arg0 >= 242 && arg0 <= 246) {
				return 'o';
			}
			if (arg0 >= 249 && arg0 <= 252) {
				return 'u';
			}
			if (arg0 == 253 || arg0 == 255) {
				return 'y';
			}
		}
		if (arg0 == 338) {
			return 'O';
		} else if (arg0 == 339) {
			return 'o';
		} else if (arg0 == 376) {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!zw", name = "p", descriptor = "(CLclient!zt;)C", line = 69)
	static char method36911(@OriginalArg(0) char arg0, @OriginalArg(1) Class717 arg1) {
		if (arg0 >= 192 && arg0 <= 255) {
			if (arg0 >= 192 && arg0 <= 198) {
				return 'A';
			}
			if (arg0 == 199) {
				return 'C';
			}
			if (arg0 >= 200 && arg0 <= 203) {
				return 'E';
			}
			if (arg0 >= 204 && arg0 <= 207) {
				return 'I';
			}
			if (arg0 == 209 && arg1 != Class717.aClass717_12) {
				return 'N';
			}
			if (arg0 >= 210 && arg0 <= 214) {
				return 'O';
			}
			if (arg0 >= 217 && arg0 <= 220) {
				return 'U';
			}
			if (arg0 == 221) {
				return 'Y';
			}
			if (arg0 == 223) {
				return 's';
			}
			if (arg0 >= 224 && arg0 <= 230) {
				return 'a';
			}
			if (arg0 == 231) {
				return 'c';
			}
			if (arg0 >= 232 && arg0 <= 235) {
				return 'e';
			}
			if (arg0 >= 236 && arg0 <= 239) {
				return 'i';
			}
			if (arg0 == 241 && arg1 != Class717.aClass717_12) {
				return 'n';
			}
			if (arg0 >= 242 && arg0 <= 246) {
				return 'o';
			}
			if (arg0 >= 249 && arg0 <= 252) {
				return 'u';
			}
			if (arg0 == 253 || arg0 == 255) {
				return 'y';
			}
		}
		if (arg0 == 338) {
			return 'O';
		} else if (arg0 == 339) {
			return 'o';
		} else if (arg0 == 376) {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!zw", name = "u", descriptor = "(CLclient!zt;)C", line = 69)
	static char method36914(@OriginalArg(0) char arg0, @OriginalArg(1) Class717 arg1) {
		if (arg0 >= 192 && arg0 <= 255) {
			if (arg0 >= 192 && arg0 <= 198) {
				return 'A';
			}
			if (arg0 == 199) {
				return 'C';
			}
			if (arg0 >= 200 && arg0 <= 203) {
				return 'E';
			}
			if (arg0 >= 204 && arg0 <= 207) {
				return 'I';
			}
			if (arg0 == 209 && arg1 != Class717.aClass717_12) {
				return 'N';
			}
			if (arg0 >= 210 && arg0 <= 214) {
				return 'O';
			}
			if (arg0 >= 217 && arg0 <= 220) {
				return 'U';
			}
			if (arg0 == 221) {
				return 'Y';
			}
			if (arg0 == 223) {
				return 's';
			}
			if (arg0 >= 224 && arg0 <= 230) {
				return 'a';
			}
			if (arg0 == 231) {
				return 'c';
			}
			if (arg0 >= 232 && arg0 <= 235) {
				return 'e';
			}
			if (arg0 >= 236 && arg0 <= 239) {
				return 'i';
			}
			if (arg0 == 241 && arg1 != Class717.aClass717_12) {
				return 'n';
			}
			if (arg0 >= 242 && arg0 <= 246) {
				return 'o';
			}
			if (arg0 >= 249 && arg0 <= 252) {
				return 'u';
			}
			if (arg0 == 253 || arg0 == 255) {
				return 'y';
			}
		}
		if (arg0 == 338) {
			return 'O';
		} else if (arg0 == 339) {
			return 'o';
		} else if (arg0 == 376) {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!zw", name = "r", descriptor = "(C)C", line = 95)
	static char method36909(@OriginalArg(0) char arg0) {
		if (arg0 == 198) {
			return 'E';
		} else if (arg0 == 230) {
			return 'e';
		} else if (arg0 == 223) {
			return 's';
		} else if (arg0 == 338) {
			return 'E';
		} else {
			return (char) (arg0 == 339 ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!zw", name = "d", descriptor = "(C)C", line = 95)
	static char method36912(@OriginalArg(0) char arg0) {
		if (arg0 == 198) {
			return 'E';
		} else if (arg0 == 230) {
			return 'e';
		} else if (arg0 == 223) {
			return 's';
		} else if (arg0 == 338) {
			return 'E';
		} else {
			return (char) (arg0 == 339 ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!zw", name = "c", descriptor = "(C)C", line = 95)
	static char method36913(@OriginalArg(0) char arg0) {
		if (arg0 == 198) {
			return 'E';
		} else if (arg0 == 230) {
			return 'e';
		} else if (arg0 == 223) {
			return 's';
		} else if (arg0 == 338) {
			return 'E';
		} else {
			return (char) (arg0 == 339 ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!zw", name = "v", descriptor = "(C)C", line = 95)
	static char method36915(@OriginalArg(0) char arg0) {
		if (arg0 == 198) {
			return 'E';
		} else if (arg0 == 230) {
			return 'e';
		} else if (arg0 == 223) {
			return 's';
		} else if (arg0 == 338) {
			return 'E';
		} else {
			return (char) (arg0 == 339 ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!zw", name = "o", descriptor = "(CLclient!zt;)I", line = 104)
	static int method36916(@OriginalArg(0) char arg0, @OriginalArg(1) Class717 arg1) {
		@Pc(3) int local3 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local3 = (arg0 << 4) + 1;
		}
		if (arg0 == 241 && arg1 == Class717.aClass717_12) {
			local3 = 1762;
		}
		return local3;
	}

	@OriginalMember(owner = "client!zw", name = "s", descriptor = "(JIZLclient!zt;)Ljava/lang/String;", line = 114)
	public static String method36917(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class717 arg3) {
		@Pc(1) char local1 = ',';
		@Pc(3) char local3 = '.';
		if (Class717.aClass717_15 == arg3) {
			local1 = '.';
			local3 = ',';
		}
		if (Class717.aClass717_11 == arg3) {
			local3 = 160;
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
}
