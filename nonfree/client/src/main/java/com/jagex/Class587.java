package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xu")
public class Class587 {

	@OriginalMember(owner = "client!xu", name = "<init>", descriptor = "()V", line = 6)
	public Class587() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!xu", name = "a", descriptor = "()J", line = 11)
	public long method33285() {
		return System.nanoTime();
	}

	@OriginalMember(owner = "client!xu", name = "p", descriptor = "(I)J", line = 11)
	public long method33286() {
		return System.nanoTime();
	}

	@OriginalMember(owner = "client!xu", name = "jh", descriptor = "(Lclient!vs;I)V", line = 5859)
	static final void method33287(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		Class343.method26482(local11, arg0);
	}
}
