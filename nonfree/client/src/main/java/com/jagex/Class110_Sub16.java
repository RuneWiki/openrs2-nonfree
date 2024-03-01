package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agn")
public class Class110_Sub16 extends Class110 {

	@OriginalMember(owner = "client!agn", name = "n", descriptor = "I")
	final int anInt967;

	@OriginalMember(owner = "client!agn", name = "m", descriptor = "I")
	final int anInt968;

	@OriginalMember(owner = "client!agn", name = "<init>", descriptor = "(Lclient!alw;)V", line = 11)
	Class110_Sub16(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt967 = arg0.method22415() * -1119162511;
		this.anInt968 = arg0.method22413() * -821623023;
	}

	@OriginalMember(owner = "client!agn", name = "n", descriptor = "(I)V", line = 17)
	@Override
	public void method20138() {
		Class274.aClass258_1.method26062(this.anInt967 * 1995829649, this.anInt968 * 343329265);
	}

	@OriginalMember(owner = "client!agn", name = "f", descriptor = "()V", line = 17)
	@Override
	public void method20140() {
		Class274.aClass258_1.method26062(this.anInt967 * 1995829649, this.anInt968 * 343329265);
	}
}
