package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vx")
public class Class541 {

	@OriginalMember(owner = "client!vx", name = "<init>", descriptor = "()V", line = 6)
	Class541() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!vx", name = "x", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lclient!vk;)I", line = 11)
	public static int method32582(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1, @OriginalArg(2) Class530 arg2) {
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
			@Pc(56) char local56;
			if (local13 == 0) {
				local56 = arg1.charAt(local9++);
			} else {
				local56 = local13;
			}
			local11 = Class211.method24252(local43);
			local13 = Class211.method24252(local56);
			local43 = Class65.method13155(local43, arg2);
			local56 = Class65.method13155(local56, arg2);
			if (local56 != local43 && Character.toUpperCase(local43) != Character.toUpperCase(local56)) {
				local43 = Character.toLowerCase(local43);
				local56 = Character.toLowerCase(local56);
				if (local43 != local56) {
					return Class498.method29360(local43, arg2) - Class498.method29360(local56, arg2);
				}
			}
		}
		@Pc(114) int local114 = Math.min(local2, local5);
		@Pc(147) char local147;
		@Pc(116) int local116;
		for (local116 = 0; local116 < local114; local116++) {
			if (Class530.aClass530_3 == arg2) {
				local7 = local2 - 1 - local116;
				local9 = local5 - 1 - local116;
			} else {
				local9 = local116;
				local7 = local116;
			}
			@Pc(143) char local143 = arg0.charAt(local7);
			local147 = arg1.charAt(local9);
			if (local147 != local143 && Character.toUpperCase(local143) != Character.toUpperCase(local147)) {
				local143 = Character.toLowerCase(local143);
				local147 = Character.toLowerCase(local147);
				if (local147 != local143) {
					return Class498.method29360(local143, arg2) - Class498.method29360(local147, arg2);
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
				return Class498.method29360(local147, arg2) - Class498.method29360(local197, arg2);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!vx", name = "s", descriptor = "(C)C", line = 95)
	static char method32581(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!vx", name = "u", descriptor = "(C)C", line = 95)
	static char method32583(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!vx", name = "y", descriptor = "(CLclient!vk;)I", line = 104)
	static int method32584(@OriginalArg(0) char arg0, @OriginalArg(1) Class530 arg1) {
		@Pc(3) int local3 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local3 = (arg0 << 4) + 1;
		}
		if (arg0 == 241 && Class530.aClass530_6 == arg1) {
			local3 = 1762;
		}
		return local3;
	}

	@OriginalMember(owner = "client!vx", name = "b", descriptor = "(JIZLclient!vk;)Ljava/lang/String;", line = 114)
	public static String method32585(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class530 arg3) {
		@Pc(1) char local1 = ',';
		@Pc(3) char local3 = '.';
		if (arg3 == Class530.aClass530_9) {
			local1 = '.';
			local3 = ',';
		}
		if (arg3 == Class530.aClass530_3) {
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

	@OriginalMember(owner = "client!vx", name = "c", descriptor = "(JIZLclient!vk;)Ljava/lang/String;", line = 114)
	public static String method32586(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class530 arg3) {
		@Pc(1) char local1 = ',';
		@Pc(3) char local3 = '.';
		if (arg3 == Class530.aClass530_9) {
			local1 = '.';
			local3 = ',';
		}
		if (arg3 == Class530.aClass530_3) {
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

	@OriginalMember(owner = "client!vx", name = "js", descriptor = "(Ljava/lang/String;I)V", line = 9493)
	public static void method32587(@OriginalArg(0) String arg0) {
		if (!client.aBoolean596 || (Class162.anInt3446 * -1948586859 & 0x18) == 0) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(15) int local15 = Class52.anInt1127 * 701602229;
		@Pc(17) int[] local17 = Class52.anIntArray167;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			@Pc(28) Class26_Sub1_Sub1_Sub1_Sub2 local28 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local17[local19]];
			if (local28.aString75 != null && local28.aString75.equalsIgnoreCase(arg0) && (local28 == Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 && (Class162.anInt3446 * -1948586859 & 0x10) != 0 || (Class162.anInt3446 * -1948586859 & 0x8) != 0)) {
				@Pc(58) Class3_Sub23 local58 = Class269.method25284(Class311.aClass311_29, client.aClass82_2.aClass577_2);
				local58.aClass3_Sub41_Sub1_1.method20318(client.anInt3122 * -2059988435);
				local58.aClass3_Sub41_Sub1_1.method20287(local17[local19]);
				local58.aClass3_Sub41_Sub1_1.method20318(client.anInt3123 * -31457453);
				local58.aClass3_Sub41_Sub1_1.method20322(Class616.anInt5552 * -944851473);
				local58.aClass3_Sub41_Sub1_1.method20250(0);
				client.aClass82_2.method21601(local58);
				Class441.method28249(local28.anIntArray241[0], local28.anIntArray239[0]);
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Class544.method32611(4, Class601.aClass601_130.method33512(Class469.aClass530_2) + arg0);
		}
		if (client.aBoolean596) {
			Class44_Sub2.method15142();
		}
	}

	@OriginalMember(owner = "client!vx", name = "ln", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 11365)
	public static final void method32588(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(2) Class82 local2 = Class406.method27657();
		@Pc(8) Class3_Sub23 local8 = Class269.method25284(Class311.aClass311_25, local2.aClass577_2);
		if (arg1.length() > 30) {
			arg1 = arg1.substring(0, 30);
		}
		local8.aClass3_Sub41_Sub1_1.method20250(Class43_Sub2.method8763(arg0) + Class43_Sub2.method8763(arg1));
		local8.aClass3_Sub41_Sub1_1.method20260(arg1);
		local8.aClass3_Sub41_Sub1_1.method20260(arg0);
		local2.method21601(local8);
	}
}
