package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
class Class500 implements Interface48 {

	@OriginalMember(owner = "client!qw", name = "bx", descriptor = "Lclient!cy;")
	public static Class83 aClass83_30;

	// $FF: synthetic field
	@OriginalMember(owner = "client!qw", name = "this$0", descriptor = "Lclient!qe;")
	final Class485 this$0;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!qe;)V", line = 74)
	Class500(@OriginalArg(0) Class485 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "()V", line = 76)
	@Override
	public void method30218() {
		this.this$0.method29938(true);
	}

	@OriginalMember(owner = "client!qw", name = "p", descriptor = "(I)V", line = 76)
	@Override
	public void method30219() {
		this.this$0.method29938(true);
	}

	@OriginalMember(owner = "client!qw", name = "v", descriptor = "()V", line = 76)
	@Override
	public void method30220() {
		this.this$0.method29938(true);
	}

	@OriginalMember(owner = "client!qw", name = "my", descriptor = "(II)V", line = 12231)
	static void method30221(@OriginalArg(0) int arg0) {
		for (@Pc(3) Class77 local3 = client.aClass12_18.method190(); local3 != null; local3 = client.aClass12_18.method192()) {
			if ((long) arg0 == (local3.aLong229 * 8258869577519436579L >> 48 & 0xFFFFL)) {
				local3.method24063();
			}
		}
	}
}
