package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public class Class443 {

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "[Lclient!of;")
	Class439[] aClass439Array1 = new Class439[1];

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "[F")
	float[] aFloatArray110 = new float[2];

	@OriginalMember(owner = "client!oj", name = "x", descriptor = "(Lclient!oo;Lclient!oo;F)V", line = 10)
	void method29068(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) float arg2) {
		@Pc(6) Class439[] local6 = new Class439[this.aClass439Array1.length + 1];
		System.arraycopy(this.aClass439Array1, 0, local6, 0, this.aClass439Array1.length);
		@Pc(19) Class439 local19 = new Class439();
		@Pc(28) Class439 local28 = this.aClass439Array1[this.aClass439Array1.length - 1];
		local19.method28930(0, local28.method28934(3));
		@Pc(42) Class447 local42 = Class447.method29160(local28.method28934(3), local28.method28934(2));
		local19.method28930(1, Class447.method29154(local28.method28934(3), local42));
		local19.method28930(3, arg0);
		local19.method28930(2, arg1);
		local6[local6.length - 1] = local19;
		this.aClass439Array1 = local6;
		@Pc(75) float[] local75 = new float[this.aFloatArray110.length + 1];
		System.arraycopy(this.aFloatArray110, 0, local75, 0, this.aFloatArray110.length);
		local75[local75.length - 1] = arg2;
		this.aFloatArray110 = local75;
	}

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "(Lclient!oo;Lclient!oo;F)V", line = 10)
	void method29069(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) float arg2) {
		@Pc(6) Class439[] local6 = new Class439[this.aClass439Array1.length + 1];
		System.arraycopy(this.aClass439Array1, 0, local6, 0, this.aClass439Array1.length);
		@Pc(19) Class439 local19 = new Class439();
		@Pc(28) Class439 local28 = this.aClass439Array1[this.aClass439Array1.length - 1];
		local19.method28930(0, local28.method28934(3));
		@Pc(42) Class447 local42 = Class447.method29160(local28.method28934(3), local28.method28934(2));
		local19.method28930(1, Class447.method29154(local28.method28934(3), local42));
		local19.method28930(3, arg0);
		local19.method28930(2, arg1);
		local6[local6.length - 1] = local19;
		this.aClass439Array1 = local6;
		@Pc(75) float[] local75 = new float[this.aFloatArray110.length + 1];
		System.arraycopy(this.aFloatArray110, 0, local75, 0, this.aFloatArray110.length);
		local75[local75.length - 1] = arg2;
		this.aFloatArray110 = local75;
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "()I", line = 28)
	public int method29070() {
		return this.aClass439Array1.length;
	}

	@OriginalMember(owner = "client!oj", name = "r", descriptor = "()I", line = 28)
	public int method29071() {
		return this.aClass439Array1.length;
	}

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "()I", line = 28)
	public int method29072() {
		return this.aClass439Array1.length;
	}

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "()I", line = 28)
	public int method29073() {
		return this.aClass439Array1.length;
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "()I", line = 28)
	public int method29074() {
		return this.aClass439Array1.length;
	}

	@OriginalMember(owner = "client!oj", name = "v", descriptor = "()F", line = 32)
	public float method29075() {
		@Pc(1) float local1 = 0.0F;
		for (@Pc(3) int local3 = 0; local3 < this.aClass439Array1.length; local3++) {
			local1 += this.aClass439Array1[local3].method28939();
		}
		return local1;
	}

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "(F)[D", line = 40)
	public double[] method29076(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass439Array1.length; local5++) {
			local3 += this.aClass439Array1[local5].method28939();
			if (arg0 < local3) {
				@Pc(31) float local31 = this.aClass439Array1[local5].method28940(arg0 - local1);
				return this.aClass439Array1[local5].method28935(local31);
			}
			local1 = local3;
		}
		return this.aClass439Array1[this.aClass439Array1.length - 1].method28935(1.0F);
	}

	@OriginalMember(owner = "client!oj", name = "z", descriptor = "(F)[D", line = 40)
	public double[] method29077(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass439Array1.length; local5++) {
			local3 += this.aClass439Array1[local5].method28939();
			if (arg0 < local3) {
				@Pc(31) float local31 = this.aClass439Array1[local5].method28940(arg0 - local1);
				return this.aClass439Array1[local5].method28935(local31);
			}
			local1 = local3;
		}
		return this.aClass439Array1[this.aClass439Array1.length - 1].method28935(1.0F);
	}

	@OriginalMember(owner = "client!oj", name = "y", descriptor = "(F)F", line = 54)
	public float method29078(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass439Array1.length; local5++) {
			local3 += this.aClass439Array1[local5].method28939();
			if (arg0 < local3) {
				return this.aClass439Array1[local5].method28940(arg0 - local1) + (float) local5;
			}
			local1 = local3;
		}
		return (float) this.aClass439Array1.length;
	}

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "(F)F", line = 54)
	public float method29079(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass439Array1.length; local5++) {
			local3 += this.aClass439Array1[local5].method28939();
			if (arg0 < local3) {
				return this.aClass439Array1[local5].method28940(arg0 - local1) + (float) local5;
			}
			local1 = local3;
		}
		return (float) this.aClass439Array1.length;
	}

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "(F)F", line = 54)
	public float method29080(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass439Array1.length; local5++) {
			local3 += this.aClass439Array1[local5].method28939();
			if (arg0 < local3) {
				return this.aClass439Array1[local5].method28940(arg0 - local1) + (float) local5;
			}
			local1 = local3;
		}
		return (float) this.aClass439Array1.length;
	}

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "(F)[D", line = 65)
	public double[] method29081(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		return local2 < this.aClass439Array1.length ? this.aClass439Array1[local2].method28935(arg0 - (float) local2) : this.aClass439Array1[this.aClass439Array1.length - 1].method28935(1.0F);
	}

	@OriginalMember(owner = "client!oj", name = "w", descriptor = "(F)[D", line = 65)
	public double[] method29082(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		return local2 < this.aClass439Array1.length ? this.aClass439Array1[local2].method28935(arg0 - (float) local2) : this.aClass439Array1[this.aClass439Array1.length - 1].method28935(1.0F);
	}

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "(F)[D", line = 65)
	public double[] method29083(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		return local2 < this.aClass439Array1.length ? this.aClass439Array1[local2].method28935(arg0 - (float) local2) : this.aClass439Array1[this.aClass439Array1.length - 1].method28935(1.0F);
	}

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "(F)[D", line = 65)
	public double[] method29084(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		return local2 < this.aClass439Array1.length ? this.aClass439Array1[local2].method28935(arg0 - (float) local2) : this.aClass439Array1[this.aClass439Array1.length - 1].method28935(1.0F);
	}

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "(F)F", line = 71)
	public float method29085(@OriginalArg(0) float arg0) {
		return this.method29089(this.method29078(arg0));
	}

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "(F)F", line = 71)
	public float method29086(@OriginalArg(0) float arg0) {
		return this.method29089(this.method29078(arg0));
	}

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "(F)F", line = 71)
	public float method29087(@OriginalArg(0) float arg0) {
		return this.method29089(this.method29078(arg0));
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(F)F", line = 71)
	public float method29088(@OriginalArg(0) float arg0) {
		return this.method29089(this.method29078(arg0));
	}

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "(F)F", line = 75)
	public float method29089(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		if (local2 + 1 < this.aFloatArray110.length) {
			@Pc(14) float local14 = this.aFloatArray110[local2];
			@Pc(21) float local21 = this.aFloatArray110[local2 + 1];
			@Pc(26) float local26 = arg0 - (float) local2;
			return (1.0F - local26) * local14 + local26 * local21;
		} else {
			return this.aFloatArray110[this.aFloatArray110.length - 1];
		}
	}

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "(F)F", line = 75)
	public float method29090(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		if (local2 + 1 < this.aFloatArray110.length) {
			@Pc(14) float local14 = this.aFloatArray110[local2];
			@Pc(21) float local21 = this.aFloatArray110[local2 + 1];
			@Pc(26) float local26 = arg0 - (float) local2;
			return (1.0F - local26) * local14 + local26 * local21;
		} else {
			return this.aFloatArray110[this.aFloatArray110.length - 1];
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(F)F", line = 75)
	public float method29091(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		if (local2 + 1 < this.aFloatArray110.length) {
			@Pc(14) float local14 = this.aFloatArray110[local2];
			@Pc(21) float local21 = this.aFloatArray110[local2 + 1];
			@Pc(26) float local26 = arg0 - (float) local2;
			return (1.0F - local26) * local14 + local26 * local21;
		} else {
			return this.aFloatArray110[this.aFloatArray110.length - 1];
		}
	}

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "(F)F", line = 75)
	public float method29092(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		if (local2 + 1 < this.aFloatArray110.length) {
			@Pc(14) float local14 = this.aFloatArray110[local2];
			@Pc(21) float local21 = this.aFloatArray110[local2 + 1];
			@Pc(26) float local26 = arg0 - (float) local2;
			return (1.0F - local26) * local14 + local26 * local21;
		} else {
			return this.aFloatArray110[this.aFloatArray110.length - 1];
		}
	}

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "(F)F", line = 75)
	public float method29093(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		if (local2 + 1 < this.aFloatArray110.length) {
			@Pc(14) float local14 = this.aFloatArray110[local2];
			@Pc(21) float local21 = this.aFloatArray110[local2 + 1];
			@Pc(26) float local26 = arg0 - (float) local2;
			return (1.0F - local26) * local14 + local26 * local21;
		} else {
			return this.aFloatArray110[this.aFloatArray110.length - 1];
		}
	}

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!akv;)V", line = 85)
	public Class443(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(13) int local13 = arg0.method22537();
		this.aClass439Array1[0] = new Class439();
		this.aClass439Array1[0].method28930(0, Class447.method29127(arg0));
		this.aClass439Array1[0].method28930(1, Class447.method29127(arg0));
		this.aFloatArray110[0] = arg0.method22517();
		@Pc(46) Class447 local46 = Class447.method29127(arg0);
		@Pc(49) Class447 local49 = Class447.method29127(arg0);
		@Pc(53) Class447 local53 = Class447.method29160(local46, local49);
		local49.method29130();
		local53.method29146(local46);
		this.aClass439Array1[0].method28930(3, local46);
		this.aClass439Array1[0].method28930(2, local53);
		this.aFloatArray110[1] = arg0.method22517();
		for (@Pc(83) int local83 = 2; local83 < local13; local83++) {
			@Pc(89) Class447 local89 = Class447.method29127(arg0);
			@Pc(92) Class447 local92 = Class447.method29127(arg0);
			@Pc(96) Class447 local96 = Class447.method29160(local89, local92);
			local92.method29130();
			local96.method29146(local89);
			this.method29069(local89, local96, arg0.method22517());
		}
	}
}
