package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adc")
public class Class75_Sub2 extends Class75 {

	@OriginalMember(owner = "client!adc", name = "w", descriptor = "I")
	public int anInt225;

	@OriginalMember(owner = "client!adc", name = "<init>", descriptor = "(Lclient!pd;I)V", line = 12)
	Class75_Sub2(@OriginalArg(0) Class127 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!adc", name = "q", descriptor = "(Lclient!akv;IB)V", line = 16)
	@Override
	void method1152(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class285 local6 = (Class285) Class457.method29479(Class268.method26485(), arg1);
		if (local6 == Class285.aClass285_9) {
			this.anInt225 = arg0.method22483() * -1545628185;
		}
	}

	@OriginalMember(owner = "client!adc", name = "s", descriptor = "(Lclient!akv;I)V", line = 16)
	@Override
	void method1150(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class285 local6 = (Class285) Class457.method29479(Class268.method26485(), arg1);
		if (local6 == Class285.aClass285_9) {
			this.anInt225 = arg0.method22483() * -1545628185;
		}
	}

	@OriginalMember(owner = "client!adc", name = "r", descriptor = "(Lclient!akv;I)V", line = 16)
	@Override
	void method1151(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class285 local6 = (Class285) Class457.method29479(Class268.method26485(), arg1);
		if (local6 == Class285.aClass285_9) {
			this.anInt225 = arg0.method22483() * -1545628185;
		}
	}

	@OriginalMember(owner = "client!adc", name = "c", descriptor = "(I)V", line = 21)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!adc", name = "w", descriptor = "()V", line = 21)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!adc", name = "t", descriptor = "()V", line = 21)
	@Override
	public void method36036() {
	}
}
