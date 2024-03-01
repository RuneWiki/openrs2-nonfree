package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahn")
public abstract class Class124_Sub3 extends Class124 {

	@OriginalMember(owner = "client!ahn", name = "bd", descriptor = "Lclient!cm;")
	public static Class100 aClass100_36;

	@OriginalMember(owner = "client!ahn", name = "m", descriptor = "[F")
	float[] aFloatArray70;

	@OriginalMember(owner = "client!ahn", name = "n", descriptor = "[Lclient!pe;")
	Class479[] aClass479Array5;

	@OriginalMember(owner = "client!ahn", name = "l", descriptor = "[I")
	int[] anIntArray257;

	@OriginalMember(owner = "client!ahn", name = "k", descriptor = "I")
	int anInt2979 = 0;

	@OriginalMember(owner = "client!ahn", name = "f", descriptor = "F")
	float aFloat219 = 0.0F;

	@OriginalMember(owner = "client!ahn", name = "w", descriptor = "F")
	float aFloat220 = 0.0F;

	@OriginalMember(owner = "client!ahn", name = "<init>", descriptor = "(Lclient!je;)V", line = 21)
	Class124_Sub3(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahn", name = "e", descriptor = "(I)[Lclient!zl;", line = 21)
	public static Class709[] method21455() {
		return new Class709[] { Class709.aClass709_8, Class709.aClass709_2, Class709.aClass709_3, Class709.aClass709_9, Class709.aClass709_11, Class709.aClass709_4, Class709.aClass709_10, Class709.aClass709_5, Class709.aClass709_6, Class709.aClass709_7 };
	}

	@OriginalMember(owner = "client!ahn", name = "ab", descriptor = "(Lclient!pe;IF)V", line = 25)
	public void method21431(@OriginalArg(0) Class479 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass479Array5 == null) {
			this.aClass479Array5 = new Class479[] { arg0 };
			this.aFloatArray70 = new float[] { arg2 };
			this.anIntArray257 = new int[] { arg1 };
			return;
		}
		@Pc(35) Class479[] local35 = new Class479[this.aClass479Array5.length + 1];
		@Pc(42) float[] local42 = new float[this.aClass479Array5.length + 1];
		@Pc(49) int[] local49 = new int[this.aClass479Array5.length + 1];
		System.arraycopy(this.aClass479Array5, 0, local35, 0, this.aClass479Array5.length);
		System.arraycopy(this.aFloatArray70, 0, local42, 0, this.aClass479Array5.length);
		System.arraycopy(this.anIntArray257, 0, local49, 0, this.aClass479Array5.length);
		this.aClass479Array5 = local35;
		this.aFloatArray70 = local42;
		this.anIntArray257 = local49;
		this.aClass479Array5[this.aClass479Array5.length - 1] = arg0;
		this.aFloatArray70[this.aFloatArray70.length - 1] = arg2;
		this.anIntArray257[this.anIntArray257.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ahn", name = "t", descriptor = "(Lclient!pe;IFI)V", line = 25)
	public void method21432(@OriginalArg(0) Class479 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass479Array5 == null) {
			this.aClass479Array5 = new Class479[] { arg0 };
			this.aFloatArray70 = new float[] { arg2 };
			this.anIntArray257 = new int[] { arg1 };
			return;
		}
		@Pc(35) Class479[] local35 = new Class479[this.aClass479Array5.length + 1];
		@Pc(42) float[] local42 = new float[this.aClass479Array5.length + 1];
		@Pc(49) int[] local49 = new int[this.aClass479Array5.length + 1];
		System.arraycopy(this.aClass479Array5, 0, local35, 0, this.aClass479Array5.length);
		System.arraycopy(this.aFloatArray70, 0, local42, 0, this.aClass479Array5.length);
		System.arraycopy(this.anIntArray257, 0, local49, 0, this.aClass479Array5.length);
		this.aClass479Array5 = local35;
		this.aFloatArray70 = local42;
		this.anIntArray257 = local49;
		this.aClass479Array5[this.aClass479Array5.length - 1] = arg0;
		this.aFloatArray70[this.aFloatArray70.length - 1] = arg2;
		this.anIntArray257[this.anIntArray257.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ahn", name = "h", descriptor = "(F[[[ILclient!qx;II)V", line = 47)
	@Override
	public void method21414(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class479 local7 = this.aClass479Array5[this.anInt2979 * -1041839613];
		if (this.aFloatArray70[this.anInt2979 * -1041839613] > 0.0F) {
			if (this.aFloatArray70[this.anInt2979 * -1041839613] >= arg0) {
				this.aFloatArray70[this.anInt2979 * -1041839613] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray70[this.anInt2979 * -1041839613];
			this.aFloatArray70[this.anInt2979 * -1041839613] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class451.method28948();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29713();
			if (this.aFloat219 >= local70) {
				if (this.aClass479Array5.length == this.anInt2979 * -1041839613 + 1) {
					return;
				}
				if (this.aFloatArray70[this.anInt2979 * -1041839613 + 1] >= arg0) {
					this.aFloatArray70[this.anInt2979 * -1041839613 + 1] -= arg0;
					return;
				}
				this.anInt2979 += 1487384747;
				arg0 -= this.aFloatArray70[this.anInt2979 * -1041839613];
				this.aFloatArray70[this.anInt2979 * -1041839613] = 0.0F;
				this.method21435();
				this.aFloat219 = 0.0F;
				this.aFloat220 = 0.0F;
				local7 = this.aClass479Array5[this.anInt2979 * -1041839613];
				local70 = local7.method29713();
			}
			while (arg0 > 0.0F && this.aFloat219 < local70) {
				this.aFloat220 = this.method21434(local70, this.aFloat220, Math.min(arg0, local63));
				arg0 -= local63;
				this.method21433(this.aFloat220, local70);
			}
		}
	}

	@OriginalMember(owner = "client!ahn", name = "b", descriptor = "(F[[[ILclient!qx;II)V", line = 47)
	@Override
	public void method21419(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class479 local7 = this.aClass479Array5[this.anInt2979 * -1041839613];
		if (this.aFloatArray70[this.anInt2979 * -1041839613] > 0.0F) {
			if (this.aFloatArray70[this.anInt2979 * -1041839613] >= arg0) {
				this.aFloatArray70[this.anInt2979 * -1041839613] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray70[this.anInt2979 * -1041839613];
			this.aFloatArray70[this.anInt2979 * -1041839613] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class451.method28948();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29713();
			if (this.aFloat219 >= local70) {
				if (this.aClass479Array5.length == this.anInt2979 * -1041839613 + 1) {
					return;
				}
				if (this.aFloatArray70[this.anInt2979 * -1041839613 + 1] >= arg0) {
					this.aFloatArray70[this.anInt2979 * -1041839613 + 1] -= arg0;
					return;
				}
				this.anInt2979 += 1487384747;
				arg0 -= this.aFloatArray70[this.anInt2979 * -1041839613];
				this.aFloatArray70[this.anInt2979 * -1041839613] = 0.0F;
				this.method21435();
				this.aFloat219 = 0.0F;
				this.aFloat220 = 0.0F;
				local7 = this.aClass479Array5[this.anInt2979 * -1041839613];
				local70 = local7.method29713();
			}
			while (arg0 > 0.0F && this.aFloat219 < local70) {
				this.aFloat220 = this.method21434(local70, this.aFloat220, Math.min(arg0, local63));
				arg0 -= local63;
				this.method21433(this.aFloat220, local70);
			}
		}
	}

	@OriginalMember(owner = "client!ahn", name = "a", descriptor = "(F[[[ILclient!qx;II)V", line = 47)
	@Override
	public void method21422(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class479 local7 = this.aClass479Array5[this.anInt2979 * -1041839613];
		if (this.aFloatArray70[this.anInt2979 * -1041839613] > 0.0F) {
			if (this.aFloatArray70[this.anInt2979 * -1041839613] >= arg0) {
				this.aFloatArray70[this.anInt2979 * -1041839613] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray70[this.anInt2979 * -1041839613];
			this.aFloatArray70[this.anInt2979 * -1041839613] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class451.method28948();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29713();
			if (this.aFloat219 >= local70) {
				if (this.aClass479Array5.length == this.anInt2979 * -1041839613 + 1) {
					return;
				}
				if (this.aFloatArray70[this.anInt2979 * -1041839613 + 1] >= arg0) {
					this.aFloatArray70[this.anInt2979 * -1041839613 + 1] -= arg0;
					return;
				}
				this.anInt2979 += 1487384747;
				arg0 -= this.aFloatArray70[this.anInt2979 * -1041839613];
				this.aFloatArray70[this.anInt2979 * -1041839613] = 0.0F;
				this.method21435();
				this.aFloat219 = 0.0F;
				this.aFloat220 = 0.0F;
				local7 = this.aClass479Array5[this.anInt2979 * -1041839613];
				local70 = local7.method29713();
			}
			while (arg0 > 0.0F && this.aFloat219 < local70) {
				this.aFloat220 = this.method21434(local70, this.aFloat220, Math.min(arg0, local63));
				arg0 -= local63;
				this.method21433(this.aFloat220, local70);
			}
		}
	}

	@OriginalMember(owner = "client!ahn", name = "e", descriptor = "(F[[[ILclient!qx;IIB)V", line = 47)
	@Override
	public void method21421(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class479 local7 = this.aClass479Array5[this.anInt2979 * -1041839613];
		if (this.aFloatArray70[this.anInt2979 * -1041839613] > 0.0F) {
			if (this.aFloatArray70[this.anInt2979 * -1041839613] >= arg0) {
				this.aFloatArray70[this.anInt2979 * -1041839613] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray70[this.anInt2979 * -1041839613];
			this.aFloatArray70[this.anInt2979 * -1041839613] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class451.method28948();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29713();
			if (this.aFloat219 >= local70) {
				if (this.aClass479Array5.length == this.anInt2979 * -1041839613 + 1) {
					return;
				}
				if (this.aFloatArray70[this.anInt2979 * -1041839613 + 1] >= arg0) {
					this.aFloatArray70[this.anInt2979 * -1041839613 + 1] -= arg0;
					return;
				}
				this.anInt2979 += 1487384747;
				arg0 -= this.aFloatArray70[this.anInt2979 * -1041839613];
				this.aFloatArray70[this.anInt2979 * -1041839613] = 0.0F;
				this.method21435();
				this.aFloat219 = 0.0F;
				this.aFloat220 = 0.0F;
				local7 = this.aClass479Array5[this.anInt2979 * -1041839613];
				local70 = local7.method29713();
			}
			while (arg0 > 0.0F && this.aFloat219 < local70) {
				this.aFloat220 = this.method21434(local70, this.aFloat220, Math.min(arg0, local63));
				arg0 -= local63;
				this.method21433(this.aFloat220, local70);
			}
		}
	}

	@OriginalMember(owner = "client!ahn", name = "ae", descriptor = "(FFI)V", line = 89)
	void method21433(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat219 += arg0;
		if (this.aFloat219 > arg1) {
			this.aFloat219 = arg1;
		}
	}

	@OriginalMember(owner = "client!ahn", name = "aq", descriptor = "(FF)V", line = 89)
	void method21448(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat219 += arg0;
		if (this.aFloat219 > arg1) {
			this.aFloat219 = arg1;
		}
	}

	@OriginalMember(owner = "client!ahn", name = "ax", descriptor = "(FF)V", line = 89)
	void method21449(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat219 += arg0;
		if (this.aFloat219 > arg1) {
			this.aFloat219 = arg1;
		}
	}

	@OriginalMember(owner = "client!ahn", name = "p", descriptor = "()Z", line = 97)
	@Override
	public boolean method21409() {
		return this.aClass479Array5 != null;
	}

	@OriginalMember(owner = "client!ahn", name = "n", descriptor = "(I)Z", line = 97)
	@Override
	public boolean method21401() {
		return this.aClass479Array5 != null;
	}

	@OriginalMember(owner = "client!ahn", name = "z", descriptor = "()Z", line = 97)
	@Override
	public boolean method21408() {
		return this.aClass479Array5 != null;
	}

	@OriginalMember(owner = "client!ahn", name = "m", descriptor = "(B)Lclient!ox;", line = 101)
	@Override
	public Class472 method21402() {
		@Pc(1) Class472 local1 = Class472.method29528();
		@Pc(12) double[] local12 = this.aClass479Array5[this.anInt2979 * -1041839613].method29714(this.aFloat219);
		local1.aFloat317 = (float) local12[0];
		local1.aFloat318 = (float) local12[1];
		local1.aFloat319 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ahn", name = "g", descriptor = "()Lclient!ox;", line = 101)
	@Override
	public Class472 method21423() {
		@Pc(1) Class472 local1 = Class472.method29528();
		@Pc(12) double[] local12 = this.aClass479Array5[this.anInt2979 * -1041839613].method29714(this.aFloat219);
		local1.aFloat317 = (float) local12[0];
		local1.aFloat318 = (float) local12[1];
		local1.aFloat319 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ahn", name = "k", descriptor = "(I)[D", line = 110)
	@Override
	public double[] method21413() {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29714(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "d", descriptor = "()[D", line = 110)
	@Override
	public double[] method21403() {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29714(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "v", descriptor = "()Lclient!akt;", line = 114)
	@Override
	public Class93_Sub30 method21412() {
		@Pc(3) Class472 local3 = this.method21402();
		return new Class93_Sub30(0, (int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319);
	}

	@OriginalMember(owner = "client!ahn", name = "f", descriptor = "(B)Lclient!akt;", line = 114)
	@Override
	public Class93_Sub30 method21404() {
		@Pc(3) Class472 local3 = this.method21402();
		return new Class93_Sub30(0, (int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319);
	}

	@OriginalMember(owner = "client!ahn", name = "r", descriptor = "()Lclient!akt;", line = 114)
	@Override
	public Class93_Sub30 method21420() {
		@Pc(3) Class472 local3 = this.method21402();
		return new Class93_Sub30(0, (int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319);
	}

	@OriginalMember(owner = "client!ahn", name = "o", descriptor = "()Lclient!akt;", line = 114)
	@Override
	public Class93_Sub30 method21410() {
		@Pc(3) Class472 local3 = this.method21402();
		return new Class93_Sub30(0, (int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319);
	}

	@OriginalMember(owner = "client!ahn", name = "c", descriptor = "()Lclient!akt;", line = 114)
	@Override
	public Class93_Sub30 method21411() {
		@Pc(3) Class472 local3 = this.method21402();
		return new Class93_Sub30(0, (int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319);
	}

	@OriginalMember(owner = "client!ahn", name = "ao", descriptor = "()F", line = 119)
	public float method21444() {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29720(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "al", descriptor = "(I)F", line = 119)
	public float method21445() {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29720(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "av", descriptor = "()F", line = 119)
	public float method21450() {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29720(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "aj", descriptor = "()F", line = 119)
	public float method21451() {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29720(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "ay", descriptor = "()F", line = 119)
	public float method21452() {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29720(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "y", descriptor = "()F", line = 123)
	@Override
	public float method21416() {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29711(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "w", descriptor = "(I)F", line = 123)
	@Override
	public float method21405() {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29711(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "s", descriptor = "()F", line = 123)
	@Override
	public float method21415() {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29711(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "l", descriptor = "(Lclient!ju;IIB)V", line = 127)
	@Override
	public void method21406(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class472 local3 = this.method21402();
		arg0.anInt4586 = ((int) local3.aFloat317 - arg1) * -255666073;
		arg0.anInt4587 = (int) -local3.aFloat318 * -543294551;
		arg0.anInt4588 = ((int) local3.aFloat319 - arg2) * -513444905;
	}

	@OriginalMember(owner = "client!ahn", name = "i", descriptor = "(Lclient!ju;II)V", line = 127)
	@Override
	public void method21400(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class472 local3 = this.method21402();
		arg0.anInt4586 = ((int) local3.aFloat317 - arg1) * -255666073;
		arg0.anInt4587 = (int) -local3.aFloat318 * -543294551;
		arg0.anInt4588 = ((int) local3.aFloat319 - arg2) * -513444905;
	}

	@OriginalMember(owner = "client!ahn", name = "j", descriptor = "(Lclient!ju;II)V", line = 127)
	@Override
	public void method21424(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class472 local3 = this.method21402();
		arg0.anInt4586 = ((int) local3.aFloat317 - arg1) * -255666073;
		arg0.anInt4587 = (int) -local3.aFloat318 * -543294551;
		arg0.anInt4588 = ((int) local3.aFloat319 - arg2) * -513444905;
	}

	@OriginalMember(owner = "client!ahn", name = "u", descriptor = "(Lclient!alw;I)V", line = 134)
	@Override
	public void method21407(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat219 = 0.0F;
		this.aFloat220 = 0.0F;
		this.anInt2979 = 0;
		@Pc(12) int local12 = arg0.method22413();
		this.aClass479Array5 = new Class479[local12];
		this.aFloatArray70 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array5[local22] = new Class479(arg0);
			this.aFloatArray70[local22] = arg0.method22425();
		}
		this.method21436(arg0, local12);
	}

	@OriginalMember(owner = "client!ahn", name = "q", descriptor = "(Lclient!alw;)V", line = 134)
	@Override
	public void method21417(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat219 = 0.0F;
		this.aFloat220 = 0.0F;
		this.anInt2979 = 0;
		@Pc(12) int local12 = arg0.method22413();
		this.aClass479Array5 = new Class479[local12];
		this.aFloatArray70 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array5[local22] = new Class479(arg0);
			this.aFloatArray70[local22] = arg0.method22425();
		}
		this.method21436(arg0, local12);
	}

	@OriginalMember(owner = "client!ahn", name = "x", descriptor = "(Lclient!alw;)V", line = 134)
	@Override
	public void method21418(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat219 = 0.0F;
		this.aFloat220 = 0.0F;
		this.anInt2979 = 0;
		@Pc(12) int local12 = arg0.method22413();
		this.aClass479Array5 = new Class479[local12];
		this.aFloatArray70 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array5[local22] = new Class479(arg0);
			this.aFloatArray70[local22] = arg0.method22425();
		}
		this.method21436(arg0, local12);
	}

	@OriginalMember(owner = "client!ahn", name = "r", descriptor = "(B)Lclient!zg;", line = 142)
	public static Class704 method21454() {
		return Class676.aClass704_1 == null ? Class704.aClass704_5 : Class676.aClass704_1;
	}

	@OriginalMember(owner = "client!ahn", name = "gq", descriptor = "(I)[Lclient!aal;", line = 3352)
	public static Class14[] method21453() {
		if (Class53.aClass14Array2 == null) {
			@Pc(6) Class14[] local6 = Class629.method32261(Class556.aClass7_1);
			@Pc(10) Class14[] local10 = new Class14[local6.length];
			@Pc(12) int local12 = 0;
			@Pc(17) int local17 = Class51.aClass93_Sub36_1.aClass166_Sub24_1.method15865();
			label71: for (@Pc(19) int local19 = 0; local19 < local6.length; local19++) {
				@Pc(27) Class14 local27 = local6[local19];
				if ((local27.anInt51 * -787109915 <= 0 || local27.anInt51 * -787109915 >= 24) && local27.anInt49 * -1362482655 >= 800 && local27.anInt50 * 72041005 >= 600 && (local17 != 2 || local27.anInt49 * -1362482655 <= 800 && local27.anInt50 * 72041005 <= 600) && (local17 != 1 || local27.anInt49 * -1362482655 <= 1024 && local27.anInt50 * 72041005 <= 768)) {
					for (@Pc(86) int local86 = 0; local86 < local12; local86++) {
						@Pc(93) Class14 local93 = local10[local86];
						if (local93.anInt49 * -1362482655 == local27.anInt49 * -1362482655 && local93.anInt50 * 72041005 == local27.anInt50 * 72041005) {
							if (local27.anInt51 * -787109915 > local93.anInt51 * -787109915) {
								local10[local86] = local27;
							}
							continue label71;
						}
					}
					local10[local12] = local27;
					local12++;
				}
			}
			Class53.aClass14Array2 = new Class14[local12];
			System.arraycopy(local10, 0, Class53.aClass14Array2, 0, local12);
			@Pc(147) int[] local147 = new int[Class53.aClass14Array2.length];
			for (@Pc(149) int local149 = 0; local149 < Class53.aClass14Array2.length; local149++) {
				@Pc(157) Class14 local157 = Class53.aClass14Array2[local149];
				local147[local149] = local157.anInt50 * 72041005 * -1362482655 * local157.anInt49;
			}
			Class107.method18123(local147, Class53.aClass14Array2);
		}
		return Class53.aClass14Array2;
	}

	@OriginalMember(owner = "client!ahn", name = "ag", descriptor = "(FFFB)F")
	abstract float method21434(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ahn", name = "ah", descriptor = "(I)V")
	abstract void method21435();

	@OriginalMember(owner = "client!ahn", name = "ac", descriptor = "(Lclient!alw;IS)V")
	abstract void method21436(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ahn", name = "ai", descriptor = "(FFF)F")
	abstract float method21437(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ahn", name = "aw", descriptor = "(FFF)F")
	abstract float method21438(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ahn", name = "as", descriptor = "(FFF)F")
	abstract float method21439(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ahn", name = "at", descriptor = "()V")
	abstract void method21440();

	@OriginalMember(owner = "client!ahn", name = "am", descriptor = "()V")
	abstract void method21441();

	@OriginalMember(owner = "client!ahn", name = "au", descriptor = "()V")
	abstract void method21442();

	@OriginalMember(owner = "client!ahn", name = "ad", descriptor = "()V")
	abstract void method21443();

	@OriginalMember(owner = "client!ahn", name = "ar", descriptor = "(Lclient!alw;I)V")
	abstract void method21446(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ahn", name = "ap", descriptor = "(Lclient!alw;I)V")
	abstract void method21447(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);
}
