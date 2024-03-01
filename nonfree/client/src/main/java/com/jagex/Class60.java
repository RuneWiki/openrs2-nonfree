package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public abstract class Class60 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
	protected static final int anInt2077 = 2;

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
	public static final int anInt2078 = 3;

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
	protected static final int anInt2080 = 1;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
	protected int anInt2079;

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "Lclient!aht;")
	protected Class3_Sub45 aClass3_Sub45_36;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lclient!aht;)V", line = 10)
	Class60(@OriginalArg(0) Class3_Sub45 arg0) {
		this.aClass3_Sub45_36 = arg0;
		this.anInt2079 = this.method14603() * 1116833389;
	}

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(ILclient!aht;)V", line = 15)
	Class60(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		this.anInt2079 = arg0 * 1116833389;
		this.aClass3_Sub45_36 = arg1;
	}

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "(I)V", line = 24)
	void method14597(@OriginalArg(0) int arg0) {
		if (this.method14599(arg0) != 3) {
			this.method14598(arg0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "(I)V", line = 24)
	void method14600(@OriginalArg(0) int arg0) {
		if (this.method14599(arg0) != 3) {
			this.method14598(arg0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(IB)V", line = 24)
	void method14601(@OriginalArg(0) int arg0) {
		if (this.method14599(arg0) != 3) {
			this.method14598(arg0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V", line = 24)
	void method14612(@OriginalArg(0) int arg0) {
		if (this.method14599(arg0) != 3) {
			this.method14598(arg0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V", line = 24)
	void method14613(@OriginalArg(0) int arg0) {
		if (this.method14599(arg0) != 3) {
			this.method14598(arg0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "(I)V", line = 24)
	void method14614(@OriginalArg(0) int arg0) {
		if (this.method14599(arg0) != 3) {
			this.method14598(arg0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "(B)V", line = 85)
	public static void method14616() {
		if (client.anInt3039 * 1115111877 == 16) {
			@Pc(11) Class3_Sub23 local11 = Class269.method25284(Class311.aClass311_49, client.aClass82_1.aClass577_2);
			client.aClass82_1.method21601(local11);
			Class415.aClass547_1 = Class547.aClass547_3;
			Class603.aString246 = null;
		}
	}

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "(I)V", line = 868)
	static void method14617() {
		for (@Pc(4) Class3_Sub1_Sub7 local4 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32768(); local4 != null; local4 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32709()) {
			if (Class125.method22871(local4.anInt2664 * 296027207)) {
				Class415.method27771(local4);
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "(IB)V")
	abstract void method14598(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)I")
	abstract int method14599(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "()I")
	abstract int method14602();

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "(I)I")
	abstract int method14603();

	@OriginalMember(owner = "client!wa", name = "s", descriptor = "()I")
	abstract int method14604();

	@OriginalMember(owner = "client!wa", name = "u", descriptor = "()I")
	abstract int method14605();

	@OriginalMember(owner = "client!wa", name = "y", descriptor = "()I")
	abstract int method14606();

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "()I")
	abstract int method14607();

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)I")
	abstract int method14608(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "(I)I")
	abstract int method14609(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "(I)V")
	abstract void method14610(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "(I)V")
	abstract void method14611(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "()I")
	abstract int method14615();
}
