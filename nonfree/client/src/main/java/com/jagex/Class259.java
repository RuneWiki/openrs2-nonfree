package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public class Class259 implements Interface27 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fu", name = "this$0", descriptor = "Lclient!fc;")
	final Class242 this$0;

	@OriginalMember(owner = "client!fu", name = "p", descriptor = "I")
	final int anInt3809;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!fc;Lclient!akv;)V", line = 174)
	Class259(@OriginalArg(0) Class242 arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		this.this$0 = arg0;
		this.anInt3809 = arg1.method22483() * -756380907;
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(Lclient!fd;)V", line = 179)
	@Override
	public void method26977(@OriginalArg(0) Class243 arg0) {
		@Pc(9) Class254 local9 = (Class254) arg0.method26027().get(this.anInt3809 * -1179620291);
		arg0.method26075(this.anInt3809 * -1179620291);
		local9.method26196();
	}

	@OriginalMember(owner = "client!fu", name = "p", descriptor = "(Lclient!fd;I)V", line = 179)
	@Override
	public void method26978(@OriginalArg(0) Class243 arg0) {
		@Pc(9) Class254 local9 = (Class254) arg0.method26027().get(this.anInt3809 * -1179620291);
		arg0.method26075(this.anInt3809 * -1179620291);
		local9.method26196();
	}

	@OriginalMember(owner = "client!fu", name = "v", descriptor = "(Lclient!fd;)V", line = 179)
	@Override
	public void method26979(@OriginalArg(0) Class243 arg0) {
		@Pc(9) Class254 local9 = (Class254) arg0.method26027().get(this.anInt3809 * -1179620291);
		arg0.method26075(this.anInt3809 * -1179620291);
		local9.method26196();
	}

	@OriginalMember(owner = "client!fu", name = "ap", descriptor = "(Lclient!yf;I)V", line = 4607)
	static final void method26248(@OriginalArg(0) Class665 arg0) {
		arg0.aLongArray28[(arg0.anInt5782 += 1091885681) * 1572578961 - 1] = arg0.aLongArray27[arg0.anIntArray535[arg0.anInt5786 * 662605117]];
	}
}
