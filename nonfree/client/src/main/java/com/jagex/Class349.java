package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public class Class349 implements Interface75 {

	@OriginalMember(owner = "client!jt", name = "oj", descriptor = "I")
	public static int anInt4495;

	@OriginalMember(owner = "client!jt", name = "ck", descriptor = "I")
	public static int anInt4496;

	@OriginalMember(owner = "client!jt", name = "p", descriptor = "Lclient!jt;")
	static final Class349 aClass349_10 = new Class349(13, 1);

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "Lclient!jt;")
	static final Class349 aClass349_9 = new Class349(11, 2);

	@OriginalMember(owner = "client!jt", name = "v", descriptor = "Lclient!jt;")
	static final Class349 aClass349_3 = new Class349(14, 3);

	@OriginalMember(owner = "client!jt", name = "l", descriptor = "Lclient!jt;")
	static final Class349 aClass349_4 = new Class349(12, 4);

	@OriginalMember(owner = "client!jt", name = "y", descriptor = "Lclient!jt;")
	static final Class349 aClass349_5 = new Class349(5, 5);

	@OriginalMember(owner = "client!jt", name = "w", descriptor = "Lclient!jt;")
	static final Class349 aClass349_6 = new Class349(3, 6);

	@OriginalMember(owner = "client!jt", name = "t", descriptor = "Lclient!jt;")
	static final Class349 aClass349_7 = new Class349(7, 7);

	@OriginalMember(owner = "client!jt", name = "q", descriptor = "Lclient!jt;")
	static final Class349 aClass349_12 = new Class349(8, 8);

	@OriginalMember(owner = "client!jt", name = "x", descriptor = "Lclient!jt;")
	static final Class349 aClass349_1 = new Class349(10, 9);

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "Lclient!jt;")
	static final Class349 aClass349_15 = new Class349(1, 10);

	@OriginalMember(owner = "client!jt", name = "s", descriptor = "Lclient!jt;")
	static final Class349 aClass349_8 = new Class349(6, 11);

	@OriginalMember(owner = "client!jt", name = "r", descriptor = "Lclient!jt;")
	static final Class349 aClass349_11 = new Class349(0, 12);

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "Lclient!jt;")
	static final Class349 aClass349_2 = new Class349(4, 13);

	@OriginalMember(owner = "client!jt", name = "z", descriptor = "Lclient!jt;")
	static final Class349 aClass349_13 = new Class349(9, 14);

	@OriginalMember(owner = "client!jt", name = "j", descriptor = "Lclient!jt;")
	static final Class349 aClass349_14 = new Class349(2, 15);

	@OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
	final int anInt4493;

	@OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
	final int anInt4494;

	@OriginalMember(owner = "client!jt", name = "w", descriptor = "()[Lclient!jt;", line = 27)
	static Class349[] method27865() {
		return new Class349[] { aClass349_12, aClass349_4, aClass349_3, aClass349_10, aClass349_6, aClass349_14, aClass349_2, aClass349_8, aClass349_7, aClass349_15, aClass349_11, aClass349_9, aClass349_13, aClass349_5, aClass349_1 };
	}

	@OriginalMember(owner = "client!jt", name = "v", descriptor = "()[Lclient!jt;", line = 27)
	static Class349[] method27866() {
		return new Class349[] { aClass349_12, aClass349_4, aClass349_3, aClass349_10, aClass349_6, aClass349_14, aClass349_2, aClass349_8, aClass349_7, aClass349_15, aClass349_11, aClass349_9, aClass349_13, aClass349_5, aClass349_1 };
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(II)V", line = 30)
	Class349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4493 = arg0 * 1900699263;
		this.anInt4494 = arg1 * 1270236475;
	}

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "()I", line = 36)
	@Override
	public int method36479() {
		return this.anInt4494 * -404993037;
	}

	@OriginalMember(owner = "client!jt", name = "l", descriptor = "()I", line = 36)
	@Override
	public int method36478() {
		return this.anInt4494 * -404993037;
	}

	@OriginalMember(owner = "client!jt", name = "y", descriptor = "()I", line = 36)
	@Override
	public int method36477() {
		return this.anInt4494 * -404993037;
	}

	@OriginalMember(owner = "client!jt", name = "hv", descriptor = "(Lclient!agh;ZI)V", line = 3895)
	static final void method27867(@OriginalArg(0) Class104_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) Class570 local3 = arg0.method21105();
		if (arg0.anInt2900 * -1763707177 == 0) {
			arg0.anInt2882 = 0;
			Class650.anInt5740 = Class671.aClass671_2.aByte175 * 182925375;
			Class87_Sub1.anInt492 = 0;
			return;
		}
		if (arg0.aClass151_3.method23396() && !arg0.aClass151_3.method23422()) {
			@Pc(34) Class234 local34 = arg0.aClass151_3.method23398();
			if (arg0.anInt2877 * 86173187 > 0 && local34.anInt3772 * 716389381 == 0) {
				arg0.anInt2882 += -1763149081;
				Class650.anInt5740 = Class671.aClass671_2.aByte175 * 182925375;
				Class87_Sub1.anInt492 = 0;
				return;
			}
			if (arg0.anInt2877 * 86173187 <= 0 && local34.anInt3769 * -492433165 == 0) {
				arg0.anInt2882 += -1763149081;
				Class650.anInt5740 = Class671.aClass671_2.aByte175 * 182925375;
				Class87_Sub1.anInt492 = 0;
				return;
			}
		}
		for (@Pc(84) int local84 = 0; local84 < arg0.aClass535Array3.length; local84++) {
			if (arg0.aClass535Array3[local84].anInt5185 * -1183861629 != -1 && arg0.aClass535Array3[local84].aClass151_9.method23422()) {
				@Pc(118) Class679 local118 = (Class679) Class482.aClass35_Sub4_1.method18319(arg0.aClass535Array3[local84].anInt5185 * -1183861629);
				if (local118.aBoolean860 && local118.anInt5810 * -811043807 != -1) {
					@Pc(136) Class234 local136 = (Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local118.anInt5810 * -811043807);
					if (arg0.anInt2877 * 86173187 > 0 && local136.anInt3772 * 716389381 == 0) {
						arg0.anInt2882 += -1763149081;
						Class650.anInt5740 = Class671.aClass671_2.aByte175 * 182925375;
						Class87_Sub1.anInt492 = 0;
						return;
					}
					if (arg0.anInt2877 * 86173187 <= 0 && local136.anInt3769 * -492433165 == 0) {
						arg0.anInt2882 += -1763149081;
						Class650.anInt5740 = Class671.aClass671_2.aByte175 * 182925375;
						Class87_Sub1.anInt492 = 0;
						return;
					}
				}
			}
		}
		@Pc(193) Class447 local193 = Class447.method29124(arg0.method24085().aClass447_61);
		@Pc(197) int local197 = (int) local193.aFloat277;
		@Pc(201) int local201 = (int) local193.aFloat278;
		@Pc(219) int local219 = arg0.anIntArray274[arg0.anInt2900 * -1763707177 - 1] * 512 + arg0.method21095() * 256;
		@Pc(237) int local237 = arg0.anIntArray275[arg0.anInt2900 * -1763707177 - 1] * 512 + arg0.method21095() * 256;
		if (local197 < local219) {
			if (local201 < local237) {
				arg0.method21069(10240);
			} else if (local201 > local237) {
				arg0.method21069(14336);
			} else {
				arg0.method21069(12288);
			}
		} else if (local197 > local219) {
			if (local201 < local237) {
				arg0.method21069(6144);
			} else if (local201 > local237) {
				arg0.method21069(2048);
			} else {
				arg0.method21069(4096);
			}
		} else if (local201 < local237) {
			arg0.method21069(8192);
		} else if (local201 > local237) {
			arg0.method21069(0);
		}
		@Pc(310) byte local310 = arg0.aByteArray47[arg0.anInt2900 * -1763707177 - 1];
		if (!arg1 && (local219 - local197 > 1024 || local219 - local197 < -1024 || local237 - local201 > 1024 || local237 - local201 < -1024)) {
			arg0.method24106((float) local219, local193.aFloat276, (float) local237);
			arg0.method21070(arg0.anInt2898 * 1306061223, false);
			arg0.anInt2900 -= 990207207;
			if (arg0.anInt2877 * 86173187 > 0) {
				arg0.anInt2877 -= 645756075;
			}
			Class650.anInt5740 = Class671.aClass671_2.aByte175 * 182925375;
			Class87_Sub1.anInt492 = 0;
			local193.method29130();
			return;
		}
		@Pc(377) int local377 = 16;
		@Pc(379) boolean local379 = true;
		if (arg0 instanceof Class104_Sub1_Sub1_Sub1_Sub1) {
			local379 = ((Class104_Sub1_Sub1_Sub1_Sub1) arg0).aClass333_1.aBoolean715;
		}
		@Pc(400) int local400;
		if (local379) {
			local400 = arg0.anInt2898 * 1306061223 - arg0.aClass503_7.anInt5069 * 949937137;
			if (local400 != 0 && arg0.anInt2880 * 1409535459 == -1 && arg0.anInt2897 * -650254265 != 0) {
				local377 = 8;
			}
			if (!arg1 && arg0.anInt2900 * -1763707177 > 2) {
				local377 = 24;
			}
			if (!arg1 && arg0.anInt2900 * -1763707177 > 3) {
				local377 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt2900 * -1763707177 > 1) {
				local377 = 24;
			}
			if (!arg1 && arg0.anInt2900 * -1763707177 > 2) {
				local377 = 32;
			}
		}
		if (arg0.anInt2882 * 1235744983 > 0 && arg0.anInt2900 * -1763707177 > 1) {
			local377 = 32;
			arg0.anInt2882 -= -1763149081;
		}
		if (Class671.aClass671_5.aByte175 == local310) {
			local377 <<= 0x1;
		} else if (local310 == Class671.aClass671_1.aByte175) {
			local377 >>= 0x1;
		}
		if (local3.anInt5380 * 1545308287 != -1) {
			local377 <<= 0x9;
			if (arg0.anInt2900 * -1763707177 == 1) {
				local400 = arg0.anInt2902 * -1778719267 * -1778719267 * arg0.anInt2902;
				@Pc(539) int local539 = ((int) local193.aFloat277 > local219 ? (int) local193.aFloat277 - local219 : local219 - (int) local193.aFloat277) << 9;
				@Pc(558) int local558 = ((int) local193.aFloat278 > local237 ? (int) local193.aFloat278 - local237 : local237 - (int) local193.aFloat278) << 9;
				@Pc(565) int local565 = local539 > local558 ? local539 : local558;
				@Pc(572) int local572 = local565 * -1204350722 * local3.anInt5380;
				if (local400 > local572) {
					arg0.anInt2902 = -1778719267 * arg0.anInt2902 / 2 * -1335453067;
				} else if (local400 / 2 > local565) {
					arg0.anInt2902 -= local3.anInt5380 * 1531693067;
					if (arg0.anInt2902 * -1778719267 < 0) {
						arg0.anInt2902 = 0;
					}
				} else if (arg0.anInt2902 * -1778719267 < local377) {
					arg0.anInt2902 += local3.anInt5380 * 1531693067;
					if (arg0.anInt2902 * -1778719267 > local377) {
						arg0.anInt2902 = local377 * -1335453067;
					}
				}
			} else if (arg0.anInt2902 * -1778719267 < local377) {
				arg0.anInt2902 += local3.anInt5380 * 1531693067;
				if (arg0.anInt2902 * -1778719267 > local377) {
					arg0.anInt2902 = local377 * -1335453067;
				}
			} else if (arg0.anInt2902 * -1778719267 > 0) {
				arg0.anInt2902 -= local3.anInt5380 * 1531693067;
				if (arg0.anInt2902 * -1778719267 < 0) {
					arg0.anInt2902 = 0;
				}
			}
			local377 = arg0.anInt2902 * -1778719267 >> 9;
			if (local377 < 1) {
				local377 = 1;
			}
		}
		Class87_Sub1.anInt492 = 0;
		if (local197 == local219 && local237 == local201) {
			Class650.anInt5740 = Class671.aClass671_2.aByte175 * 182925375;
		} else {
			if (local197 < local219) {
				local193.aFloat277 += local377;
				Class87_Sub1.anInt492 = (Class87_Sub1.anInt492 * 808625503 | 0x4) * -878774625;
				if (local193.aFloat277 > (float) local219) {
					local193.aFloat277 = local219;
				}
			} else if (local197 > local219) {
				local193.aFloat277 -= local377;
				Class87_Sub1.anInt492 = (Class87_Sub1.anInt492 * 808625503 | 0x8) * -878774625;
				if (local193.aFloat277 < (float) local219) {
					local193.aFloat277 = local219;
				}
			}
			if (local201 < local237) {
				local193.aFloat278 += local377;
				Class87_Sub1.anInt492 = (Class87_Sub1.anInt492 * 808625503 | 0x1) * -878774625;
				if (local193.aFloat278 > (float) local237) {
					local193.aFloat278 = local237;
				}
			} else if (local201 > local237) {
				local193.aFloat278 -= local377;
				Class87_Sub1.anInt492 = (Class87_Sub1.anInt492 * 808625503 | 0x2) * -878774625;
				if (local193.aFloat278 < (float) local237) {
					local193.aFloat278 = local237;
				}
			}
			arg0.method24102(local193);
			if (local377 >= 32) {
				Class650.anInt5740 = Class671.aClass671_5.aByte175 * 182925375;
			} else {
				Class650.anInt5740 = local310 * 182925375;
			}
		}
		if ((int) local193.aFloat277 == local219 && (int) local193.aFloat278 == local237) {
			arg0.anInt2900 -= 990207207;
			if (arg0.anInt2877 * 86173187 > 0) {
				arg0.anInt2877 -= 645756075;
			}
		}
		local193.method29130();
	}

	@OriginalMember(owner = "client!jt", name = "ti", descriptor = "(Lclient!yf;I)V", line = 7973)
	static final void method27868(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class77_Sub38 local18 = (Class77_Sub38) client.aClass12_20.method173((long) local12);
		if (local18 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
		}
	}

	@OriginalMember(owner = "client!jt", name = "zz", descriptor = "(Lclient!yf;I)V", line = 9197)
	static final void method27869(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) ((Class280.method26667() - client.aClass243_1.method26040() - Class241.aLong246 * 656147693700925901L) / 1000L);
	}
}
