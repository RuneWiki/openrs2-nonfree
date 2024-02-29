package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ant")
public abstract class Class149_Sub5 extends Class149 {

	@OriginalMember(owner = "client!ant", name = "v", descriptor = "[F")
	float[] aFloatArray86;

	@OriginalMember(owner = "client!ant", name = "c", descriptor = "[Lclient!oj;")
	Class443[] aClass443Array8;

	@OriginalMember(owner = "client!ant", name = "t", descriptor = "[I")
	int[] anIntArray291;

	@OriginalMember(owner = "client!ant", name = "l", descriptor = "I")
	int anInt3140 = 0;

	@OriginalMember(owner = "client!ant", name = "y", descriptor = "F")
	float aFloat229 = 0.0F;

	@OriginalMember(owner = "client!ant", name = "w", descriptor = "F")
	float aFloat228 = 0.0F;

	@OriginalMember(owner = "client!ant", name = "<init>", descriptor = "(Lclient!im;)V", line = 21)
	Class149_Sub5(@OriginalArg(0) Class107 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ant", name = "u", descriptor = "(Lclient!oj;IFI)V", line = 25)
	public void method23169(@OriginalArg(0) Class443 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass443Array8 == null) {
			this.aClass443Array8 = new Class443[] { arg0 };
			this.aFloatArray86 = new float[] { arg2 };
			this.anIntArray291 = new int[] { arg1 };
			return;
		}
		@Pc(35) Class443[] local35 = new Class443[this.aClass443Array8.length + 1];
		@Pc(42) float[] local42 = new float[this.aClass443Array8.length + 1];
		@Pc(49) int[] local49 = new int[this.aClass443Array8.length + 1];
		System.arraycopy(this.aClass443Array8, 0, local35, 0, this.aClass443Array8.length);
		System.arraycopy(this.aFloatArray86, 0, local42, 0, this.aClass443Array8.length);
		System.arraycopy(this.anIntArray291, 0, local49, 0, this.aClass443Array8.length);
		this.aClass443Array8 = local35;
		this.aFloatArray86 = local42;
		this.anIntArray291 = local49;
		this.aClass443Array8[this.aClass443Array8.length - 1] = arg0;
		this.aFloatArray86[this.aFloatArray86.length - 1] = arg2;
		this.anIntArray291[this.anIntArray291.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ant", name = "ak", descriptor = "(Lclient!oj;IF)V", line = 25)
	public void method23170(@OriginalArg(0) Class443 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass443Array8 == null) {
			this.aClass443Array8 = new Class443[] { arg0 };
			this.aFloatArray86 = new float[] { arg2 };
			this.anIntArray291 = new int[] { arg1 };
			return;
		}
		@Pc(35) Class443[] local35 = new Class443[this.aClass443Array8.length + 1];
		@Pc(42) float[] local42 = new float[this.aClass443Array8.length + 1];
		@Pc(49) int[] local49 = new int[this.aClass443Array8.length + 1];
		System.arraycopy(this.aClass443Array8, 0, local35, 0, this.aClass443Array8.length);
		System.arraycopy(this.aFloatArray86, 0, local42, 0, this.aClass443Array8.length);
		System.arraycopy(this.anIntArray291, 0, local49, 0, this.aClass443Array8.length);
		this.aClass443Array8 = local35;
		this.aFloatArray86 = local42;
		this.anIntArray291 = local49;
		this.aClass443Array8[this.aClass443Array8.length - 1] = arg0;
		this.aFloatArray86[this.aFloatArray86.length - 1] = arg2;
		this.anIntArray291[this.anIntArray291.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ant", name = "ax", descriptor = "(Lclient!oj;IF)V", line = 25)
	public void method23171(@OriginalArg(0) Class443 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass443Array8 == null) {
			this.aClass443Array8 = new Class443[] { arg0 };
			this.aFloatArray86 = new float[] { arg2 };
			this.anIntArray291 = new int[] { arg1 };
			return;
		}
		@Pc(35) Class443[] local35 = new Class443[this.aClass443Array8.length + 1];
		@Pc(42) float[] local42 = new float[this.aClass443Array8.length + 1];
		@Pc(49) int[] local49 = new int[this.aClass443Array8.length + 1];
		System.arraycopy(this.aClass443Array8, 0, local35, 0, this.aClass443Array8.length);
		System.arraycopy(this.aFloatArray86, 0, local42, 0, this.aClass443Array8.length);
		System.arraycopy(this.anIntArray291, 0, local49, 0, this.aClass443Array8.length);
		this.aClass443Array8 = local35;
		this.aFloatArray86 = local42;
		this.anIntArray291 = local49;
		this.aClass443Array8[this.aClass443Array8.length - 1] = arg0;
		this.aFloatArray86[this.aFloatArray86.length - 1] = arg2;
		this.anIntArray291[this.anIntArray291.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ant", name = "ao", descriptor = "(Lclient!oj;IF)V", line = 25)
	public void method23172(@OriginalArg(0) Class443 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass443Array8 == null) {
			this.aClass443Array8 = new Class443[] { arg0 };
			this.aFloatArray86 = new float[] { arg2 };
			this.anIntArray291 = new int[] { arg1 };
			return;
		}
		@Pc(35) Class443[] local35 = new Class443[this.aClass443Array8.length + 1];
		@Pc(42) float[] local42 = new float[this.aClass443Array8.length + 1];
		@Pc(49) int[] local49 = new int[this.aClass443Array8.length + 1];
		System.arraycopy(this.aClass443Array8, 0, local35, 0, this.aClass443Array8.length);
		System.arraycopy(this.aFloatArray86, 0, local42, 0, this.aClass443Array8.length);
		System.arraycopy(this.anIntArray291, 0, local49, 0, this.aClass443Array8.length);
		this.aClass443Array8 = local35;
		this.aFloatArray86 = local42;
		this.anIntArray291 = local49;
		this.aClass443Array8[this.aClass443Array8.length - 1] = arg0;
		this.aFloatArray86[this.aFloatArray86.length - 1] = arg2;
		this.anIntArray291[this.anIntArray291.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ant", name = "au", descriptor = "(Lclient!oj;IF)V", line = 25)
	public void method23173(@OriginalArg(0) Class443 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass443Array8 == null) {
			this.aClass443Array8 = new Class443[] { arg0 };
			this.aFloatArray86 = new float[] { arg2 };
			this.anIntArray291 = new int[] { arg1 };
			return;
		}
		@Pc(35) Class443[] local35 = new Class443[this.aClass443Array8.length + 1];
		@Pc(42) float[] local42 = new float[this.aClass443Array8.length + 1];
		@Pc(49) int[] local49 = new int[this.aClass443Array8.length + 1];
		System.arraycopy(this.aClass443Array8, 0, local35, 0, this.aClass443Array8.length);
		System.arraycopy(this.aFloatArray86, 0, local42, 0, this.aClass443Array8.length);
		System.arraycopy(this.anIntArray291, 0, local49, 0, this.aClass443Array8.length);
		this.aClass443Array8 = local35;
		this.aFloatArray86 = local42;
		this.anIntArray291 = local49;
		this.aClass443Array8[this.aClass443Array8.length - 1] = arg0;
		this.aFloatArray86[this.aFloatArray86.length - 1] = arg2;
		this.anIntArray291[this.anIntArray291.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ant", name = "p", descriptor = "(FI)V", line = 47)
	@Override
	public void method23156(@OriginalArg(0) float arg0) {
		@Pc(7) Class443 local7 = this.aClass443Array8[this.anInt3140 * -2113039071];
		if (this.aFloatArray86[this.anInt3140 * -2113039071] > 0.0F) {
			if (this.aFloatArray86[this.anInt3140 * -2113039071] >= arg0) {
				this.aFloatArray86[this.anInt3140 * -2113039071] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray86[this.anInt3140 * -2113039071];
			this.aFloatArray86[this.anInt3140 * -2113039071] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class475.method29690();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29075();
			if (this.aFloat229 >= local70) {
				if (this.anInt3140 * -2113039071 + 1 == this.aClass443Array8.length) {
					return;
				}
				if (this.aFloatArray86[this.anInt3140 * -2113039071 + 1] >= arg0) {
					this.aFloatArray86[this.anInt3140 * -2113039071 + 1] -= arg0;
					return;
				}
				this.anInt3140 += -1799082271;
				arg0 -= this.aFloatArray86[this.anInt3140 * -2113039071];
				this.aFloatArray86[this.anInt3140 * -2113039071] = 0.0F;
				this.method23190();
				this.aFloat229 = 0.0F;
				this.aFloat228 = 0.0F;
				local7 = this.aClass443Array8[this.anInt3140 * -2113039071];
				local70 = local7.method29075();
			}
			while (arg0 > 0.0F && this.aFloat229 < local70) {
				this.aFloat228 = this.method23181(local70, this.aFloat228, Math.min(arg0, local63));
				arg0 -= local63;
				this.method23174(this.aFloat228, local70);
			}
		}
	}

	@OriginalMember(owner = "client!ant", name = "t", descriptor = "(F)V", line = 47)
	@Override
	public void method23159(@OriginalArg(0) float arg0) {
		@Pc(7) Class443 local7 = this.aClass443Array8[this.anInt3140 * -2113039071];
		if (this.aFloatArray86[this.anInt3140 * -2113039071] > 0.0F) {
			if (this.aFloatArray86[this.anInt3140 * -2113039071] >= arg0) {
				this.aFloatArray86[this.anInt3140 * -2113039071] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray86[this.anInt3140 * -2113039071];
			this.aFloatArray86[this.anInt3140 * -2113039071] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class475.method29690();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29075();
			if (this.aFloat229 >= local70) {
				if (this.anInt3140 * -2113039071 + 1 == this.aClass443Array8.length) {
					return;
				}
				if (this.aFloatArray86[this.anInt3140 * -2113039071 + 1] >= arg0) {
					this.aFloatArray86[this.anInt3140 * -2113039071 + 1] -= arg0;
					return;
				}
				this.anInt3140 += -1799082271;
				arg0 -= this.aFloatArray86[this.anInt3140 * -2113039071];
				this.aFloatArray86[this.anInt3140 * -2113039071] = 0.0F;
				this.method23190();
				this.aFloat229 = 0.0F;
				this.aFloat228 = 0.0F;
				local7 = this.aClass443Array8[this.anInt3140 * -2113039071];
				local70 = local7.method29075();
			}
			while (arg0 > 0.0F && this.aFloat229 < local70) {
				this.aFloat228 = this.method23181(local70, this.aFloat228, Math.min(arg0, local63));
				arg0 -= local63;
				this.method23174(this.aFloat228, local70);
			}
		}
	}

	@OriginalMember(owner = "client!ant", name = "q", descriptor = "(F)V", line = 47)
	@Override
	public void method23155(@OriginalArg(0) float arg0) {
		@Pc(7) Class443 local7 = this.aClass443Array8[this.anInt3140 * -2113039071];
		if (this.aFloatArray86[this.anInt3140 * -2113039071] > 0.0F) {
			if (this.aFloatArray86[this.anInt3140 * -2113039071] >= arg0) {
				this.aFloatArray86[this.anInt3140 * -2113039071] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray86[this.anInt3140 * -2113039071];
			this.aFloatArray86[this.anInt3140 * -2113039071] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class475.method29690();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29075();
			if (this.aFloat229 >= local70) {
				if (this.anInt3140 * -2113039071 + 1 == this.aClass443Array8.length) {
					return;
				}
				if (this.aFloatArray86[this.anInt3140 * -2113039071 + 1] >= arg0) {
					this.aFloatArray86[this.anInt3140 * -2113039071 + 1] -= arg0;
					return;
				}
				this.anInt3140 += -1799082271;
				arg0 -= this.aFloatArray86[this.anInt3140 * -2113039071];
				this.aFloatArray86[this.anInt3140 * -2113039071] = 0.0F;
				this.method23190();
				this.aFloat229 = 0.0F;
				this.aFloat228 = 0.0F;
				local7 = this.aClass443Array8[this.anInt3140 * -2113039071];
				local70 = local7.method29075();
			}
			while (arg0 > 0.0F && this.aFloat229 < local70) {
				this.aFloat228 = this.method23181(local70, this.aFloat228, Math.min(arg0, local63));
				arg0 -= local63;
				this.method23174(this.aFloat228, local70);
			}
		}
	}

	@OriginalMember(owner = "client!ant", name = "x", descriptor = "(F)V", line = 47)
	@Override
	public void method23161(@OriginalArg(0) float arg0) {
		@Pc(7) Class443 local7 = this.aClass443Array8[this.anInt3140 * -2113039071];
		if (this.aFloatArray86[this.anInt3140 * -2113039071] > 0.0F) {
			if (this.aFloatArray86[this.anInt3140 * -2113039071] >= arg0) {
				this.aFloatArray86[this.anInt3140 * -2113039071] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray86[this.anInt3140 * -2113039071];
			this.aFloatArray86[this.anInt3140 * -2113039071] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class475.method29690();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29075();
			if (this.aFloat229 >= local70) {
				if (this.anInt3140 * -2113039071 + 1 == this.aClass443Array8.length) {
					return;
				}
				if (this.aFloatArray86[this.anInt3140 * -2113039071 + 1] >= arg0) {
					this.aFloatArray86[this.anInt3140 * -2113039071 + 1] -= arg0;
					return;
				}
				this.anInt3140 += -1799082271;
				arg0 -= this.aFloatArray86[this.anInt3140 * -2113039071];
				this.aFloatArray86[this.anInt3140 * -2113039071] = 0.0F;
				this.method23190();
				this.aFloat229 = 0.0F;
				this.aFloat228 = 0.0F;
				local7 = this.aClass443Array8[this.anInt3140 * -2113039071];
				local70 = local7.method29075();
			}
			while (arg0 > 0.0F && this.aFloat229 < local70) {
				this.aFloat228 = this.method23181(local70, this.aFloat228, Math.min(arg0, local63));
				arg0 -= local63;
				this.method23174(this.aFloat228, local70);
			}
		}
	}

	@OriginalMember(owner = "client!ant", name = "e", descriptor = "(FFI)V", line = 89)
	void method23174(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > arg1) {
			this.aFloat229 = arg1;
		}
	}

	@OriginalMember(owner = "client!ant", name = "ar", descriptor = "(FF)V", line = 89)
	void method23175(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > arg1) {
			this.aFloat229 = arg1;
		}
	}

	@OriginalMember(owner = "client!ant", name = "ad", descriptor = "(FF)V", line = 89)
	void method23176(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > arg1) {
			this.aFloat229 = arg1;
		}
	}

	@OriginalMember(owner = "client!ant", name = "c", descriptor = "(B)Z", line = 97)
	@Override
	public boolean method23154() {
		return this.aClass443Array8 != null;
	}

	@OriginalMember(owner = "client!ant", name = "d", descriptor = "()Z", line = 97)
	@Override
	public boolean method23162() {
		return this.aClass443Array8 != null;
	}

	@OriginalMember(owner = "client!ant", name = "r", descriptor = "()Lclient!oo;", line = 101)
	@Override
	public Class447 method23164() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array8[this.anInt3140 * -2113039071].method29076(this.aFloat229);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ant", name = "z", descriptor = "()Lclient!oo;", line = 101)
	@Override
	public Class447 method23158() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array8[this.anInt3140 * -2113039071].method29076(this.aFloat229);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ant", name = "g", descriptor = "()Lclient!oo;", line = 101)
	@Override
	public Class447 method23160() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array8[this.anInt3140 * -2113039071].method29076(this.aFloat229);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ant", name = "v", descriptor = "(I)Lclient!oo;", line = 101)
	@Override
	public Class447 method23153() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array8[this.anInt3140 * -2113039071].method29076(this.aFloat229);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ant", name = "b", descriptor = "(I)[D", line = 110)
	double[] method23177() {
		return this.aClass443Array8[this.anInt3140 * -2113039071].method29076(this.aFloat229);
	}

	@OriginalMember(owner = "client!ant", name = "ac", descriptor = "()[D", line = 110)
	double[] method23178() {
		return this.aClass443Array8[this.anInt3140 * -2113039071].method29076(this.aFloat229);
	}

	@OriginalMember(owner = "client!ant", name = "av", descriptor = "()[D", line = 110)
	double[] method23179() {
		return this.aClass443Array8[this.anInt3140 * -2113039071].method29076(this.aFloat229);
	}

	@OriginalMember(owner = "client!ant", name = "l", descriptor = "(I)Lclient!oo;", line = 114)
	@Override
	public Class447 method23165() {
		return this.method23153();
	}

	@OriginalMember(owner = "client!ant", name = "i", descriptor = "()Lclient!oo;", line = 114)
	@Override
	public Class447 method23167() {
		return this.method23153();
	}

	@OriginalMember(owner = "client!ant", name = "j", descriptor = "()Lclient!oo;", line = 114)
	@Override
	public Class447 method23166() {
		return this.method23153();
	}

	@OriginalMember(owner = "client!ant", name = "y", descriptor = "(Lclient!ia;Lclient!ow;IIFI)V", line = 118)
	@Override
	public void method23157(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass107_16.method8885();
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method23177();
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class447 local56 = Class447.method29119();
		local56.aFloat277 = (float) (local24[0] - local4[0]);
		local56.aFloat276 = (float) (local24[1] - local4[1]);
		local56.aFloat278 = (float) (local24[2] - local4[2]);
		local56.method29145();
		@Pc(92) Class452 local92 = new Class452();
		local92.method29290(local56, arg4);
		@Pc(101) Class447 local101 = Class447.method29120(0.0F, 1.0F, 0.0F);
		@Pc(105) Class447 local105 = Class447.method29168(local56, local101);
		@Pc(109) Class447 local109 = Class447.method29168(local105, local56);
		local109.method29198(local92);
		arg1.method29396(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat277, local109.aFloat276, local109.aFloat278);
		local109.method29130();
	}

	@OriginalMember(owner = "client!ant", name = "s", descriptor = "(Lclient!ia;Lclient!ow;IIF)V", line = 118)
	@Override
	public void method23163(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass107_16.method8885();
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method23177();
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class447 local56 = Class447.method29119();
		local56.aFloat277 = (float) (local24[0] - local4[0]);
		local56.aFloat276 = (float) (local24[1] - local4[1]);
		local56.aFloat278 = (float) (local24[2] - local4[2]);
		local56.method29145();
		@Pc(92) Class452 local92 = new Class452();
		local92.method29290(local56, arg4);
		@Pc(101) Class447 local101 = Class447.method29120(0.0F, 1.0F, 0.0F);
		@Pc(105) Class447 local105 = Class447.method29168(local56, local101);
		@Pc(109) Class447 local109 = Class447.method29168(local105, local56);
		local109.method29198(local92);
		arg1.method29396(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat277, local109.aFloat276, local109.aFloat278);
		local109.method29130();
	}

	@OriginalMember(owner = "client!ant", name = "w", descriptor = "(Lclient!akv;I)V", line = 142)
	@Override
	public void method23152(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aFloat229 = 0.0F;
		this.aFloat228 = 0.0F;
		this.anInt3140 = 0;
		@Pc(12) int local12 = arg0.method22478();
		this.aClass443Array8 = new Class443[local12];
		this.aFloatArray86 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass443Array8[local22] = new Class443(arg0);
			this.aFloatArray86[local22] = arg0.method22517();
		}
		this.method23189(arg0, local12);
	}

	@OriginalMember(owner = "client!ant", name = "k", descriptor = "(Lclient!akv;)V", line = 142)
	@Override
	public void method23168(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aFloat229 = 0.0F;
		this.aFloat228 = 0.0F;
		this.anInt3140 = 0;
		@Pc(12) int local12 = arg0.method22478();
		this.aClass443Array8 = new Class443[local12];
		this.aFloatArray86 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass443Array8[local22] = new Class443(arg0);
			this.aFloatArray86[local22] = arg0.method22517();
		}
		this.method23189(arg0, local12);
	}

	@OriginalMember(owner = "client!ant", name = "f", descriptor = "(Lclient!dx;B)V", line = 579)
	static void method23180(@OriginalArg(0) Class86 arg0) {
		if (Class683.aClass442_98 != null) {
			arg0.method20123(Class683.aClass442_98);
			arg0.method20121(Class683.aClass455_54);
			arg0.method20151(Class683.anInt5831 * 894945745, Class683.anInt5832 * -655548783, Class683.anInt5833 * 1852547097 + Class683.anInt5831 * 894945745, Class683.anInt5832 * -655548783 + Class683.anInt5834 * -1954074475);
			arg0.method20104(Class683.anInt5831 * 894945745, Class683.anInt5832 * -655548783, Class683.anInt5833 * 1852547097, Class683.anInt5834 * -1954074475);
		}
	}

	@OriginalMember(owner = "client!ant", name = "f", descriptor = "(FFFI)F")
	abstract float method23181(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ant", name = "a", descriptor = "(FFF)F")
	abstract float method23182(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ant", name = "m", descriptor = "(FFF)F")
	abstract float method23183(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ant", name = "h", descriptor = "(FFF)F")
	abstract float method23184(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ant", name = "aj", descriptor = "()V")
	abstract void method23185();

	@OriginalMember(owner = "client!ant", name = "ag", descriptor = "(Lclient!akv;I)V")
	abstract void method23186(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ant", name = "al", descriptor = "(Lclient!akv;I)V")
	abstract void method23187(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ant", name = "ai", descriptor = "(Lclient!akv;I)V")
	abstract void method23188(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ant", name = "n", descriptor = "(Lclient!akv;IB)V")
	abstract void method23189(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ant", name = "o", descriptor = "(I)V")
	abstract void method23190();
}
