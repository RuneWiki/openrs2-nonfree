package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
class Class116 implements Runnable {

	@OriginalMember(owner = "client!cp", name = "y", descriptor = "[Lclient!ta;")
	static Class473[] aClass473Array1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!cp", name = "this$0", descriptor = "Lclient!aem;")
	final Class48_Sub1 this$0;

	@OriginalMember(owner = "client!cp", name = "x", descriptor = "(Lclient!ahb;I)Lclient!kt;", line = 14)
	public static Class49 method22812(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) Class49 local3 = Class561.method32865(arg0);
		@Pc(7) int local7 = arg0.method20274();
		return new Class49_Sub1(local3.anInt1017 * 1948455005, local3.aClass277_6, local3.aClass276_6, local3.anInt1018 * -1445052455, local3.anInt1019 * -1782123231, local7);
	}

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!aem;)V", line = 52)
	Class116(@OriginalArg(0) Class48_Sub1 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!cp", name = "n", descriptor = "()V", line = 56)
	public void method22808() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean198) {
					@Pc(9) HashMap local9 = this.this$0.method9025();
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class357 local20;
						do {
							if (!local13.hasNext()) {
								Class60_Sub11.method13407(25L);
								continue label36;
							}
							local20 = (Class357) local13.next();
						} while (local20.aBoolean722);
						@Pc(30) Class371[] local30 = (Class371[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method27108();
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class27_Sub1.method7214(null, local49);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cp", name = "run", descriptor = "()V", line = 56)
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
								Class60_Sub11.method13407(25L);
								continue label36;
							}
							local20 = (Class357) local13.next();
						} while (local20.aBoolean722);
						@Pc(30) Class371[] local30 = (Class371[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method27108();
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class27_Sub1.method7214(null, local49);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "()V", line = 56)
	public void method22809() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean198) {
					@Pc(9) HashMap local9 = this.this$0.method9025();
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class357 local20;
						do {
							if (!local13.hasNext()) {
								Class60_Sub11.method13407(25L);
								continue label36;
							}
							local20 = (Class357) local13.next();
						} while (local20.aBoolean722);
						@Pc(30) Class371[] local30 = (Class371[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method27108();
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class27_Sub1.method7214(null, local49);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "(B)V", line = 216)
	static void method22810() {
		Class363.anIntArray423 = Class454.method28458(2048, 35, 8, 8, 4, 0.4F, true);
	}

	@OriginalMember(owner = "client!cp", name = "rk", descriptor = "(Lclient!vs;B)V", line = 7252)
	static final void method22811(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.aBoolean628 ? 1 : 0;
	}
}
