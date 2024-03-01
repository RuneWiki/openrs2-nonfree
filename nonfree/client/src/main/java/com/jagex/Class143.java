package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
class Class143 implements Interface14 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ec", name = "this$0", descriptor = "Lclient!ft;")
	final Class183 this$0;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!ft;)V", line = 267)
	Class143(@OriginalArg(0) Class183 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "(Lclient!tn;I)V", line = 269)
	void method23055(@OriginalArg(0) Interface52 arg0) {
		@Pc(5) Iterator local5 = this.this$0.method23627().iterator();
		while (local5.hasNext()) {
			@Pc(12) Class366 local12 = (Class366) local5.next();
			if (local12.method26832() == arg0) {
				local12.method26816();
				local5.remove();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "(Ljava/lang/Object;I)V", line = 280)
	@Override
	public void method23054(@OriginalArg(0) Object arg0) {
		this.method23055((Interface52) arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/Object;)V", line = 280)
	@Override
	public void method23053(@OriginalArg(0) Object arg0) {
		this.method23055((Interface52) arg0);
	}

	@OriginalMember(owner = "client!ec", name = "it", descriptor = "(Lclient!vs;I)V", line = 5640)
	static final void method23056(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class469.method28754(local16, local22, arg0);
	}
}
