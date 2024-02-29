package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aht")
public abstract class Class115_Sub3 extends Class115 {

	@OriginalMember(owner = "client!aht", name = "fc", descriptor = "Lclient!pw;")
	public static Class478 aClass478_83;

	@OriginalMember(owner = "client!aht", name = "v", descriptor = "[F")
	float[] aFloatArray78;

	@OriginalMember(owner = "client!aht", name = "c", descriptor = "[Lclient!oj;")
	Class443[] aClass443Array5;

	@OriginalMember(owner = "client!aht", name = "t", descriptor = "[I")
	int[] anIntArray279;

	@OriginalMember(owner = "client!aht", name = "l", descriptor = "I")
	int anInt2918 = 0;

	@OriginalMember(owner = "client!aht", name = "y", descriptor = "F")
	float aFloat216 = 0.0F;

	@OriginalMember(owner = "client!aht", name = "w", descriptor = "F")
	float aFloat215 = 0.0F;

	@OriginalMember(owner = "client!aht", name = "<init>", descriptor = "(Lclient!im;)V", line = 21)
	Class115_Sub3(@OriginalArg(0) Class107 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aht", name = "aj", descriptor = "(Lclient!oj;IFB)V", line = 25)
	public void method21231(@OriginalArg(0) Class443 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass443Array5 == null) {
			this.aClass443Array5 = new Class443[] { arg0 };
			this.aFloatArray78 = new float[] { arg2 };
			this.anIntArray279 = new int[] { arg1 };
			return;
		}
		@Pc(34) Class443[] local34 = new Class443[this.aClass443Array5.length + 1];
		@Pc(41) float[] local41 = new float[this.aClass443Array5.length + 1];
		@Pc(48) int[] local48 = new int[this.aClass443Array5.length + 1];
		System.arraycopy(this.aClass443Array5, 0, local34, 0, this.aClass443Array5.length);
		System.arraycopy(this.aFloatArray78, 0, local41, 0, this.aClass443Array5.length);
		System.arraycopy(this.anIntArray279, 0, local48, 0, this.aClass443Array5.length);
		this.aClass443Array5 = local34;
		this.aFloatArray78 = local41;
		this.anIntArray279 = local48;
		this.aClass443Array5[this.aClass443Array5.length - 1] = arg0;
		this.aFloatArray78[this.aFloatArray78.length - 1] = arg2;
		this.anIntArray279[this.anIntArray279.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!aht", name = "aq", descriptor = "(Lclient!oj;IF)V", line = 25)
	public void method21232(@OriginalArg(0) Class443 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass443Array5 == null) {
			this.aClass443Array5 = new Class443[] { arg0 };
			this.aFloatArray78 = new float[] { arg2 };
			this.anIntArray279 = new int[] { arg1 };
			return;
		}
		@Pc(34) Class443[] local34 = new Class443[this.aClass443Array5.length + 1];
		@Pc(41) float[] local41 = new float[this.aClass443Array5.length + 1];
		@Pc(48) int[] local48 = new int[this.aClass443Array5.length + 1];
		System.arraycopy(this.aClass443Array5, 0, local34, 0, this.aClass443Array5.length);
		System.arraycopy(this.aFloatArray78, 0, local41, 0, this.aClass443Array5.length);
		System.arraycopy(this.anIntArray279, 0, local48, 0, this.aClass443Array5.length);
		this.aClass443Array5 = local34;
		this.aFloatArray78 = local41;
		this.anIntArray279 = local48;
		this.aClass443Array5[this.aClass443Array5.length - 1] = arg0;
		this.aFloatArray78[this.aFloatArray78.length - 1] = arg2;
		this.anIntArray279[this.anIntArray279.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!aht", name = "p", descriptor = "(F[[[ILclient!ps;IIB)V", line = 47)
	@Override
	public void method21212(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class443 local7 = this.aClass443Array5[this.anInt2918 * 1539489709];
		if (this.aFloatArray78[this.anInt2918 * 1539489709] > 0.0F) {
			if (this.aFloatArray78[this.anInt2918 * 1539489709] >= arg0) {
				this.aFloatArray78[this.anInt2918 * 1539489709] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray78[this.anInt2918 * 1539489709];
			this.aFloatArray78[this.anInt2918 * 1539489709] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class475.method29690();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29075();
			if (this.aFloat216 >= local70) {
				if (this.anInt2918 * 1539489709 + 1 == this.aClass443Array5.length) {
					return;
				}
				if (this.aFloatArray78[this.anInt2918 * 1539489709 + 1] >= arg0) {
					this.aFloatArray78[this.anInt2918 * 1539489709 + 1] -= arg0;
					return;
				}
				this.anInt2918 += 2120023077;
				arg0 -= this.aFloatArray78[this.anInt2918 * 1539489709];
				this.aFloatArray78[this.anInt2918 * 1539489709] = 0.0F;
				this.method21242();
				this.aFloat216 = 0.0F;
				this.aFloat215 = 0.0F;
				local7 = this.aClass443Array5[this.anInt2918 * 1539489709];
				local70 = local7.method29075();
			}
			while (arg0 > 0.0F && this.aFloat216 < local70) {
				this.aFloat215 = this.method21241(local70, this.aFloat215, Math.min(arg0, local63));
				arg0 -= local63;
				this.method21233(this.aFloat215, local70);
			}
		}
	}

	@OriginalMember(owner = "client!aht", name = "d", descriptor = "(F[[[ILclient!ps;II)V", line = 47)
	@Override
	public void method21214(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class443 local7 = this.aClass443Array5[this.anInt2918 * 1539489709];
		if (this.aFloatArray78[this.anInt2918 * 1539489709] > 0.0F) {
			if (this.aFloatArray78[this.anInt2918 * 1539489709] >= arg0) {
				this.aFloatArray78[this.anInt2918 * 1539489709] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray78[this.anInt2918 * 1539489709];
			this.aFloatArray78[this.anInt2918 * 1539489709] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class475.method29690();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29075();
			if (this.aFloat216 >= local70) {
				if (this.anInt2918 * 1539489709 + 1 == this.aClass443Array5.length) {
					return;
				}
				if (this.aFloatArray78[this.anInt2918 * 1539489709 + 1] >= arg0) {
					this.aFloatArray78[this.anInt2918 * 1539489709 + 1] -= arg0;
					return;
				}
				this.anInt2918 += 2120023077;
				arg0 -= this.aFloatArray78[this.anInt2918 * 1539489709];
				this.aFloatArray78[this.anInt2918 * 1539489709] = 0.0F;
				this.method21242();
				this.aFloat216 = 0.0F;
				this.aFloat215 = 0.0F;
				local7 = this.aClass443Array5[this.anInt2918 * 1539489709];
				local70 = local7.method29075();
			}
			while (arg0 > 0.0F && this.aFloat216 < local70) {
				this.aFloat215 = this.method21241(local70, this.aFloat215, Math.min(arg0, local63));
				arg0 -= local63;
				this.method21233(this.aFloat215, local70);
			}
		}
	}

	@OriginalMember(owner = "client!aht", name = "x", descriptor = "(F[[[ILclient!ps;II)V", line = 47)
	@Override
	public void method21215(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class443 local7 = this.aClass443Array5[this.anInt2918 * 1539489709];
		if (this.aFloatArray78[this.anInt2918 * 1539489709] > 0.0F) {
			if (this.aFloatArray78[this.anInt2918 * 1539489709] >= arg0) {
				this.aFloatArray78[this.anInt2918 * 1539489709] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray78[this.anInt2918 * 1539489709];
			this.aFloatArray78[this.anInt2918 * 1539489709] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class475.method29690();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29075();
			if (this.aFloat216 >= local70) {
				if (this.anInt2918 * 1539489709 + 1 == this.aClass443Array5.length) {
					return;
				}
				if (this.aFloatArray78[this.anInt2918 * 1539489709 + 1] >= arg0) {
					this.aFloatArray78[this.anInt2918 * 1539489709 + 1] -= arg0;
					return;
				}
				this.anInt2918 += 2120023077;
				arg0 -= this.aFloatArray78[this.anInt2918 * 1539489709];
				this.aFloatArray78[this.anInt2918 * 1539489709] = 0.0F;
				this.method21242();
				this.aFloat216 = 0.0F;
				this.aFloat215 = 0.0F;
				local7 = this.aClass443Array5[this.anInt2918 * 1539489709];
				local70 = local7.method29075();
			}
			while (arg0 > 0.0F && this.aFloat216 < local70) {
				this.aFloat215 = this.method21241(local70, this.aFloat215, Math.min(arg0, local63));
				arg0 -= local63;
				this.method21233(this.aFloat215, local70);
			}
		}
	}

	@OriginalMember(owner = "client!aht", name = "s", descriptor = "(F[[[ILclient!ps;II)V", line = 47)
	@Override
	public void method21208(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class443 local7 = this.aClass443Array5[this.anInt2918 * 1539489709];
		if (this.aFloatArray78[this.anInt2918 * 1539489709] > 0.0F) {
			if (this.aFloatArray78[this.anInt2918 * 1539489709] >= arg0) {
				this.aFloatArray78[this.anInt2918 * 1539489709] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray78[this.anInt2918 * 1539489709];
			this.aFloatArray78[this.anInt2918 * 1539489709] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class475.method29690();
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29075();
			if (this.aFloat216 >= local70) {
				if (this.anInt2918 * 1539489709 + 1 == this.aClass443Array5.length) {
					return;
				}
				if (this.aFloatArray78[this.anInt2918 * 1539489709 + 1] >= arg0) {
					this.aFloatArray78[this.anInt2918 * 1539489709 + 1] -= arg0;
					return;
				}
				this.anInt2918 += 2120023077;
				arg0 -= this.aFloatArray78[this.anInt2918 * 1539489709];
				this.aFloatArray78[this.anInt2918 * 1539489709] = 0.0F;
				this.method21242();
				this.aFloat216 = 0.0F;
				this.aFloat215 = 0.0F;
				local7 = this.aClass443Array5[this.anInt2918 * 1539489709];
				local70 = local7.method29075();
			}
			while (arg0 > 0.0F && this.aFloat216 < local70) {
				this.aFloat215 = this.method21241(local70, this.aFloat215, Math.min(arg0, local63));
				arg0 -= local63;
				this.method21233(this.aFloat215, local70);
			}
		}
	}

	@OriginalMember(owner = "client!aht", name = "ai", descriptor = "(FFI)V", line = 89)
	void method21233(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat216 += arg0;
		if (this.aFloat216 > arg1) {
			this.aFloat216 = arg1;
		}
	}

	@OriginalMember(owner = "client!aht", name = "ae", descriptor = "(FF)V", line = 89)
	void method21234(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat216 += arg0;
		if (this.aFloat216 > arg1) {
			this.aFloat216 = arg1;
		}
	}

	@OriginalMember(owner = "client!aht", name = "g", descriptor = "()Z", line = 97)
	@Override
	public boolean method21217() {
		return this.aClass443Array5 != null;
	}

	@OriginalMember(owner = "client!aht", name = "c", descriptor = "(I)Z", line = 97)
	@Override
	public boolean method21207() {
		return this.aClass443Array5 != null;
	}

	@OriginalMember(owner = "client!aht", name = "r", descriptor = "()Z", line = 97)
	@Override
	public boolean method21216() {
		return this.aClass443Array5 != null;
	}

	@OriginalMember(owner = "client!aht", name = "z", descriptor = "()Z", line = 97)
	@Override
	public boolean method21223() {
		return this.aClass443Array5 != null;
	}

	@OriginalMember(owner = "client!aht", name = "j", descriptor = "()Lclient!oo;", line = 101)
	@Override
	public Class447 method21219() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array5[this.anInt2918 * 1539489709].method29076(this.aFloat216);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!aht", name = "v", descriptor = "(I)Lclient!oo;", line = 101)
	@Override
	public Class447 method21213() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array5[this.anInt2918 * 1539489709].method29076(this.aFloat216);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!aht", name = "u", descriptor = "()Lclient!oo;", line = 101)
	@Override
	public Class447 method21222() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array5[this.anInt2918 * 1539489709].method29076(this.aFloat216);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!aht", name = "i", descriptor = "()Lclient!oo;", line = 101)
	@Override
	public Class447 method21205() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array5[this.anInt2918 * 1539489709].method29076(this.aFloat216);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!aht", name = "k", descriptor = "()Lclient!oo;", line = 101)
	@Override
	public Class447 method21221() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array5[this.anInt2918 * 1539489709].method29076(this.aFloat216);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!aht", name = "l", descriptor = "(I)[D", line = 110)
	@Override
	public double[] method21206() {
		return this.aClass443Array5[this.anInt2918 * 1539489709].method29076(this.aFloat216);
	}

	@OriginalMember(owner = "client!aht", name = "e", descriptor = "()[D", line = 110)
	@Override
	public double[] method21220() {
		return this.aClass443Array5[this.anInt2918 * 1539489709].method29076(this.aFloat216);
	}

	@OriginalMember(owner = "client!aht", name = "f", descriptor = "()Lclient!aks;", line = 114)
	@Override
	public Class77_Sub36 method21211() {
		@Pc(3) Class447 local3 = this.method21213();
		return new Class77_Sub36(0, (int) local3.aFloat277, (int) local3.aFloat276, (int) local3.aFloat278);
	}

	@OriginalMember(owner = "client!aht", name = "y", descriptor = "(B)Lclient!aks;", line = 114)
	@Override
	public Class77_Sub36 method21209() {
		@Pc(3) Class447 local3 = this.method21213();
		return new Class77_Sub36(0, (int) local3.aFloat277, (int) local3.aFloat276, (int) local3.aFloat278);
	}

	@OriginalMember(owner = "client!aht", name = "as", descriptor = "()F", line = 119)
	public float method21235() {
		return this.aClass443Array5[this.anInt2918 * 1539489709].method29078(this.aFloat216);
	}

	@OriginalMember(owner = "client!aht", name = "ao", descriptor = "(B)F", line = 119)
	public float method21236() {
		return this.aClass443Array5[this.anInt2918 * 1539489709].method29078(this.aFloat216);
	}

	@OriginalMember(owner = "client!aht", name = "ah", descriptor = "()F", line = 119)
	public float method21237() {
		return this.aClass443Array5[this.anInt2918 * 1539489709].method29078(this.aFloat216);
	}

	@OriginalMember(owner = "client!aht", name = "w", descriptor = "(I)F", line = 123)
	@Override
	public float method21210() {
		return this.aClass443Array5[this.anInt2918 * 1539489709].method29085(this.aFloat216);
	}

	@OriginalMember(owner = "client!aht", name = "m", descriptor = "()F", line = 123)
	@Override
	public float method21229() {
		return this.aClass443Array5[this.anInt2918 * 1539489709].method29085(this.aFloat216);
	}

	@OriginalMember(owner = "client!aht", name = "h", descriptor = "()F", line = 123)
	@Override
	public float method21230() {
		return this.aClass443Array5[this.anInt2918 * 1539489709].method29085(this.aFloat216);
	}

	@OriginalMember(owner = "client!aht", name = "t", descriptor = "(Lclient!ia;IIS)V", line = 127)
	@Override
	public void method21225(@OriginalArg(0) Class315 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class447 local3 = this.method21213();
		arg0.anInt4067 = ((int) local3.aFloat277 - arg1) * -1803517691;
		arg0.anInt4068 = (int) -local3.aFloat276 * -1390317707;
		arg0.anInt4066 = ((int) local3.aFloat278 - arg2) * 1552704101;
	}

	@OriginalMember(owner = "client!aht", name = "o", descriptor = "(Lclient!ia;II)V", line = 127)
	@Override
	public void method21218(@OriginalArg(0) Class315 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class447 local3 = this.method21213();
		arg0.anInt4067 = ((int) local3.aFloat277 - arg1) * -1803517691;
		arg0.anInt4068 = (int) -local3.aFloat276 * -1390317707;
		arg0.anInt4066 = ((int) local3.aFloat278 - arg2) * 1552704101;
	}

	@OriginalMember(owner = "client!aht", name = "b", descriptor = "(Lclient!ia;II)V", line = 127)
	@Override
	public void method21226(@OriginalArg(0) Class315 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class447 local3 = this.method21213();
		arg0.anInt4067 = ((int) local3.aFloat277 - arg1) * -1803517691;
		arg0.anInt4068 = (int) -local3.aFloat276 * -1390317707;
		arg0.anInt4066 = ((int) local3.aFloat278 - arg2) * 1552704101;
	}

	@OriginalMember(owner = "client!aht", name = "a", descriptor = "(Lclient!akv;)V", line = 134)
	@Override
	public void method21228(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aFloat216 = 0.0F;
		this.aFloat215 = 0.0F;
		this.anInt2918 = 0;
		@Pc(12) int local12 = arg0.method22478();
		this.aClass443Array5 = new Class443[local12];
		this.aFloatArray78 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass443Array5[local22] = new Class443(arg0);
			this.aFloatArray78[local22] = arg0.method22517();
		}
		this.method21247(arg0, local12);
	}

	@OriginalMember(owner = "client!aht", name = "n", descriptor = "(Lclient!akv;)V", line = 134)
	@Override
	public void method21227(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aFloat216 = 0.0F;
		this.aFloat215 = 0.0F;
		this.anInt2918 = 0;
		@Pc(12) int local12 = arg0.method22478();
		this.aClass443Array5 = new Class443[local12];
		this.aFloatArray78 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass443Array5[local22] = new Class443(arg0);
			this.aFloatArray78[local22] = arg0.method22517();
		}
		this.method21247(arg0, local12);
	}

	@OriginalMember(owner = "client!aht", name = "q", descriptor = "(Lclient!akv;B)V", line = 134)
	@Override
	public void method21224(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aFloat216 = 0.0F;
		this.aFloat215 = 0.0F;
		this.anInt2918 = 0;
		@Pc(12) int local12 = arg0.method22478();
		this.aClass443Array5 = new Class443[local12];
		this.aFloatArray78 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass443Array5[local22] = new Class443(arg0);
			this.aFloatArray78[local22] = arg0.method22517();
		}
		this.method21247(arg0, local12);
	}

	@OriginalMember(owner = "client!aht", name = "dr", descriptor = "(Lclient!dx;Lclient!zm;IIB)V", line = 347)
	static void method21238(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class695 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class612.aClass695_52.method36380();
		if (Class136_Sub1.aBoolean345) {
			return;
		}
		for (@Pc(10) Class77_Sub30 local10 = (Class77_Sub30) arg1.method36395(); local10 != null; local10 = (Class77_Sub30) arg1.method36406()) {
			@Pc(21) Class302 local21 = (Class302) Class136_Sub1.aClass35_Sub10_2.method18319(local10.anInt1635 * 1592054281);
			if (Class260.method26251(local21)) {
				@Pc(34) boolean local34 = Class319.method27445(arg0, local10, local21, arg2, arg3);
				if (local34) {
					Class593.method31848(arg0, local10, local21);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aht", name = "gw", descriptor = "(IIII)V", line = 3629)
	public static void method21239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(7) int local7 = arg1 << 3;
		@Pc(11) int local11 = arg2 << 3;
		if (Class11.anInt36 * -891094135 != 3) {
			client.aFloat249 = local3;
			client.aFloat247 = local7;
			if (Class11.anInt36 * -891094135 == 4) {
				Class565.anInt5338 = local3 * -1539495063;
				Class639.anInt5720 = local7 * 486346273;
				Class4.anInt17 = local11 * 506655975;
			}
			Class348.method27861();
		} else if (Class597.aClass107_Sub1_2.method8880() == Class331.aClass331_4) {
			@Pc(26) Class115_Sub1 local26 = (Class115_Sub1) Class597.aClass107_Sub1_2.method8871();
			@Pc(30) Class452 local30 = new Class452();
			@Pc(34) Class452 local34 = new Class452();
			local30.method29292(0.0F, 1.0F, 0.0F, 3.1415927F - (float) ((double) local7 * 3.141592653589793D * 2.0D / 16384.0D));
			@Pc(57) Class447 local57 = new Class447(1.0F, 0.0F, 0.0F);
			local57.method29198(local30);
			local57.method29144();
			local34.method29290(local57, (float) (2.0D * 3.141592653589793D * (double) local3) / 16384.0F);
			local30.method29330(local34);
			local26.aClass452_1.method29286(local30);
		}
		client.aBoolean612 = true;
	}

	@OriginalMember(owner = "client!aht", name = "ss", descriptor = "(Lclient!yf;I)V", line = 7846)
	static final void method21240(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3879 * -488164841;
	}

	@OriginalMember(owner = "client!aht", name = "ag", descriptor = "(FFFI)F")
	abstract float method21241(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!aht", name = "al", descriptor = "(B)V")
	abstract void method21242();

	@OriginalMember(owner = "client!aht", name = "au", descriptor = "()V")
	abstract void method21243();

	@OriginalMember(owner = "client!aht", name = "ax", descriptor = "()V")
	abstract void method21244();

	@OriginalMember(owner = "client!aht", name = "ad", descriptor = "(Lclient!akv;I)V")
	abstract void method21245(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aht", name = "ac", descriptor = "(Lclient!akv;I)V")
	abstract void method21246(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aht", name = "ak", descriptor = "(Lclient!akv;II)V")
	abstract void method21247(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aht", name = "av", descriptor = "(FFF)F")
	abstract float method21248(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!aht", name = "at", descriptor = "(FFF)F")
	abstract float method21249(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!aht", name = "ar", descriptor = "(Lclient!akv;I)V")
	abstract void method21250(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1);
}
