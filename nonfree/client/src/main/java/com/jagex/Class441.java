package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public class Class441 implements Interface47 {

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "I")
	final int anInt4939;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(I)V", line = 74)
	Class441(@OriginalArg(0) int arg0) {
		this.anInt4939 = arg0 * 294397589;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "()V", line = 79)
	@Override
	public void method28242() {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_117, client.aClass82_2.aClass577_2);
		local5.aClass3_Sub41_Sub1_1.method20302(this.anInt4939 * 1524397245);
		client.aClass82_2.method21601(local5);
	}

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "(B)V", line = 79)
	@Override
	public void method28244() {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_117, client.aClass82_2.aClass577_2);
		local5.aClass3_Sub41_Sub1_1.method20302(this.anInt4939 * 1524397245);
		client.aClass82_2.method21601(local5);
	}

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "()V", line = 79)
	@Override
	public void method28243() {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_117, client.aClass82_2.aClass577_2);
		local5.aClass3_Sub41_Sub1_1.method20302(this.anInt4939 * 1524397245);
		client.aClass82_2.method21601(local5);
	}

	@OriginalMember(owner = "client!rt", name = "l", descriptor = "()V", line = 79)
	@Override
	public void method28241() {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_117, client.aClass82_2.aClass577_2);
		local5.aClass3_Sub41_Sub1_1.method20302(this.anInt4939 * 1524397245);
		client.aClass82_2.method21601(local5);
	}

	@OriginalMember(owner = "client!rt", name = "do", descriptor = "(II)V", line = 793)
	public static void method28248(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			Class58_Sub1.anInt1438 = Class58_Sub1.anInt1440 * 1182966379;
		} else {
			Class58_Sub1.anInt1438 = arg0 * 1699591869;
		}
	}

	@OriginalMember(owner = "client!rt", name = "jy", descriptor = "(III)V", line = 6073)
	static final void method28249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class2.anInt5 = arg0 * 2115862953;
		Class2.anInt2 = arg1 * 383922831;
		Class2.aBoolean4 = false;
		Class410.method27677();
	}

	@OriginalMember(owner = "client!rt", name = "so", descriptor = "(Lclient!vs;I)V", line = 7472)
	static final void method28245(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		Class482.method29094(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3, arg0.anIntArray496[arg0.anInt5319 * 960738381], arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1]);
	}

	@OriginalMember(owner = "client!rt", name = "xy", descriptor = "(Lclient!vs;I)V", line = 8348)
	static final void method28246(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		Class210.method24248(local13, false);
	}

	@OriginalMember(owner = "client!rt", name = "amt", descriptor = "(Lclient!vs;B)V", line = 11293)
	static final void method28247(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub25_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}
}
