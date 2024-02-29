package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public abstract class Class110 implements Interface5 {

	@OriginalMember(owner = "client!eu", name = "ap", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray17;

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "Lclient!er;")
	final Class232 aClass232_17 = new Class232(100);

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "Lclient!as;")
	final Interface13 anInterface13_4;

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "(I)[Lclient!zq;", line = 30)
	public static Class699[] method9150() {
		return new Class699[] { Class699.aClass699_13, Class699.aClass699_8, Class699.aClass699_15, Class699.aClass699_9, Class699.aClass699_20, Class699.aClass699_6, Class699.aClass699_12, Class699.aClass699_7, Class699.aClass699_4, Class699.aClass699_19, Class699.aClass699_17, Class699.aClass699_10, Class699.aClass699_16, Class699.aClass699_18, Class699.aClass699_5, Class699.aClass699_3, Class699.aClass699_14, Class699.aClass699_2, Class699.aClass699_11 };
	}

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!as;Lclient!pw;Lclient!pw;)V", line = 196)
	Class110(@OriginalArg(0) Interface13 arg0, @OriginalArg(1) Class478 arg1, @OriginalArg(2) Class478 arg2) {
		this.anInterface13_4 = arg0;
		Class257.method26224(arg1, arg2);
	}

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "(II)Lclient!arr;", line = 203)
	Class77_Sub1_Sub17 method9151(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_17;
		synchronized (this.aClass232_17) {
			@Pc(11) Class77_Sub1_Sub17 local11 = (Class77_Sub1_Sub17) this.aClass232_17.method25835((long) arg0);
			if (local11 == null) {
				local11 = new Class77_Sub1_Sub17(arg0);
				this.aClass232_17.method25844(local11, (long) arg0);
			}
			return local11.method22748() ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "(B)V", line = 215)
	void method9152() {
		@Pc(3) Class232 local3 = this.aClass232_17;
		synchronized (this.aClass232_17) {
			this.aClass232_17.method25850();
		}
	}

	@OriginalMember(owner = "client!eu", name = "y", descriptor = "()V", line = 215)
	void method9153() {
		@Pc(3) Class232 local3 = this.aClass232_17;
		synchronized (this.aClass232_17) {
			this.aClass232_17.method25850();
		}
	}

	@OriginalMember(owner = "client!eu", name = "w", descriptor = "(I)V", line = 221)
	void method9154(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_17;
		synchronized (this.aClass232_17) {
			this.aClass232_17.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!eu", name = "v", descriptor = "(II)V", line = 221)
	void method9155(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_17;
		synchronized (this.aClass232_17) {
			this.aClass232_17.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!eu", name = "q", descriptor = "(I)V", line = 221)
	void method9156(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_17;
		synchronized (this.aClass232_17) {
			this.aClass232_17.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!eu", name = "t", descriptor = "(I)V", line = 221)
	void method9157(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_17;
		synchronized (this.aClass232_17) {
			this.aClass232_17.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!eu", name = "x", descriptor = "()V", line = 227)
	void method9158() {
		@Pc(3) Class232 local3 = this.aClass232_17;
		synchronized (this.aClass232_17) {
			this.aClass232_17.method25857();
		}
	}

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "(I)V", line = 227)
	void method9159() {
		@Pc(3) Class232 local3 = this.aClass232_17;
		synchronized (this.aClass232_17) {
			this.aClass232_17.method25857();
		}
	}

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "(Lclient!apv;I)I", line = 301)
	static int method9160(@OriginalArg(0) Class104_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(4) int local4 = arg0.anInt2913 * 1734964233;
		@Pc(8) Class570 local8 = arg0.method21105();
		@Pc(13) int local13 = arg0.aClass151_Sub1_3.method23399();
		if (local13 == -1 || arg0.aClass151_Sub1_3.aBoolean363) {
			local4 = arg0.anInt2915 * -729876395;
		} else if (local8.anInt5365 * 1074876801 == local13 || local8.anInt5356 * 421310407 == local13 || local13 == local8.anInt5358 * 541177679 || local8.anInt5357 * -921167219 == local13) {
			local4 = arg0.anInt2916 * -510526957;
		} else if (local13 == local8.anInt5359 * 1846476627 || local8.anInt5362 * -63558043 == local13 || local8.anInt5370 * -1045334803 == local13 || local8.anInt5360 * 630970333 == local13) {
			local4 = arg0.anInt2909 * -2046269725;
		}
		return local4;
	}

	@OriginalMember(owner = "client!eu", name = "ap", descriptor = "(IIIII)V", line = 306)
	static void method9161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class77_Sub1_Sub6 local9 = Class456.method29469(17, (long) arg1 << 32 | (long) arg0);
		local9.method21545();
		local9.anInt2959 = arg2 * 517206857;
		local9.anInt2953 = arg3 * -1621355885;
	}

	@OriginalMember(owner = "client!eu", name = "cj", descriptor = "(Lclient!yf;I)V", line = 5003)
	static final void method9162(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class529.method30720(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!eu", name = "kl", descriptor = "(Lclient!yf;B)V", line = 6449)
	static final void method9163(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		Class458.method29498(local16, arg0);
	}
}
