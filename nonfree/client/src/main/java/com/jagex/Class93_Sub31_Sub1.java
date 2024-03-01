package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arf")
public class Class93_Sub31_Sub1 extends Class93_Sub31 {

	@OriginalMember(owner = "client!arf", name = "f", descriptor = "B")
	byte aByte78;

	@OriginalMember(owner = "client!arf", name = "k", descriptor = "Ljava/lang/String;")
	String aString95;

	@OriginalMember(owner = "client!arf", name = "w", descriptor = "B")
	byte aByte79;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arf", name = "this$0", descriptor = "Lclient!kc;")
	final Class374 this$0;

	@OriginalMember(owner = "client!arf", name = "<init>", descriptor = "(Lclient!kc;)V", line = 154)
	Class93_Sub31_Sub1(@OriginalArg(0) Class374 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!arf", name = "e", descriptor = "(Lclient!alw;I)V", line = 157)
	@Override
	void method22011(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aString95 = arg0.method22426();
		if (this.aString95 != null) {
			arg0.method22413();
			this.aByte78 = arg0.method22414();
			this.aByte79 = arg0.method22414();
		}
	}

	@OriginalMember(owner = "client!arf", name = "m", descriptor = "(Lclient!alw;)V", line = 157)
	@Override
	void method22006(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aString95 = arg0.method22426();
		if (this.aString95 != null) {
			arg0.method22413();
			this.aByte78 = arg0.method22414();
			this.aByte79 = arg0.method22414();
		}
	}

	@OriginalMember(owner = "client!arf", name = "f", descriptor = "(Lclient!akr;)V", line = 166)
	@Override
	void method22008(@OriginalArg(0) Class93_Sub28 arg0) {
		arg0.aString44 = this.aString95;
		if (this.aString95 != null) {
			arg0.aByte55 = this.aByte78;
			arg0.aByte56 = this.aByte79;
		}
	}

	@OriginalMember(owner = "client!arf", name = "k", descriptor = "(Lclient!akr;)V", line = 166)
	@Override
	void method22009(@OriginalArg(0) Class93_Sub28 arg0) {
		arg0.aString44 = this.aString95;
		if (this.aString95 != null) {
			arg0.aByte55 = this.aByte78;
			arg0.aByte56 = this.aByte79;
		}
	}

	@OriginalMember(owner = "client!arf", name = "w", descriptor = "(Lclient!akr;)V", line = 166)
	@Override
	void method22010(@OriginalArg(0) Class93_Sub28 arg0) {
		arg0.aString44 = this.aString95;
		if (this.aString95 != null) {
			arg0.aByte55 = this.aByte78;
			arg0.aByte56 = this.aByte79;
		}
	}

	@OriginalMember(owner = "client!arf", name = "n", descriptor = "(Lclient!akr;S)V", line = 166)
	@Override
	void method22007(@OriginalArg(0) Class93_Sub28 arg0) {
		arg0.aString44 = this.aString95;
		if (this.aString95 != null) {
			arg0.aByte55 = this.aByte78;
			arg0.aByte56 = this.aByte79;
		}
	}
}
