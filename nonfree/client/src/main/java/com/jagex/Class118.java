package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
class Class118 implements Runnable {

	// $FF: synthetic field
	@OriginalMember(owner = "client!cs", name = "this$0", descriptor = "Lclient!aem;")
	final Class48_Sub1 this$0;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)Lclient!amj;", line = 22)
	static Class3_Sub1_Sub6 method22820(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub1_Sub6 local5 = (Class3_Sub1_Sub6) Class512.aClass153_1.method23146((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(15) byte[] local15 = Class474.aClass359_85.method26713(arg0, 0);
		if (local15 == null || local15.length <= 1) {
			return null;
		}
		try {
			local5 = Class403.method27630(local15);
		} catch (@Pc(29) Exception local29) {
			throw new RuntimeException(local29.getMessage() + " " + arg0);
		}
		Class512.aClass153_1.method23147(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!aem;)V", line = 28)
	Class118(@OriginalArg(0) Class48_Sub1 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "()V", line = 32)
	public void method22818() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean198) {
					@Pc(9) HashMap local9 = this.this$0.method9025();
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class357 local20;
						do {
							if (!local13.hasNext()) {
								Class60_Sub11.method13407(50L);
								continue label36;
							}
							local20 = (Class357) local13.next();
						} while (local20.aBoolean722);
						@Pc(30) Class371[] local30 = (Class371[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method27111();
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class27_Sub1.method7214(null, local49);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cs", name = "run", descriptor = "()V", line = 32)
	@Override
	public void run() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean198) {
					@Pc(9) HashMap local9 = this.this$0.method9025();
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class357 local20;
						do {
							if (!local13.hasNext()) {
								Class60_Sub11.method13407(50L);
								continue label36;
							}
							local20 = (Class357) local13.next();
						} while (local20.aBoolean722);
						@Pc(30) Class371[] local30 = (Class371[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method27111();
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class27_Sub1.method7214(null, local49);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "()V", line = 32)
	public void method22819() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean198) {
					@Pc(9) HashMap local9 = this.this$0.method9025();
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class357 local20;
						do {
							if (!local13.hasNext()) {
								Class60_Sub11.method13407(50L);
								continue label36;
							}
							local20 = (Class357) local13.next();
						} while (local20.aBoolean722);
						@Pc(30) Class371[] local30 = (Class371[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method27111();
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class27_Sub1.method7214(null, local49);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cs", name = "aus", descriptor = "(Lclient!vs;B)V", line = 12577)
	static final void method22821(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass26_Sub1_Sub1_Sub1_4.method21479();
	}
}
