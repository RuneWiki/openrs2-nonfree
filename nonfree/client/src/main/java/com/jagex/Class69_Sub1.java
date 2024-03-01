package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajb")
public abstract class Class69_Sub1 extends Class69 {

	@OriginalMember(owner = "client!ajb", name = "qh", descriptor = "[Lclient!fo;")
	static Class178[] aClass178Array4;

	@OriginalMember(owner = "client!ajb", name = "g", descriptor = "[F")
	float[] aFloatArray87;

	@OriginalMember(owner = "client!ajb", name = "s", descriptor = "[I")
	int[] anIntArray269;

	@OriginalMember(owner = "client!ajb", name = "a", descriptor = "[Lclient!mp;")
	Class327[] aClass327Array8;

	@OriginalMember(owner = "client!ajb", name = "l", descriptor = "I")
	int anInt2799 = 0;

	@OriginalMember(owner = "client!ajb", name = "h", descriptor = "F")
	float aFloat217 = 0.0F;

	@OriginalMember(owner = "client!ajb", name = "x", descriptor = "F")
	float aFloat218 = 0.0F;

	@OriginalMember(owner = "client!ajb", name = "<init>", descriptor = "(Lclient!ha;)V", line = 21)
	Class69_Sub1(@OriginalArg(0) Class23 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ajb", name = "af", descriptor = "(Lclient!mp;IF)V", line = 25)
	public void method20220(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass327Array8 == null) {
			this.aClass327Array8 = new Class327[] { arg0 };
			this.aFloatArray87 = new float[] { arg2 };
			this.anIntArray269 = new int[] { arg1 };
			return;
		}
		@Pc(35) Class327[] local35 = new Class327[this.aClass327Array8.length + 1];
		@Pc(42) float[] local42 = new float[this.aClass327Array8.length + 1];
		@Pc(49) int[] local49 = new int[this.aClass327Array8.length + 1];
		System.arraycopy(this.aClass327Array8, 0, local35, 0, this.aClass327Array8.length);
		System.arraycopy(this.aFloatArray87, 0, local42, 0, this.aClass327Array8.length);
		System.arraycopy(this.anIntArray269, 0, local49, 0, this.aClass327Array8.length);
		this.aClass327Array8 = local35;
		this.aFloatArray87 = local42;
		this.anIntArray269 = local49;
		this.aClass327Array8[this.aClass327Array8.length - 1] = arg0;
		this.aFloatArray87[this.aFloatArray87.length - 1] = arg2;
		this.anIntArray269[this.anIntArray269.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ajb", name = "ak", descriptor = "(Lclient!mp;IF)V", line = 25)
	public void method20227(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass327Array8 == null) {
			this.aClass327Array8 = new Class327[] { arg0 };
			this.aFloatArray87 = new float[] { arg2 };
			this.anIntArray269 = new int[] { arg1 };
			return;
		}
		@Pc(35) Class327[] local35 = new Class327[this.aClass327Array8.length + 1];
		@Pc(42) float[] local42 = new float[this.aClass327Array8.length + 1];
		@Pc(49) int[] local49 = new int[this.aClass327Array8.length + 1];
		System.arraycopy(this.aClass327Array8, 0, local35, 0, this.aClass327Array8.length);
		System.arraycopy(this.aFloatArray87, 0, local42, 0, this.aClass327Array8.length);
		System.arraycopy(this.anIntArray269, 0, local49, 0, this.aClass327Array8.length);
		this.aClass327Array8 = local35;
		this.aFloatArray87 = local42;
		this.anIntArray269 = local49;
		this.aClass327Array8[this.aClass327Array8.length - 1] = arg0;
		this.aFloatArray87[this.aFloatArray87.length - 1] = arg2;
		this.anIntArray269[this.anIntArray269.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ajb", name = "r", descriptor = "(Lclient!mp;IFB)V", line = 25)
	public void method20230(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass327Array8 == null) {
			this.aClass327Array8 = new Class327[] { arg0 };
			this.aFloatArray87 = new float[] { arg2 };
			this.anIntArray269 = new int[] { arg1 };
			return;
		}
		@Pc(35) Class327[] local35 = new Class327[this.aClass327Array8.length + 1];
		@Pc(42) float[] local42 = new float[this.aClass327Array8.length + 1];
		@Pc(49) int[] local49 = new int[this.aClass327Array8.length + 1];
		System.arraycopy(this.aClass327Array8, 0, local35, 0, this.aClass327Array8.length);
		System.arraycopy(this.aFloatArray87, 0, local42, 0, this.aClass327Array8.length);
		System.arraycopy(this.anIntArray269, 0, local49, 0, this.aClass327Array8.length);
		this.aClass327Array8 = local35;
		this.aFloatArray87 = local42;
		this.anIntArray269 = local49;
		this.aClass327Array8[this.aClass327Array8.length - 1] = arg0;
		this.aFloatArray87[this.aFloatArray87.length - 1] = arg2;
		this.anIntArray269[this.anIntArray269.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ajb", name = "p", descriptor = "(FB)V", line = 47)
	@Override
	public void method20202(@OriginalArg(0) float arg0) {
		@Pc(7) Class327 local7 = this.aClass327Array8[this.anInt2799 * 1394620603];
		if (this.aFloatArray87[this.anInt2799 * 1394620603] > 0.0F) {
			if (this.aFloatArray87[this.anInt2799 * 1394620603] >= arg0) {
				this.aFloatArray87[this.anInt2799 * 1394620603] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray87[this.anInt2799 * 1394620603];
			this.aFloatArray87[this.anInt2799 * 1394620603] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class498.method29361();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method26017();
			if (this.aFloat217 >= local70) {
				if (this.aClass327Array8.length == this.anInt2799 * 1394620603 + 1) {
					return;
				}
				if (this.aFloatArray87[this.anInt2799 * 1394620603 + 1] >= arg0) {
					this.aFloatArray87[this.anInt2799 * 1394620603 + 1] -= arg0;
					return;
				}
				this.anInt2799 += -1751298957;
				arg0 -= this.aFloatArray87[this.anInt2799 * 1394620603];
				this.aFloatArray87[this.anInt2799 * 1394620603] = 0.0F;
				this.method20221();
				this.aFloat217 = 0.0F;
				this.aFloat218 = 0.0F;
				local7 = this.aClass327Array8[this.anInt2799 * 1394620603];
				local70 = local7.method26017();
			}
			while (arg0 > 0.0F && this.aFloat217 < local70) {
				this.aFloat218 = this.method20219(local70, this.aFloat218, Math.min(arg0, local63));
				arg0 -= local63;
				this.method20218(this.aFloat218, local70);
			}
		}
	}

	@OriginalMember(owner = "client!ajb", name = "s", descriptor = "(F)V", line = 47)
	@Override
	public void method20201(@OriginalArg(0) float arg0) {
		@Pc(7) Class327 local7 = this.aClass327Array8[this.anInt2799 * 1394620603];
		if (this.aFloatArray87[this.anInt2799 * 1394620603] > 0.0F) {
			if (this.aFloatArray87[this.anInt2799 * 1394620603] >= arg0) {
				this.aFloatArray87[this.anInt2799 * 1394620603] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray87[this.anInt2799 * 1394620603];
			this.aFloatArray87[this.anInt2799 * 1394620603] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class498.method29361();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method26017();
			if (this.aFloat217 >= local70) {
				if (this.aClass327Array8.length == this.anInt2799 * 1394620603 + 1) {
					return;
				}
				if (this.aFloatArray87[this.anInt2799 * 1394620603 + 1] >= arg0) {
					this.aFloatArray87[this.anInt2799 * 1394620603 + 1] -= arg0;
					return;
				}
				this.anInt2799 += -1751298957;
				arg0 -= this.aFloatArray87[this.anInt2799 * 1394620603];
				this.aFloatArray87[this.anInt2799 * 1394620603] = 0.0F;
				this.method20221();
				this.aFloat217 = 0.0F;
				this.aFloat218 = 0.0F;
				local7 = this.aClass327Array8[this.anInt2799 * 1394620603];
				local70 = local7.method26017();
			}
			while (arg0 > 0.0F && this.aFloat217 < local70) {
				this.aFloat218 = this.method20219(local70, this.aFloat218, Math.min(arg0, local63));
				arg0 -= local63;
				this.method20218(this.aFloat218, local70);
			}
		}
	}

	@OriginalMember(owner = "client!ajb", name = "d", descriptor = "(FFI)V", line = 89)
	void method20218(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat217 += arg0;
		if (this.aFloat217 > arg1) {
			this.aFloat217 = arg1;
		}
	}

	@OriginalMember(owner = "client!ajb", name = "aa", descriptor = "(FF)V", line = 89)
	void method20232(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat217 += arg0;
		if (this.aFloat217 > arg1) {
			this.aFloat217 = arg1;
		}
	}

	@OriginalMember(owner = "client!ajb", name = "a", descriptor = "(I)Z", line = 97)
	@Override
	public boolean method20209() {
		return this.aClass327Array8 != null;
	}

	@OriginalMember(owner = "client!ajb", name = "y", descriptor = "()Z", line = 97)
	@Override
	public boolean method20208() {
		return this.aClass327Array8 != null;
	}

	@OriginalMember(owner = "client!ajb", name = "u", descriptor = "()Z", line = 97)
	@Override
	public boolean method20204() {
		return this.aClass327Array8 != null;
	}

	@OriginalMember(owner = "client!ajb", name = "g", descriptor = "(S)Lclient!mh;", line = 101)
	@Override
	public Class320 method20203() {
		@Pc(1) Class320 local1 = Class320.method25859();
		@Pc(12) double[] local12 = this.aClass327Array8[this.anInt2799 * 1394620603].method26013(this.aFloat217);
		local1.aFloat259 = (float) local12[0];
		local1.aFloat260 = (float) local12[1];
		local1.aFloat261 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ajb", name = "e", descriptor = "()Lclient!mh;", line = 101)
	@Override
	public Class320 method20215() {
		@Pc(1) Class320 local1 = Class320.method25859();
		@Pc(12) double[] local12 = this.aClass327Array8[this.anInt2799 * 1394620603].method26013(this.aFloat217);
		local1.aFloat259 = (float) local12[0];
		local1.aFloat260 = (float) local12[1];
		local1.aFloat261 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ajb", name = "v", descriptor = "(I)[D", line = 110)
	double[] method20224() {
		return this.aClass327Array8[this.anInt2799 * 1394620603].method26013(this.aFloat217);
	}

	@OriginalMember(owner = "client!ajb", name = "ah", descriptor = "()[D", line = 110)
	double[] method20229() {
		return this.aClass327Array8[this.anInt2799 * 1394620603].method26013(this.aFloat217);
	}

	@OriginalMember(owner = "client!ajb", name = "an", descriptor = "()[D", line = 110)
	double[] method20233() {
		return this.aClass327Array8[this.anInt2799 * 1394620603].method26013(this.aFloat217);
	}

	@OriginalMember(owner = "client!ajb", name = "z", descriptor = "()Lclient!mh;", line = 114)
	@Override
	public Class320 method20212() {
		return this.method20203();
	}

	@OriginalMember(owner = "client!ajb", name = "l", descriptor = "(I)Lclient!mh;", line = 114)
	@Override
	public Class320 method20205() {
		return this.method20203();
	}

	@OriginalMember(owner = "client!ajb", name = "c", descriptor = "()Lclient!mh;", line = 114)
	@Override
	public Class320 method20211() {
		return this.method20203();
	}

	@OriginalMember(owner = "client!ajb", name = "o", descriptor = "(Lclient!vs;B)V", line = 114)
	static void method20234(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).method29469(Class424.aClass165_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ajb", name = "h", descriptor = "(Lclient!gu;Lclient!mu;IIFI)V", line = 118)
	@Override
	public void method20206(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass23_16.method5833();
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method20224();
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class320 local56 = Class320.method25859();
		local56.aFloat259 = (float) (local24[0] - local4[0]);
		local56.aFloat260 = (float) (local24[1] - local4[1]);
		local56.aFloat261 = (float) (local24[2] - local4[2]);
		local56.method25890();
		@Pc(92) Class335 local92 = new Class335();
		local92.method26301(local56, arg4);
		@Pc(101) Class320 local101 = Class320.method25891(0.0F, 1.0F, 0.0F);
		@Pc(105) Class320 local105 = Class320.method25879(local56, local101);
		@Pc(109) Class320 local109 = Class320.method25879(local105, local56);
		local109.method25889(local92);
		arg1.method26196(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat259, local109.aFloat260, local109.aFloat261);
		local109.method25874();
	}

	@OriginalMember(owner = "client!ajb", name = "b", descriptor = "(Lclient!gu;Lclient!mu;IIF)V", line = 118)
	@Override
	public void method20210(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass23_16.method5833();
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method20224();
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class320 local56 = Class320.method25859();
		local56.aFloat259 = (float) (local24[0] - local4[0]);
		local56.aFloat260 = (float) (local24[1] - local4[1]);
		local56.aFloat261 = (float) (local24[2] - local4[2]);
		local56.method25890();
		@Pc(92) Class335 local92 = new Class335();
		local92.method26301(local56, arg4);
		@Pc(101) Class320 local101 = Class320.method25891(0.0F, 1.0F, 0.0F);
		@Pc(105) Class320 local105 = Class320.method25879(local56, local101);
		@Pc(109) Class320 local109 = Class320.method25879(local105, local56);
		local109.method25889(local92);
		arg1.method26196(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat259, local109.aFloat260, local109.aFloat261);
		local109.method25874();
	}

	@OriginalMember(owner = "client!ajb", name = "j", descriptor = "(Lclient!ahb;)V", line = 142)
	@Override
	public void method20213(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat217 = 0.0F;
		this.aFloat218 = 0.0F;
		this.anInt2799 = 0;
		@Pc(12) int local12 = arg0.method20269();
		this.aClass327Array8 = new Class327[local12];
		this.aFloatArray87 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass327Array8[local22] = new Class327(arg0);
			this.aFloatArray87[local22] = arg0.method20448();
		}
		this.method20228(arg0, local12);
	}

	@OriginalMember(owner = "client!ajb", name = "n", descriptor = "(Lclient!ahb;)V", line = 142)
	@Override
	public void method20214(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat217 = 0.0F;
		this.aFloat218 = 0.0F;
		this.anInt2799 = 0;
		@Pc(12) int local12 = arg0.method20269();
		this.aClass327Array8 = new Class327[local12];
		this.aFloatArray87 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass327Array8[local22] = new Class327(arg0);
			this.aFloatArray87[local22] = arg0.method20448();
		}
		this.method20228(arg0, local12);
	}

	@OriginalMember(owner = "client!ajb", name = "x", descriptor = "(Lclient!ahb;B)V", line = 142)
	@Override
	public void method20207(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat217 = 0.0F;
		this.aFloat218 = 0.0F;
		this.anInt2799 = 0;
		@Pc(12) int local12 = arg0.method20269();
		this.aClass327Array8 = new Class327[local12];
		this.aFloatArray87 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass327Array8[local22] = new Class327(arg0);
			this.aFloatArray87[local22] = arg0.method20448();
		}
		this.method20228(arg0, local12);
	}

	@OriginalMember(owner = "client!ajb", name = "f", descriptor = "(Lclient!ahb;I)V")
	abstract void method20217(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ajb", name = "q", descriptor = "(FFFI)F")
	abstract float method20219(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ajb", name = "m", descriptor = "(I)V")
	abstract void method20221();

	@OriginalMember(owner = "client!ajb", name = "o", descriptor = "(FFF)F")
	abstract float method20222(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ajb", name = "k", descriptor = "(Lclient!ahb;I)V")
	abstract void method20223(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ajb", name = "at", descriptor = "(Lclient!ahb;I)V")
	abstract void method20225(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ajb", name = "w", descriptor = "(FFF)F")
	abstract float method20226(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ajb", name = "t", descriptor = "(Lclient!ahb;II)V")
	abstract void method20228(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ajb", name = "i", descriptor = "()V")
	abstract void method20231();
}
