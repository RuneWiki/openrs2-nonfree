package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!atu")
public class Class77_Sub1_Sub18_Sub3 extends Class77_Sub1_Sub18 {

	@OriginalMember(owner = "client!atu", name = "d", descriptor = "I")
	static final int anInt3213 = 1;

	@OriginalMember(owner = "client!atu", name = "r", descriptor = "I")
	static final int anInt3214 = 3;

	@OriginalMember(owner = "client!atu", name = "s", descriptor = "I")
	static final int anInt3216 = 2;

	@OriginalMember(owner = "client!atu", name = "j", descriptor = "[B")
	byte[] aByteArray56;

	@OriginalMember(owner = "client!atu", name = "g", descriptor = "I")
	int anInt3215;

	@OriginalMember(owner = "client!atu", name = "z", descriptor = "Lclient!tx;")
	Class566 aClass566_3;

	@OriginalMember(owner = "client!atu", name = "<init>", descriptor = "()V", line = 13)
	Class77_Sub1_Sub18_Sub3() {
	}

	@OriginalMember(owner = "client!atu", name = "p", descriptor = "(S)[B", line = 16)
	@Override
	byte[] method24033() {
		if (this.aBoolean540) {
			throw new RuntimeException();
		}
		return this.aByteArray56;
	}

	@OriginalMember(owner = "client!atu", name = "v", descriptor = "()[B", line = 16)
	@Override
	byte[] method24032() {
		if (this.aBoolean540) {
			throw new RuntimeException();
		}
		return this.aByteArray56;
	}

	@OriginalMember(owner = "client!atu", name = "l", descriptor = "()[B", line = 16)
	@Override
	byte[] method24036() {
		if (this.aBoolean540) {
			throw new RuntimeException();
		}
		return this.aByteArray56;
	}

	@OriginalMember(owner = "client!atu", name = "y", descriptor = "()[B", line = 16)
	@Override
	byte[] method24037() {
		if (this.aBoolean540) {
			throw new RuntimeException();
		}
		return this.aByteArray56;
	}

	@OriginalMember(owner = "client!atu", name = "c", descriptor = "(I)I", line = 23)
	@Override
	int method24034() {
		return this.aBoolean540 ? 0 : 100;
	}

	@OriginalMember(owner = "client!atu", name = "w", descriptor = "()I", line = 23)
	@Override
	int method24035() {
		return this.aBoolean540 ? 0 : 100;
	}

	@OriginalMember(owner = "client!atu", name = "t", descriptor = "()I", line = 23)
	@Override
	int method24038() {
		return this.aBoolean540 ? 0 : 100;
	}

	@OriginalMember(owner = "client!atu", name = "q", descriptor = "()I", line = 23)
	@Override
	int method24039() {
		return this.aBoolean540 ? 0 : 100;
	}
}
