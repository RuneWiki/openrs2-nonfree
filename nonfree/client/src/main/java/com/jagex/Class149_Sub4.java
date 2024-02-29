package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ank")
public class Class149_Sub4 extends Class149 {

	@OriginalMember(owner = "client!ank", name = "g", descriptor = "I")
	public static int anInt2368;

	@OriginalMember(owner = "client!ank", name = "l", descriptor = "Z")
	boolean aBoolean367;

	@OriginalMember(owner = "client!ank", name = "c", descriptor = "Lclient!ir;")
	Interface30 anInterface30_2;

	@OriginalMember(owner = "client!ank", name = "v", descriptor = "Lclient!oo;")
	final Class447 aClass447_52 = new Class447();

	@OriginalMember(owner = "client!ank", name = "y", descriptor = "Lclient!oo;")
	final Class447 aClass447_53 = new Class447(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ank", name = "w", descriptor = "Lclient!oo;")
	final Class447 aClass447_51 = new Class447(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ank", name = "t", descriptor = "Lclient!oo;")
	final Class447 aClass447_54 = new Class447();

	@OriginalMember(owner = "client!ank", name = "<init>", descriptor = "(Lclient!im;)V", line = 20)
	public Class149_Sub4(@OriginalArg(0) Class107 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ank", name = "u", descriptor = "(Lclient!ir;Lclient!oo;ZB)V", line = 24)
	public void method16841(@OriginalArg(0) Interface30 arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) boolean arg2) {
		this.anInterface30_2 = arg0;
		this.aClass447_52.method29136(arg1);
		this.aBoolean367 = arg2;
		arg0.method21051();
	}

	@OriginalMember(owner = "client!ank", name = "o", descriptor = "(Lclient!ir;Lclient!oo;Z)V", line = 24)
	public void method16842(@OriginalArg(0) Interface30 arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) boolean arg2) {
		this.anInterface30_2 = arg0;
		this.aClass447_52.method29136(arg1);
		this.aBoolean367 = arg2;
		arg0.method21051();
	}

	@OriginalMember(owner = "client!ank", name = "e", descriptor = "(I)V", line = 31)
	public void method16843() {
		if (this.anInterface30_2 != null) {
			this.anInterface30_2 = this.aClass107_16.method8877().method29827(this.anInterface30_2.method21053(), this.anInterface30_2.method21050());
		}
	}

	@OriginalMember(owner = "client!ank", name = "b", descriptor = "()V", line = 31)
	public void method16844() {
		if (this.anInterface30_2 != null) {
			this.anInterface30_2 = this.aClass107_16.method8877().method29827(this.anInterface30_2.method21053(), this.anInterface30_2.method21050());
		}
	}

	@OriginalMember(owner = "client!ank", name = "p", descriptor = "(FI)V", line = 37)
	@Override
	public void method23156(@OriginalArg(0) float arg0) {
		if (this.anInterface30_2 != null) {
			this.aClass447_51.method29136(this.anInterface30_2.method21051().method14453());
			this.aClass107_16.method8780(false, arg0, this.aClass447_53, this.aClass107_16.method8902(), this.aClass447_51, this.aClass447_54);
		}
	}

	@OriginalMember(owner = "client!ank", name = "q", descriptor = "(F)V", line = 37)
	@Override
	public void method23155(@OriginalArg(0) float arg0) {
		if (this.anInterface30_2 != null) {
			this.aClass447_51.method29136(this.anInterface30_2.method21051().method14453());
			this.aClass107_16.method8780(false, arg0, this.aClass447_53, this.aClass107_16.method8902(), this.aClass447_51, this.aClass447_54);
		}
	}

	@OriginalMember(owner = "client!ank", name = "t", descriptor = "(F)V", line = 37)
	@Override
	public void method23159(@OriginalArg(0) float arg0) {
		if (this.anInterface30_2 != null) {
			this.aClass447_51.method29136(this.anInterface30_2.method21051().method14453());
			this.aClass107_16.method8780(false, arg0, this.aClass447_53, this.aClass107_16.method8902(), this.aClass447_51, this.aClass447_54);
		}
	}

	@OriginalMember(owner = "client!ank", name = "x", descriptor = "(F)V", line = 37)
	@Override
	public void method23161(@OriginalArg(0) float arg0) {
		if (this.anInterface30_2 != null) {
			this.aClass447_51.method29136(this.anInterface30_2.method21051().method14453());
			this.aClass107_16.method8780(false, arg0, this.aClass447_53, this.aClass107_16.method8902(), this.aClass447_51, this.aClass447_54);
		}
	}

	@OriginalMember(owner = "client!ank", name = "c", descriptor = "(B)Z", line = 43)
	@Override
	public boolean method23154() {
		return !Float.isNaN(this.aClass447_53.aFloat277);
	}

	@OriginalMember(owner = "client!ank", name = "d", descriptor = "()Z", line = 43)
	@Override
	public boolean method23162() {
		return !Float.isNaN(this.aClass447_53.aFloat277);
	}

	@OriginalMember(owner = "client!ank", name = "y", descriptor = "(Lclient!ia;Lclient!ow;IIFI)V", line = 47)
	@Override
	public void method23157(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class447 local5 = Class447.method29124(this.aClass107_16.method8883());
		local5.aFloat277 -= arg2;
		local5.aFloat278 -= arg3;
		local5.aFloat276 *= -1.0F;
		@Pc(29) Class447 local29 = this.method23153();
		local29.aFloat277 -= arg2;
		local29.aFloat278 -= arg3;
		local29.aFloat276 *= -1.0F;
		arg1.method29396((double) local5.aFloat277, (double) local5.aFloat276, (double) local5.aFloat278, (double) local29.aFloat277, (double) local29.aFloat276, (double) local29.aFloat278, 0.0F, 1.0F, 0.0F);
		local5.method29130();
		local29.method29130();
	}

	@OriginalMember(owner = "client!ank", name = "s", descriptor = "(Lclient!ia;Lclient!ow;IIF)V", line = 47)
	@Override
	public void method23163(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class447 local5 = Class447.method29124(this.aClass107_16.method8883());
		local5.aFloat277 -= arg2;
		local5.aFloat278 -= arg3;
		local5.aFloat276 *= -1.0F;
		@Pc(29) Class447 local29 = this.method23153();
		local29.aFloat277 -= arg2;
		local29.aFloat278 -= arg3;
		local29.aFloat276 *= -1.0F;
		arg1.method29396((double) local5.aFloat277, (double) local5.aFloat276, (double) local5.aFloat278, (double) local29.aFloat277, (double) local29.aFloat276, (double) local29.aFloat278, 0.0F, 1.0F, 0.0F);
		local5.method29130();
		local29.method29130();
	}

	@OriginalMember(owner = "client!ank", name = "v", descriptor = "(I)Lclient!oo;", line = 61)
	@Override
	public Class447 method23153() {
		@Pc(3) Class447 local3 = Class447.method29124(this.aClass447_53);
		@Pc(7) Class447 local7 = Class447.method29124(this.aClass447_52);
		if (this.aBoolean367) {
			local7.method29198(this.anInterface30_2.method21052());
		}
		local3.method29146(local7);
		local7.method29130();
		return local3;
	}

	@OriginalMember(owner = "client!ank", name = "g", descriptor = "()Lclient!oo;", line = 61)
	@Override
	public Class447 method23160() {
		@Pc(3) Class447 local3 = Class447.method29124(this.aClass447_53);
		@Pc(7) Class447 local7 = Class447.method29124(this.aClass447_52);
		if (this.aBoolean367) {
			local7.method29198(this.anInterface30_2.method21052());
		}
		local3.method29146(local7);
		local7.method29130();
		return local3;
	}

	@OriginalMember(owner = "client!ank", name = "z", descriptor = "()Lclient!oo;", line = 61)
	@Override
	public Class447 method23158() {
		@Pc(3) Class447 local3 = Class447.method29124(this.aClass447_53);
		@Pc(7) Class447 local7 = Class447.method29124(this.aClass447_52);
		if (this.aBoolean367) {
			local7.method29198(this.anInterface30_2.method21052());
		}
		local3.method29146(local7);
		local7.method29130();
		return local3;
	}

	@OriginalMember(owner = "client!ank", name = "r", descriptor = "()Lclient!oo;", line = 61)
	@Override
	public Class447 method23164() {
		@Pc(3) Class447 local3 = Class447.method29124(this.aClass447_53);
		@Pc(7) Class447 local7 = Class447.method29124(this.aClass447_52);
		if (this.aBoolean367) {
			local7.method29198(this.anInterface30_2.method21052());
		}
		local3.method29146(local7);
		local7.method29130();
		return local3;
	}

	@OriginalMember(owner = "client!ank", name = "l", descriptor = "(I)Lclient!oo;", line = 70)
	@Override
	public Class447 method23165() {
		@Pc(3) Class447 local3 = Class447.method29124(this.aClass447_51);
		@Pc(7) Class447 local7 = Class447.method29124(this.aClass447_52);
		if (this.aBoolean367) {
			local7.method29198(this.anInterface30_2.method21052());
		}
		local3.method29146(local7);
		local7.method29130();
		return local3;
	}

	@OriginalMember(owner = "client!ank", name = "j", descriptor = "()Lclient!oo;", line = 70)
	@Override
	public Class447 method23166() {
		@Pc(3) Class447 local3 = Class447.method29124(this.aClass447_51);
		@Pc(7) Class447 local7 = Class447.method29124(this.aClass447_52);
		if (this.aBoolean367) {
			local7.method29198(this.anInterface30_2.method21052());
		}
		local3.method29146(local7);
		local7.method29130();
		return local3;
	}

	@OriginalMember(owner = "client!ank", name = "i", descriptor = "()Lclient!oo;", line = 70)
	@Override
	public Class447 method23167() {
		@Pc(3) Class447 local3 = Class447.method29124(this.aClass447_51);
		@Pc(7) Class447 local7 = Class447.method29124(this.aClass447_52);
		if (this.aBoolean367) {
			local7.method29198(this.anInterface30_2.method21052());
		}
		local3.method29146(local7);
		local7.method29130();
		return local3;
	}

	@OriginalMember(owner = "client!ank", name = "n", descriptor = "()Lclient!oo;", line = 79)
	public Class447 method16845() {
		return this.aClass447_53;
	}

	@OriginalMember(owner = "client!ank", name = "f", descriptor = "(B)Lclient!oo;", line = 79)
	public Class447 method16846() {
		return this.aClass447_53;
	}

	@OriginalMember(owner = "client!ank", name = "a", descriptor = "()Lclient!oo;", line = 79)
	public Class447 method16847() {
		return this.aClass447_53;
	}

	@OriginalMember(owner = "client!ank", name = "w", descriptor = "(Lclient!akv;I)V", line = 83)
	@Override
	public void method23152(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(5) Class324 local5 = Class536.method30822(arg0.method22478());
		@Pc(9) int local9 = arg0.method22483();
		this.anInterface30_2 = this.aClass107_16.method8877().method29827(local5, local9);
		this.aClass447_52.method29131(arg0);
		if (arg0.method22478() == 1) {
			this.aBoolean367 = true;
		} else {
			this.aBoolean367 = false;
		}
	}

	@OriginalMember(owner = "client!ank", name = "k", descriptor = "(Lclient!akv;)V", line = 83)
	@Override
	public void method23168(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(5) Class324 local5 = Class536.method30822(arg0.method22478());
		@Pc(9) int local9 = arg0.method22483();
		this.anInterface30_2 = this.aClass107_16.method8877().method29827(local5, local9);
		this.aClass447_52.method29131(arg0);
		if (arg0.method22478() == 1) {
			this.aBoolean367 = true;
		} else {
			this.aBoolean367 = false;
		}
	}

	@OriginalMember(owner = "client!ank", name = "abb", descriptor = "(Lclient!yf;B)V", line = 9331)
	static final void method16848(@OriginalArg(0) Class665 arg0) {
		if (Class574.aClass77_Sub25_2 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
			arg0.aClass77_Sub25_3 = Class574.aClass77_Sub25_2;
		}
	}

	@OriginalMember(owner = "client!ank", name = "ajc", descriptor = "(Lclient!yf;I)V", line = 11044)
	static final void method16849(@OriginalArg(0) Class665 arg0) {
		@Pc(3) int local3 = Class332.anInt4098 * 1964065355;
		@Pc(7) int local7 = Class268.anInt3833 * -844799891;
		@Pc(9) int local9 = -1;
		if (Class706.aBoolean868) {
			@Pc(14) Class7[] local14 = Class295.method27035();
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				@Pc(24) Class7 local24 = local14[local16];
				if (local24.anInt24 * -1991181227 == local3 && local7 == local24.anInt25 * -778390023) {
					local9 = local16;
					break;
				}
			}
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local9;
	}
}
