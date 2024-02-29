package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public abstract class Class77_Sub2 extends Class77 {

	@OriginalMember(owner = "client!aja", name = "<init>", descriptor = "()V", line = 6)
	Class77_Sub2() {
	}

	@OriginalMember(owner = "client!aja", name = "et", descriptor = "(III)V", line = 963)
	public static void method21792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class88.anInt610 = (arg0 - Class136_Sub1.anInt1674) * 704227181;
		Class349.anInt4496 = (arg1 - Class136_Sub1.anInt1675) * 980626489;
		Class136_Sub1.anInt1703 = 1421361991;
		Class136_Sub1.anInt1704 = -2017528667;
		Class608.method32139();
	}
}
