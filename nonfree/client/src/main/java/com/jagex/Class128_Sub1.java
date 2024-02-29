package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aig")
public class Class128_Sub1 extends Class128 {

	@OriginalMember(owner = "client!aig", name = "l", descriptor = "[Lclient!ei;")
	static Class225[] aClass225Array1;

	@OriginalMember(owner = "client!aig", name = "u", descriptor = "Lclient!dj;")
	public static Class94 aClass94_5;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aig", name = "this$0", descriptor = "Lclient!sx;")
	final Class546 this$0;

	@OriginalMember(owner = "client!aig", name = "<init>", descriptor = "(Lclient!sx;)V", line = 74)
	Class128_Sub1(@OriginalArg(0) Class546 arg0) {
		super(arg0);
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!aig", name = "dj", descriptor = "(II)V", line = 833)
	static void method11794(@OriginalArg(0) int arg0) {
		Class88.anInt610 = arg0 * 704227181;
		Class136_Sub1.anInt1703 = 1421361991;
		Class136_Sub1.anInt1704 = -2017528667;
		Class608.method32139();
	}

	@OriginalMember(owner = "client!aig", name = "axk", descriptor = "(Lclient!yf;B)V", line = 13410)
	static final void method11795(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass277_6 == null ? -1 : client.aClass277_6.anInt3863 * -1278450723;
	}
}
