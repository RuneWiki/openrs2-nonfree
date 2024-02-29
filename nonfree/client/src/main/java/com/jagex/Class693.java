package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zk")
public class Class693 {

	@OriginalMember(owner = "client!zk", name = "<init>", descriptor = "()V", line = 6)
	Class693() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!zk", name = "l", descriptor = "(Lclient!yb;Lclient!ye;I)I", line = 11)
	public static int method36366(@OriginalArg(0) Class661 arg0, @OriginalArg(1) Class664 arg1, @OriginalArg(2) int arg2) {
		return Class661.aClass661_5 == arg0 ? 43594 : arg2 + 40000;
	}

	@OriginalMember(owner = "client!zk", name = "y", descriptor = "(Lclient!yb;Lclient!ye;I)I", line = 11)
	public static int method36367(@OriginalArg(0) Class661 arg0, @OriginalArg(1) Class664 arg1, @OriginalArg(2) int arg2) {
		return Class661.aClass661_5 == arg0 ? 43594 : arg2 + 40000;
	}

	@OriginalMember(owner = "client!zk", name = "w", descriptor = "(Lclient!yb;Lclient!ye;I)I", line = 21)
	public static int method36368(@OriginalArg(0) Class661 arg0, @OriginalArg(1) Class664 arg1, @OriginalArg(2) int arg2) {
		if (Class661.aClass661_5 == arg0) {
			return 80;
		} else if (arg1 == Class664.aClass664_2) {
			return arg2 + 12000;
		} else {
			return arg2 + 7000;
		}
	}

	@OriginalMember(owner = "client!zk", name = "by", descriptor = "(II)Z", line = 1404)
	static boolean method36369(@OriginalArg(0) int arg0) {
		if (arg0 == 18 || arg0 == 19 || arg0 == 20 || arg0 == 21 || arg0 == 22 || arg0 == 1004) {
			return true;
		} else {
			return arg0 == 17;
		}
	}

