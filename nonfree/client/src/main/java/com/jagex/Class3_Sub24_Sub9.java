package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alp")
public class Class3_Sub24_Sub9 extends Class3_Sub24 {

	@OriginalMember(owner = "client!alp", name = "aa", descriptor = "Lclient!wn;")
	protected static Class556 aClass556_1;

	@OriginalMember(owner = "client!alp", name = "l", descriptor = "Ljava/lang/String;")
	String aString84;

	// $FF: synthetic field
	@OriginalMember(owner = "client!alp", name = "this$0", descriptor = "Lclient!iq;")
	final Class242 this$0;

	@OriginalMember(owner = "client!alp", name = "<init>", descriptor = "(Lclient!iq;)V", line = 213)
	Class3_Sub24_Sub9(@OriginalArg(0) Class242 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!alp", name = "l", descriptor = "(Lclient!ahb;)V", line = 216)
	@Override
	void method18646(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aString84 = arg0.method20283();
		arg0.method20275();
	}

	@OriginalMember(owner = "client!alp", name = "p", descriptor = "(Lclient!ahb;B)V", line = 216)
	@Override
	void method18644(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aString84 = arg0.method20283();
		arg0.method20275();
	}

	@OriginalMember(owner = "client!alp", name = "g", descriptor = "(Lclient!ahb;)V", line = 216)
	@Override
	void method18649(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aString84 = arg0.method20283();
		arg0.method20275();
	}

	@OriginalMember(owner = "client!alp", name = "h", descriptor = "(Lclient!ahb;)V", line = 216)
	@Override
	void method18647(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aString84 = arg0.method20283();
		arg0.method20275();
	}

	@OriginalMember(owner = "client!alp", name = "x", descriptor = "(Lclient!ahb;)V", line = 216)
	@Override
	void method18645(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aString84 = arg0.method20283();
		arg0.method20275();
	}

	@OriginalMember(owner = "client!alp", name = "a", descriptor = "(Lclient!iu;I)V", line = 221)
	@Override
	void method18643(@OriginalArg(0) Class245 arg0) {
		arg0.aString193 = this.aString84;
	}

	@OriginalMember(owner = "client!alp", name = "s", descriptor = "(Lclient!iu;)V", line = 221)
	@Override
	void method18648(@OriginalArg(0) Class245 arg0) {
		arg0.aString193 = this.aString84;
	}
}
