package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class Class167 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	int anInt3452;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "[F")
	float[] aFloatArray97;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
	int anInt3453;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Z")
	boolean aBoolean624;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fb", name = "this$0", descriptor = "Lclient!fu;")
	final Class184 this$0;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!fu;)V", line = 1342)
	Class167(@OriginalArg(0) Class184 arg0) {
		this.this$0 = arg0;
	}
}