	@OriginalMember(owner = "client!zk", name = "hm", descriptor = "(Lclient!agh;IIIB)V", line = 4159)
	static void method36370(@OriginalArg(0) Class104_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class570 local3 = arg0.method21105();
		@Pc(6) Class151_Sub1 local6 = arg0.aClass151_Sub1_3;
		@Pc(19) int local19 = arg0.anInt2898 * 1306061223 - arg0.aClass503_7.anInt5069 * 949937137 & 0x3FFF;
		if (arg1 == Class671.aClass671_2.aByte175) {
			if (local19 == 0 && arg0.anInt2896 * -358869573 <= 25) {
				if (!local6.aBoolean363 || !local3.method31448(local6.method23399())) {
					local6.method23412(local3.method31442(), false, true);
					local6.aBoolean363 = local6.method23396();
				}
			} else if (arg3 < 0 && local3.anInt5382 * -958760913 != -1) {
				local6.method23412(local3.anInt5382 * -958760913, false, true);
				local6.aBoolean363 = false;
			} else if (arg3 > 0 && local3.anInt5350 * -435773465 != -1) {
				local6.method23412(local3.anInt5350 * -435773465, false, true);
				local6.aBoolean363 = false;
			} else if (!local6.aBoolean363 || !local3.method31448(local6.method23399())) {
				local6.method23412(local3.method31442(), false, true);
				local6.aBoolean363 = arg0.aClass151_Sub1_3.method23396();
			}
		} else if (arg0.anInt2880 * 1409535459 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(146) int local146 = client.anIntArray323[arg2] - arg0.aClass503_7.anInt5069 * 949937137 & 0x3FFF;
			if (arg1 == Class671.aClass671_5.aByte175 && local3.anInt5365 * 1074876801 != -1) {
				if (local146 > 2048 && local146 <= 6144 && local3.anInt5358 * 541177679 != -1) {
					local6.method23412(local3.anInt5358 * 541177679, false, true);
				} else if (local146 >= 10240 && local146 < 14336 && -921167219 * local3.anInt5357 != -1) {
					local6.method23412(local3.anInt5357 * -921167219, false, true);
				} else if (local146 <= 6144 || local146 >= 10240 || local3.anInt5356 * 421310407 == -1) {
					local6.method23412(local3.anInt5365 * 1074876801, false, true);
				} else {
					local6.method23412(local3.anInt5356 * 421310407, false, true);
				}
			} else if (arg1 == Class671.aClass671_1.aByte175 && local3.anInt5359 * 1846476627 != -1) {
				if (local146 > 2048 && local146 <= 6144 && -1045334803 * local3.anInt5370 != -1) {
					local6.method23412(local3.anInt5370 * -1045334803, false, true);
				} else if (local146 >= 10240 && local146 < 14336 && local3.anInt5360 * 630970333 != -1) {
					local6.method23412(local3.anInt5360 * 630970333, false, true);
				} else if (local146 <= 6144 || local146 >= 10240 || local3.anInt5362 * -63558043 == -1) {
					local6.method23412(local3.anInt5359 * 1846476627, false, true);
				} else {
					local6.method23412(local3.anInt5362 * -63558043, false, true);
				}
			} else if (local146 > 2048 && local146 <= 6144 && -550586123 * local3.anInt5354 != -1) {
				local6.method23412(local3.anInt5354 * -550586123, false, true);
			} else if (local146 >= 10240 && local146 < 14336 && local3.anInt5353 * -450790695 != -1) {
				local6.method23412(local3.anInt5353 * -450790695, false, true);
			} else if (local146 <= 6144 || local146 >= 10240 || local3.anInt5352 * 1439321197 == -1) {
				local6.method23412(local3.anInt5367 * -162238255, false, true);
			} else {
				local6.method23412(local3.anInt5352 * 1439321197, false, true);
			}
			local6.aBoolean363 = false;
		} else if (local19 == 0 && arg0.anInt2896 * -358869573 <= 25) {
			if (arg1 == Class671.aClass671_5.aByte175 && local3.anInt5365 * 1074876801 != -1) {
				local6.method23412(local3.anInt5365 * 1074876801, false, true);
			} else if (Class671.aClass671_1.aByte175 == arg1 && local3.anInt5359 * 1846476627 != -1) {
				local6.method23412(local3.anInt5359 * 1846476627, false, true);
			} else {
				local6.method23412(local3.anInt5367 * -162238255, false, true);
			}
			local6.aBoolean363 = false;
		} else {
			if (Class671.aClass671_5.aByte175 == arg1 && local3.anInt5365 * 1074876801 != -1) {
				if (arg3 < 0 && local3.anInt5363 * -2118591313 != -1) {
					local6.method23412(local3.anInt5363 * -2118591313, false, true);
				} else if (arg3 <= 0 || local3.anInt5351 * 738882867 == -1) {
					local6.method23412(local3.anInt5365 * 1074876801, false, true);
				} else {
					local6.method23412(local3.anInt5351 * 738882867, false, true);
				}
			} else if (arg1 == Class671.aClass671_1.aByte175 && local3.anInt5359 * 1846476627 != -1) {
				if (arg3 < 0 && local3.anInt5347 * -1143184565 != -1) {
					local6.method23412(local3.anInt5347 * -1143184565, false, true);
				} else if (arg3 <= 0 || local3.anInt5374 * -1927386945 == -1) {
					local6.method23412(local3.anInt5359 * 1846476627, false, true);
				} else {
					local6.method23412(local3.anInt5374 * -1927386945, false, true);
				}
			} else if (arg3 < 0 && local3.anInt5349 * 1492387563 != -1) {
				local6.method23412(local3.anInt5349 * 1492387563, false, true);
			} else if (arg3 <= 0 || local3.anInt5361 * -208702779 == -1) {
				local6.method23412(local3.anInt5367 * -162238255, false, true);
			} else {
				local6.method23412(local3.anInt5361 * -208702779, false, true);
			}
			local6.aBoolean363 = false;
		}
	}

	@OriginalMember(owner = "client!zk", name = "ya", descriptor = "(Lclient!yf;B)V", line = 8960)
	static final void method36371(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (client.aString163 == null || local12 >= Class462.anInt4970 * -217094943) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class204.aClass50Array1[local12].aByte2;
		}
	}
}
