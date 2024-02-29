package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fy")
public class Class263 implements Interface27 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fy", name = "this$0", descriptor = "Lclient!fc;")
	final Class242 this$0;

	@OriginalMember(owner = "client!fy", name = "p", descriptor = "I")
	final int anInt3822;

	@OriginalMember(owner = "client!fy", name = "c", descriptor = "I")
	final int anInt3823;

	@OriginalMember(owner = "client!fy", name = "<init>", descriptor = "(Lclient!fc;Lclient!akv;)V", line = 189)
	Class263(@OriginalArg(0) Class242 arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		this.this$0 = arg0;
		this.anInt3822 = arg1.method22483() * 1051402597;
		this.anInt3823 = arg1.method22478() * 334928121;
	}

	@OriginalMember(owner = "client!fy", name = "p", descriptor = "(Lclient!fd;I)V", line = 195)
	@Override
	public void method26978(@OriginalArg(0) Class243 arg0) {
		arg0.method26076(this.anInt3822 * -1290852243, this.anInt3823 * 264415561);
		arg0.method26054(this.anInt3822 * -1290852243).method25991();
	}

	@OriginalMember(owner = "client!fy", name = "c", descriptor = "(Lclient!fd;)V", line = 195)
	@Override
	public void method26977(@OriginalArg(0) Class243 arg0) {
		arg0.method26076(this.anInt3822 * -1290852243, this.anInt3823 * 264415561);
		arg0.method26054(this.anInt3822 * -1290852243).method25991();
	}

	@OriginalMember(owner = "client!fy", name = "v", descriptor = "(Lclient!fd;)V", line = 195)
	@Override
	public void method26979(@OriginalArg(0) Class243 arg0) {
		arg0.method26076(this.anInt3822 * -1290852243, this.anInt3823 * 264415561);
		arg0.method26054(this.anInt3822 * -1290852243).method25991();
	}

	@OriginalMember(owner = "client!fy", name = "ld", descriptor = "(Lclient!yf;B)V", line = 6689)
	static final void method26389(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class634.method32668(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!fy", name = "rd", descriptor = "(Lclient!yf;I)V", line = 7759)
	static final void method26390(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		Class509.method30284(local11, arg0);
	}

	@OriginalMember(owner = "client!fy", name = "akm", descriptor = "(Lclient!yf;B)V", line = 11381)
	static final void method26391(@OriginalArg(0) Class665 arg0) {
		Class638.method32718();
	}
}
