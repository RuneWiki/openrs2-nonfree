package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
class Class404 implements Runnable {

	@OriginalMember(owner = "client!qb", name = "tv", descriptor = "I")
	static int anInt4809;

	// $FF: synthetic field
	@OriginalMember(owner = "client!qb", name = "this$0", descriptor = "Lclient!aew;")
	final Class48_Sub2 this$0;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!aew;)V", line = 72)
	Class404(@OriginalArg(0) Class48_Sub2 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "run", descriptor = "()V", line = 76)
	@Override
	public void run() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean229) {
					@Pc(9) HashMap local9 = this.this$0.method9537();
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class357 local20;
						do {
							if (!local13.hasNext()) {
								Class60_Sub11.method13407(10L);
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
				local49.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "()V", line = 76)
	public void method27635() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean229) {
					@Pc(9) HashMap local9 = this.this$0.method9537();
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class357 local20;
						do {
							if (!local13.hasNext()) {
								Class60_Sub11.method13407(10L);
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
				local49.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "()V", line = 76)
	public void method27636() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean229) {
					@Pc(9) HashMap local9 = this.this$0.method9537();
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class357 local20;
						do {
							if (!local13.hasNext()) {
								Class60_Sub11.method13407(10L);
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
				local49.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qb", name = "an", descriptor = "(B)Z", line = 1091)
	static boolean method27638() {
		if (client.anInt3039 * 1115111877 == 2) {
			return !Class146.method23084() && !Class239.method24624();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qb", name = "vz", descriptor = "(Lclient!vs;I)V", line = 8007)
	static final void method27637(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3073 * -720912181;
	}

	@OriginalMember(owner = "client!qb", name = "mo", descriptor = "(I)Ljava/lang/String;", line = 11755)
	public static String method27639() {
		return Class599.method33503("www", false);
	}
}
