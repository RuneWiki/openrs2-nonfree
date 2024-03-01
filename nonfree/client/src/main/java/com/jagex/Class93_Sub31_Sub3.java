package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aru")
public class Class93_Sub31_Sub3 extends Class93_Sub31 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aru", name = "this$0", descriptor = "Lclient!kc;")
	final Class374 this$0;

	@OriginalMember(owner = "client!aru", name = "k", descriptor = "I")
	int anInt3042;

	@OriginalMember(owner = "client!aru", name = "<init>", descriptor = "(Lclient!kc;)V", line = 83)
	Class93_Sub31_Sub3(@OriginalArg(0) Class374 arg0) {
		this.this$0 = arg0;
		this.anInt3042 = -650162691;
	}

	@OriginalMember(owner = "client!aru", name = "e", descriptor = "(Lclient!alw;I)V", line = 86)
	@Override
	void method22011(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt3042 = arg0.method22415() * 650162691;
		arg0.method22413();
		if (arg0.method22413() != 255) {
			arg0.anInt3070 -= -1445626955;
			arg0.method22423();
		}
	}

	@OriginalMember(owner = "client!aru", name = "m", descriptor = "(Lclient!alw;)V", line = 86)
	@Override
	void method22006(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt3042 = arg0.method22415() * 650162691;
		arg0.method22413();
		if (arg0.method22413() != 255) {
			arg0.anInt3070 -= -1445626955;
			arg0.method22423();
		}
	}

	@OriginalMember(owner = "client!aru", name = "w", descriptor = "(Lclient!akr;)V", line = 95)
	@Override
	void method22010(@OriginalArg(0) Class93_Sub28 arg0) {
		arg0.method13825(this.anInt3042 * -1600976725);
	}

	@OriginalMember(owner = "client!aru", name = "n", descriptor = "(Lclient!akr;S)V", line = 95)
	@Override
	void method22007(@OriginalArg(0) Class93_Sub28 arg0) {
		arg0.method13825(this.anInt3042 * -1600976725);
	}

	@OriginalMember(owner = "client!aru", name = "k", descriptor = "(Lclient!akr;)V", line = 95)
	@Override
	void method22009(@OriginalArg(0) Class93_Sub28 arg0) {
		arg0.method13825(this.anInt3042 * -1600976725);
	}

	@OriginalMember(owner = "client!aru", name = "f", descriptor = "(Lclient!akr;)V", line = 95)
	@Override
	void method22008(@OriginalArg(0) Class93_Sub28 arg0) {
		arg0.method13825(this.anInt3042 * -1600976725);
	}
}
