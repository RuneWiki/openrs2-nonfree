package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adh")
public abstract class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!adh", name = "s", descriptor = "[I")
	int[] anIntArray231;

	@OriginalMember(owner = "client!adh", name = "a", descriptor = "[Lclient!mp;")
	Class327[] aClass327Array5;

	@OriginalMember(owner = "client!adh", name = "g", descriptor = "[F")
	float[] aFloatArray71;

	@OriginalMember(owner = "client!adh", name = "l", descriptor = "I")
	int anInt2351 = 0;

	@OriginalMember(owner = "client!adh", name = "h", descriptor = "F")
	float aFloat181 = 0.0F;

	@OriginalMember(owner = "client!adh", name = "x", descriptor = "F")
	float aFloat180 = 0.0F;

	@OriginalMember(owner = "client!adh", name = "<init>", descriptor = "(Lclient!ha;)V", line = 21)
	Class30_Sub2(@OriginalArg(0) Class23 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!adh", name = "k", descriptor = "(Lclient!mp;IFI)V", line = 25)
	public void method16453(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass327Array5 == null) {
			this.aClass327Array5 = new Class327[] { arg0 };
			this.aFloatArray71 = new float[] { arg2 };
			this.anIntArray231 = new int[] { arg1 };
			return;
		}
		@Pc(34) Class327[] local34 = new Class327[this.aClass327Array5.length + 1];
		@Pc(41) float[] local41 = new float[this.aClass327Array5.length + 1];
		@Pc(48) int[] local48 = new int[this.aClass327Array5.length + 1];
		System.arraycopy(this.aClass327Array5, 0, local34, 0, this.aClass327Array5.length);
		System.arraycopy(this.aFloatArray71, 0, local41, 0, this.aClass327Array5.length);
		System.arraycopy(this.anIntArray231, 0, local48, 0, this.aClass327Array5.length);
		this.aClass327Array5 = local34;
		this.aFloatArray71 = local41;
		this.anIntArray231 = local48;
		this.aClass327Array5[this.aClass327Array5.length - 1] = arg0;
		this.aFloatArray71[this.aFloatArray71.length - 1] = arg2;
		this.anIntArray231[this.anIntArray231.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!adh", name = "ay", descriptor = "(Lclient!mp;IF)V", line = 25)
	public void method16471(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass327Array5 == null) {
			this.aClass327Array5 = new Class327[] { arg0 };
			this.aFloatArray71 = new float[] { arg2 };
			this.anIntArray231 = new int[] { arg1 };
			return;
		}
		@Pc(34) Class327[] local34 = new Class327[this.aClass327Array5.length + 1];
		@Pc(41) float[] local41 = new float[this.aClass327Array5.length + 1];
		@Pc(48) int[] local48 = new int[this.aClass327Array5.length + 1];
		System.arraycopy(this.aClass327Array5, 0, local34, 0, this.aClass327Array5.length);
		System.arraycopy(this.aFloatArray71, 0, local41, 0, this.aClass327Array5.length);
		System.arraycopy(this.anIntArray231, 0, local48, 0, this.aClass327Array5.length);
		this.aClass327Array5 = local34;
		this.aFloatArray71 = local41;
		this.anIntArray231 = local48;
		this.aClass327Array5[this.aClass327Array5.length - 1] = arg0;
		this.aFloatArray71[this.aFloatArray71.length - 1] = arg2;
		this.anIntArray231[this.anIntArray231.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!adh", name = "p", descriptor = "([BIII)I", line = 45)
	static int method16472(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = arg1; local3 < arg2; local3++) {
			local1 = local1 >>> 8 ^ Class3_Sub41.anIntArray270[(local1 ^ arg0[local3]) & 0xFF];
		}
		return ~local1;
	}

	@OriginalMember(owner = "client!adh", name = "z", descriptor = "(F[[[ILclient!ni;II)V", line = 47)
	@Override
	public void method16435(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class327 local7 = this.aClass327Array5[this.anInt2351 * -2107507063];
		if (this.aFloatArray71[this.anInt2351 * -2107507063] > 0.0F) {
			if (this.aFloatArray71[this.anInt2351 * -2107507063] >= arg0) {
				this.aFloatArray71[this.anInt2351 * -2107507063] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray71[this.anInt2351 * -2107507063];
			this.aFloatArray71[this.anInt2351 * -2107507063] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class498.method29361();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method26017();
			if (this.aFloat181 >= local70) {
				if (this.anInt2351 * -2107507063 + 1 == this.aClass327Array5.length) {
					return;
				}
				if (this.aFloatArray71[this.anInt2351 * -2107507063 + 1] >= arg0) {
					this.aFloatArray71[this.anInt2351 * -2107507063 + 1] -= arg0;
					return;
				}
				this.anInt2351 += 2090522553;
				arg0 -= this.aFloatArray71[this.anInt2351 * -2107507063];
				this.aFloatArray71[this.anInt2351 * -2107507063] = 0.0F;
				this.method16455();
				this.aFloat181 = 0.0F;
				this.aFloat180 = 0.0F;
				local7 = this.aClass327Array5[this.anInt2351 * -2107507063];
				local70 = local7.method26017();
			}
			while (arg0 > 0.0F && this.aFloat181 < local70) {
				this.aFloat180 = this.method16454(local70, this.aFloat180, Math.min(arg0, local63));
				arg0 -= local63;
				this.method16464(this.aFloat180, local70);
			}
		}
	}

	@OriginalMember(owner = "client!adh", name = "p", descriptor = "(F[[[ILclient!ni;III)V", line = 47)
	@Override
	public void method16447(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class327 local7 = this.aClass327Array5[this.anInt2351 * -2107507063];
		if (this.aFloatArray71[this.anInt2351 * -2107507063] > 0.0F) {
			if (this.aFloatArray71[this.anInt2351 * -2107507063] >= arg0) {
				this.aFloatArray71[this.anInt2351 * -2107507063] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray71[this.anInt2351 * -2107507063];
			this.aFloatArray71[this.anInt2351 * -2107507063] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class498.method29361();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method26017();
			if (this.aFloat181 >= local70) {
				if (this.anInt2351 * -2107507063 + 1 == this.aClass327Array5.length) {
					return;
				}
				if (this.aFloatArray71[this.anInt2351 * -2107507063 + 1] >= arg0) {
					this.aFloatArray71[this.anInt2351 * -2107507063 + 1] -= arg0;
					return;
				}
				this.anInt2351 += 2090522553;
				arg0 -= this.aFloatArray71[this.anInt2351 * -2107507063];
				this.aFloatArray71[this.anInt2351 * -2107507063] = 0.0F;
				this.method16455();
				this.aFloat181 = 0.0F;
				this.aFloat180 = 0.0F;
				local7 = this.aClass327Array5[this.anInt2351 * -2107507063];
				local70 = local7.method26017();
			}
			while (arg0 > 0.0F && this.aFloat181 < local70) {
				this.aFloat180 = this.method16454(local70, this.aFloat180, Math.min(arg0, local63));
				arg0 -= local63;
				this.method16464(this.aFloat180, local70);
			}
		}
	}

	@OriginalMember(owner = "client!adh", name = "y", descriptor = "(F[[[ILclient!ni;II)V", line = 47)
	@Override
	public void method16432(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class327 local7 = this.aClass327Array5[this.anInt2351 * -2107507063];
		if (this.aFloatArray71[this.anInt2351 * -2107507063] > 0.0F) {
			if (this.aFloatArray71[this.anInt2351 * -2107507063] >= arg0) {
				this.aFloatArray71[this.anInt2351 * -2107507063] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray71[this.anInt2351 * -2107507063];
			this.aFloatArray71[this.anInt2351 * -2107507063] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class498.method29361();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method26017();
			if (this.aFloat181 >= local70) {
				if (this.anInt2351 * -2107507063 + 1 == this.aClass327Array5.length) {
					return;
				}
				if (this.aFloatArray71[this.anInt2351 * -2107507063 + 1] >= arg0) {
					this.aFloatArray71[this.anInt2351 * -2107507063 + 1] -= arg0;
					return;
				}
				this.anInt2351 += 2090522553;
				arg0 -= this.aFloatArray71[this.anInt2351 * -2107507063];
				this.aFloatArray71[this.anInt2351 * -2107507063] = 0.0F;
				this.method16455();
				this.aFloat181 = 0.0F;
				this.aFloat180 = 0.0F;
				local7 = this.aClass327Array5[this.anInt2351 * -2107507063];
				local70 = local7.method26017();
			}
			while (arg0 > 0.0F && this.aFloat181 < local70) {
				this.aFloat180 = this.method16454(local70, this.aFloat180, Math.min(arg0, local63));
				arg0 -= local63;
				this.method16464(this.aFloat180, local70);
			}
		}
	}

	@OriginalMember(owner = "client!adh", name = "b", descriptor = "(F[[[ILclient!ni;II)V", line = 47)
	@Override
	public void method16440(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class327 local7 = this.aClass327Array5[this.anInt2351 * -2107507063];
		if (this.aFloatArray71[this.anInt2351 * -2107507063] > 0.0F) {
			if (this.aFloatArray71[this.anInt2351 * -2107507063] >= arg0) {
				this.aFloatArray71[this.anInt2351 * -2107507063] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray71[this.anInt2351 * -2107507063];
			this.aFloatArray71[this.anInt2351 * -2107507063] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class498.method29361();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method26017();
			if (this.aFloat181 >= local70) {
				if (this.anInt2351 * -2107507063 + 1 == this.aClass327Array5.length) {
					return;
				}
				if (this.aFloatArray71[this.anInt2351 * -2107507063 + 1] >= arg0) {
					this.aFloatArray71[this.anInt2351 * -2107507063 + 1] -= arg0;
					return;
				}
				this.anInt2351 += 2090522553;
				arg0 -= this.aFloatArray71[this.anInt2351 * -2107507063];
				this.aFloatArray71[this.anInt2351 * -2107507063] = 0.0F;
				this.method16455();
				this.aFloat181 = 0.0F;
				this.aFloat180 = 0.0F;
				local7 = this.aClass327Array5[this.anInt2351 * -2107507063];
				local70 = local7.method26017();
			}
			while (arg0 > 0.0F && this.aFloat181 < local70) {
				this.aFloat180 = this.method16454(local70, this.aFloat180, Math.min(arg0, local63));
				arg0 -= local63;
				this.method16464(this.aFloat180, local70);
			}
		}
	}

	@OriginalMember(owner = "client!adh", name = "c", descriptor = "(F[[[ILclient!ni;II)V", line = 47)
	@Override
	public void method16439(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class327 local7 = this.aClass327Array5[this.anInt2351 * -2107507063];
		if (this.aFloatArray71[this.anInt2351 * -2107507063] > 0.0F) {
			if (this.aFloatArray71[this.anInt2351 * -2107507063] >= arg0) {
				this.aFloatArray71[this.anInt2351 * -2107507063] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray71[this.anInt2351 * -2107507063];
			this.aFloatArray71[this.anInt2351 * -2107507063] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class498.method29361();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method26017();
			if (this.aFloat181 >= local70) {
				if (this.anInt2351 * -2107507063 + 1 == this.aClass327Array5.length) {
					return;
				}
				if (this.aFloatArray71[this.anInt2351 * -2107507063 + 1] >= arg0) {
					this.aFloatArray71[this.anInt2351 * -2107507063 + 1] -= arg0;
					return;
				}
				this.anInt2351 += 2090522553;
				arg0 -= this.aFloatArray71[this.anInt2351 * -2107507063];
				this.aFloatArray71[this.anInt2351 * -2107507063] = 0.0F;
				this.method16455();
				this.aFloat181 = 0.0F;
				this.aFloat180 = 0.0F;
				local7 = this.aClass327Array5[this.anInt2351 * -2107507063];
				local70 = local7.method26017();
			}
			while (arg0 > 0.0F && this.aFloat181 < local70) {
				this.aFloat180 = this.method16454(local70, this.aFloat180, Math.min(arg0, local63));
				arg0 -= local63;
				this.method16464(this.aFloat180, local70);
			}
		}
	}

	@OriginalMember(owner = "client!adh", name = "ao", descriptor = "(FF)V", line = 89)
	void method16463(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat181 += arg0;
		if (this.aFloat181 > arg1) {
			this.aFloat181 = arg1;
		}
	}

	@OriginalMember(owner = "client!adh", name = "at", descriptor = "(FFB)V", line = 89)
	void method16464(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat181 += arg0;
		if (this.aFloat181 > arg1) {
			this.aFloat181 = arg1;
		}
	}

	@OriginalMember(owner = "client!adh", name = "ax", descriptor = "(FF)V", line = 89)
	void method16466(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat181 += arg0;
		if (this.aFloat181 > arg1) {
			this.aFloat181 = arg1;
		}
	}

	@OriginalMember(owner = "client!adh", name = "az", descriptor = "(FF)V", line = 89)
	void method16467(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat181 += arg0;
		if (this.aFloat181 > arg1) {
			this.aFloat181 = arg1;
		}
	}

	@OriginalMember(owner = "client!adh", name = "al", descriptor = "(FF)V", line = 89)
	void method16468(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat181 += arg0;
		if (this.aFloat181 > arg1) {
			this.aFloat181 = arg1;
		}
	}

	@OriginalMember(owner = "client!adh", name = "ap", descriptor = "(FF)V", line = 89)
	void method16469(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat181 += arg0;
		if (this.aFloat181 > arg1) {
			this.aFloat181 = arg1;
		}
	}

	@OriginalMember(owner = "client!adh", name = "ab", descriptor = "(FF)V", line = 89)
	void method16470(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat181 += arg0;
		if (this.aFloat181 > arg1) {
			this.aFloat181 = arg1;
		}
	}

	@OriginalMember(owner = "client!adh", name = "a", descriptor = "(I)Z", line = 97)
	@Override
	public boolean method16425() {
		return this.aClass327Array5 != null;
	}

	@OriginalMember(owner = "client!adh", name = "j", descriptor = "()Z", line = 97)
	@Override
	public boolean method16434() {
		return this.aClass327Array5 != null;
	}

	@OriginalMember(owner = "client!adh", name = "g", descriptor = "(I)Lclient!mh;", line = 101)
	@Override
	public Class320 method16426() {
		@Pc(1) Class320 local1 = Class320.method25859();
		@Pc(12) double[] local12 = this.aClass327Array5[this.anInt2351 * -2107507063].method26013(this.aFloat181);
		local1.aFloat259 = (float) local12[0];
		local1.aFloat260 = (float) local12[1];
		local1.aFloat261 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!adh", name = "n", descriptor = "()Lclient!mh;", line = 101)
	@Override
	public Class320 method16437() {
		@Pc(1) Class320 local1 = Class320.method25859();
		@Pc(12) double[] local12 = this.aClass327Array5[this.anInt2351 * -2107507063].method26013(this.aFloat181);
		local1.aFloat259 = (float) local12[0];
		local1.aFloat260 = (float) local12[1];
		local1.aFloat261 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!adh", name = "e", descriptor = "()Lclient!mh;", line = 101)
	@Override
	public Class320 method16424() {
		@Pc(1) Class320 local1 = Class320.method25859();
		@Pc(12) double[] local12 = this.aClass327Array5[this.anInt2351 * -2107507063].method26013(this.aFloat181);
		local1.aFloat259 = (float) local12[0];
		local1.aFloat260 = (float) local12[1];
		local1.aFloat261 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!adh", name = "l", descriptor = "(I)[D", line = 110)
	@Override
	public double[] method16427() {
		return this.aClass327Array5[this.anInt2351 * -2107507063].method26013(this.aFloat181);
	}

	@OriginalMember(owner = "client!adh", name = "d", descriptor = "()[D", line = 110)
	@Override
	public double[] method16423() {
		return this.aClass327Array5[this.anInt2351 * -2107507063].method26013(this.aFloat181);
	}

	@OriginalMember(owner = "client!adh", name = "r", descriptor = "()[D", line = 110)
	@Override
	public double[] method16446() {
		return this.aClass327Array5[this.anInt2351 * -2107507063].method26013(this.aFloat181);
	}

	@OriginalMember(owner = "client!adh", name = "q", descriptor = "()[D", line = 110)
	@Override
	public double[] method16438() {
		return this.aClass327Array5[this.anInt2351 * -2107507063].method26013(this.aFloat181);
	}

	@OriginalMember(owner = "client!adh", name = "h", descriptor = "(I)Lclient!agq;", line = 114)
	@Override
	public Class3_Sub32 method16428() {
		@Pc(3) Class320 local3 = this.method16426();
		return new Class3_Sub32(0, (int) local3.aFloat259, (int) local3.aFloat260, (int) local3.aFloat261);
	}

	@OriginalMember(owner = "client!adh", name = "m", descriptor = "()Lclient!agq;", line = 114)
	@Override
	public Class3_Sub32 method16441() {
		@Pc(3) Class320 local3 = this.method16426();
		return new Class3_Sub32(0, (int) local3.aFloat259, (int) local3.aFloat260, (int) local3.aFloat261);
	}

	@OriginalMember(owner = "client!adh", name = "aa", descriptor = "(I)F", line = 119)
	public float method16457() {
		return this.aClass327Array5[this.anInt2351 * -2107507063].method26035(this.aFloat181);
	}

	@OriginalMember(owner = "client!adh", name = "au", descriptor = "()F", line = 119)
	public float method16462() {
		return this.aClass327Array5[this.anInt2351 * -2107507063].method26035(this.aFloat181);
	}

	@OriginalMember(owner = "client!adh", name = "x", descriptor = "(I)F", line = 123)
	@Override
	public float method16429() {
		return this.aClass327Array5[this.anInt2351 * -2107507063].method26016(this.aFloat181);
	}

	@OriginalMember(owner = "client!adh", name = "t", descriptor = "()F", line = 123)
	@Override
	public float method16443() {
		return this.aClass327Array5[this.anInt2351 * -2107507063].method26016(this.aFloat181);
	}

	@OriginalMember(owner = "client!adh", name = "v", descriptor = "()F", line = 123)
	@Override
	public float method16442() {
		return this.aClass327Array5[this.anInt2351 * -2107507063].method26016(this.aFloat181);
	}

	@OriginalMember(owner = "client!adh", name = "s", descriptor = "(Lclient!gu;III)V", line = 127)
	@Override
	public void method16430(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class320 local3 = this.method16426();
		arg0.anInt3702 = ((int) local3.aFloat259 - arg1) * 1932748257;
		arg0.anInt3700 = (int) -local3.aFloat260 * -2071105737;
		arg0.anInt3701 = ((int) local3.aFloat261 - arg2) * -2066707267;
	}

	@OriginalMember(owner = "client!adh", name = "w", descriptor = "(Lclient!gu;II)V", line = 127)
	@Override
	public void method16444(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class320 local3 = this.method16426();
		arg0.anInt3702 = ((int) local3.aFloat259 - arg1) * 1932748257;
		arg0.anInt3700 = (int) -local3.aFloat260 * -2071105737;
		arg0.anInt3701 = ((int) local3.aFloat261 - arg2) * -2066707267;
	}

	@OriginalMember(owner = "client!adh", name = "u", descriptor = "(Lclient!ahb;I)V", line = 134)
	@Override
	public void method16431(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat181 = 0.0F;
		this.aFloat180 = 0.0F;
		this.anInt2351 = 0;
		@Pc(12) int local12 = arg0.method20269();
		this.aClass327Array5 = new Class327[local12];
		this.aFloatArray71 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass327Array5[local22] = new Class327(arg0);
			this.aFloatArray71[local22] = arg0.method20448();
		}
		this.method16458(arg0, local12);
	}

	@OriginalMember(owner = "client!adh", name = "o", descriptor = "(Lclient!ahb;)V", line = 134)
	@Override
	public void method16445(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat181 = 0.0F;
		this.aFloat180 = 0.0F;
		this.anInt2351 = 0;
		@Pc(12) int local12 = arg0.method20269();
		this.aClass327Array5 = new Class327[local12];
		this.aFloatArray71 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass327Array5[local22] = new Class327(arg0);
			this.aFloatArray71[local22] = arg0.method20448();
		}
		this.method16458(arg0, local12);
	}

	@OriginalMember(owner = "client!adh", name = "i", descriptor = "(Lclient!ahb;)V", line = 134)
	@Override
	public void method16436(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat181 = 0.0F;
		this.aFloat180 = 0.0F;
		this.anInt2351 = 0;
		@Pc(12) int local12 = arg0.method20269();
		this.aClass327Array5 = new Class327[local12];
		this.aFloatArray71 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass327Array5[local22] = new Class327(arg0);
			this.aFloatArray71[local22] = arg0.method20448();
		}
		this.method16458(arg0, local12);
	}

	@OriginalMember(owner = "client!adh", name = "f", descriptor = "(Lclient!ahb;)V", line = 134)
	@Override
	public void method16433(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat181 = 0.0F;
		this.aFloat180 = 0.0F;
		this.anInt2351 = 0;
		@Pc(12) int local12 = arg0.method20269();
		this.aClass327Array5 = new Class327[local12];
		this.aFloatArray71 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass327Array5[local22] = new Class327(arg0);
			this.aFloatArray71[local22] = arg0.method20448();
		}
		this.method16458(arg0, local12);
	}

	@OriginalMember(owner = "client!adh", name = "bk", descriptor = "(IIIII)V", line = 318)
	static void method16474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class3_Sub1_Sub11 local9 = Class60_Sub34.method14470(17, (long) arg1 << 32 | (long) arg0);
		local9.method19155();
		local9.anInt2693 = arg2 * 1666161167;
		local9.anInt2695 = arg3 * 378120307;
	}

	@OriginalMember(owner = "client!adh", name = "am", descriptor = "(Lclient!de;IIIIIII)V", line = 1156)
	static void method16475(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		arg0.method17063(arg1, arg2, arg3, arg4, arg5);
		arg0.method17063(arg1 + 1, arg2 + 1, arg3 - 2, 16, arg6);
		arg0.method17062(arg1 + 1, arg2 + 18, arg3 - 2, arg4 - 19, arg6);
	}

	@OriginalMember(owner = "client!adh", name = "air", descriptor = "(Lclient!vs;I)V", line = 10597)
	static final void method16473(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) client.aFloat237 >> 3;
	}

	@OriginalMember(owner = "client!adh", name = "aj", descriptor = "(FFF)F")
	abstract float method16452(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!adh", name = "af", descriptor = "(FFFI)F")
	abstract float method16454(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!adh", name = "ak", descriptor = "(I)V")
	abstract void method16455();

	@OriginalMember(owner = "client!adh", name = "av", descriptor = "(Lclient!ahb;I)V")
	abstract void method16456(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!adh", name = "ah", descriptor = "(Lclient!ahb;II)V")
	abstract void method16458(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!adh", name = "as", descriptor = "()V")
	abstract void method16459();

	@OriginalMember(owner = "client!adh", name = "ai", descriptor = "()V")
	abstract void method16460();

	@OriginalMember(owner = "client!adh", name = "aq", descriptor = "()V")
	abstract void method16461();

	@OriginalMember(owner = "client!adh", name = "an", descriptor = "(FFF)F")
	abstract float method16465(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);
}
