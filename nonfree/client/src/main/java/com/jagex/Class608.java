package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yt")
public class Class608 {

	@OriginalMember(owner = "client!yt", name = "p", descriptor = "Lclient!yd;")
	Class597 aClass597_2;

	@OriginalMember(owner = "client!yt", name = "g", descriptor = "I")
	public int anInt5532;

	@OriginalMember(owner = "client!yt", name = "a", descriptor = "I")
	int anInt5533;

	@OriginalMember(owner = "client!yt", name = "l", descriptor = "I")
	public int anInt5534;

	@OriginalMember(owner = "client!yt", name = "<init>", descriptor = "()V", line = 12)
	Class608() {
	}

	@OriginalMember(owner = "client!yt", name = "p", descriptor = "(Lclient!ahb;I)V", line = 16)
	void method33557(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33558(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!yt", name = "l", descriptor = "(Lclient!ahb;)V", line = 16)
	void method33560(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33558(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!yt", name = "h", descriptor = "(Lclient!ahb;)V", line = 16)
	void method33563(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33558(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!yt", name = "a", descriptor = "(Lclient!ahb;Ljava/lang/String;I)I", line = 18)
	public static int method33566(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) String arg1) {
		@Pc(4) int local4 = arg0.anInt2803 * 62066237;
		@Pc(8) byte[] local8 = Class281.method25434(arg1);
		arg0.method20267(local8.length);
		arg0.anInt2803 += Class154.aClass205_1.method24180(local8, 0, local8.length, arg0.aByteArray51, arg0.anInt2803 * 62066237) * -918980331;
		return arg0.anInt2803 * 62066237 - local4;
	}

	@OriginalMember(owner = "client!yt", name = "p", descriptor = "(IB)Lclient!gs;", line = 20)
	public static Class208 method33569(@OriginalArg(0) int arg0) {
		if (Class208.aClass208_8.anInt3698 * -1882151819 == arg0) {
			return Class208.aClass208_8;
		} else if (arg0 == Class208.aClass208_3.anInt3698 * -1882151819) {
			return Class208.aClass208_3;
		} else if (arg0 == Class208.aClass208_4.anInt3698 * -1882151819) {
			return Class208.aClass208_4;
		} else if (Class208.aClass208_5.anInt3698 * -1882151819 == arg0) {
			return Class208.aClass208_5;
		} else if (Class208.aClass208_6.anInt3698 * -1882151819 == arg0) {
			return Class208.aClass208_6;
		} else if (Class208.aClass208_7.anInt3698 * -1882151819 == arg0) {
			return Class208.aClass208_7;
		} else if (arg0 == Class208.aClass208_9.anInt3698 * -1882151819) {
			return Class208.aClass208_9;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!yt", name = "a", descriptor = "(Lclient!ahb;II)V", line = 23)
	void method33558(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5533 = arg0.method20375() * -1275894447;
		} else if (arg1 == 2) {
			this.anInt5532 = arg0.method20269() * -2090172339;
			this.anInt5534 = arg0.method20269() * -2079158397;
		}
	}

	@OriginalMember(owner = "client!yt", name = "s", descriptor = "(Lclient!ahb;I)V", line = 23)
	void method33561(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5533 = arg0.method20375() * -1275894447;
		} else if (arg1 == 2) {
			this.anInt5532 = arg0.method20269() * -2090172339;
			this.anInt5534 = arg0.method20269() * -2079158397;
		}
	}

	@OriginalMember(owner = "client!yt", name = "x", descriptor = "(Lclient!ahb;I)V", line = 23)
	void method33562(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5533 = arg0.method20375() * -1275894447;
		} else if (arg1 == 2) {
			this.anInt5532 = arg0.method20269() * -2090172339;
			this.anInt5534 = arg0.method20269() * -2079158397;
		}
	}

	@OriginalMember(owner = "client!yt", name = "g", descriptor = "(I)Lclient!dx;", line = 32)
	public synchronized Class15 method33559() {
		@Pc(10) Class15 local10 = (Class15) this.aClass597_2.aClass161_71.method23219((long) (this.anInt5533 * -1940454479));
		if (local10 != null) {
			return local10;
		}
		local10 = Class137.method22938(this.aClass597_2.aClass359_110, this.anInt5533 * -1940454479, 0);
		if (local10 != null) {
			this.aClass597_2.aClass161_71.method23222(local10, (long) (this.anInt5533 * -1940454479));
		}
		return local10;
	}

	@OriginalMember(owner = "client!yt", name = "en", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 4827)
	static final void method33564(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg2.anInt5319 -= 936373647;
		arg0.anInt3562 = arg2.anIntArray496[arg2.anInt5319 * 960738381] * 493680033;
		arg0.anInt3553 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 1] * -311426347;
		arg0.anInt3541 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 2] * -1116920139;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!yt", name = "fy", descriptor = "(Lclient!vs;I)V", line = 5038)
	static final void method33565(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class538.method32563(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!yt", name = "aek", descriptor = "(Lclient!vs;I)V", line = 9721)
	static final void method33567(@OriginalArg(0) Class536 arg0) {
		@Pc(2) Class82 local2 = Class406.method27657();
		@Pc(8) Class3_Sub23 local8 = Class269.method25284(Class311.aClass311_21, local2.aClass577_2);
		local8.aClass3_Sub41_Sub1_1.method20250(0);
		@Pc(19) int local19 = local8.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local8.aClass3_Sub41_Sub1_1.method20250(1);
		local8.aClass3_Sub41_Sub1_1.method20251(arg0.aClass283_1.anInt4351 * 189047461);
		arg0.aClass283_1.aClass3_Sub1_Sub13_1.method19276(local8.aClass3_Sub41_Sub1_1, arg0.aClass283_1.anIntArray410);
		local8.aClass3_Sub41_Sub1_1.method20266(local8.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local19);
		local2.method21601(local8);
	}

	@OriginalMember(owner = "client!yt", name = "agh", descriptor = "(Lclient!vs;I)V", line = 10047)
	static final void method33568(@OriginalArg(0) Class536 arg0) {
		@Pc(2) Class3_Sub1_Sub4 local2 = Class557.method32815();
		if (local2 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
			return;
		}
		@Pc(19) boolean local19 = local2.method18903(Class58.anInt1429 + Class485.anInt5182 * 826696483, Class161.anInt3445 * 2105263663 + Class58.anInt1406, Class525.anIntArray492);
		if (local19) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class525.anIntArray492[1];
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class525.anIntArray492[2];
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		}
	}
}
