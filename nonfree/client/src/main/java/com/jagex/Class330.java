package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public class Class330 {

	@OriginalMember(owner = "client!i", name = "n", descriptor = "I")
	static int anInt4146;

	@OriginalMember(owner = "client!i", name = "e", descriptor = "Lclient!eb;")
	static Class240 aClass240_79 = new Class240(32);

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V", line = 15)
	Class330() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(Lclient!dh;IIIIILclient!do;IIIILclient!aaq;)Lclient!do;", line = 20)
	public static Class109 method27353(@OriginalArg(0) Class104 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class109 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class19 arg10) {
		if (arg5 == null) {
			return null;
		}
		@Pc(6) int local6 = 2055;
		if (arg10 != null) {
			local6 |= arg10.method23564();
			local6 &= 0xFFFFFDFF;
		}
		@Pc(39) long local39 = ((long) arg7 << 48) + (long) (arg4 + (arg8 << 16) + (arg9 << 24)) + ((long) arg6 << 32);
		@Pc(42) Class240 local42 = aClass240_79;
		@Pc(48) Class109 local48;
		synchronized (aClass240_79) {
			local48 = (Class109) aClass240_79.method25839(local39);
		}
		@Pc(79) int local79;
		if (local48 == null || arg0.method20693(local48.method6825(), local6) != 0) {
			if (local48 != null) {
				local6 = arg0.method20512(local6, local48.method6825());
			}
			local79 = arg4 * 3 + 6;
			@Pc(81) byte local81 = 3;
			@Pc(96) int[] local96 = new int[] { 64, 96, 128 };
			@Pc(113) Class231 local113 = new Class231(local79 * local81 + 1, local79 * local81 * 2 - local79, 0);
			@Pc(119) int local119 = local113.method25660(0, 0, 0);
			@Pc(123) int[][] local123 = new int[local81][local79];
			@Pc(125) int local125;
			@Pc(132) int local132;
			@Pc(136) int local136;
			@Pc(155) int local155;
			for (local125 = 0; local125 < local81; local125++) {
				local132 = local96[local125];
				local136 = local96[local125];
				for (@Pc(138) int local138 = 0; local138 < local79; local138++) {
					@Pc(147) int local147 = (local138 << 14) / local79;
					local155 = Class464.anIntArray451[local147] * local132 >> 14;
					@Pc(163) int local163 = local136 * Class464.anIntArray452[local147] >> 14;
					local123[local125][local138] = local113.method25660(local155, 0, local163);
				}
			}
			for (local125 = 0; local125 < local81; local125++) {
				local132 = (local125 * 256 + 128) / local81;
				local136 = 256 - local132;
				@Pc(205) byte local205 = (byte) (arg8 * local136 + arg9 * local132 >> 8);
				@Pc(250) short local250 = (short) (((arg6 & 0x380) * local136 + local132 * (arg7 & 0x380) & 0x38000) + ((arg7 & 0xFC00) * local132 + (arg6 & 0xFC00) * local136 & 0xFC0000) + ((arg6 & 0x7F) * local136 + local132 * (arg7 & 0x7F) & 0x7F00) >> 8);
				for (local155 = 0; local155 < local79; local155++) {
					if (local125 == 0) {
						local113.method25690(local119, local123[0][(local155 + 1) % local79], local123[0][local155], (byte) 1, (byte) -1, local250, local205, (short) -1);
					} else {
						local113.method25690(local123[local125 - 1][local155], local123[local125 - 1][(local155 + 1) % local79], local123[local125][(local155 + 1) % local79], (byte) 1, (byte) -1, local250, local205, (short) -1);
						local113.method25690(local123[local125 - 1][local155], local123[local125][(local155 + 1) % local79], local123[local125][local155], (byte) 1, (byte) -1, local250, local205, (short) -1);
					}
				}
			}
			local48 = arg0.method20510(local113, local6, anInt4146 * -1710939251, 64, 768);
			@Pc(363) Class240 local363 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25830(local48, local39);
			}
		}
		local79 = arg5.method6863();
		@Pc(382) int local382 = arg5.method6864();
		@Pc(385) int local385 = arg5.method6867();
		@Pc(388) int local388 = arg5.method6928();
		if (arg10 == null) {
			local48 = local48.method6907((byte) 3, local6, true);
			local48.method6833(local382 - local79 >> 1, 128, local388 - local385 >> 1);
			local48.method6939(local79 + local382 >> 1, 0, local385 + local388 >> 1);
		} else {
			local48 = local48.method6907((byte) 3, local6, true);
			local48.method6833(local382 - local79 >> 1, 128, local388 - local385 >> 1);
			local48.method6939(local382 + local79 >> 1, 0, local388 + local385 >> 1);
			arg10.method23567(local48);
		}
		if (arg1 != 0) {
			local48.method6986(arg1);
		}
		if (arg2 != 0) {
			local48.method6830(arg2);
		}
		if (arg3 != 0) {
			local48.method6939(0, arg3, 0);
		}
		return local48;
	}

	@OriginalMember(owner = "client!i", name = "n", descriptor = "(I)V", line = 72)
	static void method27370() {
		if (!Class202.method24643()) {
			return;
		}
		if (Class518.aStringArray31 == null) {
			Class555.method31054();
		}
		Class168.aBoolean380 = true;
		Class168.anInt2448 = 0;
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;", line = 89)
	public static Class109 method27351(@OriginalArg(0) Class104 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class109 arg4, @OriginalArg(6) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) Class19 arg7) {
		if (arg4 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg7 != null) {
			local5 |= arg7.method23564();
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg5 & 0xFFFF) << 8 | arg6);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25839(local26);
		}
		if (local35 == null || arg0.method20693(local35.method6825(), local5) != 0) {
			if (local35 != null) {
				local5 = arg0.method20512(local5, local35.method6825());
			}
			@Pc(66) Class231 local66 = new Class231(4, 2, 2);
			@Pc(68) short local68 = 128;
			@Pc(71) int[] local71 = new int[] { local66.method25660(-local68, 0, -local68), local66.method25660(local68, 0, -local68), local66.method25660(local68, 0, local68), local66.method25660(-local68, 0, local68) };
			local66.method25690(0, 1, 2, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25690(0, 2, 3, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25662((short) 1, (short) 2, (short) 0);
			local66.method25662((short) 2, (short) 3, (short) 0);
			local35 = arg0.method20510(local66, local5, anInt4146 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25830(local35, local26);
			}
		}
		@Pc(170) int local170 = arg4.method6863();
		@Pc(173) int local173 = arg4.method6864();
		@Pc(176) int local176 = arg4.method6867();
		@Pc(179) int local179 = arg4.method6928();
		if (arg7 == null) {
			local35 = local35.method6907((byte) 3, local5, true);
			local35.method6833(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6939(local173 + local170 >> 1, 0, local179 + local176 >> 1);
		} else {
			local35 = local35.method6907((byte) 3, local5, true);
			local35.method6833(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6939(local173 + local170 >> 1, 0, local176 + local179 >> 1);
			arg7.method23567(local35);
		}
		if (arg1 != 0) {
			local35.method6986(arg1);
		}
		if (arg2 != 0) {
			local35.method6830(arg2);
		}
		if (arg3 != 0) {
			local35.method6939(0, arg3, 0);
		}
		return local35;
	}

	@OriginalMember(owner = "client!i", name = "u", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;", line = 89)
	public static Class109 method27354(@OriginalArg(0) Class104 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class109 arg4, @OriginalArg(6) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) Class19 arg7) {
		if (arg4 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg7 != null) {
			local5 |= arg7.method23564();
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg5 & 0xFFFF) << 8 | arg6);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25839(local26);
		}
		if (local35 == null || arg0.method20693(local35.method6825(), local5) != 0) {
			if (local35 != null) {
				local5 = arg0.method20512(local5, local35.method6825());
			}
			@Pc(66) Class231 local66 = new Class231(4, 2, 2);
			@Pc(68) short local68 = 128;
			@Pc(71) int[] local71 = new int[] { local66.method25660(-local68, 0, -local68), local66.method25660(local68, 0, -local68), local66.method25660(local68, 0, local68), local66.method25660(-local68, 0, local68) };
			local66.method25690(0, 1, 2, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25690(0, 2, 3, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25662((short) 1, (short) 2, (short) 0);
			local66.method25662((short) 2, (short) 3, (short) 0);
			local35 = arg0.method20510(local66, local5, anInt4146 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25830(local35, local26);
			}
		}
		@Pc(170) int local170 = arg4.method6863();
		@Pc(173) int local173 = arg4.method6864();
		@Pc(176) int local176 = arg4.method6867();
		@Pc(179) int local179 = arg4.method6928();
		if (arg7 == null) {
			local35 = local35.method6907((byte) 3, local5, true);
			local35.method6833(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6939(local173 + local170 >> 1, 0, local179 + local176 >> 1);
		} else {
			local35 = local35.method6907((byte) 3, local5, true);
			local35.method6833(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6939(local173 + local170 >> 1, 0, local176 + local179 >> 1);
			arg7.method23567(local35);
		}
		if (arg1 != 0) {
			local35.method6986(arg1);
		}
		if (arg2 != 0) {
			local35.method6830(arg2);
		}
		if (arg3 != 0) {
			local35.method6939(0, arg3, 0);
		}
		return local35;
	}

	@OriginalMember(owner = "client!i", name = "z", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;", line = 89)
	public static Class109 method27355(@OriginalArg(0) Class104 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class109 arg4, @OriginalArg(6) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) Class19 arg7) {
		if (arg4 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg7 != null) {
			local5 |= arg7.method23564();
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg5 & 0xFFFF) << 8 | arg6);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25839(local26);
		}
		if (local35 == null || arg0.method20693(local35.method6825(), local5) != 0) {
			if (local35 != null) {
				local5 = arg0.method20512(local5, local35.method6825());
			}
			@Pc(66) Class231 local66 = new Class231(4, 2, 2);
			@Pc(68) short local68 = 128;
			@Pc(71) int[] local71 = new int[] { local66.method25660(-local68, 0, -local68), local66.method25660(local68, 0, -local68), local66.method25660(local68, 0, local68), local66.method25660(-local68, 0, local68) };
			local66.method25690(0, 1, 2, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25690(0, 2, 3, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25662((short) 1, (short) 2, (short) 0);
			local66.method25662((short) 2, (short) 3, (short) 0);
			local35 = arg0.method20510(local66, local5, anInt4146 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25830(local35, local26);
			}
		}
		@Pc(170) int local170 = arg4.method6863();
		@Pc(173) int local173 = arg4.method6864();
		@Pc(176) int local176 = arg4.method6867();
		@Pc(179) int local179 = arg4.method6928();
		if (arg7 == null) {
			local35 = local35.method6907((byte) 3, local5, true);
			local35.method6833(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6939(local173 + local170 >> 1, 0, local179 + local176 >> 1);
		} else {
			local35 = local35.method6907((byte) 3, local5, true);
			local35.method6833(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6939(local173 + local170 >> 1, 0, local176 + local179 >> 1);
			arg7.method23567(local35);
		}
		if (arg1 != 0) {
			local35.method6986(arg1);
		}
		if (arg2 != 0) {
			local35.method6830(arg2);
		}
		if (arg3 != 0) {
			local35.method6939(0, arg3, 0);
		}
		return local35;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;", line = 89)
	public static Class109 method27357(@OriginalArg(0) Class104 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class109 arg4, @OriginalArg(6) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) Class19 arg7) {
		if (arg4 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg7 != null) {
			local5 |= arg7.method23564();
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg5 & 0xFFFF) << 8 | arg6);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25839(local26);
		}
		if (local35 == null || arg0.method20693(local35.method6825(), local5) != 0) {
			if (local35 != null) {
				local5 = arg0.method20512(local5, local35.method6825());
			}
			@Pc(66) Class231 local66 = new Class231(4, 2, 2);
			@Pc(68) short local68 = 128;
			@Pc(71) int[] local71 = new int[] { local66.method25660(-local68, 0, -local68), local66.method25660(local68, 0, -local68), local66.method25660(local68, 0, local68), local66.method25660(-local68, 0, local68) };
			local66.method25690(0, 1, 2, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25690(0, 2, 3, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25662((short) 1, (short) 2, (short) 0);
			local66.method25662((short) 2, (short) 3, (short) 0);
			local35 = arg0.method20510(local66, local5, anInt4146 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25830(local35, local26);
			}
		}
		@Pc(170) int local170 = arg4.method6863();
		@Pc(173) int local173 = arg4.method6864();
		@Pc(176) int local176 = arg4.method6867();
		@Pc(179) int local179 = arg4.method6928();
		if (arg7 == null) {
			local35 = local35.method6907((byte) 3, local5, true);
			local35.method6833(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6939(local173 + local170 >> 1, 0, local179 + local176 >> 1);
		} else {
			local35 = local35.method6907((byte) 3, local5, true);
			local35.method6833(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6939(local173 + local170 >> 1, 0, local176 + local179 >> 1);
			arg7.method23567(local35);
		}
		if (arg1 != 0) {
			local35.method6986(arg1);
		}
		if (arg2 != 0) {
			local35.method6830(arg2);
		}
		if (arg3 != 0) {
			local35.method6939(0, arg3, 0);
		}
		return local35;
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;", line = 89)
	public static Class109 method27358(@OriginalArg(0) Class104 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class109 arg4, @OriginalArg(6) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) Class19 arg7) {
		if (arg4 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg7 != null) {
			local5 |= arg7.method23564();
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg5 & 0xFFFF) << 8 | arg6);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25839(local26);
		}
		if (local35 == null || arg0.method20693(local35.method6825(), local5) != 0) {
			if (local35 != null) {
				local5 = arg0.method20512(local5, local35.method6825());
			}
			@Pc(66) Class231 local66 = new Class231(4, 2, 2);
			@Pc(68) short local68 = 128;
			@Pc(71) int[] local71 = new int[] { local66.method25660(-local68, 0, -local68), local66.method25660(local68, 0, -local68), local66.method25660(local68, 0, local68), local66.method25660(-local68, 0, local68) };
			local66.method25690(0, 1, 2, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25690(0, 2, 3, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25662((short) 1, (short) 2, (short) 0);
			local66.method25662((short) 2, (short) 3, (short) 0);
			local35 = arg0.method20510(local66, local5, anInt4146 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25830(local35, local26);
			}
		}
		@Pc(170) int local170 = arg4.method6863();
		@Pc(173) int local173 = arg4.method6864();
		@Pc(176) int local176 = arg4.method6867();
		@Pc(179) int local179 = arg4.method6928();
		if (arg7 == null) {
			local35 = local35.method6907((byte) 3, local5, true);
			local35.method6833(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6939(local173 + local170 >> 1, 0, local179 + local176 >> 1);
		} else {
			local35 = local35.method6907((byte) 3, local5, true);
			local35.method6833(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6939(local173 + local170 >> 1, 0, local176 + local179 >> 1);
			arg7.method23567(local35);
		}
		if (arg1 != 0) {
			local35.method6986(arg1);
		}
		if (arg2 != 0) {
			local35.method6830(arg2);
		}
		if (arg3 != 0) {
			local35.method6939(0, arg3, 0);
		}
		return local35;
	}

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(Lclient!dh;IIIILclient!do;SBLclient!aaq;)Lclient!do;", line = 89)
	public static Class109 method27361(@OriginalArg(0) Class104 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class109 arg4, @OriginalArg(6) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) Class19 arg7) {
		if (arg4 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg7 != null) {
			local5 |= arg7.method23564();
			local5 &= 0xFFFFFDFF;
		}
		@Pc(26) long local26 = (long) ((arg5 & 0xFFFF) << 8 | arg6);
		@Pc(29) Class240 local29 = aClass240_79;
		@Pc(35) Class109 local35;
		synchronized (aClass240_79) {
			local35 = (Class109) aClass240_79.method25839(local26);
		}
		if (local35 == null || arg0.method20693(local35.method6825(), local5) != 0) {
			if (local35 != null) {
				local5 = arg0.method20512(local5, local35.method6825());
			}
			@Pc(66) Class231 local66 = new Class231(4, 2, 2);
			@Pc(68) short local68 = 128;
			@Pc(71) int[] local71 = new int[] { local66.method25660(-local68, 0, -local68), local66.method25660(local68, 0, -local68), local66.method25660(local68, 0, local68), local66.method25660(-local68, 0, local68) };
			local66.method25690(0, 1, 2, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25690(0, 2, 3, (byte) 1, (byte) 0, (short) 0, arg6, arg5);
			local66.method25662((short) 1, (short) 2, (short) 0);
			local66.method25662((short) 2, (short) 3, (short) 0);
			local35 = arg0.method20510(local66, local5, anInt4146 * -1710939251, 64, 768);
			@Pc(154) Class240 local154 = aClass240_79;
			synchronized (aClass240_79) {
				aClass240_79.method25830(local35, local26);
			}
		}
		@Pc(170) int local170 = arg4.method6863();
		@Pc(173) int local173 = arg4.method6864();
		@Pc(176) int local176 = arg4.method6867();
		@Pc(179) int local179 = arg4.method6928();
		if (arg7 == null) {
			local35 = local35.method6907((byte) 3, local5, true);
			local35.method6833(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6939(local173 + local170 >> 1, 0, local179 + local176 >> 1);
		} else {
			local35 = local35.method6907((byte) 3, local5, true);
			local35.method6833(local173 - local170 >> 1, 128, local179 - local176 >> 1);
			local35.method6939(local173 + local170 >> 1, 0, local176 + local179 >> 1);
			arg7.method23567(local35);
		}
		if (arg1 != 0) {
			local35.method6986(arg1);
		}
		if (arg2 != 0) {
			local35.method6830(arg2);
		}
		if (arg3 != 0) {
			local35.method6939(0, arg3, 0);
		}
		return local35;
	}

	@OriginalMember(owner = "client!i", name = "o", descriptor = "(I)V", line = 140)
	static void method27360(@OriginalArg(0) int arg0) {
		anInt4146 = arg0 * -1186277563;
		@Pc(6) Class240 local6 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25833();
		}
	}

	@OriginalMember(owner = "client!i", name = "v", descriptor = "(I)V", line = 140)
	static void method27366(@OriginalArg(0) int arg0) {
		anInt4146 = arg0 * -1186277563;
		@Pc(6) Class240 local6 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25833();
		}
	}

	@OriginalMember(owner = "client!i", name = "s", descriptor = "()V", line = 147)
	public static void method27352() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25833();
		}
	}

	@OriginalMember(owner = "client!i", name = "q", descriptor = "()V", line = 147)
	public static void method27356() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25833();
		}
	}

	@OriginalMember(owner = "client!i", name = "y", descriptor = "()V", line = 147)
	public static void method27369() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25833();
		}
	}

	@OriginalMember(owner = "client!i", name = "x", descriptor = "(I)V", line = 153)
	static void method27364(@OriginalArg(0) int arg0) {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25832(arg0);
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V", line = 153)
	static void method27365(@OriginalArg(0) int arg0) {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25832(arg0);
		}
	}

	@OriginalMember(owner = "client!i", name = "j", descriptor = "()V", line = 159)
	static void method27359() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25837();
		}
	}

	@OriginalMember(owner = "client!i", name = "h", descriptor = "()V", line = 159)
	static void method27362() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25837();
		}
	}

	@OriginalMember(owner = "client!i", name = "g", descriptor = "()V", line = 159)
	static void method27363() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25837();
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()V", line = 159)
	static void method27367() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25837();
		}
	}

	@OriginalMember(owner = "client!i", name = "i", descriptor = "()V", line = 159)
	static void method27368() {
		@Pc(2) Class240 local2 = aClass240_79;
		synchronized (aClass240_79) {
			aClass240_79.method25837();
		}
	}

	@OriginalMember(owner = "client!i", name = "ef", descriptor = "(I)Lclient!ax;", line = 2010)
	public static Class175 method27372() {
		return Class56.method18034(client.anInt3435 * -849002901) || client.anInt3435 * -849002901 == 0 ? client.aClass175_1 : client.aClass175_2;
	}

	@OriginalMember(owner = "client!i", name = "tn", descriptor = "(Lclient!yf;I)V", line = 8419)
	static final void method27373(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class202.method24645(local11, arg0);
	}

	@OriginalMember(owner = "client!i", name = "bcg", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V", line = 14601)
	static void method27371(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (client.aClass175_2 == null) {
			return;
		}
		@Pc(7) Class93_Sub22 local7 = Class102.method2592(Class446.aClass446_110, client.aClass175_2.aClass24_2);
		local7.aClass93_Sub41_Sub2_1.method22454(Class582.method31414(arg1) + 1 + Class582.method31414(arg2));
		local7.aClass93_Sub41_Sub2_1.method22403(arg1);
		local7.aClass93_Sub41_Sub2_1.method22447(arg0);
		local7.aClass93_Sub41_Sub2_1.method22403(arg2);
		client.aClass175_2.method24351(local7);
	}
}
