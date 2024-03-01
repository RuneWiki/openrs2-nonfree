package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alu")
public class Class3_Sub24_Sub13 extends Class3_Sub24 {

	@OriginalMember(owner = "client!alu", name = "l", descriptor = "Z")
	boolean aBoolean463;

	@OriginalMember(owner = "client!alu", name = "x", descriptor = "B")
	byte aByte81;

	@OriginalMember(owner = "client!alu", name = "h", descriptor = "B")
	byte aByte82;

	@OriginalMember(owner = "client!alu", name = "u", descriptor = "B")
	byte aByte83;

	@OriginalMember(owner = "client!alu", name = "s", descriptor = "B")
	byte aByte84;

	// $FF: synthetic field
	@OriginalMember(owner = "client!alu", name = "this$0", descriptor = "Lclient!iq;")
	final Class242 this$0;

	@OriginalMember(owner = "client!alu", name = "<init>", descriptor = "(Lclient!iq;)V", line = 232)
	Class3_Sub24_Sub13(@OriginalArg(0) Class242 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!alu", name = "l", descriptor = "(Lclient!ahb;)V", line = 235)
	@Override
	void method18646(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aBoolean463 = arg0.method20269() == 1;
		this.aByte82 = arg0.method20390();
		this.aByte81 = arg0.method20390();
		this.aByte84 = arg0.method20390();
		this.aByte83 = arg0.method20390();
	}

	@OriginalMember(owner = "client!alu", name = "p", descriptor = "(Lclient!ahb;B)V", line = 235)
	@Override
	void method18644(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aBoolean463 = arg0.method20269() == 1;
		this.aByte82 = arg0.method20390();
		this.aByte81 = arg0.method20390();
		this.aByte84 = arg0.method20390();
		this.aByte83 = arg0.method20390();
	}

	@OriginalMember(owner = "client!alu", name = "g", descriptor = "(Lclient!ahb;)V", line = 235)
	@Override
	void method18649(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aBoolean463 = arg0.method20269() == 1;
		this.aByte82 = arg0.method20390();
		this.aByte81 = arg0.method20390();
		this.aByte84 = arg0.method20390();
		this.aByte83 = arg0.method20390();
	}

	@OriginalMember(owner = "client!alu", name = "h", descriptor = "(Lclient!ahb;)V", line = 235)
	@Override
	void method18647(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aBoolean463 = arg0.method20269() == 1;
		this.aByte82 = arg0.method20390();
		this.aByte81 = arg0.method20390();
		this.aByte84 = arg0.method20390();
		this.aByte83 = arg0.method20390();
	}

	@OriginalMember(owner = "client!alu", name = "x", descriptor = "(Lclient!ahb;)V", line = 235)
	@Override
	void method18645(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aBoolean463 = arg0.method20269() == 1;
		this.aByte82 = arg0.method20390();
		this.aByte81 = arg0.method20390();
		this.aByte84 = arg0.method20390();
		this.aByte83 = arg0.method20390();
	}

	@OriginalMember(owner = "client!alu", name = "a", descriptor = "(Lclient!iu;I)V", line = 243)
	@Override
	void method18643(@OriginalArg(0) Class245 arg0) {
		arg0.aBoolean686 = this.aBoolean463;
		arg0.aByte135 = this.aByte82;
		arg0.aByte130 = this.aByte81;
		arg0.aByte133 = this.aByte84;
		arg0.aByte131 = this.aByte83;
	}

	@OriginalMember(owner = "client!alu", name = "s", descriptor = "(Lclient!iu;)V", line = 243)
	@Override
	void method18648(@OriginalArg(0) Class245 arg0) {
		arg0.aBoolean686 = this.aBoolean463;
		arg0.aByte135 = this.aByte82;
		arg0.aByte130 = this.aByte81;
		arg0.aByte133 = this.aByte84;
		arg0.aByte131 = this.aByte83;
	}
}
