package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ati")
public class Class77_Sub1_Sub18_Sub2 extends Class77_Sub1_Sub18 {

	@OriginalMember(owner = "client!ati", name = "d", descriptor = "Lclient!akv;")
	Class77_Sub39 aClass77_Sub39_14;

	@OriginalMember(owner = "client!ati", name = "s", descriptor = "B")
	byte aByte93;

	@OriginalMember(owner = "client!ati", name = "<init>", descriptor = "()V", line = 9)
	Class77_Sub1_Sub18_Sub2() {
	}

	@OriginalMember(owner = "client!ati", name = "v", descriptor = "()[B", line = 12)
	@Override
	byte[] method24032() {
		if (this.aBoolean540 || this.aClass77_Sub39_14.anInt3089 * 31645619 < this.aClass77_Sub39_14.aByteArray53.length - this.aByte93) {
			throw new RuntimeException();
		}
		return this.aClass77_Sub39_14.aByteArray53;
	}

	@OriginalMember(owner = "client!ati", name = "p", descriptor = "(S)[B", line = 12)
	@Override
	byte[] method24033() {
		if (this.aBoolean540 || this.aClass77_Sub39_14.anInt3089 * 31645619 < this.aClass77_Sub39_14.aByteArray53.length - this.aByte93) {
			throw new RuntimeException();
		}
		return this.aClass77_Sub39_14.aByteArray53;
	}

	@OriginalMember(owner = "client!ati", name = "l", descriptor = "()[B", line = 12)
	@Override
	byte[] method24036() {
		if (this.aBoolean540 || this.aClass77_Sub39_14.anInt3089 * 31645619 < this.aClass77_Sub39_14.aByteArray53.length - this.aByte93) {
			throw new RuntimeException();
		}
		return this.aClass77_Sub39_14.aByteArray53;
	}

	@OriginalMember(owner = "client!ati", name = "y", descriptor = "()[B", line = 12)
	@Override
	byte[] method24037() {
		if (this.aBoolean540 || this.aClass77_Sub39_14.anInt3089 * 31645619 < this.aClass77_Sub39_14.aByteArray53.length - this.aByte93) {
			throw new RuntimeException();
		}
		return this.aClass77_Sub39_14.aByteArray53;
	}

	@OriginalMember(owner = "client!ati", name = "c", descriptor = "(I)I", line = 19)
	@Override
	int method24034() {
		return this.aClass77_Sub39_14 == null ? 0 : this.aClass77_Sub39_14.anInt3089 * -1130405396 / (this.aClass77_Sub39_14.aByteArray53.length - this.aByte93);
	}

	@OriginalMember(owner = "client!ati", name = "w", descriptor = "()I", line = 19)
	@Override
	int method24035() {
		return this.aClass77_Sub39_14 == null ? 0 : this.aClass77_Sub39_14.anInt3089 * -1130405396 / (this.aClass77_Sub39_14.aByteArray53.length - this.aByte93);
	}

	@OriginalMember(owner = "client!ati", name = "t", descriptor = "()I", line = 19)
	@Override
	int method24038() {
		return this.aClass77_Sub39_14 == null ? 0 : this.aClass77_Sub39_14.anInt3089 * -1130405396 / (this.aClass77_Sub39_14.aByteArray53.length - this.aByte93);
	}

	@OriginalMember(owner = "client!ati", name = "q", descriptor = "()I", line = 19)
	@Override
	int method24039() {
		return this.aClass77_Sub39_14 == null ? 0 : this.aClass77_Sub39_14.anInt3089 * -1130405396 / (this.aClass77_Sub39_14.aByteArray53.length - this.aByte93);
	}
}
