package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class Class269 {

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
	int anInt3834;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
	int anInt3835;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "Z")
	boolean aBoolean661;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "[F")
	float[] aFloatArray99;

	// $FF: synthetic field
	@OriginalMember(owner = "client!gd", name = "this$0", descriptor = "Lclient!gx;")
	final Class288 this$0;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!gx;)V", line = 1346)
	Class269(@OriginalArg(0) Class288 arg0) {
		this.this$0 = arg0;
	}
}
