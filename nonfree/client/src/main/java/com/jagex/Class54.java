package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class Class54 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	int anInt1246;

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
	int anInt1247;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
	int anInt1248;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
	int anInt1249;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 3243)
	Class54() {
	}

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!ag;)V", line = 3245)
	Class54(@OriginalArg(0) Class54 arg0) {
		this.anInt1247 = arg0.anInt1247;
		this.anInt1246 = arg0.anInt1246;
		this.anInt1248 = arg0.anInt1248;
		this.anInt1249 = arg0.anInt1249;
	}
}
