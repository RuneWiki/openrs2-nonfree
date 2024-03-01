package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class Class261 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fe", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 this$0;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
	final int anInt3866;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "Z")
	final boolean aBoolean668;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V", line = 232)
	Class261(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		this.this$0 = arg0;
		this.anInt3866 = arg1.method22415() * -1775494257;
		this.aBoolean668 = arg1.method22413() == 1;
	}

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "(Lclient!gq;)V", line = 238)
	@Override
	public void method26713(@OriginalArg(0) Class297 arg0) {
		arg0.method26632(this.anInt3866 * -2090032273, this.aBoolean668);
		arg0.method26622(this.anInt3866 * -2090032273).method26756();
	}

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "(Lclient!gq;)V", line = 238)
	@Override
	public void method26714(@OriginalArg(0) Class297 arg0) {
		arg0.method26632(this.anInt3866 * -2090032273, this.aBoolean668);
		arg0.method26622(this.anInt3866 * -2090032273).method26756();
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(Lclient!gq;B)V", line = 238)
	@Override
	public void method26715(@OriginalArg(0) Class297 arg0) {
		arg0.method26632(this.anInt3866 * -2090032273, this.aBoolean668);
		arg0.method26622(this.anInt3866 * -2090032273).method26756();
	}
}
