package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public class Class519 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "I")
	static int anInt5283;

	@OriginalMember(owner = "client!v", name = "y", descriptor = "I")
	static int anInt5284;

	@OriginalMember(owner = "client!v", name = "ja", descriptor = "I")
	public static int anInt5285;

	@OriginalMember(owner = "client!v", name = "p", descriptor = "Lclient!ew;")
	static Class161 aClass161_58 = new Class161(32);

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 15)
	Class519() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!v", name = "u", descriptor = "(Lclient!de;IIIIILclient!dh;IIIILclient!wi;)Lclient!dh;", line = 20)
	public static Class20 method29730(@OriginalArg(0) Class21 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class20 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class71 arg10) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg10 != null) {
			local5 |= arg10.method20035();
			local5 &= 0xFFFFFDFF;
		}
		@Pc(38) long local38 = ((long) arg6 << 32) + (long) (arg4 + (arg8 << 16) + (arg9 << 24)) + ((long) arg7 << 48);
		@Pc(41) Class161 local41 = aClass161_58;
		@Pc(47) Class20 local47;
		synchronized (aClass161_58) {
			local47 = (Class20) aClass161_58.method23219(local38);
		}
		if (local47 == null || arg0.method17117(local47.method5327(), local5) != 0) {
			if (local47 != null) {
				local5 = arg0.method17102(local5, local47.method5327());
			}
			@Pc(78) byte local78;
			if (arg4 == 1) {
				local78 = 9;
			} else if (arg4 == 2) {
				local78 = 12;
			} else if (arg4 == 3) {
				local78 = 15;
			} else if (arg4 == 4) {
				local78 = 18;
			} else {
				local78 = 21;
			}
			@Pc(101) byte local101 = 3;
			@Pc(116) int[] local116 = new int[] { 64, 96, 128 };
			@Pc(133) Class138 local133 = new Class138(local101 * local78 + 1, local78 * 2 * local101 - local78, 0);
			@Pc(139) int local139 = local133.method22958(0, 0, 0);
			@Pc(143) int[][] local143 = new int[local101][local78];
			@Pc(145) int local145;
			@Pc(152) int local152;
			@Pc(156) int local156;
			@Pc(175) int local175;
			for (local145 = 0; local145 < local101; local145++) {
				local152 = local116[local145];
				local156 = local116[local145];
				for (@Pc(158) int local158 = 0; local158 < local78; local158++) {
					@Pc(167) int local167 = (local158 << 14) / local78;
					local175 = local152 * Class317.anIntArray419[local167] >> 14;
					@Pc(183) int local183 = Class317.anIntArray420[local167] * local156 >> 14;
					local143[local145][local158] = local133.method22958(local175, 0, local183);
				}
			}
			for (local145 = 0; local145 < local101; local145++) {
				local152 = (local145 * 256 + 128) / local101;
				local156 = 256 - local152;
				@Pc(225) byte local225 = (byte) (arg8 * local156 + local152 * arg9 >> 8);
				@Pc(270) short local270 = (short) ((local152 * (arg7 & 0x7F) + (arg6 & 0x7F) * local156 & 0x7F00) + (local156 * (arg6 & 0xFC00) + local152 * (arg7 & 0xFC00) & 0xFC0000) + (local152 * (arg7 & 0x380) + local156 * (arg6 & 0x380) & 0x38000) >> 8);
				for (local175 = 0; local175 < local78; local175++) {
					if (local145 == 0) {
						local133.method22959(local139, local143[0][(local175 + 1) % local78], local143[0][local175], (byte) 1, (byte) -1, local270, local225, (short) -1);
					} else {
						local133.method22959(local143[local145 - 1][local175], local143[local145 - 1][(local175 + 1) % local78], local143[local145][(local175 + 1) % local78], (byte) 1, (byte) -1, local270, local225, (short) -1);
						local133.method22959(local143[local145 - 1][local175], local143[local145][(local175 + 1) % local78], local143[local145][local175], (byte) 1, (byte) -1, local270, local225, (short) -1);
					}
				}
			}
			local47 = arg0.method17100(local133, local5, anInt5283 * -359614695, 64, 768);
			@Pc(383) Class161 local383 = aClass161_58;
			synchronized (aClass161_58) {
				aClass161_58.method23222(local47, local38);
			}
		}
		@Pc(399) int local399 = arg5.method5363();
		@Pc(402) int local402 = arg5.method5358();
		@Pc(405) int local405 = arg5.method5450();
		@Pc(408) int local408 = arg5.method5362();
		if (arg10 == null) {
			local47 = local47.method5430((byte) 3, local5, true);
			local47.method5335(local402 - local399 >> 1, 128, local408 - local405 >> 1);
			local47.method5333(local399 + local402 >> 1, 0, local405 + local408 >> 1);
		} else {
			local47 = local47.method5430((byte) 3, local5, true);
			local47.method5335(local402 - local399 >> 1, 128, local408 - local405 >> 1);
			local47.method5333(local399 + local402 >> 1, 0, local405 + local408 >> 1);
			arg10.method20077(local47);
		}
		if (arg1 != 0) {
			local47.method5331(arg1);
		}
		if (arg2 != 0) {
			local47.method5482(arg2);
		}
		if (arg3 != 0) {
			local47.method5333(0, arg3, 0);
		}
		return local47;
	}

	@OriginalMember(owner = "client!v", name = "s", descriptor = "(Lclient!de;IIIIILclient!dh;IIIILclient!wi;)Lclient!dh;", line = 20)
	public static Class20 method29731(@OriginalArg(0) Class21 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class20 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class71 arg10) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg10 != null) {
			local5 |= arg10.method20035();
			local5 &= 0xFFFFFDFF;
		}
		@Pc(38) long local38 = ((long) arg6 << 32) + (long) (arg4 + (arg8 << 16) + (arg9 << 24)) + ((long) arg7 << 48);
		@Pc(41) Class161 local41 = aClass161_58;
		@Pc(47) Class20 local47;
		synchronized (aClass161_58) {
			local47 = (Class20) aClass161_58.method23219(local38);
		}
		if (local47 == null || arg0.method17117(local47.method5327(), local5) != 0) {
			if (local47 != null) {
				local5 = arg0.method17102(local5, local47.method5327());
			}
			@Pc(78) byte local78;
			if (arg4 == 1) {
				local78 = 9;
			} else if (arg4 == 2) {
				local78 = 12;
			} else if (arg4 == 3) {
				local78 = 15;
			} else if (arg4 == 4) {
				local78 = 18;
			} else {
				local78 = 21;
			}
			@Pc(101) byte local101 = 3;
			@Pc(116) int[] local116 = new int[] { 64, 96, 128 };
			@Pc(133) Class138 local133 = new Class138(local101 * local78 + 1, local78 * 2 * local101 - local78, 0);
			@Pc(139) int local139 = local133.method22958(0, 0, 0);
			@Pc(143) int[][] local143 = new int[local101][local78];
			@Pc(145) int local145;
			@Pc(152) int local152;
			@Pc(156) int local156;
			@Pc(175) int local175;
			for (local145 = 0; local145 < local101; local145++) {
				local152 = local116[local145];
				local156 = local116[local145];
				for (@Pc(158) int local158 = 0; local158 < local78; local158++) {
					@Pc(167) int local167 = (local158 << 14) / local78;
					local175 = local152 * Class317.anIntArray419[local167] >> 14;
					@Pc(183) int local183 = Class317.anIntArray420[local167] * local156 >> 14;
					local143[local145][local158] = local133.method22958(local175, 0, local183);
				}
			}
			for (local145 = 0; local145 < local101; local145++) {
				local152 = (local145 * 256 + 128) / local101;
				local156 = 256 - local152;
				@Pc(225) byte local225 = (byte) (arg8 * local156 + local152 * arg9 >> 8);
				@Pc(270) short local270 = (short) ((local152 * (arg7 & 0x7F) + (arg6 & 0x7F) * local156 & 0x7F00) + (local156 * (arg6 & 0xFC00) + local152 * (arg7 & 0xFC00) & 0xFC0000) + (local152 * (arg7 & 0x380) + local156 * (arg6 & 0x380) & 0x38000) >> 8);
				for (local175 = 0; local175 < local78; local175++) {
					if (local145 == 0) {
						local133.method22959(local139, local143[0][(local175 + 1) % local78], local143[0][local175], (byte) 1, (byte) -1, local270, local225, (short) -1);
					} else {
						local133.method22959(local143[local145 - 1][local175], local143[local145 - 1][(local175 + 1) % local78], local143[local145][(local175 + 1) % local78], (byte) 1, (byte) -1, local270, local225, (short) -1);
						local133.method22959(local143[local145 - 1][local175], local143[local145][(local175 + 1) % local78], local143[local145][local175], (byte) 1, (byte) -1, local270, local225, (short) -1);
					}
				}
			}
			local47 = arg0.method17100(local133, local5, anInt5283 * -359614695, 64, 768);
			@Pc(383) Class161 local383 = aClass161_58;
			synchronized (aClass161_58) {
				aClass161_58.method23222(local47, local38);
			}
		}
		@Pc(399) int local399 = arg5.method5363();
		@Pc(402) int local402 = arg5.method5358();
		@Pc(405) int local405 = arg5.method5450();
		@Pc(408) int local408 = arg5.method5362();
		if (arg10 == null) {
			local47 = local47.method5430((byte) 3, local5, true);
			local47.method5335(local402 - local399 >> 1, 128, local408 - local405 >> 1);
			local47.method5333(local399 + local402 >> 1, 0, local405 + local408 >> 1);
		} else {
			local47 = local47.method5430((byte) 3, local5, true);
			local47.method5335(local402 - local399 >> 1, 128, local408 - local405 >> 1);
			local47.method5333(local399 + local402 >> 1, 0, local405 + local408 >> 1);
			arg10.method20077(local47);
		}
		if (arg1 != 0) {
			local47.method5331(arg1);
		}
		if (arg2 != 0) {
			local47.method5482(arg2);
		}
		if (arg3 != 0) {
			local47.method5333(0, arg3, 0);
		}
		return local47;
	}

	@OriginalMember(owner = "client!v", name = "y", descriptor = "(Lclient!de;IIIIILclient!dh;IIIILclient!wi;)Lclient!dh;", line = 20)
	public static Class20 method29738(@OriginalArg(0) Class21 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class20 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class71 arg10) {
		if (arg5 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg10 != null) {
			local5 |= arg10.method20035();
			local5 &= 0xFFFFFDFF;
		}
		@Pc(38) long local38 = ((long) arg6 << 32) + (long) (arg4 + (arg8 << 16) + (arg9 << 24)) + ((long) arg7 << 48);
		@Pc(41) Class161 local41 = aClass161_58;
		@Pc(47) Class20 local47;
		synchronized (aClass161_58) {
			local47 = (Class20) aClass161_58.method23219(local38);
		}
		if (local47 == null || arg0.method17117(local47.method5327(), local5) != 0) {
			if (local47 != null) {
				local5 = arg0.method17102(local5, local47.method5327());
			}
			@Pc(78) byte local78;
			if (arg4 == 1) {
				local78 = 9;
			} else if (arg4 == 2) {
				local78 = 12;
			} else if (arg4 == 3) {
				local78 = 15;
			} else if (arg4 == 4) {
				local78 = 18;
			} else {
				local78 = 21;
			}
			@Pc(101) byte local101 = 3;
			@Pc(116) int[] local116 = new int[] { 64, 96, 128 };
			@Pc(133) Class138 local133 = new Class138(local101 * local78 + 1, local78 * 2 * local101 - local78, 0);
			@Pc(139) int local139 = local133.method22958(0, 0, 0);
			@Pc(143) int[][] local143 = new int[local101][local78];
			@Pc(145) int local145;
			@Pc(152) int local152;
			@Pc(156) int local156;
			@Pc(175) int local175;
			for (local145 = 0; local145 < local101; local145++) {
				local152 = local116[local145];
				local156 = local116[local145];
				for (@Pc(158) int local158 = 0; local158 < local78; local158++) {
					@Pc(167) int local167 = (local158 << 14) / local78;
					local175 = local152 * Class317.anIntArray419[local167] >> 14;
					@Pc(183) int local183 = Class317.anIntArray420[local167] * local156 >> 14;
					local143[local145][local158] = local133.method22958(local175, 0, local183);
				}
			}
			for (local145 = 0; local145 < local101; local145++) {
				local152 = (local145 * 256 + 128) / local101;
				local156 = 256 - local152;
				@Pc(225) byte local225 = (byte) (arg8 * local156 + local152 * arg9 >> 8);
				@Pc(270) short local270 = (short) ((local152 * (arg7 & 0x7F) + (arg6 & 0x7F) * local156 & 0x7F00) + (local156 * (arg6 & 0xFC00) + local152 * (arg7 & 0xFC00) & 0xFC0000) + (local152 * (arg7 & 0x380) + local156 * (arg6 & 0x380) & 0x38000) >> 8);
				for (local175 = 0; local175 < local78; local175++) {
					if (local145 == 0) {
						local133.method22959(local139, local143[0][(local175 + 1) % local78], local143[0][local175], (byte) 1, (byte) -1, local270, local225, (short) -1);
					} else {
						local133.method22959(local143[local145 - 1][local175], local143[local145 - 1][(local175 + 1) % local78], local143[local145][(local175 + 1) % local78], (byte) 1, (byte) -1, local270, local225, (short) -1);
						local133.method22959(local143[local145 - 1][local175], local143[local145][(local175 + 1) % local78], local143[local145][local175], (byte) 1, (byte) -1, local270, local225, (short) -1);
					}
				}
			}
			local47 = arg0.method17100(local133, local5, anInt5283 * -359614695, 64, 768);
			@Pc(383) Class161 local383 = aClass161_58;
			synchronized (aClass161_58) {
				aClass161_58.method23222(local47, local38);
			}
		}
		@Pc(399) int local399 = arg5.method5363();
		@Pc(402) int local402 = arg5.method5358();
		@Pc(405) int local405 = arg5.method5450();
		@Pc(408) int local408 = arg5.method5362();
		if (arg10 == null) {
			local47 = local47.method5430((byte) 3, local5, true);
			local47.method5335(local402 - local399 >> 1, 128, local408 - local405 >> 1);
			local47.method5333(local399 + local402 >> 1, 0, local405 + local408 >> 1);
		} else {
			local47 = local47.method5430((byte) 3, local5, true);
			local47.method5335(local402 - local399 >> 1, 128, local408 - local405 >> 1);
			local47.method5333(local399 + local402 >> 1, 0, local405 + local408 >> 1);
			arg10.method20077(local47);
		}
		if (arg1 != 0) {
			local47.method5331(arg1);
		}
		if (arg2 != 0) {
			local47.method5482(arg2);
		}
		if (arg3 != 0) {
			local47.method5333(0, arg3, 0);
		}
		return local47;
	}

	@OriginalMember(owner = "client!v", name = "y", descriptor = "(IIZB)Ljava/lang/String;", line = 119)
	static String method29744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
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

	@OriginalMember(owner = "client!v", name = "n", descriptor = "(I)V", line = 145)
	static void method29732(@OriginalArg(0) int arg0) {
		anInt5283 = arg0 * 705606953;
		@Pc(6) Class161 local6 = aClass161_58;
		synchronized (aClass161_58) {
			aClass161_58.method23224();
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V", line = 145)
	static void method29733(@OriginalArg(0) int arg0) {
		anInt5283 = arg0 * 705606953;
		@Pc(6) Class161 local6 = aClass161_58;
		synchronized (aClass161_58) {
			aClass161_58.method23224();
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V", line = 145)
	static void method29734(@OriginalArg(0) int arg0) {
		anInt5283 = arg0 * 705606953;
		@Pc(6) Class161 local6 = aClass161_58;
		synchronized (aClass161_58) {
			aClass161_58.method23224();
		}
	}

	@OriginalMember(owner = "client!v", name = "z", descriptor = "(I)V", line = 145)
	static void method29735(@OriginalArg(0) int arg0) {
		anInt5283 = arg0 * 705606953;
		@Pc(6) Class161 local6 = aClass161_58;
		synchronized (aClass161_58) {
			aClass161_58.method23224();
		}
	}

	@OriginalMember(owner = "client!v", name = "j", descriptor = "(I)V", line = 145)
	static void method29736(@OriginalArg(0) int arg0) {
		anInt5283 = arg0 * 705606953;
		@Pc(6) Class161 local6 = aClass161_58;
		synchronized (aClass161_58) {
			aClass161_58.method23224();
		}
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "()V", line = 152)
	public static void method29739() {
		@Pc(2) Class161 local2 = aClass161_58;
		synchronized (aClass161_58) {
			aClass161_58.method23224();
		}
	}

	@OriginalMember(owner = "client!v", name = "r", descriptor = "()V", line = 152)
	public static void method29740() {
		@Pc(2) Class161 local2 = aClass161_58;
		synchronized (aClass161_58) {
			aClass161_58.method23224();
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V", line = 158)
	static void method29737(@OriginalArg(0) int arg0) {
		@Pc(2) Class161 local2 = aClass161_58;
		synchronized (aClass161_58) {
			aClass161_58.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "q", descriptor = "()V", line = 164)
	static void method29741() {
		@Pc(2) Class161 local2 = aClass161_58;
		synchronized (aClass161_58) {
			aClass161_58.method23245();
		}
	}

	@OriginalMember(owner = "client!v", name = "x", descriptor = "(I)V", line = 259)
	public static void method29742() {
		Class271.aClass161_31.method23224();
	}

	@OriginalMember(owner = "client!v", name = "aep", descriptor = "(Lclient!vs;I)V", line = 9679)
	static final void method29743(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class622.aClass580_2.method33211(local13).anIntArray262[local23];
	}
}
