package com.jagex;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
class Class550 implements Runnable {

	// $FF: synthetic field
	@OriginalMember(owner = "client!td", name = "this$0", descriptor = "Lclient!ahe;")
	final Class117_Sub1 this$0;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!ahe;)V", line = 72)
	Class550(@OriginalArg(0) Class117_Sub1 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "run", descriptor = "()V", line = 76)
	@Override
	public void run() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean208) {
					@Pc(9) HashMap local9 = this.this$0.method10181();
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class501 local20;
						do {
							if (!local13.hasNext()) {
								Class281.method26679(10L);
								continue label36;
							}
							local20 = (Class501) local13.next();
						} while (local20.aBoolean770);
						@Pc(30) Class485[] local30 = (Class485[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method29936();
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class293.method27014(null, local49);
				local49.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!td", name = "r", descriptor = "()V", line = 76)
	public void method30982() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean208) {
					@Pc(9) HashMap local9 = this.this$0.method10181();
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class501 local20;
						do {
							if (!local13.hasNext()) {
								Class281.method26679(10L);
								continue label36;
							}
							local20 = (Class501) local13.next();
						} while (local20.aBoolean770);
						@Pc(30) Class485[] local30 = (Class485[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method29936();
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class293.method27014(null, local49);
				local49.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "()V", line = 76)
	public void method30983() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean208) {
					@Pc(9) HashMap local9 = this.this$0.method10181();
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class501 local20;
						do {
							if (!local13.hasNext()) {
								Class281.method26679(10L);
								continue label36;
							}
							local20 = (Class501) local13.next();
						} while (local20.aBoolean770);
						@Pc(30) Class485[] local30 = (Class485[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method29936();
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class293.method27014(null, local49);
				local49.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!td", name = "y", descriptor = "(I)V", line = 93)
	static void method30984() {
		if (Class509.aFileOutputStream1 != null) {
			try {
				Class509.aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		Class509.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!td", name = "ba", descriptor = "(Lclient!yf;I)V", line = 4635)
	static final void method30985(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5782 -= -2111195934;
		if (arg0.aLongArray28[arg0.anInt5782 * 1572578961] <= arg0.aLongArray28[arg0.anInt5782 * 1572578961 + 1]) {
			arg0.anInt5786 += arg0.anIntArray535[arg0.anInt5786 * 662605117] * -793595371;
		}
	}

	@OriginalMember(owner = "client!td", name = "anl", descriptor = "(Lclient!yf;I)V", line = 11952)
	static final void method30986(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class218.method25710().method36479();
	}
}
