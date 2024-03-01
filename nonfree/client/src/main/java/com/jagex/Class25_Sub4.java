package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ano")
public abstract class Class25_Sub4 extends Class25 {

	@OriginalMember(owner = "client!ano", name = "l", descriptor = "[I")
	int[] anIntArray268;

	@OriginalMember(owner = "client!ano", name = "m", descriptor = "[F")
	float[] aFloatArray75;

	@OriginalMember(owner = "client!ano", name = "n", descriptor = "[Lclient!pe;")
	Class479[] aClass479Array8;

	@OriginalMember(owner = "client!ano", name = "k", descriptor = "I")
	int anInt3161 = 0;

	@OriginalMember(owner = "client!ano", name = "f", descriptor = "F")
	float aFloat229 = 0.0F;

	@OriginalMember(owner = "client!ano", name = "w", descriptor = "F")
	float aFloat228 = 0.0F;

	@OriginalMember(owner = "client!ano", name = "<init>", descriptor = "(Lclient!je;)V", line = 21)
	Class25_Sub4(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ano", name = "q", descriptor = "(Lclient!pe;IFI)V", line = 25)
	public void method23138(@OriginalArg(0) Class479 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass479Array8 == null) {
			this.aClass479Array8 = new Class479[] { arg0 };
			this.aFloatArray75 = new float[] { arg2 };
			this.anIntArray268 = new int[] { arg1 };
			return;
		}
		@Pc(34) Class479[] local34 = new Class479[this.aClass479Array8.length + 1];
		@Pc(41) float[] local41 = new float[this.aClass479Array8.length + 1];
		@Pc(48) int[] local48 = new int[this.aClass479Array8.length + 1];
		System.arraycopy(this.aClass479Array8, 0, local34, 0, this.aClass479Array8.length);
		System.arraycopy(this.aFloatArray75, 0, local41, 0, this.aClass479Array8.length);
		System.arraycopy(this.anIntArray268, 0, local48, 0, this.aClass479Array8.length);
		this.aClass479Array8 = local34;
		this.aFloatArray75 = local41;
		this.anIntArray268 = local48;
		this.aClass479Array8[this.aClass479Array8.length - 1] = arg0;
		this.aFloatArray75[this.aFloatArray75.length - 1] = arg2;
		this.anIntArray268[this.anIntArray268.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ano", name = "ae", descriptor = "(Lclient!pe;IF)V", line = 25)
	public void method23150(@OriginalArg(0) Class479 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass479Array8 == null) {
			this.aClass479Array8 = new Class479[] { arg0 };
			this.aFloatArray75 = new float[] { arg2 };
			this.anIntArray268 = new int[] { arg1 };
			return;
		}
		@Pc(34) Class479[] local34 = new Class479[this.aClass479Array8.length + 1];
		@Pc(41) float[] local41 = new float[this.aClass479Array8.length + 1];
		@Pc(48) int[] local48 = new int[this.aClass479Array8.length + 1];
		System.arraycopy(this.aClass479Array8, 0, local34, 0, this.aClass479Array8.length);
		System.arraycopy(this.aFloatArray75, 0, local41, 0, this.aClass479Array8.length);
		System.arraycopy(this.anIntArray268, 0, local48, 0, this.aClass479Array8.length);
		this.aClass479Array8 = local34;
		this.aFloatArray75 = local41;
		this.anIntArray268 = local48;
		this.aClass479Array8[this.aClass479Array8.length - 1] = arg0;
		this.aFloatArray75[this.aFloatArray75.length - 1] = arg2;
		this.anIntArray268[this.anIntArray268.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ano", name = "e", descriptor = "(FB)V", line = 47)
	@Override
	public void method23118(@OriginalArg(0) float arg0) {
		@Pc(7) Class479 local7 = this.aClass479Array8[this.anInt3161 * 853149977];
		if (this.aFloatArray75[this.anInt3161 * 853149977] > 0.0F) {
			if (this.aFloatArray75[this.anInt3161 * 853149977] >= arg0) {
				this.aFloatArray75[this.anInt3161 * 853149977] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray75[this.anInt3161 * 853149977];
			this.aFloatArray75[this.anInt3161 * 853149977] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class451.method28948();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29713();
			if (this.aFloat229 >= local70) {
				if (this.anInt3161 * 853149977 + 1 == this.aClass479Array8.length) {
					return;
				}
				if (this.aFloatArray75[this.anInt3161 * 853149977 + 1] >= arg0) {
					this.aFloatArray75[this.anInt3161 * 853149977 + 1] -= arg0;
					return;
				}
				this.anInt3161 += 1336623913;
				arg0 -= this.aFloatArray75[this.anInt3161 * 853149977];
				this.aFloatArray75[this.anInt3161 * 853149977] = 0.0F;
				this.method23142();
				this.aFloat229 = 0.0F;
				this.aFloat228 = 0.0F;
				local7 = this.aClass479Array8[this.anInt3161 * 853149977];
				local70 = local7.method29713();
			}
			while (arg0 > 0.0F && this.aFloat229 < local70) {
				this.aFloat228 = this.method23141(local70, this.aFloat228, Math.min(arg0, local63));
				arg0 -= local63;
				this.method23140(this.aFloat228, local70);
			}
		}
	}

	@OriginalMember(owner = "client!ano", name = "l", descriptor = "(F)V", line = 47)
	@Override
	public void method23128(@OriginalArg(0) float arg0) {
		@Pc(7) Class479 local7 = this.aClass479Array8[this.anInt3161 * 853149977];
		if (this.aFloatArray75[this.anInt3161 * 853149977] > 0.0F) {
			if (this.aFloatArray75[this.anInt3161 * 853149977] >= arg0) {
				this.aFloatArray75[this.anInt3161 * 853149977] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray75[this.anInt3161 * 853149977];
			this.aFloatArray75[this.anInt3161 * 853149977] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class451.method28948();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29713();
			if (this.aFloat229 >= local70) {
				if (this.anInt3161 * 853149977 + 1 == this.aClass479Array8.length) {
					return;
				}
				if (this.aFloatArray75[this.anInt3161 * 853149977 + 1] >= arg0) {
					this.aFloatArray75[this.anInt3161 * 853149977 + 1] -= arg0;
					return;
				}
				this.anInt3161 += 1336623913;
				arg0 -= this.aFloatArray75[this.anInt3161 * 853149977];
				this.aFloatArray75[this.anInt3161 * 853149977] = 0.0F;
				this.method23142();
				this.aFloat229 = 0.0F;
				this.aFloat228 = 0.0F;
				local7 = this.aClass479Array8[this.anInt3161 * 853149977];
				local70 = local7.method29713();
			}
			while (arg0 > 0.0F && this.aFloat229 < local70) {
				this.aFloat228 = this.method23141(local70, this.aFloat228, Math.min(arg0, local63));
				arg0 -= local63;
				this.method23140(this.aFloat228, local70);
			}
		}
	}

	@OriginalMember(owner = "client!ano", name = "u", descriptor = "(F)V", line = 47)
	@Override
	public void method23124(@OriginalArg(0) float arg0) {
		@Pc(7) Class479 local7 = this.aClass479Array8[this.anInt3161 * 853149977];
		if (this.aFloatArray75[this.anInt3161 * 853149977] > 0.0F) {
			if (this.aFloatArray75[this.anInt3161 * 853149977] >= arg0) {
				this.aFloatArray75[this.anInt3161 * 853149977] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray75[this.anInt3161 * 853149977];
			this.aFloatArray75[this.anInt3161 * 853149977] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class451.method28948();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29713();
			if (this.aFloat229 >= local70) {
				if (this.anInt3161 * 853149977 + 1 == this.aClass479Array8.length) {
					return;
				}
				if (this.aFloatArray75[this.anInt3161 * 853149977 + 1] >= arg0) {
					this.aFloatArray75[this.anInt3161 * 853149977 + 1] -= arg0;
					return;
				}
				this.anInt3161 += 1336623913;
				arg0 -= this.aFloatArray75[this.anInt3161 * 853149977];
				this.aFloatArray75[this.anInt3161 * 853149977] = 0.0F;
				this.method23142();
				this.aFloat229 = 0.0F;
				this.aFloat228 = 0.0F;
				local7 = this.aClass479Array8[this.anInt3161 * 853149977];
				local70 = local7.method29713();
			}
			while (arg0 > 0.0F && this.aFloat229 < local70) {
				this.aFloat228 = this.method23141(local70, this.aFloat228, Math.min(arg0, local63));
				arg0 -= local63;
				this.method23140(this.aFloat228, local70);
			}
		}
	}

	@OriginalMember(owner = "client!ano", name = "x", descriptor = "(FFI)V", line = 89)
	void method23140(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > arg1) {
			this.aFloat229 = arg1;
		}
	}

	@OriginalMember(owner = "client!ano", name = "ag", descriptor = "(FF)V", line = 89)
	void method23148(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > arg1) {
			this.aFloat229 = arg1;
		}
	}

	@OriginalMember(owner = "client!ano", name = "ah", descriptor = "(FF)V", line = 89)
	void method23151(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > arg1) {
			this.aFloat229 = arg1;
		}
	}

	@OriginalMember(owner = "client!ano", name = "n", descriptor = "(I)Z", line = 97)
	@Override
	public boolean method23132() {
		return this.aClass479Array8 != null;
	}

	@OriginalMember(owner = "client!ano", name = "z", descriptor = "()Z", line = 97)
	@Override
	public boolean method23125() {
		return this.aClass479Array8 != null;
	}

	@OriginalMember(owner = "client!ano", name = "d", descriptor = "()Lclient!ox;", line = 101)
	@Override
	public Class472 method23127() {
		@Pc(1) Class472 local1 = Class472.method29528();
		@Pc(12) double[] local12 = this.aClass479Array8[this.anInt3161 * 853149977].method29714(this.aFloat229);
		local1.aFloat317 = (float) local12[0];
		local1.aFloat318 = (float) local12[1];
		local1.aFloat319 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ano", name = "m", descriptor = "(I)Lclient!ox;", line = 101)
	@Override
	public Class472 method23120() {
		@Pc(1) Class472 local1 = Class472.method29528();
		@Pc(12) double[] local12 = this.aClass479Array8[this.anInt3161 * 853149977].method29714(this.aFloat229);
		local1.aFloat317 = (float) local12[0];
		local1.aFloat318 = (float) local12[1];
		local1.aFloat319 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ano", name = "a", descriptor = "(I)[D", line = 110)
	double[] method23143() {
		return this.aClass479Array8[this.anInt3161 * 853149977].method29714(this.aFloat229);
	}

	@OriginalMember(owner = "client!ano", name = "ai", descriptor = "()[D", line = 110)
	double[] method23152() {
		return this.aClass479Array8[this.anInt3161 * 853149977].method29714(this.aFloat229);
	}

	@OriginalMember(owner = "client!ano", name = "aw", descriptor = "()[D", line = 110)
	double[] method23153() {
		return this.aClass479Array8[this.anInt3161 * 853149977].method29714(this.aFloat229);
	}

	@OriginalMember(owner = "client!ano", name = "as", descriptor = "()[D", line = 110)
	double[] method23154() {
		return this.aClass479Array8[this.anInt3161 * 853149977].method29714(this.aFloat229);
	}

	@OriginalMember(owner = "client!ano", name = "k", descriptor = "(I)Lclient!ox;", line = 114)
	@Override
	public Class472 method23122() {
		return this.method23120();
	}

	@OriginalMember(owner = "client!ano", name = "s", descriptor = "()Lclient!ox;", line = 114)
	@Override
	public Class472 method23117() {
		return this.method23120();
	}

	@OriginalMember(owner = "client!ano", name = "y", descriptor = "()Lclient!ox;", line = 114)
	@Override
	public Class472 method23133() {
		return this.method23120();
	}

	@OriginalMember(owner = "client!ano", name = "f", descriptor = "(Lclient!ju;Lclient!ou;IIFB)V", line = 118)
	@Override
	public void method23123(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass123_16.method8958();
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method23143();
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class472 local56 = Class472.method29528();
		local56.aFloat317 = (float) (local24[0] - local4[0]);
		local56.aFloat318 = (float) (local24[1] - local4[1]);
		local56.aFloat319 = (float) (local24[2] - local4[2]);
		local56.method29559();
		@Pc(92) Class471 local92 = new Class471();
		local92.method29465(local56, arg4);
		@Pc(101) Class472 local101 = Class472.method29529(0.0F, 1.0F, 0.0F);
		@Pc(105) Class472 local105 = Class472.method29633(local56, local101);
		@Pc(109) Class472 local109 = Class472.method29633(local105, local56);
		local109.method29572(local92);
		arg1.method29368(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat317, local109.aFloat318, local109.aFloat319);
		local109.method29532();
	}

	@OriginalMember(owner = "client!ano", name = "p", descriptor = "(Lclient!ju;Lclient!ou;IIF)V", line = 118)
	@Override
	public void method23126(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass123_16.method8958();
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method23143();
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class472 local56 = Class472.method29528();
		local56.aFloat317 = (float) (local24[0] - local4[0]);
		local56.aFloat318 = (float) (local24[1] - local4[1]);
		local56.aFloat319 = (float) (local24[2] - local4[2]);
		local56.method29559();
		@Pc(92) Class471 local92 = new Class471();
		local92.method29465(local56, arg4);
		@Pc(101) Class472 local101 = Class472.method29529(0.0F, 1.0F, 0.0F);
		@Pc(105) Class472 local105 = Class472.method29633(local56, local101);
		@Pc(109) Class472 local109 = Class472.method29633(local105, local56);
		local109.method29572(local92);
		arg1.method29368(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat317, local109.aFloat318, local109.aFloat319);
		local109.method29532();
	}

	@OriginalMember(owner = "client!ano", name = "w", descriptor = "(Lclient!alw;I)V", line = 142)
	@Override
	public void method23119(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat229 = 0.0F;
		this.aFloat228 = 0.0F;
		this.anInt3161 = 0;
		@Pc(12) int local12 = arg0.method22413();
		this.aClass479Array8 = new Class479[local12];
		this.aFloatArray75 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array8[local22] = new Class479(arg0);
			this.aFloatArray75[local22] = arg0.method22425();
		}
		this.method23145(arg0, local12);
	}

	@OriginalMember(owner = "client!ano", name = "c", descriptor = "(Lclient!alw;)V", line = 142)
	@Override
	public void method23121(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat229 = 0.0F;
		this.aFloat228 = 0.0F;
		this.anInt3161 = 0;
		@Pc(12) int local12 = arg0.method22413();
		this.aClass479Array8 = new Class479[local12];
		this.aFloatArray75 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array8[local22] = new Class479(arg0);
			this.aFloatArray75[local22] = arg0.method22425();
		}
		this.method23145(arg0, local12);
	}

	@OriginalMember(owner = "client!ano", name = "r", descriptor = "(Lclient!alw;)V", line = 142)
	@Override
	public void method23129(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat229 = 0.0F;
		this.aFloat228 = 0.0F;
		this.anInt3161 = 0;
		@Pc(12) int local12 = arg0.method22413();
		this.aClass479Array8 = new Class479[local12];
		this.aFloatArray75 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array8[local22] = new Class479(arg0);
			this.aFloatArray75[local22] = arg0.method22425();
		}
		this.method23145(arg0, local12);
	}

	@OriginalMember(owner = "client!ano", name = "v", descriptor = "(Lclient!alw;)V", line = 142)
	@Override
	public void method23130(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat229 = 0.0F;
		this.aFloat228 = 0.0F;
		this.anInt3161 = 0;
		@Pc(12) int local12 = arg0.method22413();
		this.aClass479Array8 = new Class479[local12];
		this.aFloatArray75 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array8[local22] = new Class479(arg0);
			this.aFloatArray75[local22] = arg0.method22425();
		}
		this.method23145(arg0, local12);
	}

	@OriginalMember(owner = "client!ano", name = "o", descriptor = "(Lclient!alw;)V", line = 142)
	@Override
	public void method23131(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat229 = 0.0F;
		this.aFloat228 = 0.0F;
		this.anInt3161 = 0;
		@Pc(12) int local12 = arg0.method22413();
		this.aClass479Array8 = new Class479[local12];
		this.aFloatArray75 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array8[local22] = new Class479(arg0);
			this.aFloatArray75[local22] = arg0.method22425();
		}
		this.method23145(arg0, local12);
	}

	@OriginalMember(owner = "client!ano", name = "ac", descriptor = "()V")
	abstract void method23139();

	@OriginalMember(owner = "client!ano", name = "b", descriptor = "(FFFI)F")
	abstract float method23141(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ano", name = "h", descriptor = "(I)V")
	abstract void method23142();

	@OriginalMember(owner = "client!ano", name = "al", descriptor = "()V")
	abstract void method23144();

	@OriginalMember(owner = "client!ano", name = "g", descriptor = "(Lclient!alw;IB)V")
	abstract void method23145(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ano", name = "i", descriptor = "(FFF)F")
	abstract float method23146(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ano", name = "t", descriptor = "(Lclient!alw;I)V")
	abstract void method23147(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ano", name = "j", descriptor = "(Lclient!alw;I)V")
	abstract void method23149(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);
}
