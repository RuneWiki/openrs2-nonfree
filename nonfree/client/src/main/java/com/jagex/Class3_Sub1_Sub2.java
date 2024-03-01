package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amb")
public abstract class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!amb", name = "s", descriptor = "I")
	public final int anInt2869;

	@OriginalMember(owner = "client!amb", name = "<init>", descriptor = "(I)V", line = 18)
	Class3_Sub1_Sub2(@OriginalArg(0) int arg0) {
		this.anInt2869 = arg0 * -553534401;
	}

	@OriginalMember(owner = "client!amb", name = "g", descriptor = "(Lclient!gu;Lclient!mu;Lclient!mq;B)V")
	public abstract void method21205(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class328 arg2);

	@OriginalMember(owner = "client!amb", name = "a", descriptor = "(FB)V")
	public abstract void method21206(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!amb", name = "b", descriptor = "(Lclient!ahb;)V")
	public abstract void method21207(@OriginalArg(0) Class3_Sub41 arg0);

	@OriginalMember(owner = "client!amb", name = "u", descriptor = "(Lclient!gu;Lclient!mu;Lclient!mq;)V")
	public abstract void method21208(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class328 arg2);

	@OriginalMember(owner = "client!amb", name = "h", descriptor = "(F)V")
	public abstract void method21209(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!amb", name = "x", descriptor = "(F)V")
	public abstract void method21210(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!amb", name = "s", descriptor = "(Lclient!gu;Lclient!mu;Lclient!mq;)V")
	public abstract void method21211(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class328 arg2);

	@OriginalMember(owner = "client!amb", name = "l", descriptor = "(Lclient!ahb;B)V")
	public abstract void method21212(@OriginalArg(0) Class3_Sub41 arg0);

	@OriginalMember(owner = "client!amb", name = "y", descriptor = "(Lclient!ahb;)V")
	public abstract void method21213(@OriginalArg(0) Class3_Sub41 arg0);
}
