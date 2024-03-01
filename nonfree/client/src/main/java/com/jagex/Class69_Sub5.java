package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajv")
public class Class69_Sub5 extends Class69 {

	@OriginalMember(owner = "client!ajv", name = "a", descriptor = "Lclient!hk;")
	Interface17 anInterface17_2;

	@OriginalMember(owner = "client!ajv", name = "l", descriptor = "Z")
	boolean aBoolean355;

	@OriginalMember(owner = "client!ajv", name = "g", descriptor = "Lclient!mh;")
	final Class320 aClass320_51 = new Class320();

	@OriginalMember(owner = "client!ajv", name = "h", descriptor = "Lclient!mh;")
	final Class320 aClass320_52 = new Class320(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ajv", name = "x", descriptor = "Lclient!mh;")
	final Class320 aClass320_53 = new Class320(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ajv", name = "s", descriptor = "Lclient!mh;")
	final Class320 aClass320_54 = new Class320();

	@OriginalMember(owner = "client!ajv", name = "<init>", descriptor = "(Lclient!ha;)V", line = 20)
	public Class69_Sub5(@OriginalArg(0) Class23 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ajv", name = "r", descriptor = "(Lclient!hk;Lclient!mh;ZI)V", line = 24)
	public void method14690(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) boolean arg2) {
		this.anInterface17_2 = arg0;
		this.aClass320_51.method25893(arg1);
		this.aBoolean355 = arg2;
		arg0.method16617();
	}

	@OriginalMember(owner = "client!ajv", name = "m", descriptor = "(Lclient!hk;Lclient!mh;Z)V", line = 24)
	public void method14692(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) boolean arg2) {
		this.anInterface17_2 = arg0;
		this.aClass320_51.method25893(arg1);
		this.aBoolean355 = arg2;
		arg0.method16617();
	}

	@OriginalMember(owner = "client!ajv", name = "d", descriptor = "(B)V", line = 31)
	public void method14689() {
		if (this.anInterface17_2 != null) {
			this.anInterface17_2 = this.aClass23_16.method5859().method29331(this.anInterface17_2.method16615(), this.anInterface17_2.method16622());
		}
	}

	@OriginalMember(owner = "client!ajv", name = "v", descriptor = "()V", line = 31)
	public void method14693() {
		if (this.anInterface17_2 != null) {
			this.anInterface17_2 = this.aClass23_16.method5859().method29331(this.anInterface17_2.method16615(), this.anInterface17_2.method16622());
		}
	}

	@OriginalMember(owner = "client!ajv", name = "t", descriptor = "()V", line = 31)
	public void method14694() {
		if (this.anInterface17_2 != null) {
			this.anInterface17_2 = this.aClass23_16.method5859().method29331(this.anInterface17_2.method16615(), this.anInterface17_2.method16622());
		}
	}

	@OriginalMember(owner = "client!ajv", name = "w", descriptor = "()V", line = 31)
	public void method14695() {
		if (this.anInterface17_2 != null) {
			this.anInterface17_2 = this.aClass23_16.method5859().method29331(this.anInterface17_2.method16615(), this.anInterface17_2.method16622());
		}
	}

	@OriginalMember(owner = "client!ajv", name = "o", descriptor = "()V", line = 31)
	public void method14696() {
		if (this.anInterface17_2 != null) {
			this.anInterface17_2 = this.aClass23_16.method5859().method29331(this.anInterface17_2.method16615(), this.anInterface17_2.method16622());
		}
	}

	@OriginalMember(owner = "client!ajv", name = "i", descriptor = "()V", line = 31)
	public void method14697() {
		if (this.anInterface17_2 != null) {
			this.anInterface17_2 = this.aClass23_16.method5859().method29331(this.anInterface17_2.method16615(), this.anInterface17_2.method16622());
		}
	}

	@OriginalMember(owner = "client!ajv", name = "p", descriptor = "(FB)V", line = 37)
	@Override
	public void method20202(@OriginalArg(0) float arg0) {
		if (this.anInterface17_2 != null) {
			this.aClass320_53.method25893(this.anInterface17_2.method16617().method11706());
			this.aClass23_16.method5800(false, arg0, this.aClass320_52, this.aClass23_16.method5838(), this.aClass320_53, this.aClass320_54);
		}
	}

	@OriginalMember(owner = "client!ajv", name = "s", descriptor = "(F)V", line = 37)
	@Override
	public void method20201(@OriginalArg(0) float arg0) {
		if (this.anInterface17_2 != null) {
			this.aClass320_53.method25893(this.anInterface17_2.method16617().method11706());
			this.aClass23_16.method5800(false, arg0, this.aClass320_52, this.aClass23_16.method5838(), this.aClass320_53, this.aClass320_54);
		}
	}

	@OriginalMember(owner = "client!ajv", name = "y", descriptor = "()Z", line = 43)
	@Override
	public boolean method20208() {
		return !Float.isNaN(this.aClass320_52.aFloat259);
	}

	@OriginalMember(owner = "client!ajv", name = "a", descriptor = "(I)Z", line = 43)
	@Override
	public boolean method20209() {
		return !Float.isNaN(this.aClass320_52.aFloat259);
	}

	@OriginalMember(owner = "client!ajv", name = "u", descriptor = "()Z", line = 43)
	@Override
	public boolean method20204() {
		return !Float.isNaN(this.aClass320_52.aFloat259);
	}

	@OriginalMember(owner = "client!ajv", name = "h", descriptor = "(Lclient!gu;Lclient!mu;IIFI)V", line = 47)
	@Override
	public void method20206(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class320 local5 = Class320.method25906(this.aClass23_16.method5908());
		local5.aFloat259 -= arg2;
		local5.aFloat261 -= arg3;
		local5.aFloat260 *= -1.0F;
		@Pc(29) Class320 local29 = this.method20203();
		local29.aFloat259 -= arg2;
		local29.aFloat261 -= arg3;
		local29.aFloat260 *= -1.0F;
		arg1.method26196((double) local5.aFloat259, (double) local5.aFloat260, (double) local5.aFloat261, (double) local29.aFloat259, (double) local29.aFloat260, (double) local29.aFloat261, 0.0F, 1.0F, 0.0F);
		local5.method25874();
		local29.method25874();
	}

	@OriginalMember(owner = "client!ajv", name = "b", descriptor = "(Lclient!gu;Lclient!mu;IIF)V", line = 47)
	@Override
	public void method20210(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class320 local5 = Class320.method25906(this.aClass23_16.method5908());
		local5.aFloat259 -= arg2;
		local5.aFloat261 -= arg3;
		local5.aFloat260 *= -1.0F;
		@Pc(29) Class320 local29 = this.method20203();
		local29.aFloat259 -= arg2;
		local29.aFloat261 -= arg3;
		local29.aFloat260 *= -1.0F;
		arg1.method26196((double) local5.aFloat259, (double) local5.aFloat260, (double) local5.aFloat261, (double) local29.aFloat259, (double) local29.aFloat260, (double) local29.aFloat261, 0.0F, 1.0F, 0.0F);
		local5.method25874();
		local29.method25874();
	}

	@OriginalMember(owner = "client!ajv", name = "g", descriptor = "(S)Lclient!mh;", line = 61)
	@Override
	public Class320 method20203() {
		@Pc(3) Class320 local3 = Class320.method25906(this.aClass320_52);
		@Pc(7) Class320 local7 = Class320.method25906(this.aClass320_51);
		if (this.aBoolean355) {
			local7.method25889(this.anInterface17_2.method16618());
		}
		local3.method25872(local7);
		local7.method25874();
		return local3;
	}

	@OriginalMember(owner = "client!ajv", name = "e", descriptor = "()Lclient!mh;", line = 61)
	@Override
	public Class320 method20215() {
		@Pc(3) Class320 local3 = Class320.method25906(this.aClass320_52);
		@Pc(7) Class320 local7 = Class320.method25906(this.aClass320_51);
		if (this.aBoolean355) {
			local7.method25889(this.anInterface17_2.method16618());
		}
		local3.method25872(local7);
		local7.method25874();
		return local3;
	}

	@OriginalMember(owner = "client!ajv", name = "l", descriptor = "(I)Lclient!mh;", line = 70)
	@Override
	public Class320 method20205() {
		@Pc(3) Class320 local3 = Class320.method25906(this.aClass320_53);
		@Pc(7) Class320 local7 = Class320.method25906(this.aClass320_51);
		if (this.aBoolean355) {
			local7.method25889(this.anInterface17_2.method16618());
		}
		local3.method25872(local7);
		local7.method25874();
		return local3;
	}

	@OriginalMember(owner = "client!ajv", name = "c", descriptor = "()Lclient!mh;", line = 70)
	@Override
	public Class320 method20211() {
		@Pc(3) Class320 local3 = Class320.method25906(this.aClass320_53);
		@Pc(7) Class320 local7 = Class320.method25906(this.aClass320_51);
		if (this.aBoolean355) {
			local7.method25889(this.anInterface17_2.method16618());
		}
		local3.method25872(local7);
		local7.method25874();
		return local3;
	}

	@OriginalMember(owner = "client!ajv", name = "z", descriptor = "()Lclient!mh;", line = 70)
	@Override
	public Class320 method20212() {
		@Pc(3) Class320 local3 = Class320.method25906(this.aClass320_53);
		@Pc(7) Class320 local7 = Class320.method25906(this.aClass320_51);
		if (this.aBoolean355) {
			local7.method25889(this.anInterface17_2.method16618());
		}
		local3.method25872(local7);
		local7.method25874();
		return local3;
	}

	@OriginalMember(owner = "client!ajv", name = "at", descriptor = "()Lclient!mh;", line = 79)
	public Class320 method14688() {
		return this.aClass320_52;
	}

	@OriginalMember(owner = "client!ajv", name = "q", descriptor = "(I)Lclient!mh;", line = 79)
	public Class320 method14691() {
		return this.aClass320_52;
	}

	@OriginalMember(owner = "client!ajv", name = "f", descriptor = "()Lclient!mh;", line = 79)
	public Class320 method14698() {
		return this.aClass320_52;
	}

	@OriginalMember(owner = "client!ajv", name = "k", descriptor = "()Lclient!mh;", line = 79)
	public Class320 method14699() {
		return this.aClass320_52;
	}

	@OriginalMember(owner = "client!ajv", name = "af", descriptor = "()Lclient!mh;", line = 79)
	public Class320 method14700() {
		return this.aClass320_52;
	}

	@OriginalMember(owner = "client!ajv", name = "x", descriptor = "(Lclient!ahb;B)V", line = 83)
	@Override
	public void method20207(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(5) Class223 local5 = Class566.method32919(arg0.method20269());
		@Pc(9) int local9 = arg0.method20271();
		this.anInterface17_2 = this.aClass23_16.method5859().method29331(local5, local9);
		this.aClass320_51.method25866(arg0);
		if (arg0.method20269() == 1) {
			this.aBoolean355 = true;
		} else {
			this.aBoolean355 = false;
		}
	}

	@OriginalMember(owner = "client!ajv", name = "j", descriptor = "(Lclient!ahb;)V", line = 83)
	@Override
	public void method20213(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(5) Class223 local5 = Class566.method32919(arg0.method20269());
		@Pc(9) int local9 = arg0.method20271();
		this.anInterface17_2 = this.aClass23_16.method5859().method29331(local5, local9);
		this.aClass320_51.method25866(arg0);
		if (arg0.method20269() == 1) {
			this.aBoolean355 = true;
		} else {
			this.aBoolean355 = false;
		}
	}

	@OriginalMember(owner = "client!ajv", name = "n", descriptor = "(Lclient!ahb;)V", line = 83)
	@Override
	public void method20214(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(5) Class223 local5 = Class566.method32919(arg0.method20269());
		@Pc(9) int local9 = arg0.method20271();
		this.anInterface17_2 = this.aClass23_16.method5859().method29331(local5, local9);
		this.aClass320_51.method25866(arg0);
		if (arg0.method20269() == 1) {
			this.aBoolean355 = true;
		} else {
			this.aBoolean355 = false;
		}
	}
}
