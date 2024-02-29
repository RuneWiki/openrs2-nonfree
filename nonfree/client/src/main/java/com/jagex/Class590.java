package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public class Class590 {

	@OriginalMember(owner = "client!va", name = "y", descriptor = "Lclient!t;")
	static Class548 aClass548_3;

	@OriginalMember(owner = "client!va", name = "ax", descriptor = "Lclient!rx;")
	protected static Class523 aClass523_1;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "Lclient!va;")
	static final Class590 aClass590_2 = new Class590(0);

	@OriginalMember(owner = "client!va", name = "c", descriptor = "Lclient!va;")
	static final Class590 aClass590_3 = new Class590(1);

	@OriginalMember(owner = "client!va", name = "v", descriptor = "Lclient!va;")
	public static final Class590 aClass590_1 = new Class590(2);

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V", line = 29)
	Class590(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!va", name = "w", descriptor = "([F[IIII)V", line = 109)
	public static void method31811(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) float local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (arg0[local40] > local14) {
				@Pc(53) float local53 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local53;
				@Pc(67) int local67 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local67;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method31811(arg0, arg1, arg2, local10 - 1);
		method31811(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(Lclient!yf;I)V", line = 110)
	static void method31812(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1] = ((Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1])).method27170(Class55.aClass124_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!va", name = "gn", descriptor = "(J)V", line = 3528)
	static final void method31813(@OriginalArg(0) long arg0) {
		@Pc(3) Class447 local3 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61;
		@Pc(11) int local11 = (int) local3.aFloat277 + client.anInt3391 * 268721155;
		@Pc(19) int local19 = (int) local3.aFloat278 + client.anInt3424 * 674672233;
		if (Class585.anInt5453 * 1490134939 - local11 < -2000 || Class585.anInt5453 * 1490134939 - local11 > 2000 || Class127.anInt1449 * -1293868227 - local19 < -2000 || Class127.anInt1449 * -1293868227 - local19 > 2000) {
			Class585.anInt5453 = local11 * 441411219;
			Class127.anInt1449 = local19 * -1703261163;
		}
		@Pc(66) int local66;
		@Pc(74) int local74;
		if (local11 != Class585.anInt5453 * 1490134939) {
			local66 = local11 - Class585.anInt5453 * 1490134939;
			local74 = (int) (arg0 * (long) local66 / 320L);
			if (local66 > 0) {
				if (local74 == 0) {
					local74 = 1;
				} else if (local74 > local66) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = -1;
			} else if (local74 < local66) {
				local74 = local66;
			}
			Class585.anInt5453 += local74 * 441411219;
		}
		if (local19 != Class127.anInt1449 * -1293868227) {
			local66 = local19 - Class127.anInt1449 * -1293868227;
			local74 = (int) (arg0 * (long) local66 / 320L);
			if (local66 > 0) {
				if (local74 == 0) {
					local74 = 1;
				} else if (local74 > local66) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = -1;
			} else if (local74 < local66) {
				local74 = local66;
			}
			Class127.anInt1449 += local74 * -1703261163;
		}
		client.aFloat247 += client.aFloat248 * (float) arg0 / 6.0F;
		client.aFloat249 += (float) arg0 * client.aFloat250 / 6.0F;
		Class348.method27861();
	}

	@OriginalMember(owner = "client!va", name = "nr", descriptor = "(Lclient!yf;I)V", line = 6982)
	static final void method31814(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class131.method23062(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!va", name = "rk", descriptor = "(Lclient!gm;Lclient!yf;B)V", line = 7638)
	static final void method31815(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class665 arg1) {
		@Pc(5) Class17 local5 = arg0.method26602(Class367.aClass415_1, client.anInterface51_1);
		@Pc(18) int local18 = arg1.anIntArray536[(arg1.anInt5784 -= 308999563) * 2088438307];
		@Pc(31) int local31 = arg1.anIntArray536[(arg1.anInt5784 -= 308999563) * 2088438307];
		@Pc(48) int local48 = local5.method317(arg0.aString178, arg0.anInt3874 * -881188269, arg0.anInt3907 * -1959194819, local31, local18, Class148.aClass83Array6);
		arg1.anIntArray536[(arg1.anInt5784 += 308999563) * 2088438307 - 1] = local48;
	}

	@OriginalMember(owner = "client!va", name = "rw", descriptor = "(Lclient!yf;I)V", line = 7790)
	static final void method31816(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		Class524.method30636(local11, arg0);
	}
}
