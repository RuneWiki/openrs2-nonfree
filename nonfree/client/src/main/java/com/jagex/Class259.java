package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
class Class259 implements Interface39 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fc", name = "this$0", descriptor = "Lclient!fb;")
	final Class258 this$0;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!fb;)V", line = 475)
	Class259(@OriginalArg(0) Class258 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)F", line = 477)
	@Override
	public float method26345() {
		return (float) Class51.aClass93_Sub36_1.aClass166_Sub35_4.method16223() / 255.0F;
	}

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "()F", line = 477)
	@Override
	public float method26346() {
		return (float) Class51.aClass93_Sub36_1.aClass166_Sub35_4.method16223() / 255.0F;
	}

	@OriginalMember(owner = "client!fc", name = "att", descriptor = "(Lclient!yf;B)V", line = 13237)
	static final void method26146(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!fc", name = "axf", descriptor = "(Lclient!yf;I)V", line = 13947)
	static final void method26145(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class322 local18 = (Class322) Class542.aClass32_Sub2_3.method18261(local12);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.anInt4105 * 880251661;
	}
}
