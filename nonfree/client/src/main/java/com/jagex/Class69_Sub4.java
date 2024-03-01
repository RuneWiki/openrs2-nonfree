package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajr")
public class Class69_Sub4 extends Class69 {

	@OriginalMember(owner = "client!ajr", name = "a", descriptor = "Lclient!mh;")
	final Class320 aClass320_49 = new Class320(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ajr", name = "g", descriptor = "Lclient!mh;")
	final Class320 aClass320_48 = new Class320(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ajr", name = "l", descriptor = "Lclient!mh;")
	final Class320 aClass320_50 = new Class320();

	@OriginalMember(owner = "client!ajr", name = "<init>", descriptor = "(Lclient!ha;)V", line = 16)
	public Class69_Sub4(@OriginalArg(0) Class23 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ajr", name = "d", descriptor = "(Lclient!agq;)V", line = 20)
	public void method14666(@OriginalArg(0) Class3_Sub32 arg0) {
		this.aClass320_48.aFloat259 = arg0.anInt1343 * 2061226997;
		this.aClass320_48.aFloat260 = arg0.anInt1345 * -799586411;
		this.aClass320_48.aFloat261 = arg0.anInt1344 * 615450365;
		if (Float.isNaN(this.aClass320_49.aFloat259)) {
			this.aClass320_49.method25893(this.aClass320_48);
			this.aClass320_50.method25868();
		}
	}

	@OriginalMember(owner = "client!ajr", name = "r", descriptor = "(Lclient!agq;I)V", line = 20)
	public void method14667(@OriginalArg(0) Class3_Sub32 arg0) {
		this.aClass320_48.aFloat259 = arg0.anInt1343 * 2061226997;
		this.aClass320_48.aFloat260 = arg0.anInt1345 * -799586411;
		this.aClass320_48.aFloat261 = arg0.anInt1344 * 615450365;
		if (Float.isNaN(this.aClass320_49.aFloat259)) {
			this.aClass320_49.method25893(this.aClass320_48);
			this.aClass320_50.method25868();
		}
	}

	@OriginalMember(owner = "client!ajr", name = "p", descriptor = "(FB)V", line = 30)
	@Override
	public void method20202(@OriginalArg(0) float arg0) {
		this.aClass23_16.method5800(false, arg0, this.aClass320_49, this.aClass23_16.method5838(), this.aClass320_48, this.aClass320_50);
	}

	@OriginalMember(owner = "client!ajr", name = "s", descriptor = "(F)V", line = 30)
	@Override
	public void method20201(@OriginalArg(0) float arg0) {
		this.aClass23_16.method5800(false, arg0, this.aClass320_49, this.aClass23_16.method5838(), this.aClass320_48, this.aClass320_50);
	}

	@OriginalMember(owner = "client!ajr", name = "y", descriptor = "()Z", line = 34)
	@Override
	public boolean method20208() {
		return !Float.isNaN(this.aClass320_49.aFloat259);
	}

	@OriginalMember(owner = "client!ajr", name = "a", descriptor = "(I)Z", line = 34)
	@Override
	public boolean method20209() {
		return !Float.isNaN(this.aClass320_49.aFloat259);
	}

	@OriginalMember(owner = "client!ajr", name = "u", descriptor = "()Z", line = 34)
	@Override
	public boolean method20204() {
		return !Float.isNaN(this.aClass320_49.aFloat259);
	}

	@OriginalMember(owner = "client!ajr", name = "b", descriptor = "(Lclient!gu;Lclient!mu;IIF)V", line = 38)
	@Override
	public void method20210(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class320 local5 = Class320.method25906(this.aClass23_16.method5908());
		local5.aFloat259 -= arg2;
		local5.aFloat261 -= arg3;
		local5.aFloat260 *= -1.0F;
		@Pc(29) Class320 local29 = Class320.method25906(this.aClass320_49);
		local29.aFloat259 -= arg2;
		local29.aFloat261 -= arg3;
		local29.aFloat260 *= -1.0F;
		arg1.method26196((double) local5.aFloat259, (double) local5.aFloat260, (double) local5.aFloat261, (double) local29.aFloat259, (double) local29.aFloat260, (double) local29.aFloat261, 0.0F, 1.0F, 0.0F);
		local5.method25874();
		local29.method25874();
	}

	@OriginalMember(owner = "client!ajr", name = "h", descriptor = "(Lclient!gu;Lclient!mu;IIFI)V", line = 38)
	@Override
	public void method20206(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class320 local5 = Class320.method25906(this.aClass23_16.method5908());
		local5.aFloat259 -= arg2;
		local5.aFloat261 -= arg3;
		local5.aFloat260 *= -1.0F;
		@Pc(29) Class320 local29 = Class320.method25906(this.aClass320_49);
		local29.aFloat259 -= arg2;
		local29.aFloat261 -= arg3;
		local29.aFloat260 *= -1.0F;
		arg1.method26196((double) local5.aFloat259, (double) local5.aFloat260, (double) local5.aFloat261, (double) local29.aFloat259, (double) local29.aFloat260, (double) local29.aFloat261, 0.0F, 1.0F, 0.0F);
		local5.method25874();
		local29.method25874();
	}

	@OriginalMember(owner = "client!ajr", name = "g", descriptor = "(S)Lclient!mh;", line = 52)
	@Override
	public Class320 method20203() {
		return Class320.method25906(this.aClass320_49);
	}

	@OriginalMember(owner = "client!ajr", name = "e", descriptor = "()Lclient!mh;", line = 52)
	@Override
	public Class320 method20215() {
		return Class320.method25906(this.aClass320_49);
	}

	@OriginalMember(owner = "client!ajr", name = "l", descriptor = "(I)Lclient!mh;", line = 56)
	@Override
	public Class320 method20205() {
		return Class320.method25906(this.aClass320_48);
	}

	@OriginalMember(owner = "client!ajr", name = "c", descriptor = "()Lclient!mh;", line = 56)
	@Override
	public Class320 method20211() {
		return Class320.method25906(this.aClass320_48);
	}

	@OriginalMember(owner = "client!ajr", name = "z", descriptor = "()Lclient!mh;", line = 56)
	@Override
	public Class320 method20212() {
		return Class320.method25906(this.aClass320_48);
	}

	@OriginalMember(owner = "client!ajr", name = "x", descriptor = "(Lclient!ahb;B)V", line = 60)
	@Override
	public void method20207(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass320_48.method25866(arg0);
	}

	@OriginalMember(owner = "client!ajr", name = "j", descriptor = "(Lclient!ahb;)V", line = 60)
	@Override
	public void method20213(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass320_48.method25866(arg0);
	}

	@OriginalMember(owner = "client!ajr", name = "n", descriptor = "(Lclient!ahb;)V", line = 60)
	@Override
	public void method20214(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass320_48.method25866(arg0);
	}

	@OriginalMember(owner = "client!ajr", name = "l", descriptor = "(JII)Ljava/lang/String;", line = 76)
	static String method14668(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class313.method25819(arg0);
		@Pc(5) int local5 = Class599.aCalendar2.get(5);
		@Pc(11) int local11 = Class599.aCalendar2.get(2) + 1;
		@Pc(15) int local15 = Class599.aCalendar2.get(1);
		return Integer.toString(local5 / 10) + local5 % 10 + "/" + local11 / 10 + local11 % 10 + "/" + local15 % 100 / 10 + local15 % 10;
	}
}
