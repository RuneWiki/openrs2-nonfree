package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ys")
public abstract class Class64 {

	@OriginalMember(owner = "client!ys", name = "s", descriptor = "I")
	public static final int anInt1546 = 512;

	@OriginalMember(owner = "client!ys", name = "a", descriptor = "I")
	public static final int anInt1547 = 4;

	@OriginalMember(owner = "client!ys", name = "l", descriptor = "I")
	public static final int anInt1548 = 32;

	@OriginalMember(owner = "client!ys", name = "g", descriptor = "I")
	public static final int anInt1551 = 16;

	@OriginalMember(owner = "client!ys", name = "h", descriptor = "I")
	public static final int anInt1552 = 64;

	@OriginalMember(owner = "client!ys", name = "u", descriptor = "I")
	public static final int anInt1553 = 2048;

	@OriginalMember(owner = "client!ys", name = "y", descriptor = "I")
	public static final int anInt1554 = 4096;

	@OriginalMember(owner = "client!ys", name = "b", descriptor = "I")
	public static final int anInt1555 = 8192;

	@OriginalMember(owner = "client!ys", name = "c", descriptor = "I")
	public static final int anInt1556 = 16384;

	@OriginalMember(owner = "client!ys", name = "z", descriptor = "I")
	public static final int anInt1557 = 32768;

	@OriginalMember(owner = "client!ys", name = "x", descriptor = "I")
	public static final int anInt1559 = 256;

	@OriginalMember(owner = "client!ys", name = "p", descriptor = "I")
	public static final int anInt1561 = 2;

	@OriginalMember(owner = "client!ys", name = "q", descriptor = "I")
	protected int anInt1563;

	@OriginalMember(owner = "client!ys", name = "m", descriptor = "I")
	protected int anInt1564;

	@OriginalMember(owner = "client!ys", name = "v", descriptor = "I")
	protected int anInt1565;

	@OriginalMember(owner = "client!ys", name = "j", descriptor = "I")
	protected int anInt1558 = 220680239;

	@OriginalMember(owner = "client!ys", name = "n", descriptor = "I")
	protected int anInt1549 = -1924778929;

	@OriginalMember(owner = "client!ys", name = "e", descriptor = "I")
	protected int anInt1550 = 1292223581;

	@OriginalMember(owner = "client!ys", name = "r", descriptor = "I")
	protected int anInt1560 = -788864445;

	@OriginalMember(owner = "client!ys", name = "d", descriptor = "I")
	protected int anInt1562 = -700172375;

	@OriginalMember(owner = "client!ys", name = "<init>", descriptor = "()V", line = 25)
	Class64() {
	}

	@OriginalMember(owner = "client!ys", name = "h", descriptor = "(I)I", line = 28)
	public int method13085() {
		return this.anInt1565 * 155095171;
	}

	@OriginalMember(owner = "client!ys", name = "b", descriptor = "()I", line = 28)
	public int method13086() {
		return this.anInt1565 * 155095171;
	}

	@OriginalMember(owner = "client!ys", name = "x", descriptor = "()I", line = 28)
	public int method13087() {
		return this.anInt1565 * 155095171;
	}

	@OriginalMember(owner = "client!ys", name = "s", descriptor = "()I", line = 28)
	public int method13088() {
		return this.anInt1565 * 155095171;
	}

	@OriginalMember(owner = "client!ys", name = "y", descriptor = "()I", line = 28)
	public int method13089() {
		return this.anInt1565 * 155095171;
	}

	@OriginalMember(owner = "client!ys", name = "u", descriptor = "()I", line = 28)
	public int method13090() {
		return this.anInt1565 * 155095171;
	}

	@OriginalMember(owner = "client!ys", name = "fo", descriptor = "(Lclient!vs;I)V", line = 5059)
	static final void method13091(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class51.method9860(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ys", name = "wx", descriptor = "(Lclient!vs;I)V", line = 8027)
	static final void method13093(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class3_Sub10.aClass61_1.method12740();
	}

	@OriginalMember(owner = "client!ys", name = "jh", descriptor = "(III)V", line = 9553)
	public static void method13092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_16, client.aClass82_2.aClass577_2);
		local5.aClass3_Sub41_Sub1_1.method20254(arg0);
		local5.aClass3_Sub41_Sub1_1.method20287(arg1);
		client.aClass82_2.method21601(local5);
	}
}
