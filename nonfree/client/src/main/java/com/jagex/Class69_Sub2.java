package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajm")
public class Class69_Sub2 extends Class69 {

	@OriginalMember(owner = "client!ajm", name = "a", descriptor = "Lclient!mx;")
	final Class335 aClass335_4 = new Class335();

	@OriginalMember(owner = "client!ajm", name = "g", descriptor = "Lclient!mx;")
	final Class335 aClass335_3 = new Class335(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ajm", name = "<init>", descriptor = "(Lclient!ha;)V", line = 15)
	public Class69_Sub2(@OriginalArg(0) Class23 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ajm", name = "p", descriptor = "(I)[Lclient!wm;", line = 17)
	public static Class555[] method14575() {
		return new Class555[] { Class555.aClass555_3, Class555.aClass555_7, Class555.aClass555_6, Class555.aClass555_4, Class555.aClass555_2, Class555.aClass555_5 };
	}

	@OriginalMember(owner = "client!ajm", name = "r", descriptor = "(Lclient!mx;I)V", line = 19)
	public void method14570(@OriginalArg(0) Class335 arg0) {
		this.aClass335_3.aFloat287 = arg0.aFloat287;
		this.aClass335_3.aFloat286 = arg0.aFloat286;
		this.aClass335_3.aFloat285 = arg0.aFloat285;
		this.aClass335_3.aFloat288 = arg0.aFloat288;
		this.aClass335_4.method26315(this.aClass335_3);
	}

	@OriginalMember(owner = "client!ajm", name = "q", descriptor = "(Lclient!mx;)V", line = 19)
	public void method14571(@OriginalArg(0) Class335 arg0) {
		this.aClass335_3.aFloat287 = arg0.aFloat287;
		this.aClass335_3.aFloat286 = arg0.aFloat286;
		this.aClass335_3.aFloat285 = arg0.aFloat285;
		this.aClass335_3.aFloat288 = arg0.aFloat288;
		this.aClass335_4.method26315(this.aClass335_3);
	}

	@OriginalMember(owner = "client!ajm", name = "g", descriptor = "(S)Lclient!mh;", line = 27)
	@Override
	public Class320 method20203() {
		@Pc(6) Class320 local6 = new Class320(0.0F, 0.0F, 1000.0F);
		local6.method25889(Class335.method26306(this.aClass335_4));
		local6.aFloat260 *= -1.0F;
		local6.method25872(this.aClass23_16.method5908());
		return local6;
	}

	@OriginalMember(owner = "client!ajm", name = "e", descriptor = "()Lclient!mh;", line = 27)
	@Override
	public Class320 method20215() {
		@Pc(6) Class320 local6 = new Class320(0.0F, 0.0F, 1000.0F);
		local6.method25889(Class335.method26306(this.aClass335_4));
		local6.aFloat260 *= -1.0F;
		local6.method25872(this.aClass23_16.method5908());
		return local6;
	}

	@OriginalMember(owner = "client!ajm", name = "l", descriptor = "(I)Lclient!mh;", line = 35)
	@Override
	public Class320 method20205() {
		@Pc(6) Class320 local6 = new Class320(0.0F, 0.0F, 1000.0F);
		local6.method25889(Class335.method26306(this.aClass335_3));
		local6.aFloat260 *= -1.0F;
		local6.method25872(this.aClass23_16.method5908());
		return local6;
	}

	@OriginalMember(owner = "client!ajm", name = "c", descriptor = "()Lclient!mh;", line = 35)
	@Override
	public Class320 method20211() {
		@Pc(6) Class320 local6 = new Class320(0.0F, 0.0F, 1000.0F);
		local6.method25889(Class335.method26306(this.aClass335_3));
		local6.aFloat260 *= -1.0F;
		local6.method25872(this.aClass23_16.method5908());
		return local6;
	}

	@OriginalMember(owner = "client!ajm", name = "z", descriptor = "()Lclient!mh;", line = 35)
	@Override
	public Class320 method20212() {
		@Pc(6) Class320 local6 = new Class320(0.0F, 0.0F, 1000.0F);
		local6.method25889(Class335.method26306(this.aClass335_3));
		local6.aFloat260 *= -1.0F;
		local6.method25872(this.aClass23_16.method5908());
		return local6;
	}

	@OriginalMember(owner = "client!ajm", name = "s", descriptor = "(F)V", line = 43)
	@Override
	public void method20201(@OriginalArg(0) float arg0) {
		this.aClass335_4.method26315(this.aClass335_3);
	}

	@OriginalMember(owner = "client!ajm", name = "p", descriptor = "(FB)V", line = 43)
	@Override
	public void method20202(@OriginalArg(0) float arg0) {
		this.aClass335_4.method26315(this.aClass335_3);
	}

	@OriginalMember(owner = "client!ajm", name = "a", descriptor = "(I)Z", line = 47)
	@Override
	public boolean method20209() {
		return !Float.isNaN(this.aClass335_4.aFloat287);
	}

	@OriginalMember(owner = "client!ajm", name = "u", descriptor = "()Z", line = 47)
	@Override
	public boolean method20204() {
		return !Float.isNaN(this.aClass335_4.aFloat287);
	}

	@OriginalMember(owner = "client!ajm", name = "y", descriptor = "()Z", line = 47)
	@Override
	public boolean method20208() {
		return !Float.isNaN(this.aClass335_4.aFloat287);
	}

	@OriginalMember(owner = "client!ajm", name = "d", descriptor = "(I)Lclient!mx;", line = 51)
	public Class335 method14572() {
		return new Class335(this.aClass335_4);
	}

	@OriginalMember(owner = "client!ajm", name = "h", descriptor = "(Lclient!gu;Lclient!mu;IIFI)V", line = 55)
	@Override
	public void method20206(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class320 local5 = Class320.method25906(this.aClass23_16.method5908());
		local5.aFloat259 -= arg2;
		local5.aFloat261 -= arg3;
		local5.aFloat260 *= -1.0F;
		arg1.method26195(Class335.method26306(this.aClass335_4));
		arg1.method26202(local5);
		arg1.method26248();
		local5.method25874();
	}

	@OriginalMember(owner = "client!ajm", name = "b", descriptor = "(Lclient!gu;Lclient!mu;IIF)V", line = 55)
	@Override
	public void method20210(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class320 local5 = Class320.method25906(this.aClass23_16.method5908());
		local5.aFloat259 -= arg2;
		local5.aFloat261 -= arg3;
		local5.aFloat260 *= -1.0F;
		arg1.method26195(Class335.method26306(this.aClass335_4));
		arg1.method26202(local5);
		arg1.method26248();
		local5.method25874();
	}

	@OriginalMember(owner = "client!ajm", name = "n", descriptor = "(Lclient!ahb;)V", line = 66)
	@Override
	public void method20214(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass335_3.method26296(arg0);
	}

	@OriginalMember(owner = "client!ajm", name = "j", descriptor = "(Lclient!ahb;)V", line = 66)
	@Override
	public void method20213(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass335_3.method26296(arg0);
	}

	@OriginalMember(owner = "client!ajm", name = "x", descriptor = "(Lclient!ahb;B)V", line = 66)
	@Override
	public void method20207(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass335_3.method26296(arg0);
	}

	@OriginalMember(owner = "client!ajm", name = "b", descriptor = "(II)I", line = 184)
	public static int method14573(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local40 + local26) / 2.0D;
		if (local40 != local26) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local26 + local40);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local40 == local17) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		@Pc(143) int local143 = (int) (local54 * 256.0D);
		@Pc(148) int local148 = (int) (local56 * 256.0D);
		@Pc(153) int local153 = (int) (local62 * 256.0D);
		if (local148 < 0) {
			local148 = 0;
		} else if (local148 > 255) {
			local148 = 255;
		}
		if (local153 < 0) {
			local153 = 0;
		} else if (local153 > 255) {
			local153 = 255;
		}
		if (local153 > 243) {
			local148 >>= 0x4;
		} else if (local153 > 217) {
			local148 >>= 0x3;
		} else if (local153 > 192) {
			local148 >>= 0x2;
		} else if (local153 > 179) {
			local148 >>= 0x1;
		}
		return ((local143 >> 2 & 0x3F) << 10) + (local148 >> 5 << 7) + (local153 >> 1);
	}

	@OriginalMember(owner = "client!ajm", name = "afi", descriptor = "(Lclient!vs;S)V", line = 9908)
	static final void method14574(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class457.method28516();
	}
}
