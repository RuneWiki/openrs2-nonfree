package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qz")
public class Class502 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!qz", name = "this$0", descriptor = "Lclient!qe;")
	final Class485 this$0;

	@OriginalMember(owner = "client!qz", name = "c", descriptor = "Lclient!akv;")
	Class77_Sub39 aClass77_Sub39_16;

	@OriginalMember(owner = "client!qz", name = "p", descriptor = "Z")
	boolean aBoolean771;

	@OriginalMember(owner = "client!qz", name = "v", descriptor = "I")
	int anInt5066;

	@OriginalMember(owner = "client!qz", name = "l", descriptor = "I")
	int anInt5067;

	@OriginalMember(owner = "client!qz", name = "p", descriptor = "(B)[Lclient!pz;", line = 14)
	public static Class481[] method30225() {
		return new Class481[] { Class481.aClass481_1, Class481.aClass481_2, Class481.aClass481_3 };
	}

	@OriginalMember(owner = "client!qz", name = "c", descriptor = "(IB)I", line = 16)
	public static int method30226(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!qz", name = "<init>", descriptor = "(Lclient!qe;Lclient!akv;Z)V", line = 750)
	Class502(@OriginalArg(0) Class485 arg0, @OriginalArg(1) Class77_Sub39 arg1, @OriginalArg(2) boolean arg2) {
		this.this$0 = arg0;
		this.aClass77_Sub39_16 = arg1;
		this.aBoolean771 = arg2;
		this.anInt5066 = -572750523;
		this.anInt5067 = -1895045235;
	}

	@OriginalMember(owner = "client!qz", name = "p", descriptor = "(S)V", line = 758)
	void method30227() {
		if (this.aClass77_Sub39_16 != null && !this.aBoolean771) {
			this.aClass77_Sub39_16.method22401();
		}
		this.anInt5066 = -572750523;
		this.anInt5067 = -1895045235;
	}

	@OriginalMember(owner = "client!qz", name = "v", descriptor = "()V", line = 758)
	void method30228() {
		if (this.aClass77_Sub39_16 != null && !this.aBoolean771) {
			this.aClass77_Sub39_16.method22401();
		}
		this.anInt5066 = -572750523;
		this.anInt5067 = -1895045235;
	}

	@OriginalMember(owner = "client!qz", name = "c", descriptor = "()V", line = 758)
	void method30229() {
		if (this.aClass77_Sub39_16 != null && !this.aBoolean771) {
			this.aClass77_Sub39_16.method22401();
		}
		this.anInt5066 = -572750523;
		this.anInt5067 = -1895045235;
	}

	@OriginalMember(owner = "client!qz", name = "me", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;S)V", line = 6845)
	static final void method30230(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		@Pc(18) int[] local18 = Class139.method14334(local13, arg2);
		if (local18 != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray27 = Class73.method1040(local13, arg2);
		arg0.anIntArray400 = local18;
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!qz", name = "wj", descriptor = "(Lclient!yf;B)V", line = 8499)
	static final void method30231(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3478 * 423999123;
	}

	@OriginalMember(owner = "client!qz", name = "wq", descriptor = "(Lclient!yf;I)V", line = 8545)
	static final void method30232(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class434.method28882(local13, local23, true, false);
	}

	@OriginalMember(owner = "client!qz", name = "agv", descriptor = "(Lclient!yf;I)V", line = 10579)
	static final void method30233(@OriginalArg(0) Class665 arg0) {
		if (Class698.anIntArray543 == null || Class659.anInt5777 * 1404632205 >= Class698.anIntArray543.length) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class698.anIntArray543[(Class659.anInt5777 += 335750725) * 1404632205 - 1] & 0xFFFF;
		}
	}
}
