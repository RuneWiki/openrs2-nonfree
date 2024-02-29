package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cx")
class Class199 implements Runnable {

	@OriginalMember(owner = "client!cx", name = "to", descriptor = "Lclient!kw;")
	public static Class368 aClass368_2;

	// $FF: synthetic field
	@OriginalMember(owner = "client!cx", name = "this$0", descriptor = "Lclient!ahx;")
	final Class117_Sub2 this$0;

	@OriginalMember(owner = "client!cx", name = "c", descriptor = "(II)Lclient!iq;", line = 25)
	public static Class329 method25491(@OriginalArg(0) int arg0) {
		@Pc(2) Class329[] local2 = Class368.method28152();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class329 local12 = local2[local4];
			if (local12.anInt4094 * 1453209707 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cx", name = "y", descriptor = "(IB)I", line = 50)
	public static int method25492(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(18) int local18 = local12 | local12 >>> 4;
		@Pc(24) int local24 = local18 | local18 >>> 8;
		@Pc(30) int local30 = local24 | local24 >>> 16;
		return local30 + 1;
	}

	@OriginalMember(owner = "client!cx", name = "<init>", descriptor = "(Lclient!ahx;)V", line = 52)
	Class199(@OriginalArg(0) Class117_Sub2 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!cx", name = "g", descriptor = "()V", line = 56)
	public void method25493() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean221) {
					@Pc(9) HashMap local9 = this.this$0.method10903();
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class501 local20;
						do {
							if (!local13.hasNext()) {
								Class281.method26679(25L);
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
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cx", name = "run", descriptor = "()V", line = 56)
	@Override
	public void run() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean221) {
					@Pc(9) HashMap local9 = this.this$0.method10903();
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class501 local20;
						do {
							if (!local13.hasNext()) {
								Class281.method26679(25L);
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
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cx", name = "r", descriptor = "()V", line = 56)
	public void method25494() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean221) {
					@Pc(9) HashMap local9 = this.this$0.method10903();
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class501 local20;
						do {
							if (!local13.hasNext()) {
								Class281.method26679(25L);
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
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cx", name = "gy", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5620)
	static final void method25495(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg2.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg2.anIntArray536[arg2.anInt5784 * 2088438307];
		@Pc(24) short local24 = (short) arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 1];
		@Pc(35) short local35 = (short) arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 2];
		if (local13 < 0 || local13 >= 5) {
			return;
		}
		arg0.method26657(local13, local24, local35);
		Class461.method29531(arg0);
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class77_Sub1_Sub4.method21358(arg0.anInt3863 * -1278450723, local13);
		}
	}

	@OriginalMember(owner = "client!cx", name = "aeg", descriptor = "(Lclient!yf;B)V", line = 9909)
	static final void method25496(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class18 local18 = (Class18) Class537.aClass35_Sub7_1.method18319(local12);
		if (local18.anInt89 * 368739509 >= 0 && local18.anInt90 * 615907051 >= 0) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local18.anInt90 * 615907051;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local12;
		}
	}

	@OriginalMember(owner = "client!cx", name = "ly", descriptor = "(Lclient!gm;III)V", line = 11929)
	static void method25497(@OriginalArg(0) Class277 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class276 local4 = arg0.method26633(Class284.aClass86_9);
		if (local4 == null) {
			return;
		}
		Class284.aClass86_9.method20151(arg1, arg2, arg1 + arg0.anInt3874 * -881188269, arg0.anInt3875 * -1279656873 + arg2);
		if (Class156.anInt3233 * 1265431623 >= 3) {
			Class284.aClass86_9.method20110(-16777216, local4.aClass90_1, arg1, arg2);
			return;
		}
		@Pc(43) int local43;
		if (Class11.anInt36 * -891094135 == 3) {
			local43 = (int) -((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D);
		} else {
			local43 = (int) -client.aFloat247;
		}
		local43 = local43 + client.anInt3462 * 204292618 & 0x3FFF;
		local43 <<= 0x2;
		Class134_Sub1.aClass83_15.method18158((float) (arg0.anInt3874 * -881188269) / 2.0F + (float) arg1, (float) (arg0.anInt3875 * -1279656873) / 2.0F + (float) arg2, 4165, local43, local4.aClass90_1, arg1, arg2);
	}

	@OriginalMember(owner = "client!cx", name = "asc", descriptor = "(Lclient!yf;I)V", line = 12770)
	static final void method25498(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3459 * -993629849;
	}
}
