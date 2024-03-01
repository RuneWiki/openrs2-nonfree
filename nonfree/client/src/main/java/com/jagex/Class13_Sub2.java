package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!abr")
public class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!abr", name = "a", descriptor = "I")
	final int anInt334;

	@OriginalMember(owner = "client!abr", name = "g", descriptor = "I")
	final int anInt333;

	@OriginalMember(owner = "client!abr", name = "l", descriptor = "I")
	final int anInt331;

	@OriginalMember(owner = "client!abr", name = "h", descriptor = "I")
	final int anInt332;

	@OriginalMember(owner = "client!abr", name = "x", descriptor = "I")
	final int anInt335;

	@OriginalMember(owner = "client!abr", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 14)
	Class13_Sub2(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt334 = arg0.method20271() * 480927891;
		this.anInt333 = arg0.method20271() * 1541346661;
		this.anInt331 = arg0.method20271() * -1405082123;
		this.anInt332 = arg0.method20271() * 1855210657;
		this.anInt335 = arg0.method20271() * -1715205215;
	}

	@OriginalMember(owner = "client!abr", name = "a", descriptor = "(I)V", line = 23)
	@Override
	public void method16888() {
		Class556.method32809(this.anInt334 * -1943421541, this.anInt331 * 269590109, this.anInt333 * 1769477229, 100, 100, false);
		Class80.method21596(this.anInt332 * 1139973985, this.anInt335 * 64002145, 0);
		client.aBoolean582 = true;
	}

	@OriginalMember(owner = "client!abr", name = "h", descriptor = "()V", line = 23)
	@Override
	public void method16896() {
		Class556.method32809(this.anInt334 * -1943421541, this.anInt331 * 269590109, this.anInt333 * 1769477229, 100, 100, false);
		Class80.method21596(this.anInt332 * 1139973985, this.anInt335 * 64002145, 0);
		client.aBoolean582 = true;
	}
}
