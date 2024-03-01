package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acs")
public class Class13_Sub18 extends Class13 {

	@OriginalMember(owner = "client!acs", name = "fj", descriptor = "Lclient!ny;")
	public static Class359 aClass359_3;

	@OriginalMember(owner = "client!acs", name = "ap", descriptor = "I")
	static int anInt694;

	@OriginalMember(owner = "client!acs", name = "a", descriptor = "I")
	final int anInt689;

	@OriginalMember(owner = "client!acs", name = "g", descriptor = "I")
	final int anInt693;

	@OriginalMember(owner = "client!acs", name = "l", descriptor = "I")
	final int anInt688;

	@OriginalMember(owner = "client!acs", name = "h", descriptor = "I")
	final int anInt690;

	@OriginalMember(owner = "client!acs", name = "x", descriptor = "I")
	final int anInt692;

	@OriginalMember(owner = "client!acs", name = "s", descriptor = "I")
	final int anInt691;

	@OriginalMember(owner = "client!acs", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 16)
	Class13_Sub18(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt689 = arg0.method20271() * 1302811927;
		this.anInt693 = arg0.method20271() * 1439447109;
		this.anInt688 = arg0.method20271() * -2142310307;
		this.anInt690 = arg0.method20271() * 1275501237;
		this.anInt692 = arg0.method20271() * -895205781;
		this.anInt691 = arg0.method20271() * -1274862059;
	}

	@OriginalMember(owner = "client!acs", name = "h", descriptor = "()V", line = 26)
	@Override
	public void method16896() {
		Class131.aClass162Array1[this.anInt689 * -2043727193].method23268(0);
		Class131.aClass162Array1[this.anInt693 * 1568021133].method23268(1);
		client.anInt3093 = 0;
		client.anInt3049 = this.anInt688 * -2112394423;
		client.anInt3156 = 0;
		client.anInt3097 = this.anInt692 * 581285343;
		client.anInt3055 = this.anInt691 * -620209425;
		client.anInt3137 = -216741911;
		client.anInt3095 = this.anInt690 * -1104168851;
		Class72.anInt2086 = 224556581;
		Class16.method1679();
		client.aBoolean582 = true;
	}

	@OriginalMember(owner = "client!acs", name = "a", descriptor = "(I)V", line = 26)
	@Override
	public void method16888() {
		Class131.aClass162Array1[this.anInt689 * -2043727193].method23268(0);
		Class131.aClass162Array1[this.anInt693 * 1568021133].method23268(1);
		client.anInt3093 = 0;
		client.anInt3049 = this.anInt688 * -2112394423;
		client.anInt3156 = 0;
		client.anInt3097 = this.anInt692 * 581285343;
		client.anInt3055 = this.anInt691 * -620209425;
		client.anInt3137 = -216741911;
		client.anInt3095 = this.anInt690 * -1104168851;
		Class72.anInt2086 = 224556581;
		Class16.method1679();
		client.aBoolean582 = true;
	}

	@OriginalMember(owner = "client!acs", name = "im", descriptor = "(II)I", line = 4894)
	static final int method6714(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x3F;
		@Pc(9) int local9 = arg0 >> 6 & 0x3;
		if (local3 == 18) {
			if (local9 == 0) {
				return 1;
			}
			if (local9 == 1) {
				return 2;
			}
			if (local9 == 2) {
				return 4;
			}
			if (local9 == 3) {
				return 8;
			}
		} else if (local3 == 19 || local3 == 21) {
			if (local9 == 0) {
				return 16;
			}
			if (local9 == 1) {
				return 32;
			}
			if (local9 == 2) {
				return 64;
			}
			if (local9 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
