package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amg")
public class Class149_Sub1 extends Class149 {

	@OriginalMember(owner = "client!amg", name = "c", descriptor = "Lclient!oo;")
	final Class447 aClass447_48 = new Class447(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!amg", name = "v", descriptor = "Lclient!oo;")
	final Class447 aClass447_49 = new Class447(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!amg", name = "l", descriptor = "Lclient!oo;")
	final Class447 aClass447_50 = new Class447();

	@OriginalMember(owner = "client!amg", name = "<init>", descriptor = "(Lclient!im;)V", line = 16)
	public Class149_Sub1(@OriginalArg(0) Class107 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amg", name = "u", descriptor = "(Lclient!aks;I)V", line = 20)
	public void method15830(@OriginalArg(0) Class77_Sub36 arg0) {
		this.aClass447_49.aFloat277 = arg0.anInt1777 * 599803149;
		this.aClass447_49.aFloat276 = arg0.anInt1778 * -1203728391;
		this.aClass447_49.aFloat278 = arg0.anInt1779 * 33298755;
		if (Float.isNaN(this.aClass447_48.aFloat277)) {
			this.aClass447_48.method29136(this.aClass447_49);
			this.aClass447_50.method29137();
		}
	}

	@OriginalMember(owner = "client!amg", name = "f", descriptor = "(Lclient!aks;)V", line = 20)
	public void method15831(@OriginalArg(0) Class77_Sub36 arg0) {
		this.aClass447_49.aFloat277 = arg0.anInt1777 * 599803149;
		this.aClass447_49.aFloat276 = arg0.anInt1778 * -1203728391;
		this.aClass447_49.aFloat278 = arg0.anInt1779 * 33298755;
		if (Float.isNaN(this.aClass447_48.aFloat277)) {
			this.aClass447_48.method29136(this.aClass447_49);
			this.aClass447_50.method29137();
		}
	}

	@OriginalMember(owner = "client!amg", name = "e", descriptor = "(Lclient!aks;)V", line = 20)
	public void method15832(@OriginalArg(0) Class77_Sub36 arg0) {
		this.aClass447_49.aFloat277 = arg0.anInt1777 * 599803149;
		this.aClass447_49.aFloat276 = arg0.anInt1778 * -1203728391;
		this.aClass447_49.aFloat278 = arg0.anInt1779 * 33298755;
		if (Float.isNaN(this.aClass447_48.aFloat277)) {
			this.aClass447_48.method29136(this.aClass447_49);
			this.aClass447_50.method29137();
		}
	}

	@OriginalMember(owner = "client!amg", name = "p", descriptor = "(FI)V", line = 30)
	@Override
	public void method23156(@OriginalArg(0) float arg0) {
		this.aClass107_16.method8780(false, arg0, this.aClass447_48, this.aClass107_16.method8902(), this.aClass447_49, this.aClass447_50);
	}

	@OriginalMember(owner = "client!amg", name = "q", descriptor = "(F)V", line = 30)
	@Override
	public void method23155(@OriginalArg(0) float arg0) {
		this.aClass107_16.method8780(false, arg0, this.aClass447_48, this.aClass107_16.method8902(), this.aClass447_49, this.aClass447_50);
	}

	@OriginalMember(owner = "client!amg", name = "x", descriptor = "(F)V", line = 30)
	@Override
	public void method23161(@OriginalArg(0) float arg0) {
		this.aClass107_16.method8780(false, arg0, this.aClass447_48, this.aClass107_16.method8902(), this.aClass447_49, this.aClass447_50);
	}

	@OriginalMember(owner = "client!amg", name = "t", descriptor = "(F)V", line = 30)
	@Override
	public void method23159(@OriginalArg(0) float arg0) {
		this.aClass107_16.method8780(false, arg0, this.aClass447_48, this.aClass107_16.method8902(), this.aClass447_49, this.aClass447_50);
	}

	@OriginalMember(owner = "client!amg", name = "c", descriptor = "(B)Z", line = 34)
	@Override
	public boolean method23154() {
		return !Float.isNaN(this.aClass447_48.aFloat277);
	}

	@OriginalMember(owner = "client!amg", name = "d", descriptor = "()Z", line = 34)
	@Override
	public boolean method23162() {
		return !Float.isNaN(this.aClass447_48.aFloat277);
	}

	@OriginalMember(owner = "client!amg", name = "y", descriptor = "(Lclient!ia;Lclient!ow;IIFI)V", line = 38)
	@Override
	public void method23157(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class447 local5 = Class447.method29124(this.aClass107_16.method8883());
		local5.aFloat277 -= arg2;
		local5.aFloat278 -= arg3;
		local5.aFloat276 *= -1.0F;
		@Pc(29) Class447 local29 = Class447.method29124(this.aClass447_48);
		local29.aFloat277 -= arg2;
		local29.aFloat278 -= arg3;
		local29.aFloat276 *= -1.0F;
		arg1.method29396((double) local5.aFloat277, (double) local5.aFloat276, (double) local5.aFloat278, (double) local29.aFloat277, (double) local29.aFloat276, (double) local29.aFloat278, 0.0F, 1.0F, 0.0F);
		local5.method29130();
		local29.method29130();
	}

	@OriginalMember(owner = "client!amg", name = "s", descriptor = "(Lclient!ia;Lclient!ow;IIF)V", line = 38)
	@Override
	public void method23163(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class447 local5 = Class447.method29124(this.aClass107_16.method8883());
		local5.aFloat277 -= arg2;
		local5.aFloat278 -= arg3;
		local5.aFloat276 *= -1.0F;
		@Pc(29) Class447 local29 = Class447.method29124(this.aClass447_48);
		local29.aFloat277 -= arg2;
		local29.aFloat278 -= arg3;
		local29.aFloat276 *= -1.0F;
		arg1.method29396((double) local5.aFloat277, (double) local5.aFloat276, (double) local5.aFloat278, (double) local29.aFloat277, (double) local29.aFloat276, (double) local29.aFloat278, 0.0F, 1.0F, 0.0F);
		local5.method29130();
		local29.method29130();
	}

	@OriginalMember(owner = "client!amg", name = "r", descriptor = "()Lclient!oo;", line = 52)
	@Override
	public Class447 method23164() {
		return Class447.method29124(this.aClass447_48);
	}

	@OriginalMember(owner = "client!amg", name = "g", descriptor = "()Lclient!oo;", line = 52)
	@Override
	public Class447 method23160() {
		return Class447.method29124(this.aClass447_48);
	}

	@OriginalMember(owner = "client!amg", name = "z", descriptor = "()Lclient!oo;", line = 52)
	@Override
	public Class447 method23158() {
		return Class447.method29124(this.aClass447_48);
	}

	@OriginalMember(owner = "client!amg", name = "v", descriptor = "(I)Lclient!oo;", line = 52)
	@Override
	public Class447 method23153() {
		return Class447.method29124(this.aClass447_48);
	}

	@OriginalMember(owner = "client!amg", name = "l", descriptor = "(I)Lclient!oo;", line = 56)
	@Override
	public Class447 method23165() {
		return Class447.method29124(this.aClass447_49);
	}

	@OriginalMember(owner = "client!amg", name = "j", descriptor = "()Lclient!oo;", line = 56)
	@Override
	public Class447 method23166() {
		return Class447.method29124(this.aClass447_49);
	}

	@OriginalMember(owner = "client!amg", name = "i", descriptor = "()Lclient!oo;", line = 56)
	@Override
	public Class447 method23167() {
		return Class447.method29124(this.aClass447_49);
	}

	@OriginalMember(owner = "client!amg", name = "w", descriptor = "(Lclient!akv;I)V", line = 60)
	@Override
	public void method23152(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass447_49.method29131(arg0);
	}

	@OriginalMember(owner = "client!amg", name = "k", descriptor = "(Lclient!akv;)V", line = 60)
	@Override
	public void method23168(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass447_49.method29131(arg0);
	}
}
