package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public class Class327 {

	@OriginalMember(owner = "client!mp", name = "p", descriptor = "[Lclient!mi;")
	Class321[] aClass321Array1 = new Class321[1];

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "[F")
	float[] aFloatArray105 = new float[2];

	@OriginalMember(owner = "client!mp", name = "y", descriptor = "(Lclient!mh;Lclient!mh;F)V", line = 10)
	void method26018(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) float arg2) {
		@Pc(6) Class321[] local6 = new Class321[this.aClass321Array1.length + 1];
		System.arraycopy(this.aClass321Array1, 0, local6, 0, this.aClass321Array1.length);
		@Pc(19) Class321 local19 = new Class321();
		@Pc(28) Class321 local28 = this.aClass321Array1[this.aClass321Array1.length - 1];
		local19.method25968(0, local28.method25971(3));
		@Pc(42) Class320 local42 = Class320.method25928(local28.method25971(3), local28.method25971(2));
		local19.method25968(1, Class320.method25903(local28.method25971(3), local42));
		local19.method25968(3, arg0);
		local19.method25968(2, arg1);
		local6[local6.length - 1] = local19;
		this.aClass321Array1 = local6;
		@Pc(75) float[] local75 = new float[this.aFloatArray105.length + 1];
		System.arraycopy(this.aFloatArray105, 0, local75, 0, this.aFloatArray105.length);
		local75[local75.length - 1] = arg2;
		this.aFloatArray105 = local75;
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(Lclient!mh;Lclient!mh;F)V", line = 10)
	void method26019(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) float arg2) {
		@Pc(6) Class321[] local6 = new Class321[this.aClass321Array1.length + 1];
		System.arraycopy(this.aClass321Array1, 0, local6, 0, this.aClass321Array1.length);
		@Pc(19) Class321 local19 = new Class321();
		@Pc(28) Class321 local28 = this.aClass321Array1[this.aClass321Array1.length - 1];
		local19.method25968(0, local28.method25971(3));
		@Pc(42) Class320 local42 = Class320.method25928(local28.method25971(3), local28.method25971(2));
		local19.method25968(1, Class320.method25903(local28.method25971(3), local42));
		local19.method25968(3, arg0);
		local19.method25968(2, arg1);
		local6[local6.length - 1] = local19;
		this.aClass321Array1 = local6;
		@Pc(75) float[] local75 = new float[this.aFloatArray105.length + 1];
		System.arraycopy(this.aFloatArray105, 0, local75, 0, this.aFloatArray105.length);
		local75[local75.length - 1] = arg2;
		this.aFloatArray105 = local75;
	}

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(Lclient!mh;Lclient!mh;F)V", line = 10)
	void method26020(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) float arg2) {
		@Pc(6) Class321[] local6 = new Class321[this.aClass321Array1.length + 1];
		System.arraycopy(this.aClass321Array1, 0, local6, 0, this.aClass321Array1.length);
		@Pc(19) Class321 local19 = new Class321();
		@Pc(28) Class321 local28 = this.aClass321Array1[this.aClass321Array1.length - 1];
		local19.method25968(0, local28.method25971(3));
		@Pc(42) Class320 local42 = Class320.method25928(local28.method25971(3), local28.method25971(2));
		local19.method25968(1, Class320.method25903(local28.method25971(3), local42));
		local19.method25968(3, arg0);
		local19.method25968(2, arg1);
		local6[local6.length - 1] = local19;
		this.aClass321Array1 = local6;
		@Pc(75) float[] local75 = new float[this.aFloatArray105.length + 1];
		System.arraycopy(this.aFloatArray105, 0, local75, 0, this.aFloatArray105.length);
		local75[local75.length - 1] = arg2;
		this.aFloatArray105 = local75;
	}

	@OriginalMember(owner = "client!mp", name = "z", descriptor = "(Lclient!mh;Lclient!mh;F)V", line = 10)
	void method26021(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) float arg2) {
		@Pc(6) Class321[] local6 = new Class321[this.aClass321Array1.length + 1];
		System.arraycopy(this.aClass321Array1, 0, local6, 0, this.aClass321Array1.length);
		@Pc(19) Class321 local19 = new Class321();
		@Pc(28) Class321 local28 = this.aClass321Array1[this.aClass321Array1.length - 1];
		local19.method25968(0, local28.method25971(3));
		@Pc(42) Class320 local42 = Class320.method25928(local28.method25971(3), local28.method25971(2));
		local19.method25968(1, Class320.method25903(local28.method25971(3), local42));
		local19.method25968(3, arg0);
		local19.method25968(2, arg1);
		local6[local6.length - 1] = local19;
		this.aClass321Array1 = local6;
		@Pc(75) float[] local75 = new float[this.aFloatArray105.length + 1];
		System.arraycopy(this.aFloatArray105, 0, local75, 0, this.aFloatArray105.length);
		local75[local75.length - 1] = arg2;
		this.aFloatArray105 = local75;
	}

	@OriginalMember(owner = "client!mp", name = "p", descriptor = "(Lclient!mh;Lclient!mh;F)V", line = 10)
	void method26027(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) float arg2) {
		@Pc(6) Class321[] local6 = new Class321[this.aClass321Array1.length + 1];
		System.arraycopy(this.aClass321Array1, 0, local6, 0, this.aClass321Array1.length);
		@Pc(19) Class321 local19 = new Class321();
		@Pc(28) Class321 local28 = this.aClass321Array1[this.aClass321Array1.length - 1];
		local19.method25968(0, local28.method25971(3));
		@Pc(42) Class320 local42 = Class320.method25928(local28.method25971(3), local28.method25971(2));
		local19.method25968(1, Class320.method25903(local28.method25971(3), local42));
		local19.method25968(3, arg0);
		local19.method25968(2, arg1);
		local6[local6.length - 1] = local19;
		this.aClass321Array1 = local6;
		@Pc(75) float[] local75 = new float[this.aFloatArray105.length + 1];
		System.arraycopy(this.aFloatArray105, 0, local75, 0, this.aFloatArray105.length);
		local75[local75.length - 1] = arg2;
		this.aFloatArray105 = local75;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "()I", line = 28)
	public int method26011() {
		return this.aClass321Array1.length;
	}

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "()I", line = 28)
	public int method26022() {
		return this.aClass321Array1.length;
	}

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "()F", line = 32)
	public float method26017() {
		@Pc(1) float local1 = 0.0F;
		for (@Pc(3) int local3 = 0; local3 < this.aClass321Array1.length; local3++) {
			local1 += this.aClass321Array1[local3].method25967();
		}
		return local1;
	}

	@OriginalMember(owner = "client!mp", name = "n", descriptor = "()F", line = 32)
	public float method26024() {
		@Pc(1) float local1 = 0.0F;
		for (@Pc(3) int local3 = 0; local3 < this.aClass321Array1.length; local3++) {
			local1 += this.aClass321Array1[local3].method25967();
		}
		return local1;
	}

	@OriginalMember(owner = "client!mp", name = "r", descriptor = "()F", line = 32)
	public float method26025() {
		@Pc(1) float local1 = 0.0F;
		for (@Pc(3) int local3 = 0; local3 < this.aClass321Array1.length; local3++) {
			local1 += this.aClass321Array1[local3].method25967();
		}
		return local1;
	}

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "()F", line = 32)
	public float method26029() {
		@Pc(1) float local1 = 0.0F;
		for (@Pc(3) int local3 = 0; local3 < this.aClass321Array1.length; local3++) {
			local1 += this.aClass321Array1[local3].method25967();
		}
		return local1;
	}

	@OriginalMember(owner = "client!mp", name = "v", descriptor = "(F)[D", line = 40)
	public double[] method26010(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass321Array1.length; local5++) {
			local3 += this.aClass321Array1[local5].method25967();
			if (arg0 < local3) {
				@Pc(31) float local31 = this.aClass321Array1[local5].method25972(arg0 - local1);
				return this.aClass321Array1[local5].method25970(local31);
			}
			local1 = local3;
		}
		return this.aClass321Array1[this.aClass321Array1.length - 1].method25970(1.0F);
	}

	@OriginalMember(owner = "client!mp", name = "w", descriptor = "(F)[D", line = 40)
	public double[] method26012(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass321Array1.length; local5++) {
			local3 += this.aClass321Array1[local5].method25967();
			if (arg0 < local3) {
				@Pc(31) float local31 = this.aClass321Array1[local5].method25972(arg0 - local1);
				return this.aClass321Array1[local5].method25970(local31);
			}
			local1 = local3;
		}
		return this.aClass321Array1[this.aClass321Array1.length - 1].method25970(1.0F);
	}

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "(F)[D", line = 40)
	public double[] method26013(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass321Array1.length; local5++) {
			local3 += this.aClass321Array1[local5].method25967();
			if (arg0 < local3) {
				@Pc(31) float local31 = this.aClass321Array1[local5].method25972(arg0 - local1);
				return this.aClass321Array1[local5].method25970(local31);
			}
			local1 = local3;
		}
		return this.aClass321Array1[this.aClass321Array1.length - 1].method25970(1.0F);
	}

	@OriginalMember(owner = "client!mp", name = "t", descriptor = "(F)[D", line = 40)
	public double[] method26014(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass321Array1.length; local5++) {
			local3 += this.aClass321Array1[local5].method25967();
			if (arg0 < local3) {
				@Pc(31) float local31 = this.aClass321Array1[local5].method25972(arg0 - local1);
				return this.aClass321Array1[local5].method25970(local31);
			}
			local1 = local3;
		}
		return this.aClass321Array1[this.aClass321Array1.length - 1].method25970(1.0F);
	}

	@OriginalMember(owner = "client!mp", name = "q", descriptor = "(F)[D", line = 40)
	public double[] method26015(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass321Array1.length; local5++) {
			local3 += this.aClass321Array1[local5].method25967();
			if (arg0 < local3) {
				@Pc(31) float local31 = this.aClass321Array1[local5].method25972(arg0 - local1);
				return this.aClass321Array1[local5].method25970(local31);
			}
			local1 = local3;
		}
		return this.aClass321Array1[this.aClass321Array1.length - 1].method25970(1.0F);
	}

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "(F)[D", line = 40)
	public double[] method26028(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass321Array1.length; local5++) {
			local3 += this.aClass321Array1[local5].method25967();
			if (arg0 < local3) {
				@Pc(31) float local31 = this.aClass321Array1[local5].method25972(arg0 - local1);
				return this.aClass321Array1[local5].method25970(local31);
			}
			local1 = local3;
		}
		return this.aClass321Array1[this.aClass321Array1.length - 1].method25970(1.0F);
	}

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "(F)[D", line = 40)
	public double[] method26033(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass321Array1.length; local5++) {
			local3 += this.aClass321Array1[local5].method25967();
			if (arg0 < local3) {
				@Pc(31) float local31 = this.aClass321Array1[local5].method25972(arg0 - local1);
				return this.aClass321Array1[local5].method25970(local31);
			}
			local1 = local3;
		}
		return this.aClass321Array1[this.aClass321Array1.length - 1].method25970(1.0F);
	}

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "(F)F", line = 54)
	public float method26035(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = 0.0F;
		@Pc(3) float local3 = 0.0F;
		for (@Pc(5) int local5 = 0; local5 < this.aClass321Array1.length; local5++) {
			local3 += this.aClass321Array1[local5].method25967();
			if (arg0 < local3) {
				return this.aClass321Array1[local5].method25972(arg0 - local1) + (float) local5;
			}
			local1 = local3;
		}
		return (float) this.aClass321Array1.length;
	}

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "(F)[D", line = 65)
	public double[] method26026(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		return local2 < this.aClass321Array1.length ? this.aClass321Array1[local2].method25970(arg0 - (float) local2) : this.aClass321Array1[this.aClass321Array1.length - 1].method25970(1.0F);
	}

	@OriginalMember(owner = "client!mp", name = "x", descriptor = "(F)[D", line = 65)
	public double[] method26030(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		return local2 < this.aClass321Array1.length ? this.aClass321Array1[local2].method25970(arg0 - (float) local2) : this.aClass321Array1[this.aClass321Array1.length - 1].method25970(1.0F);
	}

	@OriginalMember(owner = "client!mp", name = "o", descriptor = "(F)[D", line = 65)
	public double[] method26032(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		return local2 < this.aClass321Array1.length ? this.aClass321Array1[local2].method25970(arg0 - (float) local2) : this.aClass321Array1[this.aClass321Array1.length - 1].method25970(1.0F);
	}

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "(F)[D", line = 65)
	public double[] method26034(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		return local2 < this.aClass321Array1.length ? this.aClass321Array1[local2].method25970(arg0 - (float) local2) : this.aClass321Array1[this.aClass321Array1.length - 1].method25970(1.0F);
	}

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "(F)[D", line = 65)
	public double[] method26036(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		return local2 < this.aClass321Array1.length ? this.aClass321Array1[local2].method25970(arg0 - (float) local2) : this.aClass321Array1[this.aClass321Array1.length - 1].method25970(1.0F);
	}

	@OriginalMember(owner = "client!mp", name = "s", descriptor = "(F)F", line = 71)
	public float method26016(@OriginalArg(0) float arg0) {
		return this.method26031(this.method26035(arg0));
	}

	@OriginalMember(owner = "client!mp", name = "at", descriptor = "(F)F", line = 71)
	public float method26023(@OriginalArg(0) float arg0) {
		return this.method26031(this.method26035(arg0));
	}

	@OriginalMember(owner = "client!mp", name = "af", descriptor = "(F)F", line = 71)
	public float method26037(@OriginalArg(0) float arg0) {
		return this.method26031(this.method26035(arg0));
	}

	@OriginalMember(owner = "client!mp", name = "u", descriptor = "(F)F", line = 75)
	public float method26031(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		if (local2 + 1 < this.aFloatArray105.length) {
			@Pc(14) float local14 = this.aFloatArray105[local2];
			@Pc(21) float local21 = this.aFloatArray105[local2 + 1];
			@Pc(26) float local26 = arg0 - (float) local2;
			return (1.0F - local26) * local14 + local26 * local21;
		} else {
			return this.aFloatArray105[this.aFloatArray105.length - 1];
		}
	}

	@OriginalMember(owner = "client!mp", name = "ak", descriptor = "(F)F", line = 75)
	public float method26038(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		if (local2 + 1 < this.aFloatArray105.length) {
			@Pc(14) float local14 = this.aFloatArray105[local2];
			@Pc(21) float local21 = this.aFloatArray105[local2 + 1];
			@Pc(26) float local26 = arg0 - (float) local2;
			return (1.0F - local26) * local14 + local26 * local21;
		} else {
			return this.aFloatArray105[this.aFloatArray105.length - 1];
		}
	}

	@OriginalMember(owner = "client!mp", name = "aa", descriptor = "(F)F", line = 75)
	public float method26039(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		if (local2 + 1 < this.aFloatArray105.length) {
			@Pc(14) float local14 = this.aFloatArray105[local2];
			@Pc(21) float local21 = this.aFloatArray105[local2 + 1];
			@Pc(26) float local26 = arg0 - (float) local2;
			return (1.0F - local26) * local14 + local26 * local21;
		} else {
			return this.aFloatArray105[this.aFloatArray105.length - 1];
		}
	}

	@OriginalMember(owner = "client!mp", name = "ah", descriptor = "(F)F", line = 75)
	public float method26040(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = (int) arg0;
		if (local2 + 1 < this.aFloatArray105.length) {
			@Pc(14) float local14 = this.aFloatArray105[local2];
			@Pc(21) float local21 = this.aFloatArray105[local2 + 1];
			@Pc(26) float local26 = arg0 - (float) local2;
			return (1.0F - local26) * local14 + local26 * local21;
		} else {
			return this.aFloatArray105[this.aFloatArray105.length - 1];
		}
	}

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 85)
	public Class327(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(13) int local13 = arg0.method20334();
		this.aClass321Array1[0] = new Class321();
		this.aClass321Array1[0].method25968(0, Class320.method25895(arg0));
		this.aClass321Array1[0].method25968(1, Class320.method25895(arg0));
		this.aFloatArray105[0] = arg0.method20448();
		@Pc(46) Class320 local46 = Class320.method25895(arg0);
		@Pc(49) Class320 local49 = Class320.method25895(arg0);
		@Pc(53) Class320 local53 = Class320.method25928(local46, local49);
		local49.method25874();
		local53.method25872(local46);
		this.aClass321Array1[0].method25968(3, local46);
		this.aClass321Array1[0].method25968(2, local53);
		this.aFloatArray105[1] = arg0.method20448();
		for (@Pc(83) int local83 = 2; local83 < local13; local83++) {
			@Pc(89) Class320 local89 = Class320.method25895(arg0);
			@Pc(92) Class320 local92 = Class320.method25895(arg0);
			@Pc(96) Class320 local96 = Class320.method25928(local89, local92);
			local92.method25874();
			local96.method25872(local89);
			this.method26027(local89, local96, arg0.method20448());
		}
	}
}
