package com.jagex;

import java.util.Stack;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agz")
public abstract class Class3_Sub40 extends Class3 {

	@OriginalMember(owner = "client!agz", name = "l", descriptor = "(IB)I", line = 35)
	static final int method19106(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!agz", name = "g", descriptor = "(I)V", line = 38)
	public static void method19105() {
		@Pc(2) Stack local2 = Class446.aStack1;
		synchronized (Class446.aStack1) {
			Class446.aStack1 = new Stack();
		}
	}

	@OriginalMember(owner = "client!agz", name = "<init>", descriptor = "()V", line = 48)
	Class3_Sub40() {
	}

	@OriginalMember(owner = "client!agz", name = "ac", descriptor = "(IIIII)V", line = 266)
	static void method19104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(10, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
		local4.anInt2695 = arg2 * 378120307;
		local4.anInt2676 = arg3 * -835820601;
	}

	@OriginalMember(owner = "client!agz", name = "gl", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5301)
	static final void method19103(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3513 = 1673567445;
		arg0.anInt3514 = client.anInt3115 * -1892412517;
		arg0.anInt3493 = 0;
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class401.method27610(arg0.anInt3570 * 954808515);
		}
	}

	@OriginalMember(owner = "client!agz", name = "g", descriptor = "(Lclient!ahb;)V")
	abstract void method19098(@OriginalArg(0) Class3_Sub41 arg0);

	@OriginalMember(owner = "client!agz", name = "p", descriptor = "(Lclient!ahb;S)V")
	abstract void method19099(@OriginalArg(0) Class3_Sub41 arg0);

	@OriginalMember(owner = "client!agz", name = "a", descriptor = "(Lclient!ago;B)V")
	abstract void method19100(@OriginalArg(0) Class3_Sub30 arg0);

	@OriginalMember(owner = "client!agz", name = "l", descriptor = "(Lclient!ahb;)V")
	abstract void method19101(@OriginalArg(0) Class3_Sub41 arg0);

	@OriginalMember(owner = "client!agz", name = "h", descriptor = "(Lclient!ago;)V")
	abstract void method19102(@OriginalArg(0) Class3_Sub30 arg0);
}
