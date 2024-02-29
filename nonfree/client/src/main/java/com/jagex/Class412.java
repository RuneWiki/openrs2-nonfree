package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public class Class412 {

	@OriginalMember(owner = "client!n", name = "c", descriptor = "I")
	static int anInt4715;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "Lclient!er;")
	static Class232 aClass232_81 = new Class232(32);

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V", line = 15)
	Class412() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!n", name = "t", descriptor = "(Lclient!dx;IIIIILclient!dv;IIIILclient!zx;)Lclient!dv;", line = 20)
	public static Class84 method28580(@OriginalArg(0) Class86 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class84 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class151 arg10) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg10 != null) {
			local5 |= arg10.method23432();
			local5 &= 0xFFFFFDFF;
		}
		@Pc(39) long local39 = ((long) arg7 << 48) + ((long) arg6 << 32) + (long) ((arg9 << 24) + (arg8 << 16) + arg4);
		@Pc(42) Class232 local42 = aClass232_81;
		@Pc(48) Class84 local48;
		synchronized (aClass232_81) {
			local48 = (Class84) aClass232_81.method25835(local39);
		}
		@Pc(80) int local80;
		if (local48 == null || arg0.method20116(local48.method6875(), local5) != 0) {
			if (local48 != null) {
				local5 = arg0.method20117(local5, local48.method6875());
			}
			local80 = arg4 * 3 + 6;
			@Pc(82) byte local82 = 3;
			@Pc(97) int[] local97 = new int[] { 64, 96, 128 };
			@Pc(114) Class216 local114 = new Class216(local82 * local80 + 1, local80 * local82 * 2 - local80, 0);
			@Pc(120) int local120 = local114.method25665(0, 0, 0);
			@Pc(124) int[][] local124 = new int[local82][local80];
			@Pc(126) int local126;
			@Pc(133) int local133;
			@Pc(137) int local137;
			@Pc(156) int local156;
			for (local126 = 0; local126 < local82; local126++) {
				local133 = local97[local126];
				local137 = local97[local126];
				for (@Pc(139) int local139 = 0; local139 < local80; local139++) {
					@Pc(148) int local148 = (local139 << 14) / local80;
					local156 = local133 * Class436.anIntArray464[local148] >> 14;
					@Pc(164) int local164 = Class436.anIntArray463[local148] * local137 >> 14;
					local124[local126][local139] = local114.method25665(local156, 0, local164);
				}
			}
			for (local126 = 0; local126 < local82; local126++) {
				local133 = (local126 * 256 + 128) / local82;
				local137 = 256 - local133;
				@Pc(206) byte local206 = (byte) (arg9 * local133 + local137 * arg8 >> 8);
				@Pc(251) short local251 = (short) (((arg6 & 0xFC00) * local137 + (arg7 & 0xFC00) * local133 & 0xFC0000) + (local133 * (arg7 & 0x380) + local137 * (arg6 & 0x380) & 0x38000) + (local137 * (arg6 & 0x7F) + (arg7 & 0x7F) * local133 & 0x7F00) >> 8);
				for (local156 = 0; local156 < local80; local156++) {
					if (local126 == 0) {
						local114.method25667(local120, local124[0][(local156 + 1) % local80], local124[0][local156], (byte) 1, (byte) -1, local251, local206, (short) -1);
					} else {
						local114.method25667(local124[local126 - 1][local156], local124[local126 - 1][(local156 + 1) % local80], local124[local126][(local156 + 1) % local80], (byte) 1, (byte) -1, local251, local206, (short) -1);
						local114.method25667(local124[local126 - 1][local156], local124[local126][(local156 + 1) % local80], local124[local126][local156], (byte) 1, (byte) -1, local251, local206, (short) -1);
					}
				}
			}
			local48 = arg0.method20115(local114, local5, anInt4715 * -1789606037, 64, 768);
			@Pc(364) Class232 local364 = aClass232_81;
			synchronized (aClass232_81) {
				aClass232_81.method25844(local48, local39);
			}
		}
		local80 = arg5.method6906();
		@Pc(383) int local383 = arg5.method6822();
		@Pc(386) int local386 = arg5.method6826();
		@Pc(389) int local389 = arg5.method6817();
		if (arg10 == null) {
			local48 = local48.method6794((byte) 3, local5, true);
			local48.method6803(local383 - local80 >> 1, 128, local389 - local386 >> 1);
			local48.method6872(local383 + local80 >> 1, 0, local386 + local389 >> 1);
		} else {
			local48 = local48.method6794((byte) 3, local5, true);
			local48.method6803(local383 - local80 >> 1, 128, local389 - local386 >> 1);
			local48.method6872(local383 + local80 >> 1, 0, local386 + local389 >> 1);
			arg10.method23440(local48);
		}
		if (arg1 != 0) {
			local48.method6799(arg1);
		}
		if (arg2 != 0) {
			local48.method6800(arg2);
		}
		if (arg3 != 0) {
			local48.method6872(0, arg3, 0);
		}
		return local48;
	}

	@OriginalMember(owner = "client!n", name = "w", descriptor = "(II)Z", line = 51)
	public static boolean method28581(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!n", name = "x", descriptor = "(Lclient!dx;IIIILclient!dv;SBLclient!zx;)Lclient!dv;", line = 89)
	public static Class84 method28582(@OriginalArg(0) Class86 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class84 arg4, @OriginalArg(6) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) Class151 arg7) {
		if (arg4 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg7 != null) {
			local5 |= arg7.method23432();
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg5 & 0xFFFF) << 8 | arg6);
		@Pc(29) Class232 local29 = aClass232_81;
		@Pc(35) Class84 local35;
		synchronized (aClass232_81) {
			local35 = (Class84) aClass232_81.method25835(local26);
		}
		if (local35 == null || arg0.method20116(local35.method6875(), local5) != 0) {
			if (local35 != null) {
				local5 = arg0.method20117(local5, local35.method6875());
			}
			@Pc(66) Class216 local66 = new Class216(4, 2, 2);
			@Pc(68) short local68 = 128;
			@Pc(71) int[] local71 = new int[] { local66.method25665(-local68, 0, -local68), local66.method25665(local68, 0, -local68), local66.method25665(local68, 0, local68), local66.method25665(-local68, 0, local68) };
			local66.method25667(0, 1, 2, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25667(0, 2, 3, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25671((short) 1, (short) 2, (short) 0);
			local66.method25671((short) 2, (short) 3, (short) 0);
			local35 = arg0.method20115(local66, local5, anInt4715 * -1789606037, 64, 768);
			@Pc(154) Class232 local154 = aClass232_81;
			synchronized (aClass232_81) {
				aClass232_81.method25844(local35, local26);
			}
		}
		@Pc(170) int local170 = arg4.method6906();
		@Pc(173) int local173 = arg4.method6822();
		@Pc(176) int local176 = arg4.method6826();
		@Pc(179) int local179 = arg4.method6817();
		if (arg7 == null) {
			local35 = local35.method6794((byte) 3, local5, true);
			local35.method6803(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6872(local173 + local170 >> 1, 0, local176 + local179 >> 1);
		} else {
			local35 = local35.method6794((byte) 3, local5, true);
			local35.method6803(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6872(local170 + local173 >> 1, 0, local179 + local176 >> 1);
			arg7.method23440(local35);
		}
		if (arg1 != 0) {
			local35.method6799(arg1);
		}
		if (arg2 != 0) {
			local35.method6800(arg2);
		}
		if (arg3 != 0) {
			local35.method6872(0, arg3, 0);
		}
		return local35;
	}

	@OriginalMember(owner = "client!n", name = "q", descriptor = "(Lclient!dx;IIIILclient!dv;SBLclient!zx;)Lclient!dv;", line = 89)
	public static Class84 method28583(@OriginalArg(0) Class86 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class84 arg4, @OriginalArg(6) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) Class151 arg7) {
		if (arg4 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg7 != null) {
			local5 |= arg7.method23432();
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg5 & 0xFFFF) << 8 | arg6);
		@Pc(29) Class232 local29 = aClass232_81;
		@Pc(35) Class84 local35;
		synchronized (aClass232_81) {
			local35 = (Class84) aClass232_81.method25835(local26);
		}
		if (local35 == null || arg0.method20116(local35.method6875(), local5) != 0) {
			if (local35 != null) {
				local5 = arg0.method20117(local5, local35.method6875());
			}
			@Pc(66) Class216 local66 = new Class216(4, 2, 2);
			@Pc(68) short local68 = 128;
			@Pc(71) int[] local71 = new int[] { local66.method25665(-local68, 0, -local68), local66.method25665(local68, 0, -local68), local66.method25665(local68, 0, local68), local66.method25665(-local68, 0, local68) };
			local66.method25667(0, 1, 2, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25667(0, 2, 3, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25671((short) 1, (short) 2, (short) 0);
			local66.method25671((short) 2, (short) 3, (short) 0);
			local35 = arg0.method20115(local66, local5, anInt4715 * -1789606037, 64, 768);
			@Pc(154) Class232 local154 = aClass232_81;
			synchronized (aClass232_81) {
				aClass232_81.method25844(local35, local26);
			}
		}
		@Pc(170) int local170 = arg4.method6906();
		@Pc(173) int local173 = arg4.method6822();
		@Pc(176) int local176 = arg4.method6826();
		@Pc(179) int local179 = arg4.method6817();
		if (arg7 == null) {
			local35 = local35.method6794((byte) 3, local5, true);
			local35.method6803(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6872(local173 + local170 >> 1, 0, local176 + local179 >> 1);
		} else {
			local35 = local35.method6794((byte) 3, local5, true);
			local35.method6803(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6872(local170 + local173 >> 1, 0, local179 + local176 >> 1);
			arg7.method23440(local35);
		}
		if (arg1 != 0) {
			local35.method6799(arg1);
		}
		if (arg2 != 0) {
			local35.method6800(arg2);
		}
		if (arg3 != 0) {
			local35.method6872(0, arg3, 0);
		}
		return local35;
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(Lclient!dx;IIIILclient!dv;SBLclient!zx;)Lclient!dv;", line = 89)
	public static Class84 method28584(@OriginalArg(0) Class86 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class84 arg4, @OriginalArg(6) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) Class151 arg7) {
		if (arg4 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg7 != null) {
			local5 |= arg7.method23432();
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg5 & 0xFFFF) << 8 | arg6);
		@Pc(29) Class232 local29 = aClass232_81;
		@Pc(35) Class84 local35;
		synchronized (aClass232_81) {
			local35 = (Class84) aClass232_81.method25835(local26);
		}
		if (local35 == null || arg0.method20116(local35.method6875(), local5) != 0) {
			if (local35 != null) {
				local5 = arg0.method20117(local5, local35.method6875());
			}
			@Pc(66) Class216 local66 = new Class216(4, 2, 2);
			@Pc(68) short local68 = 128;
			@Pc(71) int[] local71 = new int[] { local66.method25665(-local68, 0, -local68), local66.method25665(local68, 0, -local68), local66.method25665(local68, 0, local68), local66.method25665(-local68, 0, local68) };
			local66.method25667(0, 1, 2, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25667(0, 2, 3, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25671((short) 1, (short) 2, (short) 0);
			local66.method25671((short) 2, (short) 3, (short) 0);
			local35 = arg0.method20115(local66, local5, anInt4715 * -1789606037, 64, 768);
			@Pc(154) Class232 local154 = aClass232_81;
			synchronized (aClass232_81) {
				aClass232_81.method25844(local35, local26);
			}
		}
		@Pc(170) int local170 = arg4.method6906();
		@Pc(173) int local173 = arg4.method6822();
		@Pc(176) int local176 = arg4.method6826();
		@Pc(179) int local179 = arg4.method6817();
		if (arg7 == null) {
			local35 = local35.method6794((byte) 3, local5, true);
			local35.method6803(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6872(local173 + local170 >> 1, 0, local176 + local179 >> 1);
		} else {
			local35 = local35.method6794((byte) 3, local5, true);
			local35.method6803(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6872(local170 + local173 >> 1, 0, local179 + local176 >> 1);
			arg7.method23440(local35);
		}
		if (arg1 != 0) {
			local35.method6799(arg1);
		}
		if (arg2 != 0) {
			local35.method6800(arg2);
		}
		if (arg3 != 0) {
			local35.method6872(0, arg3, 0);
		}
		return local35;
	}

	@OriginalMember(owner = "client!n", name = "s", descriptor = "(I)V", line = 140)
	static void method28585(@OriginalArg(0) int arg0) {
		anInt4715 = arg0 * 365309251;
		@Pc(6) Class232 local6 = aClass232_81;
		synchronized (aClass232_81) {
			aClass232_81.method25850();
		}
	}

	@OriginalMember(owner = "client!n", name = "r", descriptor = "()V", line = 147)
	public static void method28586() {
		@Pc(2) Class232 local2 = aClass232_81;
		synchronized (aClass232_81) {
			aClass232_81.method25850();
		}
	}

	@OriginalMember(owner = "client!n", name = "g", descriptor = "()V", line = 147)
	public static void method28587() {
		@Pc(2) Class232 local2 = aClass232_81;
		synchronized (aClass232_81) {
			aClass232_81.method25850();
		}
	}

	@OriginalMember(owner = "client!n", name = "z", descriptor = "()V", line = 147)
	public static void method28588() {
		@Pc(2) Class232 local2 = aClass232_81;
		synchronized (aClass232_81) {
			aClass232_81.method25850();
		}
	}

	@OriginalMember(owner = "client!n", name = "ly", descriptor = "(Lclient!yf;I)V", line = 6661)
	static final void method28589(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class505.method30260(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!n", name = "pw", descriptor = "(Lclient!yf;B)V", line = 7307)
	static final void method28590(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class476.method29697(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!n", name = "qb", descriptor = "(Lclient!yf;I)V", line = 7466)
	static final void method28591(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3881 * 1500908359;
	}
}
