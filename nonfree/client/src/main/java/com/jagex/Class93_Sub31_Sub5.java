package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arz")
public class Class93_Sub31_Sub5 extends Class93_Sub31 {

	@OriginalMember(owner = "client!arz", name = "f", descriptor = "I")
	int anInt3054;

	@OriginalMember(owner = "client!arz", name = "w", descriptor = "B")
	byte aByte87;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arz", name = "this$0", descriptor = "Lclient!kc;")
	final Class374 this$0;

	@OriginalMember(owner = "client!arz", name = "k", descriptor = "Ljava/lang/String;")
	String aString105;

	@OriginalMember(owner = "client!arz", name = "<init>", descriptor = "(Lclient!kc;)V", line = 58)
	Class93_Sub31_Sub5(@OriginalArg(0) Class374 arg0) {
		this.this$0 = arg0;
		this.aString105 = null;
	}

	@OriginalMember(owner = "client!arz", name = "e", descriptor = "(Lclient!alw;I)V", line = 61)
	@Override
	void method22011(@OriginalArg(0) Class93_Sub41 arg0) {
		if (arg0.method22413() != 255) {
			arg0.anInt3070 -= -1445626955;
			arg0.method22423();
		}
		this.aString105 = arg0.method22426();
		this.anInt3054 = arg0.method22415() * -2079533049;
		this.aByte87 = arg0.method22414();
		arg0.method22423();
	}

	@OriginalMember(owner = "client!arz", name = "m", descriptor = "(Lclient!alw;)V", line = 61)
	@Override
	void method22006(@OriginalArg(0) Class93_Sub41 arg0) {
		if (arg0.method22413() != 255) {
			arg0.anInt3070 -= -1445626955;
			arg0.method22423();
		}
		this.aString105 = arg0.method22426();
		this.anInt3054 = arg0.method22415() * -2079533049;
		this.aByte87 = arg0.method22414();
		arg0.method22423();
	}

	@OriginalMember(owner = "client!arz", name = "w", descriptor = "(Lclient!akr;)V", line = 72)
	@Override
	void method22010(@OriginalArg(0) Class93_Sub28 arg0) {
		@Pc(3) Class373 local3 = new Class373();
		local3.aString191 = this.aString105;
		local3.anInt4597 = this.anInt3054 * 453974303;
		local3.aByte150 = this.aByte87;
		arg0.method13824(local3);
	}

	@OriginalMember(owner = "client!arz", name = "n", descriptor = "(Lclient!akr;S)V", line = 72)
	@Override
	void method22007(@OriginalArg(0) Class93_Sub28 arg0) {
		@Pc(3) Class373 local3 = new Class373();
		local3.aString191 = this.aString105;
		local3.anInt4597 = this.anInt3054 * 453974303;
		local3.aByte150 = this.aByte87;
		arg0.method13824(local3);
	}

	@OriginalMember(owner = "client!arz", name = "k", descriptor = "(Lclient!akr;)V", line = 72)
	@Override
	void method22009(@OriginalArg(0) Class93_Sub28 arg0) {
		@Pc(3) Class373 local3 = new Class373();
		local3.aString191 = this.aString105;
		local3.anInt4597 = this.anInt3054 * 453974303;
		local3.aByte150 = this.aByte87;
		arg0.method13824(local3);
	}

	@OriginalMember(owner = "client!arz", name = "f", descriptor = "(Lclient!akr;)V", line = 72)
	@Override
	void method22008(@OriginalArg(0) Class93_Sub28 arg0) {
		@Pc(3) Class373 local3 = new Class373();
		local3.aString191 = this.aString105;
		local3.anInt4597 = this.anInt3054 * 453974303;
		local3.aByte150 = this.aByte87;
		arg0.method13824(local3);
	}
}
